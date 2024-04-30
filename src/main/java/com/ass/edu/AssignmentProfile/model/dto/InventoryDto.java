package com.ass.edu.AssignmentProfile.model.dto;

public class InventoryDto {
    private long  id;
    private String AvailableStock;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvailableStock() {
        return AvailableStock;
    }

    public void setAvailableStock(String availableStock) {
        AvailableStock = availableStock;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    private String Date;
    private String Quantity;
}
