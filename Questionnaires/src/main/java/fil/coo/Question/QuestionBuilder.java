package fil.coo.Question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import fil.coo.answer.Answer;
import fil.coo.answer.AnswerFactory;
import fil.coo.ui.UIFactory;

public class QuestionBuilder {
	
	public final static QuestionBuilder builder = new QuestionBuilder();
	
	private BufferedReader reader;
	
	private QuestionBuilder() {}
	
	public ArrayList<Question> buildQuestions(String quizzFilePath, UIFactory uiFactory){
		ArrayList<Question> questions = new ArrayList<Question>();
		try {
			reader = new BufferedReader(new FileReader(quizzFilePath));
			String line = reader.readLine();
			int action = 0;
			String questionText = null;
			Answer<?> answer = null;
			while ((line != null) && (line.length()>0)) {
				switch(action) {
				case 0:
					questionText = line;
					break;
				case 1:
					answer = AnswerFactory.FACTORY.buildAnswer(line, true, uiFactory);
					break;
				case 2:
					action = -1;
					answer.setPoint(Integer.parseInt(line));
					questions.add(new Question(questionText, answer));
					break;
				}
				action++;
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return questions;
	}	

}
