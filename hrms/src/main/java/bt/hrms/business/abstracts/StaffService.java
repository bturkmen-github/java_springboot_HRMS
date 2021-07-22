package bt.hrms.business.abstracts;

import java.util.List;

import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.entities.concretes.Staff;


public interface StaffService {
	DataResult<List<Staff>> getAllStaffs();
	Result addStaff(Staff staff);
}
