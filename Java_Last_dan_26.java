import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
class Student{
	int kor;
	int eng;
	int math;
	int total;
	int num;
	int grade;
	double avr;
	String name;
}
class Calc extends Student{
	
	ArrayList<String> list=new ArrayList<>();
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
	public void input() throws IOException{
		BufferedReader in = null;
		
		
		
		String path = Java_Last_dan_26.class.getResource("").getPath();
		in=new BufferedReader(new FileReader(path+"input.txt"));
		String line;
		
		while((line=in.readLine())!=null){
			String[] tokens=line.split(" ");
			num=Integer.parseInt(tokens[0]);
			name=tokens[1];
			kor=Integer.parseInt(tokens[2]);
			eng=Integer.parseInt(tokens[3]);
			math=Integer.parseInt(tokens[4]);
			total=kor+eng+math;
			avr=total/3.0;
			line=" "+num+" "+name+"  "+kor+"  "+eng+"  "+math+" "+total+" "+Math.round(avr*100)/100.0;
			list.add(line);
			
		}
		in.close();
	}
	public void output() throws IOException{
		BufferedWriter out = null;
		out=new BufferedWriter(new FileWriter("d:/input.txt"));
		System.out.println("----------------------------------");
		System.out.println("번호 이름  국어  영어  수학  총점  평균");
		System.out.println("----------------------------------");
		for(int i=0;i<list.size();i++){
			
			out.write(list.get(i));
			out.newLine();
			System.out.println(list.get(i));
			
			
		}
		System.out.println("----------------------------------");
		
		out.close();
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


public class Java_Last_dan_26 {

public static void main(String[] args) throws IOException{
		Calc calc1=new Calc();
		calc1.input();
		calc1.output();
	}
}