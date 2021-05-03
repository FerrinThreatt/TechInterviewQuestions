import java.util.*;
import java.io.*;

class printPairs{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] array = {2,4,6,8};

    FooFunction f = new FooFunction();
    f.foo(array);
  }

  public void printPairs(int[] array){
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array.length; j++){
        System.out.println(array[i] + "," + array[j]);
      }
    }
  }
}
