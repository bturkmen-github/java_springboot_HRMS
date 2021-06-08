package bt.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.hrms.business.abstracts.JobPositionService;
import bt.hrms.core.utilities.results.DataResult;
import bt.hrms.core.utilities.results.Result;
import bt.hrms.core.utilities.results.SuccessDataResult;
import bt.hrms.core.utilities.results.SuccessResult;
import bt.hrms.dataAccess.abstracts.JobPositionDao;
import bt.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	
	public JobPositionManager() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public DataResult<List<JobPosition>> getall() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Pozisyon Listesi Getirildi");
	}
	

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("Pozisyon Eklendi");
	}

}
