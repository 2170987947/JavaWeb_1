package lession9;

public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] t = new Thread[10];
        for (int i = 0; i < 10; i++) {
            int k = i;
            t[i] = new Thread() {
                @Override
                public void run() {
                    System.out.println(k);
                }
            };
        }
        for (int i = 0; i < 10; i++) {
            t[i].start();
            t[i].join();
        }
        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        System.out.println("main");
    }
}
