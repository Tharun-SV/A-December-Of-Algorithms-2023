import java.io.*;
import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		int avgamt=0,stolen_amount=0;
		
		System.out.println("Enter the number of theft that had happened : ");
		Scanner input= new Scanner(System.in);
		int n= input.nextInt();
		int [] arr=new int[n];
		int [] amt_stolen=new int[(n/2)+1];
		for (int i=0;i<n;i++) {
			int j=i+1;
			System.out.println("Enter the amount stolen in theft "+j+": ");
			arr[i]=input.nextInt();
			avgamt+=(arr[i])/n;
		}
		System.out.println("The average amount stolen is "+avgamt);
		
		int flag=0;
		for (int k=0;k<n;k++) {
			if(arr[k]>=avgamt) {
				amt_stolen[flag]=arr[k];
				flag=flag+1;
				stolen_amount+=arr[k];
			}
		}
		System.out.println("Element greater than or equal to average are :");
		for (int j=0;j<amt_stolen.length;j++) {
			System.out.println(amt_stolen[j]+"\t");
		}
		System.out.println("Sum of elements greater than or equal to the average: "+stolen_amount);
		
	}

}