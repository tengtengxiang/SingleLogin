package com.xt.biz;

import okhttp3.Request;

/**
 * Created by Administrator on 2016/10/10.
 * 回调
 */
public interface ICallBackListener<T> {
    void onSuccessed(T t);

    void onFailed(Request request, Exception e);
}
