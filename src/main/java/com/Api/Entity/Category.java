package com.Api.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "category")
@Setter
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;
    @NotNull(message = "Name cannot be empty")
    private String Name;
    @OneToMany (mappedBy = "Category",cascade = CascadeType.ALL)
    private List<Product>products;
}
