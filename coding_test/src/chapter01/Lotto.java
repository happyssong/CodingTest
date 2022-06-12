package chapter01;

import java.util.Arrays;
import java.util.Random;

/*
 * int[] lotto = new int[6];

다음과 같은 배열이 있을때 1 ~ 45의 랜덤숫자로 배열에 채워 넣고 출력하시오. (출력형태는 자유, 어떤 방법으로든 6개의 번호가 모두 출력만 되면 됨)

제한사항 : 숫자의 중복은 허용하지 않음
 */
public class Lotto {

	public static void main(String[] args) {
		Random rand = new Random();
	
		int[] lotto = new int[6];
		boolean flag = false;
		
		for(int i=1; i<lotto.length ;i++) {
			lotto[i]=rand.nextInt(45)+1;
			if(lotto[i]==lotto[i+1]) {
				//int rand = (int)(Math.random() * 45) * 1
				flag=true;
			}else {
				flag= false;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}

}
