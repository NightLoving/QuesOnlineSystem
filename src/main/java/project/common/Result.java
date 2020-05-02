package project.common;

import java.io.Serializable;

/**
 * @author yang
 * @description 返回给前端的结果类封装，前端收到的类型全为此类
 * @param <T> 数据的结果，可以是任何类型
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //状态码，见类Constants
    private int resultCode;
    //返回信息，返回给前端的提示信息
    private String message;
    //数据结果，泛型
    private T data;

    public Result(){}

    public Result(int resultCode, String message){
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result failure(String code) {
        return new Result(500, "服务错误");
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultCode=" + resultCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
