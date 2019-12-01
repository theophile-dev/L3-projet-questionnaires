package fil.coo.answer;

import fil.coo.YesNo;
import fil.coo.answer_validator.YesNoValidator;
import fil.coo.ui.YesNoAnswerUI;

public class YesNoAnswer extends Answer<YesNo> {

	public static final YesNoValidator answerValidator = new YesNoValidator();
	
	public YesNoAnswer(YesNo answerContent, YesNoAnswerUI yesNoAnswerUI) {
		super(answerContent, yesNoAnswerUI);
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
