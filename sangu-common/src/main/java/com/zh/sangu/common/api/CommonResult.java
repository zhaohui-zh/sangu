package com.zh.sangu.common.api;

/**
 * 通用返回对象
 * Created by zhaohui on 2020/3/2
 */
public class CommonResult<T> {

    private long code;
    private String message;
    private T data;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
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

    protected CommonResult() {}

    protected CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功 只写入数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),
                ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功 写入数据和提示信息
     * @param data
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data, String message) {
        return new CommonResult<>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败 不写入信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed() {
        return new CommonResult<>(ResultCode.FAILED.getCode(),
                ResultCode.FAILED.getMessage(), null);
    }

    /**
     * 失败 写入提示信息
     * @param message
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String message) {
        return new CommonResult<>(ResultCode.FAILED.getCode(), message, null);
    }

}
