/**
 */
package org.xtext.example.compoNantes.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.myDsl.System#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.myDsl.System#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.myDsl.System#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
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
   * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.myDsl.System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Components</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.myDsl.Component}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Components</em>' containment reference list.
   * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getSystem_Components()
   * @model containment="true"
   * @generated
   */
  EList<Component> getComponents();

  /**
   * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.myDsl.Connector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectors</em>' containment reference list.
   * @see org.xtext.example.compoNantes.myDsl.MyDslPackage#getSystem_Connectors()
   * @model containment="true"
   * @generated
   */
  EList<Connector> getConnectors();

} // System
