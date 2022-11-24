package day04;

public class Test {

	public static void main(String[] args) {
		//[문제4-2] 1~20 정수 중 2 or 3의 배수가 아닌 값의 총합
				int sum =0;
				for(int v=1;v<21;v++) {
					
					if (sum%2!=0 && sum%3!=0)
					{
						System.out.println("v: "+v);
						sum=sum+v;
					}
					
				}
				System.out.println("sum: "+sum);	

				//1~10까지의 합
				
				sum=0;
				int totalSum=0;
				for(int i=1;i<11;i++) {
					//sum=sum+i;
					sum+=i; // 1, 1+2, 1+2+3, 1+2+3+4 ...1+..+10
					totalSum+=sum;
				}
				System.out.println("sum: "+sum);
				System.out.println("totalSum: "+totalSum);
				
	}

}
