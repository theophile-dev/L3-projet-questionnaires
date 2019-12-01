package fil.coo.answer;

import fil.coo.answer_validator.AnswerValidator;
/**
 * You need to have a static member called answerValidator 
 * in each subclass to shadow this abstract AnswerValidator	
 * @author theophile
 *
 * @param <T> the type of content the answer allows
 */
public abstract class Answer<T> {
		
	private T answerContent;
	private int point;
	

	public static AnswerValidator answerValidator;
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public T getAnswerContent() {
		return answerContent;
	}

	public Answer(T answerContent) {
		this.answerContent = answerContent;
	}
	
	public abstract boolean correctAnswer(String answer);

}
