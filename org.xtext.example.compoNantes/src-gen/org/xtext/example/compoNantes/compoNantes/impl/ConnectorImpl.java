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
import org.xtext.example.compoNantes.compoNantes.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#isType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getInt1 <em>Int1</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl#getInt2 <em>Int2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector
{
  /**
   * The default value of the '{@link #isType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isType()
   * @generated
   * @ordered
   */
  protected static final boolean TYPE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isType()
   * @generated
   * @ordered
   */
  protected boolean type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getInt1() <em>Int1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt1()
   * @generated
   * @ordered
   */
  protected Interface int1;

  /**
   * The cached value of the '{@link #getInt2() <em>Int2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInt2()
   * @generated
   * @ordered
   */
  protected Interface int2;

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
  public boolean isType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(boolean newType)
  {
    boolean oldType = type;
    type = newType;
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
  public Interface getInt1()
  {
    if (int1 != null && int1.eIsProxy())
    {
      InternalEObject oldInt1 = (InternalEObject)int1;
      int1 = (Interface)eResolveProxy(oldInt1);
      if (int1 != oldInt1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.CONNECTOR__INT1, oldInt1, int1));
      }
    }
    return int1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInt1()
  {
    return int1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt1(Interface newInt1)
  {
    Interface oldInt1 = int1;
    int1 = newInt1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.CONNECTOR__INT1, oldInt1, int1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInt2()
  {
    if (int2 != null && int2.eIsProxy())
    {
      InternalEObject oldInt2 = (InternalEObject)int2;
      int2 = (Interface)eResolveProxy(oldInt2);
      if (int2 != oldInt2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.CONNECTOR__INT2, oldInt2, int2));
      }
    }
    return int2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInt2()
  {
    return int2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInt2(Interface newInt2)
  {
    Interface oldInt2 = int2;
    int2 = newInt2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.CONNECTOR__INT2, oldInt2, int2));
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
        return isType();
      case CompoNantesPackage.CONNECTOR__NAME:
        return getName();
      case CompoNantesPackage.CONNECTOR__INT1:
        if (resolve) return getInt1();
        return basicGetInt1();
      case CompoNantesPackage.CONNECTOR__INT2:
        if (resolve) return getInt2();
        return basicGetInt2();
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
        setType((Boolean)newValue);
        return;
      case CompoNantesPackage.CONNECTOR__NAME:
        setName((String)newValue);
        return;
      case CompoNantesPackage.CONNECTOR__INT1:
        setInt1((Interface)newValue);
        return;
      case CompoNantesPackage.CONNECTOR__INT2:
        setInt2((Interface)newValue);
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
      case CompoNantesPackage.CONNECTOR__INT1:
        setInt1((Interface)null);
        return;
      case CompoNantesPackage.CONNECTOR__INT2:
        setInt2((Interface)null);
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
      case CompoNantesPackage.CONNECTOR__INT1:
        return int1 != null;
      case CompoNantesPackage.CONNECTOR__INT2:
        return int2 != null;
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
