import pets.Cat;
import pets.Dog;
class PetStuff{
  public static void main(String[] args) {
    Cat c = new Cat("Hobbes");

    System.out.println("The cat's name is: " + c.getName());
    System.out.println("A cat says: " + Cat.says());
    System.out.println(c.getName() + " says: " + c.says());

    c = new Cat("Garfield");
    System.out.println("A cat says: " + Cat.says());
    System.out.println(c.getName() + " says: " + c.says());

    Dog d = new Dog("Snoopy");
  }
}
