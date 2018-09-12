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


public class utest {

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
	public void testhasUser() throws Exception{
		
		user.setName("admin");
		boolean has=userDao.hasUser(user, databaseDao);
		assertTrue(has);
		
	}/*
	
	@Test
	public void testregister() throws Exception{
		user.setType("manager");
		user.setName("dmin");
		user.setPassword("dmin");
		user.setEnable("use");
		Integer lo=userDao.register(user,databaseDao);
		Integer a=1;
		assertEquals(lo,a);
		
	}*/

	@Test
	public void testlogin() throws Exception{
	
		user.setName("admin");
		user.setPassword("admin");
	
		Integer lo=userDao.login(user);
		Integer a=0;
		assertEquals(lo,a);
		
	}
	
	@Test
	public void testchangeEnable() throws Exception{
		
		Integer lo=userDao.changeEnable("27", databaseDao);
		Integer a=1;
		assertEquals(lo,a);
		
	}
	
	@Test
	public void testdeletes() throws Exception{
		
		assertEquals(userDao.deletes("26", databaseDao),new Integer(1));
		
	}
	
	@Test
	
	public void testupdateHeadIcon() throws Exception{
		user.setUserId(27);
		user.setHeadIconUrl("/news/upload/images/headIcon/0.jpg");
		Integer lo=userDao.updateHeadIcon(user, databaseDao);
		Integer a=1;
		assertEquals(lo,a);
		
	}
	
	@Test
	public void testgetOnePage() throws Exception{
		
		PageInformation pa=new PageInformation();
		pa.setTableName("user");
		pa.setPageSize(4);
		pa.setPage(2);
		//pa.setSearchSql("enable ='stop'");
		pa.setSearchSql("");
		List<User> u=new ArrayList<User>();
		u=userDao.getOnePage(pa,databaseDao);
		
		assertNotNull(u);
		}	
	}

	
	
	
	
	
	
	
	

