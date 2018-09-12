package uService_Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import bean.User;
import bean.Userinformation;
import service.UserService;
import tools.PageInformation;

public class changePasswordST {

	

	static protected UserService us;
	static protected User user;
	@BeforeClass
	static public void BeforeClass()throws Exception{
		
		us=new UserService();
		user=new User();
	}
	
	
	
	
	@Test
	public void testchangePassword() throws Exception{
		
		user.setUserId(new Integer(30));
		Integer i=us.changePassword(user,"123456");
		assertEquals(i,new Integer(-1));
	}

}
