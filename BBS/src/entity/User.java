package entity;

import java.util.Date;

public class User {
	private int    uId;       // ����Ψһ��ʶ�û�
    private String uName;  // �û���
    private String uPass;  // �û�����
    private int    gender;      // �Ա�,1��Ů��2����
    private String  head;      // ͷ�񣬵�ַ��ʽ
    private Date  regTime;      // ע��ʱ��
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
		char sex = gender==1 ? 'Ů':'��';     // �ж��Ա�
		return this.uId + "\t" + this.uName + "\t" + this.uPass + "\t"
		+ sex + "\t" + this.head + "\t" + this.regTime;
	}
}
