package LapClass;

public class LapRecord {
	private byte lno;
	private byte thm;
	private String fp;
	private float ft;

	public LapRecord(byte lno, byte thm, String fp, float ft) {
		super();
		this.lno=lno;
		this.thm=thm;
		this.fp=fp;
		this.ft=ft;
	}	
	public byte getlno() {
		return lno;
	}
	
		
	public void setlno(byte lno) {
		this.lno=lno;
	}
	
	public byte getthm() {
		return thm;
	}
	
		
	public void setthm(byte thm) {
		this.thm=thm;
	}
	
	public String getfp() {
		return fp;
	}
	
		
	public void setfp(String fp) {
		this.fp=fp;
	}
	
	
	public Float getft() {
		return ft;
	}
	
		
	public void setft(Float ft) {
		this.ft=ft;
	}
	
	

		
	}



