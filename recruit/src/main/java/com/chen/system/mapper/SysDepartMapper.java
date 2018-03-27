package com.chen.system.mapper;

import com.chen.system.entity.SysDepart;
import com.chen.system.entity.SysDepartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDepartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    long countByExample(SysDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int deleteByExample(SysDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int insert(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int insertSelective(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    List<SysDepart> selectByExample(SysDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    SysDepart selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysDepart record, @Param("example") SysDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int updateByExample(@Param("record") SysDepart record, @Param("example") SysDepartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int updateByPrimaryKeySelective(SysDepart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_depart
     *
     * @mbg.generated Sat Mar 24 10:05:29 CST 2018
     */
    int updateByPrimaryKey(SysDepart record);
}