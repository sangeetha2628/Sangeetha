package OverRiding;

import java.util.Scanner;
public class Main {

public static void main(String[] args) {
LapManager lpmn = new LapManager();
Scanner s=new Scanner(System.in);
int n,i;
n=s.nextInt();
byte lapnum ;
byte thmd;
String fp;
float ft;
Lap lp[] = new Lap[n];
for(i=0;i<n;i++)
{
lapnum=s.nextByte();
thmd=s.nextByte();
fp=s.next();
ft=s.nextFloat();
lp[i]=new Lap(lapnum,thmd,fp,ft);

}
lpmn.displayAllLaps(lp);

}

}

