import java.util.Scanner;
class Calc{
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

public class Java_Last_dan_5 {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		int total;
		int num;
		double avr;
		Calc calc1=new Calc();
		
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.print("번호를 입력하시오: ");
		num = s.nextInt();
		System.out.print("국어점수를 입력하시오: ");
		kor = s.nextInt();
		System.out.print("영어점수를 입력하시오: ");
		eng = s.nextInt();
		System.out.print("수학점수를 입력하시오: ");
		math = s.nextInt();
		System.out.println("----------------------------------");
		total=calc1.total(kor,eng,math);
		avr=calc1.average(total);
		System.out.println("----------------------------------");
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("----------------------------------");
		System.out.printf("%2d%4d%3d%3d%4d%5.2f\n",num,kor,eng,math,total,avr);
		System.out.println("----------------------------------");

	}
	
}
