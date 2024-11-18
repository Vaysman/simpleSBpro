package com.example.spdockpro.repository;


import com.example.spdockpro.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<EmployeeEntity, Long> {



}
