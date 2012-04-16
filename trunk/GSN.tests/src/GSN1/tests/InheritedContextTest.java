/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.tests;

import GSN1.GSN1Factory;
import GSN1.InheritedContext;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Inherited Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritedContextTest extends ContextualElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InheritedContextTest.class);
	}

	/**
	 * Constructs a new Inherited Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritedContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Inherited Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InheritedContext getFixture() {
		return (InheritedContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GSN1Factory.eINSTANCE.createInheritedContext());
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

} //InheritedContextTest
