import java.util.Scanner;

class dist{
public static void main(String args[])
{
int dis,u,t,a;
Scanner sc=new Scanner(System.in);
	System.out.println("PROGRAM TO CALCULATE THE DISTANCE TRAVELLED");
	
	System.out.println("enter the initial speed of the vehicle(meter/sec)"); 
	u=sc.nextInt();
	System.out.println("enter the time take to travell(in seconds)");
	t=sc.nextInt();
	System.out.println("enter the avg acceleration of the vehicle(meter/sec^2)");
	a=sc.nextInt();

dis=((u*t)+((a*(t*t))/2));

	System.out.println("total distance travlled by the vehicle is:"+" "+ dis+" "+ "	meters");
	
System.out.println("thnkew || have a nice day ");


}
}