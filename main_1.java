package lesson_9;

interface Vehicle {

    void chang_gear(int a);
    void speedup(int a);
    void apply_brakes(int a);
}

class Bike implements Vehicle{
    int speed;
    int gear;

    @Override

    public void chang_gear(int newgear){
        gear=newgear;
    }

    @Override

    public void speedup(int increment){
        gear=speed + increment;
    }

    @Override

    public void apply_brakes(int decrement){
        gear=speed - decrement;
    }

    public void printstate(){
        System.out.println("speed is : " + speed + " gear is : " + gear);
    }

}

class Car implements Vehicle{
    int speed;
    int gear;

    @Override

    public void chang_gear(int newgear){
        gear=newgear;
    }

    @Override

    public void speedup(int increment){
        gear=speed + increment;
    }

    @Override

    public void apply_brakes(int decrement){
        gear=speed - decrement;
    }

    public void printstate(){
        System.out.println("speed is : " + speed + " gear is : " + gear);
    }

}

public class main_1 {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.chang_gear(2);
        bike.speedup(3);
        bike.apply_brakes(1);

        System.out.println("Bike's present state");
        bike.printstate();


        Car car=new Car();
        car.chang_gear(2);
        car.speedup(3);
        car.apply_brakes(1);

        System.out.println("Car's present state");
        car.printstate();
    }
}
