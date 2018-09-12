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

public class registerST {

	static protected User user;
	static protected Userinformation uinfo;
	static protected UserService us;
	@BeforeClass
	static public void BeforeClass()throws Exception{
		user=new User();
		uinfo=new Userinformation();
		us=new UserService();
	}
	
	
	
	
	@Test
	public void testregister() throws Exception{
		user.setType("user");
		user.setName("dmin");
		user.setPassword("dmin");
		user.setEnable("use");
		Integer i=us.register(user);
		assertEquals(i,new Integer(1));
	}

}
