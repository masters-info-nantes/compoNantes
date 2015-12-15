/**
 */
package org.xtext.example.compoNantes.compoNantes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#isType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt2 <em>Int2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(boolean)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Type()
   * @model
   * @generated
   */
  boolean isType();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#isType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #isType()
   * @generated
   */
  void setType(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Int1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int1</em>' reference.
   * @see #setInt1(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Int1()
   * @model
   * @generated
   */
  Interface getInt1();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt1 <em>Int1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int1</em>' reference.
   * @see #getInt1()
   * @generated
   */
  void setInt1(Interface value);

  /**
   * Returns the value of the '<em><b>Int2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int2</em>' reference.
   * @see #setInt2(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Int2()
   * @model
   * @generated
   */
  Interface getInt2();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt2 <em>Int2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2</em>' reference.
   * @see #getInt2()
   * @generated
   */
  void setInt2(Interface value);

} // Connector
