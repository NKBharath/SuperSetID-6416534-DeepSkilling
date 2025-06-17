public class testlogger{
    private static volatile testlogger logged;
    private testlogger(){
        System.out.println("Instance created");
    }
    public static testlogger getLogged(){
        testlogger result = logged;
        if (result == null){
            synchronized (testlogger.class){
                result = logged;
                if(result==null) {
                    logged = result = new testlogger();
                }
            }
        }
        return result;
    }
    public void log(String message){
        System.out.println("Logged in "+ message);
    }
}