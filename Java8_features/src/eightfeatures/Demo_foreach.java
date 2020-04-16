//Changes made by some
package eightfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/*class ConsumerImpl implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}*/

public class Demo_foreach {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(1,2,3,4,5);
	
		/*	Different way of using foreach with condition
		 values.forEach(
				i->
				{
					if(i>3)
					System.out.println(i);
				}
				);*/
		
		
		/*Consumer<Integer> c=new ConsumerImpl();
		values.forEach(c);*/
		
		
		/*Consumer<Integer> c=new Consumer<Integer>()
				{
					@Override
					public void accept(Integer t) {
						System.out.println(t);
					}
				};
				
		 values.forEach(c);*/
		
	  /*	Consumer<Integer> c= (i)->System.out.println(i);
		values.forEach(c);*/
		
		values.forEach(i->System.out.println(i));
		
		
	}

}
