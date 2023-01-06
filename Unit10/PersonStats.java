import java.util.*;
public class PersonStats{


  public static void testaveragePets(ArrayList<Person>persons, int expected){
    int correct = averagePets(persons);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(Person p : persons){
      System.out.println(p.getPetNum());
    }
    if(correct == expected){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static void testmostPets(ArrayList<Person>persons, String expected){
    String correct = mostPets(persons);
    System.out.println("Expected: " + expected + " Correct: " + correct);
    for(Person p : persons){
      System.out.println(p.getPetNum());
      System.out.println(p.getName());
    }
    if(correct.equals(expected)){
      System.out.println("Woohoo!");
    } else {
      System.out.println("Boohoo!");
    }
  }

  public static int averagePets(ArrayList<Person>persons){
    int result = 0;
    for (Person p : persons){
      result += p.getPetNum();
    }
    return result / persons.size();
  }

  public static String mostPets(ArrayList<Person>persons){
    int result = 0;
    String hey = "";
    for (Person p : persons ){
      if(p.getPetNum() > result){
      result = p.getPetNum();
      hey = p.getName();
    }
    }
    return hey;
  }

  public static ArrayList<Person> twoPlus(ArrayList<Person>persons){
    ArrayList<Person>leasts = new ArrayList<Person>();
    for (Person p : persons){
      if(p.getPetNum() > 1){
      leasts.add(p);
    }
    System.out.println(p.getName());
    System.out.println(p.getPetNum());
    }

    return leasts;
  }


    public static void main (String [] args){
      ArrayList<Person> persons = new ArrayList<Person>();
      persons.add(new Person("Ramya", 3));
      persons.add(new Person("Dr. Kessner", 2));
      persons.add(new Person("Logan", 0));
      persons.add(new Person("Vi", 7));
      testaveragePets(persons, 3);
      testmostPets(persons, "Vi");
      System.out.println(twoPlus(persons));

  }

}
