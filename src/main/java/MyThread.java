public class MyThread extends Thread {

    public MyThread(ThreadGroup group, String thread1) {
        super(group, thread1);
    }

    @Override
    public void run(){
        try{
            while(!isInterrupted()){
                Thread.sleep(2500);
                System.out.println("Hello, I'm " + getName() + " thread");
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s ended\n", getName());
        }
    }

}
