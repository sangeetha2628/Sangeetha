package ClassandObjects;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args)throws IOException  {
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
String plna=br.readLine();
String plpo=br.readLine();
Player pl=new Player(plna,plpo);
pl.display();



	}

}
