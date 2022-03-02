import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathLibrary {

    private static Logger LOGGER = LoggerFactory.getLogger(MathLibrary.class);


       public  Integer Add(int arg1 , int arg2) {
   //  public static void main(String[] args) {

            LOGGER.info("Hi, Welcome to Simple Logging Technique");
            LOGGER.info("The argument -1 is " + arg1);
            LOGGER.info("The argument -1 is " + arg2);
             return arg1 + arg2;
        }

    }

