package com.example.contactapplicationfinal;

public class RowModel {

    private String name;

    public static final int LayoutOne=0;
    public static final int LayoutTwo=1;

    private int viewType;
    private int image;


    public RowModel(String name) {

        /*this.imgId = imgId;*/this.name = name;
        /*this.viewType=viewType*/;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





   public void setImgage(int image) {
        this.image = image;
    }

    public void setName(int image) {
        this.image = image;
    }


}
