package com.tgt.upcurve.ImageAPI.repository;

import com.tgt.upcurve.ImageAPI.entity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity,Long> {

}
