package Java_Assignment_1st;
import java.util.*;

public class Problem3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int num1=sc.nextInt();

        System.out.println("Enter operation :");
        char op=sc.next().charAt(0);

        System.out.println("Enter 2nd number:");
        int num2=sc.nextInt();

        int result=0;

        switch(op){
            case '+':{
                result=num1+num2;
                System.out.println(result);
                break;
            }
            case '-':{
                result=num1-num2;
                System.out.println(result);
                break;
            }
            case '*':{
                result=num1*num2;
                System.out.println(result);
                break;
            }
            case '/':{
                result=num1/num2;
                System.out.println(result);
                break;
            }
            default : 
                System.out.println("Wrong Operation");
            
        }

    }
    
}
