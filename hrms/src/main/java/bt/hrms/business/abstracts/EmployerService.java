package bt.hrms.business.abstracts;

import java.util.List;

import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAllEmployers();
	Result addEmployer(Employer employer);
}
