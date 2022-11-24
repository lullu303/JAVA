package day04;

public class MathTest {

	public static void main(String[] args) {
		//java.lang.Math클래스의 멤버변수
		//public static final double PI: 상수 원주율(3.14)
		System.out.println(Math.PI);
		//static붙은 변수들은 앞에 클래스명을 붙여준다. "클래스명.변수" 식으로 접근한다.
		
		//메소드: 기능을 가지고 있다.(함수)
		//static메소드(클래스 메소드): 클래스명.메소드명(값=매개변수)
		//public static double sqrt​(double a) : 매개변수 a의 제곱근을 구해서 반환
		double b =Math.sqrt(64);
		System.out.println("64의 제곱근: "+b);
		
		double num =45.0123; 
		//num의 올림, 내림, 반올림 값을 구해 출력. Mathe클래스의 메소드 사용
		//public static double ceil​(double a) ==>올림함수
		Math.ceil(num);
		double c=Math.ceil(num);
		System.out.println("45.0123의 올림값: "+c);
		
		//public static double floor​(double a) ==>내림함수
		Math.floor(num);
		double d=Math.floor(num);
		System.out.println("45.0123의 내림값: "+d);
		
		//public static int round​(float a) ==>반올림 함수
		//public static long round​(double a)
		num=45.678;
		//int f2=Math.round((float)num);
		long f= Math.round(num);
		System.out.println("45.0678의 반올림값: "+f);
		
		//public static double random()
		//:0.0<= r3 < 1.0 사이의 임의 난수를 발생시켜 반환해준다.
		double r3=Math.random();
		System.out.println("r3: "+r3);
		
		//[문제1] 0<= r4 <10 사이의 임의의 정수를 발생시켜 출력하세요=> random()활용
		double r4=Math.random();
		int n=(int)(r4*10);
		// System.out.println("r4: "+ Math.round(r4*10));==>10포함
		System.out.println("n: "+n);
		
		//[문제2] 5<= r5 <15 사이의 임의의 정수를 발생시켜 출력하세요
		double r5=Math.random();
		int y=(int)(r5*10+5);
		//System.out.println("r5: "+Math.round(r5*15));==>15포함
		System.out.println("y: "+y);
		
		//int x=(int)(Math.random() * 범위 + 시작수 ) ==>공식
		
		//[문제3] 16<= r6 <48 사이의 임의의 정수
		double r6=Math.random();
		int y2=(char)(Math.random() *32+16);
		System.out.println("y2: "+y2);
		
		//[문제4] 알파벳 대문자를 무작위로 추출해서 아래와 같은 형태로 출력되도록 하세요.
		/*		W I P O A
		 * 		T B P W Z
		 * 		C E R Y I
		 */
		double r7=Math.random();
		char A1=(char)(Math.random()*26+65);
		//3행 5열
			for(int i=0;i<3;i++) { //행(세로)
				for(int j=0;j<5;j++) {//열(가로)
					char ch=(char)(Math.random()*26+'A');
					System.out.println(ch+"/t");// /t: 탭 키만큼 띄우기
			} 
				System.out.println();//줄바꿈
			}//for---
				
		
			

		
	}

}
