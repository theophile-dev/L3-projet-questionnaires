package fil.coo.answer_validator;

public class NumericalAnswerValidator extends AnswerValidator {

	@Override
	public boolean accept(String answer) {
		 if (answer == null) {
		        return false;
		    }
		    try {
		        Integer.parseInt(answer);
		    } catch (NumberFormatException nfe) {
		        return false;
		    }
		    return true;
	}

}
