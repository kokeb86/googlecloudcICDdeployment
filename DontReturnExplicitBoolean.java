package javabestpractice;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DontReturnExplicitBoolean {
	static Logger logger
	= Logger.getLogger(
			DontReturnExplicitBoolean.class.getName());

	public static boolean insteadIsEven(int n) {

		return n % 2 == 0;
	}

	public static void main(String[] args) {
		logger.log(Level.INFO, "This is message 1");

	}

}
