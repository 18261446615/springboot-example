package com.example.commapi.common.response;


import java.io.Serializable;

/**
  * @author: liuwangcheng
  * @package: com.example.base.common.response
  * @class: ResponseResult
  * @datetime: 2019/9/3 14:27
  * @methodParameters:
  * @desc 返回数据格式封装
  */
public class ResponseResult implements Serializable {


    private static final long serialVersionUID = 2267375474185385105L;

    public ResponseResult() {
        this.status = HttpStatusCode.CODE_SUCCESS.getValue();
        this.message = HttpStatusCode.CODE_SUCCESS.getDesc();
    }

    public ResponseResult(HttpStatusCode httpStatusCode, String extraMsg) {
        super();
        this.status = httpStatusCode.getValue();
        this.message = extraMsg + "" + httpStatusCode.getDesc();
    }

    public ResponseResult(HttpStatusCode httpStatusCode) {
        super();
        this.status = httpStatusCode.getValue();
        this.message = httpStatusCode.getDesc();
    }

    public ResponseResult(String status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public ResponseResult(Object data) {
        super();
        this.status = HttpStatusCode.CODE_SUCCESS.getValue();
        this.message = HttpStatusCode.CODE_SUCCESS.getDesc();
        this.data = data;
    }


    private String status;
    private String message;
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
