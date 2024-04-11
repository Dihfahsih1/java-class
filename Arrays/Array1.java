public class Array1 {
 public static void main(String[] args){
    //initialize the array with values
   int[] numbers = {20,30,10,40};
   int max =numbers[0];

    //Accessing Values in the array
    for(int i=0; i<numbers.length; i++){
        if(numbers[i]>max){
            max=numbers[i];
        }
        
    }
    System.out.println("The max value is : " + max);
    
 }
}