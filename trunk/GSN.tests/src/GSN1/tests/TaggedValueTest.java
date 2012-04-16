/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.tests;

import GSN1.GSN1Factory;
import GSN1.TaggedValue;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaggedValueTest extends TestCase {

	/**
	 * The fixture for this Tagged Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TaggedValueTest.class);
	}

	/**
	 * Constructs a new Tagged Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Tagged Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TaggedValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Tagged Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaggedValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GSN1Factory.eINSTANCE.createTaggedValue());
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

} //TaggedValueTest
