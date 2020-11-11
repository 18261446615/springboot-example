package com.example.commapi.service;

import com.example.commapi.beanReq.AomengOrderReq;
import com.example.commapi.common.response.ResponseResult;

/**
 * @author liuwangcheng
 * @project springboot-example
 * @package com.example.base.service
 * @class AomengOrderService
 * @datetime 2019/9/3 14:12
 * @desc 订单接口
 */
public interface AomengOrderServiceApi {

    /**
     * 获取学生的某门课程的订单列表
     */
    ResponseResult getListOrder(AomengOrderReq aomengOrderReq);

}
