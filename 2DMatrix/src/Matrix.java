
//Arjun Khare, Pd. 2 CompSci

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
 
    int myMatrixRow, myMatrixCol;
    int[][] myMatrix;
    int[][] myResultMatrix;
    static String operation;
    
    public Matrix(int myMatrixRow, int myMatrixCol, int minNbr, int maxNbr){
     
        Scanner obj = new Scanner(System.in);

        System.out.println("Row Number: ");
        myMatrixRow = obj.nextInt();
        System.out.println("Column Number: ");
        myMatrixCol = obj.nextInt(); 

        this.myMatrixRow = myMatrixRow;
        this.myMatrixCol = myMatrixCol;
        
        myMatrix = new int[myMatrixRow][myMatrixCol];
        
        Random rand = new Random();
        for(int i = 0; i < myMatrixRow; i++){
            
            for(int k = 0; k < myMatrixCol; k++){
                
                myMatrix[i][k] = rand.nextInt(maxNbr-minNbr+1) + minNbr;
                
            }
            
        }
        
    }
    
    public void initMyMatrix(Matrix matrix, int val){
        
        for(int i = 0; i < myMatrixRow; i++){
            
            for(int k = 0; k < myMatrixCol; k++){
                
                myMatrix[i][k] = val;
                
            }
            
        }
        
    }
    
    public void resetMyMatrix(Matrix matrix, int minNbr, int maxNbr){
        
        Random rand = new Random();
        
        for(int i = 0; i < myMatrixRow; i++){
            
            for(int k = 0; k < myMatrixCol; k++){
                
                matrix.myMatrix[i][k] = rand.nextInt(maxNbr-minNbr+1) + minNbr;
                
            }
            
        }
        
    }
    
    public int[][] addMatrix(Matrix matrix){

        operation = "+";
        
        this.myResultMatrix = new int[this.myMatrixRow][matrix.myMatrixCol];
        
        if(this.myMatrixRow == matrix.myMatrixRow && this.myMatrixCol == matrix.myMatrixCol){
            
            for(int i = 0; i < this.myMatrixRow; i++){
            
                for(int k = 0; k < matrix.myMatrixCol; k++){
                        
                    this.myResultMatrix[i][k] = this.myMatrix[i][k] + matrix.myMatrix[i][k];
                                            
                }
            
            }
                        
        } else {
            
            this.myResultMatrix = null;
            return null;
            
        }
        
        return this.myResultMatrix;
        
    }
    
    public boolean canMultiply(Matrix matrix){
        
        return this.myMatrixCol == matrix.myMatrixRow;
        
    }
    
    public int[][] multMatrix(Matrix matrix){

        operation = "*";
        
        if(canMultiply(matrix) == true){

            this.myResultMatrix = new int[this.myMatrixRow][matrix.myMatrixCol];

            for(int i = 0; i < this.myMatrixRow; i++){

                for(int k = 0; k <  matrix.myMatrixCol; k++){

                    for(int j = 0; j < this.myMatrixCol; j++){

                        this.myResultMatrix[i][k] += (this.myMatrix[i][j] * matrix.myMatrix[j][k]);

                    }

                }

            }
            
        } else {
            
            this.myResultMatrix = null;
            return null;
            
        }
        
        return this.myResultMatrix;
        
    }
    
    public void divMatrix(Matrix matrix){
        
        
        
    }
    
    public void printResultDetail(Matrix matrix){
        
        System.out.println("Matrix 1:");
        
        for(int i = 0; i < this.myMatrixRow; i++){
            
            System.out.println(Arrays.toString(this.myMatrix[i]));
            
        }
        System.out.println();
        
        System.out.println("Matrix 2:");
        
        for(int i = 0; i < matrix.myMatrixRow; i++){
            
            System.out.println(Arrays.toString(matrix.myMatrix[i]));
            
        }
        
        System.out.println();
        
        if(operation.equals("+")){
            
            System.out.println("Addition:");
            
        }
        
        if(operation.equals("*")){
         
            System.out.println("Multiplication:");
            
        }
        
        if(this.myResultMatrix!=null){

            if(this.myMatrixRow < matrix.myMatrixRow){

                for(int i = 0; i < this.myMatrixRow; i++){

                    if(i == 0){

                        System.out.println(Arrays.toString(this.myMatrix[i]) + " " + operation + " " + Arrays.toString(matrix.myMatrix[i]) + " = " + Arrays.toString(this.myResultMatrix[i]));

                    } else {

                        System.out.println(Arrays.toString(this.myMatrix[i]) + "   " + Arrays.toString(matrix.myMatrix[i]) + "   " + Arrays.toString(this.myResultMatrix[i]));

                    }

                }

                String spaceFormat = "   ";
                for(int k = 0; k < Arrays.toString(this.myMatrix[0]).length(); k++){

                    spaceFormat += " ";

                }

                for(int i = this.myMatrixRow; i < (matrix.myMatrixRow); i++){

                    System.out.println(spaceFormat + Arrays.toString(matrix.myMatrix[i]));

                }


            } else {

                for(int i = 0; i < matrix.myMatrixRow; i++){

                    if(i == 0){

                        System.out.println(Arrays.toString(this.myMatrix[i]) + " " + operation + " " + Arrays.toString(matrix.myMatrix[i]) + " = " + Arrays.toString(this.myResultMatrix[i]));

                    } else {

                        System.out.println(Arrays.toString(this.myMatrix[i]) + "   " + Arrays.toString(matrix.myMatrix[i]) + "   " + Arrays.toString(this.myResultMatrix[i]));

                    }

                }

                String spaceFormat = "      ";
                for(int k = 0; k < Arrays.toString(matrix.myMatrix[0]).length(); k++){

                    spaceFormat += " ";

                }
                
                for(int i = matrix.myMatrixRow; i < (this.myMatrixRow); i++){

                    System.out.println(Arrays.toString(this.myMatrix[i]) + spaceFormat + Arrays.toString(this.myResultMatrix[i]));

                }

            }

        } else {
            
            if(this.myMatrixRow < matrix.myMatrixRow){

                for(int i = 0; i < this.myMatrixRow; i++){

                    if(i == 0){

                        System.out.println(Arrays.toString(this.myMatrix[i]) + " " + operation + " " + Arrays.toString(matrix.myMatrix[i]) + " = " + "[INVALID]");

                    } else {

                        System.out.println(Arrays.toString(this.myMatrix[i]) + "   " + Arrays.toString(matrix.myMatrix[i]) + "   ");

                    }

                }

                String spaceFormat = "   ";
                for(int k = 0; k < Arrays.toString(this.myMatrix[0]).length(); k++){

                    spaceFormat += " ";

                }

                for(int i = this.myMatrixRow; i < (matrix.myMatrixRow); i++){

                    System.out.println(spaceFormat + Arrays.toString(matrix.myMatrix[i]));

                }


            } else {

                for(int i = 0; i < matrix.myMatrixRow; i++){

                    if(i == 0){

                        System.out.println(Arrays.toString(this.myMatrix[i]) + " " + operation + " " + Arrays.toString(matrix.myMatrix[i]) + " = " + "[INVALID]");

                    } else {

                        System.out.println(Arrays.toString(this.myMatrix[i]) + "   " + Arrays.toString(matrix.myMatrix[i]) + "   ");

                    }

                }

                String spaceFormat = "      ";
                for(int k = 0; k < Arrays.toString(matrix.myMatrix[0]).length(); k++){

                    spaceFormat += " ";

                }
                
                for(int i = matrix.myMatrixRow; i < (this.myMatrixRow); i++){

                    System.out.println(Arrays.toString(this.myMatrix[i]) + spaceFormat);

                }

            }
            
        }

    }
        
    
    public static void main(String[] args){
        
        Matrix matrix1 = new Matrix(5, 7, 0, 9);
        Matrix matrix2 = new Matrix(9, 5, 0, 9);
        
        matrix1.addMatrix(matrix2);
        matrix1.printResultDetail(matrix2);
        
        System.out.println();
        
        matrix1.multMatrix(matrix2);
        matrix1.printResultDetail(matrix2);
        
    }
    
}




