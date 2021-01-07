package pets;
public class Dog {
  private String name = "DefaultName";
  private static final int INIT_NUM_LIVES = 9;
  // can use all of the area
  // final is constant
  public Dog(String name){
    this.name = new String(name);
  }

  public String getName(){
    return this.name;
  }

  public static String says() {
    return "woof";
  }
}
