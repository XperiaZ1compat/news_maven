package uService_Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ changePasswordST.class, checkST.class, deletesST.class, getByUserIdST.class, getonepageST.class,
		loginST.class, registerST.class })
public class AllTests {

}
