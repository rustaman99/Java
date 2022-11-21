package классы;

import датаВремяДжава.Main;

public class InnerMain {
    int i=5;
    public static void main(String[] args)throws Exception {
        InnerMain main=new InnerMain();
        main.method();
    }
    void method(){
        Inner inner = new Inner();
        inner.method();
    }
    class Inner{
        int k=6;
        void method(){
            System.out.println(i);
        }
    }
}
