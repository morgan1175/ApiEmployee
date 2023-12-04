package fr.morgan.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.morgan.api.bll.EmployeeService;
import fr.morgan.api.bo.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees(){
		return employeeService.afficherEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable("id") Long id) {
		return employeeService.consulterEmployee(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		employeeService.supprimerEmployee(id);
	}
	
	@PostMapping
	public void createEmployee(@RequestBody Employee employee) {
		employeeService.ajouterEmployee(employee);
	}
	
	@PutMapping("/{id}")
	public void modifyEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		employee.setId(id);
		employeeService.modifierEmployee(employee);
	}
}
