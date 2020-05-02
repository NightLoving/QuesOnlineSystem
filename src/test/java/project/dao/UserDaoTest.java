package project.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import project.entity.User;
import project.utils.PageUtil;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Resource
    private UserDao userDao;

    @Test
    public void addUserTest(){
        User user = new User();
        user.setUserId(Long.valueOf(1));
        user.setUsername("admin");
        user.setPassword("123456");
        user.setPoints(0);
        user.setRightNumber(0);
        user.setTotalNumber(0);
        user.setUserToken("123");
        System.out.println("===============================================");
        userDao.addUser(user);
    }

    @Test
    public void getUserByUsernameAndPasswordTest(){
        System.out.println("======================================================");
        System.out.println(userDao.getUserByUsernameAndPassword("admin","123456"));
        System.out.println("======================================================");
    }

    @Test
    public void getUserByTokenTest(){
        System.out.println("======================================================");
        System.out.println(userDao.getUserByToken("123"));
        System.out.println("======================================================");
    }

    @Test
    public void getUserByIdTest(){
        System.out.println("======================================================");
        System.out.println(userDao.getUserById(Long.valueOf(7)));
        System.out.println("======================================================");
    }

    @Test
    public void getUserByUsernameTest(){
        System.out.println("======================================================");
        System.out.println(userDao.getUserByUsername("admin"));
        System.out.println("======================================================");
    }

    @Test
    public void updateUserPasswordTest(){
        System.out.println("======================================================");
        System.out.println(userDao.updateUserPassword(Long.valueOf(7),"654321"));
        System.out.println("======================================================");
    }

    @Test
    public void updateUserTokenTest(){
        System.out.println("======================================================");
        System.out.println(userDao.updateUserToken(Long.valueOf(7),"654321"));
        System.out.println("======================================================");
    }

    @Test
    public void getAllUserTest(){
        System.out.println("======================================================");
        System.out.println(userDao.getAllUsers());
        System.out.println("======================================================");
    }

    @Test
    public void findUserTest(){
        Map params = new HashMap();
        params.put("page",1);
        params.put("limit",5);
        PageUtil pageUtil = new PageUtil(params);
        List<User> users = userDao.findUsers(pageUtil);
        System.out.println("======================================================");
        System.out.println(users);
        System.out.println(users.size());
        System.out.println("======================================================");
    }

    @Test
    public void getTotalUserTest(){
        Map params = new HashMap();
        params.put("page",1);
        params.put("limit",5);
        PageUtil pageUtil = new PageUtil(params);
        System.out.println("======================================================");
        System.out.println(userDao.getTotalUser(pageUtil));
        System.out.println("======================================================");
    }


}
