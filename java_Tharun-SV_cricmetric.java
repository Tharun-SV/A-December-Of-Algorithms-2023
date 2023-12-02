//DEC 1

import java.io.*
import java.util.Scanner;

public class crimetric {

	public static void main(String[] args) {
		//Accepting the input from user
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of players in the team: ");
		int n= input.nextInt();
		int[] scores = new int [n];
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the runs scored by player"+i+": ");
			scores[i-1]=input.nextInt();
		}
		
		//Printing the elements in the array
		for(int k=0;k<n;k++) {
            System.out.println(scores[k]);}
		
		//Finding the maximum value
		int j=0;
		int max=scores[0];
		while(j<n) {
			if(max<=scores[j]) {
				max=scores[j];
			}
			j++;
		
		}
		System.out.println("The maximum runs among all the player is "+max);
	}
}

