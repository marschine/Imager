
public class Bild {
	private int breite = 8;
	private int hoehe = 8;
	private static final int farbtiefe = 3;
	private char[] pixels;
	
	public Bild() {	
		pixels = new char[breite*hoehe*farbtiefe];
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = (char) i;
		}
	}
	
	public Bild(int hoehe, int breite, char[] pixels) {
		this.hoehe = hoehe;
		this.breite = breite;
		this.pixels = pixels;
	}
	
	public char[] getPixels() {
		return pixels;
	}

	public void setPixels(char[] pixels) {
		this.pixels = pixels;
	}
	
	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	/**
	 *  sets specific color value to a pixel	
	 * @param x - Position 
	 * @param y - Position
	 * @param rgb - specifies if it's the red/green/blue value
	 * 1 - red
	 * 2 - green 
	 * 3 - blue
	 * @param farbe Integer Value that specifies the rgb Value at that Position
	 */
	public void setPixel(int x, int y, int rgb, int farbe) {
		this.pixels[x*y*rgb] = (char) farbe;
	}
	
	public void setPixel(int x, int y, char r, char g, char b) {
		this.pixels[x+(y*breite)+(farbtiefe*0)] = r;
		this.pixels[x+(y*breite)+(farbtiefe*1)] = g;
		this.pixels[x+(y*breite)+(farbtiefe*2)] = g;
		int[] array = new int(1,2);
	}
	
	public char getPixel(int x, int y, int rgb) {
		return pixels[x]
		return '4';
	}

	public static void main(String[] args) {
		Bild bild1 = new Bild();
		char[] pixeltest = {1,2,3};
		Bild bild2 = new Bild(8, 8, pixeltest);
		System.out.println(bild1.pixels.length);

//		System.out.println(bild1.pixels[5]);
	}
	
}
