package com.example.commapi.beanReq;


import java.io.Serializable;

public class AomengOrderReq implements Serializable {

    private String studentId;

    private String courseTypeId;

    private String orderType;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(String courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }


    @Override
    public String toString() {
        return "AomengOrderReq{" +
                "studentId='" + studentId + '\'' +
                ", courseTypeId='" + courseTypeId + '\'' +
                ", orderType='" + orderType + '\'' +
                '}';
    }
}
