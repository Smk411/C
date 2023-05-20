import java.util.Scanner;
class Search{
	private final static int member=10;
	private int[] kor=new int[member];
	private int[] eng=new int[member];
	private int[] math=new int[member];
	private int[] total=new int[member];
	private int[] num=new int[member];
	private int[] grade=new int[member];
	private double[] avr=new double[member];
	private String[] name=new String[member+2];
	private String[] name_check=new String[member+2];
	public static int count=0;
	public int menu_num=0;
	public static String default_name;
	
	
	
	public int[] getKor() {
		return kor;
	}
	public void setKor(int[] kor) {
		this.kor = kor;
	}
	public int[] getEng() {
		return eng;
	}
	public void setEng(int[] eng) {
		this.eng = eng;
	}
	public int[] getMath() {
		return math;
	}
	public void setMath(int[] math) {
		this.math = math;
	}
	public int[] getTotal() {
		return total;
	}
	public void setTotal(int[] total) {
		this.total = total;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
	public int[] getGrade() {
		return grade;
	}
	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	public double[] getAvr() {
		return avr;
	}
	public void setAvr(double[] avr) {
		this.avr = avr;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public String[] getName_check() {
		return name_check;
	}
	public void setName_check(String[] name_check) {
		this.name_check = name_check;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Search.count = count;
	}
	public int getMenu_num() {
		return menu_num;
	}
	public void setMenu_num(int menu_num) {
		this.menu_num = menu_num;
	}
	public static String getDefault_name() {
		return default_name;
	}
	public static void setDefault_name(String default_name) {
		Search.default_name = default_name;
	}
	public static int getMember() {
		return member;
	}
	protected boolean search(String searchName){
		for(int i =0; i<name.length;i++){
			if(searchName.equals(name[i])){
				lineprint(34);
				System.out.println("��ȣ  �̸�  ����  ����  ����  ����  ��� 	       ���");
				lineprint(34);
				System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
						total[i],avr[i],grade[i]);
				return true;
			}
		}
		return false;
	}
	protected boolean search_correction(String searchName){
		Scanner s = new Scanner(System.in);
		for(int i =0; i<name.length;i++){
			if(searchName.equals(name[i])){
				lineprint(34);
				System.out.println("��ȣ(�����Ұ�) : "+num[i]);
				System.out.println("�̸�(�����Ұ�) : "+name[i]);
				System.out.print("����(����"+kor[i]+"��)�������� : ");
				kor[i]=s.nextInt();
				System.out.print("����(����"+eng[i]+"��)�������� : ");
				eng[i]=s.nextInt();
				System.out.print("����(����"+math[i]+"��)�������� : ");
				math[i]=s.nextInt();
				lineprint(34);
				System.out.println("���� �� ����");
				lineprint(34);
				System.out.println("��ȣ  �̸�  ����  ����  ����  ����  ���");
				lineprint(34);
				System.out.printf("%2d%4s%4d%3d%3d\n",num[i],name[i],kor[i],eng[i],math[i]);
				return true;
			}
		}
		return false;
	}
	
	protected boolean search_delete(String searchName){
		Scanner s = new Scanner(System.in);
		String tmp_s;
		for(int i =0; i<name.length;i++){
			if(searchName.equals(name[i])){
				count--;
				num[i]=num[num.length-1];
				num[num.length-1]=num[i];
				name[name.length-1]= default_name;
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
				System.out.println("��ȣ  �̸�  ����  ����  ����  ����  ��� 	       ���");
				lineprint(34);
				System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
						total[i],avr[i],grade[i]);
				return true;
			}
		}
		return false;
	}
	

	protected static void lineprint(){
		int i=0;
		for(i=0;i<34;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	protected static void lineprint(int a){
		int i=0;
		for(i=0;i<a;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
}
class Calc extends Search{
	
	private static int i=0;
	private static int j=0;
	private static int default_value;
	private Calc(){
		default_name = "ȫ�浿";
		default_value=30;
		for(i=0;i<Search.getMember();i++){
			
			getKor()[i]=default_value;
			getEng()[i]=default_value;
			getMath()[i]=default_value;
			getName()[i]=default_name;
		}
			
		
	}
	protected Calc(String n, int a, int b, int c){
		default_name = "ȫ�浿";
		default_value=30;
		for(i=0;i<getMember();i++){
			getKor()[i]=a;
			getEng()[i]=b;
			getMath()[i]=c;
			getName()[i]=n;
		}
	}
	
	private static void total(int kor[], int eng[], int math[], int total[]){

		for(i=0;i<getMember();i++){
			total[i] = kor[i]+eng[i]+math[i];
		}
		
	}
	private static void average(int total[], double avr[]){

		for(i=0;i<getMember();i++){
			avr[i]=total[i]/3.0;
		}
		
	}
	private static void grade(int total[],int grade[]){

		int j=0;
		for(i=0;i<getMember();i++){
			grade[i]=1;
			for(j=0;j<getMember();j++){
				if(total[i]<total[j]){
					grade[i]+=1;
				}
			}
		}
		
	}
	private static void sort(int num[],int kor[],int eng[],int math[],int total[],int grade[],double avr[],String name[]){
		int tmp=0;
		double tmp_d=0;
		String tmp_s;
		for(i=0;i<getMember();i++){
			for(j=i;j<getMember();j++){
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
		if(count<getMember()){
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
			System.out.println("���� "+getMember()+"���� ��� �Է��߽��ϴ�. �� �̻� �׷��� �� �����ϴ�.");
		}
	}
	public static void output_score(int num[],int kor[],int eng[],int math[],int total[],int grade[],double avr[],String name[]){
		total(kor,eng,math,total);
		average(total,avr);
		grade(total,grade);
		sort(num,kor,eng,math,total,grade,avr,name);
		System.out.println("��ȣ  �̸�  ����  ����  ����  ����  ��� 	       ���");
		lineprint(34);
		for(i=0;i<getMember();i++){
			System.out.printf("%2d%4s%4d%3d%3d%4d%6.2f%4d\n",num[i],name[i],kor[i],eng[i],math[i],
				total[i],avr[i],grade[i]);
		}
	}
	@Override
	protected boolean search(String searchName) {
		
		return super.search(searchName);
	}
	public void search(Scanner scan) {
		System.out.print("�̸� �Է��Ͻÿ�:");
		String searchName = scan.next();
		boolean flag = search(searchName);
		
		if(!flag) System.out.println("�Է��Ͻ� �̸��� �������� �ʽ��ϴ�.");
		
	}
	
	public void correction(Scanner scan){
		System.out.print("�̸� �Է��Ͻÿ�:");
		String searchName = scan.next();
		boolean flag = search_correction(searchName);
		
		if(!flag) System.out.println("�Է��Ͻ� �̸��� �������� �ʽ��ϴ�.");
	}
	public void delete(Scanner scan){
		System.out.print("�̸� �Է��Ͻÿ�:");
		String searchName = scan.next();
		boolean flag = search_delete(searchName);
		
		if(!flag) System.out.println("�Է��Ͻ� �̸��� �������� �ʽ��ϴ�.");
	}
	
	
}

public class Java_Last_dan_19{

public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calc calc1=new Calc("ȫ�浿",30,30,30);
		
		while(true){
			calc1.lineprint(34);
			System.out.println("<<���Ͻô� ��ȣ�� �����ϼ���>> ");
			calc1.lineprint(34);
			System.out.println("1.�л������Է�");
			System.out.println("2.�л��������");
			System.out.println("3.�л������˻�");
			System.out.println("4.�л���������");
			System.out.println("5.�л���������");
			System.out.println("6.����");
			System.out.print("���ù�ȣ: ");
			calc1.menu_num=s.nextInt();
			switch (calc1.menu_num){
					
				case 1:
					calc1.lineprint(34);
					calc1.input_score(calc1.getNum(),calc1.getKor(),calc1.getEng(),calc1.getMath(),calc1.getName(),calc1.getName_check());
					calc1.lineprint(34);
					break;
				case 2:
					
					calc1.lineprint(34);
					calc1.output_score(calc1.getNum(), calc1.getKor(), calc1.getEng(), calc1.getMath(), calc1.getTotal(), calc1.getGrade(), calc1.getAvr(), calc1.getName());
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
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}

	}

}