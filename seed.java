import java.util.Scanner;


public class seed {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=1;
		String s=String.valueOf(n);
		for(int i=0;i<s.length();i++)
		{
			res=res*Integer.valueOf(String.valueOf(s.charAt(i)));
			
		}
		System.out.println(res*n);
	}
}
