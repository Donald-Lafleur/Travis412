package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		long check = a * b;
		int ret = a * b;
		if(check != ret) {
			if(check > 0) {
				throw new ArithmeticException("Integer Overflow Detected");
			} else {
				throw new ArithmeticException("Integer Underflow Detected");
			}
		}
		return ret;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
}
