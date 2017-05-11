package cn.jxufe.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name="sss_circle")
@Entity
public class Circle {

	private Integer id;
	private String circleName;
	private Integer level;
	private Integer  superior_circle_id;
	
	private Set<Article> article = new HashSet<>();
	private Set<Administrator> administrator = new HashSet<>();

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="circle_name")
	public String getCircleName() {
		return circleName;
	}

	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}


	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	@Column(name="superior_circle_id")
	public Integer getSuperior_circle_id() {
		return superior_circle_id;
	}

	public void setSuperior_circle_id(Integer superior_circle_id) {
		this.superior_circle_id = superior_circle_id;
	}

//	@JoinColumn(name="superior_circle_id", unique=true)
//	@OneToOne(fetch=FetchType.LAZY)
//	public Circle getCircle() {
//		return circle;
//	}

//	public void setCircle(Circle circle) {
//		this.circle = circle;
//	}

	@ManyToMany(mappedBy="circle")
	public Set<Article> getArticle() {
		return article;
	}

	public void setArticle(Set<Article> article) {
		this.article = article;
	}

	@ManyToMany(mappedBy="circle")
	public Set<Administrator> getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Set<Administrator> administrator) {
		this.administrator = administrator;
	}
	
}
