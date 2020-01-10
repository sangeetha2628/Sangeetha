package Class;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String teamname=s.next();
		String city=s.next();
		Team team=new Team(teamname,city);
		System.out.println(team.getteamname());
		System.out.println(team.getcity());
		
		

		
		
	}

}
