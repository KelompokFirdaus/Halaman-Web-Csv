package com.web.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_produk")
public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    @Column(length = 150, nullable = false)
     private String name;
     @Column(length = 10, nullable = false, unique = true)
     private String price;
    
     public Product(){ }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}

