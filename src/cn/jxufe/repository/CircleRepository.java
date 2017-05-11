package cn.jxufe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.jxufe.entity.Circle;

public interface CircleRepository extends JpaRepository<Circle, Integer> {

	//获取所有的一级圈子
	@Query("SELECT c FROM Circle c WHERE c.level = 1")
	List<Circle> getLevel1Circle();

	//通过圈子id获取所有下级圈子
	@Query("SELECT c FROM Circle c WHERE c.superior_circle_id = :id ")
	List<Circle> getNextCircle(@Param("id") Integer id);
	
	//查询是否圈子已经存在
	@Query("SELECT c FROM Circle c WHERE c.superior_circle_id = :superior_circle_id AND c.circleName = :circleName") 
	List<Circle> checkCircle(@Param("superior_circle_id") Integer superior_circle_id, @Param("circleName") String circleName);
	
}
