package модификаторыДоступа;

public class Test {
    private int a =5;
//    int getA(){
//        return a;
//    }
//    void setA(int num){
//        this.a=num;
//    }
    protected int b=6;
    int c=6;
    public int d=7;

}
class TestModiffies{
    public static void main(String[] args) {
    }
    void  method(){
        Test test = new Test();
        System.out.println();
    }
}