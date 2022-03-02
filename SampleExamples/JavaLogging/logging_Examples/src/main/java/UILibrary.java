import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UILibrary {
        private static Log log = LogFactory.getLog(UILibrary.class);
        public static void ThreeDView(int x, int y , int  z) {
        log.info("This program is using jcl");
        log.info("UI Changes are incorporated");
        log.error("Three D Design View");
        log.info("The Three D Axis Values are X = " + x);
        log.info("The Three D Axis Values are Y = " + y);
        log.info("The Three D Axis Values are Z = " + z);


        }
}


