package cn.jxufe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="sss_super_administrator")
@Entity
public class SuperAdministrator {

	private Integer id;
	private String superAdminName;
	private String password;
	private String nickName;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="super_admin_name")
	public String getSuperAdminName() {
		return superAdminName;
	}
	public void setSuperAdminName(String superAdminName) {
		this.superAdminName = superAdminName;
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
	
	
}
