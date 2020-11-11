package com.example.base.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.base.entity.AomengOrder;
import com.example.base.entity.AomengOrderExample;
import com.example.base.mapper.AomengOrderMapper;
import com.example.commapi.beanReq.AomengOrderReq;
import com.example.commapi.common.response.HttpStatusCode;
import com.example.commapi.common.response.ResponseResult;
import com.example.commapi.service.AomengOrderServiceApi;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

 /**
  * @author: liuwangcheng
  * @package: com.example.base.service.impl
  * @class: AomengOrderServiceImpl
  * @datetime: 2019/9/3 14:20
  * @methodParameters: 
  * @desc 订单接口实现类
  */
@Service(interfaceClass = AomengOrderServiceApi.class, version = "1.0.0.1", timeout = 3000)
@Component
public class AomengOrderServiceApiImpl implements AomengOrderServiceApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(AomengOrderServiceApiImpl.class);

    @Autowired
    private AomengOrderMapper aomengOrderMapper;


     @Override
     public ResponseResult getListOrder(AomengOrderReq aomengOrderReq) {

         ResponseResult responseResult = new ResponseResult();

         LOGGER.debug("[CLASS: AomengOrderServiceImpl] - [METHOD: listOrderByStudentIdAndCourseTypeId] - [description: {}] - [args: [studentId, courseTypeId]] - [return: {}", "获取学生的某门课程的订单列表", aomengOrderReq.getStudentId());
         AomengOrderExample example = new AomengOrderExample();
         AomengOrderExample.Criteria criteria = example.createCriteria();
         criteria.andStudentIdEqualTo(aomengOrderReq.getStudentId());
         if (StringUtils.isNotBlank(aomengOrderReq.getCourseTypeId())) {
             LOGGER.debug("[CLASS: AomengOrderServiceImpl] - [METHOD: listOrderByStudentIdAndCourseTypeId] - [description: {}] - [args: [studentId, courseTypeId]] - [return: {}", "获取学生的某门课程的订单列表 课程编号", aomengOrderReq.getCourseTypeId());
             criteria.andCourseTypeIdEqualTo(aomengOrderReq.getCourseTypeId());
         }
         if (StringUtils.isNotBlank(aomengOrderReq.getOrderType())) {
             LOGGER.debug("[CLASS: AomengOrderServiceImpl] - [METHOD: listOrderByStudentIdAndCourseTypeId] - [description: {}] - [args: [studentId, courseTypeId, orderType]] - [return: {}", "获取学生的某门课程的订单列表 订单类型", aomengOrderReq.getOrderType());
             criteria.andTypeEqualTo(aomengOrderReq.getOrderType());
         }
         criteria.andOrderStatusEqualTo(2);

         List<AomengOrder> listOrder = aomengOrderMapper.selectByExample(example);

         responseResult.setData(listOrder);
         responseResult.setStatus(HttpStatusCode.CODE_SUCCESS.getValue());
         responseResult.setMessage(HttpStatusCode.CODE_SUCCESS.getDesc());

         return responseResult;

     }
 }
