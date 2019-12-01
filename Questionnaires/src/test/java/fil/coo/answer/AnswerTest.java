package fil.coo.answer;

import static org.junit.Assert.*;
import org.junit.Test;

import fil.coo.ui.cli.CLIFactory;

public abstract class AnswerTest {

	protected abstract Answer<?> getAnswerInstance();
	protected abstract String getAnswerString();
	protected abstract String getCorrectAnswerString();
	protected abstract String getWrongAnswerString();
	
	@Test
	public void AnswerFactoryBuildTheGoodAnswerTest() {
		Answer<?> builtAnswer = AnswerFactory.FACTORY.buildAnswer(this.getAnswerString(), true, CLIFactory.getFactory());
		assertTrue(builtAnswer.getClass().equals(this.getAnswerInstance().getClass()));
		assertTrue(builtAnswer.correctAnswer(this.getCorrectAnswerString()));
		assertFalse(builtAnswer.correctAnswer(this.getWrongAnswerString()));
	}
}
