package com.xt.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ResponseInfo implements Parcelable {

    private int code;
    private String msg;
    private String userinfo;

    protected ResponseInfo(Parcel in) {
        code = in.readInt();
        msg = in.readString();
        userinfo = in.readString();
    }

    public static final Creator<ResponseInfo> CREATOR = new Creator<ResponseInfo>() {
        @Override
        public ResponseInfo createFromParcel(Parcel in) {
            return new ResponseInfo(in);
        }

        @Override
        public ResponseInfo[] newArray(int size) {
            return new ResponseInfo[size];
        }
    };

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

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(code);
        dest.writeString(msg);
        dest.writeString(userinfo);
    }
}
