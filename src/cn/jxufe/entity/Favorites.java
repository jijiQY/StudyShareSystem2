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
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="sss_favorites")
@Entity
public class Favorites {

	private Integer id;
	private String favoritesName;
	
	private User user;
	private Set<Article> article = new HashSet<>();
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="favorites_name")
	public String getFavoritesName() {
		return favoritesName;
	}
	public void setFavoritesName(String favoritesName) {
		this.favoritesName = favoritesName;
	}
	
	@JoinColumn(name="user_id", unique=true)
	@OneToOne(fetch=FetchType.LAZY)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@ManyToMany(mappedBy="favorites")
	public Set<Article> getArticle() {
		return article;
	}
	public void setArticle(Set<Article> article) {
		this.article = article;
	}
	
}
