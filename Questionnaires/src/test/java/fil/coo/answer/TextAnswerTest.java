package fil.coo.answer;

public class TextAnswerTest extends AnswerTest {
	

	public static final  String text = "test";
	
	@Override
	protected Answer<?> getAnswerInstance() {
		return new TextAnswer(text);
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
