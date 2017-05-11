package cn.jxufe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.jxufe.entity.Label;

public interface LabelRepository extends JpaRepository<Label, Integer> {

	//ͨ����ǩ����ȡ��ǩ����
	Label getByLabelName(String labelName);
	
//	@Query(value="SELECT article_id FROM sss_article_label WHERE label_id=:id", nativeQuery=true)
//	List<Integer> getArticleByLabel(@Param("id") Integer id);
	
	
//	@Query(value="SELECT * FROM sss_article WHERE sss_article.id IN (SELECT sss_article_label.article_id FROM sss_article_label WHERE label_id=:id)", nativeQuery=true)
//	List<Article> getArticleByLabel(@Param("id") Integer id);
	
	//ͨ����ǩId��ȡ����Id
	@Query(value="SELECT article_id FROM sss_article_label  WHERE label_id=:id", nativeQuery=true)
	List<Integer> getArticleByLabel(@Param("id") Integer id);
}
