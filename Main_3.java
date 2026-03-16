package lesson_4;


class Counter_1{
    int number=30;
    void increment(){
        number=number + 70;
    }
}

public class Main_3 {
    public static void main(String[] args) {
        Counter_1 obj1=new Counter_1();
        Counter_1 obj2=new Counter_1();
        Counter_1 obj3=new Counter_1();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        System.out.println(obj1.number);
        System.out.println(obj2.number);
        System.out.println(obj3.number);
    }
}
