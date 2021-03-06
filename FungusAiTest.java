package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FungusAiTest</code> contains tests for the class <code>{@link FungusAi}</code>.
 *
 * @generatedBy CodePro at 5/19/18 11:37 AM
 * @author Aaron
 * @version $Revision: 1.0 $
 */
public class FungusAiTest {
	/**
	 * Run the FungusAi(Creature,StuffFactory) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	@Test
	public void testFungusAi_1()
		throws Exception {
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		StuffFactory factory = new StuffFactory(new World(new Tile[][][] {}));

		FungusAi result = new FungusAi(creature, factory);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	@Test
	public void testOnUpdate_1()
		throws Exception {
		FungusAi fixture = new FungusAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new StuffFactory(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	@Test
	public void testOnUpdate_2()
		throws Exception {
		FungusAi fixture = new FungusAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new StuffFactory(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void onUpdate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	@Test
	public void testOnUpdate_3()
		throws Exception {
		FungusAi fixture = new FungusAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), new StuffFactory(new World(new Tile[][][] {})));
		fixture.creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.onUpdate();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/19/18 11:37 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FungusAiTest.class);
	}
}