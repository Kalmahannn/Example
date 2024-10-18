package labka_5;
//Бұл мысал Singleton үлгісін қолданатын ағынды қауіпсіз тіркеушінің орындалуын көрсетеді.
// Тіркеуші журнал жүргізу деңгейлерін қолдайды, бір данаға жаһандық қатынасты қамтамасыз етеді
// және көп ағынды ортада қауіпсіз пайдалануға болады.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.setLogFilePath("app.log");
        logger.setLogLevel(LogLevel.INFO);


        ExecutorService executorService = Executors.newFixedThreadPool(3);


        Runnable task1 = () -> {
            logger.log("Это информационное сообщение.", LogLevel.INFO);
        };

        Runnable task2 = () -> {
            logger.log("Это предупреждение.", LogLevel.WARNING);
        };

        Runnable task3 = () -> {
            logger.log("Это сообщение об ошибке.", LogLevel.ERROR);
        };


        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);


        executorService.shutdown();


        logger.readLogs();
    }
}

