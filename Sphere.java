
public class Sphere {

	/**
	 * @param args
	 */
	
		public static int rad = 1; //default values
		public static int segs = 5;
		//public static boolean insideVol;
		public Sphere(){
			
			//System.out.println("Sphere Made w: rad:" + rad);
			//System.out.println("Sphere Made w: divs:" + divs);
			
			
		}
		public boolean insideVol(float x, float y, float z){
			double xd = (double) x;
			double yd = (double) y;
			double zd = (double) z;
			
			int xi = (int) Math.ceil(xd);
			int yi = (int) Math.ceil(yd);
			int zi = (int) Math.ceil(zd);
			
			//int t = (int) Math.ceil(threshold);
			
			return insideVol(xi, yi, zi);
		}
		
		public boolean insideVol(int x, int y, int z){
			//higher Threshold gives more chance of the point being inside the sphere
			
			//calculate the magnitude of the vector to the surface
			//x^2 + y^2 + z^2 
			//and test if its less than the rad (squared).
			
			//SQREROOTS
			double mag = Math.pow((x*x + y*y + z*z), 1/2);
			//rad = this.rad;
			//rad*=rad;
			if((mag) < Math.pow(rad, 2) ){ //Threshold increases chances
				return true;
			}
			return false;
		}
}

