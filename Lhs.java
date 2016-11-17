import java.util.*;
class Lhs
{
public static void main(String args[])
{
LinkedHashSet<String> s=new LinkedHashSet<String>();
s.add("hema");
s.add("kala");
s.add("Santhosh");
Iterator<String> itr=s.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}