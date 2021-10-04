public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("group");
        final MyThread thread1 = new MyThread(group, "Thread1");
        final MyThread thread2 = new MyThread(group,"Tread2");
        final MyThread thread3 = new MyThread(group, "Thread3");
        final MyThread thread4 = new MyThread(group,"Thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(15000);
        group.interrupt();

    }






}
