package fil.coo;

public class TextAnswer extends Answer<String> {

	public TextAnswer(String answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		
		return false;
	}

}
