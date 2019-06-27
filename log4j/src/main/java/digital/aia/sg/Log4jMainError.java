package digital.aia.sg;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * User  : tamam
 * Date  : 2019-06-27
 * Time  : 03:49
 * Email : tamam.assalimi@gmail.com
 */

public class Log4jMainError {

    private static final Logger logger = LogManager.getLogger(Log4jMainError.class);

    public static void main(String[] args) {
        try {
            System.out.println(getData());
        } catch (IllegalArgumentException e) {
            logger.error("{}", e);
        }
    }

    static int getData() throws IllegalArgumentException {
        throw new IllegalArgumentException("Sorry IllegalArgumentException!");
    }

}
