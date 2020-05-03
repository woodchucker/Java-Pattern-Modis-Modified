package _08EsempioError;

public class _08EsempioErrorMain {

	public static void main(String[] args) {
		contoAllaRovescia(10000000);
		//java.lang.StackOverflowError

	}
	
	public static void contoAllaRovescia(int n) {
		if (n==0) {
			System.out.println("Auguri");
		}else {
			System.out.println(n);
			contoAllaRovescia(n-1);
		}
	}

}
