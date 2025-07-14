package com.eylulaleynasahin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eylulaleynasahin.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

