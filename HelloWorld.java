class HelloWorld {
  public static void main(String[] args) {
    // all these types are consist of bits
    boolean b = true;
    char c = 'c';
    byte by = 8;
    short sh = 16;
    int i = 32;
    long l = 64;
    float f = (float)32.0;
    // float f = 32.0f;
    double d = 64.0;

    System.out.println("Hello, world!");
    // no memory allocate types
    // int[] arr;
    // allocate array
    int[] arr = new int[10];
    arr[0] = 0;
    // arr[1000] = 1000;
    for (int j=0; j< arr.length; j++){
      arr[j] = j * j;
    }

    for (int elem : arr){
      System.out.println(elem);
    }

    int[] arr2 = arr;
  }
}
