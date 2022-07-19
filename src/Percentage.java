
public class Percentage {
	float calculatePercentage (int totalMarks) {
		float percentage ;
		//System.out.println("total marks: "+totalMarks);
		percentage = (float)(totalMarks/6);
		//percentage=(((float)totalMarks)/600)*100;
		return percentage ;
	}

	public static void main(String[] args) {
	int m1 = 45 , m2= 55 ,m3 = 34 ,m4 = 67 ,m5 = 76 ,m6=56 ;
	int total = m1+m2+m3+m4+m5+m6 ;
	System.out.println("total marks: "+total);
	Percentage ob = new Percentage() ;
	 float per = ob.calculatePercentage(total) ;
	 System.out.println("Percentage of total marks = "+per+"%");
	}

}
