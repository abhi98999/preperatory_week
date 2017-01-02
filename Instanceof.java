class EmpData{

	public String a="abhi";
	void disp()
	{
		System.out.println("this is employee data   class");
	}
	}
class Emp extends EmpData
	{
	public String b="jain";
	void show()
	{
		System.out.println("this is emp class");	
	}
	
	}
class Admin extends EmpData
	{
	public String c="abc";
	void show()
	{	
		System.out.println("this is admin class");
	}
	}
class abc{

	public static void main(String args[])
	{
	EmpData ed=new EmpData();
	Emp e1=new Emp();
	Admin a=new Admin();
	if(ed instanceof EmpData)
		{
			ed.show();
		}
	
	}

}
