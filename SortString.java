package test03_30;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
	public static void main(String []args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		String []str = new String[n];
		for(int i = 0;i<n;i++){
			str[i] = scan.next();
		}
		Arrays.sort(str);
		for(int i = 0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
