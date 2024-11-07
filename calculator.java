import java.util.*;
class ceo
{
public static void main()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the choice from the option ");
System.out.println("1:Add");
System.out.println("2:Sub");
System.out.println("3:Muiltply");
System.out.println("4:Division");
int c=sc.nextInt();
System.out.println("Enter the Two Number");
int a=sc.nextInt();
int b=sc.nextInt();
if(c==1)
{
double S = a+b;
System.out.println("Answer is : "+S);
}
if(c==2)
{
double s = a-b;
System.out.println("Answer is : "+s);
}
if(c==3)
{
double M = a*b;
System.out.println("Answer is : "+M);
}
if(c==4)
{
double D= a/b;
System.out.println("Answer is : "+D);
}
}
}