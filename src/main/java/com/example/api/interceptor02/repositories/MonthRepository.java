package com.example.api.interceptor02.repositories;

import com.example.api.interceptor02.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthRepository extends JpaRepository<Month,Long> {

}
