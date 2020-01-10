package ClassObjects;

public class PlayerRecord {

	
	public PlayerRecord(byte matchesplayed, byte numofwins, byte numoflos, float avglsp, float maxlsp, float avgtdis,
			float maxtdis) {
		super();
		this.matchesplayed = matchesplayed;
		this.numofwins = numofwins;
		this.numoflos = numoflos;
		this.avglsp = avglsp;
		this.maxlsp = maxlsp;
		this.avgtdis = avgtdis;
		this.maxtdis = maxtdis;
	}
	private byte matchesplayed,numofwins,numoflos;
	private float avglsp,maxlsp,avgtdis,maxtdis;
	
	public void display() {
	System.out.println(matchesplayed);
	System.out.println(numofwins);
	System.out.println(avglsp);
	System.out.println(maxlsp);
	System.out.println(avgtdis);
	System.out.println(maxtdis);
}
}