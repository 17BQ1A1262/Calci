import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two inputs: ");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        System.out.println("Enter any operator from them +, -, *, /: ");
        char op=sc.next().charAt(0);
        int output=0;
        if(op == '+')
        {
            OpAdd s=new OpAdd();
            output=s.arithmeticOperations(input1,input2);
            System.out.println(input1+"+"+input2+"="+output);
        }
        else if(op=='-')
        {
            OpSub su=new OpSub();
            output=su.arithmeticOperations(input1,input2);
            System.out.println(input1+"-"+input2+ "="+output);
        } else if(op=='/')
        {
            OpDiv d=new OpDiv();
            output=d.arithmeticOperations(input1,input2);
            System.out.println(input1+"/"+input2+"=" +output);
        } else if(op=='*')
        {
            OpMul m=new OpMul();
            output=m.arithmeticOperations(input1,input2);
            System.out.println(input1+"*"+input2+"=" +output);
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}