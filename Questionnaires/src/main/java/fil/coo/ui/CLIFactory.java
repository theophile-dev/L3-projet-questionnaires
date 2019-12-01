package fil.coo.ui;

import fil.coo.ui.cli.MultipleChoiceAnswerCLI;
import fil.coo.ui.cli.MultipleCorrectAnswerCLI;
import fil.coo.ui.cli.NumericalAnswerCLI;
import fil.coo.ui.cli.TextAnswerCLI;
import fil.coo.ui.cli.YesNoAnswerCLI;

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

}
