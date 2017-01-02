class abc{

int a=10;
int b=20;
int s;	
	public void add(int a,int b)
	{
		s=this.a+this.b;			
		System.out.println("the sum of a and b using this keyword"+s);
	}

	public void add(int a,int b,int c)
	{
		s=a+b+c;
		System.out.println("the sum of a and b without using this keyword"+s);
	}

	public static void main(String args[])
	{
		abc obj=new abc();
		obj.add(100,200);
		obj.add(100,200,300);	
	
	}
	}