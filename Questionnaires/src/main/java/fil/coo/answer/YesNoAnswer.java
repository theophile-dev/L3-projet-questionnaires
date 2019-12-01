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
		String answerWithoutSpace = answer.replaceAll("\\s+","");
		if (answerValidator.accept(answerWithoutSpace)) {
		return this.getAnswerContent() == YesNo.valueOf(answerWithoutSpace);
		} else {
			return false;
		}
	}

	@Override
	public String answerContentToString() {
		return this.getAnswerContent().toString();
	}
	
}
