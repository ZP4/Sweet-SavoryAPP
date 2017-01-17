package com.sweetsavoryapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by derek on 1/5/2017.
 */

public class FoodFormat {
   public String Title;
    public String Descript;
    public String Price;
    public String Quantaty;

    public Boolean getHeader() {
        return Header;
    }

    public void setHeader(Boolean header) {
        this.Header = header;
    }

    Boolean Header;




    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescript() {
        return Descript;
    }

    public void setDescript(String descript) {
        Descript = descript;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getQuantaty() {
        return Quantaty;
    }

    public void setQuantaty(String quantaty) {
        Quantaty = quantaty;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    String Id;

    FoodFormat(String title, String descript, String price, String quantaty, String id, boolean header){
    this.Title = title;
        this.Descript = descript;
        this.Price = price;
        this.Quantaty = quantaty;
        this.Id =id;
        this.Header = header;

    }


}
