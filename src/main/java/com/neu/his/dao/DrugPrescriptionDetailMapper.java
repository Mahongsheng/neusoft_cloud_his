package com.neu.his.dao;

import com.neu.his.pojo.DrugPrescriptionDetail;
import com.neu.his.pojo.DrugPrescriptionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugPrescriptionDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    long countByExample(DrugPrescriptionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByExample(DrugPrescriptionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int deleteByPrimaryKey(Integer drugPreDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insert(DrugPrescriptionDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int insertSelective(DrugPrescriptionDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    List<DrugPrescriptionDetail> selectByExample(DrugPrescriptionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    DrugPrescriptionDetail selectByPrimaryKey(Integer drugPreDetailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") DrugPrescriptionDetail record, @Param("example") DrugPrescriptionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByExample(@Param("record") DrugPrescriptionDetail record, @Param("example") DrugPrescriptionDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKeySelective(DrugPrescriptionDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table drug_prescription_detail
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    int updateByPrimaryKey(DrugPrescriptionDetail record);
}