import java.util.*;

public class cthwhile
{
	public static void main (String argc [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("masukan jumlah data: " );
		
		int max = 0;
		int min = 99;
		double rata= 0.0;
		
		int jmldata= sc.nextInt();
		int sum=0;
		int count = 0;
		while (count < jmldata)
		{
			sum += sc.nextInt();
			count++;
		}
		rata= sum/(double)jmldata;
		System.out.println("sum : " +sum);
		System.out.println("arg : " +rata);
		System.out.println("max : " +max);
		System.out.println("min : " +min);
	}
	
}
