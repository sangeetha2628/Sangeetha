package InterfaceCasestudy;

public class RegularCanvas extends Canvas implements iPaint {

	public RegularCanvas(String typeofpaint, int canvassize) {
		super(typeofpaint, canvassize);
		
	}

	public void paint()
	{
		if(typeofpaint.equals("water"))
		{
			System.out.println("Paint a flower size is  "+this.canvassize);
		}
		else
		{
			System.out.println("Cannot paint.Type is mismatched.Please Water Paints required for Regular Canvas");
		}
	}
}
