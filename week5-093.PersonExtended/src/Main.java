public class Main {
  public static void main(String[] args) {
    // write test code here
    Person pekka = new Person("Pekka", 15, 2, 1983);//1993
    Person matt = new Person("Matt", 5, 5, 1998);
      System.out.println(pekka.olderThan(matt));
  }
}
