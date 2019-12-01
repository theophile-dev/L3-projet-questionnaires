package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.answer_validator.MultipleChoiceAnswerValidator;
import fil.coo.ui.MultipleChoiceAnswerUI;


public class MultipleChoiceAnswer extends Answer<ArrayList<Answer<?>>> {
	
	public static final MultipleChoiceAnswerValidator answerValidator = new MultipleChoiceAnswerValidator();

	public MultipleChoiceAnswer(ArrayList<Answer<?>> answerContent,MultipleChoiceAnswerUI multipleChoiceAnswerUI) {
		super(answerContent, multipleChoiceAnswerUI);
	}

	@Override
	public boolean correctAnswer(String answer) {
		Answer<?> correctAnswer = this.getAnswerContent().get(0);
		return correctAnswer.correctAnswer(answer);
	}

}
