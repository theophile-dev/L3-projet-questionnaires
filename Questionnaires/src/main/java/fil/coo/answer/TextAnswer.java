package fil.coo.answer;

import fil.coo.answer_validator.TextAnswerValidator;
import fil.coo.ui.TextAnswerUI;

public class TextAnswer extends Answer<String> {
	
	public static final TextAnswerValidator answerValidator = new TextAnswerValidator();

	public TextAnswer(String answerContent, TextAnswerUI textAnswerUI) {
		super(answerContent, textAnswerUI);
	}

	@Override
	public boolean correctAnswer(String answer) {
		return answer.replaceAll("\\s+","").toLowerCase().contentEquals(
				getAnswerContent().replaceAll("\\s+","").toLowerCase());
	}

	@Override
	public String answerContentToString() {
		return this.getAnswerContent();
	}
	
	
	
}
