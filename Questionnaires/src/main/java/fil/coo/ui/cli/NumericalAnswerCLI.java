package fil.coo.ui.cli;

import fil.coo.ui.NumericalAnswerUI;

public class NumericalAnswerCLI extends AnswerCLI implements NumericalAnswerUI {
	
	@Override
	public void displayQuestion() {
		super.displayQuestion();
		System.out.println("the expected answer is a number");
	}
}
