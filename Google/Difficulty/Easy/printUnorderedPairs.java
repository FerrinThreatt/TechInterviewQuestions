import java.util.*;
import java.io.*;

class printUP{

  public static void main(String[] args){
    int[] array = {2,4,6,8,10};
    FooFunction f = new FooFunction();
    f.foo(array);
  }

  public void printUnorderedPairs(int[] array){
    for(int i = 0; i < array.length; i++){
      for(int j = i+1; j < array.length; j++){
        System.out.println(array[i] + "," + array[j]);
      }
    }
  }
}
