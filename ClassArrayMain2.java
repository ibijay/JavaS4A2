import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassArrayMain2
{
	public static void main(String[] arg)
	{
		ClassArray2 ca = new ClassArray2();
		int arr1[]  = {9,8,7,6,5,4,3,2,1};

		System.out.println("The Original Array :");
		for (int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		arr1= ca.sortArray(arr1);
		System.out.println("The sorted Array :");
		for (int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		int num=0;
		int arr2[]=new int[arr1.length+1]; //Array size increased by 1
		BufferedReader ins = new BufferedReader(new InputStreamReader(System.in));
		try 
		{
			System.out.println("Insert Value : ");
			num = Integer.parseInt(ins.readLine());
		} catch (IOException e) 
		{
		}	
		arr2= ca.insertArray(arr1, num);
		System.out.println("The sorted Array after : "+num+" inserted");
		for (int i=0; i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		
	}
	
}