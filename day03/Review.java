package day03;

public class Review {
	public static void main(String[] args) {
		System.out.println("1. 산술연산자-------");
		//+ - * /(나눌 몫을 구하는 연산자), %(나머지 값을 구하는 연산자)
		int a=10;
		System.out.println(a-6);//4
		System.out.println(a*3);//30
		System.out.println(a/3);//3 //int/int ==> 결과 int
		System.out.println(a%3);//1
		
		double b=10;
		System.out.println(b/3); //double/int ==>결과 double
		//42 : 00000000 00000000 00000000 00101010
		System.out.println("2. Shift연산자 (<<, >>, >>>)-----");
		System.out.println(42<<3);
		// 00000 00000000 00000000 00101010 000
		System.out.println(42>>3);
		System.out.println(42>>>3);
		/* 시프트 연산자 : 비트로 바꿔서 연산을 수행한다.
		 * 1) << : 왼쪽으로 비트수 만큼 이동
		 * 				뒤에 남은 빈칸은 0으로 채운다. 2^8+2^6+2*4
		 * 2) >> : 오른쪽으로 비트 수 만큼 이동
		 * 				앞에 남은 빈칸은 부호비트로 채운다
		 * 3) >>> : 오른쪽으로 비트 수 만큼 이동
		 * 				앞에 남은 빈칸은 무조건 0으로 채운다.
		 */
		
		//~43: 11111111 11111111 11111111 11010101
		
		System.out.println(-43<<2);
		// 111111 11111111 11111111 11010101 00
		System.out.println(-43>>2);
		// 11 111111 11111111 11111111 110101
		System.out.println(-43>>>2);
		// 00 111111 11111111 11111111 110101
		
		System.out.println("3. 비교연산자: ==, !=, >, >=, <, <=, instanceof");
		int m=60;
		int n=160;
		/* 1) > : 큰가?
		 * 2) >= : 크거나 같은가
		 * 3) < : 작은가?
		 * 4) <= : 작거나 같은가?
		 * 5) == : 같은가?
		 * 6) != : 다른가?
		 * 7) 참조변수 instanceof 클래스명: 참조변수가 클래스의 객체인가?
		 * */
		
		System.out.println(m>n);
		
		if(m>n) {
			System.out.println("@@@@");
		}else if(m<n) {
			System.out.println("####");
		}
		
		
		System.out.println("4. 비트연산자 : &, &&, |, ||");
		// 정수에만 사용되는 연산자
		// & (and연산자) : 두 비트가 1일때만 1
		// | (or연산자) : 두 비트가 1이면 1(하나라도 1이면 1). 모두 0이면 0.
		// ^ (xor연산자) : 두 비트가 서로 다르면 1, 같으면 0
		
		int x=3; //0011
		int y=5; //0101
				//
		System.out.println("x&y="+(x&y));
		System.out.println("x|y"+(x|y));
		System.out.println("x^y"+(x^y));
		
		System.out.println("5. 논리연산자: &, && | ||");
		int a1=5;
		int b1=6;
		if((a1>b1) && (a1>0)) {
			System.out.println("Hello");
		}else if((b1>a1) || (b<0)) {
			System.out.println("Hi");
		}
		
		/*
		 
		 * 1) &, &&
		 * 2) |, ||
		 * 
		 * &, | 의 경우: &, | 연산자를 사용하면 앞의 연산으로 결과를
		 * 					알 수 있어도 뒤에 문장까지 비교한다.
		 * &&, || 의 경우: 앞의 연산으로 결과를 알 수 있을 경우
		 * 					뒤의 문장은 수행하지 않는다.
		 * 					예를 들어 &&의 경우, 앞의 연산결과가 false이면 뒤의 연산을 생략.
		 * 							||의 경우, 앞의 연산결과가 true이면 뒤의 연산을 생략.
		 * */
		
		//[문제1] 아래 출력문의 결과를 예측하세요
		int i=1;
		int j=i++; //i=2 j=1
		if((i>++j) && (i++ ==j)) { //i=2 j=1 && 
			i=i+j; 
		}
		System.out.println("i="+i);
		
		//[문제2]
		int k=0;
		int p=1;
		if((k++ ==0) || (p++ ==2)); { 
			k=42;
		}
		System.out.println("k="+k+", p="+p);
		
		//[문제3]
		boolean r=false;
		boolean e=false;
		boolean w=((r=true) || (e=true));
		System.out.println(r+", "+e+","+w); // |true, true, true || true, false, true
	}

}
