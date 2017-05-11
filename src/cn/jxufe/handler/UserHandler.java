package cn.jxufe.handler;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.web.bind.annotation.SessionAttributes;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.Circle;
import cn.jxufe.entity.Label;
import cn.jxufe.entity.User;
import cn.jxufe.repository.CircleRepository;
import cn.jxufe.repository.UserRepository;
import cn.jxufe.service.ArticleService;
import cn.jxufe.service.CircleService;
import cn.jxufe.service.LabelService;
import cn.jxufe.service.UserService;

@SessionAttributes(value={"user2"})
@Controller
public class UserHandler {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CircleService circleService;
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private LabelService labelService;
	
	private User user2;
	
	//发布文章
	@RequestMapping(value="/test4/circle/{circleId}",method=RequestMethod.POST)
	public String pubArticle(@PathVariable("circleId") Integer circleId,Article article,Label label)
	{    	
		articleService.saveArticle(article,labelService.getByLabelName(label.getLabelName()) , circleService.getByID(circleId), userService.getByUserName(user2.getUserName()));
		return "success";
	}
	
//	//获取个人分享
//	@RequestMapping(value="/test3/{id}" )
//	public String listPersonArticle(@PathVariable("id") Integer id,Map<String,Object> map)
//	{
//			map.put("article", articleService.getPersonArticle(id));
//			System.out.println(articleService.getPersonArticle(id).get(3));
//			return "";
//	}
	
	//得到下级圈子
	@RequestMapping(value="/test2/{id}" )
	public String listNextCircle(@PathVariable("id") Integer id,Map<String,Object> map)
	{
			map.put("circle", circleService.getNextCircle(id));
			return "success";
	}
	
	//显示所有一级圈子
	@RequestMapping("/test1")
	public String listLevel1Circle(Map<String,Object> map)
	{
		List<Circle> circle = circleService.getCircle();
		map.put("circle", circle);
		return "success";
	}
	
	//注册验证用户名
	@ResponseBody
	@RequestMapping(value="/ajaxValidateUserName",method=RequestMethod.POST)
	public String validateUserName(@RequestParam(value="userName",required=true) String userName){
		User user = userService.getByUserName(userName);
		if(user == null){
			return "0";				//表示该用户名不存在，可以注册
		}else{
			return "1";				//表示该用户已经存在，不可以注册
		}
	}
	
	//用户注册
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String  register(User user)
	{
		userService.register(user);
		return "success";
	}
	
	//用户登陆
	@RequestMapping(value="/member",method=RequestMethod.POST)
	public String login(User user,Map <String,Object> map)
	{
		user2 = userService.login(user.getUserName(),user.getPassword());
		if(user2!=null){
			user2.setPassword("");
			map.put("user2",user2);
		}
		
		List<Circle> circle = circleService.getCircle();
		map.put("circle", circle);
		
		return "redirect:/index.jsp";
		
	}
	
}
