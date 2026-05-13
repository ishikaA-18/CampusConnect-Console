import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Faculty> facultyList = new ArrayList<>();
        boolean out=false;
        try{
            File file=new File("data.csv");
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line=fileScanner.nextLine();
                String[] parts=line.split(",");
                facultyList.add(new Faculty(parts[0],parts[1],parts[2],parts[3],parts[4]));
            }
        }
        catch(Exception e){
            System.out.println("File not found");
        }
        int user_input=0;

        while(user_input!=3){
            System.out.println("Welcome To Campus Connect");
            System.out.println("Who is using it? \n Press 1 for student mode \n Press 2 for admin mode.\n Press 3 to exit.");
            user_input=sc.nextInt();
            sc.nextLine();
            switch(user_input){
                case 1:
                    System.out.println("Student Mode Activated!!");
                    System.out.println("Welcome Student!!\nPress:\n 1 To search by department \n 2 To search by name \n 3 To search by subject \n 4 To exit ");
                    int choice=sc.nextInt();
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
                            System.out.println("Student Mode Deactivated..");
                            break;
                        default:
                            System.out.println("Wrong Choice");
                            break;
                    }
                break;
                case 2:
                    System.out.println("Admin Mode Activated!!");
                    String password="AOT169";
                    System.out.println("Enter the password");
                    String password_input=sc.nextLine();
                    if(password_input.equals(password)){
                        System.out.println("Welcome Admin!\nTo Proceed further enter your choice-\nPress 1 to add a new teacher.\nPress 2 to delete a teacher.\nPress 3 to update teacher logic\nPress 4 to exit admin mode.");
                        int admin_input=sc.nextInt();
                        sc.nextLine();
                        switch(admin_input){
                            case 1:
                                System.out.println("Adding a new teacher...");
                                System.out.println("Enter the name of the new teacher:");
                                String new_teacher_name = sc.nextLine();
                                System.out.println("Enter the department of the new teacher in capital letters:");
                                String new_teacher_department=sc.nextLine();
                                System.out.println("Enter the block and floor number where the new teacher will be sitting in:");
                                String new_teacher_room = sc.nextLine();
                                System.out.println("Enter the designation of the new teacher:");
                                String new_teacher_designation = sc.nextLine();
                                System.out.println("Enter the subject name the new teacher will be primarily teaching:");
                                String new_teacher_subject = sc.nextLine();
                                facultyList.add(new Faculty(new_teacher_name,new_teacher_department,new_teacher_room,new_teacher_designation,new_teacher_subject));
                                try{
                                    BufferedWriter new_entry=new BufferedWriter(new FileWriter("data.csv", true));
                                    String s=new_teacher_name+","+new_teacher_department+","+new_teacher_room+","+new_teacher_designation+","+new_teacher_subject;
                                    new_entry.write(s);
                                    new_entry.newLine();
                                    new_entry.close();
                                }    
                                catch(Exception e){
                                    System.out.println("File not found.");
                                }
                                System.out.println("New Teacher Added Succesfully!");
                            break;
                            case 2:

                            break;
                            case 3:

                            break;
                            case 4:
                                System.out.println("Admin Mode Deactivated!!");
                            break;
                            default:
                                System.out.println("Wrong Choice");
                        }
                    }
                    else{
                        System.out.println("Wrong Password.........Returning back to main menu");
                        break;
                    }
                break;
            }
        }
    }
}
