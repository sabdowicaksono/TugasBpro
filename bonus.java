import java.io.*;

public class bonus {
 public static void main (String args [])throws Exception
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  //inisialisasi
  int  Jumlah_baju,bonus,total_item, total_byr ;
  int harga=25000;
  
  //Mulai
  System.out.println("[---------------------------------------------]");
  System.out.println("          Java Beli2 Gratis1     ");
  System.out.println("[---------------------------------------------]");
  System.out.println("");
  System.out.println("");
  System.out.print (" Masukan Jumlah Barang Yang Dibeli : ");
  
  Jumlah_baju = Integer.parseInt(br.readLine()); 
  bonus = Jumlah_baju/2;
  total_item = Jumlah_baju + bonus ;
  total_byr = Jumlah_baju * harga;
  //keluaran
  System.out.println(" Jumlah Bonus : " + bonus);
  
  //keluaran
  System.out.println(" Total Barang Yang Dibawa Pulang : " + total_item );
  System.out.println(" Total pembayaran : " + total_byr);
  
  //keluaran
  System.out.println("--------------------------------------------");
  System.out.println("         SELAMAT BERBELANJA KEMBALI         ");
  System.out.println("--------------------------------------------");
 }
}
