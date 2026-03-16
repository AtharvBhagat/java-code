package lesson_11;

import java.lang.foreign.SymbolLookup;
import java.util.ArrayList;
public class main_2 {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Monkey");

        System.out.println(animals);

        animals.clear();
        System.out.println("empty arry is "+ animals);

        if (animals.isEmpty()) {
            System.out.println("Array is empty");
        
        }
       else{
            System.out.println("Array is not empty");
        }

        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Monkey");

            System.out.println("the size of the arry is" + animals.size());
            System.out.println("the size of the arry is" + animals.add("dog"));
            System.out.println(animals);

            animals.remove(2);
            System.out.println(animals);
    }
}
