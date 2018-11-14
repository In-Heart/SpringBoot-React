package com.example.wht.product.pojo;

import java.math.BigDecimal;

public class Product {
    private Integer id;

    private String goodname;

    private Integer typeid;

    private String typename;

    private String unit;

    private BigDecimal purchaseprice;

    private BigDecimal saleprice;

    private Integer salesamount;

    private String stockamount;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname == null ? null : goodname.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public BigDecimal getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(BigDecimal saleprice) {
        this.saleprice = saleprice;
    }

    public Integer getSalesamount() {
        return salesamount;
    }

    public void setSalesamount(Integer salesamount) {
        this.salesamount = salesamount;
    }

    public String getStockamount() {
        return stockamount;
    }

    public void setStockamount(String stockamount) {
        this.stockamount = stockamount == null ? null : stockamount.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}