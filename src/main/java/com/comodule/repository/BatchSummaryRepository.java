package com.comodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comodule.entity.BatchSummary;

public interface BatchSummaryRepository extends JpaRepository<BatchSummary, Integer> {

}
