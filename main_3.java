package lesson_11;

import java.lang.foreign.SymbolLookup;
import java.util.ArrayList;
public class main_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        
        numbers.add(25);
        numbers.add(30);
        numbers.add(58);

        System.out.println(numbers);

        numbers.clear();
        System.out.println("empty arry is "+ numbers);

        if (numbers.isEmpty()) {
            System.out.println("Array is empty");
        
        }
       else{
            System.out.println("Array is not empty");
        }

        numbers.add(25);
        numbers.add(30);
        numbers.add(58);

            System.out.println("the size of the arry is" + numbers.size());
            System.out.println("the size of the arry is" + numbers.add(11));
            System.out.println(numbers);

            numbers.remove(2);
            System.out.println(numbers);
    }
}

