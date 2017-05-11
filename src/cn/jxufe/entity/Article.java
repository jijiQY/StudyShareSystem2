package cn.jxufe.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="sss_article")
@Entity
public class Article {

	private Integer id;
	private String title;
	private String content;
	private String state;
	private Date pubTime;
	private Date updTime;
	private Date traTime;
	
	private User user;
	private Set<Label> label = new HashSet<>();
	private Set<Favorites> favorites = new HashSet<>();
	private Set<Circle> circle = new HashSet<>();
	
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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="upd_time")
	public Date getUpdTime() {
		return updTime;
	}
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tra_time")
	public Date getTraTime() {
		return traTime;
	}
	public void setTraTime(Date traTime) {
		this.traTime = traTime;
	}
	
	@JoinColumn(name="author_id")
	@ManyToOne(fetch=FetchType.LAZY)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@JoinTable(name="sss_article_label",
			joinColumns={@JoinColumn(name="article_id", referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="label_id", referencedColumnName="id")})
	@ManyToMany
	public Set<Label> getLabel() {
		return label;
	}
	public void setLabel(Set<Label> label) {
		this.label = label;
	}
	
	@JoinTable(name="sss_article_favorites",
			joinColumns={@JoinColumn(name="article_id", referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="favorites_id", referencedColumnName="id")})
	@ManyToMany
	public Set<Favorites> getFavorites() {
		return favorites;
	}
	public void setFavorites(Set<Favorites> favorites) {
		this.favorites = favorites;
	}
	
	@JoinTable(name="sss_circle_article",
			joinColumns={@JoinColumn(name="article_id", referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="circle_id", referencedColumnName="id")})
	@ManyToMany
	public Set<Circle> getCircle() {
		return circle;
	}
	public void setCircle(Set<Circle> circle) {
		this.circle = circle;
	}
	
	
}
