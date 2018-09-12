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

public class deletesST {

	static protected PageInformation pa;

	static protected UserService us;
	static protected List<User> users;
	@BeforeClass
	static public void BeforeClass()throws Exception{
		pa=new PageInformation();
		us=new UserService();
		users=new ArrayList<User>();
	}
	
	
	
	
	@Test
	public void testgetOnePage() throws Exception{
		pa.setIds("31");
		pa.setTableName("user");
		pa.setPageSize(4);
		pa.setPage(2);
		//pa.setSearchSql("enable ='stop'");
		pa.setSearchSql("");
		users=us.deletes(pa);
		assertNotNull(users);
	}

}
