package com.Api.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "ProductQuality")
    private Integer ProductQuality;
    @OneToMany(cascade =CascadeType.ALL)
    private List<Product>products=new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private  Customer customer;


}
