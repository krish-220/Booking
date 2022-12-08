package com.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.model.Carpenter;

@Repository
public interface CarpenterRepository extends JpaRepository<Carpenter,String>{

}
