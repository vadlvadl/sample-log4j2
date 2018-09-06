import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class SampleTest1 {

    private static final Logger LOGGER =
            LogManager.getLogger(SomeTest.class.getName());

    @Test
    public void TestCase1() {
//        System.out.println("TestCase1"); }
        LOGGER.debug("Some Test - debug message");
        LOGGER.info("Some Test - info message");
        LOGGER.error("Some Test - error message");
    }

    @Test
    public void TestCase2() {
        LOGGER.trace(SomeTest.class.getCanonicalName());
        LOGGER.fatal("TestCase2 - Fatal message");
    }
}
