package fil.coo;

import java.util.ArrayList;

public class MultipleChoiceAnswer extends Answer<ArrayList<Answer<?>>> {

	public MultipleChoiceAnswer(ArrayList<Answer<?>> answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		Answer<?> correctAnswer = this.getAnswerContent().get(0);
		return correctAnswer.correctAnswer(answer);
	}

}
