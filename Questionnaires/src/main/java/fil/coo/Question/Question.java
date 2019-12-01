package fil.coo.Question;

import fil.coo.answer.Answer;
import fil.coo.ui.UI;

public class Question {
	
	private String question;
	private Answer<?> answer;
	private int maxPoints;
	
	public int getMaxPoints() {
		return maxPoints;
	}

	public Question(String question, Answer<?> answer) {
		this.question = question;
		this.answer = answer;
		this.maxPoints = answer.getPoint();
	}
	
	/**
	 * Ask the question to the user
	 * @return number of point earned
	 */
	public  int askQuestion() {
		UI userInterface = this.answer.getUserInterface();
		userInterface.setQuestionText(question);
		userInterface.displayQuestion();
		if (this.answer.correctAnswer(userInterface.getUserAnswer())) {
			return this.answer.getPoint();
		} else {
			return 0;
		}			
	}
}
