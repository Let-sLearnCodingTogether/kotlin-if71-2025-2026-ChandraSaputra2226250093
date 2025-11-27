package Interoperability;

public class CallKotlinCodeFromJava {
    public static void main(String[] args){
        System.out.println("Hello from java");

//        TYPE_DATA NAMA_VARIABLE = NEW NAMA_CLASS
        CounterExampleKotlin counter1 = new CounterExampleKotlin();
        System.out.println(counter1.getNumber());
        counter1.increment();
        System.out.println(counter1.getNumber());

        //class stringUtils
        System.out.println(StringUtilsKt.isEmail("test.@gmail.com"));

        //class Logger
        Logger logger = new Logger();
        logger.log("Aplikasi dimulai", "DEBUG");
        logger.log("Aplikasi dimulai");

        //class database
        String dbUrl = Database.Companion.getConnectionUrl();
        String dbUrl2 = Database.getConnectionUrl();
        System.out.println(dbUrl);
        System.out.println(dbUrl2);
    }
}
