import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
class Field {
	static int member=3;
	int kor;
	int eng;
	int math;
	int total;
	int grade=1;
	double avr;
	String name;
	String name_check;
	static int count=0;
	int menu_num=0;
	static String default_name;
	static int default_value;
	
    
	public Field(){
		
	}
	public Field(String n,int k,int e,int m,int t,double a){
			
			this.name=n;
			this.kor=k;
			this.eng=e;
			this.math=m;
			this.total=t;
			this.avr=a;
			
	}
}
class Search extends Field{
	static ArrayList<Field> list = new ArrayList<Field>();
	public Search(){
		
	}
	
	public Search(String n,int k,int e,int m,int t,double a){
		super(n,k,e,m,t,a);
	}
	
	/*public int[] getKor() {
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
	*/
	public boolean search(String searchName){
		for(int i =0; i<list.size();i++){
			if(searchName.equals(list.get(i).name)){
				lineprint(34);
				System.out.println("�̸�  ����  ����  ����  ����  ��� 	     ���");
				lineprint(34);
				System.out.printf("%4s%4d%3d%3d%4d%6.2f%4d\n",list.get(i).name,list.get(i).kor,list.get(i).eng,list.get(i).math,
						list.get(i).total,list.get(i).avr,list.get(i).grade);
				return true;
			}
		}
		return false;
	}
	public boolean search_correction(String searchName){
		Scanner s = new Scanner(System.in);
		for(int i =0; i<list.size();i++){
			if(searchName.equals(list.get(i).name)){
				lineprint(34);
				System.out.println("�̸�(�����Ұ�) : "+list.get(i).name);
				System.out.print("����(����"+list.get(i).kor+"��)�������� : ");
				list.get(i).kor=s.nextInt();
				System.out.print("����(����"+list.get(i).eng+"��)�������� : ");
				list.get(i).eng=s.nextInt();
				System.out.print("����(����"+list.get(i).math+"��)�������� : ");
				list.get(i).math=s.nextInt();
				list.get(i).total=list.get(i).kor+list.get(i).eng+list.get(i).math;
				list.get(i).avr=list.get(i).total/3.0;
				lineprint(34);
				System.out.println("���� �� ����");
				lineprint(34);
				System.out.println("�̸�  ����  ����  ����  ����  ��� 	     ���");
				lineprint(34);
				System.out.printf("%4s%4d%3d%3d%4d%6.2f%4d\n",list.get(i).name,list.get(i).kor,list.get(i).eng,list.get(i).math,
						list.get(i).total,list.get(i).avr,list.get(i).grade);
				return true;
			}
		}
		return false;
	}
	
	public boolean search_delete(String searchName){

		for(int i=0; i<list.size();i++){
			if(searchName.equals(list.get(i).name)){
				lineprint(34);
				System.out.println(i);
				System.out.println(list.size());
			
				System.out.println("�̸�  ����  ����  ����  ����  ��� 	     ���");
				lineprint(34);
				System.out.printf("%4s%4d%3d%3d%4d%6.2f%4d\n",list.get(i).name,list.get(i).kor,list.get(i).eng,list.get(i).math,
						list.get(i).total,list.get(i).avr,list.get(i).grade);
				list.remove(i);
				
				
				
				return true;
			}
		}
		return false;
	}
	

	protected void lineprint(){
		int i=0;
		for(i=0;i<34;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
	protected void lineprint(int a){
		int i=0;
		for(i=0;i<a;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
}
class Calc extends Search{
	
	
	public Calc() {
		
	}
	public Calc(String n,int k,int e,int m,int t,double a){
		super(n,k,e,m,t,a);
	}
	public int compareTo(Field field){
		return total-field.total;
	}
	public int total(int kor,int eng,int math){
		int total=0;
		total=kor+eng+math;
		return total;
	}
	public double avr(int total){
		double avr=0;
		avr=total/3.0;
		return avr;
	}
	
	public void grade(){
		int i=0;
	
		for(i=0;i<list.size();i++){
			list.get(i).grade=1;
		}
		for(i=0;i<list.size();i++){
			
			for(int j=0;j<list.size();j++){
				
				if(list.get(i).total<list.get(j).total){
					list.get(i).grade=list.get(i).grade+1;
					
				}
			}
		}
		
		
	}
	public void sort(){
		int tmp=0;
		double tmp_d=0;
		String tmp_s;
		int i=0;
		int j=0;
		for(i=0;i<list.size();i++){
			for(j=i;j<list.size();j++){
				if(list.get(i).total<list.get(j).total){
					tmp=list.get(j).total;
					list.get(j).total=list.get(i).total;
					list.get(i).total=tmp;
					tmp=list.get(j).kor;
					list.get(j).kor=list.get(i).kor;
					list.get(i).kor=tmp;
					tmp=list.get(j).eng;
					list.get(j).eng=list.get(i).eng;
					list.get(i).eng=tmp;
					tmp=list.get(j).math;
					list.get(j).math=list.get(i).math;
					list.get(i).math=tmp;
					tmp=list.get(j).grade;
					list.get(j).grade=list.get(i).grade;
					list.get(i).grade=tmp;
					tmp_d=list.get(j).avr;
					list.get(j).avr=list.get(i).avr;
					list.get(j).avr=tmp_d;
					tmp_s=list.get(j).name;
					list.get(j).name=list.get(i).name;
					list.get(i).name=tmp_s;
				}
			}
		}
	}
	public void input_score(){
		Scanner s = new Scanner(System.in);
		String name=null;
		String name_check;
		int i=0;
		int j=0;
		
		
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avr=0;
		
		
		try{
			if(list.size()<member){
				
				System.out.print("�̸� �Է��Ͻÿ�: ");
				name_check=s.next();
				if(name_check.equals("0")){
				
					System.out.println("�⺻������ �̸� " +default_name+" �� ������ "+default_value+"������ ����߽��ϴ�.");
				}
				else{
					name=name_check;
					System.out.print("�������� �Է��Ͻÿ�: ");
					kor=s.nextInt();
					System.out.print("�������� �Է��Ͻÿ�: ");
					eng=s.nextInt();
					System.out.print("�������� �Է��Ͻÿ�: ");
					math=s.nextInt();
					
					total=total(kor,eng,math);
					avr=avr(total);
					
					
					list.add(new Calc(name,kor,eng,math,total,avr));
					grade();
					}
				}
			else{
				System.out.println("���� "+member+"���� ��� �Է��߽��ϴ�. �� �̻� �׷��� �� �����ϴ�.");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("���� "+member+"���� ��� �Է��߽��ϴ�. �� �̻� �׷��� �� �����ϴ�.");
		}
	}
	public void output_score(){
		
		sort();
		System.out.println("�̸�  ����  ����  ����  ����  ��� 	    ���");
		lineprint(34);
		for(int i=0;i<list.size();i++){
			System.out.printf("%4s%5d%3d%3d%4d%6.2f%4d\n",list.get(i).name,list.get(i).kor,list.get(i).eng,list.get(i).math,
					list.get(i).total,list.get(i).avr,list.get(i).grade);
		
			
		}
	}
@Override
	public boolean search(String searchName) {
		
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

public class Java_Last_dan_23{





public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Calc calc1=new Calc();
		
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
					calc1.input_score();
					calc1.lineprint(34);
					break;
				case 2:
					
					calc1.lineprint(34);
					calc1.output_score();
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