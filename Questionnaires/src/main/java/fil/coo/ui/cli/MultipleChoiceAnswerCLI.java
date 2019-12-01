package fil.coo.ui.cli;

import java.util.ArrayList;

import fil.coo.answer.Answer;
import fil.coo.ui.MultipleChoiceAnswerUI;

public class MultipleChoiceAnswerCLI extends AnswerCLI implements MultipleChoiceAnswerUI {
	
	private ArrayList<Answer<?>> content;

	@Override
	public void setContent(ArrayList<Answer<?>> content) {
		this.content = content;
	}
	
	@Override
	public void displayQuestion() {
		super.displayQuestion();
		String possibleChoice="| ";
		for(Answer<?> answer: content) {
			possibleChoice+= answer.answerContentToString()+ " |";
		}
		System.out.println("this is a multiple choice :" + possibleChoice);
	}

}
