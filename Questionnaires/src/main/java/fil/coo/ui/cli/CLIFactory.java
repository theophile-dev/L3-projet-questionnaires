package fil.coo.ui.cli;

import fil.coo.ui.MultipleChoiceAnswerUI;
import fil.coo.ui.MultipleCorrectAnswerUI;
import fil.coo.ui.NumericalAnswerUI;
import fil.coo.ui.TextAnswerUI;
import fil.coo.ui.UIFactory;
import fil.coo.ui.YesNoAnswerUI;

public class CLIFactory extends UIFactory {
	
	private static CLIFactory factoryInstance = null;
	
	private CLIFactory() {}

	public static UIFactory getFactory() {
		if (factoryInstance == null) {
			factoryInstance = new CLIFactory();
		}
		return factoryInstance;

	}

	@Override
	public MultipleChoiceAnswerUI getMultipleChoiceAnswerUI() {
		return new MultipleChoiceAnswerCLI();
	}

	@Override
	public MultipleCorrectAnswerUI getMultipleCorrectAnswerUI() {
		return new MultipleCorrectAnswerCLI();
	}

	@Override
	public NumericalAnswerUI getNumericalAnswerUI() {
		return new NumericalAnswerCLI();
	}

	@Override
	public TextAnswerUI getTextAnswerUI() {
		return new TextAnswerCLI();
	}

	@Override
	public YesNoAnswerUI getYesNoAnswerUI() {
		return new YesNoAnswerCLI();
	}

	@Override
	public void displayScore(int score, int maxScore) {
		System.out.println("You score : " + score + "/" + maxScore);
	}

}
