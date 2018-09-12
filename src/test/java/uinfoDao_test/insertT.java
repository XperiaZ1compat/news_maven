package uinfoDao_test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import bean.User;
import bean.Userinformation;
import dao.UserinformationDao;
import org.junit.AfterClass;
import dao.DatabaseDao;

public class insertT {
	
	static protected UserinformationDao uinfoDao;
	static protected User user;
	static protected Userinformation uinfo;
	static protected DatabaseDao databaseDao;
	
	@BeforeClass
	public static void BeforeClass() throws Exception {
		
		uinfoDao=new UserinformationDao();
		user=new User();
		uinfo=new Userinformation();
		databaseDao =new DatabaseDao();
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		databaseDao.close();
	
	}
	
	

	
	@Test
	public void testinsert() throws Exception{
		uinfo.setHobby("羽毛球");
		uinfo.setSex("男");
		uinfo.setUserId(new Integer(29));
		Integer i=uinfoDao.insert(uinfo, databaseDao);
		assertEquals(i,new Integer(1));
	}
	

	
	
	
	
	
}
