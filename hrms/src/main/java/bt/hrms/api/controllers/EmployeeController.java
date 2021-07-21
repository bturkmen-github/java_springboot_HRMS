package bt.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.hrms.business.abstracts.EmployeeService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getAllEmployees")
	public DataResult<List<Employee>> getAllEmployees() {
		return this.employeeService.getAllEmployees();
	}
	@PostMapping("/addEmployee")
	public Result addEmployee(@RequestBody Employee employee) {
		return this.employeeService.addEmployee(employee);
	}
}
