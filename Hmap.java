import java.util.*;
class Hmap{
public static void main(String args[])
{
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1,"K");
hm.put(2,"A");
hm.put(3,"L");
hm.put(4,"A");
for(Map.Entry m:hm.entrySet())
{
System.out.println(m.getKey() +" "+ m.getValue());
}
}
}
