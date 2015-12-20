/**
 */
package org.xtext.example.compoNantes.compoNantes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Interface#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Interface#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Interface#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.compoNantes.compoNantes.InterfaceType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.compoNantes.compoNantes.InterfaceType
   * @see #setType(InterfaceType)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getInterface_Type()
   * @model
   * @generated
   */
  InterfaceType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Interface#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.compoNantes.compoNantes.InterfaceType
   * @see #getType()
   * @generated
   */
  void setType(InterfaceType value);

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
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getInterface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Interface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(Port)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getInterface_Port()
   * @model
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Interface#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

} // Interface
