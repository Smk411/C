import java.util.Scanner;
import linprintpack.lineprint;


public class Java_Last_dan_12 {

public static void main(String[] args) {
		int i=0;
		calculator calc1=new calculator();
		lineprint line=new lineprint();
		Scanner s = new Scanner(System.in);
		
		line.lineprint(34);
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
		line.lineprint(34);
		calc1.total(calc1.kor,calc1.eng,calc1.math,calc1.total);
		calc1.average(calc1.total,calc1.avr);
		calc1.grade(calc1.total,calc1.grade);
		calc1.sort(calc1.num, calc1.kor, calc1.eng, calc1.math, calc1.total, calc1.grade, calc1.avr, calc1.name);
		line.lineprint(34);
		System.out.println("번호  이름  국어  영어  수학  총점  평균 	       등수");
		line.lineprint(34);
		for(i=0;i<3;i++){
		System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",calc1.num[i],calc1.name[i],calc1.kor[i],calc1.eng[i],calc1.math[i],
				calc1.total[i],calc1.avr[i],calc1.grade[i]);
		}
		line.lineprint(34);

	}

}