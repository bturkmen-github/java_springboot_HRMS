package bt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.hrms.business.abstracts.StaffService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.core.utilities.results.SuccessDataResult;
import bt.hrms.core.utilities.results.SuccessResult;
import bt.hrms.dataAccess.abstracts.StaffDao;
import bt.hrms.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService {

	StaffDao staffDao;

	@Autowired
	public StaffManager(StaffDao staffDao) {
		this.staffDao = staffDao;
	}

	@Override
	public DataResult<List<Staff>> getAllStaffs() {
		return new SuccessDataResult<List<Staff>>(this.staffDao.findAll(),"Tüm Personel Listelendi");
	}

	@Override
	public Result addStaff(Staff staff) {
		this.staffDao.save(staff);
		return new SuccessResult("Personel Eklendi");
	}
	
	
}
