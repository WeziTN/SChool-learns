/*

 Author: Wezi.TN
 Email: Nyirendawezi2004@gmail.com

 Creation Date: 2025-09-02 21:26

 "Put description here..."

*/
public class StudentFile {
    private int studentid;
    protected String department;
    String name;

    public StudentFile(int studentid, String department, String name) {
        this.studentid = studentid;
        this.department = department;
        this.name = name;
    }

    public String  getName(){
        return name;
        
    }

    public int getID(){
        return studentid;
    }

    public String getdepart(){
        return department;
    }

    

}
