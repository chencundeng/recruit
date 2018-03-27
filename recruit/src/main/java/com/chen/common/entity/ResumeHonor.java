package com.chen.common.entity;

import java.util.Date;

public class ResumeHonor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.RESUME_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long resumeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.HONOR_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String honorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.HONOR_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date honorDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.HONOR_DEPART
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String honorDepart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.CREATE_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long createId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume_honor.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.ID
     *
     * @return the value of resume_honor.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.ID
     *
     * @param id the value for resume_honor.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.RESUME_ID
     *
     * @return the value of resume_honor.RESUME_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getResumeId() {
        return resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.RESUME_ID
     *
     * @param resumeId the value for resume_honor.RESUME_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.HONOR_NAME
     *
     * @return the value of resume_honor.HONOR_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getHonorName() {
        return honorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.HONOR_NAME
     *
     * @param honorName the value for resume_honor.HONOR_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setHonorName(String honorName) {
        this.honorName = honorName == null ? null : honorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.HONOR_DATE
     *
     * @return the value of resume_honor.HONOR_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getHonorDate() {
        return honorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.HONOR_DATE
     *
     * @param honorDate the value for resume_honor.HONOR_DATE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setHonorDate(Date honorDate) {
        this.honorDate = honorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.HONOR_DEPART
     *
     * @return the value of resume_honor.HONOR_DEPART
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getHonorDepart() {
        return honorDepart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.HONOR_DEPART
     *
     * @param honorDepart the value for resume_honor.HONOR_DEPART
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setHonorDepart(String honorDepart) {
        this.honorDepart = honorDepart == null ? null : honorDepart.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.STATUS
     *
     * @return the value of resume_honor.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.STATUS
     *
     * @param status the value for resume_honor.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.CREATE_TIME
     *
     * @return the value of resume_honor.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.CREATE_TIME
     *
     * @param createTime the value for resume_honor.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.CREATE_ID
     *
     * @return the value of resume_honor.CREATE_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getCreateId() {
        return createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.CREATE_ID
     *
     * @param createId the value for resume_honor.CREATE_ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume_honor.UPDATE_TIME
     *
     * @return the value of resume_honor.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume_honor.UPDATE_TIME
     *
     * @param updateTime the value for resume_honor.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}