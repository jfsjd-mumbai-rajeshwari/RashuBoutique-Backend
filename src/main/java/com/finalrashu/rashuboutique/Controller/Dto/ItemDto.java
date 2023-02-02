package com.finalrashu.rashuboutique.Controller.Dto;

public class ItemDto {

    private String name;

    private String description;

    private String imageurl;
     private Float price;

    public ItemDto( String name, String description, String imageurl, Float price )
    {
        this.name = name;
        this.description = description;
        this.imageurl = imageurl;
        this.price= price;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getImageUrl()
    {
        return imageurl;
    }

    public void setImageUrl( String imageurl )
    {
        this.imageurl = imageurl;
    }
    public Float getPrice()
    {
        return price;
    }

    public void setPrice( Float price )
    {
    
        this.price= price;
    }
    
}
