import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    
    static String equation;
    char[] charEqn;
    ArrayList<String> charEquation = new ArrayList<>();
    int optClass, lowLimit, upLimit;
    
    public Main(){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("****************************************************************");
        System.out.println("Enter the equation of the line: ");
        equation = reader.nextLine();
        equation = equation.replaceAll(" ", "");
        equation = equation.replace("y", "");
        equation = equation.replace("=", "");
        equation = equation.replaceAll("", ":").trim();
        System.out.println(equation);
        equation = addPars(equation);
        charEqn = equation.toCharArray();
        System.out.println(Arrays.toString(charEqn));
        System.out.println("Enter the lower limit: ");
        lowLimit = reader.nextInt();
        System.out.println("Enter the upper limit: ");
        upLimit = reader.nextInt();
        System.out.println("Choose the option you want to calculate the integral.");
        System.out.println("Option 1: Normal to Infinity");
        System.out.println("Option 2: Trapezoidal Rule");
        System.out.println("Option 3: Simpson's Rule");
        optClass = (reader.nextInt() - 1);
        System.out.println("****************************************************************\n");
        switch(optClass){
            
            case 0:
                System.out.println("Calculating the integral normally from " + lowLimit + " to " + upLimit);
                Normal obj = new Normal(charEqn, lowLimit, upLimit);
                //obj.start();
                break;
            case 1:
                System.out.println("Calculating the integral using Trapezoidal rule from " + lowLimit + " to " + upLimit);
                TrapezoidalRule obj2 = new TrapezoidalRule(charEqn, lowLimit, upLimit);
                //obj2.start();
                break;
            case 2:
                System.out.println("Calculating the integral using Simpson's rule from " + lowLimit + " to " + upLimit);
                SimpsonsRule obj3 = new SimpsonsRule(charEqn, lowLimit, upLimit);
                //obj3.start();
                break;
            default:
                System.out.println("Not a possible option; run the program again.");
            
        }
        
    }
    
    public String addPars(String equation){
        
        int lenEqn = equation.length();
                
        System.out.println(Arrays.deepToString(equation.split(":", equation.length()+1)));
        
        return equation;

    }
    
    public static void main(String[] args){
        
        Main choices = new Main();
        
    }
    
}
