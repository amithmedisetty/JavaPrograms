package ExceptionalHandling;

public class TryCatchExample {
    public static void main(String[] args) {
        try{
            int[] arr={1,2,3,4};
            for(int i=0;i<=arr.length;i++){ 
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
}
