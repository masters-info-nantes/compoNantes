/**
 */
package org.xtext.example.compoNantes.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.xtext.example.compoNantes.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/compoNantes/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.myDsl.impl.ModelImpl
   * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Systems</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SYSTEMS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.myDsl.impl.SystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.myDsl.impl.SystemImpl
   * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getSystem()
   * @generated
   */
  int SYSTEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__COMPONENTS = 1;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM__CONNECTORS = 2;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.myDsl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.myDsl.impl.ComponentImpl
   * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getComponent()
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
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__INTERFACES = 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PORTS = 2;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.myDsl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.myDsl.impl.InterfaceImpl
   * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.compoNantes.myDsl.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.myDsl.impl.PortImpl
   * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getPort()
   * @generated
   */
  int PORT = 4;

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
   * The meta object id for the '{@link org.xtext.example.compoNantes.myDsl.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.compoNantes.myDsl.impl.ConnectorImpl
   * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__COMPONENTS = 1;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.myDsl.Model#getSystems <em>Systems</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Systems</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Model#getSystems()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Systems();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.myDsl.System <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see org.xtext.example.compoNantes.myDsl.System
   * @generated
   */
  EClass getSystem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.myDsl.System#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.myDsl.System#getName()
   * @see #getSystem()
   * @generated
   */
  EAttribute getSystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.myDsl.System#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.example.compoNantes.myDsl.System#getComponents()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Components();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.myDsl.System#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.xtext.example.compoNantes.myDsl.System#getConnectors()
   * @see #getSystem()
   * @generated
   */
  EReference getSystem_Connectors();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.myDsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.myDsl.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.myDsl.Component#getInterfaces <em>Interfaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interfaces</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Component#getInterfaces()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Interfaces();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.myDsl.Component#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Component#getPorts()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Ports();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.myDsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.myDsl.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.myDsl.Interface#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Interface#getType()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.myDsl.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.myDsl.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.compoNantes.myDsl.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.compoNantes.myDsl.Connector#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Connector#getName()
   * @see #getConnector()
   * @generated
   */
  EAttribute getConnector_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.compoNantes.myDsl.Connector#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.example.compoNantes.myDsl.Connector#getComponents()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Components();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

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
     * The meta object literal for the '{@link org.xtext.example.compoNantes.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.myDsl.impl.ModelImpl
     * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Systems</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SYSTEMS = eINSTANCE.getModel_Systems();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.myDsl.impl.SystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.myDsl.impl.SystemImpl
     * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getSystem()
     * @generated
     */
    EClass SYSTEM = eINSTANCE.getSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM__NAME = eINSTANCE.getSystem_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__COMPONENTS = eINSTANCE.getSystem_Components();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM__CONNECTORS = eINSTANCE.getSystem_Connectors();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.myDsl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.myDsl.impl.ComponentImpl
     * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getComponent()
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
     * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PORTS = eINSTANCE.getComponent_Ports();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.myDsl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.myDsl.impl.InterfaceImpl
     * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__TYPE = eINSTANCE.getInterface_Type();

    /**
     * The meta object literal for the '{@link org.xtext.example.compoNantes.myDsl.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.myDsl.impl.PortImpl
     * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getPort()
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
     * The meta object literal for the '{@link org.xtext.example.compoNantes.myDsl.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.compoNantes.myDsl.impl.ConnectorImpl
     * @see org.xtext.example.compoNantes.myDsl.impl.MyDslPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__COMPONENTS = eINSTANCE.getConnector_Components();

  }

} //MyDslPackage
