import java.util.Scanner;


public class Java_Last_dan_1 {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		int sum;
		int num;
		double avr;
		
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
		num = s.nextInt();
		System.out.print("���������� �Է��Ͻÿ�: ");
		kor = s.nextInt();
		System.out.print("���������� �Է��Ͻÿ�: ");
		eng = s.nextInt();
		System.out.print("���������� �Է��Ͻÿ�: ");
		math = s.nextInt();
		System.out.println("----------------------------------");
		sum=kor+eng+math;
		avr=sum/3.0;
		System.out.println("----------------------------------");
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("----------------------------------");
		System.out.printf("%2d%4d%3d%3d%4d%5.1f\n",num,kor,eng,math,sum,avr);
		System.out.println("----------------------------------");

	}

}
