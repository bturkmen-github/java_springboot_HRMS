package bt.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.hrms.business.abstracts.StaffService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.entities.concretes.Staff;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

	StaffService staffService;

	@Autowired
	public StaffController(StaffService staffService) {
		this.staffService = staffService;
	}
	
	@GetMapping("/getAllStaffs")
	public DataResult<List<Staff>> getAllStafs(){
		return this.staffService.getAllStaffs();
	}
	
}
