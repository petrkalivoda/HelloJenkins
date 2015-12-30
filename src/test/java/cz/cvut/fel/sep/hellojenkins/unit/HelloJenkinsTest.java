package cz.cvut.fel.sep.hellojenkins.unit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import cz.cvut.fel.sep.hellojenkins.HelloJenkins;

/**
 * Unit test for HelloJenkins
 * 
 * @author Petr Kalivoda
 *
 */
public class HelloJenkinsTest {
	
	@Test
	public void testResult() {
		HelloJenkins j = new HelloJenkins();
		long expected = 6765;
		long actual = j.getFibonacciNum(20);
		
		assertEquals(expected, actual);
	}

}
