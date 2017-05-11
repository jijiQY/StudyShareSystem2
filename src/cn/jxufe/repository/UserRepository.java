package cn.jxufe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.jxufe.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	//根据用户名查询用户
	User getByUserName(String userName);
	
	//根据用户名和密码查询用户
	User getByUserNameAndPassword(String userName,String password);
	
	
	
}
