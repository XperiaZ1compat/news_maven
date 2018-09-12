package userDao_test;

import static org.junit.Assert.*;

import bean.User;
import dao.DatabaseDao;
import dao.UserDao;

import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.junit.Test;


public class registerT {

	static protected UserDao userDao;
	static protected User user;
	static protected DatabaseDao databaseDao;
	
	@BeforeClass
	static public void beforeClass() throws Exception{
		userDao=new UserDao();
		user=new User();
		databaseDao=new DatabaseDao();
		
	}

	@AfterClass
	static public void AfterClass() throws Exception{
		databaseDao.close();
		
	}
	
	
	
	@Test
	public void testregister() throws Exception{
		user.setType("user");
		user.setName("dmin");
		user.setPassword("dmin");
		user.setEnable("use");
		Integer lo=userDao.register(user,databaseDao);
		Integer a=1;
		assertEquals(lo,a);
		
	}
	}

	
	
	
	
	
	
	
	

