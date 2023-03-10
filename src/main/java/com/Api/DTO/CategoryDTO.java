package com.Api.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CategoryDTO {
    private Integer id;
    private String categoryName;
    private String description;
}
