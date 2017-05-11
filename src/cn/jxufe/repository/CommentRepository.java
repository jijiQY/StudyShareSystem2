package cn.jxufe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.jxufe.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	//��������id������������
	List<Comment> getByArticle_Id(Integer id);
}
