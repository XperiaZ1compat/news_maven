package userDao_test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ changeEnableT.class, deletesT.class, getOnePageT.class, loginT.class, registerT.class,
		updateHeadIconT.class, utest.class })
public class AllTests {

}
