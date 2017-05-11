package cn.jxufe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.User;
import cn.jxufe.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	//登陆
	@Transactional(readOnly=true)
	public User login(String userName,String password)
	{
		return userRepository.getByUserNameAndPassword(userName, password);
		
	}
	
	//注册
	@Transactional
	public void register(User user)
	{
		userRepository.saveAndFlush(user);
	}
	
	//根据用户名返回用户对象
	@Transactional(readOnly=true)
	public User getByUserName(String userName)
	{
		return userRepository.getByUserName(userName);
	}
	
	//对用户信息进行分页
	@Transactional(readOnly=true)
	public Page<User> getPage(int pageNo, int pageSize){
			PageRequest pageable = new PageRequest(pageNo - 1, pageSize);
			return userRepository.findAll(pageable);
		}
}
