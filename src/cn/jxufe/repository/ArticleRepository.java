package cn.jxufe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.jxufe.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

	//根据作者id获取所发布文章
	List<Article> getByUser_Id(Integer id);
	
	/*往文章表，文章标签表，文章圈子表，插入数据（修改也可以这样使用）
	 * article.getCircle().add(circle);
	   article.getLabel().add(label);
	   articleRepository.saveAndFlush(article);*/
	
	/*删除文章(文章表及其多对多表)： articleRepository.delete(articleId);*/
	
	/*根据圈子id返回所有文章id
	@Query(value="SELECT article_id FROM sss_circle_article WHERE circle_id=:circle_id", nativeQuery=true)
	List<Integer> getArticlesId(@Param("circle_id")Integer circle_id);*/
	
	//根据圈子id返回所有圈子内文章
	@Query(value="SELECT * FROM sss_article WHERE id IN (SELECT article_id FROM sss_circle_article WHERE circle_id=:circle_id)", nativeQuery=true)
	List<Article> getCircleArticles(@Param("circle_id")Integer circle_id);
	
	//根据收藏夹id获取所有收藏夹内文章
	@Query(value="SELECT * FROM sss_article WHERE id IN (SELECT article_id FROM sss_article_favorites WHERE favorites_id=:favorites_id)", nativeQuery=true)
	List<Article> getFavoritesArticles(@Param("favorites_id")Integer favorites_id);
	
	
}
