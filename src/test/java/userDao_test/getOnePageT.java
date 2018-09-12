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


public class getOnePageT {

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

	
	
	
	
	
	
	
	

