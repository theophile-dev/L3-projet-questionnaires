package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.Global;
import fil.coo.YesNo;

public class AnswerFactory {
	
	public final static AnswerFactory FACTORY = new AnswerFactory();
	

	/**
	 * 
	 * @param answer A string representing an answer
	 * @param nestedAnswerAllowed Does the answer contains a multipleChoice/Correct Answer ?
	 * @return An answer instance
	 */
	public Answer<?> buildAnswer(String answer, boolean areNestedAnswerAllowed){
		if (NumericalAnswer.answerValidator.accept(answer)) {
			return new NumericalAnswer(Integer.parseInt(answer));
		} else if(YesNoAnswer.answerValidator.accept(answer)){
			return new YesNoAnswer(YesNo.valueOf(answer));
		} else if (MultipleChoiceAnswer.answerValidator.accept(answer) && areNestedAnswerAllowed){
			return new MultipleChoiceAnswer(answerSplit(answer, Global.MULTI_CHOICE_SEPARATOR));
		} else if (MultipleCorrectAnswer.answerValidator.accept(answer) && areNestedAnswerAllowed){
			return new MultipleCorrectAnswer(answerSplit(answer, Global.MULTI_CORRECT_SEPARATOR));
		} else {
			return new TextAnswer(answer);
		}
	}
	
	/**
	 * Split a string into multiple answer, doesn't allows nested multipleAnswer
	 * @param answer A string containing multiple answer
	 * @param separator The separator used to split the string
	 * @return An array of Answer instances
	 */
	private ArrayList<Answer<?>> answerSplit(String answer, char separator) {
		String[] answers = answer.split("\\"+separator);
		ArrayList<Answer<?>> answersArray = new ArrayList<Answer<?>>();
		for(String ans : answers) {
			answersArray.add(this.buildAnswer(ans, false));
		}
		return answersArray;
	}

}
