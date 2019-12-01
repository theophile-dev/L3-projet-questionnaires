package fil.coo.answer;

import fil.coo.answer_validator.TextAnswerValidator;

public class TextAnswer extends Answer<String> {
	
	public static final TextAnswerValidator answerValidator = new TextAnswerValidator();

	public TextAnswer(String answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		return answer.contentEquals(getAnswerContent());
	}
	
}
