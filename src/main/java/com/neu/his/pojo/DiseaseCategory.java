package com.neu.his.pojo;

public class DiseaseCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column disease_category.disease_cate_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Short diseaseCateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column disease_category.disease_cate_name
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private String diseaseCateName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disease_category.disease_cate_id
     *
     * @return the value of disease_category.disease_cate_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Short getDiseaseCateId() {
        return diseaseCateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disease_category.disease_cate_id
     *
     * @param diseaseCateId the value for disease_category.disease_cate_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDiseaseCateId(Short diseaseCateId) {
        this.diseaseCateId = diseaseCateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column disease_category.disease_cate_name
     *
     * @return the value of disease_category.disease_cate_name
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public String getDiseaseCateName() {
        return diseaseCateName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column disease_category.disease_cate_name
     *
     * @param diseaseCateName the value for disease_category.disease_cate_name
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setDiseaseCateName(String diseaseCateName) {
        this.diseaseCateName = diseaseCateName == null ? null : diseaseCateName.trim();
    }
}