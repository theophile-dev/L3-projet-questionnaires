package fil.coo;

public class AnswerFactory {
	
	public final static AnswerFactory FACTORY = new AnswerFactory();
	
	private static final char MULTI_ANSWER_SEPARATOR = ';';
	private static final char MULTI_CHOICE_SEPARATOR = '|';
	
	public Answer<?> buildAnswer(String answer){
		if (NumericalAnswer.answerValidator.accept(answer)) {
			return new NumericalAnswer(new Integer(answer));
		} else if (YesNoAnswer.answerValidator.accept(answer)){
			return new YesNoAnswer(YesNo.valueOf(answer));
		} else if ()
	}

}
