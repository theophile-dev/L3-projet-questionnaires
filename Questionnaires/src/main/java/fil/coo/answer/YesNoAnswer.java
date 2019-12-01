package fil.coo.answer;

import fil.coo.YesNo;
import fil.coo.answer_validator.YesNoValidator;

public class YesNoAnswer extends Answer<YesNo> {

	public static final YesNoValidator answerValidator = new YesNoValidator();
	
	public YesNoAnswer(YesNo answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		if (answerValidator.accept(answer)) {
		return this.getAnswerContent() == YesNo.valueOf(answer);
		} else {
			return false;
		}
	}
	
}
