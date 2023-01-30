public class Clase1 {
	public int ID;
	

	
	public Clase1(int ID) {
			this.ID = ID;
	}
	
	public double cPCi() {
		return(double) (2*3.14*ID);
	}
	

	
	public double cACi() {
		return (double) ID * ID * 3.14;
	}
	

	public double cPCu() {
		return(double) ID*4;
}
	public double cACu() {
		return (double) ID*ID;
} 	
}