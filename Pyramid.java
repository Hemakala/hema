public class Pyramid
{
public static void main(String args[])
{
int num=10;
for(int i=1;i<num;i++)
{
for(int j=1;j<=num;j++)
{
System.out.println("");
}
for(int k=1;k<=i;k++)
{
System.out.println(""+k+"");
}
for(int l=i;l>0;l--)
{
System.out.println(""+l+"");
}
System.out.println();
}
}
}