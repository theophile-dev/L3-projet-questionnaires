package fil.coo.ui;

public abstract class UIFactory {
		
	public abstract MultipleChoiceAnswerUI getMultipleChoiceAnswerUI();
	public abstract MultipleCorrectAnswerUI getMultipleCorrectAnswerUI();
	public abstract NumericalAnswerUI getNumericalAnswerUI();
	public abstract TextAnswerUI getTextAnswerUI();
	public abstract YesNoAnswerUI getYesNoAnswerUI();
	public abstract void displayScore(int score, int maxScore);
}
