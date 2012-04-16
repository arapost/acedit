/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.tests;

import GSN1.AwayContext;
import GSN1.GSN1Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Away Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AwayContextTest extends ContextualElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AwayContextTest.class);
	}

	/**
	 * Constructs a new Away Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Away Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AwayContext getFixture() {
		return (AwayContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GSN1Factory.eINSTANCE.createAwayContext());
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

} //AwayContextTest
