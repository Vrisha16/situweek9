import java.util.ArrayList;
import java.util.List;

/* Declare global variables of your name, Add all your group names in list, using
        for each loop iterate and print ONLY your name.*/
        public class Names_q11 {
        static String myName = "Situ";//global variable.

    public static void main(String[] args) {//main method.
        List<String> groupNames = new ArrayList<>();
        // Add group names in list.
        groupNames.add("Meet");
        groupNames.add("Vidhi");
        groupNames.add("Hiral");
        groupNames.add("Dhaval");
        groupNames.add("myName");
        System.out.println("Group Names:");// for each loop
        for (String name:groupNames){
            if (name.equals(myName)){
                System.out.println(name);
            }
        }


    }
}
