package fr.morgan.api.bll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.morgan.api.bo.Employee;
import fr.morgan.api.dal.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> afficherEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void ajouterEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public Employee modifierEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void supprimerEmployee(Long id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public Employee consulterEmployee(Long id) {
		return employeeRepository.findById(id).get();
	}

}
