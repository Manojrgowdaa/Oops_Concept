public class ArrayOutBound {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    try{
      System.out.println(arr[7]);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
      e.printStackTrace();
    }

  }
  
}