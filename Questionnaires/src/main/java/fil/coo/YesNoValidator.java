package fil.coo;

public class YesNoValidator extends AnswerValidator {

	@Override
	public boolean accept(String answer) {
		 if (answer == null) {
		        return false;
		    }
		    try {
		        YesNo.valueOf(answer);
		    } catch (IllegalArgumentException iae) {
		        return false;
		    }
		    return true;
	}

}
