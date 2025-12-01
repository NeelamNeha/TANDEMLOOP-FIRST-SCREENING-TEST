import java.util.*;

public class Problem_1
{
  public static void main(String[] args)
  {

    double result;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a=s.nextDouble();

    System.out.println("Enter the value of b:");
    double b=s.nextDouble();

    System.out.println("Enter vaild operator :");
    char op=s.next().charAt(0);
    switch(op){
        case'+':
        result=a+b;
        System.out.println(a +"+" + b +"=" + result);
        break; 

        case'-':
        result=a-b;
        System.out.println(a +"-" + b +"=" + result);
        break; 

        case'*':
        result=a*b;
        System.out.println(a +"*" + b +"=" + result);
        break; 

        case'/':
        result=a/b;
        if(b==0){
            System.out.println("Error , Division by 0");
        }
        else
        {
              System.out.println(a +"/" + b +"=" + result);
        }
       
        break; 

        default:
            System.out.println("Error , Invalid operator");

    }
    s.close();
  }
}