import java.util.*;

public class bilrandom
{
	public static void main (String [] args)
	{
		Scanner k = new Scanner (System.in);
		System.out.print("Masukkan jumlah bilangan random : ");
		
		int n= k.nextInt();
		int i= 0;
		int total= 0;
		int angka= 0;
		
		while (i<n)
		{
		angka=(int) (Math.random()*10.0 );
		System.out.println((i+1) +"=" +angka);
		total +=angka;
		i++;
		}
		System.out.println("Total : "+total);
	}
}
