
public class DemoMethods2 {
	float avg (int x,int y) {
		float result = (float)(x+y)/2 ;
		return result ;
	}
	public static void main(String[] args) {
		int a = 7 , b=2 ;
		DemoMethods2 ob = new DemoMethods2();
		float c=ob.avg(a,b);
	System.out.println("Average of two numbers = "+c);

	}

	}
//modifier returntype methodname(type argname,type argname)
