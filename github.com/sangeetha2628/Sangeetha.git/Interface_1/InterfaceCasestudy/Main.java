package InterfaceCasestudy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String typeofpaint;
		int canvassize;
		Scanner s=new Scanner(System.in);
		typeofpaint=s.nextLine();
		canvassize=s.nextInt();
		if(typeofpaint.equals("water"))
		{
		RegularCanvas regcan = new RegularCanvas(typeofpaint,canvassize);
		regcan.paint();
		}
		else if(typeofpaint.equals("glass"))
		{
		GlassCanvas glasscan = new GlassCanvas(typeofpaint,canvassize);
		glasscan.paint();
		}
		else if(typeofpaint.equals("oil")){
		OilCanvas oilcan=new OilCanvas (typeofpaint,canvassize);
		oilcan.paint();
		}
		else
		{
			System.out.print("Option not available");
		}
	}



	}

