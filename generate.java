
public class generate {

	/**
	 * @param args
	 */
	
	static int brickSize = 10 ;//meters
	float threshhold = 0.0f;
	
	public static Sphere sph = new Sphere();
	
	public static void main(String[] args) {
		
		//create a sphere
		
		sph.rad = brickSize*5;
		sph.segs = sph.rad/brickSize;// the int above
			
		//default values generate diam/(divs + 1) points in an axis 
		//ie inc = 2/3 or .666'
		//2 div .666' = 3 points in an axis 
		
		//float inc = ((float) sph.rad*2)/ ((float) (sph.segs + 1));
		int inc = (int) (sph.rad * 2 /  sph.segs);		
		
		//Extra
		//int interiorPointCount = 0;
		
		//cap axes at 0 for testing
		
		
		//for x
		for (int i=(sph.rad * -1); i <= sph.rad; i+=inc){//diameter
			//CAP to positive k (z) axis
			i=Math.max(i, 0);
			//for y
			
			for(int j=(sph.rad * -1); j <= sph.rad; j+=inc){//diameter
				//CAP to positive k (z) axis
				j=Math.max(j, 0);
				//for z
				
				for (int k=(sph.rad * -1); k <= sph.segs; k+=inc){//diameter
					//CAP to positive k (z) axis
					k=Math.max(k, 0);
					//cubic loop
					if (sph.insideVol(i, j, k)){
						//EXTRA
						//interiorPointCount++;
						//System.out.println("point[" + i + "," + j + "," + k + "] IS inside the sphere");
						/*
						float iF = (float) i;
						float jF = (float) j;
						float kF = (float) k;
						*/
						//System.out.println("point_pos_{" + iF + "," + jF + "," + kF + "}");
						String extra_txt = "point_pos_";
						System.out.println("{" + i + "," + j + "," + k + "}");
						}
					}
				}
			}
			//System.out.println("points in the sphere: " + interiorPointCount);
		}		
}		
