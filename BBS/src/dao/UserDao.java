package dao;

import entity.User;

public interface UserDao {
	public static final int FEMALE = 1;   // 代表女性
    public static final int MALE = 2;     // 代表男性

    public User findUser(String uName);
    public User findUser(int uId);
    public int addUser(User user);
    public int updateUser(User user) throws Exception;
}

