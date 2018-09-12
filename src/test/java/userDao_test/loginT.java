package userDao_test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import tools.PageInformation;
import bean.User;
import dao.DatabaseDao;
import dao.UserDao;

import org.junit.BeforeClass;
import org.junit.AfterClass;

import org.junit.Test;


public class loginT {

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
	public void testlogin() throws Exception{
	
		user.setName("admin");
		user.setPassword("admin");
	
		Integer lo=userDao.login(user);
		Integer a=0;
		assertEquals(lo,a);
		
	}
	
		
	}

	
	
	
	
	
	
	
	

