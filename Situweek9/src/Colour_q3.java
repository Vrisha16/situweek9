import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/
        public class Colour_q3 {
        public static void main(String[] args) {
                printColour();
        }

        public static void printColour() {//static method

                ArrayList<String> colors = new ArrayList<>();//create ArraysList to store colours
                //add colours to arraylist
                colors.add("Red");
                colors.add("Purple");
                colors.add("Blue");
                colors.add("White");
                System.out.println("Colors in collection");
                for (String color : colors) {//foreach loop
                        System.out.println(color);
                }
        }
}




