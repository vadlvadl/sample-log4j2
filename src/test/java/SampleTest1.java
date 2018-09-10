import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class SampleTest1 {

    private static final Logger LOGGER =
            LogManager.getLogger(SampleTest1.class.getName());

    @Test
    public void TestCase1() {
        LOGGER.debug("Some Test - debug message");
        LOGGER.info("Some Test - info message");
        LOGGER.error("Some Test - error message");
    }

    @Test
    public void TestCase2() {
        LOGGER.info(SampleTest1.class.getCanonicalName());
        LOGGER.fatal("TestCase2 - Fatal message");
    }
}
