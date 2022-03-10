//import org.apache.logging.log4j.
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;

/*
   I am application Developer wants to use math library
   which is developed by some other company and uses
   different logging library. As a application developer
   i am using different logging library.


 */
public class Application {


    public static void main(String[] args) {
        //Creating the Logger object
       // BasicConfigurator.configure();
        Configurator.initialize(null,"E:\\Testing_code\\logging_Examples\\src\\main\\resources\\log4j2.xml");

        final  Logger logger =  LogManager.getLogger(Application.class);
       // Logger logger = LoggerFactory.getLogger("SampleLogger");

        //Logging the information
        logger.info("Hi This is my first Logging  program using log4j 2.x" );
        MathLibrary ML = new MathLibrary();
       int result = ML.Add(10,15);
       logger.info("The addition of two values are " + result );


        UILibrary ui = new UILibrary();
       ui.ThreeDView(12,45,67);
    }
}

