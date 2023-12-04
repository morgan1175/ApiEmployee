package fr.morgan.api.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.morgan.api.bo.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
