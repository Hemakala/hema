interface square
{
public void area();
}

class Shape implements square
{
public void area()
{
int a=4;
int b;
b=a*a;
System.out.println("area:" +b);
}
 public static void main(String args[])
{
Shape s=new Shape();
s.area();
}
}