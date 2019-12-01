package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.Global;
import fil.coo.YesNo;
import fil.coo.ui.UIFactory;

public class AnswerFactory {
	
	public final static AnswerFactory FACTORY = new AnswerFactory();
	

	/**
	 * 
	 * @param answer A string representing an answer
	 * @param nestedAnswerAllowed Does the answer contains a multipleChoice/Correct Answer ?
	 * @return An answer instance
	 */
	public Answer<?> buildAnswer(String answer, boolean areNestedAnswerAllowed, UIFactory uiFactory){
		if (NumericalAnswer.answerValidator.accept(answer)) {
			return new NumericalAnswer(Integer.parseInt(answer), uiFactory.getNumericalAnswerUI());
		} else if(YesNoAnswer.answerValidator.accept(answer)){
			return new YesNoAnswer(YesNo.valueOf(answer), uiFactory.getYesNoAnswerUI());
		} else if (MultipleChoiceAnswer.answerValidator.accept(answer) && areNestedAnswerAllowed){
			return new MultipleChoiceAnswer(answerSplit(answer, Global.MULTI_CHOICE_SEPARATOR, uiFactory),
					uiFactory.getMultipleChoiceAnswerUI());
		} else if (MultipleCorrectAnswer.answerValidator.accept(answer) && areNestedAnswerAllowed){
			return new MultipleCorrectAnswer(answerSplit(answer, Global.MULTI_CORRECT_SEPARATOR, uiFactory),
					uiFactory.getMultipleCorrectAnswerUI());
		} else {
			return new TextAnswer(answer, uiFactory.getTextAnswerUI());
		}
	}
	
	/**
	 * Split a string into multiple answer, doesn't allows nested multipleAnswer
	 * @param answer A string containing multiple answer
	 * @param separator The separator used to split the string
	 * @return An array of Answer instances
	 */
	private ArrayList<Answer<?>> answerSplit(String answer, char separator, UIFactory uiFactory) {
		String[] answers = answer.split("\\"+separator);
		ArrayList<Answer<?>> answersArray = new ArrayList<Answer<?>>();
		for(String ans : answers) {
			answersArray.add(this.buildAnswer(ans, false, uiFactory));
		}
		return answersArray;
	}

}
