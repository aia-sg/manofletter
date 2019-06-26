package digital.aia.sg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User  : tamam
 * Date  : 2019-06-27
 * Time  : 03:17
 * Email : tamam.assalimi@gmail.com
 */

public class LogbackMain {

    private static final Logger logger = LoggerFactory.getLogger(LogbackMain.class);

    public static void main(String[] args) {

        logger.debug("Hello from Logback");
        //while (true)//test rotate file
        logger.info("getNumber() : {}", getNumber());
    }

    static int getNumber() {
        return 5;
    }
}
