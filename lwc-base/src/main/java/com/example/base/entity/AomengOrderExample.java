package com.example.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AomengOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AomengOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActionidIsNull() {
            addCriterion("actionId is null");
            return (Criteria) this;
        }

        public Criteria andActionidIsNotNull() {
            addCriterion("actionId is not null");
            return (Criteria) this;
        }

        public Criteria andActionidEqualTo(Integer value) {
            addCriterion("actionId =", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidNotEqualTo(Integer value) {
            addCriterion("actionId <>", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidGreaterThan(Integer value) {
            addCriterion("actionId >", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("actionId >=", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidLessThan(Integer value) {
            addCriterion("actionId <", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidLessThanOrEqualTo(Integer value) {
            addCriterion("actionId <=", value, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidIn(List<Integer> values) {
            addCriterion("actionId in", values, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidNotIn(List<Integer> values) {
            addCriterion("actionId not in", values, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidBetween(Integer value1, Integer value2) {
            addCriterion("actionId between", value1, value2, "actionid");
            return (Criteria) this;
        }

        public Criteria andActionidNotBetween(Integer value1, Integer value2) {
            addCriterion("actionId not between", value1, value2, "actionid");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIsNull() {
            addCriterion("course_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIsNotNull() {
            addCriterion("course_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdEqualTo(String value) {
            addCriterion("course_type_id =", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotEqualTo(String value) {
            addCriterion("course_type_id <>", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdGreaterThan(String value) {
            addCriterion("course_type_id >", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("course_type_id >=", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLessThan(String value) {
            addCriterion("course_type_id <", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLessThanOrEqualTo(String value) {
            addCriterion("course_type_id <=", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdLike(String value) {
            addCriterion("course_type_id like", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotLike(String value) {
            addCriterion("course_type_id not like", value, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdIn(List<String> values) {
            addCriterion("course_type_id in", values, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotIn(List<String> values) {
            addCriterion("course_type_id not in", values, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdBetween(String value1, String value2) {
            addCriterion("course_type_id between", value1, value2, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIdNotBetween(String value1, String value2) {
            addCriterion("course_type_id not between", value1, value2, "courseTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNull() {
            addCriterion("sale_name is null");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNotNull() {
            addCriterion("sale_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNameEqualTo(String value) {
            addCriterion("sale_name =", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotEqualTo(String value) {
            addCriterion("sale_name <>", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThan(String value) {
            addCriterion("sale_name >", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_name >=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThan(String value) {
            addCriterion("sale_name <", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThanOrEqualTo(String value) {
            addCriterion("sale_name <=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLike(String value) {
            addCriterion("sale_name like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotLike(String value) {
            addCriterion("sale_name not like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameIn(List<String> values) {
            addCriterion("sale_name in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotIn(List<String> values) {
            addCriterion("sale_name not in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameBetween(String value1, String value2) {
            addCriterion("sale_name between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotBetween(String value1, String value2) {
            addCriterion("sale_name not between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andBuyClassIsNull() {
            addCriterion("buy_class is null");
            return (Criteria) this;
        }

        public Criteria andBuyClassIsNotNull() {
            addCriterion("buy_class is not null");
            return (Criteria) this;
        }

        public Criteria andBuyClassEqualTo(Integer value) {
            addCriterion("buy_class =", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotEqualTo(Integer value) {
            addCriterion("buy_class <>", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassGreaterThan(Integer value) {
            addCriterion("buy_class >", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_class >=", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassLessThan(Integer value) {
            addCriterion("buy_class <", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassLessThanOrEqualTo(Integer value) {
            addCriterion("buy_class <=", value, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassIn(List<Integer> values) {
            addCriterion("buy_class in", values, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotIn(List<Integer> values) {
            addCriterion("buy_class not in", values, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassBetween(Integer value1, Integer value2) {
            addCriterion("buy_class between", value1, value2, "buyClass");
            return (Criteria) this;
        }

        public Criteria andBuyClassNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_class not between", value1, value2, "buyClass");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(String value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(String value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(String value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(String value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLike(String value) {
            addCriterion("teacher_id like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotLike(String value) {
            addCriterion("teacher_id not like", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<String> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<String> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(String value1, String value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(String value1, String value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(String value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(String value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(String value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(String value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(String value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(String value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLike(String value) {
            addCriterion("student_id like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotLike(String value) {
            addCriterion("student_id not like", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<String> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<String> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(String value1, String value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(String value1, String value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldIsNull() {
            addCriterion("is_send_gold is null");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldIsNotNull() {
            addCriterion("is_send_gold is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldEqualTo(Integer value) {
            addCriterion("is_send_gold =", value, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldNotEqualTo(Integer value) {
            addCriterion("is_send_gold <>", value, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldGreaterThan(Integer value) {
            addCriterion("is_send_gold >", value, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send_gold >=", value, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldLessThan(Integer value) {
            addCriterion("is_send_gold <", value, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldLessThanOrEqualTo(Integer value) {
            addCriterion("is_send_gold <=", value, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldIn(List<Integer> values) {
            addCriterion("is_send_gold in", values, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldNotIn(List<Integer> values) {
            addCriterion("is_send_gold not in", values, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldBetween(Integer value1, Integer value2) {
            addCriterion("is_send_gold between", value1, value2, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andIsSendGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send_gold not between", value1, value2, "isSendGold");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdIsNull() {
            addCriterion("exchange_order_id is null");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdIsNotNull() {
            addCriterion("exchange_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdEqualTo(String value) {
            addCriterion("exchange_order_id =", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdNotEqualTo(String value) {
            addCriterion("exchange_order_id <>", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdGreaterThan(String value) {
            addCriterion("exchange_order_id >", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("exchange_order_id >=", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdLessThan(String value) {
            addCriterion("exchange_order_id <", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdLessThanOrEqualTo(String value) {
            addCriterion("exchange_order_id <=", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdLike(String value) {
            addCriterion("exchange_order_id like", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdNotLike(String value) {
            addCriterion("exchange_order_id not like", value, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdIn(List<String> values) {
            addCriterion("exchange_order_id in", values, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdNotIn(List<String> values) {
            addCriterion("exchange_order_id not in", values, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdBetween(String value1, String value2) {
            addCriterion("exchange_order_id between", value1, value2, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andExchangeOrderIdNotBetween(String value1, String value2) {
            addCriterion("exchange_order_id not between", value1, value2, "exchangeOrderId");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdIsNull() {
            addCriterion("unusedet_order_id is null");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdIsNotNull() {
            addCriterion("unusedet_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdEqualTo(String value) {
            addCriterion("unusedet_order_id =", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdNotEqualTo(String value) {
            addCriterion("unusedet_order_id <>", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdGreaterThan(String value) {
            addCriterion("unusedet_order_id >", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("unusedet_order_id >=", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdLessThan(String value) {
            addCriterion("unusedet_order_id <", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdLessThanOrEqualTo(String value) {
            addCriterion("unusedet_order_id <=", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdLike(String value) {
            addCriterion("unusedet_order_id like", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdNotLike(String value) {
            addCriterion("unusedet_order_id not like", value, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdIn(List<String> values) {
            addCriterion("unusedet_order_id in", values, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdNotIn(List<String> values) {
            addCriterion("unusedet_order_id not in", values, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdBetween(String value1, String value2) {
            addCriterion("unusedet_order_id between", value1, value2, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andUnusedetOrderIdNotBetween(String value1, String value2) {
            addCriterion("unusedet_order_id not between", value1, value2, "unusedetOrderId");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNull() {
            addCriterion("contract_status is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("contract_status is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(String value) {
            addCriterion("contract_status =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(String value) {
            addCriterion("contract_status <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(String value) {
            addCriterion("contract_status >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(String value) {
            addCriterion("contract_status >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(String value) {
            addCriterion("contract_status <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(String value) {
            addCriterion("contract_status <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLike(String value) {
            addCriterion("contract_status like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotLike(String value) {
            addCriterion("contract_status not like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<String> values) {
            addCriterion("contract_status in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<String> values) {
            addCriterion("contract_status not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(String value1, String value2) {
            addCriterion("contract_status between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(String value1, String value2) {
            addCriterion("contract_status not between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNull() {
            addCriterion("lesson_id is null");
            return (Criteria) this;
        }

        public Criteria andLessonIdIsNotNull() {
            addCriterion("lesson_id is not null");
            return (Criteria) this;
        }

        public Criteria andLessonIdEqualTo(String value) {
            addCriterion("lesson_id =", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotEqualTo(String value) {
            addCriterion("lesson_id <>", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThan(String value) {
            addCriterion("lesson_id >", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdGreaterThanOrEqualTo(String value) {
            addCriterion("lesson_id >=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThan(String value) {
            addCriterion("lesson_id <", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLessThanOrEqualTo(String value) {
            addCriterion("lesson_id <=", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdLike(String value) {
            addCriterion("lesson_id like", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotLike(String value) {
            addCriterion("lesson_id not like", value, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdIn(List<String> values) {
            addCriterion("lesson_id in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotIn(List<String> values) {
            addCriterion("lesson_id not in", values, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdBetween(String value1, String value2) {
            addCriterion("lesson_id between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andLessonIdNotBetween(String value1, String value2) {
            addCriterion("lesson_id not between", value1, value2, "lessonId");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNull() {
            addCriterion("student_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNotNull() {
            addCriterion("student_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumEqualTo(Integer value) {
            addCriterion("student_num =", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotEqualTo(Integer value) {
            addCriterion("student_num <>", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThan(Integer value) {
            addCriterion("student_num >", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_num >=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThan(Integer value) {
            addCriterion("student_num <", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("student_num <=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIn(List<Integer> values) {
            addCriterion("student_num in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotIn(List<Integer> values) {
            addCriterion("student_num not in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("student_num between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("student_num not between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andContractExtraIsNull() {
            addCriterion("contract_extra is null");
            return (Criteria) this;
        }

        public Criteria andContractExtraIsNotNull() {
            addCriterion("contract_extra is not null");
            return (Criteria) this;
        }

        public Criteria andContractExtraEqualTo(String value) {
            addCriterion("contract_extra =", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraNotEqualTo(String value) {
            addCriterion("contract_extra <>", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraGreaterThan(String value) {
            addCriterion("contract_extra >", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraGreaterThanOrEqualTo(String value) {
            addCriterion("contract_extra >=", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraLessThan(String value) {
            addCriterion("contract_extra <", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraLessThanOrEqualTo(String value) {
            addCriterion("contract_extra <=", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraLike(String value) {
            addCriterion("contract_extra like", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraNotLike(String value) {
            addCriterion("contract_extra not like", value, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraIn(List<String> values) {
            addCriterion("contract_extra in", values, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraNotIn(List<String> values) {
            addCriterion("contract_extra not in", values, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraBetween(String value1, String value2) {
            addCriterion("contract_extra between", value1, value2, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andContractExtraNotBetween(String value1, String value2) {
            addCriterion("contract_extra not between", value1, value2, "contractExtra");
            return (Criteria) this;
        }

        public Criteria andCancelNoteIsNull() {
            addCriterion("cancel_note is null");
            return (Criteria) this;
        }

        public Criteria andCancelNoteIsNotNull() {
            addCriterion("cancel_note is not null");
            return (Criteria) this;
        }

        public Criteria andCancelNoteEqualTo(String value) {
            addCriterion("cancel_note =", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotEqualTo(String value) {
            addCriterion("cancel_note <>", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteGreaterThan(String value) {
            addCriterion("cancel_note >", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_note >=", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteLessThan(String value) {
            addCriterion("cancel_note <", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteLessThanOrEqualTo(String value) {
            addCriterion("cancel_note <=", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteLike(String value) {
            addCriterion("cancel_note like", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotLike(String value) {
            addCriterion("cancel_note not like", value, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteIn(List<String> values) {
            addCriterion("cancel_note in", values, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotIn(List<String> values) {
            addCriterion("cancel_note not in", values, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteBetween(String value1, String value2) {
            addCriterion("cancel_note between", value1, value2, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCancelNoteNotBetween(String value1, String value2) {
            addCriterion("cancel_note not between", value1, value2, "cancelNote");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(String value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(String value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(String value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(String value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(String value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLike(String value) {
            addCriterion("creator_id like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotLike(String value) {
            addCriterion("creator_id not like", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<String> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<String> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(String value1, String value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(String value1, String value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andRemoveClassIsNull() {
            addCriterion("remove_class is null");
            return (Criteria) this;
        }

        public Criteria andRemoveClassIsNotNull() {
            addCriterion("remove_class is not null");
            return (Criteria) this;
        }

        public Criteria andRemoveClassEqualTo(Integer value) {
            addCriterion("remove_class =", value, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassNotEqualTo(Integer value) {
            addCriterion("remove_class <>", value, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassGreaterThan(Integer value) {
            addCriterion("remove_class >", value, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("remove_class >=", value, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassLessThan(Integer value) {
            addCriterion("remove_class <", value, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassLessThanOrEqualTo(Integer value) {
            addCriterion("remove_class <=", value, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassIn(List<Integer> values) {
            addCriterion("remove_class in", values, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassNotIn(List<Integer> values) {
            addCriterion("remove_class not in", values, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassBetween(Integer value1, Integer value2) {
            addCriterion("remove_class between", value1, value2, "removeClass");
            return (Criteria) this;
        }

        public Criteria andRemoveClassNotBetween(Integer value1, Integer value2) {
            addCriterion("remove_class not between", value1, value2, "removeClass");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberIsNull() {
            addCriterion("card_idcard_number is null");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberIsNotNull() {
            addCriterion("card_idcard_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberEqualTo(String value) {
            addCriterion("card_idcard_number =", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberNotEqualTo(String value) {
            addCriterion("card_idcard_number <>", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberGreaterThan(String value) {
            addCriterion("card_idcard_number >", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("card_idcard_number >=", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberLessThan(String value) {
            addCriterion("card_idcard_number <", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("card_idcard_number <=", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberLike(String value) {
            addCriterion("card_idcard_number like", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberNotLike(String value) {
            addCriterion("card_idcard_number not like", value, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberIn(List<String> values) {
            addCriterion("card_idcard_number in", values, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberNotIn(List<String> values) {
            addCriterion("card_idcard_number not in", values, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberBetween(String value1, String value2) {
            addCriterion("card_idcard_number between", value1, value2, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andCardIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("card_idcard_number not between", value1, value2, "cardIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNull() {
            addCriterion("sign_time is null");
            return (Criteria) this;
        }

        public Criteria andSignTimeIsNotNull() {
            addCriterion("sign_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignTimeEqualTo(Date value) {
            addCriterion("sign_time =", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotEqualTo(Date value) {
            addCriterion("sign_time <>", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThan(Date value) {
            addCriterion("sign_time >", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_time >=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThan(Date value) {
            addCriterion("sign_time <", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeLessThanOrEqualTo(Date value) {
            addCriterion("sign_time <=", value, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeIn(List<Date> values) {
            addCriterion("sign_time in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotIn(List<Date> values) {
            addCriterion("sign_time not in", values, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeBetween(Date value1, Date value2) {
            addCriterion("sign_time between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignTimeNotBetween(Date value1, Date value2) {
            addCriterion("sign_time not between", value1, value2, "signTime");
            return (Criteria) this;
        }

        public Criteria andSignIpIsNull() {
            addCriterion("sign_ip is null");
            return (Criteria) this;
        }

        public Criteria andSignIpIsNotNull() {
            addCriterion("sign_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSignIpEqualTo(String value) {
            addCriterion("sign_ip =", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpNotEqualTo(String value) {
            addCriterion("sign_ip <>", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpGreaterThan(String value) {
            addCriterion("sign_ip >", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpGreaterThanOrEqualTo(String value) {
            addCriterion("sign_ip >=", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpLessThan(String value) {
            addCriterion("sign_ip <", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpLessThanOrEqualTo(String value) {
            addCriterion("sign_ip <=", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpLike(String value) {
            addCriterion("sign_ip like", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpNotLike(String value) {
            addCriterion("sign_ip not like", value, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpIn(List<String> values) {
            addCriterion("sign_ip in", values, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpNotIn(List<String> values) {
            addCriterion("sign_ip not in", values, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpBetween(String value1, String value2) {
            addCriterion("sign_ip between", value1, value2, "signIp");
            return (Criteria) this;
        }

        public Criteria andSignIpNotBetween(String value1, String value2) {
            addCriterion("sign_ip not between", value1, value2, "signIp");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdIsNull() {
            addCriterion("crm_order_id is null");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdIsNotNull() {
            addCriterion("crm_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdEqualTo(String value) {
            addCriterion("crm_order_id =", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdNotEqualTo(String value) {
            addCriterion("crm_order_id <>", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdGreaterThan(String value) {
            addCriterion("crm_order_id >", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("crm_order_id >=", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdLessThan(String value) {
            addCriterion("crm_order_id <", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdLessThanOrEqualTo(String value) {
            addCriterion("crm_order_id <=", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdLike(String value) {
            addCriterion("crm_order_id like", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdNotLike(String value) {
            addCriterion("crm_order_id not like", value, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdIn(List<String> values) {
            addCriterion("crm_order_id in", values, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdNotIn(List<String> values) {
            addCriterion("crm_order_id not in", values, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdBetween(String value1, String value2) {
            addCriterion("crm_order_id between", value1, value2, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andCrmOrderIdNotBetween(String value1, String value2) {
            addCriterion("crm_order_id not between", value1, value2, "crmOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Integer value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Integer value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Integer value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Integer value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Integer> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Integer> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andLnvicestateIsNull() {
            addCriterion("lnvicestate is null");
            return (Criteria) this;
        }

        public Criteria andLnvicestateIsNotNull() {
            addCriterion("lnvicestate is not null");
            return (Criteria) this;
        }

        public Criteria andLnvicestateEqualTo(Byte value) {
            addCriterion("lnvicestate =", value, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateNotEqualTo(Byte value) {
            addCriterion("lnvicestate <>", value, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateGreaterThan(Byte value) {
            addCriterion("lnvicestate >", value, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateGreaterThanOrEqualTo(Byte value) {
            addCriterion("lnvicestate >=", value, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateLessThan(Byte value) {
            addCriterion("lnvicestate <", value, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateLessThanOrEqualTo(Byte value) {
            addCriterion("lnvicestate <=", value, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateIn(List<Byte> values) {
            addCriterion("lnvicestate in", values, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateNotIn(List<Byte> values) {
            addCriterion("lnvicestate not in", values, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateBetween(Byte value1, Byte value2) {
            addCriterion("lnvicestate between", value1, value2, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andLnvicestateNotBetween(Byte value1, Byte value2) {
            addCriterion("lnvicestate not between", value1, value2, "lnvicestate");
            return (Criteria) this;
        }

        public Criteria andGiveReasonIsNull() {
            addCriterion("give_reason is null");
            return (Criteria) this;
        }

        public Criteria andGiveReasonIsNotNull() {
            addCriterion("give_reason is not null");
            return (Criteria) this;
        }

        public Criteria andGiveReasonEqualTo(String value) {
            addCriterion("give_reason =", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonNotEqualTo(String value) {
            addCriterion("give_reason <>", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonGreaterThan(String value) {
            addCriterion("give_reason >", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonGreaterThanOrEqualTo(String value) {
            addCriterion("give_reason >=", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonLessThan(String value) {
            addCriterion("give_reason <", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonLessThanOrEqualTo(String value) {
            addCriterion("give_reason <=", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonLike(String value) {
            addCriterion("give_reason like", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonNotLike(String value) {
            addCriterion("give_reason not like", value, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonIn(List<String> values) {
            addCriterion("give_reason in", values, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonNotIn(List<String> values) {
            addCriterion("give_reason not in", values, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonBetween(String value1, String value2) {
            addCriterion("give_reason between", value1, value2, "giveReason");
            return (Criteria) this;
        }

        public Criteria andGiveReasonNotBetween(String value1, String value2) {
            addCriterion("give_reason not between", value1, value2, "giveReason");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdIsNull() {
            addCriterion("channel_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdIsNotNull() {
            addCriterion("channel_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdEqualTo(Integer value) {
            addCriterion("channel_batch_id =", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotEqualTo(Integer value) {
            addCriterion("channel_batch_id <>", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdGreaterThan(Integer value) {
            addCriterion("channel_batch_id >", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_batch_id >=", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdLessThan(Integer value) {
            addCriterion("channel_batch_id <", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_batch_id <=", value, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdIn(List<Integer> values) {
            addCriterion("channel_batch_id in", values, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotIn(List<Integer> values) {
            addCriterion("channel_batch_id not in", values, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_batch_id between", value1, value2, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_batch_id not between", value1, value2, "channelBatchId");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameIsNull() {
            addCriterion("channel_batch_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameIsNotNull() {
            addCriterion("channel_batch_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameEqualTo(String value) {
            addCriterion("channel_batch_name =", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameNotEqualTo(String value) {
            addCriterion("channel_batch_name <>", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameGreaterThan(String value) {
            addCriterion("channel_batch_name >", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_batch_name >=", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameLessThan(String value) {
            addCriterion("channel_batch_name <", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameLessThanOrEqualTo(String value) {
            addCriterion("channel_batch_name <=", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameLike(String value) {
            addCriterion("channel_batch_name like", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameNotLike(String value) {
            addCriterion("channel_batch_name not like", value, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameIn(List<String> values) {
            addCriterion("channel_batch_name in", values, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameNotIn(List<String> values) {
            addCriterion("channel_batch_name not in", values, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameBetween(String value1, String value2) {
            addCriterion("channel_batch_name between", value1, value2, "channelBatchName");
            return (Criteria) this;
        }

        public Criteria andChannelBatchNameNotBetween(String value1, String value2) {
            addCriterion("channel_batch_name not between", value1, value2, "channelBatchName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}