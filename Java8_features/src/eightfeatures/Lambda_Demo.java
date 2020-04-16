package eightfeatures;
@FunctionalInterface
interface I
{
	void show(int i,int j,int k);
	
}
public class Lambda_Demo {

	public static void main(String[] args) {
		I obj=(i,j,k)->
		{
			System.out.println(i+j+k);
		};
		obj.show(8,9,10);
	}

}
