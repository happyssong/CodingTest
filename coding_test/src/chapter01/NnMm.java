package chapter01;

import java.util.Scanner;

/*
 * N ~M 사이의 모든 소수를 출력하시오.
(N과 M은 사용자가 입력)
 */
public class NnMm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =0;
		int m=0;
		int prime=0;
		
	do {
		System.out.println("n을입력 : ");
		n=sc.nextInt();
		System.out.println("m을입력 : ");
		m=sc.nextInt();
	}while(n>m||n<1);
			
    for(int i=n; i<=m; i++){
    	for(int j=2; j<=i; j++){
    		if(i%j == 0){
        prime ++;
    		}
      }
        if(prime==1){
         System.out.print(i+",");
        }
        prime=0;
    }
  }
}


