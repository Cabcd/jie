package com.cms.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.cms.util.TUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> extends ActionSupport implements ModelDriven<T>,ServletRequestAware,ServletResponseAware{

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	
	T entity;
	
	@SuppressWarnings("unchecked")
	public BaseAction(){
		
		Class entityClass = TUtils.getTClass(this.getClass());
		
		try {
			entity = (T) entityClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	
	@Override
	public T getModel() {
		// TODO Auto-generated method stub
		return entity;
	}
	
	
	@Override
	public void setServletResponse(HttpServletResponse res) {
		this.response = res;
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		this.request = req;
	}

}
