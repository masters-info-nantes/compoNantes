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
import org.xtext.example.compoNantes.compoNantes.Component;
import org.xtext.example.compoNantes.compoNantes.Connector;
import org.xtext.example.compoNantes.compoNantes.Dependency;
import org.xtext.example.compoNantes.compoNantes.Interface;
import org.xtext.example.compoNantes.compoNantes.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component
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
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

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
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectors()
   * @generated
   * @ordered
   */
  protected EList<Connector> connectors;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImpl()
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
    return CompoNantesPackage.Literals.COMPONENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, CompoNantesPackage.COMPONENT__NAME, oldName, name));
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
      ports = new EObjectContainmentEList<Port>(Port.class, this, CompoNantesPackage.COMPONENT__PORTS);
    }
    return ports;
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
      interfaces = new EObjectContainmentEList<Interface>(Interface.class, this, CompoNantesPackage.COMPONENT__INTERFACES);
    }
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, CompoNantesPackage.COMPONENT__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Connector> getConnectors()
  {
    if (connectors == null)
    {
      connectors = new EObjectContainmentEList<Connector>(Connector.class, this, CompoNantesPackage.COMPONENT__CONNECTORS);
    }
    return connectors;
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
      dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, CompoNantesPackage.COMPONENT__DEPENDENCIES);
    }
    return dependencies;
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
      case CompoNantesPackage.COMPONENT__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.COMPONENT__INTERFACES:
        return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.COMPONENT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.COMPONENT__CONNECTORS:
        return ((InternalEList<?>)getConnectors()).basicRemove(otherEnd, msgs);
      case CompoNantesPackage.COMPONENT__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
      case CompoNantesPackage.COMPONENT__NAME:
        return getName();
      case CompoNantesPackage.COMPONENT__PORTS:
        return getPorts();
      case CompoNantesPackage.COMPONENT__INTERFACES:
        return getInterfaces();
      case CompoNantesPackage.COMPONENT__COMPONENTS:
        return getComponents();
      case CompoNantesPackage.COMPONENT__CONNECTORS:
        return getConnectors();
      case CompoNantesPackage.COMPONENT__DEPENDENCIES:
        return getDependencies();
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
      case CompoNantesPackage.COMPONENT__NAME:
        setName((String)newValue);
        return;
      case CompoNantesPackage.COMPONENT__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case CompoNantesPackage.COMPONENT__INTERFACES:
        getInterfaces().clear();
        getInterfaces().addAll((Collection<? extends Interface>)newValue);
        return;
      case CompoNantesPackage.COMPONENT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case CompoNantesPackage.COMPONENT__CONNECTORS:
        getConnectors().clear();
        getConnectors().addAll((Collection<? extends Connector>)newValue);
        return;
      case CompoNantesPackage.COMPONENT__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends Dependency>)newValue);
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
      case CompoNantesPackage.COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CompoNantesPackage.COMPONENT__PORTS:
        getPorts().clear();
        return;
      case CompoNantesPackage.COMPONENT__INTERFACES:
        getInterfaces().clear();
        return;
      case CompoNantesPackage.COMPONENT__COMPONENTS:
        getComponents().clear();
        return;
      case CompoNantesPackage.COMPONENT__CONNECTORS:
        getConnectors().clear();
        return;
      case CompoNantesPackage.COMPONENT__DEPENDENCIES:
        getDependencies().clear();
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
      case CompoNantesPackage.COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CompoNantesPackage.COMPONENT__PORTS:
        return ports != null && !ports.isEmpty();
      case CompoNantesPackage.COMPONENT__INTERFACES:
        return interfaces != null && !interfaces.isEmpty();
      case CompoNantesPackage.COMPONENT__COMPONENTS:
        return components != null && !components.isEmpty();
      case CompoNantesPackage.COMPONENT__CONNECTORS:
        return connectors != null && !connectors.isEmpty();
      case CompoNantesPackage.COMPONENT__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
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

} //ComponentImpl
