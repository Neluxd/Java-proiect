package private_acces;

public class Main {
    public static void main(String[] args) {
    student Student = new student();
    Student.setName("Vasile");
        System.out.println(Student.getname());
    Student.setGroup("IS41R");
        System.out.println(Student.getGroup());
        Student.setNota(8) ;
        System.out.println(Student.getNota());
    }
}
