package day03;
import java.util.Scanner;
public class day03test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//[문제4-2]
		int sum =0;
		
		for(int v=1;v<21;v++) {
			if ((~sum/2==0) | (~sum/3==0));
			sum=sum+v;
		}
		System.out.println("1~120까지의 2또는 3의 배수가 아닌 수의 총합: "+sum);	

		
		//[문제4-3]
		int hap =0;
		int totalhap=0;
		for (int i=1; i<11; i++) {
			hap += i;
			totalhap += hap;
		}
		System.out.println("1+(1+2)~(1+..+10)의 총 합:"+totalhap);
		
		//[문제3-3 삼항연산자를 두번 사용하라]
		int a =10;
		if(a>0) {
			System.out.println("양수");
		}else if (a<0){
			System.out.println("음수");
		}
		
		
		//[문제 3-4 (1)에 알맞은 코드를 넣으시오]
		Scanner in=new Scanner(System.in);
		int num1,result;
		System.out.println("숫자입력: ");
		num1=in.nextInt();
		result=(num1/100)*100;
		System.out.print("결과: "+result);
	}

}
