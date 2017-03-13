package com.socks.jiandan.callback;

/**
 * 网络请求结果回调接口
 */
public interface LoadResultCallBack {

    int SUCCESS_OK = 1001;
    int SUCCESS_NONE = 1002;
    int ERROR_NET = 1003;

    /**
     * 成功
     * @param result
     * @param object
     */
    void onSuccess(int result, Object object);

    /**
     * 失败
     * @param code
     * @param msg
     */
    void onError(int code, String msg);
}
