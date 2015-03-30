package com.carson.demo.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String execute () {
		return SUCCESS;
	}
	
	public String login() {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpServletResponse response = ServletActionContext.getResponse();
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;chartset=utf-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println("username: " + username + "  password: " + password);
			
			if("admin".equals(username) && "12345".equals(password)) {
				return SUCCESS;
			} else {
				return "login";
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
}
