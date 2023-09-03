package com.yxb.usercenter.common;

/**
 * 返回工具类
 *
 * @author yxb
 */
public class ResultUtils {

    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static<T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }

    /**
     * 失败
     * @param errorCod
     * @param message
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCod,String message, String description){
        return new BaseResponse(errorCod.getCode(),message,description);
    }

    /**
     * 失败
     * @param errorCod
     * @param description
     * @return
     */
    public static BaseResponse error(ErrorCode errorCod,String description){
        return new BaseResponse(errorCod.getCode(),null,errorCod.getMessage(),description);
    }

    /**
     * 失败
     * @param code
     * @param message
     * @param description
     * @return
     */
    public static BaseResponse error(int code,String message, String description){
        return new BaseResponse(code,null,message,description);
    }
}
