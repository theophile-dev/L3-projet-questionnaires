package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.YesNo;
import fil.coo.ui.cli.MultipleCorrectAnswerCLI;
import fil.coo.ui.cli.TextAnswerCLI;
import fil.coo.ui.cli.YesNoAnswerCLI;
import fil.coo.ui.cli.NumericalAnswerCLI;
public class MultipleCorrectAnswerTest extends AnswerTest {

	@Override
	protected Answer<?> getAnswerInstance() {
		ArrayList<Answer<?>> answers = new ArrayList<Answer<?>>();
		answers.add(new NumericalAnswer(6, new NumericalAnswerCLI()));
		answers.add(new TextAnswer("test", new TextAnswerCLI()));
		answers.add(new YesNoAnswer(YesNo.Yes, new YesNoAnswerCLI()));
		return new MultipleCorrectAnswer(answers, new MultipleCorrectAnswerCLI());
	}

	@Override
	protected String getAnswerString() {
		return "6;test;Yes";
	}

	@Override
	protected String getCorrectAnswerString() {
		return "Yes";
	}

	@Override
	protected String getWrongAnswerString() {
		return "No";
	}

}
