package LapClass;

import java.util.Scanner;

import Class.Team;

public class Lap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte lno=s.nextByte();
		byte thm=s.nextByte();
		String fp=s.next();
		float ft=s.nextFloat();
		LapRecord lr=new LapRecord(lno,thm,fp,ft);
		System.out.println(lr.getlno());
		System.out.println(lr.getthm());
		System.out.println(lr.getfp());
		System.out.println(lr.getft());
			
		
	}

}
