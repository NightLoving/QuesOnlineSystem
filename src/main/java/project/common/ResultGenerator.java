package project.common;

import org.springframework.util.StringUtils;

/**
 * @author yang
 * @date 2020-5-1
 * @description 结果(Result)生成器
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";

    /**
     * @return 无data成功结果
     */
    public static Result generateSuccessResult(){
        Result result = new Result();
        result.setData(Constants.RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    /**
     *
     * @param message 自定义信息
     * @return 含自定义信息，无data，成功的结果
     */
    public static Result generateSuccessResult(String message){
        Result result = new Result();
        result.setData(Constants.RESULT_CODE_SUCCESS);
        result.setMessage(message);
        return result;
    }

    /**
     * @param data 返回的数据
     * @return 含数据的成功结果
     */
    public static Result generateSuccessResult(Object data) {
        Result result = new Result();
        result.setResultCode(Constants.RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    /**
     * @param message 自定义消息
     * @return 含自定义消息的失败结果
     */
    public static Result generateFailResult(String message) {
        Result result = new Result();
        result.setResultCode(Constants.RESULT_CODE_SERVER_ERROR);
        if (StringUtils.isEmpty(message)) {
            result.setMessage(DEFAULT_FAIL_MESSAGE);
        } else {
            result.setMessage(message);
        }
        return result;
    }

    /**
     * @param message
     * @return 请求错误
     */
    public static Result generateNullResult(String message) {
        Result result = new Result();
        result.setResultCode(Constants.RESULT_CODE_BAD_REQUEST);
        result.setMessage(message);
        return result;
    }

    /**
     *
     * @param resultCode
     * @param message
     * @return 错误请求
     */
    public static Result generateErrorResult(int resultCode, String message) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setMessage(message);
        return result;
    }

}
