package InterfaceCasestudy;

public abstract class Canvas {

	
	 String typeofpaint;
	 int canvassize;
	
	public Canvas(String typeofpaint, int canvassize) {
		super();
		this.typeofpaint = typeofpaint;
		this.canvassize = canvassize;
	}

	public String gettypeofpaint() {
		return typeofpaint;
	}

	public void settypeofpaint(String typeofpaint) {
		this.typeofpaint = typeofpaint;
	}

	public int getCanvassize() {
		return canvassize;
	}

	public void setCanvassize(int canvassize) {
		this.canvassize = canvassize;
	}
	
	
}
