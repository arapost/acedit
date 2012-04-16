/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.tests;

import GSN1.GSN1Factory;
import GSN1.Solution;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionTest extends SpinalElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionTest.class);
	}

	/**
	 * Constructs a new Solution test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Solution test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Solution getFixture() {
		return (Solution)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GSN1Factory.eINSTANCE.createSolution());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SolutionTest
