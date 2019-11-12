package fil.coo;

public abstract class Answer<T> {
		
	private T answerContent;
	
	public T getAnswerContent() {
		return answerContent;
	}

	public Answer(T answerContent) {
		this.answerContent = answerContent;
	}

	public abstract boolean accept(String answer);
	
	public abstract boolean correctAnswer(String answer);

}
