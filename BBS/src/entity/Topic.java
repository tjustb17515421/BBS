package entity;

import java.util.Date;

public class Topic {
	private int topicId;  // Ψһ��־�����id
    private int boardId;  // ���ð���id��������ʾ���������ĸ�����
    private String title;       // ���ӱ���
    private String content; // ��������
    private Date publishTime;   // ����ʱ��
    private Date modifyTime;    // ����ʱ��
    private int uid;      // �����û���id��������ʾ���������ĸ��û������   
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
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
