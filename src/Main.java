import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int user_input=0;
        FacultyRepository repo = new FacultyRepository();
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
                            repo.searchByDepartment(input1);
                            break;
                        case 2:
                            System.out.println("Enter the teacher's name:");
                            String input2=sc.nextLine();
                            repo.searchByName(input2);
                            break;
                        case 3:
                            System.out.println("Enter the subject's name:");
                            String input3=sc.nextLine();
                            repo.searchBySubject(input3);
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
                        System.out.println("Welcome Admin!\nTo Proceed further enter your choice-\nPress 1 to add a new teacher.\nPress 2 to delete a teacher.\nPress 3 to exit admin mode.");
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
                                repo.addTeacher(new_teacher_name,new_teacher_department,new_teacher_room,new_teacher_designation,new_teacher_subject);
                                System.out.println("New Teacher Added Succesfully!");
                            break;
                            case 2:
                                System.out.println("Deleting a new teacher...");
                                System.out.println("Enter the teacher name to be deleted:");
                                String old_teacher_name=sc.nextLine();
                                repo.deleteTeacher(old_teacher_name);
                                System.out.println("The teacher has been deleted");
                            break;
                            case 3:
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
