package entity;

public class Board {
	 private int    boardId;      // 用来唯一标识版块
	 private String boardName;  // 版块名称
	 private int    parentId;      // 主版块id
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String toString() {
		return this.boardId + "\t" + this.boardName + "\t" + this.parentId;
	}
}
