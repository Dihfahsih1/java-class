
//Multidimension arrays
//rows and columns
//VariableName
public class MultiDimensional {
    public static void main(String[] args) {
        int [][] matrix ={{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};
        int sum =0;
        for(int[] r:matrix){
            for(int element: r){
            sum +=element;    
            }
        }
         System.out.println("Sum of all elements in the array is: "+sum);           
        
    }
    
}
