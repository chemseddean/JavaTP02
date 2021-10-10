public class Main {

	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		
		Expr mult = new Mult(new Value(327.0), val);
		System.out.println(mult.eval()); //affiche 437199.0
	
		Expr rc = new RacineCarree(new Value(327.0));
		System.out.println(rc); //affiche 437199.0
	}
}
