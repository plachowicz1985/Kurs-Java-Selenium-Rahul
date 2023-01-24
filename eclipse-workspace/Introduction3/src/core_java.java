
public class core_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
		
		int[] arr2 = {5,6,7,8,9,11,13,15,17,19};
		//System.out.println(arr[2]);
		
		for(int i=0; i<arr2.length-5; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"kupa", "siku", "dupa","siusiak"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}

	}

}
