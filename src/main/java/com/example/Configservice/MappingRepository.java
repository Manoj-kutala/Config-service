package com.example.Configservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MappingRepository extends JpaRepository<Mapping, Integer> {

}
