import java.util.Scanner;

class Reservation{

int trainno;
String trainname;
int platform;

  void add_details(int a,String b,int c)
  {
this.trainno=a;
this.trainname=b;
this.platform=c;
  }
  void disp()
  {
System.out.println("train number:"+trainno);
System.out.println("train name:"+trainname);
System.out.println("platform number:"+platform);
  }
		}

class abc{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the trainno");
int x=sc.nextInt();
System.out.println("enter the trainname");
String y=sc.next();
System.out.println("enter the platform");
int z=sc.nextInt();
	
Reservation r1=new Reservation();
r1.add_details(x,y,z);
r1.disp();

}

	}