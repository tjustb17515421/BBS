package dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import dao.UserDao;
import entity.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User findUser(String uName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser(int uId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addUser(User user) {
        String sql = "insert into TBL_USER(uname,upass,gender,head,regTime) values(?,?,"+user.getGender()+",?,?)";
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());  //ȡ������ʱ��
        String[] parm = { user.getUName(), user.getUPass(),user.getHead(),time };
        return executeSQL(sql, parm);        // ִ��sql��������Ӱ������

	}

	@Override
	public int updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
