package cn.jxufe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.jxufe.entity.SuperAdministrator;

public interface SuperAdministratorRepository extends JpaRepository<SuperAdministrator, Integer> {

	//ͨ���û���������Ҷ���
	SuperAdministrator getBySuperAdminNameAndPassword(String superAdminName,String password);
}
