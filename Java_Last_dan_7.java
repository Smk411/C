import java.util.Scanner;
class Calc{
	int kor;
	int eng;
	int math;
	int total;
	int num;
	double avr;
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

public class Java_Last_dan_7 {

	public static void main(String[] args) {
		
		Calc calc1=new Calc();
		
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
		calc1.num = s.nextInt();
		System.out.print("���������� �Է��Ͻÿ�: ");
		calc1.kor = s.nextInt();
		System.out.print("���������� �Է��Ͻÿ�: ");
		calc1.eng = s.nextInt();
		System.out.print("���������� �Է��Ͻÿ�: ");
		calc1.math = s.nextInt();
		System.out.println("----------------------------------");
		calc1.total=calc1.total(calc1.kor,calc1.eng,calc1.math);
		calc1.avr=calc1.average(calc1.total);
		System.out.println("----------------------------------");
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("----------------------------------");
		System.out.printf("%2d%4d%3d%3d%4d%6.2f\n",calc1.num,calc1.kor,calc1.eng,calc1.math,calc1.total,calc1.avr);
		System.out.println("----------------------------------");

	}
}
