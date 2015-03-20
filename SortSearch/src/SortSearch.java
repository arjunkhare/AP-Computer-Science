
import java.util.Random;
import java.util.Arrays;

public class SortSearch {
    
    int[] intArray;
    int lenArray;
    static int numElements;
    static double startTime, endTime, totalTime;
    int[] totalArray;
    
    public SortSearch(int lenArray){
     
        intArray = new int[lenArray];
        totalArray = new int[lenArray];
        
        Random rand = new Random();
        for(int i = 0; i < lenArray; i++){
         
            this.intArray[i] = rand.nextInt(10);
            
        }
        
    }
    
    public void bubbleSort(int[] intArray, int way){
        
        int moveInt;
        
        //System.out.println("Bubble Sort:");
        //System.out.println(Arrays.toString(intArray));
        
        if(way == 0){
            
            for(int j = 0; j < intArray.length - 1; j++){
            
                for(int i = 1; i < intArray.length - j; i++){

                    if (intArray[i] < intArray[i-1]){

                        moveInt = intArray[i];
                        intArray[i] = intArray[i-1];
                        intArray[i-1] = moveInt;
                        
                        //System.out.println(Arrays.toString(intArray));

                    }
                
                }
            
            }
            
        } else {
            
            for(int j = 0; j < intArray.length-1; j++){
            
                for(int i = 1; i < intArray.length- j; i++){

                    if (intArray[i] > intArray[i-1]){

                        moveInt = intArray[i];
                        intArray[i] = intArray[i-1];
                        intArray[i-1] = moveInt;

                    }
                
                }
                
                //System.out.println(Arrays.toString(intArray));
            
            }
            
        }
        
    }
    
    public void selectionSort(int[] intArray, int way){
        
        int moveInt;
        
        //System.out.println("Selection Sort:");
        //System.out.println(Arrays.toString(intArray));
        
        if(way == 0){
            
            for (int i = 0; i < intArray.length - 1; i++){
            
                int index = i;
            
                for (int j = i + 1; j < intArray.length; j++){
                
                    if (intArray[j] < intArray[index]){
                    
                        index = j;
                    
                    }
                
                }      
      
            moveInt = intArray[index]; 
            intArray[index] = intArray[i];
            intArray[i] = moveInt;
            //System.out.println(Arrays.toString(intArray));

            }
            
        } else {
            
            for (int i = 0; i < intArray.length - 1; i++){
            
                int index = i;
            
                for (int j = i + 1; j < intArray.length; j++){
                
                    if (intArray[j] > intArray[index]){
                    
                        index = j;
                    
                    }
                
                }      
      
            moveInt = intArray[index]; 
            intArray[index] = intArray[i];
            intArray[i] = moveInt;
            //System.out.println(Arrays.toString(intArray));
            
            }
        
        }
        
    }
    
    public void mergeSort(int[] intArray){
        
        int[] firstHalf = Arrays.copyOfRange(intArray, 0, intArray.length/2);
        int[] otherHalf = Arrays.copyOfRange(intArray, intArray.length/2, intArray.length);

        insertionSort(firstHalf, 0);
        insertionSort(otherHalf, 0);
        
        System.arraycopy(firstHalf, 0, intArray, 0, firstHalf.length);
        System.arraycopy(otherHalf, 0, intArray, firstHalf.length, otherHalf.length);

        combineSort(0, intArray.length/2 - 1, intArray.length - 1);

    }

      public void recursiveMergeSort(int firstIndex, int lastIndex) {

        if (firstIndex < lastIndex) {

          int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;

          recursiveMergeSort(firstIndex, middleIndex);
          recursiveMergeSort(middleIndex + 1, lastIndex);
          
          combineSort(firstIndex, middleIndex, lastIndex);

        }

      }

      public void combineSort(int firstIndex, int middleIndex, int lastIndex) {

        for (int i = firstIndex; i <= lastIndex; i++) {

          totalArray[i] = intArray[i];
        
        }

        int i = firstIndex;
        int j = middleIndex + 1;
        int k = firstIndex;

        while (i <= middleIndex && j <= lastIndex) {
        
          if (totalArray[i] <= totalArray[j]) {
        
            intArray[k] = totalArray[i];
            i++;
        
          } else {
        
            intArray[k] = totalArray[j];
            j++;
        
          }
        
          k++;
        
        }
        
        while (i <= middleIndex) {
        
          intArray[k] = totalArray[i];
          k++;
          i++;
        
        }

      }
        
        public void insertionSort(int[] intArray, int way){
            
            int moveInt;
            
            //System.out.println("Insertion Sort:");
            //System.out.println(Arrays.toString(intArray));
            
            if(way == 0){
                
                for (int i = 1; i < intArray.length; i++) {
                
                    moveInt = intArray[i];
                    int index = i;

                    while (index > 0 && intArray[index-1] > moveInt) {
                        
                        intArray[index] = intArray[index-1];
                        index--;
                    
                    }

                    intArray[index] = moveInt;
                    //System.out.println(Arrays.toString(intArray));
                    
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
                    //System.out.println(Arrays.toString(intArray));
                    
                }
                
            }
              
        }
        
        public void splitPoint(int[] intArray, int firstIndex, int lastIndex){
            
            int index = firstIndex + 1;
            int compareVal = intArray[firstIndex];

            System.out.println(compareVal);


            while(index < lastIndex){

                while(intArray[index] <= compareVal){

                    index++;

                }

                while(intArray[lastIndex] > compareVal){

                    lastIndex--;

                }

                if(index <= lastIndex){

                    int moveInt = intArray[index];
                    intArray[index] = intArray[lastIndex];
                    intArray[lastIndex] = moveInt;
                    index++;
                    lastIndex--;

                }

            }

            System.out.println(Arrays.toString(intArray));

            int moveInt = intArray[index - 1];
            intArray[index - 1] = compareVal;
            intArray[firstIndex] = moveInt;


        }
    
    
    public static void main(String[] args){
        
        // numElements = 50000;
        // startTime = System.nanoTime();
        // System.out.println("Bubble Sort:");
        // System.out.println("Number of Elements: " + numElements);
        // SortSearch bubbleSorted = new SortSearch(numElements);
        // bubbleSorted.bubbleSort(bubbleSorted.intArray, 0);                     //Second parameter is 0 for ascending and any other int for descending.
        // endTime = System.nanoTime();
        // totalTime = (endTime - startTime)/1000000000;
        // System.out.println("Total Time Taken: " + totalTime);

        // System.out.println();
        
        // numElements = 50000;
        // startTime = System.nanoTime();
        // System.out.println("Selection Sort:");
        // System.out.println("Number of Elements: " + numElements);
        // SortSearch selectionSorted = new SortSearch(numElements);
        // selectionSorted.selectionSort(selectionSorted.intArray, 0);
        // endTime = System.nanoTime();
        // totalTime = (endTime - startTime)/1000000000;
        // System.out.println("Total Time Taken: " + totalTime);
        
        // System.out.println();
        
        // numElements = 200000;
        // startTime = System.nanoTime();
        // System.out.println("Insertion Sort:");
        // System.out.println("Number of Elements: " + numElements);
        // SortSearch insertionSorted = new SortSearch(numElements);
        // insertionSorted.insertionSort(insertionSorted.intArray, 0);
        // endTime = System.nanoTime();
        // totalTime = (endTime - startTime)/1000000000;
        // System.out.println("Total Time Taken: " + totalTime);
        
        // System.out.println();

        // numElements = 200000;
        // startTime = System.nanoTime();
        // System.out.println("Merge Sort (NonRecursive):");
        // System.out.println("Number of Elements: " + numElements);
        // SortSearch mergeSorted = new SortSearch(numElements);
        // mergeSorted.mergeSort(mergeSorted.intArray);
        // endTime = System.nanoTime();
        // totalTime = (endTime - startTime)/1000000000;
        // System.out.println("Total Time Taken: " + totalTime);

        // System.out.println();
        
        numElements = 10000000;
        startTime = System.nanoTime();
        System.out.println("Merge Sort (Recursive):");
        System.out.println("Number of Elements: " + numElements);
        SortSearch recursiveMergeSorted = new SortSearch(numElements);
        recursiveMergeSorted.recursiveMergeSort(0, recursiveMergeSorted.intArray.length - 1);
        endTime = System.nanoTime();
        totalTime = (endTime - startTime)/1000000000;
        System.out.println("Total Time Taken: " + totalTime);

        System.out.println();

        int[] checkThis = {8, 8, 8, 8, 8, 8, 8, 8, 8};

        numElements = 20;
        startTime = System.nanoTime();
        System.out.println("Split Point:");
        System.out.println("Number of Elements: " + numElements);
        SortSearch splitPointed = new SortSearch(numElements);
        System.out.println(Arrays.toString(splitPointed.intArray));
        splitPointed.splitPoint(checkThis, 0, splitPointed.intArray.length - 1);
        System.out.println(Arrays.toString(splitPointed.intArray));
        endTime = System.nanoTime();
        totalTime = (endTime - startTime)/1000000000;
        System.out.println("Total Time Taken: " + totalTime);
        
    }
    
}
