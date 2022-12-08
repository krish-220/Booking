package com.example.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,String> {

}
