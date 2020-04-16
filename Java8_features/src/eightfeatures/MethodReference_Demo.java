package eightfeatures;

import java.util.Arrays;
import java.util.List;
interface Parse
{
	String parse(String s);
}
class String_parser
{
	public static String parse(String s)
	{
		return s.toUpperCase();
	}
}
class MyPrinter{
	public void print(String s,Parse p)
	{
		
		System.out.println(p.parse(s));
	}
}

public class MethodReference_Demo {
public static void main(String args[])
	{
//	   List<String> names=Arrays.asList("Arjun","Arthi");
//	    names.forEach(System.out::println);
	String s="ravichandu";
	MyPrinter m=new MyPrinter();
	m.print(s,(String_parser::parse));
	}
}
