package com.bank.web.command;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.pool.Constants;

import lombok.Data;
@Data
public class Command implements Order{
protected HttpServletRequest request;
protected String action,domain,page,view;

	@Override
	public void execute() throws Exception {
		this.view = String.format(Constants.VIEW_PATH, domain, page);	
	}
	public void setDomain() {
		String path= request.getServletPath();
		System.out.println("¼­ºí¸´ÆÐ½º°¡ ¹»±î :" +path);
		domain = path.replace(".do","");
	}
	public void serPage() {
		page = request.getParameter("dest");
	}
}
