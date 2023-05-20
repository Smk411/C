public class calculator{
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
	public static void sort(int num[],int kor[],int eng[],int math[],int total[],int grade[],double avr[],String name[]){
		int i=0;
		int j=0;
		int tmp=0;
		double tmp_d=0;
		String tmp_s;
		for(i=0;i<3;i++){
			for(j=i;j<3;j++){
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

	
	
}