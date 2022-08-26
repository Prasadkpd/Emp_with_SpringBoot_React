package com.prasadkpd.spring_boot_react_emp.repository;

import com.prasadkpd.spring_boot_react_emp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
