/**
 */
package org.xtext.example.compoNantes.compoNantes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.compoNantes.compoNantes.CompoNantesPackage;
import org.xtext.example.compoNantes.compoNantes.Dependency;
import org.xtext.example.compoNantes.compoNantes.Interface;
import org.xtext.example.compoNantes.compoNantes.Port;
import org.xtext.example.compoNantes.compoNantes.Truc;
import org.xtext.example.compoNantes.compoNantes.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Truc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.TrucImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.TrucImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.TrucImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.TrucImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.TrucImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrucImpl extends MinimalEObjectImpl.Container implements Truc
{
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
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EList<Interface> interfaces;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<Dependency> dependencies;

  /**
   * The cached value of the '{@link #getUsages() <em>Usages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsages()
   * @generated
   * @ordered
   */
  protected EList<Usage> usages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TrucImpl()
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
    return CompoNantesPackage.Literals.TRUC;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.TRUC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getInterfaces()
  {
    if (interfaces == null)
    {
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, CompoNantesPackage.TRUC__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<Port>(Port.class, this, CompoNantesPackage.TRUC__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Dependency> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, CompoNantesPackage.TRUC__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Usage> getUsages()
  {
    if (usages == null)
    {
      usages = new EObjectContainmentEList<Usage>(Usage.class, this, CompoNantesPackage.TRUC__USAGES);
    }
    return usages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CompoNantesPackage.TRUC__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.TRUC__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.TRUC__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.TRUC__USAGES:
        return ((InternalEList<?>)getUsages()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CompoNantesPackage.TRUC__NAME:
        return getName();
      case CompoNantesPackage.TRUC__INTERFACES:
        return getInterfaces();
      case CompoNantesPackage.TRUC__PORTS:
        return getPorts();
      case CompoNantesPackage.TRUC__DEPENDENCIES:
        return getDependencies();
      case CompoNantesPackage.TRUC__USAGES:
        return getUsages();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CompoNantesPackage.TRUC__NAME:
        setName((String)newValue);
        return;
      case CompoNantesPackage.TRUC__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
        return;
      case CompoNantesPackage.TRUC__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case CompoNantesPackage.TRUC__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
        return;
      case CompoNantesPackage.TRUC__USAGES:
        getUsages().clear();
        getUsages().addAll((Collection<? extends Usage>)newValue);
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
      case CompoNantesPackage.TRUC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CompoNantesPackage.TRUC__INTERFACES:
        getInterfaces().clear();
        return;
      case CompoNantesPackage.TRUC__PORTS:
        getPorts().clear();
        return;
      case CompoNantesPackage.TRUC__DEPENDENCIES:
        getDependencies().clear();
        return;
      case CompoNantesPackage.TRUC__USAGES:
        getUsages().clear();
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
      case CompoNantesPackage.TRUC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CompoNantesPackage.TRUC__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case CompoNantesPackage.TRUC__PORTS:
        return ports != null && !ports.isEmpty();
      case CompoNantesPackage.TRUC__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case CompoNantesPackage.TRUC__USAGES:
        return usages != null && !usages.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TrucImpl
