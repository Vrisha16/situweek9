import java.util.ArrayList;

/*Write a Java program to test an array list is empty or not. Define array list with
        underground tube names*/
        public class Underground_q5 {
    public static void main(String[] args) {
    tube();
    }
    public static void tube(){
        ArrayList<String> tubeNames = new ArrayList<>();// ArraysList of underground tube names
        //tub names to arraylist
        tubeNames.add("District Line");
        tubeNames.add("Central line");
        tubeNames.add("Jubilee line");
        tubeNames.add("Victoria Line");
        System.out.println("original arraylist:"+tubeNames);
        System.out.println("check above arraylist is empty or not!"+tubeNames.isEmpty());
        tubeNames.removeAll(tubeNames);
        System.out.println("Array list after remove all elements"+tubeNames);
        System.out.println("checking above array list empty or not!"+tubeNames.isEmpty());



    }


}
