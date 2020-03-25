package Hello_World_ESII;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/**
 * Unit test for HelloWorld.
 */

public class HelloWorldTest extends TestCase{
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		HelloWorld testApp;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testSquare() {
		HelloWorld test=new HelloWorld();
		int output=test.square(5);
		assertEquals(25, output);
	}

	@Test
	//@Disabled
	@DisplayName("Compare strings")
	void testCompString() {
		HelloWorld test=new HelloWorld();
		int output=test.compString("string","string");
		assertEquals(0, output);
	}

	@Test
	void testCountA() {
		HelloWorld test=new HelloWorld();
		int output=test.countA("até afuncionou.");
		assertEquals(2, output);
	}
    
	
}
