package com.ass.edu.AssignmentProfile.model.dto;

public class SaleDto {
    private long Saleid;
    private String TotalSale;

    public long getSaleid() {
        return Saleid;
    }

    public void setSaleid(long saleid) {
        Saleid = saleid;
    }

    public String getTotalSale() {
        return TotalSale;
    }

    public void setTotalSale(String totalSale) {
        TotalSale = totalSale;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    private String Date;

    
}
