package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entities.People;

public interface PeopleRepository extends CrudRepository<People, Integer>{

}
