package entity;

import java.util.Date;

public class Reply {
	 private int replyId;  // Ψһ��־�ظ���id
	 private int topicId;  // ���������id��������ʾ�ûظ����ĸ������
	 private String title;       // ���ӱ���
	 private String content; // ��������
	 private Date publishTime;   // ����ʱ��
	 private Date modifyTime;    // ����ʱ��
	 private int uid;      // �����û���id��������ʾ���������ĸ��û������ 
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	 
}
