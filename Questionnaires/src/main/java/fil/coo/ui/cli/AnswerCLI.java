package fil.coo.ui.cli;

import java.util.Scanner;

import fil.coo.ui.AnswerUI;

public class AnswerCLI extends AnswerUI {
	
	private static Scanner scanner = new Scanner(System.in);

	@Override
	public void displayQuestion() {
		System.out.println(this.getQuestionText());
	}

	@Override
	public String getUserAnswer() {
	    return scanner.nextLine();
	}
}
