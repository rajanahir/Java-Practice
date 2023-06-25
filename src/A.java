import java.util.HashSet;
import java.util.List;

public class A {
  String getName() {
    return "A";
  }
  static class B extends A {
    String getName() {
      return "B";
    }
  }

  public static int i = getInt();

  public static void main(String[] args) {

    int x = 5;
    int y = x++;
    int z = ++x;
    int result = x + y + z;
    System.out.println(result);


    String s[] = {"w","y","c","b"};
    doSo(s, 4);

    String str = "hi    hello hi";
    String temp = "";
    HashSet<String> set = new HashSet<>();
    for (int i =0; i<-1; i++) {

      System.out.println("i "+ i);

    }


//    try {
//
//      int i = 10 / 0;
//      System.exit(-1);
//    } catch (Exception e) {
//      throw new RuntimeException("Arithmetic Exception");
//    } finally {
//      System.out.println("finally");
//
//    }

    System.out.println("Main");

    int[] aaa = {3,8,17,2,5,6};
    System.out.println(canArrange(aaa, 10));


    List<Integer> list = List.of(3,3,3);
    int count =0;
    for (int i=0; i < list.size(); i++) {
        for (int j = i+1; j< list.size(); j++) {
          if ((list.get(i) + list.get(j)) % 3 == 0)
            count++;
        }
    }
    System.out.println(count);


//    Boolean b1 = new Boolean("3333");
//    Boolean b2 = new Boolean("9999");
//    System.out.println(b1.equals(b2));


    B b = new B();
    A a = (A) b;
    try{}
    catch (Exception e){}
    finally {

      System.out.println(
              a.getName() + "," + b.getName()
      );
    }
  }

public static int getInt(){
  System.out.println("Hello");
    return 1;
}

  public static  boolean canArrange(int[] arr, int k) {
    boolean result = false;
    for (int i=0; i<= arr.length/2; i++) {
        if ((Math.abs(arr[i]) + Math.abs(arr[arr.length - i -1])) % k == 0)
        {
          result = true;
          break;
        }
    }
    return result;
  }



  public static void doSo(String []s, int n ) {
    for (int i=1; i<n; i++) {
      String t = s[i];
      int j = i-1;
      while(j>=0 && t.length() <s[j].length()) {
        s[j+1] = s[j];
        j--;

      }
      s[j+1] = t;
    }
    for (int k =0; k<n; k++) {
      System.out.print(s[k]);
    }
  }

}