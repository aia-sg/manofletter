package digital.aia.sg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User  : tamam
 * Date  : 2019-06-27
 * Time  : 03:17
 * Email : tamam.assalimi@gmail.com
 */
public class LogbackMainError {

    private static final Logger logger = LoggerFactory.getLogger(LogbackMainError.class);

    public static void main(String[] args) {
        try {
            getData();
        } catch (IllegalArgumentException e) {
            logger.error("message error ", e);
        }
    }

    static int getData() throws IllegalArgumentException {
        throw new IllegalArgumentException("Sorry IllegalArgumentException!");
    }
}
