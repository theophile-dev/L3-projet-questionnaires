package fil.coo.ui;

import java.util.ArrayList;

import fil.coo.answer.Answer;

public interface  MultipleChoiceAnswerUI extends UI {
	public abstract void setContent(ArrayList<Answer<?>> content);
}
