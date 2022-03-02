import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/*
   I am application Developer wants to use math library
   which is developed by some other company and uses
   different logging library. As a application developer
   i am using different logging library.


 */
public class Application {


    public static void main(String[] args) {
        //Creating the Logger object
        BasicConfigurator.configure();
        final  Logger logger = Logger.getLogger(Application.class);
       // Logger logger = LoggerFactory.getLogger("SampleLogger");

        //Logging the information
        logger.info("Hi This is my first Logging  program using log4j1.2" );
      //  MathLibrary ML = new MathLibrary();
       // int result = ML.Add(10,15);
       // logger.info("The addition of two values are " + result );


      ////  UILibrary ui = new UILibrary();
      //  ui.ThreeDView(12,45,67);
    }
}

