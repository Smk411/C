import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
class Field implements Comparable<Field>{
	private static int member=3;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int grade=1;
	private double avr;
	private String name;
	private String name_check;
	private static int count=0;
	private int menu_num=0;
	private static String default_name;
	private static int default_value;
	private String line;
    
	public static int getMember() {
		return member;
	}
	public static void setMember(int member) {
		Field.member = member;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getAvr() {
		return avr;
	}
	public void setAvr(double avr) {
		this.avr = avr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_check() {
		return name_check;
	}
	public void setName_check(String name_check) {
		this.name_check = name_check;
	}
	public int getMenu_num() {
		return menu_num;
	}
	public void setMenu_num(int menu_num) {
		this.menu_num = menu_num;
	}
	
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Field.count = count;
	}
	public static String getDefault_name() {
		return default_name;
	}
	public static void setDefault_name(String default_name) {
		Field.default_name = default_name;
	}
	public static int getDefault_value() {
		return default_value;
	}
	public static void setDefault_value(int default_value) {
		Field.default_value = default_value;
	}
	
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
	@Override
	public int compareTo(Field o) {
		int compare_grade=((Field)o).getGrade();
		return compare_grade-this.grade;
	}
	
}
class Search extends Field{
	public static ArrayList<Field> list = new ArrayList<Field>();
	
	public static ArrayList<Field> getList() {
		return list;
	}

	public static void setList(ArrayList<Field> list) {
		Search.list = list;
	}

	public Search(){
		
	}
	
	public Search(String n,int k,int e,int m,int t,double a){
		super(n,k,e,m,t,a);
	}

	public boolean search(String searchName){
		for(int i =0; i<list.size();i++){
			if(searchName.equals(list.get(i).getName())){
				lineprint(34);
				System.out.println("�̸�  ����  ����  ����  ����  ��� 	     ���");
				lineprint(34);
				System.out.printf("%4s%4d%3d%3d%4d%6.2f%4d\n",list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
						list.get(i).getTotal(),list.get(i).getAvr(),list.get(i).getGrade());
				return true;
			}
		}
		return false;
	}
	public boolean search_correction(String searchName){
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avr=0;
		Scanner s = new Scanner(System.in);
		for(int i =0; i<list.size();i++){
			if(searchName.equals(list.get(i).getName())){
				lineprint(34);
				System.out.println("�̸�(�����Ұ�) : "+list.get(i).getName());
				System.out.print("����(����"+list.get(i).getKor()+"��)�������� : ");
				kor=s.nextInt();
				list.get(i).setKor(kor);
				System.out.print("����(����"+list.get(i).getEng()+"��)�������� : ");
				eng=s.nextInt();
				list.get(i).setEng(eng);
				System.out.print("����(����"+list.get(i).getMath()+"��)�������� : ");
				math=s.nextInt();
				list.get(i).setMath(math);
				total=list.get(i).getKor()+list.get(i).getEng()+list.get(i).getMath();
				list.get(i).setTotal(total);
				avr=list.get(i).getTotal()/3.0;
				list.get(i).setAvr(avr);
				lineprint(34);
				System.out.println("���� �� ����");
				lineprint(34);
				System.out.println("�̸�  ����  ����  ����  ����  ��� 	     ���");
				lineprint(34);
				System.out.printf("%4s%4d%3d%3d%4d%6.2f%4d\n",list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
						list.get(i).getTotal(),list.get(i).getAvr(),list.get(i).getGrade());
				return true;
			}
		}
		return false;
	}
	
	public boolean search_delete(String searchName){

		for(int i=0; i<list.size();i++){
			if(searchName.equals(list.get(i).getName())){
				lineprint(34);
				System.out.println(i);
				System.out.println(list.size());
			
				System.out.println("�̸�  ����  ����  ����  ����  ��� 	     ���");
				lineprint(34);
				System.out.printf("%4s%4d%3d%3d%4d%6.2f%4d\n",list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),
						list.get(i).getTotal(),list.get(i).getAvr(),list.get(i).getGrade());
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
		int grade=0;
		for(i=0;i<getList().size();i++){
			grade=1;
			getList().get(i).setGrade(grade);
		}
		for(i=0;i<getList().size();i++){
			
			for(int j=0;j<getList().size();j++){
				
				if(getList().get(i).getTotal()<getList().get(j).getTotal()){
					grade=getList().get(i).getGrade()+1;
					getList().get(i).setGrade(grade);
					
				}
			}
		}
	;
		
	}
	public void sort(){
		Collections.sort(list);
	}
	public void input_score() throws IOException{
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
		int grade=0;
		String line;
		try{
			if(getList().size()<getMember()){
				
				System.out.print("�̸� �Է��Ͻÿ�: ");
				name_check=s.next();
				if(name_check.equals("0")){
					System.out.println("�⺻������ �̸� " +getDefault_name()+" �� ������ "+getDefault_value()+"������ ����߽��ϴ�.");
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
					getList().add(new Calc(name,kor,eng,math,total,avr));
					}
				}
			else{
				System.out.println("���� "+getMember()+"���� ��� �Է��߽��ϴ�. �� �̻� �׷��� �� �����ϴ�.");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("���� "+getMember()+"���� ��� �Է��߽��ϴ�. �� �̻� �׷��� �� �����ϴ�.");
		}
	}
	public void output_score(){
		sort();
		grade();
		System.out.println("�̸�  ����  ����  ����  ����  ��� 	    ���");
		lineprint(34);
		for(int i=0;i<getList().size();i++){
			System.out.printf("%4s%5d%3d%3d%4d%6.2f%4d\n",getList().get(i).getName(),getList().get(i).getKor(),getList().get(i).getEng(),getList().get(i).getMath(),
					getList().get(i).getTotal(),getList().get(i).getAvr(),getList().get(i).getGrade());
		}
	}
	public void save() throws IOException{
		BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
		
		for(int i=0;i<list.size();i++){
			
			writer.write(list.get(i).getName());
			
			writer.write(" ");
			writer.write(list.get(i).getKor()+"");
			
			writer.write(" ");
			writer.write(list.get(i).getEng()+"");
			
			writer.write(" ");
			writer.write(list.get(i).getMath()+"");
			
			writer.newLine();
			
		}
		writer.close();
		
	}
	public void load() throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avr=0;;
		String name=null;
		String line=null;
		
		while((line=reader.readLine())!=null){
			
			String[] tokens=line.split(" ");
			name=tokens[0];
			kor=Integer.parseInt(tokens[1]);
			eng=Integer.parseInt(tokens[2]);
			math=Integer.parseInt(tokens[3]);
			total=total(kor,eng,math);
			avr=Math.round((avr(total)*100)/100.0);
			getList().add(new Calc(name,kor,eng,math,total,avr));
			
		}
		
		grade();
		System.out.println("�̸�  ����  ����  ����  ����  ��� 	    ���");
		lineprint(34);
		for(int i=0;i<list.size();i++){
			System.out.printf("%4s%5d%3d%3d%4d%6.2f%4d\n",getList().get(i).getName(),getList().get(i).getKor(),getList().get(i).getEng(),getList().get(i).getMath(),
				getList().get(i).getTotal(),getList().get(i).getAvr(),getList().get(i).getGrade());
		}
		
		
		
		reader.close();
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

public class Java_Last_dan_27{
public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String path = Java_Last_dan_27.class.getResource("").getPath();
		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		Calc calc1=new Calc();
		int menu_num=0;
		
		try{
			try{
				calc1.load();
			}
			catch(NullPointerException e){
				System.out.println("���� ã�� �� ����");
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���� �ҷ����� ����");
		}
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
			menu_num=s.nextInt();
			calc1.setMenu_num(menu_num);
			switch (calc1.getMenu_num()){
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
					try{
						calc1.save();
					}
					catch(NullPointerException e){
						System.out.println("���� ã�� �� ����");
					}
					System.out.println("���α׷��� �����մϴ�.");
					System.exit(0);
			}
		}
	}
}