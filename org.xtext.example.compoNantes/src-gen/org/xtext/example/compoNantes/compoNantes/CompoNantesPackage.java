/**
 */
package org.xtext.example.compoNantes.compoNantes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.compoNantes.compoNantes.CompoNantesFactory
 * @model kind="package"
 * @generated
 */
public interface CompoNantesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "compoNantes";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/compoNantes/CompoNantes";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "compoNantes";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CompoNantesPackage eINSTANCE = org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.ModelImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Subsystem</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SUBSYSTEM = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.ElementImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__PORTS = 1;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__INTERFACES = 2;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__DEPENDENCIES = 3;

  /**
   * The feature id for the '<em><b>Usages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__USAGES = 4;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__CONNECTORS = 5;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.SubSystemImpl <em>Sub System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.SubSystemImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getSubSystem()
   * @generated
   */
  int SUB_SYSTEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__PORTS = ELEMENT__PORTS;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__INTERFACES = ELEMENT__INTERFACES;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__DEPENDENCIES = ELEMENT__DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Usages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__USAGES = ELEMENT__USAGES;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__CONNECTORS = ELEMENT__CONNECTORS;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM__COMPONENTS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_SYSTEM_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = ELEMENT__PORTS;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INTERFACES = ELEMENT__INTERFACES;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DEPENDENCIES = ELEMENT__DEPENDENCIES;

  /**
   * The feature id for the '<em><b>Usages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__USAGES = ELEMENT__USAGES;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CONNECTORS = ELEMENT__CONNECTORS;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = 1;

  /**
   * The feature id for the '<em><b>Int1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__INT1 = 2;

  /**
   * The feature id for the '<em><b>Int2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__INT2 = 3;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.InterfaceImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__PORT = 2;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.PortImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getPort()
   * @generated
   */
  int PORT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 0;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 6;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__COMPONENT = 0;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.UsageImpl <em>Usage</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.UsageImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getUsage()
   * @generated
   */
  int USAGE = 7;

  /**
   * The feature id for the '<em><b>Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE__INTERFACE = 0;

  /**
   * The number of structural features of the '<em>Usage</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.InterfaceType <em>Interface Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.InterfaceType
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getInterfaceType()
   * @generated
   */
  int INTERFACE_TYPE = 9;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.ConnectorType <em>Connector Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.ConnectorType
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getConnectorType()
   * @generated
   */
  int CONNECTOR_TYPE = 10;


  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Model#getSubsystem <em>Subsystem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subsystem</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Model#getSubsystem()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Subsystem();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.SubSystem <em>Sub System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub System</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.SubSystem
   * @generated
   */
  EClass getSubSystem();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.SubSystem#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.SubSystem#getComponents()
   * @see #getSubSystem()
   * @generated
   */
  EReference getSubSystem_Components();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Connector#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Connector#getType()
   * @see #getConnector()
   * @generated
   */
  EAttribute getConnector_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Connector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Connector#getName()
   * @see #getConnector()
   * @generated
   */
  EAttribute getConnector_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt1 <em>Int1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Int1</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Connector#getInt1()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Int1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Connector#getInt2 <em>Int2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Int2</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Connector#getInt2()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Int2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Interface#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Interface#getType()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Interface#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Interface#getPort()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Port();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency#getComponent()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Component();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Usage <em>Usage</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Usage</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Usage
   * @generated
   */
  EClass getUsage();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Usage#getInterface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interface</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Usage#getInterface()
   * @see #getUsage()
   * @generated
   */
  EReference getUsage_Interface();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Element#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element#getPorts()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Element#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element#getInterfaces()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Element#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element#getDependencies()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Dependencies();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Element#getUsages <em>Usages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usages</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element#getUsages()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Usages();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Element#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Element#getConnectors()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Connectors();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.compoNantes.compoNantes.InterfaceType <em>Interface Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Interface Type</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.InterfaceType
   * @generated
   */
  EEnum getInterfaceType();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.compoNantes.compoNantes.ConnectorType <em>Connector Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Connector Type</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.ConnectorType
   * @generated
   */
  EEnum getConnectorType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CompoNantesFactory getCompoNantesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.ModelImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Subsystem</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SUBSYSTEM = eINSTANCE.getModel_Subsystem();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.SubSystemImpl <em>Sub System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.SubSystemImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getSubSystem()
     * @generated
     */
    EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_SYSTEM__COMPONENTS = eINSTANCE.getSubSystem_Components();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

    /**
     * The meta object literal for the '<em><b>Int1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__INT1 = eINSTANCE.getConnector_Int1();

    /**
     * The meta object literal for the '<em><b>Int2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__INT2 = eINSTANCE.getConnector_Int2();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.InterfaceImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__TYPE = eINSTANCE.getInterface_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__PORT = eINSTANCE.getInterface_Port();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.PortImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__COMPONENT = eINSTANCE.getDependency_Component();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.UsageImpl <em>Usage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.UsageImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getUsage()
     * @generated
     */
    EClass USAGE = eINSTANCE.getUsage();

    /**
     * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USAGE__INTERFACE = eINSTANCE.getUsage_Interface();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.ElementImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__PORTS = eINSTANCE.getElement_Ports();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__INTERFACES = eINSTANCE.getElement_Interfaces();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__DEPENDENCIES = eINSTANCE.getElement_Dependencies();

    /**
     * The meta object literal for the '<em><b>Usages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__USAGES = eINSTANCE.getElement_Usages();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__CONNECTORS = eINSTANCE.getElement_Connectors();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.InterfaceType <em>Interface Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.InterfaceType
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getInterfaceType()
     * @generated
     */
    EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.ConnectorType <em>Connector Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.ConnectorType
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getConnectorType()
     * @generated
     */
    EEnum CONNECTOR_TYPE = eINSTANCE.getConnectorType();

  }

} //CompoNantesPackage
