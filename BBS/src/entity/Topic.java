package entity;

import java.util.Date;

public class Topic {
	private int topicId;  // 唯一标志主题的id
    private int boardId;  // 引用板块的id，用来表示该帖子是哪个板块的
    private String title;       // 帖子标题
    private String content; // 帖子内容
    private Date publishTime;   // 发表时间
    private Date modifyTime;    // 发表时间
    private int uid;      // 引用用户的id，用来表示该帖子是哪个用户发表的   
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
