import java.util.ArrayList;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in an array list using
        Iterator.*/
        public class program_q4 {
        public static void main(String[] args) {//main method
    Jai();
        }
        public static void Jai(){//static method
            ArrayList<Integer> numbers = new ArrayList<>();//
         numbers.add(10);
         numbers.add(15);
         numbers.add(20);
         numbers.add(25);
         Iterator<Integer> iterator = numbers.iterator();
         System.out.println("numbers in elements");
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }



        }


}
