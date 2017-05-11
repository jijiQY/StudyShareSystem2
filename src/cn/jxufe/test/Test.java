package cn.jxufe.test;


import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.UniqueConstraint;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.Circle;
import cn.jxufe.entity.Comment;
import cn.jxufe.entity.Label;
import cn.jxufe.entity.User;
import cn.jxufe.repository.ArticleRepository;
import cn.jxufe.repository.CircleRepository;
import cn.jxufe.repository.LabelRepository;
import cn.jxufe.repository.UserRepository;
import cn.jxufe.service.ArticleService;
import cn.jxufe.service.CommentService;

public class Test {

	private ApplicationContext ctx =null;
	private ArticleRepository articleRepository=null;
	private ArticleService articleService=null;
	private LabelRepository labelRepository= null;
	private CircleRepository circleRepository=null;
	private UserRepository userRepository = null;
	private CommentService commentService=null;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		articleRepository = ctx.getBean(ArticleRepository.class);
		articleService=ctx.getBean(ArticleService.class);
		labelRepository = ctx.getBean(LabelRepository.class);
		circleRepository=ctx.getBean(CircleRepository.class);
		userRepository = ctx.getBean(UserRepository.class);
		commentService =ctx.getBean(CommentService.class);
	}
	
//	@org.junit.Test
//	public void test4()
//	{
//		Comment comment = new Comment();
//		Article article = new Article();
//		User user = new User();
//		comment.setContent("内容2");
//		article.setId(2);
//		user.setId(1);
//		commentService.commentArticle(comment, article, user);
//	}
	
//	@org.junit.Test
//	public void test3()
//	{
//		articleService.transferAticle(22, 3);
//	}
	
//	@org.junit.Test
//	public void test2()
//	{
//		List<Article> l = articleService.getPersonFavoritesArticle(1);
//		System.out.println(l.get(2).getContent());
//	}
	
//	@org.junit.Test
//	public void test1()
//	{
//		List<Article> l = articleService.getCircleArticle(2);
//		System.out.println(l.get(0).getTitle());
//	}
	
//	@org.junit.Test
//	public void delete()
//	{
//		articleService.deleteArticle(23);
//	}
	
	
//	@org.junit.Test
//	public void test1(){
//		Article article = new Article();
//		Label label =	new Label();
//		label.setLabelName("艺术");//9
//		Circle circle = new Circle();
//		circle.setCircleName("软通学院");//2
//		User user = userRepository.findOne(1);//1
//		article.setTitle("标题瞩目");article.setContent("内容漂亮");
//		articleService.saveArticle(article, label, circle, user);
//	}
	
//	@org.junit.Test
//	public void testDataSource() throws SQLException {
//		DataSource dataSource = ctx.getBean(DataSource.class);
//		System.out.println(dataSource.getConnection());
//	}

}
