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


public class deletesT {

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
	public void testdeletes() throws Exception{
		
		assertEquals(userDao.deletes("26", databaseDao),new Integer(1));
		
	}

	
	}

	
	
	
	
	
	
	
	

