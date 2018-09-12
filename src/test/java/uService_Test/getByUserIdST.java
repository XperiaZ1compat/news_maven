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

public class getByUserIdST {

	static protected Userinformation uinfo;
	static protected UserService us;

	@BeforeClass
	static public void BeforeClass()throws Exception{
		uinfo=new Userinformation();
		us=new UserService();
	}
	
	
	
	
	@Test
	public void testgetByUserId() throws Exception{
		
		uinfo=us.getByUserId(new Integer(27));
		assertNotNull(uinfo);
	}

}
