package java8;

public class ФункциональныеИнтерфейсы {
    public static void main(String[] args) {
        MyPredicate<Integer>predicate=x -> System.out.println(x);
        predicate.apply(5);
    }
    interface MyPredicate<T>{
        void apply(T t);
      }

    }
    //Predicate<Integer> predicate = x->x>5; -передаем вх параметр интеджер а  на выход булеан
    //Consumer<Integer>consumer = x->sout(x) -тоже 1 входной параметр но выходных параметров нет void
    //Function<Integer,String>function=x->x.toString(); public static void main(String[] args) {
   //       Supplier<Integer>supplier=()->new Integer(6);-0 параметров на вход
  //       UnaryOperator<Integer>unaryOperator=x->x*x;
  //       BinaryOperator<Integer>binaryOperator=(x,y)->x*y;

