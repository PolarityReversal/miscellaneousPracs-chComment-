public class cylinder_DoubleMethod {
	/* Write a method called cylinderSurfaceArea that accepts a radius and height 
	 * (both real numbers) as parameters and returns the surface area of a 
	 * cylinder with those dimensions.
	 */
	public double cylinderSurfaceArea(double r, double h) {
	    return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
	}
}
//用void+double的组合可在eclipse中跑，但在practice it会有问题，因此需要用上述的pulbic_double + return的玩法