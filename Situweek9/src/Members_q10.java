/*Write program and add all group members names in to array and iterates
through for each loop and print your name.*/
public class Members_q10 {
    public static void main(String[] args) {//array to store group members names
        String[] members = {"Hiral","Vidhi","Meet","Dhawal","Situ"};//for each loops
        System.out.println("Group Members:");
        for (String member : members){
            System.out.println(member);
        }
        String myName = "Situ";//specific name in array
        System.out.println("My Name:"+myName);

    }

}
