package com.finalrashu.rashuboutique.Model;

import com.finalrashu.rashuboutique.Controller.Dto.ItemDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Added_Products")

public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    @Column(name="Name")
    private String name;
    @Column(name="Description")
    private String description;
    @Column(name="ImageUrl")
    private String imageurl;
    @Column(name="Price")
    private Float price;

    public Item()
    {
    }
    public Item( ItemDto itemDto )
    {
        this.name = itemDto.getName();
        this.description = itemDto.getDescription();
        this.imageurl = itemDto.getImageUrl();
        this.price= itemDto.getPrice();
    }

    @Override
    public String toString()
    {
        return "Item{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", imageUrl='"
            + imageurl + '\'' +", price='"+price+ '}';
    }
    
}
