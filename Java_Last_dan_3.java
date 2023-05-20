import java.util.Scanner;


public class Java_Last_dan_3 {

	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		
		int[] num = new int[3];
		double[] avr = new double[3];
		int i=0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------------------");
		for(i=0;i<3;i++){
			
			num[i]+=(i+1);
			System.out.print(num[i]+"번 국어점수를 입력하시오: ");
			kor[i] = s.nextInt();
			System.out.print(num[i]+"번 영어점수를 입력하시오: ");
			eng[i] = s.nextInt();
			System.out.print(num[i]+"번 수학점수를 입력하시오: ");
			math[i] = s.nextInt();
			total[i]=total(kor[i],eng[i],math[i]);
			avr[i]=average(total[i]);
			
		}
		System.out.println("----------------------------------");
		System.out.println("----------------------------------");
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("----------------------------------");
		for(i=0;i<3;i++){
			System.out.printf("%2d%4d%3d%3d%4d%6.2f\n",num[i],kor[i],eng[i],math[i],total[i],avr[i]);
		}
		System.out.println("----------------------------------");
	}
	public static int total(int kor, int eng, int math){
		int total;
		total = kor+eng+math;
		return total;
	}
	public static double average(int total){
		double avr;
		avr=total/3.0;
		return avr;
	}

}
