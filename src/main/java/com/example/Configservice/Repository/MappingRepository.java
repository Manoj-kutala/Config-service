package com.example.Configservice.Repository;

import com.example.Configservice.Entity.Mapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MappingRepository extends JpaRepository<Mapping, Integer> {

    @Query(value = "select originatormapping.mappingfile from originatormapping where originatormapping.name = (:name)", nativeQuery = true)
    String getMappingfileByName(String name);

}
