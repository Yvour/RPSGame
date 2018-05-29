package rpsgame;

import rpsgame.engine.Choice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChoiceTest {
	private Choice rock = Choice.ROCK;
	private Choice paper = Choice.PAPER;
	private Choice scissors = Choice.SCISSORS;

	@Test
	public void equalsMethodTest() {

		// Checking Equals
		if (!rock.getWinner().equals(paper))
			fail("Rock is not beaten by paper with equals");
		if (!paper.getWinner().equals(scissors)) {
			fail("Paper is not beaten by scissors with equals");
		}
		if (!scissors.getWinner().equals(rock)) {
			fail("Scissors are not beaten by rock with equals");
		}

		if (!rock.getBeaten().equals(scissors)) {
			fail("Rock does not win scissors with equals");
		}
		if (!paper.getBeaten().equals(rock)) {
			fail("Paper does not win rock with equals");
		}
		if (!scissors.getBeaten().equals(paper)) {
			fail("Scissors do not win paper with equals");
		}

		assert (true);
	}

	@Test
	public void comparationOperatorTest() {

		// Checking Equals
		if (!rock.getWinner().equals(paper))
			fail("Rock is not beaten by paper");
		if (!paper.getWinner().equals(scissors)) {
			fail("Paper is not beaten by scissors");
		}
		if (!scissors.getWinner().equals(rock)) {
			fail("Scissors are not beaten by rock");
		}

		if (!rock.getBeaten().equals(scissors)) {
			fail("Rock does not win scissors");
		}
		if (!paper.getBeaten().equals(rock)) {
			fail("Paper does not win rock");
		}
		if (!scissors.getBeaten().equals(paper)) {
			fail("Scissors do not win paper");
		}

		assert (true);
	}

}
