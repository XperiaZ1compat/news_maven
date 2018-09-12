package uinfoDao_test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import bean.User;
import bean.Userinformation;
import dao.UserinformationDao;
import org.junit.AfterClass;
import dao.DatabaseDao;

public class hasUserId {
	
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
	public void testhasUserId() throws Exception{
		
		boolean i=uinfoDao.hasUserId(new Integer(30), databaseDao);
		assertTrue(i);
	}
	

	
	
	
	
	
	
}
