import java.util.Scanner;

class Father extends Exception {
  int fage;
  Father(int a) {
    fage = a;
  }
  
  public String toString() {
    return "Father's age is wrong";
  }
}

class Son extends Father {
  int sage;
  
  Son(int a, int b) {
    super(a);
    sage = b;
  }
  
  public String toString() {
    return "Son's age is greater than or equal to Father's age";
  }
}

class MyException {
  static int a, b;
  
  static void fatherage(int a) throws Father {
    System.out.println("Called fatherage(" + a + ")");
    if (a < 0)
      throw new Father(a);
    System.out.println("Normal exit:Father's age:" + a);
  }
  
  static void sonage(int a, int b) throws Son {
    System.out.println("Called sonage(" + b + ")");
    if (b >= a)
      throw new Son(a, b);
    System.out.println("Normal exit:Son's age:" + b);
  }
  
  public static void main(String args[]) {
    Scanner age = new Scanner(System.in);
    
    System.out.println("Enter Father's age:");
    a = age.nextInt();
    
    System.out.println("Enter Son's age:");
    b = age.nextInt();
    
    try {
      fatherage(a);
    } catch (Father e) {
      System.out.println(e);
    }
    
    try {
      sonage(a, b);
    } catch (Son e) {
      System.out.println(e);
    }
  }
}
