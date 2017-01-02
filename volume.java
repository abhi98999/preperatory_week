import java.util.Scanner;

class volume{
public static void main(String args[])
{
float r,h;
double vol;
Scanner sc=new Scanner(System.in);
	System.out.println("PROGRAM TO CALCULATE THE VOLUME OF CYLINDER");
	
	System.out.println("enter the RADIUS of cylinder(cm)"); 
	r=sc.nextInt();
	System.out.println("enter the HEIGHT of the cylinder(cm)");
	h=sc.nextInt();
	vol=((3.14)*r*r*h);	
	System.out.println("total area of cylinder is:"+" "+vol+"cm^3");
	
System.out.println("thnkew || have a nice day ");


}
}