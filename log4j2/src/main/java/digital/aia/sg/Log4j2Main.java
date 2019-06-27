package digital.aia.sg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * User  : tamam
 * Date  : 2019-06-27
 * Time  : 03:45
 * Email : tamam.assalimi@gmail.com
 */

public class Log4jMain {

    private static final Logger logger = LogManager.getLogger(Log4jMain.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2");

        // in old days, we need to check the log level log to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/
        // with Java 8, we can do this, no need to check the log level
        while (true)//test rolling file
            logger.debug("hello {}", () -> getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
