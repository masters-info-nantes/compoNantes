/**
 */
package org.xtext.example.compoNantes.compoNantes;

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
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Model#getSubsystem <em>Subsystem</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Subsystem</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.compoNantes.Truc}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsystem</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsystem</em>' containment reference list.
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getModel_Subsystem()
   * @model containment="true"
   * @generated
   */
  EList<Truc> getSubsystem();

} // Model
