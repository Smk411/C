import java.util.Scanner;

abstract class Figure{
	abstract void triangle();
	abstract void square();
	
	
}
class Body extends Figure{

	@Override
	void triangle() {
		Scanner s=new Scanner(System.in);
		double a=0;
		double b=0;
		double result;
		System.out.print("�ﰢ�� �غ��� ���̸� �Է��ϼ���: ");
		a=s.nextDouble();
		System.out.print("�ﰢ�� ������ ���̸� �Է��ϼ���: ");
		b=s.nextDouble();
		result=(a*b)/2;
		System.out.println("�ﰢ���� ����: "+result);
		
	}

	@Override
	void square() {
		Scanner s=new Scanner(System.in);
		double a=0;
		double b=0;
		double result;
		System.out.print("�簢�� �Ѻ��� ���̸� �Է��ϼ���: ");
		a=s.nextDouble();
		System.out.print("�簢�� �ٸ����� ���̸� �Է��ϼ���: ");
		b=s.nextDouble();
		result=a*b;
		System.out.println("�簢���� ����: "+result);
	}
}
public class Java_Last_dan_29 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int menu=0;
		Body body=new Body();
		System.out.print("���ϰ��� �ϴ� ������ �������ּ��� 1.�ﰢ�� 2.�簢��: ");
		menu=s.nextInt();
		if(menu==1){
			body.triangle();
		}
		else if(menu==2){
			body.square();
		}
		else{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
	}

}
