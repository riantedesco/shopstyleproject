package com.compass.mspayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SkuRepository extends JpaRepository<SkuEntity, Long> {

    @Query("SELECT s FROM SkuEntity s WHERE s.product.id = :productId")
    List<SkuEntity> findByProductId(Long productId);
}
