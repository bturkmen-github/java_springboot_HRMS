package bt.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employers")
public class Employer extends User {

	@Column(name="company_name")
	private String companyName;
	@Column(name="web_site")
	private String webSite;
	
	@OneToOne
	@JoinColumn(name = "id")
	private User user;
}
