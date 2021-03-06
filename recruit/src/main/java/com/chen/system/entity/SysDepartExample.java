package com.chen.system.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDepartExample {
    
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDepartExample() {
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

        public Criteria andDepartNameIsNull() {
            addCriterion("DEPART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("DEPART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("DEPART_NAME =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("DEPART_NAME <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("DEPART_NAME >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_NAME >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("DEPART_NAME <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("DEPART_NAME <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("DEPART_NAME like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("DEPART_NAME not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("DEPART_NAME in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("DEPART_NAME not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("DEPART_NAME between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("DEPART_NAME not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIsNull() {
            addCriterion("DEPART_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIsNotNull() {
            addCriterion("DEPART_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartCodeEqualTo(String value) {
            addCriterion("DEPART_CODE =", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotEqualTo(String value) {
            addCriterion("DEPART_CODE <>", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeGreaterThan(String value) {
            addCriterion("DEPART_CODE >", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_CODE >=", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLessThan(String value) {
            addCriterion("DEPART_CODE <", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPART_CODE <=", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLike(String value) {
            addCriterion("DEPART_CODE like", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotLike(String value) {
            addCriterion("DEPART_CODE not like", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIn(List<String> values) {
            addCriterion("DEPART_CODE in", values, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotIn(List<String> values) {
            addCriterion("DEPART_CODE not in", values, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeBetween(String value1, String value2) {
            addCriterion("DEPART_CODE between", value1, value2, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotBetween(String value1, String value2) {
            addCriterion("DEPART_CODE not between", value1, value2, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartLevelIsNull() {
            addCriterion("DEPART_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDepartLevelIsNotNull() {
            addCriterion("DEPART_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDepartLevelEqualTo(Byte value) {
            addCriterion("DEPART_LEVEL =", value, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelNotEqualTo(Byte value) {
            addCriterion("DEPART_LEVEL <>", value, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelGreaterThan(Byte value) {
            addCriterion("DEPART_LEVEL >", value, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("DEPART_LEVEL >=", value, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelLessThan(Byte value) {
            addCriterion("DEPART_LEVEL <", value, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelLessThanOrEqualTo(Byte value) {
            addCriterion("DEPART_LEVEL <=", value, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelIn(List<Byte> values) {
            addCriterion("DEPART_LEVEL in", values, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelNotIn(List<Byte> values) {
            addCriterion("DEPART_LEVEL not in", values, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelBetween(Byte value1, Byte value2) {
            addCriterion("DEPART_LEVEL between", value1, value2, "departLevel");
            return (Criteria) this;
        }

        public Criteria andDepartLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("DEPART_LEVEL not between", value1, value2, "departLevel");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameIsNull() {
            addCriterion("PARENT_DEPART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameIsNotNull() {
            addCriterion("PARENT_DEPART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameEqualTo(String value) {
            addCriterion("PARENT_DEPART_NAME =", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameNotEqualTo(String value) {
            addCriterion("PARENT_DEPART_NAME <>", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameGreaterThan(String value) {
            addCriterion("PARENT_DEPART_NAME >", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_DEPART_NAME >=", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameLessThan(String value) {
            addCriterion("PARENT_DEPART_NAME <", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameLessThanOrEqualTo(String value) {
            addCriterion("PARENT_DEPART_NAME <=", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameLike(String value) {
            addCriterion("PARENT_DEPART_NAME like", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameNotLike(String value) {
            addCriterion("PARENT_DEPART_NAME not like", value, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameIn(List<String> values) {
            addCriterion("PARENT_DEPART_NAME in", values, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameNotIn(List<String> values) {
            addCriterion("PARENT_DEPART_NAME not in", values, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameBetween(String value1, String value2) {
            addCriterion("PARENT_DEPART_NAME between", value1, value2, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartNameNotBetween(String value1, String value2) {
            addCriterion("PARENT_DEPART_NAME not between", value1, value2, "parentDepartName");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeIsNull() {
            addCriterion("PARENT_DEPART_CODE is null");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeIsNotNull() {
            addCriterion("PARENT_DEPART_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeEqualTo(String value) {
            addCriterion("PARENT_DEPART_CODE =", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeNotEqualTo(String value) {
            addCriterion("PARENT_DEPART_CODE <>", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeGreaterThan(String value) {
            addCriterion("PARENT_DEPART_CODE >", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_DEPART_CODE >=", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeLessThan(String value) {
            addCriterion("PARENT_DEPART_CODE <", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeLessThanOrEqualTo(String value) {
            addCriterion("PARENT_DEPART_CODE <=", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeLike(String value) {
            addCriterion("PARENT_DEPART_CODE like", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeNotLike(String value) {
            addCriterion("PARENT_DEPART_CODE not like", value, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeIn(List<String> values) {
            addCriterion("PARENT_DEPART_CODE in", values, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeNotIn(List<String> values) {
            addCriterion("PARENT_DEPART_CODE not in", values, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeBetween(String value1, String value2) {
            addCriterion("PARENT_DEPART_CODE between", value1, value2, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andParentDepartCodeNotBetween(String value1, String value2) {
            addCriterion("PARENT_DEPART_CODE not between", value1, value2, "parentDepartCode");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("DELETED is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Byte value) {
            addCriterion("DELETED =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Byte value) {
            addCriterion("DELETED <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Byte value) {
            addCriterion("DELETED >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("DELETED >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Byte value) {
            addCriterion("DELETED <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("DELETED <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Byte> values) {
            addCriterion("DELETED in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Byte> values) {
            addCriterion("DELETED not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Byte value1, Byte value2) {
            addCriterion("DELETED between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("DELETED not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNull() {
            addCriterion("UPDATOR is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorIsNotNull() {
            addCriterion("UPDATOR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorEqualTo(String value) {
            addCriterion("UPDATOR =", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotEqualTo(String value) {
            addCriterion("UPDATOR <>", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThan(String value) {
            addCriterion("UPDATOR >", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATOR >=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThan(String value) {
            addCriterion("UPDATOR <", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLessThanOrEqualTo(String value) {
            addCriterion("UPDATOR <=", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorLike(String value) {
            addCriterion("UPDATOR like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotLike(String value) {
            addCriterion("UPDATOR not like", value, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorIn(List<String> values) {
            addCriterion("UPDATOR in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotIn(List<String> values) {
            addCriterion("UPDATOR not in", values, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorBetween(String value1, String value2) {
            addCriterion("UPDATOR between", value1, value2, "updator");
            return (Criteria) this;
        }

        public Criteria andUpdatorNotBetween(String value1, String value2) {
            addCriterion("UPDATOR not between", value1, value2, "updator");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_depart
     *
     * @mbg.generated do_not_delete_during_merge Sat Mar 24 10:05:29 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
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