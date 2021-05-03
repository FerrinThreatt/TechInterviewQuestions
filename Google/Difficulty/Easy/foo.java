
import java.util.*;
import java.io.*;
//
//
class FooFunction{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] array = {2,2,2};

    FooFunction f = new FooFunction();
    f.foo(array);
  }
  public void foo(int[] array){
    int sum = 0;
    int product = 1;

    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }

    for(int i = 0; i < array.length; i++){
      product *= array[i];
    }

    System.out.println(sum + ", " + product);

  }
}
