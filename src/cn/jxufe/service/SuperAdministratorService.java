package cn.jxufe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.jxufe.entity.SuperAdministrator;
import cn.jxufe.repository.SuperAdministratorRepository;

@Service
public class SuperAdministratorService {

	@Autowired
	private SuperAdministratorRepository superAdministratorRepository;
	
	//π‹¿Ì‘±µ«¬Ω
	public SuperAdministrator login(String san,String password)
	{
		return superAdministratorRepository.getBySuperAdminNameAndPassword(san, password);
	}
}
