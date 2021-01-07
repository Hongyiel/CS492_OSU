package pets;
public class Cat {
  private String name = "DefaultName";
  private static final int INIT_NUM_LIVES = 9;
  // can use all of the area
  // final is constant
  public Cat(String name){
    this.name = new String(name);
  }

  public String getName(){
    return this.name;
  }

  public static String says() {
    return "meow";
  }
}
