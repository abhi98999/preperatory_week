class Emp{

String empid,empname;
public Emp()
{
empid="E1001";
empname="Abhi";
}
public String toString()	
{

return "Employee id:"+empid+"Employee name"+empname;
}

public static void main(SEring args[])
{

Emp obj=new Emp();
System.out.println(obj);
}
}