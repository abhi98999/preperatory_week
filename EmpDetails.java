import java.util.Scanner;

class EmpDetails{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int value=0;	
System.out.println("--------------menu------------");
System.out.println("1.enter data");
System.out.println("2.display data");
System.out.println("3.Exit");
System.out.println("Enter your choice");
int n=sc.nextInt();
  switch(n)
   {
	case 1: 
		System.out.println("enter the data");
		value=sc.nextInt();
		break;
	case 2: 
		System.out.println("the data entered in the variable" + value);
		
		break;
	case 3: 
		System.out.println("EXIT");	
		break;
	default: 
		System.out.println("have a nice day");	
		break;
}

}
}