
public class Value implements Expr{
	private double d; 
	public Value(double d) {
		this.d = d;
	}

	public double eval() {
		// TODO Auto-generated method stub
		return d;
	}
}
