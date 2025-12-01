I have used Java and Python Programming languages for solving the coding questions.


The Problem-1 is a simple calculator implemented using class in Java

import java.util.*;  //importing the necessary packages

public class Problem_1
{
  public static void main(String[] args)
  {

    double result;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of a:");  
    double a=s.nextDouble();                     // Reading the input of a 

    System.out.println("Enter the value of b:");
    double b=s.nextDouble();                      // Reading the input of b

    System.out.println("Enter vaild operator :");
    char op=s.next().charAt(0);                   //Reading the input operator
    switch(op){
        case'+':
        result=a+b;
        System.out.println(a +"+" + b +"=" + result);  //addition operation
        break; 

        case'-':
        result=a-b;
        System.out.println(a +"-" + b +"=" + result);         //subtraction operation
        break; 

        case'*':
        result=a*b;
        System.out.println(a +"*" + b +"=" + result);     //multiplication operation
        break; 

        case'/':
        result=a/b;
        if(b==0){
            System.out.println("Error , Division by 0");   // division by 0 is invalid
        }
        else
        {
              System.out.println(a +"/" + b +"=" + result);   //division operation
        }
       
        break; 

        default:
            System.out.println("Error , Invalid operator");   // invalid operator entered

    }
    s.close();
  }





Problem-2 is a code for generating the first 'n' odd integers
n=int(input())
for i in range(1,n+1):
    print((2*i)-1,end=" ")  //printing 'n' first the odd integers 



    

Problem-3 is a code for generating the odd number of odd integers for odd numbr input and generating even number-1 odd integers
n=int(input())

count=0
if n%2==0:
        count=n-1   //if n is even
else:
    count=n      // if n is odd
for i in range(1,count+1):    
    print((2*i)-1,end=" ") 
    

    

Problem-4 

To get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]

arr=list(map(int,input("Enter a series of values:").split(',')))
out={i: sum(num%i==0 for num in arr) for i in range(1,10)}   
print(out)







