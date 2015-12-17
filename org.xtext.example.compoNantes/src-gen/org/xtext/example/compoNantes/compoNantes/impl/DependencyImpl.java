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
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl#getComponent_from <em>Component from</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl#getComponent_to <em>Component to</em>}</li>
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
   * The cached value of the '{@link #getComponent_from() <em>Component from</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent_from()
   * @generated
   * @ordered
   */
  protected Interface component_from;

  /**
   * The cached value of the '{@link #getComponent_to() <em>Component to</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponent_to()
   * @generated
   * @ordered
   */
  protected Interface component_to;

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
  public Interface getComponent_from()
  {
    if (component_from != null && component_from.eIsProxy())
    {
      InternalEObject oldComponent_from = (InternalEObject)component_from;
      component_from = (Interface)eResolveProxy(oldComponent_from);
      if (component_from != oldComponent_from)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.DEPENDENCY__COMPONENT_FROM, oldComponent_from, component_from));
      }
    }
    return component_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetComponent_from()
  {
    return component_from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent_from(Interface newComponent_from)
  {
    Interface oldComponent_from = component_from;
    component_from = newComponent_from;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.DEPENDENCY__COMPONENT_FROM, oldComponent_from, component_from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getComponent_to()
  {
    if (component_to != null && component_to.eIsProxy())
    {
      InternalEObject oldComponent_to = (InternalEObject)component_to;
      component_to = (Interface)eResolveProxy(oldComponent_to);
      if (component_to != oldComponent_to)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompoNantesPackage.DEPENDENCY__COMPONENT_TO, oldComponent_to, component_to));
      }
    }
    return component_to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetComponent_to()
  {
    return component_to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComponent_to(Interface newComponent_to)
  {
    Interface oldComponent_to = component_to;
    component_to = newComponent_to;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.DEPENDENCY__COMPONENT_TO, oldComponent_to, component_to));
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
      case CompoNantesPackage.DEPENDENCY__COMPONENT_FROM:
        if (resolve) return getComponent_from();
        return basicGetComponent_from();
      case CompoNantesPackage.DEPENDENCY__COMPONENT_TO:
        if (resolve) return getComponent_to();
        return basicGetComponent_to();
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
      case CompoNantesPackage.DEPENDENCY__COMPONENT_FROM:
        setComponent_from((Interface)newValue);
        return;
      case CompoNantesPackage.DEPENDENCY__COMPONENT_TO:
        setComponent_to((Interface)newValue);
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
      case CompoNantesPackage.DEPENDENCY__COMPONENT_FROM:
        setComponent_from((Interface)null);
        return;
      case CompoNantesPackage.DEPENDENCY__COMPONENT_TO:
        setComponent_to((Interface)null);
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
      case CompoNantesPackage.DEPENDENCY__COMPONENT_FROM:
        return component_from != null;
      case CompoNantesPackage.DEPENDENCY__COMPONENT_TO:
        return component_to != null;
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
