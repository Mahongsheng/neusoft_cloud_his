package com.neu.his.pojo;

import java.util.Date;

public class Settlement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settlement_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Integer settlementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.user_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Short userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settlement_start_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Date settlementStartTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column settlement.settlement_end_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    private Date settlementEndTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settlement_id
     *
     * @return the value of settlement.settlement_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Integer getSettlementId() {
        return settlementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settlement_id
     *
     * @param settlementId the value for settlement.settlement_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.user_id
     *
     * @return the value of settlement.user_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Short getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.user_id
     *
     * @param userId the value for settlement.user_id
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setUserId(Short userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settlement_start_time
     *
     * @return the value of settlement.settlement_start_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Date getSettlementStartTime() {
        return settlementStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settlement_start_time
     *
     * @param settlementStartTime the value for settlement.settlement_start_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setSettlementStartTime(Date settlementStartTime) {
        this.settlementStartTime = settlementStartTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column settlement.settlement_end_time
     *
     * @return the value of settlement.settlement_end_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public Date getSettlementEndTime() {
        return settlementEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column settlement.settlement_end_time
     *
     * @param settlementEndTime the value for settlement.settlement_end_time
     *
     * @mbg.generated Mon Jul 22 16:18:51 CST 2019
     */
    public void setSettlementEndTime(Date settlementEndTime) {
        this.settlementEndTime = settlementEndTime;
    }
}