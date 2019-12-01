package fil.coo.Question;

import fil.coo.answer.Answer;
import fil.coo.ui.UI;

public class Question {
	
	private String question;
	private Answer<?> answer;
	
	public Question(String question, Answer<?> answer) {
		this.question = question;
		this.answer = answer;
	}
	
	/**
	 * Ask the question to the user
	 * @return number of point earned
	 */
	public  int askQuestion() {
		UI userInterface = this.answer.getUserInterface();
		userInterface.displayQuestion();
		if (this.answer.correctAnswer(userInterface.getUserAnswer())) {
			return this.answer.getPoint();
		} else {
			return 0;
		}			
	}
}
