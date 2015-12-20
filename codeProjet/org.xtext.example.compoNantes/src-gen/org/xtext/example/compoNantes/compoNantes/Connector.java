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
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt_from <em>Int from</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt_to <em>Int to</em>}</li>
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
   * The literals are from the enumeration {@link org.xtext.example.compoNantes.compoNantes.ConnectorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.compoNantes.compoNantes.ConnectorType
   * @see #setType(ConnectorType)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Type()
   * @model
   * @generated
   */
  ConnectorType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.compoNantes.compoNantes.ConnectorType
   * @see #getType()
   * @generated
   */
  void setType(ConnectorType value);

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
   * Returns the value of the '<em><b>Int from</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int from</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int from</em>' reference.
   * @see #setInt_from(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Int_from()
   * @model
   * @generated
   */
  Interface getInt_from();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt_from <em>Int from</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int from</em>' reference.
   * @see #getInt_from()
   * @generated
   */
  void setInt_from(Interface value);

  /**
   * Returns the value of the '<em><b>Int to</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int to</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int to</em>' reference.
   * @see #setInt_to(Interface)
   * @see org.xtext.example.compoNantes.compoNantes.CompoNantesPackage#getConnector_Int_to()
   * @model
   * @generated
   */
  Interface getInt_to();

  /**
   * Sets the value of the '{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt_to <em>Int to</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int to</em>' reference.
   * @see #getInt_to()
   * @generated
   */
  void setInt_to(Interface value);

} // Connector
