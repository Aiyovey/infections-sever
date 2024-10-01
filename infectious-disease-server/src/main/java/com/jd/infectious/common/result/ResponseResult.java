package com.jd.infectious.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 响应实体类
 *
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuppressWarnings("unused")
public class ResponseResult<T> {

    /**
     * 状态码
     */
    private int code;

    /**
     * 信息
     */
    private String msg;

    /**
     * 时间戳
     */
    private Long tid;

    /**
     * 数据
     */
    private T data;

    /**
     * 默认方法，返回200状态位，无Msg，无Data
     *
     * @return {@link ResponseResult}
     */
    public static <T> ResponseResult<T> create() {
        return new ResponseResult<>(HttpStatus.SC_OK, null, System.currentTimeMillis(), null);
    }

    /**
     * 返回500的静态方法
     *
     * @return {@link ResponseResult}
     */
    public static <T> ResponseResult<T> fail(String msg) {
        return new ResponseResult<>(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg, System.currentTimeMillis(), null);
    }

    /**
     * 重载create方法，增加状态码和数据
     *
     * @param resultCode 状态码
     * @param data       数据
     * @return {@link ResponseResult}
     */
    public static <T> ResponseResult<T> create(int resultCode, T data) {
        return new ResponseResult<>(resultCode, null, System.currentTimeMillis(), data);
    }

    /**
     * 重载create方法，增加状态码和消息参数
     *
     * @param resultCode 状态码
     * @param resultMsg  消息参数
     * @return {@link ResponseResult}
     */
    public static <T> ResponseResult<T> create(int resultCode, String resultMsg) {
        return new ResponseResult<>(resultCode, resultMsg, System.currentTimeMillis(), null);
    }

    /**
     * 返回状态吗200，同时携带数据
     *
     * @param data data
     */
    public static <T> ResponseResult<T> create(T data) {
        return new ResponseResult<>(HttpStatus.SC_OK, null, System.currentTimeMillis(), data);
    }

    /**
     * 重载create方法，增加状态码和消息参数和数据
     *
     * @param resultCode 返回的状态码
     * @param resultMsg  返回的消息
     * @param data       数据
     * @return {@link ResponseResult}
     */
    public static <T> ResponseResult<T> create(int resultCode, String resultMsg, T data) {
        return new ResponseResult<>(resultCode, resultMsg, System.currentTimeMillis(), data);
    }
}
