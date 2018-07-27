package com.tough.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class ParkPermission {

    private char status;

    private String cardNo;

    private String userId;

    private Date goDate;

    private Date outDate;

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getGoDate() {
        return goDate;
    }

    public void setGoDate(Date goDate) {
        this.goDate = goDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }
}