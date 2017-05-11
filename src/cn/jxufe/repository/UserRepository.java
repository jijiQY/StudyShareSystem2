package cn.jxufe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.jxufe.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	//�����û�����ѯ�û�
	User getByUserName(String userName);
	
	//�����û����������ѯ�û�
	User getByUserNameAndPassword(String userName,String password);
	
	
	
}
