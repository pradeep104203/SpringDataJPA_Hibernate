package com.pradeep.springdata.componentmapping.repos;

import org.springframework.data.repository.CrudRepository;

import com.pradeep.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
