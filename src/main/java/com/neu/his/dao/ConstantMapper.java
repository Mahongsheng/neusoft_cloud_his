package com.neu.his.dao;

import com.neu.his.pojo.Constant;
import com.neu.his.pojo.ConstantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    long countByExample(ConstantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByExample(ConstantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByPrimaryKey(Short constantId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insert(Constant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insertSelective(Constant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    List<Constant> selectByExample(ConstantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    Constant selectByPrimaryKey(Short constantId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Constant record, @Param("example") ConstantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExample(@Param("record") Constant record, @Param("example") ConstantExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKeySelective(Constant record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKey(Constant record);
}