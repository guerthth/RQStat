package com.guerth.gui.page;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {
	
	private String userName;
	private String passWord;
	
	/**
	 * Method checking if the entered login data matches the database entries
	 * @return
	 */
	public String login() {
		if(this.userName.equals("root") && this.passWord.equals("root")){
			System.out.println("login successful");
			return "/userSection.xhtml";
		} else {
			return "/index.xhtml";
		}
	}
	
	// Getters and Setters
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
