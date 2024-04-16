public class ForLoop {
    public static void main(String[] a) {        
       
        for(int i=0;i<=10; i++){
            for(int j=0; j<=10; j++){
                if(j%2 != 0){
                    continue;
                }
                System.out.println(i+","+j);
            }


        }
        
        
        
        }
    }

