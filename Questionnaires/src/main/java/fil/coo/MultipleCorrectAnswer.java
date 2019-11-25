package fil.coo;

import java.util.ArrayList;

public class MultipleCorrectAnswer extends Answer<ArrayList<Answer<?>>> {

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
