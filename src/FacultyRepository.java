import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

class FacultyRepository{
    ArrayList<Faculty> facultyList = new ArrayList<>();
    FacultyRepository() {
        loadFromFile();
    }
    public  void loadFromFile(){
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
    }
    public void saveToFile(ArrayList facuArrayList){
        try{
            BufferedWriter new_entry=new BufferedWriter(new FileWriter("data.csv"));
            for(Faculty f:facultyList){
                String s=f.name+","+f.department+","+f.room+","+f.designation+","+f.subject;
                new_entry.write(s);
                new_entry.newLine();
            }
            new_entry.close();
        }    
        catch(Exception e){
            System.out.println("File not found.");
        }
    }
    public  void addTeacher(String new_teacher_name,String new_teacher_department,String new_teacher_room,String new_teacher_designation,String new_teacher_subject){
        facultyList.add(new Faculty(new_teacher_name,new_teacher_department,new_teacher_room,new_teacher_designation,new_teacher_subject));
        saveToFile(facultyList);
    }
    public void deleteTeacher(String input){
        Faculty toRemove = null;
        for(Faculty f:facultyList){
            if(f.name.toLowerCase().startsWith(input.toLowerCase())){
                toRemove = f;
                break;
            }
        }
        if(toRemove!=null){
            facultyList.remove(toRemove);
        }
        saveToFile(facultyList);
    }
    public  void searchByDepartment(String input){
        boolean out=false;
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
    public  void searchByName(String input){
        boolean out=false;
        for(Faculty f:facultyList){
            if(f.name.toLowerCase().startsWith(input.toLowerCase())){
                f.display();
                System.out.println("\n");
                out=true;  
            }
        }
        if(out==false)
            System.out.println("No results found");
    }
    public  void searchBySubject(String input){
        boolean out=false;
        for(Faculty f:facultyList){
            if(f.subject.toLowerCase().startsWith(input.toLowerCase())){
                f.display();
                System.out.println("\n");
                out=true;  
            }
        }
        if(out==false)
            System.out.println("No results found");
    }
}