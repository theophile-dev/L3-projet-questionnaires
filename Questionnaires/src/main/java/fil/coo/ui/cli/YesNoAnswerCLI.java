package fil.coo.ui.cli;

import fil.coo.ui.YesNoAnswerUI;

public class YesNoAnswerCLI extends AnswerCLI implements YesNoAnswerUI {
	@Override
	public void displayQuestion() {
		super.displayQuestion();
		System.out.println("the expected answer is Yes or No");
	}
	
	
}
