package project.service.impl;

import org.springframework.stereotype.Service;
import project.dao.UserDao;
import project.entity.User;
import project.service.UserService;
import project.utils.*;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public PageResult getUserPage(PageUtil pageUtil) {
        //当前页码中的数据列表
        List<User> users = userDao.findUsers(pageUtil);
        //数据总数
        Long total = userDao.getTotalUser(pageUtil);
        PageResult pageResult = new PageResult(users, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }

    @Override
    public User updateTokenAndLogin(String username, String password) {
        User user = userDao.getUserByUsernameAndPassword(username, MD5Util.MD5Encode(password,"UTF-8"));
        if (user != null){
            //登录后执行就该token的操作
            String token = getNewToken(System.currentTimeMillis() + "", user.getUserId());
            if (userDao.updateUserToken(user.getUserId(), token)){
                //返回数据带上token
                user.setUserToken(token);
                return user;
            }
        }
        return null;
    }



    /**
     * 获取token值
     * @param sessionId
     * @param userId
     * @return
     */
    private String getNewToken(String sessionId, Long userId){
        String src = sessionId + userId + NumberUtil.generateRandomNum(4);
        return SystemUtil.generateToken(src);
    }

    @Override
    public User selectById(Long userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User selectByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public Boolean saveUser(User user) {
        //密码加密
        user.setPassword(MD5Util.MD5Encode(user.getPassword(),"UTF-8"));
        return userDao.addUser(user);
    }

    @Override
    public Boolean updatePassword(User user) {
        return userDao.updateUserPassword(user.getUserId(),MD5Util.MD5Encode(user.getPassword(), "UTF-8"));
    }

    @Override
    public User getUserByToken(String userToken) {
        return userDao.getUserByToken(userToken);
    }
}
