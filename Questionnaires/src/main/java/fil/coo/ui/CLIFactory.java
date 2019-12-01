package fil.coo.ui;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MultipleCorrectAnswerUI getMultipleCorrectAnswerUI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NumericalAnswerUI getNumericalAnswerUI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TextAnswerUI getTextAnswerUI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public YesNoAnswerUI getYesNoAnswerUI() {
		// TODO Auto-generated method stub
		return null;
	}

}
