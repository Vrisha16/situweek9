import java.util.HashMap;
import java.util.Map;

/*Create a HashMap object called people that will store String keys and Integer
        values: And use for each loop to iterate the value from Map.*/
        public class People_q7 {
        public static void main(String[] args) {
         name();
        }
       public static void name(){//static method
               Map<String, Integer> people = new HashMap<>();//Hashmap to store String keys and integer values
               people.put("Nish",20);
               people.put("Jai",14);
               people.put("Vrisha",7);
               people.put("Jay",5);
               System.out.println("Values in the HashMap");//foreach loop
               for(Integer value : people.values()){
                       System.out.println(value);
               }


       }

}
