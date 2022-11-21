package многопоточность;

public class СинхронизацияПотоков {
    public static void main(String[] args) throws InterruptedException {
        //join -метод, который может быть использован для того, чтобы приостановить выполнение текущего потока до тех пор, пока другой поток не закончит свое выполнение.
        Resource resource=new Resource();
        MyThread2 myThread2 =new MyThread2();
        MyThread2 myThread3 =new MyThread2();
        resource.i=5;
        myThread2.setResource(resource);
        myThread3.setResource(resource);
        myThread2.start();
        myThread3.start();
        myThread2.join();
        myThread3.join();
        System.out.println(resource.i);
    }
}
class MyThread2 extends Thread{
    Resource resource;
    public void setResource(Resource resource) {
        this.resource = resource;
    }


    @Override
    public void run(){
        resource.change();
        }
        }
class Resource{
    int i;
    public void change(){
        int i =this.i;
        i++;
        this.i=i;
    }
}