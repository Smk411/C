import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Fruit{
	public final static int member = 10;
	public String[] name = new String[member+2];
	public int menu_num = 0;
	private static int count=0;
	public int i = 0;
	ArrayList<String> list = new ArrayList<String>();
	public void input(String name[]){
		Scanner s = new Scanner(System.in);
		System.out.print("	�����̸� �Է� : ");
		name[i]=s.next();
		list.add(name[i]);
		count++;
	}
	public void output(){
		
		for(i=0;i<list.size();i++){
			System.out.printf("	%s\n",list.get(i));
		}
		
	}
	public boolean search(String searchName) {
		Scanner scan = new Scanner(System.in);
		int index_num=0;
		
		for(int i =0; i<list.size();i++){
			if(list.contains(searchName)==true){
				index_num = list.indexOf(searchName);
				lineprint(34);
				System.out.println(list.get(index_num));
				
				return true;
			}
		}
		return false;
		
	}
	public boolean correction(String searchName) {
		Scanner scan = new Scanner(System.in);
		int index_num=0;
		String correction_value;
		
		for(int i =0; i<list.size();i++){
			if(list.contains(searchName)==true){
				index_num = list.indexOf(searchName);
				lineprint(34);
				System.out.print("�ٲ� ���� �Է�: ");
				correction_value=scan.next();
				list.set(index_num,correction_value);
				return true;
			}
		}
		return false;
		
	}
	public boolean delete(String searchName) {
		Scanner scan = new Scanner(System.in);
		int index_num=0;
		
		for(int i =0; i<list.size();i++){
			if(list.contains(searchName)==true){
				index_num = list.indexOf(searchName);
				lineprint(34);
				System.out.print("������ ���� �Է�: ");
				list.remove(index_num);
				System.out.println(list.get(index_num));
				return true;
			}
		}
		return false;
		
	}
	
	public void search(Scanner scan) {
		System.out.print("���� �Է��Ͻÿ�:");
		String searchName = scan.next();
		boolean flag = search(searchName);
		
		if(!flag) System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");
		
	}
	public void correction(Scanner scan){
		System.out.print("���� �Է��Ͻÿ�:");
		String searchName = scan.next();
		boolean flag = correction(searchName);
		
		if(!flag) System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");
	}
	public void delete(Scanner scan){
		System.out.print("���� �Է��Ͻÿ�:");
		String searchName = scan.next();
		boolean flag = delete(searchName);
		
		if(!flag) System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");
	}
	public void sort(){
		Collections.sort(list);
		for(i=0;i<list.size();i++){
			System.out.printf("	%s\n",list.get(i));
		}
	}
	protected static void lineprint(int a){
		int i=0;
		for(i=0;i<a;i++){
			System.out.print("-");
		}
		System.out.println("");
	}
}

public class Java_Last_dan_22{

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Fruit fruit = new Fruit();
	
	while(true){
		fruit.lineprint(34);
		System.out.println("<<���Ͻô� ��ȣ�� �����ϼ���>> ");
		fruit.lineprint(34);
		System.out.println("1.�����̸��Է�");
		System.out.println("2.�����̸����");
		System.out.println("3.�����̸��˻�");
		System.out.println("4.�����̸�����");
		System.out.println("5.�����̸�����");
		System.out.println("6.�����̸�����");
		System.out.println("7.����");
		System.out.print("���ù�ȣ: ");
		fruit.menu_num=s.nextInt();
		switch (fruit.menu_num){
				
			case 1:
				fruit.lineprint(34);
				fruit.input(fruit.name);
				fruit.lineprint(34);
				break;
			case 2:
				
				fruit.lineprint(34);
				fruit.output();
				fruit.lineprint(34);
				break;
			case 3:
				
				fruit.lineprint(34);
				fruit.search(s);
				fruit.lineprint(34);
				break;
			case 4:
				fruit.lineprint(34);
				fruit.correction(s);
				fruit.lineprint(34);
				break;
			case 5:
				fruit.lineprint(34);
				fruit.delete(s);
				fruit.lineprint(34);
				break;
			case 6:
				fruit.lineprint(34);
				fruit.sort();
				fruit.lineprint(34);
				break;
			default:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
		}
	}

	}

}