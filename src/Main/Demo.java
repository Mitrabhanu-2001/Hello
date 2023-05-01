package Main;

import java.io.IOException;
public class Demo
{
	    public static void main(String[] args)throws Exception {
			System.out.println("Enter a number");
			String num1=" ";
			int data=0;
			while((data=System.in.read()) !=13);{
			num1=num1+(char)data;
		}
			System.in.read();
			System.out.println("Enter second number");
			String num2=" ";
			while((data=System.in.read() ) !=13);{
				num2= num2+(char)data;
			}
				System.in.read();
				int a=Integer.parseInt (num1);
				int b=Integer.parseInt (num2);
				int c=a+b;
				System.out.println("Result:  "+c);
		}
	}


