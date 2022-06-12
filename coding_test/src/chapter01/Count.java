package chapter01;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0;
		int j;
		for(int i=0; i<10; i++) {
			do {
				System.out.println((i+1)+"번째숫자 입력 : ");
				j=sc.nextInt();
			}while(1>j||10<j);
			if(j==2) {
				c++;
			}
		}
		System.out.println("2의갯수 : "+c);
	}

}
