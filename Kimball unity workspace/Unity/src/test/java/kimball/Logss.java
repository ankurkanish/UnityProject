package kimball;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logss {
	private static Logger log =LogManager.getLogger(Logss.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.error("Test failed");
		log.info("Test complete");
	}

}
