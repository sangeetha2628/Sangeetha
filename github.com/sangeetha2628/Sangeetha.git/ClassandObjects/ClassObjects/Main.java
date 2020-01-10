package ClassObjects;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
   InputStreamReader a=new InputStreamReader(System.in);
   BufferedReader b=new BufferedReader(a); 
   byte mp=Byte.parseByte(b.readLine());
   byte nw=Byte.parseByte(b.readLine());
   byte nl=Byte.parseByte(b.readLine());
   float avgls=Float.parseFloat(b.readLine());
   float maxls=Float.parseFloat(b.readLine());
   float avgtd=Float.parseFloat(b.readLine());
   float maxtd=Float.parseFloat(b.readLine());
   PlayerRecord pl=new PlayerRecord(mp,nw,nl,avgls,maxls,avgtd,maxtd);
   pl.display();
	}

}
