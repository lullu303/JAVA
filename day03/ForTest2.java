package day03;
/*for루프문을 이용해서 구구단 7단을 아래 형식을 출력하세요
 * 7 x 1 =7
 * 7 x 2 =14
 * ...
 * 7 x 0 = 63
 * 
 * */
public class ForTest2 {

	public static void main(String[] args) {
		int dan=7;
		for(int i=1;i<10;i++)
		{
			System.out.println(dan+"x"+i+"="+dan*i);
		}
		//[문제2] 1 ~ 10까지의 합을 구해 출력하세요 -for이용
		//[문제3] 1 ~ 10까지의 곱을 구해 출력하세요
		//[문제4] 1 ~ 100까지의 수 중 짝수들의 합을 구해 출력하세요
		int sum=0;
		int gop=1;
		int hap=0;
		for(int o=1;o<11;o++)
		for(int i=1;i<101;i++)
		for(int c=1;c<101;c++) {
			//sum +=o;
			sum =sum+o;
			gop *=i;
			//gop=gop*1;
			if(c%2 ==0)
				hap=hap+c;
		}
		
		System.out.println("1~10까지의 합: "+sum);
		System.out.println("1~10까지의 곱: "+gop);
		
		//[문제5] 1~100까지의 수 중 17로 나누어 떨어지는 수를 출력하세요
			for(int y=1;y<101;y++) {
				if(y%17==0)
					System.out.println(y);
		//[문제6] 대문자 알파벳[A ~ Z] 을 for 이용해서 출력하세요
			for(int a=65;a<91;a++) {
				System.out.print((char)a+", ");
			}
		}
		
	}

}
