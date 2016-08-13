import java.util.Scanner;
public class DuplicateString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=n.nextLine();
		char[] a=s.toCharArray();
		String result="";
		for(int m=a.length-1;m>=0;m--)
		{
		for(int n1=m-1;n1>=0;n1--)
			{
			
		if(a[n1]==(a[m]))
				{
					a[m]='%';
					}
			}
		}

		for(int p=0;p<a.length;p++)
		{
			if(a[p]!='%')
			{
				result=result+String.valueOf(a[p]);
			}
		}
		System.out.println("The result is");
		System.out.println(result);
	}

}
