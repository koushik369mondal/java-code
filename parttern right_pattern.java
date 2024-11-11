import java.util.*;
class ceo
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit of the number of the number of  operation of the pattern ");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j= 1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}
