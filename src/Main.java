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
        int choice=0;
        while(choice!=4){
        System.out.println("Welcome To Campus Connect");
        System.out.println("Press:\n 1 To search by department \n 2 To search by name \n 3 To search by subject \n 4 To exit ");
        choice=sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1: 
                System.out.println("Enter the department:");
                String input1=sc.nextLine();
                for (Faculty f : facultyList) {
                    if(input1.equals(f.department)){
                        f.display();
                        System.out.println("\n");
                        out=true;
                    }
                }
                if(out==false)
                    System.out.println("No results found");
                break;
            case 2:
                System.out.println("Enter the teacher's name:");
                String input2=sc.nextLine();
                out=false;
                for(Faculty f:facultyList){
                     if(f.name.toLowerCase().startsWith(input2)){
                        f.display();
                        System.out.println("\n");
                        out=true;  
                    }
                 }
                if(out==false)
                     System.out.println("No results found");
                break;
            case 3:
                System.out.println("Enter the teacher's name:");
                String input3=sc.nextLine();
                out=false;
                for(Faculty f:facultyList){
                     if(f.subject.toLowerCase().startsWith(input3)){
                        f.display();
                        System.out.println("\n");
                        out=true;  
                    }
                 }
                if(out==false)
                     System.out.println("No results found");
                break;
            case 4:
                System.out.println("EXIT");
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
        }
    }
    
}
