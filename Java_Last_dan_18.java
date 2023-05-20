
import java.util.Scanner;
class Search{
	final static int member=10;
	int[] kor=new int[member];
	int[] eng=new int[member];
	int[] math=new int[member];
	int[] total=new int[member];
	int[] num=new int[member];
	int[] grade=new int[member];
	double[] avr=new double[member];
	String[] name=new String[member+2];
	String[] name_check=new String[member+2];
	static int count=0;
	static int i=0;
	static int j=0;
	int menu_num=0;
	static String default_name;
	static int default_value;
	
	public boolean search(String searchName){
		for(int i =0; i<name.length;i++){
			if(searchName.equals(name[i])){
				lineprint(34);
				System.out.println("번호  이름  국어  영어  수학  총점  평균 	       등수");
				lineprint(34);
				System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
						total[i],avr[i],grade[i]);
				return true;
			}
		}
		return false;
	}
	public boolean search_correction(String searchName){
		Scanner s = new Scanner(System.in);
		for(int i =0; i<name.length;i++){
			if(searchName.equals(name[i])){
				lineprint(34);
				System.out.println("번호(수정불가) : "+num[i]);
				System.out.println("이름(수정불가) : "+name[i]);
				System.out.print("국어(현재"+kor[i]+"점)수정점수 : ");
				kor[i]=s.nextInt();
				System.out.print("영어(현재"+eng[i]+"점)수정점수 : ");
				eng[i]=s.nextInt();
				System.out.print("수학(현재"+math[i]+"점)수정점수 : ");
				math[i]=s.nextInt();
				lineprint(34);
				System.out.println("수정 후 점수");
				lineprint(34);
				System.out.println("번호  이름  국어  영어  수학  총점  평균");
				lineprint(34);
				System.out.printf("%2d%4s%4d%3d%3d\n",num[i],name[i],kor[i],eng[i],math[i]);
				return true;
			}
		}
		return false;
	}
	
	public boolean search_delete(String searchName){
		Scanner s = new Scanner(System.in);
		String tmp_s;
		for(int i =0; i<name.length;i++){
			if(searchName.equals(name[i])){
				count--;
				num[i]=num[num.length-1];
				num[num.length-1]=num[i];
				name[name.length-1]=default_name;
				name[i]=name[name.length-1];
				name[name.length-1]=name[i];
				kor[i]=kor[kor.length-1];
				kor[kor.length-1]=kor[i];
				eng[i]=eng[eng.length-1];
				eng[eng.length-1]=eng[i];
				math[i]=math[math.length-1];
				math[math.length-1]=math[i];
				total[i]=total[total.length-1];
				total[total.length-1]=total[i];
				avr[i]=avr[avr.length-1];
				avr[avr.length-1]=avr[i];
				grade[i]=grade[grade.length-1];
				grade[grade.length-1]=grade[i];
				System.out.println("번호  이름  국어  영어  수학  총점  평균 	       등수");
				lineprint(34);
				System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
						total[i],avr[i],grade[i]);
				return true;
			}
		}
		return false;
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
class Calc extends Search{
	
	
	public Calc(){
		default_name = "홍길동";
		default_value=30;
		for(i=0;i<member;i++){
			kor[i]=default_value;
			eng[i]=default_value;
			math[i]=default_value;
			name[i]=default_name;
		}
			
		
	}
	public Calc(String n, int a, int b, int c){
		default_name = "홍길동";
		default_value=30;
		for(i=0;i<member;i++){
			kor[i]=a;
			eng[i]=b;
			math[i]=c;
			name[i]=n;
		}
	}
	
	public static void total(int kor[], int eng[], int math[], int total[]){

		for(i=0;i<member;i++){
			total[i] = kor[i]+eng[i]+math[i];
		}
		
	}
	public static void average(int total[], double avr[]){

		for(i=0;i<member;i++){
			avr[i]=total[i]/3.0;
		}
		
	}
	public static void grade(int total[],int grade[]){

		int j=0;
		for(i=0;i<member;i++){
			grade[i]=1;
			for(j=0;j<member;j++){
				if(total[i]<total[j]){
					grade[i]+=1;
				}
			}
		}
		
	}
	public static void sort(int num[],int kor[],int eng[],int math[],int total[],int grade[],double avr[],String name[]){
		int tmp=0;
		double tmp_d=0;
		String tmp_s;
		for(i=0;i<member;i++){
			for(j=i;j<member;j++){
				if(total[i]<total[j]){
					tmp=total[j];
					total[j]=total[i];
					total[i]=tmp;
					tmp=num[j];
					num[j]=num[i];
					num[i]=tmp;
					tmp=kor[j];
					kor[j]=kor[i];
					kor[i]=tmp;
					tmp=eng[j];
					eng[j]=eng[i];
					eng[i]=tmp;
					tmp=math[j];
					math[j]=math[i];
					math[i]=tmp;
					tmp=grade[j];
					grade[j]=grade[i];
					grade[i]=tmp;
					tmp_d=avr[j];
					avr[j]=avr[i];
					avr[i]=tmp_d;
					tmp_s=name[j];
					name[j]=name[i];
					name[i]=tmp_s;
				}
			}
		}
	}
	public static void input_score(int num[],int kor[],int eng[],int math[],String name[],String name_check[]){
		Scanner s = new Scanner(System.in);
		if(count<member){
			num[count] +=count+1;
			System.out.print(num[count]+"번 이름 입력하시오: ");
			name_check[count]=s.next();
			if(name_check[count].equals("0")){
				count++;
				System.out.println("기본값으로 이름 " +default_name+" 각 점수는 "+default_value+"점으로 기록했습니다.");
			}
			else{
				name[count]=name_check[count];
				System.out.print(num[count]+"번 국어점수를 입력하시오: ");
				kor[count] = s.nextInt();
				System.out.print(num[count]+"번 영어점수를 입력하시오: ");
				eng[count] = s.nextInt();
				System.out.print(num[count]+"번 수학점수를 입력하시오: ");
				math[count] = s.nextInt();
				count++;
			}
		}
		else{
			System.out.println("현재 "+member+"명을 모두 입력했습니다. 더 이상 잉력할 수 없습니다.");
		}
	}
	public static void output_score(int num[],int kor[],int eng[],int math[],int total[],int grade[],double avr[],String name[]){
		total(kor,eng,math,total);
		average(total,avr);
		grade(total,grade);
		sort(num,kor,eng,math,total,grade,avr,name);
		System.out.println("번호  이름  국어  영어  수학  총점  평균 	       등수");
		lineprint(34);
		for(i=0;i<member;i++){
			System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
				total[i],avr[i],grade[i]);
		}
	}
	@Override
	public boolean search(String searchName) {
		
		return super.search(searchName);
	}
	public void search(Scanner scan) {
		System.out.print("이름 입력하시오:");
		String searchName = scan.next();
		boolean flag = search(searchName);
		
		if(!flag) System.out.println("입력하신 이름은 존재하지 않습니다.");
		
	}
	
	public void correction(Scanner scan){
		System.out.print("이름 입력하시오:");
		String searchName = scan.next();
		boolean flag = search_correction(searchName);
		
		if(!flag) System.out.println("입력하신 이름은 존재하지 않습니다.");
	}
	public void delete(Scanner scan){
		System.out.print("이름 입력하시오:");
		String searchName = scan.next();
		boolean flag = search_delete(searchName);
		
		if(!flag) System.out.println("입력하신 이름은 존재하지 않습니다.");
	}
	
	
}

public class Java_Last_dan_18{

public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calc calc1=new Calc("홍길동",30,30,30);
		
		while(true){
			calc1.lineprint(34);
			System.out.println("<<원하시는 번호를 선택하세요>> ");
			calc1.lineprint(34);
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보출력");
			System.out.println("3.학생정보검색");
			System.out.println("4.학생정보수정");
			System.out.println("5.학생정보삭제");
			System.out.println("6.종료");
			System.out.print("선택번호: ");
			calc1.menu_num=s.nextInt();
			switch (calc1.menu_num){
					
				case 1:
					calc1.lineprint(34);
					calc1.input_score(calc1.num,calc1.kor,calc1.eng,calc1.math,calc1.name,calc1.name_check);
					calc1.lineprint(34);
					break;
				case 2:
					
					calc1.lineprint(34);
					calc1.output_score(calc1.num, calc1.kor, calc1.eng, calc1.math, calc1.total, calc1.grade, calc1.avr, calc1.name);
					calc1.lineprint(34);
					break;
				case 3:
					
					calc1.lineprint(34);
					calc1.search(s);
					calc1.lineprint(34);
					break;
				case 4:
					calc1.lineprint(34);
					calc1.correction(s);
					calc1.lineprint(34);
					break;
				case 5:
					calc1.lineprint(34);
					calc1.delete(s);
					calc1.lineprint(34);
					break;
				default:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}

	}

}