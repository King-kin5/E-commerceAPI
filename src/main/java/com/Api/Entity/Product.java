package com.Api.Entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "Products")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    @NotNull(message = "Product name can  not be null")
    private Integer Productname;
    @NotNull(message = "Price can not be null ")
    private Integer ProductPrice;
    private  Integer Quantity;
    private Double Rating;
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;



}
