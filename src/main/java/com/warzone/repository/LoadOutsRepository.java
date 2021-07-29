package com.warzone.repository;

import com.warzone.entity.LoadOuts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadOutsRepository extends JpaRepository<LoadOuts,Long> {
}
