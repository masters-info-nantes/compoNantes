/**
 */
package org.xtext.example.compoNantes.compoNantes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dependency Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getDependencyType()
 * @model
 * @generated
 */
public enum DependencyType implements Enumerator
{
  /**
   * The '<em><b>USAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USAGE_VALUE
   * @generated
   * @ordered
   */
  USAGE(0, "USAGE", "usage"),

  /**
   * The '<em><b>ASSOCIATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSOCIATION_VALUE
   * @generated
   * @ordered
   */
  ASSOCIATION(1, "ASSOCIATION", "association");

  /**
   * The '<em><b>USAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>USAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USAGE
   * @model literal="usage"
   * @generated
   * @ordered
   */
  public static final int USAGE_VALUE = 0;

  /**
   * The '<em><b>ASSOCIATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSOCIATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSOCIATION
   * @model literal="association"
   * @generated
   * @ordered
   */
  public static final int ASSOCIATION_VALUE = 1;

  /**
   * An array of all the '<em><b>Dependency Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DependencyType[] VALUES_ARRAY =
    new DependencyType[]
    {
      USAGE,
      ASSOCIATION,
    };

  /**
   * A public read-only list of all the '<em><b>Dependency Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DependencyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Dependency Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DependencyType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DependencyType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Dependency Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DependencyType get(int value)
  {
    switch (value)
    {
      case USAGE_VALUE: return USAGE;
      case ASSOCIATION_VALUE: return ASSOCIATION;
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
  private DependencyType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DependencyType
