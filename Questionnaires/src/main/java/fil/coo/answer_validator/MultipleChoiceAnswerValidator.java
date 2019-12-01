package fil.coo.answer_validator;

import fil.coo.Global;

public class MultipleChoiceAnswerValidator extends AnswerValidator {

	@Override
	public boolean accept(String answer) {
		return answer.indexOf((Global.MULTI_CHOICE_SEPARATOR)) != -1;
	}

}
