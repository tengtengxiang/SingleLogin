package com.xt.model;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * sunshine on 2017/2/22 10:00
 */

public class HomePageModel {

    /**
     * code : 1
     * msg : 首页信息
     * userinfo : {"banner":[{"id":"6994","name":"庆祝新春","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2017-01-10/58748fa8a2188.jpg"},{"id":"6993","name":"2016年跨年活动","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2016-12-07/584784753f040.png"},{"id":"6992","name":"APP上线","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2017-01-10/58748f55b100e.png"},{"id":"6995","name":"员工风采","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2016-12-07/584784c7543ea.jpg"}],"article":[{"id":"7089","name":"｛公告｝长久贷2月22日发标预告"},{"id":"7088","name":"｛公告｝长久贷2月21日发标预告"},{"id":"7085","name":"｛公告｝长久贷2月20日发标预告"},{"id":"7084","name":"｛公告｝长久贷2月19日发标预告"},{"id":"7083","name":"｛公告｝长久贷2月18日发标预告"}],"borrow":{"id":"2750","name":"(上海)个人轿车抵押短期借款","apr":"14.20","time_limit":"1","account":"15","account_yes":"150000.00","account_leave":"0","scaleValue":"100"}}
     */

    private int code;
    private String msg;
    private UserinfoBean userinfo;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserinfoBean getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(UserinfoBean userinfo) {
        this.userinfo = userinfo;
    }

    public static class UserinfoBean {
        /**
         * banner : [{"id":"6994","name":"庆祝新春","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2017-01-10/58748fa8a2188.jpg"},{"id":"6993","name":"2016年跨年活动","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2016-12-07/584784753f040.png"},{"id":"6992","name":"APP上线","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2017-01-10/58748f55b100e.png"},{"id":"6995","name":"员工风采","is_jump":"0","jumpurl":"","litpic":"http://m.changjiudai.com/Uploads/Banner/2016-12-07/584784c7543ea.jpg"}]
         * article : [{"id":"7089","name":"｛公告｝长久贷2月22日发标预告"},{"id":"7088","name":"｛公告｝长久贷2月21日发标预告"},{"id":"7085","name":"｛公告｝长久贷2月20日发标预告"},{"id":"7084","name":"｛公告｝长久贷2月19日发标预告"},{"id":"7083","name":"｛公告｝长久贷2月18日发标预告"}]
         * borrow : {"id":"2750","name":"(上海)个人轿车抵押短期借款","apr":"14.20","time_limit":"1","account":"15","account_yes":"150000.00","account_leave":"0","scaleValue":"100"}
         */

        private BorrowBean borrow;
        private List<BannerBean> banner;
        private List<ArticleBean> article;


        public BorrowBean getBorrow() {
            return borrow;
        }

        public void setBorrow(BorrowBean borrow) {
            this.borrow = borrow;
        }

        public List<BannerBean> getBanner() {
            return banner;
        }

        public void setBanner(List<BannerBean> banner) {
            this.banner = banner;
        }

        public List<ArticleBean> getArticle() {
            return article;
        }

        public void setArticle(List<ArticleBean> article) {
            this.article = article;
        }

        public static class BorrowBean {
            /**
             * id : 2750
             * name : (上海)个人轿车抵押短期借款
             * apr : 14.20
             * time_limit : 1
             * account : 15
             * account_yes : 150000.00
             * account_leave : 0
             * scaleValue : 100
             */

            private String id;
            private String name;
            private String apr;
            private String time_limit;
            private String account;
            private String account_yes;
            private String account_leave;
            private String scaleValue;

            public static BorrowBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), BorrowBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getApr() {
                return apr;
            }

            public void setApr(String apr) {
                this.apr = apr;
            }

            public String getTime_limit() {
                return time_limit;
            }

            public void setTime_limit(String time_limit) {
                this.time_limit = time_limit;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getAccount_yes() {
                return account_yes;
            }

            public void setAccount_yes(String account_yes) {
                this.account_yes = account_yes;
            }

            public String getAccount_leave() {
                return account_leave;
            }

            public void setAccount_leave(String account_leave) {
                this.account_leave = account_leave;
            }

            public String getScaleValue() {
                return scaleValue;
            }

            public void setScaleValue(String scaleValue) {
                this.scaleValue = scaleValue;
            }
        }

        public static class BannerBean {
            /**
             * id : 6994
             * name : 庆祝新春
             * is_jump : 0
             * jumpurl :
             * litpic : http://m.changjiudai.com/Uploads/Banner/2017-01-10/58748fa8a2188.jpg
             */

            private String id;
            private String name;
            private String is_jump;
            private String jumpurl;
            private String litpic;


            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getIs_jump() {
                return is_jump;
            }

            public void setIs_jump(String is_jump) {
                this.is_jump = is_jump;
            }

            public String getJumpurl() {
                return jumpurl;
            }

            public void setJumpurl(String jumpurl) {
                this.jumpurl = jumpurl;
            }

            public String getLitpic() {
                return litpic;
            }

            public void setLitpic(String litpic) {
                this.litpic = litpic;
            }
        }

        public static class ArticleBean {
            /**
             * id : 7089
             * name : ｛公告｝长久贷2月22日发标预告
             */

            private String id;
            private String name;


            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
