import java.util.*;
class a 
{
    public void r()
    {
        System.out.println("hello teachers");
    }
}
class b extends a
{
    public void r()
    {
        System.out.println("hello ashraf");
    }
}
class c extends b
{
    public void r1()
    {
        System.out.println("hello shaz");
    }
}
public class multilevelinheritence
{
    public static void main(String[] args) 
    {
        
        c h=new c();
        h.r1();
        b j=new b();
        j.r();
        
    }
}