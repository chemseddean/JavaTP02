
public class RacineCarree extends Expr{
		private Value value;
		public RacineCarree(Value value) {
			this.value = value;
		}
		
		public double eval() {
			return Math.sqrt(value.eval());
		}

		public String toString() {
			return "\u221a"+this.value+" = "+this.eval();
		}
}
