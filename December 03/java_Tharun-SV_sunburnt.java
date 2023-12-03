import java.io.*;
import java.util.Scanner;

public class sunburnt {
	public static void main (String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number of buildings: ");
		int n=input.nextInt();
		int[] heights =new int[n];
		for (int i=0;i<heights.length;i++) {
			int k=i+1;
			System.out.println("Enter the height of building: "+k);
			heights[i]=input.nextInt();
		}
		System.out.println("\n");
		for (int i=0;i<heights.length;i++) {
			System.out.println("The height of buildings are :"+heights[i]);
		}
		int count=1;
		int first_height=heights[0];
		for (int j=1;j<heights.length;j++) {
			if(heights[j]>first_height) {
				count++;
			}
		}
		System.out.println("\n");
		System.out.println("\n The number of buildings that would see the sunrise is: "+count);

		
		 
		
		
	}
}