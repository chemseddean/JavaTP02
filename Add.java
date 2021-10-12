public class Add implements Expr {
	private Value value;
	private Expr val;
	public Add(Value value, Expr val) {
		// TODO Auto-generated constructor stub
		this.val = val; 
		this.value = value;
	}
	
	public double eval() {
		return value.eval() + val.eval();
	}
}
