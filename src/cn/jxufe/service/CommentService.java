package cn.jxufe.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.Comment;
import cn.jxufe.entity.User;
import cn.jxufe.repository.CommentRepository;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	//发表评论
	public void commentArticle(Comment comment,Article article,User user)
	{
		comment.setCommentTime(new Date());
		comment.setArticle(article);
		comment.setUser(user);
		commentRepository.saveAndFlush(comment);
	}
	
	//对评论进行分页
	@Transactional(readOnly=true)
	public Page<Comment> getPage(int pageNo, int pageSize){
		PageRequest pageable = new PageRequest(pageNo - 1, pageSize);
		return commentRepository.findAll(pageable);
	}
	
	//删除评论
	@Transactional
	public void deleteComment(Integer commentId)
	{
		commentRepository.delete(commentId);
	}
}
