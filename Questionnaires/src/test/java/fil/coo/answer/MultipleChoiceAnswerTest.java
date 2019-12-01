package fil.coo.answer;

import java.util.ArrayList;

import fil.coo.YesNo;
import fil.coo.ui.cli.MultipleChoiceAnswerCLI;
import fil.coo.ui.cli.NumericalAnswerCLI;
import fil.coo.ui.cli.TextAnswerCLI;
import fil.coo.ui.cli.YesNoAnswerCLI;

public class MultipleChoiceAnswerTest extends AnswerTest {

	@Override
	protected Answer<?> getAnswerInstance() {
		ArrayList<Answer<?>> answers = new ArrayList<Answer<?>>();
		answers.add(new NumericalAnswer(6, new NumericalAnswerCLI()));
		answers.add(new TextAnswer("test", new TextAnswerCLI()));
		answers.add(new YesNoAnswer(YesNo.Yes, new YesNoAnswerCLI()));
		return new MultipleChoiceAnswer(answers, new MultipleChoiceAnswerCLI());
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
