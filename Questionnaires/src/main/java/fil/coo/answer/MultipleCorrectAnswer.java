package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.answer_validator.MultipleCorrectAnswerValidator;

public class MultipleCorrectAnswer extends Answer<ArrayList<Answer<?>>> {

	public static final MultipleCorrectAnswerValidator answerValidator = new MultipleCorrectAnswerValidator();
	
	public MultipleCorrectAnswer(ArrayList<Answer<?>> answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		ArrayList<Answer<?>> answers = this.getAnswerContent();
		for (Answer<?> possibleAnswer : answers) {
			if (possibleAnswer.correctAnswer(answer)) {
				return true;
			}
		}
		return false;
	}
	
}
