
public class Normal extends Main{
    
    char[] charEqn;
    int lowLimit, upLimit, y, x;
    String finalEqn;
    
    public Normal(char[] charEqn, int lowLimit, int upLimit) {
        
        this.charEqn = charEqn;
        this.lowLimit = lowLimit;
        this.upLimit = upLimit;
        finalEqn = "";
        
    }
    
    public void run(){
        
        try{
            
            for(int i  = 0; i < charEqn.length; i++){
                
                switch(Character.toString(charEqn[i])){
                    
                    case "y":
                        break;
                    case "=":
                        break;
                    case "x":
                        finalEqn = finalEqn + "x";
                        //finalEqn = finalEqn.replace("x", (String)(xVal));
                        break;
                    case "+":
                        break;
                    case "-":
                        break;
                    case "/":
                        break;
                    case "*":
                        break;
                    case "^":
                        break;
                    default:
                        break;
                        
                }
                
            }
            
            Thread.sleep(4000);
                
        }
        
        catch(InterruptedException e){
            
            System.out.println(e.toString());
            
        }
        
    }
    
}
