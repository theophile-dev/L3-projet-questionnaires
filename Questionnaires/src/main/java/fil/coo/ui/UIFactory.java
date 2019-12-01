package fil.coo.ui;

/**
 * 
 * @author theophile
 * 
 * Because java is bad / I haven't find out any other way to do it
 * You need to make every child subclass implement the singleton design pattern like this :
 * 
 * private static CLIFactory factoryInstance = null;	
 * private XXXFactory() {}
 * 
 *Override
 *public static XXXFactory getFactory() {
 *
 *		if (factoryInstance == null) {
 *			factoryInstance = new XXXFactory();
 *		}
 *		return factoryInstance;
 *
 *}
 * 
 *
 */
public abstract class UIFactory {
		
	public abstract MultipleChoiceAnswerUI getMultipleChoiceAnswerUI();
	public abstract MultipleCorrectAnswerUI getMultipleCorrectAnswerUI();
	public abstract NumericalAnswerUI getNumericalAnswerUI();
	public abstract TextAnswerUI getTextAnswerUI();
	public abstract YesNoAnswerUI getYesNoAnswerUI();
	
}
