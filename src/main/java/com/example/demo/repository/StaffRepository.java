package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojos.Staff;

public interface StaffRepository extends CrudRepository<Staff, String> {

}
