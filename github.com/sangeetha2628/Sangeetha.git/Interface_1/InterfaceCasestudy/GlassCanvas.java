package InterfaceCasestudy;

public class GlassCanvas extends Canvas implements iPaint  {

	public GlassCanvas(String typeofpaint, int canvassize) {
		super(typeofpaint, canvassize);
		
	}

	public void paint()
	{
		if(typeofpaint.equals("glass"))
		{
			System.out.println("Paint a hourglass size is "+this.canvassize);
		}
		else
		{
			System.out.println("Cannot paint.Type mismatch. Glass Paints required for Glass Canvas");
		}
	}
}
