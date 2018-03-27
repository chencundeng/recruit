package com.chen.common.entity;

import java.util.Date;

public class ResumeEducationBg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.RESUME_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long resumeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.MAJOR
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String major;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.DEGREE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String degree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.SCHOOL_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String schoolName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.START_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.END_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.CREATE_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.REMARK1
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String remark1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.REMARK2
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String remark2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_education_bg.REMARK3
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String remark3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.ID
     *
     * @return the value of resume_education_bg.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.ID
     *
     * @param id the value for resume_education_bg.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.RESUME_ID
     *
     * @return the value of resume_education_bg.RESUME_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getResumeId() {
        return resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.RESUME_ID
     *
     * @param resumeId the value for resume_education_bg.RESUME_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.MAJOR
     *
     * @return the value of resume_education_bg.MAJOR
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.MAJOR
     *
     * @param major the value for resume_education_bg.MAJOR
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.DEGREE
     *
     * @return the value of resume_education_bg.DEGREE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getDegree() {
        return degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.DEGREE
     *
     * @param degree the value for resume_education_bg.DEGREE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.SCHOOL_NAME
     *
     * @return the value of resume_education_bg.SCHOOL_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.SCHOOL_NAME
     *
     * @param schoolName the value for resume_education_bg.SCHOOL_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.START_DATE
     *
     * @return the value of resume_education_bg.START_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.START_DATE
     *
     * @param startDate the value for resume_education_bg.START_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.END_DATE
     *
     * @return the value of resume_education_bg.END_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.END_DATE
     *
     * @param endDate the value for resume_education_bg.END_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.STATUS
     *
     * @return the value of resume_education_bg.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.STATUS
     *
     * @param status the value for resume_education_bg.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.CREATE_TIME
     *
     * @return the value of resume_education_bg.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.CREATE_TIME
     *
     * @param createTime the value for resume_education_bg.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.UPDATE_TIME
     *
     * @return the value of resume_education_bg.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.UPDATE_TIME
     *
     * @param updateTime the value for resume_education_bg.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.CREATE_ID
     *
     * @return the value of resume_education_bg.CREATE_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.CREATE_ID
     *
     * @param createId the value for resume_education_bg.CREATE_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.REMARK1
     *
     * @return the value of resume_education_bg.REMARK1
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.REMARK1
     *
     * @param remark1 the value for resume_education_bg.REMARK1
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.REMARK2
     *
     * @return the value of resume_education_bg.REMARK2
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.REMARK2
     *
     * @param remark2 the value for resume_education_bg.REMARK2
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_education_bg.REMARK3
     *
     * @return the value of resume_education_bg.REMARK3
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_education_bg.REMARK3
     *
     * @param remark3 the value for resume_education_bg.REMARK3
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
}