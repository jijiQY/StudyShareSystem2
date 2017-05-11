package cn.jxufe.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.Circle;
import cn.jxufe.entity.Comment;
import cn.jxufe.entity.Label;
import cn.jxufe.entity.User;
import cn.jxufe.repository.ArticleRepository;
import cn.jxufe.repository.CircleRepository;
import cn.jxufe.repository.CommentRepository;
import cn.jxufe.repository.FavoritesRepository;
import cn.jxufe.repository.LabelRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	@Autowired
	private FavoritesRepository favoritesRepository;
	@Autowired
	private CircleRepository circleRepository;
	@Autowired
	private LabelRepository labelRepository;
	@Autowired
	private CommentRepository commentRepository;
	
	//��ȡ��������
	@Transactional(readOnly=true)
	public List<Article> getPersonArticle(Integer userId)
	{
		return articleRepository.getByUser_Id(userId);
	}
	
	//��������
	@Transactional
	public void saveArticle(Article article,Label label,Circle circle,User user)
	{
		article.setPubTime(new Date());
		article.setState("����");
		article.setUser(user);
		article.getCircle().add(circle);
		article.getLabel().add(label);
		articleRepository.saveAndFlush(article);
	}
	
	//ɾ������(ɾ�����˵Ļ����ǹ���Աɾ������)
	@Transactional
	public void deleteArticle(Integer articleId)
	{
		List<Comment> comList= commentRepository.getByArticle_Id(articleId);
		commentRepository.delete(comList);
		articleRepository.delete(articleId);
	}
	
	//��ȡȦ������
	@Transactional(readOnly=true)
	public List<Article> getCircleArticle(Integer circleId)
	{
		return articleRepository.getCircleArticles(circleId);
	}
	
	//��ȡ�����ղ�����
	@Transactional(readOnly=true)
	public List<Article> getPersonFavoritesArticle(Integer userId)
	{
		return articleRepository.getFavoritesArticles(favoritesRepository.getByUser_Id(userId).getId());
	}
	
	//ת�����£�����Ȧ�����±��ת��ʱ�䣩
	@Transactional
	public void transferAticle(Integer articleId,Integer circleId)
	{
		Article article = articleRepository.findOne(articleId);
		article.setTraTime(new Date());
		Circle circle = circleRepository.findOne(circleId);
		article.getCircle().add(circle);
		articleRepository.saveAndFlush(article);
	}
	
	//ͨ����ǩ�������������������
		public List<Article> getArticle(String labelName){
			int id = labelRepository.getByLabelName(labelName).getId();
			return articleRepository.findAll(labelRepository.getArticleByLabel(id));
		}
		
	//�����½��з�ҳ
	@Transactional(readOnly=true)
	public Page<Article> getPage(int pageNo, int pageSize){
		PageRequest pageable = new PageRequest(pageNo - 1, pageSize);
		return articleRepository.findAll(pageable);
	}
}
