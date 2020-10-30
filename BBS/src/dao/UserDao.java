package dao;

import entity.User;

public interface UserDao {
	public static final int FEMALE = 1;   // ����Ů��
    public static final int MALE = 2;     // ��������

    public User findUser(String uName);
    public User findUser(int uId);
    public int addUser(User user);
    public int updateUser(User user) throws Exception;
}

