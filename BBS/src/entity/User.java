package entity;

import java.util.Date;

public class User {
	private int    uId;       // 用来唯一标识用户
    private String uName;  // 用户名
    private String uPass;  // 用户密码
    private int    gender;      // 性别,1是女，2是男
    private String  head;      // 头像，地址形式
    private Date  regTime;      // 注册时间
	public int getUId() {
		return uId;
	}
	public void setUId(int id) {
		uId = id;
	}
	public String getUName() {
		return uName;
	}
	public void setUName(String name) {
		uName = name;
	}
	public String getUPass() {
		return uPass;
	}
	public void setUPass(String pass) {
		uPass = pass;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public String toString() {
		char sex = gender==1 ? '女':'男';     // 判断性别
		return this.uId + "\t" + this.uName + "\t" + this.uPass + "\t"
		+ sex + "\t" + this.head + "\t" + this.regTime;
	}
}
