package com.neu.his.dao;

import com.neu.his.pojo.ConstantType;
import com.neu.his.pojo.ConstantTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConstantTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    long countByExample(ConstantTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByExample(ConstantTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByPrimaryKey(Byte constantTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insert(ConstantType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insertSelective(ConstantType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    List<ConstantType> selectByExample(ConstantTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    ConstantType selectByPrimaryKey(Byte constantTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") ConstantType record, @Param("example") ConstantTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExample(@Param("record") ConstantType record, @Param("example") ConstantTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKeySelective(ConstantType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table constant_type
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKey(ConstantType record);
}