package cn.jxufe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.jxufe.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

	//��������id��ȡ����������
	List<Article> getByUser_Id(Integer id);
	
	/*�����±����±�ǩ������Ȧ�ӱ��������ݣ��޸�Ҳ��������ʹ�ã�
	 * article.getCircle().add(circle);
	   article.getLabel().add(label);
	   articleRepository.saveAndFlush(article);*/
	
	/*ɾ������(���±����Զ��)�� articleRepository.delete(articleId);*/
	
	/*����Ȧ��id������������id
	@Query(value="SELECT article_id FROM sss_circle_article WHERE circle_id=:circle_id", nativeQuery=true)
	List<Integer> getArticlesId(@Param("circle_id")Integer circle_id);*/
	
	//����Ȧ��id��������Ȧ��������
	@Query(value="SELECT * FROM sss_article WHERE id IN (SELECT article_id FROM sss_circle_article WHERE circle_id=:circle_id)", nativeQuery=true)
	List<Article> getCircleArticles(@Param("circle_id")Integer circle_id);
	
	//�����ղؼ�id��ȡ�����ղؼ�������
	@Query(value="SELECT * FROM sss_article WHERE id IN (SELECT article_id FROM sss_article_favorites WHERE favorites_id=:favorites_id)", nativeQuery=true)
	List<Article> getFavoritesArticles(@Param("favorites_id")Integer favorites_id);
	
	
}
