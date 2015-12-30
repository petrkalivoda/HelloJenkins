package cz.cvut.fel.sep.hellojenkins;

/**
 * Sample class for Jenkins homework
 * 
 * @author Petr Kalivoda
 *
 */
public class HelloJenkins {

	/**
	 * Returns fibonnaci number for n-th member of series
	 * 
	 * @param n
	 * @return
	 * @throws IllegalArgumentException
	 */
	public long getFibonacciNum(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0 || n == 1) {
			return n;
		}
		return getFibonacciNum(n - 1) + getFibonacciNum(n - 2);
	}
}
