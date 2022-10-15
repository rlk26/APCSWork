public class Person {
 public Person(String nameIn, int petsIn){
 name = nameIn;
 pets = petsIn;
}

private String name;
private int pets;

public void hello(){
  System.out.println("Hello my name is " + name + " and I have " + pets + " pets");
}
}
