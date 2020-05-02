package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import project.common.Constants;
import project.common.Result;
import project.common.ResultGenerator;
import project.config.annotation.TokenToUser;
import project.entity.User;
import project.service.UserService;
import project.utils.PageUtil;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 分页查询
     * @param params Map类型，含有page，limit
     * @return
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public Result list(@RequestParam Map<String, Object> params){
        if(StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))){
            return ResultGenerator.generateErrorResult(Constants.RESULT_CODE_PARAM_ERROR,"请求参数异常");
        }
        PageUtil pageUtil = new PageUtil(params);
        return ResultGenerator.generateSuccessResult(userService.getUserPage(pageUtil));
    }

    /**
     * 登录
     * @param user 准备登录的用户
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody User user){
        Result result = ResultGenerator.generateFailResult("登录失败");
        //登录信息验证
        if(StringUtils.isEmpty(user.getUserId()) || StringUtils.isEmpty(user.getPassword())){
            result.setMessage("请填写登录信息");
        }
        User loginUser = userService.updateTokenAndLogin(user.getUsername(),user.getPassword());
        if(loginUser != null){
            result = ResultGenerator.generateSuccessResult(loginUser);
        }
        return result;
    }

    /**
     * 注册用户
     * @param user 准备注册的用户
     * @param loginUser 目前登录的用户
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result save(@RequestBody User user, @TokenToUser User loginUser){
        System.out.println(user);
        System.out.println(loginUser);
//        if (loginUser == null || loginUser.getUserId() != 1){
//            return ResultGenerator.generateErrorResult(Constants.RESULT_CODE_NOT_LOGIN, "系统管理员未登录");
//        }
        if (StringUtils.isEmpty(user.getUsername()) || StringUtils.isEmpty(user.getPassword())){
            return ResultGenerator.generateErrorResult(Constants.RESULT_CODE_PARAM_ERROR,"参数异常");
        }
        User tempUser = userService.selectByUsername(user.getUsername());
        if (tempUser != null){
            return ResultGenerator.generateErrorResult(Constants.RESULT_CODE_PARAM_ERROR,"用户名已存在");
        }
        if ("admin".endsWith(user.getUsername().trim())){
            return ResultGenerator.generateErrorResult(Constants.RESULT_CODE_PARAM_ERROR,"不能添加admin用户");
        }
        if (userService.saveUser(user)) {
            return ResultGenerator.generateSuccessResult();
        }else {
            return ResultGenerator.generateFailResult("添加失败");
        }
    }

//    @RequestMapping(value = "/test", method = RequestMethod.POST)
//    public void test(@RequestBody User user){
//        System.out.println(user);
//    }
}
