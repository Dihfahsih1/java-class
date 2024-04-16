public class Arrays2 {
    public static void main(String[] args) {
        String[] fruits = {"Apples", "Bananas", "Cherries", "Berries", "Mangoes"};
        int fruit =0;
        while(fruit<fruits.length){
           if(fruits[fruit].equals("Cherries")) {
            fruit++;
            continue;
           }
           System.out.println(fruits[fruit]);
            fruit++;
        }
        
    }
}