package com.yourname.springBoot.Entity;

import com.yourname.springBoot.Dao.FlowerDao;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Flowers")
public class Flower {
    @Id
    private int id;
    private String name;
    private int price;

    public Flower(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Flower(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }
}
