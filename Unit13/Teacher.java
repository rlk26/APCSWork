public class Teacher {
  public Teacher(String nameIn,String subjectIn){
    name = nameIn;
    subject = subjectIn;
  }
  public String getName(){
    return name;
  }

  public String getSubject(){
    return subject;
  }

  private String name;
  private String subject;

}
