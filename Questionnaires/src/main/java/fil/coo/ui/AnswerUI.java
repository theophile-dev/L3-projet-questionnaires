package fil.coo.ui;

public abstract class AnswerUI implements UI {
	
	private String questionText;

	public String getQuestionText() {
		return questionText;
	}

	@Override
	public void setQuestionText(String test) {
		this.questionText = test;
	}
	
}