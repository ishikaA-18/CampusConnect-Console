import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean out=false;
        ArrayList<Faculty> facultyList = new ArrayList<>();

        facultyList.add(new Faculty("Sandip Saha Chowdhury", "EE","B Block(2nd Floor)","HOD","Control Systems"));
        facultyList.add(new Faculty("Abhinaba Dutta", "EE","B Block(2nd Floor Staffroom)","CC","MicroProcessor and DSP")); 
        facultyList.add(new Faculty("Debjani Bhattacharya","EE","B Block(2nd Floor Staffroom)","Assistant Professor","EMFT and Power System"));
        facultyList.add(new Faculty("Debasis Sur","EE","B Block(2nd Floor Staffroom)","Assistant Professor","Electric and Hybrid Vehicle"));
        facultyList.add(new Faculty("Bamdeb Banerjee","EE","B Block(2nd Floor Staffroom)","Assistant Professor","Electrical Machines"));
        System.out.println("Enter the department:");
        String input=sc.nextLine();
        for (Faculty f : facultyList) {
            if(input.equals(f.department)){
            f.display();
            System.out.println("\n");
            out=true;
            }
        }
        if(out==false)
            System.out.println("No results found");
    }
    
}
