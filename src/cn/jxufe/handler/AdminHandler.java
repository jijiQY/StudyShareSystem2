package cn.jxufe.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.jxufe.entity.Article;
import cn.jxufe.entity.Circle;
import cn.jxufe.entity.Comment;
import cn.jxufe.entity.SuperAdministrator;
import cn.jxufe.entity.User;
import cn.jxufe.service.ArticleService;
import cn.jxufe.service.CircleService;
import cn.jxufe.service.CommentService;
import cn.jxufe.service.SuperAdministratorService;
import cn.jxufe.service.UserService;

@SessionAttributes(value={"sa2"})
@Controller
public class AdminHandler {

	@Autowired
	private SuperAdministratorService superAdministratorService;
	@Autowired
	private ArticleService articleService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private UserService userService;
	@Autowired
	private CircleService circleService;
	
	SuperAdministrator sa2;
	
	//删除分享
	@RequestMapping(value="/deleteShare")
	public void deleteShare(@RequestParam Integer id){
		articleService.deleteArticle(id);
	}
	
	// 圈子管理分页
	@RequestMapping("/circleManager")
	public String list4(
			@RequestParam(value = "pageNo", required = false, defaultValue = "1") String pageNoStr,
			Map<String, Object> map) {
		int pageNo = 1;

		try {
			// 对 pageNo 的校验
			pageNo = Integer.parseInt(pageNoStr);
			if (pageNo < 1) {
				pageNo = 1;
			}
		} catch (Exception e) {
		}

		Page<Circle> page = circleService.getPage(pageNo, 5);
		map.put("page", page);

		return "circle-manager";
	}

	//用户信息管理分页
	@RequestMapping("/userMessageManager")
	public String list3(@RequestParam(value="pageNo", required=false, defaultValue="1") String pageNoStr, 
			Map<String, Object> map){
		int pageNo = 1;
		
		try {
			//对 pageNo 的校验
			pageNo = Integer.parseInt(pageNoStr);
			if(pageNo < 1){
				pageNo = 1;
			}
		} catch (Exception e) {}
		
		Page<User> page = userService.getPage(pageNo, 5);
		map.put("page", page);
		
		return "usermessage-manager";
	}
	
	//评论管理分页
	@RequestMapping("/commentManager")
	public String list2(@RequestParam(value="pageNo", required=false, defaultValue="1") String pageNoStr, 
			Map<String, Object> map){
		int pageNo = 1;
		
		try {
			//对 pageNo 的校验
			pageNo = Integer.parseInt(pageNoStr);
			if(pageNo < 1){
				pageNo = 1;
			}
		} catch (Exception e) {}
		
		Page<Comment> page = commentService.getPage(pageNo, 5);
		map.put("page", page);
		
		return "review-manager";
	}
	
	
	//文章管理分页
	@RequestMapping("/shareManager")
	public String list(@RequestParam(value="pageNo", required=false, defaultValue="1") String pageNoStr, 
			Map<String, Object> map){
		int pageNo = 1;
		
		try {
			//对 pageNo 的校验
			pageNo = Integer.parseInt(pageNoStr);
			if(pageNo < 1){
				pageNo = 1;
			}
		} catch (Exception e) {}
		
		Page<Article> page = articleService.getPage(pageNo, 5);
		map.put("page", page);
		
		return "share-manager";
	}
	
	
	//管理员登陆
	@RequestMapping(value="/manager",method=RequestMethod.POST)
	public String  login(SuperAdministrator sa,Map <String,Object> map)
	{
		sa2 = superAdministratorService.login(sa.getSuperAdminName(),sa.getPassword());
		if(sa2!=null){
			sa2.setPassword("");
			map.put("sa2",sa2);
			return "admin";
		}
	
		return "redirect:/test.jsp";
	}
}
