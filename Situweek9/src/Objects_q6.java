import java.util.HashSet;
import java.util.Set;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
        Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
        and if else)*/
        public class Objects_q6 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();//Hashset to integer object
        //add numbers to set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        System.out.println("Numbers between 1 and 10 in set:");
        for (int i=1; i<=10;i++) {//for loops
            if (numbers.contains(i)) {
                System.out.println(i);
            }

        }
    }

}
