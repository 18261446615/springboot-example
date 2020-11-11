package com.example.base.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.commapi.beanReq.AomengOrderReq;
import com.example.commapi.common.response.ResponseResult;
import com.example.commapi.service.AomengOrderServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
  * @author: liuwangcheng
  * @package: com.example.base.controller
  * @class: AomengOrderController
  * @datetime: 2019/9/3 14:21
  * @methodParameters: 
  * @desc 订单接口服务
  */

@RestController
@RequestMapping("/aomengOrder")
public class AomengOrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AomengOrderController.class);

    @Reference(version = "1.0.0.1", timeout = 3000, check = false)
    AomengOrderServiceApi aomengOrderServiceApi;

     /**
      * @author: liuwangcheng
      * @package: com.example.base.controller
      * @class: AomengOrderController
      * @datetime: 2019/9/3 14:31
      * @methodParameters:
      * @desc 获取学生的某门课程的订单列表
      */
    @RequestMapping("/getListOrder")
    @ResponseBody
    public ResponseResult getListOrderByStudentIdAndCourseTypeId(
                                                                @RequestBody AomengOrderReq aomengOrderReq,
                                                                HttpServletRequest request,
                                                                HttpServletResponse response){
        
        LOGGER.info("[class: AomengOrderController.java]-[method: getListOrderByStudentIdAndCourseTypeId]-[function: {}] [参数/结果]: {}", "获取学生的某门课程的订单列表", "");



        ResponseResult responseResult = aomengOrderServiceApi.getListOrder(aomengOrderReq);

        return responseResult;

    }

}
