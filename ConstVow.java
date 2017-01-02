import java.util.Scanner;
class ConstVow{

public static void main(String args[])
{
System.out.println("Enter the alphabet to check wether it is constant or vowel");
Scanner sc=new Scanner(System.in);
String alph=sc.next();
if(alph=='a'&'A'|alph=='i'&'I'|alph=='o'&'O'|alph=='u'&'U'|alph=='e'&'E')
{
System.out.println("It is a vowel");
}
else{
System.out.println("It is an constant");
}
}
}