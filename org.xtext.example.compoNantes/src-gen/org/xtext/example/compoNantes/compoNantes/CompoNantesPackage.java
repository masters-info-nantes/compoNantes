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
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMPONENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.ComponentImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = 1;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INTERFACES = 2;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__COMPONENTS = 3;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__CONNECTORS = 4;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__DEPENDENCIES = 5;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.PortImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getPort()
   * @generated
   */
  int PORT = 2;

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
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.InterfaceImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 3;

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
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.ConnectorImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 4;

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
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__NAME = 1;

  /**
   * The feature id for the '<em><b>Component1</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__COMPONENT1 = 2;

  /**
   * The feature id for the '<em><b>Component2</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__COMPONENT2 = 3;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.InterfaceType <em>Interface Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.InterfaceType
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getInterfaceType()
   * @generated
   */
  int INTERFACE_TYPE = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.ConnectorType <em>Connector Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.ConnectorType
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getConnectorType()
   * @generated
   */
  int CONNECTOR_TYPE = 7;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.compoNantes.DependencyType <em>Dependency Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.compoNantes.DependencyType
   * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getDependencyType()
   * @generated
   */
  int DEPENDENCY_TYPE = 8;


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
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Model#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Model#getComponents()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Components();

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
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Component#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component#getPorts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Component#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component#getInterfaces()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Component#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component#getComponents()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Components();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Component#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component#getConnectors()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Connectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.compoNantes.Component#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Component#getDependencies()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Dependencies();

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
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.compoNantes.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency#getType()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency#getName()
   * @see #getDependency()
   * @generated
   */
  EAttribute getDependency_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent1 <em>Component1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component1</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency#getComponent1()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Component1();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.compoNantes.compoNantes.Dependency#getComponent2 <em>Component2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component2</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.Dependency#getComponent2()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Component2();

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
   * Returns the meta object for enum '{@link org.xtext.example.compoNantes.compoNantes.DependencyType <em>Dependency Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Dependency Type</em>'.
   * @see org.xtext.example.compoNantes.compoNantes.DependencyType
   * @generated
   */
  EEnum getDependencyType();

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
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMPONENTS = eINSTANCE.getModel_Components();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

    /**
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__CONNECTORS = eINSTANCE.getComponent_Connectors();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__DEPENDENCIES = eINSTANCE.getComponent_Dependencies();

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
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.impl.DependencyImpl
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

    /**
     * The meta object literal for the '<em><b>Component1</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__COMPONENT1 = eINSTANCE.getDependency_Component1();

    /**
     * The meta object literal for the '<em><b>Component2</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__COMPONENT2 = eINSTANCE.getDependency_Component2();

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

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.compoNantes.DependencyType <em>Dependency Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.compoNantes.DependencyType
     * @see org.xtext.example.compoNantes.compoNantes.impl.CompoNantesPackageImpl#getDependencyType()
     * @generated
     */
    EEnum DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

  }

} //CompoNantesPackage
