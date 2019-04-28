public class Main {
  public static void main(String[] args) {
    Person pekka =  new Person("Pekka", 15, 2, 1983);
    Person steve =  new Person("Steve");
    
      System.out.println(pekka);
      System.out.println(steve);
      
      Person pekkaa = new Person("Pekka", 15, 2, 1983);
      Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println( martin.getName() + " is older than " +  pekkaa.getName() + ": "+ martin.olderThan(pekkaa) );
        System.out.println( pekkaa.getName() + " is older than " +  martin.getName() + ": "+ pekkaa.olderThan(martin) );
  }
}
