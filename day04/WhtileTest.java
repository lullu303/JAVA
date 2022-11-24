package day04;
/*
 * 변수 선언문
 * While(조건식)
 * {
 * 		실행문;
 * 		증감식;
 * }
 * 
 * 조건식이 true이면 실행문을 실행한다.
 * 		 false이면 while블럭을 벗어난다.
 * 
 */
import java.util.*;
public class WhtileTest {

	public static void main(String[] args) {
		int a=1;
		while(a<5) {
			System.out.println("Hello: "+a);
			a++;
		}//while--
		System.out.println("The End~~"+a);
		
		int b=10;
		//b값이 0보다 클때까지 반복 돌면서 "Java:"+b출력하되
		//감소식은 2만큼씩 감소
		while(b>0) {
			System.out.println("Java: "+b);
			b-=2;
		}//while--
		System.out.println("The End!!");
		
		//[문제1] 구구단의 단을 입력받아서 구구단을 출력하기
		//System.out.println("구구단 몇단을 출력할까요?=>");
		//
		//Scanner sc=new Scanner(System.in);
		//int dan=sc.nextInt();//입력
		//int c=1;
		//while(c<10) {
			//System.out.println(dan+"x"+c+"="+dan*c);
			//c++;
		//}
		
		
		//[문제2] 구구단 전체를 출력. While문을 중첩.
		int d=2;
		int k=1;
		while(d<10) {
			while(k<10) {
				System.out.print(d+"x"+k+"="+d*k+"|t");
				d++;
			}
			System.out.println();
			d=2;
			k++;
		}
		
		
	}//main()---------------------

}//class////////////////////////////////
