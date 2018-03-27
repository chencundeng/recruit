package com.chen.common.entity;

import java.util.Date;

public class UserTalent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.USER_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.PHONE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.EMAIL
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.PASSWORD
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.REGISTE_TYPE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Boolean registeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_talent.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.ID
     *
     * @return the value of user_talent.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.ID
     *
     * @param id the value for user_talent.ID
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.USER_NAME
     *
     * @return the value of user_talent.USER_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.USER_NAME
     *
     * @param userName the value for user_talent.USER_NAME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.PHONE
     *
     * @return the value of user_talent.PHONE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.PHONE
     *
     * @param phone the value for user_talent.PHONE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.EMAIL
     *
     * @return the value of user_talent.EMAIL
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.EMAIL
     *
     * @param email the value for user_talent.EMAIL
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.PASSWORD
     *
     * @return the value of user_talent.PASSWORD
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.PASSWORD
     *
     * @param password the value for user_talent.PASSWORD
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.REGISTE_TYPE
     *
     * @return the value of user_talent.REGISTE_TYPE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Boolean getRegisteType() {
        return registeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.REGISTE_TYPE
     *
     * @param registeType the value for user_talent.REGISTE_TYPE
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setRegisteType(Boolean registeType) {
        this.registeType = registeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.STATUS
     *
     * @return the value of user_talent.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.STATUS
     *
     * @param status the value for user_talent.STATUS
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.CREATE_TIME
     *
     * @return the value of user_talent.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.CREATE_TIME
     *
     * @param createTime the value for user_talent.CREATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_talent.UPDATE_TIME
     *
     * @return the value of user_talent.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_talent.UPDATE_TIME
     *
     * @param updateTime the value for user_talent.UPDATE_TIME
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}