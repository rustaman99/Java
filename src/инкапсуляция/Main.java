package инкапсуляция;//Представление класса в виде черного ящика,мы не знаем что там хранится,как он работает из чего он состоит,но у нас есть публичнве методы которые мы можем использовать

public class Main {
    public static void main(String[] args) {
Person person = new Person();
        System.out.println(person.getName());
        System.out.println(person.getRr());

    }
}
