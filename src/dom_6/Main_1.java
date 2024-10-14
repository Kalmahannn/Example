package dom_6;

public class Main_1 {
    public static void main(String[] args) {
        Runnable task = () -> {
            ConfigManager config = ConfigManager.getInstance();
            System.out.println("Config instance in thread " + Thread.currentThread().getName() + ": " + config);
        };


        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


