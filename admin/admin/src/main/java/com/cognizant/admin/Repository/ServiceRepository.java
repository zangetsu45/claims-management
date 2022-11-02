package com.cognizant.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.admin.model.Service;


public interface ServiceRepository extends JpaRepository<Service, Integer>{

}
