package lesson_7;



class Mammals{
    void mm(){
        System.out.println("inside mammals class");
    }
}

class Lion extends Mammals{

    void roar(){
        System.out.println("the lion roar loudly ........ this lion class");

    }
}


class Human extends Mammals{

    void hum(){
        System.out.println("inside human class");

    }
}


public class maintest {
    public static void main(String[] args) {
        Lion obj=new Lion();
        obj.roar();
        obj.mm();
    }
}
