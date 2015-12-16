/**
 */
package org.xtext.example.compoNantes.compoNantes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Element#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Element#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Element#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Element#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Element#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
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
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.compoNantes.Port}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.compoNantes.Interface}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interfaces</em>' containment reference list.
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement_Interfaces()
   * @model containment="true"
   * @generated
   */
  EList<Interface> getInterfaces();

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.compoNantes.Dependency}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependencies();

  /**
   * Returns the value of the '<em><b>Usages</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.compoNantes.Usage}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usages</em>' containment reference list.
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement_Usages()
   * @model containment="true"
   * @generated
   */
  EList<Usage> getUsages();

  /**
   * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.compoNantes.compoNantes.Connector}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectors</em>' containment reference list.
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getElement_Connectors()
   * @model containment="true"
   * @generated
   */
  EList<Connector> getConnectors();

} // Element