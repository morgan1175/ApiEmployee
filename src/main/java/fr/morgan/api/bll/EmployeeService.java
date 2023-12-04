package fr.morgan.api.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.morgan.api.bo.Employee;

@Service
public interface EmployeeService {

	List<Employee> afficherEmployees();
	void ajouterEmployee(Employee employee);
	Employee modifierEmployee(Employee employee);
	void supprimerEmployee(Long id);
	Employee consulterEmployee(Long id);
		
	
}
