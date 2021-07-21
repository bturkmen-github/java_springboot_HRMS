package bt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.hrms.business.abstracts.EmployerService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.core.utilities.results.SuccessDataResult;
import bt.hrms.core.utilities.results.SuccessResult;
import bt.hrms.dataAccess.abstracts.EmployerDao;
import bt.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}


	@Override
	public DataResult<List<Employer>> getAllEmployers() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Tüm İşverenler Listelendi");
	}


	@Override
	public Result addEmployer(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer Eklendi");
	}
	
}
