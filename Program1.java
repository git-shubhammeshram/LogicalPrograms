package ArmstrongNumber;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		int num ;
		
		System.out.println("Enter The Number\n");
		Scanner x = new Scanner(System.in);
		num = x.nextInt();
		
		int armNum = num;
		int value;
		int sum = 0;
		
		while(num>0)
		{
			value = num%10;
			num = num/10;
			sum = sum+value*value*value;
		}
		System.out.println(sum);
		if(armNum==sum)
		{
			System.out.println("Is an armstrong number");
		}
		else
		{
			System.out.println("Is not at all");
		}
	}

}
