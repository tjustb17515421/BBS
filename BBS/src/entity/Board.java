package entity;

public class Board {
	 private int    boardId;      // ����Ψһ��ʶ���
	 private String boardName;  // �������
	 private int    parentId;      // �����id
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
