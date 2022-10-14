package exceptionhandling;

import java.util.Scanner;

public class trywithrsources {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in)){
			int[] nums= {1,2,3,4,5};
			int num=nums[21];
		}

	}

}
