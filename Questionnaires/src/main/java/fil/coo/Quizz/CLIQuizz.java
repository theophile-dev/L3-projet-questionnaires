package fil.coo.Quizz;

import fil.coo.ui.cli.CLIFactory;

public class CLIQuizz extends Quizz {

	public CLIQuizz(String quizzFilePath) {
		super(quizzFilePath, CLIFactory.getFactory());
	}

}
