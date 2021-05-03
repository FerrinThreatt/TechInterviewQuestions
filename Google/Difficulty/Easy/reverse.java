import java.util.*;
import java.io.*;

class ReverseFunction{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] array = {1,2,3,4,5};

    ReverseFunction r = new ReverseFunction();
    r.reverse(array);
  }
  public void reverse(int[] array){
    //O(n) time. Loops through half of the array
    for(int i = 0; i < array.length/2; i++){
      int other = array.length - i - 1;
      int temp = array[i];
      array[i] = array[other];
      array[other] = temp;

    }
  System.out.println(Arrays.toString(array));

  }
}
