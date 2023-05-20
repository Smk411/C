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
		System.out.print("삼각형 밑변의 길이를 입력하세요: ");
		a=s.nextDouble();
		System.out.print("삼각형 높이의 길이를 입력하세요: ");
		b=s.nextDouble();
		result=(a*b)/2;
		System.out.println("삼각형의 길이: "+result);
		
	}

	@Override
	void square() {
		Scanner s=new Scanner(System.in);
		double a=0;
		double b=0;
		double result;
		System.out.print("사각형 한변의 길이를 입력하세요: ");
		a=s.nextDouble();
		System.out.print("사각형 다른변의 길이를 입력하세요: ");
		b=s.nextDouble();
		result=a*b;
		System.out.println("사각형의 길이: "+result);
	}
}
public class Java_Last_dan_29 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int menu=0;
		Body body=new Body();
		System.out.print("구하고자 하는 도형을 선택해주세요 1.삼각형 2.사각형: ");
		menu=s.nextInt();
		if(menu==1){
			body.triangle();
		}
		else if(menu==2){
			body.square();
		}
		else{
			System.out.println("잘못입력하셨습니다.");
		}
		
	}

}
