package com.example.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer>{
	
	Optional<Admin> findById(int id);

}
