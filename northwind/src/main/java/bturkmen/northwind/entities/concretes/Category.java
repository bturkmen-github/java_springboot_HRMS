package bturkmen.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name="categories")
@Entity
public class Category {
	@Id
	@Column(name="category_id")
	private int id;
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(mappedBy = "categories")
	private List<Product> products;
}
