import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingTest {

    private static final Logger LOGGER =
            LogManager.getLogger(LoggingTest.class.getName());

    @Test
    public void generateLogTest() {
        LOGGER.debug("Some Test - debug message");
        LOGGER.info("Some Test - info message");
        LOGGER.error("Some Test - error message");
    }

}
