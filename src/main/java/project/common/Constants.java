package project.common;

/**
 * @author yang
 * @date 2020-5-1
 * @descriprtion 系统的常量定值，返回给前端的状态码
 */
public class Constants {
    public static final int RESULT_CODE_SUCCESS = 200;      //成功处理请求
    public static final int RESULT_CODE_BAD_REQUEST = 412;  //请求错误
    public static final int RESULT_CODE_NOT_LOGIN = 402;    //未登录
    public static final int RESULT_CODE_PARAM_ERROR = 406;  //传参错误
    public static final int RESULT_CODE_SERVER_ERROR = 500; //服务器错误
}
