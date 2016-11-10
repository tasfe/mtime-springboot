package com.mtime.springboot.model.po;

import java.util.ArrayList;
import java.util.List;

public class MuserinfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MuserinfoPOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Long value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Long value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Long value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Long value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Long value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Long> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Long> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Long value1, Long value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Long value1, Long value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistIpIsNull() {
            addCriterion("regist_ip is null");
            return (Criteria) this;
        }

        public Criteria andRegistIpIsNotNull() {
            addCriterion("regist_ip is not null");
            return (Criteria) this;
        }

        public Criteria andRegistIpEqualTo(String value) {
            addCriterion("regist_ip =", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotEqualTo(String value) {
            addCriterion("regist_ip <>", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpGreaterThan(String value) {
            addCriterion("regist_ip >", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpGreaterThanOrEqualTo(String value) {
            addCriterion("regist_ip >=", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpLessThan(String value) {
            addCriterion("regist_ip <", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpLessThanOrEqualTo(String value) {
            addCriterion("regist_ip <=", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpLike(String value) {
            addCriterion("regist_ip like", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotLike(String value) {
            addCriterion("regist_ip not like", value, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpIn(List<String> values) {
            addCriterion("regist_ip in", values, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotIn(List<String> values) {
            addCriterion("regist_ip not in", values, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpBetween(String value1, String value2) {
            addCriterion("regist_ip between", value1, value2, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistIpNotBetween(String value1, String value2) {
            addCriterion("regist_ip not between", value1, value2, "registIp");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoIsNull() {
            addCriterion("regist_plat_info is null");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoIsNotNull() {
            addCriterion("regist_plat_info is not null");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoEqualTo(String value) {
            addCriterion("regist_plat_info =", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoNotEqualTo(String value) {
            addCriterion("regist_plat_info <>", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoGreaterThan(String value) {
            addCriterion("regist_plat_info >", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoGreaterThanOrEqualTo(String value) {
            addCriterion("regist_plat_info >=", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoLessThan(String value) {
            addCriterion("regist_plat_info <", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoLessThanOrEqualTo(String value) {
            addCriterion("regist_plat_info <=", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoLike(String value) {
            addCriterion("regist_plat_info like", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoNotLike(String value) {
            addCriterion("regist_plat_info not like", value, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoIn(List<String> values) {
            addCriterion("regist_plat_info in", values, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoNotIn(List<String> values) {
            addCriterion("regist_plat_info not in", values, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoBetween(String value1, String value2) {
            addCriterion("regist_plat_info between", value1, value2, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andRegistPlatInfoNotBetween(String value1, String value2) {
            addCriterion("regist_plat_info not between", value1, value2, "registPlatInfo");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Long value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Long value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Long value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Long value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Long> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Long> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Long value1, Long value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("user_source is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("user_source is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(Byte value) {
            addCriterion("user_source =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(Byte value) {
            addCriterion("user_source <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(Byte value) {
            addCriterion("user_source >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_source >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(Byte value) {
            addCriterion("user_source <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(Byte value) {
            addCriterion("user_source <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<Byte> values) {
            addCriterion("user_source in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<Byte> values) {
            addCriterion("user_source not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(Byte value1, Byte value2) {
            addCriterion("user_source between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("user_source not between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andRegistTypeIsNull() {
            addCriterion("regist_type is null");
            return (Criteria) this;
        }

        public Criteria andRegistTypeIsNotNull() {
            addCriterion("regist_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTypeEqualTo(Byte value) {
            addCriterion("regist_type =", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotEqualTo(Byte value) {
            addCriterion("regist_type <>", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeGreaterThan(Byte value) {
            addCriterion("regist_type >", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("regist_type >=", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeLessThan(Byte value) {
            addCriterion("regist_type <", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeLessThanOrEqualTo(Byte value) {
            addCriterion("regist_type <=", value, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeIn(List<Byte> values) {
            addCriterion("regist_type in", values, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotIn(List<Byte> values) {
            addCriterion("regist_type not in", values, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeBetween(Byte value1, Byte value2) {
            addCriterion("regist_type between", value1, value2, "registType");
            return (Criteria) this;
        }

        public Criteria andRegistTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("regist_type not between", value1, value2, "registType");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeIsNull() {
            addCriterion("brithday_time is null");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeIsNotNull() {
            addCriterion("brithday_time is not null");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeEqualTo(Long value) {
            addCriterion("brithday_time =", value, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeNotEqualTo(Long value) {
            addCriterion("brithday_time <>", value, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeGreaterThan(Long value) {
            addCriterion("brithday_time >", value, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("brithday_time >=", value, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeLessThan(Long value) {
            addCriterion("brithday_time <", value, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeLessThanOrEqualTo(Long value) {
            addCriterion("brithday_time <=", value, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeIn(List<Long> values) {
            addCriterion("brithday_time in", values, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeNotIn(List<Long> values) {
            addCriterion("brithday_time not in", values, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeBetween(Long value1, Long value2) {
            addCriterion("brithday_time between", value1, value2, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andBrithdayTimeNotBetween(Long value1, Long value2) {
            addCriterion("brithday_time not between", value1, value2, "brithdayTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(Byte value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(Byte value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(Byte value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(Byte value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<Byte> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<Byte> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(Byte value1, Byte value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("certificate_no is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("certificate_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("certificate_no =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("certificate_no <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("certificate_no >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_no >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("certificate_no <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("certificate_no <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("certificate_no like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_no not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("certificate_no in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("certificate_no not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("certificate_no between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("certificate_no not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andMarryStatusIsNull() {
            addCriterion("marry_status is null");
            return (Criteria) this;
        }

        public Criteria andMarryStatusIsNotNull() {
            addCriterion("marry_status is not null");
            return (Criteria) this;
        }

        public Criteria andMarryStatusEqualTo(Byte value) {
            addCriterion("marry_status =", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotEqualTo(Byte value) {
            addCriterion("marry_status <>", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusGreaterThan(Byte value) {
            addCriterion("marry_status >", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("marry_status >=", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusLessThan(Byte value) {
            addCriterion("marry_status <", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusLessThanOrEqualTo(Byte value) {
            addCriterion("marry_status <=", value, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusIn(List<Byte> values) {
            addCriterion("marry_status in", values, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotIn(List<Byte> values) {
            addCriterion("marry_status not in", values, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusBetween(Byte value1, Byte value2) {
            addCriterion("marry_status between", value1, value2, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andMarryStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("marry_status not between", value1, value2, "marryStatus");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildIsNull() {
            addCriterion("is_have_child is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildIsNotNull() {
            addCriterion("is_have_child is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildEqualTo(Boolean value) {
            addCriterion("is_have_child =", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildNotEqualTo(Boolean value) {
            addCriterion("is_have_child <>", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildGreaterThan(Boolean value) {
            addCriterion("is_have_child >", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_have_child >=", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildLessThan(Boolean value) {
            addCriterion("is_have_child <", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildLessThanOrEqualTo(Boolean value) {
            addCriterion("is_have_child <=", value, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildIn(List<Boolean> values) {
            addCriterion("is_have_child in", values, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildNotIn(List<Boolean> values) {
            addCriterion("is_have_child not in", values, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildBetween(Boolean value1, Boolean value2) {
            addCriterion("is_have_child between", value1, value2, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andIsHaveChildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_have_child not between", value1, value2, "isHaveChild");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Byte value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Byte value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Byte value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Byte value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Byte value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Byte value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Byte> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Byte> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Byte value1, Byte value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Byte value1, Byte value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andCareerIsNull() {
            addCriterion("career is null");
            return (Criteria) this;
        }

        public Criteria andCareerIsNotNull() {
            addCriterion("career is not null");
            return (Criteria) this;
        }

        public Criteria andCareerEqualTo(String value) {
            addCriterion("career =", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotEqualTo(String value) {
            addCriterion("career <>", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThan(String value) {
            addCriterion("career >", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThanOrEqualTo(String value) {
            addCriterion("career >=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThan(String value) {
            addCriterion("career <", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThanOrEqualTo(String value) {
            addCriterion("career <=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLike(String value) {
            addCriterion("career like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotLike(String value) {
            addCriterion("career not like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerIn(List<String> values) {
            addCriterion("career in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotIn(List<String> values) {
            addCriterion("career not in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerBetween(String value1, String value2) {
            addCriterion("career between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotBetween(String value1, String value2) {
            addCriterion("career not between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboIsNull() {
            addCriterion("sina_weibo is null");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboIsNotNull() {
            addCriterion("sina_weibo is not null");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboEqualTo(String value) {
            addCriterion("sina_weibo =", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboNotEqualTo(String value) {
            addCriterion("sina_weibo <>", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboGreaterThan(String value) {
            addCriterion("sina_weibo >", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboGreaterThanOrEqualTo(String value) {
            addCriterion("sina_weibo >=", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboLessThan(String value) {
            addCriterion("sina_weibo <", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboLessThanOrEqualTo(String value) {
            addCriterion("sina_weibo <=", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboLike(String value) {
            addCriterion("sina_weibo like", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboNotLike(String value) {
            addCriterion("sina_weibo not like", value, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboIn(List<String> values) {
            addCriterion("sina_weibo in", values, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboNotIn(List<String> values) {
            addCriterion("sina_weibo not in", values, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboBetween(String value1, String value2) {
            addCriterion("sina_weibo between", value1, value2, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andSinaWeiboNotBetween(String value1, String value2) {
            addCriterion("sina_weibo not between", value1, value2, "sinaWeibo");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andDoubanIsNull() {
            addCriterion("douban is null");
            return (Criteria) this;
        }

        public Criteria andDoubanIsNotNull() {
            addCriterion("douban is not null");
            return (Criteria) this;
        }

        public Criteria andDoubanEqualTo(String value) {
            addCriterion("douban =", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotEqualTo(String value) {
            addCriterion("douban <>", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanGreaterThan(String value) {
            addCriterion("douban >", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanGreaterThanOrEqualTo(String value) {
            addCriterion("douban >=", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanLessThan(String value) {
            addCriterion("douban <", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanLessThanOrEqualTo(String value) {
            addCriterion("douban <=", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanLike(String value) {
            addCriterion("douban like", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotLike(String value) {
            addCriterion("douban not like", value, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanIn(List<String> values) {
            addCriterion("douban in", values, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotIn(List<String> values) {
            addCriterion("douban not in", values, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanBetween(String value1, String value2) {
            addCriterion("douban between", value1, value2, "douban");
            return (Criteria) this;
        }

        public Criteria andDoubanNotBetween(String value1, String value2) {
            addCriterion("douban not between", value1, value2, "douban");
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