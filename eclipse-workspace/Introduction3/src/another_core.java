import java.util.ArrayList;

public class another_core {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {5,6,7,8,9,11,12,13,15,17,19};
		
		for (int i=0; i<arr2.length; i++)
		{
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
			}
			
			else {
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("indie");
		a.add("dupa");
		
		System.out.println(a.get(2));
	}

}
