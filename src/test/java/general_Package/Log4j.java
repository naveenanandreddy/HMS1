package general_Package;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4j {
	Logger log = Logger.getLogger(Log4j.class);
  @Test
  public void f() {
	  log.debug("DEbug msg");
	  log.info("Information -- pass");
	  log.warn("warning");
	  log.error("Error msg");
	  log.fatal("fatal");
	  
	  
  }
}
