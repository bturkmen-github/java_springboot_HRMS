package bt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
