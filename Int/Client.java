package Int;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Expression isMale=getMaleExpression();
		Expression isMarriedWoman=getMarriedWomanExpression();
		
		System.out.println("John is male?"+isMale.interpret(""));
		System.out.println("Julie is a married woman?"+
		isMarriedWoman.interpret("Married Julie"));
	}

	private static Expression getMarriedWomanExpression() {
		// TODO Auto-generated method stub
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new OrExpression(julie,married);
	}

	private static Expression getMaleExpression() {
		// TODO Auto-generated method stub
		Expression robert=new TerminalExpression("Robert");
		Expression john=new TerminalExpression("John");
		return new OrExpression(robert,john);
	}

}
