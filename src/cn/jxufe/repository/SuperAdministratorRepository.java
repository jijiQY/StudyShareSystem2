package cn.jxufe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.jxufe.entity.SuperAdministrator;

public interface SuperAdministratorRepository extends JpaRepository<SuperAdministrator, Integer> {

	//通过用户名密码查找对象
	SuperAdministrator getBySuperAdminNameAndPassword(String superAdminName,String password);
}
