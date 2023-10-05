package MergeArray;

public class Program3 {

	public static void main(String[] args) {

		int ary1[] = {1,2,3};
		int ary2[] = {1,2,3};
		int ary3[] = new int[ary1.length+ary2.length];
		
		for(int i=0; i<ary1.length;i++)
		{
			ary3[i] = ary1[i];
		}
		for(int j=0; j<ary1.length;j++)
		{
			ary3[ary1.length+j] = ary2[j];
		}
		for(Object value:ary3)
		{
			System.out.print(value);
		}
		
		
		
		
		

	}

}
