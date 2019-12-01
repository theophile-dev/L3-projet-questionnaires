package fil.coo.ui;

import java.util.Scanner;

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
