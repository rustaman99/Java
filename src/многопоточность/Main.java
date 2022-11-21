package многопоточность;

public class Main {
    public static void main(String[] args) throws Exception {
     MyThread myThread=new MyThread();
     myThread.start();
        System.out.println(Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2=new Thread(myRunnable);
        thread2.start();

    }
}
class MyThread extends  Thread{  //1   способ созадния многопоточности
    @Override
    public void run(){
        System.out.println("this my thread");
        someMethod();
    }
    private  void someMethod(){
        throw new RuntimeException();
    }
}
class MyRunnable implements Runnable{ //2 вариант использование многопоточности
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());


    }

}
