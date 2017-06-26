package org.hanzhdy.manager.upc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hanzhdy.framework.bean.Page;

public class UserBasicExample {
    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    protected String orderByClause;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    protected Page page;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    protected boolean distinct;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    protected List<Criteria> oredCriteria;

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public UserBasicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public Page getPage() {
        return page;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 本段代码由Mybatis Generator自动生成.
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("SALT is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("SALT is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("SALT =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("SALT <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("SALT >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("SALT >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("SALT <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("SALT <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("SALT like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("SALT not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("SALT in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("SALT not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("SALT between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("SALT not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("FORMID is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("FORMID is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Long value) {
            addCriterion("FORMID =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Long value) {
            addCriterion("FORMID <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Long value) {
            addCriterion("FORMID >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FORMID >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Long value) {
            addCriterion("FORMID <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Long value) {
            addCriterion("FORMID <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Long> values) {
            addCriterion("FORMID in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Long> values) {
            addCriterion("FORMID not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Long value1, Long value2) {
            addCriterion("FORMID between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Long value1, Long value2) {
            addCriterion("FORMID not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeIsNull() {
            addCriterion("CURRLOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeIsNotNull() {
            addCriterion("CURRLOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeEqualTo(Date value) {
            addCriterion("CURRLOGINTIME =", value, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeNotEqualTo(Date value) {
            addCriterion("CURRLOGINTIME <>", value, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeGreaterThan(Date value) {
            addCriterion("CURRLOGINTIME >", value, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CURRLOGINTIME >=", value, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeLessThan(Date value) {
            addCriterion("CURRLOGINTIME <", value, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("CURRLOGINTIME <=", value, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeIn(List<Date> values) {
            addCriterion("CURRLOGINTIME in", values, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeNotIn(List<Date> values) {
            addCriterion("CURRLOGINTIME not in", values, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeBetween(Date value1, Date value2) {
            addCriterion("CURRLOGINTIME between", value1, value2, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andCurrlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("CURRLOGINTIME not between", value1, value2, "currlogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeIsNull() {
            addCriterion("PRELOGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeIsNotNull() {
            addCriterion("PRELOGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeEqualTo(Date value) {
            addCriterion("PRELOGINTIME =", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeNotEqualTo(Date value) {
            addCriterion("PRELOGINTIME <>", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeGreaterThan(Date value) {
            addCriterion("PRELOGINTIME >", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PRELOGINTIME >=", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeLessThan(Date value) {
            addCriterion("PRELOGINTIME <", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeLessThanOrEqualTo(Date value) {
            addCriterion("PRELOGINTIME <=", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeIn(List<Date> values) {
            addCriterion("PRELOGINTIME in", values, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeNotIn(List<Date> values) {
            addCriterion("PRELOGINTIME not in", values, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeBetween(Date value1, Date value2) {
            addCriterion("PRELOGINTIME between", value1, value2, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeNotBetween(Date value1, Date value2) {
            addCriterion("PRELOGINTIME not between", value1, value2, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andCurrloginipIsNull() {
            addCriterion("CURRLOGINIP is null");
            return (Criteria) this;
        }

        public Criteria andCurrloginipIsNotNull() {
            addCriterion("CURRLOGINIP is not null");
            return (Criteria) this;
        }

        public Criteria andCurrloginipEqualTo(String value) {
            addCriterion("CURRLOGINIP =", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipNotEqualTo(String value) {
            addCriterion("CURRLOGINIP <>", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipGreaterThan(String value) {
            addCriterion("CURRLOGINIP >", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipGreaterThanOrEqualTo(String value) {
            addCriterion("CURRLOGINIP >=", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipLessThan(String value) {
            addCriterion("CURRLOGINIP <", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipLessThanOrEqualTo(String value) {
            addCriterion("CURRLOGINIP <=", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipLike(String value) {
            addCriterion("CURRLOGINIP like", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipNotLike(String value) {
            addCriterion("CURRLOGINIP not like", value, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipIn(List<String> values) {
            addCriterion("CURRLOGINIP in", values, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipNotIn(List<String> values) {
            addCriterion("CURRLOGINIP not in", values, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipBetween(String value1, String value2) {
            addCriterion("CURRLOGINIP between", value1, value2, "currloginip");
            return (Criteria) this;
        }

        public Criteria andCurrloginipNotBetween(String value1, String value2) {
            addCriterion("CURRLOGINIP not between", value1, value2, "currloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipIsNull() {
            addCriterion("PRELOGINIP is null");
            return (Criteria) this;
        }

        public Criteria andPreloginipIsNotNull() {
            addCriterion("PRELOGINIP is not null");
            return (Criteria) this;
        }

        public Criteria andPreloginipEqualTo(String value) {
            addCriterion("PRELOGINIP =", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotEqualTo(String value) {
            addCriterion("PRELOGINIP <>", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipGreaterThan(String value) {
            addCriterion("PRELOGINIP >", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipGreaterThanOrEqualTo(String value) {
            addCriterion("PRELOGINIP >=", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLessThan(String value) {
            addCriterion("PRELOGINIP <", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLessThanOrEqualTo(String value) {
            addCriterion("PRELOGINIP <=", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLike(String value) {
            addCriterion("PRELOGINIP like", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotLike(String value) {
            addCriterion("PRELOGINIP not like", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipIn(List<String> values) {
            addCriterion("PRELOGINIP in", values, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotIn(List<String> values) {
            addCriterion("PRELOGINIP not in", values, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipBetween(String value1, String value2) {
            addCriterion("PRELOGINIP between", value1, value2, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotBetween(String value1, String value2) {
            addCriterion("PRELOGINIP not between", value1, value2, "preloginip");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table u_user_basic
     * @author do_not_delete_during_merge MyBatis Generator
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 本类由Mybatis Generator自动生成
     * 映射数据库: u_user_basic
     * @author MyBatis Generator
     */
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