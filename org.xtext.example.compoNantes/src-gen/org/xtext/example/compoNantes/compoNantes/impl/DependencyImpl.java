/**
 */
package org.xtext.example.compoNantes.compoNantes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.compoNantes.compoNantes.CompoNantesPackage;
import org.xtext.example.compoNantes.compoNantes.Dependency;
import org.xtext.example.compoNantes.compoNantes.DependencyType;
import org.xtext.example.compoNantes.compoNantes.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl#getComponent1 <em>Component1</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl#getComponent2 <em>Component2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DependencyType TYPE_EDEFAULT = DependencyType.USAGE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DependencyType type = TYPE_EDEFAULT;

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
   * The cached value of the '{@link #getComponent1() <em>Component1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent1()
   * @generated
   * @ordered
   */
  protected Interface component1;

  /**
   * The cached value of the '{@link #getComponent2() <em>Component2</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent2()
   * @generated
   * @ordered
   */
  protected Interface component2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return CompoNantesPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DependencyType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DependencyType newType)
  {
    DependencyType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.DEPENDENCY__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.DEPENDENCY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getComponent1()
  {
    if (component1 != null && component1.eIsProxy())
    {
      InternalEObject oldComponent1 = (InternalEObject)component1;
      component1 = (Interface)eResolveProxy(oldComponent1);
      if (component1 != oldComponent1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.DEPENDENCY__COMPONENT1, oldComponent1, component1));
      }
    }
    return component1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetComponent1()
  {
    return component1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent1(Interface newComponent1)
  {
    Interface oldComponent1 = component1;
    component1 = newComponent1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.DEPENDENCY__COMPONENT1, oldComponent1, component1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getComponent2()
  {
    if (component2 != null && component2.eIsProxy())
    {
      InternalEObject oldComponent2 = (InternalEObject)component2;
      component2 = (Interface)eResolveProxy(oldComponent2);
      if (component2 != oldComponent2)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.DEPENDENCY__COMPONENT2, oldComponent2, component2));
      }
    }
    return component2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetComponent2()
  {
    return component2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent2(Interface newComponent2)
  {
    Interface oldComponent2 = component2;
    component2 = newComponent2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.DEPENDENCY__COMPONENT2, oldComponent2, component2));
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
      case CompoNantesPackage.DEPENDENCY__TYPE:
        return getType();
      case CompoNantesPackage.DEPENDENCY__NAME:
        return getName();
      case CompoNantesPackage.DEPENDENCY__COMPONENT1:
        if (resolve) return getComponent1();
        return basicGetComponent1();
      case CompoNantesPackage.DEPENDENCY__COMPONENT2:
        if (resolve) return getComponent2();
        return basicGetComponent2();
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
      case CompoNantesPackage.DEPENDENCY__TYPE:
        setType((DependencyType)newValue);
        return;
      case CompoNantesPackage.DEPENDENCY__NAME:
        setName((String)newValue);
        return;
      case CompoNantesPackage.DEPENDENCY__COMPONENT1:
        setComponent1((Interface)newValue);
        return;
      case CompoNantesPackage.DEPENDENCY__COMPONENT2:
        setComponent2((Interface)newValue);
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
      case CompoNantesPackage.DEPENDENCY__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case CompoNantesPackage.DEPENDENCY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CompoNantesPackage.DEPENDENCY__COMPONENT1:
        setComponent1((Interface)null);
        return;
      case CompoNantesPackage.DEPENDENCY__COMPONENT2:
        setComponent2((Interface)null);
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
      case CompoNantesPackage.DEPENDENCY__TYPE:
        return type != TYPE_EDEFAULT;
      case CompoNantesPackage.DEPENDENCY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CompoNantesPackage.DEPENDENCY__COMPONENT1:
        return component1 != null;
      case CompoNantesPackage.DEPENDENCY__COMPONENT2:
        return component2 != null;
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

} //DependencyImpl
