package entity;

import java.util.Date;

public class Reply {
	 private int replyId;  // 唯一标志回复的id
	 private int topicId;  // 引用主题的id，用来表示该回复是哪个主题的
	 private String title;       // 帖子标题
	 private String content; // 帖子内容
	 private Date publishTime;   // 发表时间
	 private Date modifyTime;    // 发表时间
	 private int uid;      // 引用用户的id，用来表示该帖子是哪个用户发表的 
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
