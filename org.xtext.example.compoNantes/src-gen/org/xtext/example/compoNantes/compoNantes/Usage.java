/**
 */
package org.xtext.example.compoNantes.compoNantes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Usage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' reference.
   * @see #setInterface(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getUsage_Interface()
   * @model
   * @generated
   */
  Interface getInterface();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Usage#getInterface <em>Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' reference.
   * @see #getInterface()
   * @generated
   */
  void setInterface(Interface value);

} // Usage
