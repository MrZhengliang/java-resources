/**
 * 
 */
package com.splatform.day0113;

/**
 * @author 
 *
 */
public class User {

	//�û���
	private String userName;
	//����
	private String pwd;
	
	//��ʼ�����û�����
	private User[] users = new User[]{};
	
	//��½ʵ��
	public boolean login(String userName,String pwd){
		//��ʼ���û�
		User u1 = new User("admin","123");
		User u2 = new User("cc","123");
		User u3 = new User("dd","123");
		users = new User[]{u1,u2,u3};
		for(User u:users){
			if(u.getUserName().equals(userName)&& u.getPwd().equals(pwd)){
				//�û�����������ȷ
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
