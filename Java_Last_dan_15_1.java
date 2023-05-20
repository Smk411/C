import java.util.Scanner;
class Calc{
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
	
	public Calc(){
		default_name = "���۸�";
		default_value=20;
		for(i=0;i<member;i++){
			kor[i]=default_value;
			eng[i]=default_value;
			math[i]=default_value;
			name[i]=default_name;
		}
			
		
	}
	public Calc(String n, int a, int b, int c){
		default_name = "���۸�";
		default_value=20;
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
			System.out.print(num[count]+"�� �̸� �Է��Ͻÿ�: ");
			name_check[count]=s.next();
			if(name_check[count].equals("0")){
				count++;
				System.out.println("�⺻������ �̸� " +default_name+" �� ������ "+default_value+"������ ����߽��ϴ�.");
			}
			else{
				name[count]=name_check[count];
				System.out.print(num[count]+"�� ���������� �Է��Ͻÿ�: ");
				kor[count] = s.nextInt();
				System.out.print(num[count]+"�� ���������� �Է��Ͻÿ�: ");
				eng[count] = s.nextInt();
				System.out.print(num[count]+"�� ���������� �Է��Ͻÿ�: ");
				math[count] = s.nextInt();
				count++;
			}
		}
		else{
			System.out.println("���� "+member+"���� ��� �Է��߽��ϴ�. �� �̻� �׷��� �� �����ϴ�.");
		}
	}
	public static void output_score(int num[],int kor[],int eng[],int math[],int total[],int grade[],double avr[],String name[]){
		total(kor,eng,math,total);
		average(total,avr);
		grade(total,grade);
		sort(num,kor,eng,math,total,grade,avr,name);
		System.out.println("��ȣ  �̸�  ����  ����  ����  ����  ��� 	       ���");
		lineprint(34);
		for(i=0;i<member;i++){
			System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
				total[i],avr[i],grade[i]);
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

public class Java_Last_dan_15_1 {

public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calc calc1=new Calc("���۸�",20,20,20);
		
		while(true){
			calc1.lineprint(34);
			System.out.println("<<���Ͻô� ��ȣ�� �����ϼ���>> ");
			calc1.lineprint(34);
			System.out.println("1.�л������Է�");
			System.out.println("2.�л��������");
			System.out.println("3.����");
			System.out.print("���ù�ȣ: ");
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
				default:
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}

	}

}