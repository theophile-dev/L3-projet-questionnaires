package fil.coo.ui;

public class TextAnswerCLI extends AnswerCLI implements TextAnswerUI {

	@Override
	public void displayQuestion() {
		super.displayQuestion();
		System.out.println("the expected answer is a text");
	}
	
}
