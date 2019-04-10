package com.cms.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.cms.entity.User;
import com.cms.service.UserService;

@Component
public class UserAction extends BaseAction<User>{
	
	
	User user=this.getModel();
	private Map<String,Object> jsonData=new HashMap<String,Object>();
	@Resource(name="userService")
	private UserService userService;
	
	public String saveUser(){
		userService.saveUser(user);
		return SUCCESS;
	}
	
	public String findUser(){
		User u=userService.findUser(user.getId());
		jsonData.put("user", u);
		return SUCCESS;
	}
	
	public String toHome(){
		return "success";
	}

	public Map<String, Object> getJsonData() {
		return jsonData;
	}

	public void setJsonData(Map<String, Object> jsonData) {
		this.jsonData = jsonData;
	}

	
	
	
	
	
}	
