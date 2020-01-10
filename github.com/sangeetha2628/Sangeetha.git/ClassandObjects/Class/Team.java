package Class;

public class Team {

	public Team(String teamname, String city) {
		super();
		this.teamname = teamname;
		this.city = city;
	}
	private String teamname;
	private String city;


	public String getteamname() {
		return teamname;
	}

	public void setteamname(String teamname) {
		this.teamname=teamname;
	}
	
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	}