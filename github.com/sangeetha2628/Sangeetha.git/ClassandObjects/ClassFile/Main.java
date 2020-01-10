package ClassFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
String tem=br.readLine();
String city=br.readLine();
Team te=new Team(tem,city);
te.display();
	}

}
