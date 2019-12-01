package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.YesNo;

public class MultipleChoiceAnswerTest extends AnswerTest {

	@Override
	protected Answer<?> getAnswerInstance() {
		ArrayList<Answer<?>> answers = new ArrayList<Answer<?>>();
		answers.add(new NumericalAnswer(6));
		answers.add(new TextAnswer("test"));
		answers.add(new YesNoAnswer(YesNo.Yes));
		return new MultipleChoiceAnswer(answers);
	}

	@Override
	protected String getAnswerString() {
		return "6|test|Yes";
	}

	@Override
	protected String getCorrectAnswerString() {
		return "6";
	}

	@Override
	protected String getWrongAnswerString() {
		return "test";
	}



}
