package OverRiding;

public class LapManager {
	public void displayAllLaps(Lap[] lapList)    
	{
	System.out.println("Lap number\tMaxmimum throws\tPlayer Name\tTiming\n");
	for(Lap m:lapList)
	{
	System.out.println(String.format("%-10s\t%-10s\t%-20s\t%-20s",m.lapNo.toString(),m.throwsMade.toString(),m.fastestPlayer.toString(),m.fastestTime.toString()));

	}
	}
}
