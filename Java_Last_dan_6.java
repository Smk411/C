import java.util.Scanner;

class Calc{
	public static void total(int kor[], int eng[], int math[], int total[]){
		
		int i=0;
		for(i=0;i<3;i++){
			total[i] = kor[i]+eng[i]+math[i];
		}
		
	}
	public static void average(int total[], double avr[]){
		
		int i=0;
		for(i=0;i<3;i++){
			avr[i]=total[i]/3.0;
		}
	}
	
}
public class Java_Last_dan_6 {

	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		
		int[] num = new int[3];
		double[] avr = new double[3];
		int i=0;
		Calc calc1 = new Calc();
		Scanner s = new Scanner(System.in);
		System.out.println("----------------------------------");
		for(i=0;i<3;i++){
		
			num[i]+=(i+1);
			System.out.print(num[i]+"�� ���������� �Է��Ͻÿ�: ");
			kor[i] = s.nextInt();
			System.out.print(num[i]+"�� ���������� �Է��Ͻÿ�: ");
			eng[i] = s.nextInt();
			System.out.print(num[i]+"�� ���������� �Է��Ͻÿ�: ");
			math[i] = s.nextInt();
			
		}
		System.out.println("----------------------------------");
		calc1.total(kor,eng,math, total);
		calc1.average(total, avr);
		System.out.println("----------------------------------");
		System.out.println("��ȣ  ����  ����  ����  ����  ���");
		System.out.println("----------------------------------");
		for(i=0;i<3;i++){
			System.out.printf("%2d%4d%3d%3d%4d%6.2f\n",num[i],kor[i],eng[i],math[i],total[i],avr[i]);
		}
		System.out.println("----------------------------------");
	}

}



