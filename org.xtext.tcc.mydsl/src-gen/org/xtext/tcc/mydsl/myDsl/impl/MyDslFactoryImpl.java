/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.tcc.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.GREETING: return createGreeting();
      case MyDslPackage.API: return createApi();
      case MyDslPackage.API_NOME: return createApiNome();
      case MyDslPackage.ENTIDADES: return createEntidades();
      case MyDslPackage.ENTIDADE: return createEntidade();
      case MyDslPackage.NOME: return createNome();
      case MyDslPackage.NOME_ATRIBUTO: return createNome_Atributo();
      case MyDslPackage.ATRIBUTOS: return createAtributos();
      case MyDslPackage.ATRIBUTO: return createAtributo();
      case MyDslPackage.OPERACAO: return createOperacao();
      case MyDslPackage.OPERACAO_CASCADA: return createOperacaoCascada();
      case MyDslPackage.ASSOCIACAO: return createAssociacao();
      case MyDslPackage.ATRIBUTO_TIPO: return createAtributoTipo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Api createApi()
  {
    ApiImpl api = new ApiImpl();
    return api;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ApiNome createApiNome()
  {
    ApiNomeImpl apiNome = new ApiNomeImpl();
    return apiNome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entidades createEntidades()
  {
    EntidadesImpl entidades = new EntidadesImpl();
    return entidades;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entidade createEntidade()
  {
    EntidadeImpl entidade = new EntidadeImpl();
    return entidade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nome createNome()
  {
    NomeImpl nome = new NomeImpl();
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nome_Atributo createNome_Atributo()
  {
    Nome_AtributoImpl nome_Atributo = new Nome_AtributoImpl();
    return nome_Atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atributos createAtributos()
  {
    AtributosImpl atributos = new AtributosImpl();
    return atributos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operacao createOperacao()
  {
    OperacaoImpl operacao = new OperacaoImpl();
    return operacao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperacaoCascada createOperacaoCascada()
  {
    OperacaoCascadaImpl operacaoCascada = new OperacaoCascadaImpl();
    return operacaoCascada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Associacao createAssociacao()
  {
    AssociacaoImpl associacao = new AssociacaoImpl();
    return associacao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AtributoTipo createAtributoTipo()
  {
    AtributoTipoImpl atributoTipo = new AtributoTipoImpl();
    return atributoTipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
