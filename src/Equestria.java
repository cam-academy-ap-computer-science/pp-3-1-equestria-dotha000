
public class Equestria {

	public static void main(String[] args) {
		int x1 = 31;
		int y1 = 15;
		int x2 = 35;
		int y2= 9;
		double realDist = distance(x1, x2, y1, y2);
		System.out.println("Distance from (" + x1 + "," + x2 + ") to (" + y1 + "," + y2 + ") = " + realDist);
	}
	public static double distance(int a1, int a2, int b1, int b2) {
		double howFar = a2 - a1;
		howFar = Math.pow(howFar, 2);
		double howFar2 = b2 - b1;
		howFar2 = Math.pow(howFar2, 2);
		double dist = Math.sqrt(howFar + howFar2);
		return dist;
	}

}
