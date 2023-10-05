package MergeArray;

public class Program5 {

	public static void main(String[] args) {

		int ary1[] = {1,2,3,4};
		int ary2[] = {5,6,7,8};
		int ary3[] = new int [ary1.length+ary2.length]
				;
		
		for(int i=0; i<ary1.length; i++)
		{
			ary3[i] = ary1[i];
		}
		for(int j=0; j<ary2.length; j++)
		{
			ary3[ary1.length + j] = ary2[j];
		}
		for( int value:ary3)
		{
			System.out.print(value + " ");
		}
	}

}
