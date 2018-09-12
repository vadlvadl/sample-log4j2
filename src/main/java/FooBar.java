import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FooBar {

    private static Logger LOGGER = LogManager.getLogger(FooBar.class.getName());

    public boolean toDo(){
        LOGGER.debug("fooBar DEBUG string");
        return false;
    }
}
