package fil.coo;

import fil.coo.answer.Answer;

public class Question {
	
	private String question;
	private Answer<?> answer;
	
	public Question(String question, Answer<?> answer) {
		this.question = question;
		this.answer = answer;
	}
	/**
	 * Ask the question to the user
	 * @return number of point earned
	 */
	public  int askQuestion() {
		return 0;
		
	}
		
	public String getQuestion() {
		return question;
	}

	public Answer<?> getAnswer() {
		return answer;
	}

}
