package chapter01;

import java.util.Scanner;

/*
 * 숫자 n이 입력되면 h시 m분 s초 형식으로 변경하여 출력하시오.

예시입력—
3675

예시출력—
1시간 1분 15초

 */
public class Time {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int h,m,s= 0;
		
    do{
    	System.out.println("초 입력 :  ");
    	s = scr.nextInt();
    }while(0>s);
		
    m = s/60;
    s = s%60;
    h = m/60;
    
    if(60<=m) {
    	m = m%60;
    }
   
    System.out.print(h+"시"+m+"분"+s+"초");
		}
}


