package eightfeatures;

import java.util.Arrays;
import java.util.List;

public class Streams_demo {
  public static void main(String argsp[])
  {
	  List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8);
	  number.stream().map(x-> x+x ).forEach(y->System.out.println(y)); 
	  }
}
