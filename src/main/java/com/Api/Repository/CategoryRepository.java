package com.Api.Repository;

import com.Api.Entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    public Category findByCategoryName(String categoryName);
}
