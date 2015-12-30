package cz.cvut.fel.sep.hellojenkins.smoke;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import cz.cvut.fel.sep.hellojenkins.HelloJenkins;

/**
 * Smoke test for cz.cvut.fel.sep.hellojenkins.HelloJenkins
 * @author Petr Kalivoda
 *
 */
public class HelloJenkinsTest {
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void testBadArgument() {
		thrown.expect(IllegalArgumentException.class);
		HelloJenkins j = new HelloJenkins();
		j.getFibonacciNum(-1);
	}
	
	@Test
	public void testGoodArgument() {
		HelloJenkins j = new HelloJenkins();
		j.getFibonacciNum(0);
	}
}
