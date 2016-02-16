public class ClassArray2
{
	int arr[]; 
	int[] sortArray(int[] fArr)
	{
		int val;
		for (int i=0;i<fArr.length-1;i++)
		{
			for (int j=0;j<fArr.length-1;j++)
			{			
				if (fArr[j]>fArr[j+1])
				{
					val=fArr[j];
					fArr[j]=fArr[j+1];
					fArr[j+1]=val;
				}
			}
		}
		return fArr;
	}
	int[] insertArray(int[] fArr, int fival)
	{
		int ind1 = insertIndex(fArr,fival);
		arr = new int[fArr.length+1];
		
		for (int i=0;i<arr.length;i++)
		{
			if (i==ind1)
			{
				arr[i]=fival;
			}
			else
			{
				if(i<ind1)
				{
					arr[i]=fArr[i];	
				}
				else
				{
					arr[i]=fArr[i-1];
				}
			}
			
		}
		return arr;
	}
	private static int insertIndex(int[] fArr,int fival)
	{	
		int ind=0;
		boolean chk=false;
		for (int i=0;i<fArr.length;i++)
		{
			if (fival>=fArr[i])
				continue;
			else
			{
				
				chk = true;
				ind = i;
				break;
			}
					
		}
		if (chk==true)
			return ind;	
		else
		{
			ind=fArr.length;//index last index + 1
			return ind;
		}
		
	}
}