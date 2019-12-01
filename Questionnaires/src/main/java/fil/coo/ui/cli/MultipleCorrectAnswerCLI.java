package fil.coo.ui.cli;

import fil.coo.ui.MultipleCorrectAnswerUI;

public class MultipleCorrectAnswerCLI extends AnswerCLI implements MultipleCorrectAnswerUI {
	@Override
	public void displayQuestion() {
		super.displayQuestion();
		System.out.println("there is multiple correct answer possible");
	}
}
 