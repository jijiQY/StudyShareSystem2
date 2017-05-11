package cn.jxufe.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="sss_notice")
@Entity
public class Notice {

	private Integer id;
	private String title;
	private String content;
	private String state;
	private Date pubTime;
	
	private Circle circle;
	private Administrator administrator;
	private SuperAdministrator superAdministrator;
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pub_time")
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	
	@JoinColumn(name="circle_id")
	@ManyToOne(fetch=FetchType.LAZY)
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@JoinColumn(name="admin_id")
	@ManyToOne(fetch=FetchType.LAZY)
	public Administrator getAdministrator() {
		return administrator;
	}
	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
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
