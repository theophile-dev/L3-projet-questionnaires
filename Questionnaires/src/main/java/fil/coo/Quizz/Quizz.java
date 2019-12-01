package fil.coo.Quizz;

import java.util.ArrayList;

import fil.coo.Question.Question;
import fil.coo.Question.QuestionBuilder;
import fil.coo.ui.UIFactory;

public class Quizz {
	
	private ArrayList<Question> questions;
	private String quizzFilePath;
	private int score;
	private int maxScore;
	private UIFactory uiFactory;
	
	public Quizz(String quizzFilePath, UIFactory uiFactory) {
		this.quizzFilePath = quizzFilePath;
		this.uiFactory = uiFactory;
		this.questions = QuestionBuilder.builder.buildQuestions(quizzFilePath, uiFactory);
	}
	
	public void startQuizz() {
		this.askQuestions();
		this.displayScore();
	}
	
	public void askQuestions() {
		for(Question question: this.questions) {
			this.score+=question.askQuestion();
			this.maxScore+=question.getMaxPoints();
			this.displayScore();
		}
	}
	
	public void displayScore() {
		this.uiFactory.displayScore(score, maxScore);
	}
	
}
