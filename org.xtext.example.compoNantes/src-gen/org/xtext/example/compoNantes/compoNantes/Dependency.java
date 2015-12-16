/**
 */
package org.xtext.example.compoNantes.compoNantes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Dependency#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Dependency#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent1 <em>Component1</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent2 <em>Component2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.compoNantes.compoNantes.DependencyType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.compoNantes.compoNantes.DependencyType
   * @see #setType(DependencyType)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getDependency_Type()
   * @model
   * @generated
   */
  DependencyType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.compoNantes.compoNantes.DependencyType
   * @see #getType()
   * @generated
   */
  void setType(DependencyType value);

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
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getDependency_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Component1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component1</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component1</em>' reference.
   * @see #setComponent1(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getDependency_Component1()
   * @model
   * @generated
   */
  Interface getComponent1();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent1 <em>Component1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component1</em>' reference.
   * @see #getComponent1()
   * @generated
   */
  void setComponent1(Interface value);

  /**
   * Returns the value of the '<em><b>Component2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component2</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component2</em>' reference.
   * @see #setComponent2(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getDependency_Component2()
   * @model
   * @generated
   */
  Interface getComponent2();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent2 <em>Component2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component2</em>' reference.
   * @see #getComponent2()
   * @generated
   */
  void setComponent2(Interface value);

} // Dependency
