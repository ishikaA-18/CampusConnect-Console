public class Faculty{
    String name;
    String department;
    String room;
    String designation;
    String subject;
    Faculty(String name,String department,String room,String designation,String subject){
        this.name=name;
        this.department=department;
        this.room=room;
        this.designation=designation;
        this.subject=subject;
    }
    void display(){
        System.out.println(name+"\n"+department+"\n"+room+"\n"+designation+"\n"+subject);
    }
}