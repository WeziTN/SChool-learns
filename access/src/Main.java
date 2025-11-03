public class Main {
    public static void main(String[] args) {
        StudentFile std1 = new StudentFile(1511475, "computer science", "Wezi");

        System.out.println(std1.name);
        //System.out.println(std1.studentid);
        System.out.println(std1.department);
        System.out.println(std1.getID());
    }

}
