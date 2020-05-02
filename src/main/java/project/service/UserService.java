package project.service;

import project.entity.User;
import project.utils.PageResult;
import project.utils.PageUtil;

public interface UserService {

    /**
     * 分页功能
     * @param pageUtil
     * @return
     */
    PageResult getUserPage(PageUtil pageUtil);

    User updateTokenAndLogin(String username, String password);

    User selectById(Long userId);

    User selectByUsername(String username);

    Boolean saveUser(User user);

    Boolean updatePassword(User user);

    User getUserByToken(String userToken);

}
