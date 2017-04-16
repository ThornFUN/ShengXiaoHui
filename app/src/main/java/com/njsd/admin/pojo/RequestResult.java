package com.njsd.admin.pojo;

import com.njsd.base.pojo.BaseBean;

/**
 * Created by mac on 2017/4/12.
 */

public class RequestResult extends BaseBean {

    String status;

    String mess;

    String success;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
