
import java.util.Random;
import java.util.Arrays;

public class SortSearch2 {
    
    int[] intArray;
    int lenArray;
    
    public SortSearch2(int lenArray){
     
        intArray = new int[lenArray];
        
        Random rand = new Random();
        for(int i = 0; i < lenArray; i++){
         
            this.intArray[i] = rand.nextInt(10);
            
        }
        
    }
    
    public void insertionSort(int[] intArray, int way){
        
        int moveInt;
        
        System.out.println("Insertion Sort:");
        System.out.println(Arrays.toString(intArray));
        
        if(way == 0){
            
            for (int i = 1; i < intArray.length; i++) {
            
                moveInt = intArray[i];
                int index = i;

                while (index > 0 && intArray[index-1] > moveInt) {
                    
                    intArray[index] = intArray[index-1];
                    index--;
                
                }

                intArray[index] = moveInt;
                System.out.println(Arrays.toString(intArray));
                
            }
            
        } else {
            
            for (int i = 1; i < intArray.length; i++) {
            
                moveInt = intArray[i];
                int index = i;

                while (index > 0 && intArray[index-1] < moveInt) {
                    
                    intArray[index] = intArray[index-1];
                    index--;
                
                }

                intArray[index] = moveInt;
                System.out.println(Arrays.toString(intArray));
                
            }
            
        }
          
    }
    
    public void unknown(int w[],int i){           
       
        if (i >= w.length-1){
            
            System.out.print(w[i]+", ");
            
        }
            
        else{
            
            unknown(w,i+1);
            System.out.print(w[i]+", ");
        
        }
        
    }
    
    public static void main(String[] args){
        
        SortSearch2 reverseSorted = new SortSearch2(50000);
        reverseSorted.insertionSort(reverseSorted.intArray, 0);
        
        System.out.println();
        
        reverseSorted.unknown(reverseSorted.intArray, 0);
        
        System.out.println();
        
    }
    
}
