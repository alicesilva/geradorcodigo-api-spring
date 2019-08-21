/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl;

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
 * @see org.xtext.tcc.mydsl.myDsl.MyDslFactory
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
  String eNS_URI = "http://www.xtext.org/tcc/mydsl/MyDsl";

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
  MyDslPackage eINSTANCE = org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.GreetingImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The feature id for the '<em><b>Api</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__API = 0;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.ApiImpl <em>Api</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.ApiImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getApi()
   * @generated
   */
  int API = 2;

  /**
   * The feature id for the '<em><b>Name Api</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__NAME_API = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Api</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.APINameImpl <em>API Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.APINameImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAPIName()
   * @generated
   */
  int API_NAME = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_NAME__ID = 0;

  /**
   * The number of structural features of the '<em>API Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AttributeImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Decision Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DECISION_GET = 2;

  /**
   * The feature id for the '<em><b>Decision Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DECISION_SET = 3;

  /**
   * The feature id for the '<em><b>Decision ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__DECISION_ID = 4;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AttributeNameImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAttributeName()
   * @generated
   */
  int ATTRIBUTE_NAME = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME__ID = 0;

  /**
   * The number of structural features of the '<em>Attribute Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AttributeTypeImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 6;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TYPE__ID = 0;

  /**
   * The number of structural features of the '<em>Attribute Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tcc.mydsl.myDsl.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Greeting#getApi <em>Api</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Api</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Greeting#getApi()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_Api();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Api <em>Api</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Api</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Api
   * @generated
   */
  EClass getApi();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Api#getNameApi <em>Name Api</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Api</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Api#getNameApi()
   * @see #getApi()
   * @generated
   */
  EReference getApi_NameApi();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Api#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Api#getAttributes()
   * @see #getApi()
   * @generated
   */
  EReference getApi_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.APIName <em>API Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>API Name</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.APIName
   * @generated
   */
  EClass getAPIName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.APIName#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.APIName#getId()
   * @see #getAPIName()
   * @generated
   */
  EAttribute getAPIName_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Name</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_AttributeName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Attribute#getAttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute Type</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Attribute#getAttributeType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_AttributeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.Attribute#getDecisionGet <em>Decision Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Get</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Attribute#getDecisionGet()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_DecisionGet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.Attribute#getDecisionSet <em>Decision Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision Set</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Attribute#getDecisionSet()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_DecisionSet();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.Attribute#getDecisionID <em>Decision ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decision ID</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Attribute#getDecisionID()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_DecisionID();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Name</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AttributeName
   * @generated
   */
  EClass getAttributeName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.AttributeName#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AttributeName#getId()
   * @see #getAttributeName()
   * @generated
   */
  EAttribute getAttributeName_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Type</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AttributeType
   * @generated
   */
  EClass getAttributeType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.AttributeType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AttributeType#getId()
   * @see #getAttributeType()
   * @generated
   */
  EAttribute getAttributeType_Id();

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
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.GreetingImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Api</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREETING__API = eINSTANCE.getGreeting_Api();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.ApiImpl <em>Api</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.ApiImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getApi()
     * @generated
     */
    EClass API = eINSTANCE.getApi();

    /**
     * The meta object literal for the '<em><b>Name Api</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__NAME_API = eINSTANCE.getApi_NameApi();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__ATTRIBUTES = eINSTANCE.getApi_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.APINameImpl <em>API Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.APINameImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAPIName()
     * @generated
     */
    EClass API_NAME = eINSTANCE.getAPIName();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute API_NAME__ID = eINSTANCE.getAPIName_Id();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AttributeImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '<em><b>Attribute Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ATTRIBUTE_TYPE = eINSTANCE.getAttribute_AttributeType();

    /**
     * The meta object literal for the '<em><b>Decision Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DECISION_GET = eINSTANCE.getAttribute_DecisionGet();

    /**
     * The meta object literal for the '<em><b>Decision Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DECISION_SET = eINSTANCE.getAttribute_DecisionSet();

    /**
     * The meta object literal for the '<em><b>Decision ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__DECISION_ID = eINSTANCE.getAttribute_DecisionID();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AttributeNameImpl <em>Attribute Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AttributeNameImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAttributeName()
     * @generated
     */
    EClass ATTRIBUTE_NAME = eINSTANCE.getAttributeName();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_NAME__ID = eINSTANCE.getAttributeName_Id();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AttributeTypeImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAttributeType()
     * @generated
     */
    EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_TYPE__ID = eINSTANCE.getAttributeType_Id();

  }

} //MyDslPackage
