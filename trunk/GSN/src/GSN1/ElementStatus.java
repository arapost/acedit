/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Element Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see GSN1.GSN1Package#getElementStatus()
 * @model
 * @generated
 */
public enum ElementStatus implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "Undefined", "Undefined"),

	/**
	 * The '<em><b>To Be Developed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BE_DEVELOPED_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BE_DEVELOPED(1, "ToBeDeveloped", "ToBeDeveloped"),

	/**
	 * The '<em><b>To Be Instantiated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BE_INSTANTIATED_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BE_INSTANTIATED(2, "ToBeInstantiated", "ToBeInstantiated"),

	/**
	 * The '<em><b>To Be Developed And Instantiated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_BE_DEVELOPED_AND_INSTANTIATED_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BE_DEVELOPED_AND_INSTANTIATED(3, "ToBeDevelopedAndInstantiated", "ToBeDevelopedAndInstantiated");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>To Be Developed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Be Developed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_BE_DEVELOPED
	 * @model name="ToBeDeveloped"
	 * @generated
	 * @ordered
	 */
	public static final int TO_BE_DEVELOPED_VALUE = 1;

	/**
	 * The '<em><b>To Be Instantiated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Be Instantiated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_BE_INSTANTIATED
	 * @model name="ToBeInstantiated"
	 * @generated
	 * @ordered
	 */
	public static final int TO_BE_INSTANTIATED_VALUE = 2;

	/**
	 * The '<em><b>To Be Developed And Instantiated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To Be Developed And Instantiated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_BE_DEVELOPED_AND_INSTANTIATED
	 * @model name="ToBeDevelopedAndInstantiated"
	 * @generated
	 * @ordered
	 */
	public static final int TO_BE_DEVELOPED_AND_INSTANTIATED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Element Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementStatus[] VALUES_ARRAY =
		new ElementStatus[] {
			UNDEFINED,
			TO_BE_DEVELOPED,
			TO_BE_INSTANTIATED,
			TO_BE_DEVELOPED_AND_INSTANTIATED,
		};

	/**
	 * A public read-only list of all the '<em><b>Element Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementStatus get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case TO_BE_DEVELOPED_VALUE: return TO_BE_DEVELOPED;
			case TO_BE_INSTANTIATED_VALUE: return TO_BE_INSTANTIATED;
			case TO_BE_DEVELOPED_AND_INSTANTIATED_VALUE: return TO_BE_DEVELOPED_AND_INSTANTIATED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ElementStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ElementStatus
