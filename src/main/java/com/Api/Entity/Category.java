package com.Api.Entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @NonNull
    @Column(name = "category_name")
    @NotBlank(message = "Category name cannot be blank")
    private String categoryName;
    @NonNull
    @NotBlank(message= "description cannot be blank")
    private String description;

    @NonNull
    @NotBlank(message= "image url cannot be blank")
    private String imageUrl;
}
