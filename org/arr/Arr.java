package org.arr;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size:");
	
		int len = sc.nextInt();
		int arr[]=new int[len];
		double sum = 0;
		double avg = 0;
		System.out.println("enter the 10 array element");
		for (int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<len;i++) {
			sum+=arr[i];
			
		}
		avg = sum/len;
		System.out.println("sum of "+len+"number in "+sum);
		System.out.println("average is "+avg);
	
	
	
	}
	
	
	
	
	}

