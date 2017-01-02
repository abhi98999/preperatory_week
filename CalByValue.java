//call by value//
import java.util.Scanner;
class CalByValue{

void swap(int var1,int var2)
{
int temp,num1,num2;
num1=var1;
num2=var2;
System.out.println("before swapping:"+num1+" "+num2);
temp=num1;
num1=num2;
num2=temp;
System.out.println("after swapping:"+num1+" "+num2);
}
}
class abc{
public static void main(String args[])
{
CalByValue obj=new CalByValue();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first value");
int n1=sc.nextInt();
System.out.println("Enter the Second value");
int n2=sc.nextInt();
System.out.println("the values entered by the user"+" "+n1+" "+n2);
obj.swap(n1,n2);
System.out.println("after swapping the values entered by the user"+" "+n1+" "+n2);
}

}