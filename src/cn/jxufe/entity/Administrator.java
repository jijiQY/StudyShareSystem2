package cn.jxufe.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="sss_administrator")
@Entity
public class Administrator {

	private Integer id;
	private String adminName;
	private String password;
	private String nickName;
	private String phone;
	private String email;
	
	
	private Set<Circle> circle = new HashSet<>();
	private SuperAdministrator superAdministrator;

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="admin_name")
	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="nick_name")
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@JoinTable(name="sss_admin_circle",
			joinColumns={@JoinColumn(name="admin_id", referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="circle_id", referencedColumnName="id")})
	@ManyToMany
	public Set<Circle> getCircle() {
		return circle;
	}

	public void setCircle(Set<Circle> circle) {
		this.circle = circle;
	}

	@JoinColumn(name="super_admin_id")
	@ManyToOne(fetch=FetchType.LAZY)
	public SuperAdministrator getSuperAdministrator() {
		return superAdministrator;
	}

	public void setSuperAdministrator(SuperAdministrator superAdministrator) {
		this.superAdministrator = superAdministrator;
	}
	
	
}
