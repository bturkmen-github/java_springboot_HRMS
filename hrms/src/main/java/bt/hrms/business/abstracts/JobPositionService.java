package bt.hrms.business.abstracts;

import java.util.List;

import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.entities.concretes.JobPosition;


public interface JobPositionService {
	DataResult<List<JobPosition>> getall();
	Result add(JobPosition jobPosition);
}
