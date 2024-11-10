

import java.util.*;
class Ceo
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("please enter your Choice ");
System.out.println("1:Add");
System.out.println("2:Sub");
System.out.println("3:Product");
System.out.println("4:Division");
int c=sc.nextInt();
System.out.println("Enter the number two time ");
int a=sc.nextInt();
int b=sc.nextInt();

switch(c)
{
case 1:
double sum;
sum=a+b;
System.out.println("Sum is :"+sum);
break;
case 2:
double sub;
sub=a-b;
System.out.println("Sub is :"+sub);
break;
case 3:
double m;
m=a*b;
System.out.println("Mulitiply is :"+m);
break;
case 4:
double d;
d=a/b;
System.out.println("Division is :"+d);
break;
default:
System.out.println("invalid");
}
}
}
