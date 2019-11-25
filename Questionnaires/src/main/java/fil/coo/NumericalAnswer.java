package fil.coo;

public class NumericalAnswer extends Answer<Integer> {

	public NumericalAnswer(Integer answerContent) {
		super(answerContent);
	}

	@Override
	public boolean correctAnswer(String answer) {
		return Integer.parseInt(answer) == this.getAnswerContent();
	}

}
