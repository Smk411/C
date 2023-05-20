import java.util.Scanner;
class Calc{
	int[] kor=new int[3];
	int[] eng=new int[3];
	int[] math=new int[3];
	int[] total=new int[3];
	int[] num=new int[3];
	int[] grade=new int[3];
	double[] avr=new double[3];
	String[] name=new String[10];
	
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
	public static void grade(int total[],int grade[]){
		int i=0;
		int j=0;
		for(i=0;i<3;i++){
			grade[i]=1;
			for(j=0;j<3;j++){
				if(total[i]<total[j]){
					grade[i]+=1;
				}
			}
		}
		
	}
	public static void lineprint(){
		int i=0;
		for(i=0;i<34;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	public static void lineprint(int a){
		int i=0;
		for(i=0;i<a;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	
	
}

public class Java_Last_dan_10 {

public static void main(String[] args) {
		int i=0;
		Calc calc1=new Calc();
		
		Scanner s = new Scanner(System.in);
		
		calc1.lineprint(34);
		for(i=0;i<3;i++){
			calc1.num[i] +=i+1;
			System.out.print(calc1.num[i]+"번 이름 입력하시오: ");
			calc1.name[i]=s.next();
			System.out.print(calc1.num[i]+"번 국어점수를 입력하시오: ");
			calc1.kor[i] = s.nextInt();
			System.out.print(calc1.num[i]+"번 영어점수를 입력하시오: ");
			calc1.eng[i] = s.nextInt();
			System.out.print(calc1.num[i]+"번 수학점수를 입력하시오: ");
			calc1.math[i] = s.nextInt();
		}
		calc1.lineprint(34);
		calc1.total(calc1.kor,calc1.eng,calc1.math,calc1.total);
		calc1.average(calc1.total,calc1.avr);
		calc1.grade(calc1.total,calc1.grade);
		calc1.lineprint(34);
		System.out.println("번호  이름  국어  영어  수학  총점  평균 	       등수");
		calc1.lineprint(34);
		for(i=0;i<3;i++){
		System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",calc1.num[i],calc1.name[i],calc1.kor[i],calc1.eng[i],calc1.math[i],
				calc1.total[i],calc1.avr[i],calc1.grade[i]);
		}
		calc1.lineprint(34);

	}

}