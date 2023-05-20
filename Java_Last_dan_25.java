import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Java_Last_dan_25 {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader in = null;
		BufferedWriter out = null;
		
		ArrayList<String> list=new ArrayList<>();
		
		String path = Java_Last_dan_25.class.getResource("").getPath();
		
		in=new BufferedReader(new FileReader(path+"input.txt"));
	//	out=new BufferedWriter(new FileWriter("d:/input.txt"));
		
		String line;
		
		while((line=in.readLine())!=null){
			String[] tokens=line.split(" ");
			//System.out.println(tokens[0]);
			//System.out.println(tokens[1]);
			//System.out.println(tokens[2]);
		//	System.out.println(tokens[2]);
					
					
					
			int total=Integer.parseInt(tokens[2])+Integer.parseInt(tokens[3])+Integer.parseInt(tokens[4]);
			double avr=total/3.0;
			line=line+" "+total+" "+Math.round(avr*100)/100.0;
			list.add(line);
			
			//list.add(line);
		}
		in.close();
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
		//in.close();
		out.close();

	}

}
