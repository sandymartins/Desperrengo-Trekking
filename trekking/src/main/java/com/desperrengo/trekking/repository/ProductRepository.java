package com.desperrengo.trekking.repository;

import com.desperrengo.trekking.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, String> {

}
