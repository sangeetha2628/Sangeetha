package InterfaceCasestudy;

public class OilCanvas extends Canvas implements iPaint {
	
		
		public OilCanvas(String typeofpaint, int canvassize) {
		super(typeofpaint, canvassize);
		
	}

		
		public void paint()
		{
			if(this.typeofpaint.equals("oil" ))
			{
				System.out.println("Paint a windmill size is"+this.canvassize);
			}
			else
			{
				System.out.println("Cannot paint.Type is mismatched.Please OilPaints required for Oil Canvas");
			}
		}
	}
