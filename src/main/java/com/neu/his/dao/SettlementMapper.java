package com.neu.his.dao;

import com.neu.his.pojo.Settlement;
import com.neu.his.pojo.SettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettlementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    long countByExample(SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByExample(SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByPrimaryKey(Integer settlementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insert(Settlement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insertSelective(Settlement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    List<Settlement> selectByExample(SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    Settlement selectByPrimaryKey(Integer settlementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Settlement record, @Param("example") SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExample(@Param("record") Settlement record, @Param("example") SettlementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKeySelective(Settlement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table settlement
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKey(Settlement record);
}