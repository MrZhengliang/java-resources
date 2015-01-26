/**
 * 
 */
package com.splatform.day0113;

/**
 * @author 
 *
 */
public class User {

	//用户名
	private String userName;
	//密码
	private String pwd;
	
	//初始化的用户数组
	private User[] users = new User[]{};
	
	//登陆实现
	public boolean login(String userName,String pwd){
		//初始化用户
		User u1 = new User("admin","123");
		User u2 = new User("cc","123");
		User u3 = new User("dd","123");
		users = new User[]{u1,u2,u3};
		for(User u:users){
			if(u.getUserName().equals(userName)&& u.getPwd().equals(pwd)){
				//用户名和密码正确
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public User(String userName, String pwd) {
		this.userName = userName;
		this.pwd = pwd;
	}

	public User() {
		super();
	}

	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}
	
	
}
