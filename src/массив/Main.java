package массив;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        try {
            System.out.println(arr[3]);
        }catch (Exception e){
            System.err.println("Index 3 out of bounds for length 3");
        }finally {
            System.out.println("Stop");
        }
        int[] ar=new int[10];
        ar[0]=5;
        ar[1]=15;
        ar[2]=25;
        System.out.println(ar[2]);
    }
}
