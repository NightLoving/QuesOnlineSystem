package project.dao;

import org.apache.ibatis.annotations.Param;
import project.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author yang & bo
 * @date 2020-4-30
 * @description userDao接口
 */
public interface UserDao {

    /**
     *根据参数查询用户列表
     * @param param 包含limit，page
     * @return 用户列表
     */
    List<User> findUsers(Map param);

    /**
     * 查询用户总数
     * @param param
     * @return 用户总数
     */
    Long getTotalUser(Map param);

    /**
     * 根据登录名和密码获取用户记录
     * @param username
     * @param password
     * @return 用户信息
     */
    User getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 根据userToken获取用户记录
     * @param userToken
     * @return 用户信息
     */
    User getUserByToken(@Param("userToken") String userToken);

    /**
     * 通过id查询用户信息
     * @param userId
     * @return 用户信息
     */
    User getUserById(@Param("userId") Long userId);

    /**
     * 通过用户名取得一个用户
     * @param username 用户名
     * @return 用户信息
     */
    User getUserByUsername(@Param("username") String username);


    /**
     * 新增插入一个用户
     * @param user
     * @return true:插入成功，false：失败
     */
    Boolean addUser(User user);

    /**
     * 更新用户密码
     * @param userId
     * @param newPassword
     * @return Boolean
     */
    Boolean updateUserPassword(@Param("userId") Long userId, @Param("newPassword") String newPassword);

    /**
     *更新用户Token值
     * @param userId
     * @param newToken
     * @return
     */
    Boolean updateUserToken(@Param("userId") Long userId, @Param("newToken") String newToken);

    /**
     * 更新用户正确题数与总题数
     * @param user
     * @return true：更新成功；false：更新失败
     */
    Boolean updateRightAndTotal(User user);

    /**
     *查询所有用户列表
     * @return 用户列表
     */
    List<User> getAllUsers();
}
