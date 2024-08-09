package com.maxiflexy.demospring.repository;

import com.maxiflexy.demospring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
