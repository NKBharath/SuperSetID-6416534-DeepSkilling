import java.util.*;

public class Main{
    public static void main(String [] args){
        testlogger logger1 = testlogger.getLogged();
        testlogger logger2 = testlogger.getLogged();

        logger1.log("User 1");
        logger2.log("user 2");

        if (logger1==logger2){
            System.out.println("Loggers objects are same, singleton is sucess");
        } else {
            System.out.println("Singleton failed");
        }
    }
}