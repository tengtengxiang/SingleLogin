package com.xt.biz;

import com.xt.app.SingleLoginConfig;
import com.xt.model.HomePageModel;
import com.xt.utils.GsonUtils;
import com.xt.utils.LogUtils;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Request;

public class HomeBiz {
    private static Map<String, String> sParams = new HashMap<>();
    /**
     * 注意此处封装好自己的实体类
     * @param listener
     */
    public static void getHomePage(final ICallBackListener<HomePageModel> listener){
      OkHttpUtils.ResultCallback<String> callback = new OkHttpUtils.ResultCallback<String>() {
          @Override
          public void onError(Request request, Exception e) {
            listener.onFailed(request,e);
          }

          @Override
          public void onResponse(String response) {
              LogUtils.showLog("getHomePage:"+response);
            listener.onSuccessed(GsonUtils.deserialize(response,HomePageModel.class));
          }
      };
      OkHttpUtils.getAsyn(SingleLoginConfig.BASE_HTTP+ "/Index/index_json", callback);
    }

}
