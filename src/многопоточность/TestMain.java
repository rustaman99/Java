package многопоточность;

public class TestMain {
    public static void main(String[] args)throws Exception{
//        MyThread1 myThread1 = new MyThread1();
//        MyThread1 myThread2 = new MyThread1();
//        myThread1.start();
        new MyThread1().start();
        new MyThread1().start();
        new MyThread1().start();

    }
}
class  MyThread1 extends Thread{
    @Override
  synchronized   public void run(){
        for(int i=0;i<400;i++){
            System.out.println("Thread name is - " + Thread.currentThread().getName() + " i = " +i);
        }
     }
}