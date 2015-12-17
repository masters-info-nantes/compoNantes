/**
 */
package org.xtext.example.compoNantes.compoNantes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.compoNantes.compoNantes.CompoNantesPackage;
import org.xtext.example.compoNantes.compoNantes.Connector;
import org.xtext.example.compoNantes.compoNantes.ConnectorType;
import org.xtext.example.compoNantes.compoNantes.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getInt_from <em>Int from</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getInt_to <em>Int to</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ConnectorType TYPE_EDEFAULT = ConnectorType.ASSEMBLY;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ConnectorType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInt_from() <em>Int from</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt_from()
   * @generated
   * @ordered
   */
  protected Interface int_from;

  /**
   * The cached value of the '{@link #getInt_to() <em>Int to</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt_to()
   * @generated
   * @ordered
   */
  protected Interface int_to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CompoNantesPackage.Literals.CONNECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectorType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ConnectorType newType)
  {
    ConnectorType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.CONNECTOR__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.CONNECTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInt_from()
  {
    if (int_from != null && int_from.eIsProxy())
    {
      InternalEObject oldInt_from = (InternalEObject)int_from;
      int_from = (Interface)eResolveProxy(oldInt_from);
      if (int_from != oldInt_from)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.CONNECTOR__INT_FROM, oldInt_from, int_from));
      }
    }
    return int_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInt_from()
  {
    return int_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt_from(Interface newInt_from)
  {
    Interface oldInt_from = int_from;
    int_from = newInt_from;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.CONNECTOR__INT_FROM, oldInt_from, int_from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInt_to()
  {
    if (int_to != null && int_to.eIsProxy())
    {
      InternalEObject oldInt_to = (InternalEObject)int_to;
      int_to = (Interface)eResolveProxy(oldInt_to);
      if (int_to != oldInt_to)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.CONNECTOR__INT_TO, oldInt_to, int_to));
      }
    }
    return int_to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInt_to()
  {
    return int_to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt_to(Interface newInt_to)
  {
    Interface oldInt_to = int_to;
    int_to = newInt_to;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.CONNECTOR__INT_TO, oldInt_to, int_to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CompoNantesPackage.CONNECTOR__TYPE:
        return getType();
      case CompoNantesPackage.CONNECTOR__NAME:
        return getName();
      case CompoNantesPackage.CONNECTOR__INT_FROM:
        if (resolve) return getInt_from();
        return basicGetInt_from();
      case CompoNantesPackage.CONNECTOR__INT_TO:
        if (resolve) return getInt_to();
        return basicGetInt_to();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CompoNantesPackage.CONNECTOR__TYPE:
        setType((ConnectorType)newValue);
        return;
      case CompoNantesPackage.CONNECTOR__NAME:
        setName((String)newValue);
        return;
      case CompoNantesPackage.CONNECTOR__INT_FROM:
        setInt_from((Interface)newValue);
        return;
      case CompoNantesPackage.CONNECTOR__INT_TO:
        setInt_to((Interface)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CompoNantesPackage.CONNECTOR__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CompoNantesPackage.CONNECTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CompoNantesPackage.CONNECTOR__INT_FROM:
        setInt_from((Interface)null);
        return;
      case CompoNantesPackage.CONNECTOR__INT_TO:
        setInt_to((Interface)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CompoNantesPackage.CONNECTOR__TYPE:
        return type != TYPE_EDEFAULT;
      case CompoNantesPackage.CONNECTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CompoNantesPackage.CONNECTOR__INT_FROM:
        return int_from != null;
      case CompoNantesPackage.CONNECTOR__INT_TO:
        return int_to != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ConnectorImpl
