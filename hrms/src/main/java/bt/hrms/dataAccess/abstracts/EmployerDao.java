package bt.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bt.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
