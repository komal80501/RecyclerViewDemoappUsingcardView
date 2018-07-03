package com.example.lenovo.recyclerviewdemoappusingcardview;

public class Product {
    String prodId,prodDesc,prodName,prodPrice;
    int imgID;

    public Product(String prodId, String prodName, String prodDesc, String prodPrice, int imgID) {
        this.prodId = prodId;
        this.prodDesc = prodDesc;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.imgID = imgID;
    }

    public String getProdId() {
        return prodId;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public String getProdName() {
        return prodName;
    }

    public String getProdPrice() {
        return prodPrice;
    }

    public int getImgID() {
        return imgID;
    }
}
