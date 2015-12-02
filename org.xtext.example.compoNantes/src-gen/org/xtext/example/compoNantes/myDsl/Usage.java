/**
 */
package org.xtext.example.compoNantes.myDsl;

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
 *   <li>{@link org.xtext.example.compoNantes.myDsl.Usage#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(Component)
   * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getUsage_Component()
   * @model
   * @generated
   */
  Component getComponent();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.myDsl.Usage#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(Component value);

} // Usage
