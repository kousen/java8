package nfjs.lambdas;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("hello");

        Thread t = new Thread(r);
        t.start();
    }
}
