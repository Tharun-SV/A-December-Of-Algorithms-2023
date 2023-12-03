import java.io.*;
import java.util.Scanner;

public class frequency {  
    public static void main(String[] args) {  
        Scanner input=new Scanner(System.in);
        System.out.println("Enter no of elements: ");
    	int n= input.nextInt();
        int [] arr = new int [n]; 
        int [] freq = new int [arr.length];  
        int flag = -1;  
	
	//Accepting an array
        for(int i = 0; i < arr.length; i++) {
        	int temp=i+1;
        	System.out.println("Enter the value of element"+temp+";");
        	arr[i]= input.nextInt();
        }

	//Finding frequency
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;    
                    freq[j] = flag;  
                }  
            }  
            if(freq[i] != flag)  
                freq[i] = count;  
        }  
     	
	//Printing the frequency of the element
        for(int i = 0; i < freq.length; i++){  
            if(freq[i] != flag)  
                System.out.println(arr[i] + " : " + freq[i]);  
        }  
         
    }}  
