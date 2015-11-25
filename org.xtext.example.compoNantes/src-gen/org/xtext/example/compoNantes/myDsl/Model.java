/**
 */
package org.xtext.example.compoNantes.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.myDsl.Model#getSystems <em>Systems</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.myDsl.System}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systems</em>' containment reference list.
   * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getModel_Systems()
   * @model containment="true"
   * @generated
   */
  EList<org.xtext.example.compoNantes.myDsl.System> getSystems();

} // Model
