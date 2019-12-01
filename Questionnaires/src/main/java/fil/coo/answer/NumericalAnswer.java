package fil.coo.answer;

import fil.coo.answer_validator.NumericalAnswerValidator;

public class NumericalAnswer extends Answer<Integer> {

	public static final NumericalAnswerValidator answerValidator = new NumericalAnswerValidator();
	
	public NumericalAnswer(Integer answerContent) {
		super(answerContent);
	}


	@Override
	public boolean correctAnswer(String answer) {
		if (answerValidator.accept(answer)) {
		return Integer.parseInt(answer) == this.getAnswerContent();
		} else {
			return false;
		}
	}
	
}
