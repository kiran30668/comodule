package com.comodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comodule.entity.BatchRunDetails;

public interface BatchRunDetailsRepository extends JpaRepository<BatchRunDetails, Integer> {

}
