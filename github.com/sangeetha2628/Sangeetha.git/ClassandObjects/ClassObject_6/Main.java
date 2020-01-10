package ClassObject_6;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String plname=s.next();
		String plpos=s.next();
		Player pl=new Player(plname,plpos);
		System.out.println(pl.getpp());
		System.out.println(pl.getpn());
		

	}

}
