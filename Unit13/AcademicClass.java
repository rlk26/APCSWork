import java.util.*;
public class AcademicClass{

  public static void addStudent(Student s){
      students.add(s);
  }
  public static void printInfo(ArrayList<Student>students){
    for(Student s : students){
    System.out.println(s.getName());
    System.out.println(s.getfavNum());
  }
  System.out.println(teacher.getName());
  System.out.println(teacher.getSubject());
  }
  public static ArrayList<Student> getStudentNum(int n){
    ArrayList<Student>nums = new ArrayList<Student>();
    for(Student s : students){
      if(n == s.getfavNum()){
        nums.add(s);
      }
    }
    return nums;
  }
  public static ArrayList<Student> getOdds(){
    ArrayList<Student>nums = new ArrayList<Student>();
    for(Student s : students){
      if(s.getfavNum()%2==1){
        nums.add(s);
      }
    }
    return nums;
  }

    public static void main(String [] args){
      students = new ArrayList<Student>();
      teacher = new Teacher("Dr. Kessner","APCS");
      addStudent(new Student("Ramya",8));
      addStudent(new Student("Logan",0));
      addStudent(new Student("Sarah",5));
      addStudent(new Student("Alene",21));
      addStudent(new Student("Vi",8));
      printInfo(students);
      System.out.println(getStudentNum(5));
      System.out.println(getStudentNum(8));
      System.out.println(getOdds());
    }
    private static ArrayList<Student>students;
    private static Teacher teacher;
}
