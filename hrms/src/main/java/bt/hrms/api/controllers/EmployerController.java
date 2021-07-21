package bt.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.hrms.business.abstracts.EmployerService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

	EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("/getAllEmployers")
	public DataResult<List<Employer>> getAllEmployers(){
		return this.employerService.getAllEmployers();
	}
	
	@PostMapping("/addEmployer")
	public Result addEmployer(@RequestBody Employer employer) {
		return this.employerService.addEmployer(employer);
	}
	
}
