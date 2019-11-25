package com.architectureAppWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.architectureAppWeb.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
