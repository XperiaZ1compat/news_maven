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


public class updateHeadIconT {

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
	
	public void testupdateHeadIcon() throws Exception{
		user.setUserId(27);
		user.setHeadIconUrl("/news/upload/images/headIcon/0.jpg");
		Integer lo=userDao.updateHeadIcon(user, databaseDao);
		Integer a=1;
		assertEquals(lo,a);
		
	}
	
	
	}

	
	
	
	
	
	
	
	

