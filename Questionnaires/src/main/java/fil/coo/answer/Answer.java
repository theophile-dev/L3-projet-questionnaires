package fil.coo.answer;
import fil.coo.answer_validator.AnswerValidator;
import fil.coo.ui.UI;
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
	private UI userInterface;
	

	public UI getUserInterface() {
		return userInterface;
	}

	public static AnswerValidator answerValidator;
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public abstract String answerContentToString();
	
	public T getAnswerContent() {
		return answerContent;
	}

	public Answer(T answerContent, UI userInterface) {
		this.answerContent = answerContent;
		this.userInterface = userInterface;
	}
	
	public abstract boolean correctAnswer(String answer);

}
