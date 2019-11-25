package fil.coo;

public class YesNoAnswer extends Answer<YesNo> {

	public static final TextAnswerValidator answerValidator = new TextAnswerValidator();
	
	public YesNoAnswer(YesNo answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		return this.getAnswerContent() == YesNo.valueOf(answer);
	}

}
