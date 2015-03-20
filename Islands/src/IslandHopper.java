
import java.util.Random;
import java.util.Arrays;

public class IslandHopper {

    int[][] map;
    int rows, cols;
    
    public IslandHopper(int rows, int cols){
     
        this.rows = rows;
        this.cols = cols;
        map = new int[rows][cols];
        Random rand = new Random();
        for(int i = 0; i < rows; i++){
         
            for(int k = 0; k < cols; k++){
             
                map[i][k] = rand.nextInt(2);
                
            }
            
        }
        
        System.out.println("Map:");
        
        for(int i = 0; i < rows; i++){
            
            System.out.println(Arrays.toString(map[i]));
            
        }
        
    }
    
    public void Discover(){
        
        int loc, nextLoc, junction;
        
        for(int rowNbr = 0; rowNbr < this.rows; rowNbr++){
        
            for(int colNbr = 0; colNbr < this.cols; colNbr++){
                
                if(this.map[rowNbr][colNbr] == 1){
                
                    System.out.println("island");
                
                } 
                
            }
            
        }
        
    }
    
    public static void main(String[] args){
        
        IslandHopper traveller = new IslandHopper(5, 5);
        traveller.Discover();
        
    }
    
}
