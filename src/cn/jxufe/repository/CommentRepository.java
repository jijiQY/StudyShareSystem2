package cn.jxufe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.jxufe.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	//根据文章id返回所属评论
	List<Comment> getByArticle_Id(Integer id);
}
