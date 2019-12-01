package fil.coo.answer_validator;

import fil.coo.Global;

public class MultipleCorrectAnswerValidator extends AnswerValidator {
	@Override
	public boolean accept(String answer) {
		return answer.indexOf((Global.MULTI_CORRECT_SEPARATOR)) != -1;
	}
}
