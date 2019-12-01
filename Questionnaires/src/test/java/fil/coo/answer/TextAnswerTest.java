package fil.coo.answer;

import fil.coo.ui.TextAnswerCLI;

public class TextAnswerTest extends AnswerTest {
	

	public static final  String text = "test";
	
	@Override
	protected Answer<?> getAnswerInstance() {
		return new TextAnswer(text, new TextAnswerCLI());
	}

	@Override
	protected String getAnswerString() {
		return text;
	}

	@Override
	protected String getCorrectAnswerString() {
		return text;
	}

	@Override
	protected String getWrongAnswerString() {
		return "No";
	}

}
