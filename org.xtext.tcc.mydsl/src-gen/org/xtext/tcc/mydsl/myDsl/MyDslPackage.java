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
   * The feature id for the '<em><b>Nome Api</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__NOME_API = 0;

  /**
   * The feature id for the '<em><b>Entidades</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__ENTIDADES = 1;

  /**
   * The number of structural features of the '<em>Api</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.ApiNomeImpl <em>Api Nome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.ApiNomeImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getApiNome()
   * @generated
   */
  int API_NOME = 3;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_NOME__NOME = 0;

  /**
   * The number of structural features of the '<em>Api Nome</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_NOME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadesImpl <em>Entidades</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.EntidadesImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getEntidades()
   * @generated
   */
  int ENTIDADES = 4;

  /**
   * The feature id for the '<em><b>Entidade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADES__ENTIDADE = 0;

  /**
   * The feature id for the '<em><b>Entidade Mais</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADES__ENTIDADE_MAIS = 1;

  /**
   * The number of structural features of the '<em>Entidades</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl <em>Entidade</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getEntidade()
   * @generated
   */
  int ENTIDADE = 5;

  /**
   * The feature id for the '<em><b>Nome Entidade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADE__NOME_ENTIDADE = 0;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADE__ATRIBUTOS = 1;

  /**
   * The feature id for the '<em><b>Package</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADE__PACKAGE = 2;

  /**
   * The number of structural features of the '<em>Entidade</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTIDADE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.NomeImpl <em>Nome</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.NomeImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getNome()
   * @generated
   */
  int NOME = 6;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOME__NOME = 0;

  /**
   * The number of structural features of the '<em>Nome</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AtributosImpl <em>Atributos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AtributosImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAtributos()
   * @generated
   */
  int ATRIBUTOS = 7;

  /**
   * The feature id for the '<em><b>Atributo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTOS__ATRIBUTO = 0;

  /**
   * The feature id for the '<em><b>Atributo Mais</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTOS__ATRIBUTO_MAIS = 1;

  /**
   * The number of structural features of the '<em>Atributos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTOS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AtributoImpl <em>Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AtributoImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAtributo()
   * @generated
   */
  int ATRIBUTO = 8;

  /**
   * The feature id for the '<em><b>Nome Atributo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__NOME_ATRIBUTO = 0;

  /**
   * The feature id for the '<em><b>Atributo Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__ATRIBUTO_TIPO = 1;

  /**
   * The feature id for the '<em><b>Associacao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__ASSOCIACAO = 2;

  /**
   * The feature id for the '<em><b>Operacao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__OPERACAO = 3;

  /**
   * The number of structural features of the '<em>Atributo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.OperacaoImpl <em>Operacao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.OperacaoImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getOperacao()
   * @generated
   */
  int OPERACAO = 9;

  /**
   * The feature id for the '<em><b>Op Cascada</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACAO__OP_CASCADA = 0;

  /**
   * The feature id for the '<em><b>Op Cascada Mais</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACAO__OP_CASCADA_MAIS = 1;

  /**
   * The number of structural features of the '<em>Operacao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACAO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.OperacaoCascadaImpl <em>Operacao Cascada</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.OperacaoCascadaImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getOperacaoCascada()
   * @generated
   */
  int OPERACAO_CASCADA = 10;

  /**
   * The feature id for the '<em><b>Operacao</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACAO_CASCADA__OPERACAO = 0;

  /**
   * The number of structural features of the '<em>Operacao Cascada</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERACAO_CASCADA_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AssociacaoImpl <em>Associacao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AssociacaoImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAssociacao()
   * @generated
   */
  int ASSOCIACAO = 11;

  /**
   * The feature id for the '<em><b>Associacao</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIACAO__ASSOCIACAO = 0;

  /**
   * The number of structural features of the '<em>Associacao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIACAO_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AtributoTipoImpl <em>Atributo Tipo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.tcc.mydsl.myDsl.impl.AtributoTipoImpl
   * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAtributoTipo()
   * @generated
   */
  int ATRIBUTO_TIPO = 12;

  /**
   * The feature id for the '<em><b>Tipo Primitivo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_TIPO__TIPO_PRIMITIVO = 0;

  /**
   * The feature id for the '<em><b>Tipo Colecao</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_TIPO__TIPO_COLECAO = 1;

  /**
   * The feature id for the '<em><b>Tipo Objeto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_TIPO__TIPO_OBJETO = 2;

  /**
   * The number of structural features of the '<em>Atributo Tipo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_TIPO_FEATURE_COUNT = 3;


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
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Api#getNomeApi <em>Nome Api</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nome Api</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Api#getNomeApi()
   * @see #getApi()
   * @generated
   */
  EReference getApi_NomeApi();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Api#getEntidades <em>Entidades</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entidades</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Api#getEntidades()
   * @see #getApi()
   * @generated
   */
  EReference getApi_Entidades();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.ApiNome <em>Api Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Api Nome</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.ApiNome
   * @generated
   */
  EClass getApiNome();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.ApiNome#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.ApiNome#getNome()
   * @see #getApiNome()
   * @generated
   */
  EAttribute getApiNome_Nome();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Entidades <em>Entidades</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entidades</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidades
   * @generated
   */
  EClass getEntidades();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Entidades#getEntidade <em>Entidade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entidade</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidades#getEntidade()
   * @see #getEntidades()
   * @generated
   */
  EReference getEntidades_Entidade();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tcc.mydsl.myDsl.Entidades#getEntidadeMais <em>Entidade Mais</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entidade Mais</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidades#getEntidadeMais()
   * @see #getEntidades()
   * @generated
   */
  EReference getEntidades_EntidadeMais();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Entidade <em>Entidade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entidade</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidade
   * @generated
   */
  EClass getEntidade();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Entidade#getNomeEntidade <em>Nome Entidade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nome Entidade</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidade#getNomeEntidade()
   * @see #getEntidade()
   * @generated
   */
  EReference getEntidade_NomeEntidade();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Entidade#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atributos</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidade#getAtributos()
   * @see #getEntidade()
   * @generated
   */
  EReference getEntidade_Atributos();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Entidade#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Package</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Entidade#getPackage()
   * @see #getEntidade()
   * @generated
   */
  EReference getEntidade_Package();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Nome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nome</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Nome
   * @generated
   */
  EClass getNome();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.Nome#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Nome#getNome()
   * @see #getNome()
   * @generated
   */
  EAttribute getNome_Nome();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Atributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributos</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributos
   * @generated
   */
  EClass getAtributos();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Atributos#getAtributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atributo</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributos#getAtributo()
   * @see #getAtributos()
   * @generated
   */
  EReference getAtributos_Atributo();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tcc.mydsl.myDsl.Atributos#getAtributoMais <em>Atributo Mais</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributo Mais</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributos#getAtributoMais()
   * @see #getAtributos()
   * @generated
   */
  EReference getAtributos_AtributoMais();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributo
   * @generated
   */
  EClass getAtributo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getNomeAtributo <em>Nome Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nome Atributo</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributo#getNomeAtributo()
   * @see #getAtributo()
   * @generated
   */
  EReference getAtributo_NomeAtributo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoTipo <em>Atributo Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Atributo Tipo</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoTipo()
   * @see #getAtributo()
   * @generated
   */
  EReference getAtributo_AtributoTipo();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAssociacao <em>Associacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Associacao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributo#getAssociacao()
   * @see #getAtributo()
   * @generated
   */
  EReference getAtributo_Associacao();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getOperacao <em>Operacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operacao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Atributo#getOperacao()
   * @see #getAtributo()
   * @generated
   */
  EReference getAtributo_Operacao();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Operacao <em>Operacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operacao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Operacao
   * @generated
   */
  EClass getOperacao();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascada <em>Op Cascada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Cascada</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascada()
   * @see #getOperacao()
   * @generated
   */
  EReference getOperacao_OpCascada();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascadaMais <em>Op Cascada Mais</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Op Cascada Mais</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascadaMais()
   * @see #getOperacao()
   * @generated
   */
  EReference getOperacao_OpCascadaMais();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.OperacaoCascada <em>Operacao Cascada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operacao Cascada</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.OperacaoCascada
   * @generated
   */
  EClass getOperacaoCascada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.OperacaoCascada#getOperacao <em>Operacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operacao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.OperacaoCascada#getOperacao()
   * @see #getOperacaoCascada()
   * @generated
   */
  EAttribute getOperacaoCascada_Operacao();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.Associacao <em>Associacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Associacao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Associacao
   * @generated
   */
  EClass getAssociacao();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.Associacao#getAssociacao <em>Associacao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Associacao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.Associacao#getAssociacao()
   * @see #getAssociacao()
   * @generated
   */
  EAttribute getAssociacao_Associacao();

  /**
   * Returns the meta object for class '{@link org.xtext.tcc.mydsl.myDsl.AtributoTipo <em>Atributo Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo Tipo</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AtributoTipo
   * @generated
   */
  EClass getAtributoTipo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.AtributoTipo#getTipoPrimitivo <em>Tipo Primitivo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Primitivo</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AtributoTipo#getTipoPrimitivo()
   * @see #getAtributoTipo()
   * @generated
   */
  EAttribute getAtributoTipo_TipoPrimitivo();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.AtributoTipo#getTipoColecao <em>Tipo Colecao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Colecao</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AtributoTipo#getTipoColecao()
   * @see #getAtributoTipo()
   * @generated
   */
  EAttribute getAtributoTipo_TipoColecao();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.tcc.mydsl.myDsl.AtributoTipo#getTipoObjeto <em>Tipo Objeto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Objeto</em>'.
   * @see org.xtext.tcc.mydsl.myDsl.AtributoTipo#getTipoObjeto()
   * @see #getAtributoTipo()
   * @generated
   */
  EAttribute getAtributoTipo_TipoObjeto();

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
     * The meta object literal for the '<em><b>Nome Api</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__NOME_API = eINSTANCE.getApi_NomeApi();

    /**
     * The meta object literal for the '<em><b>Entidades</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__ENTIDADES = eINSTANCE.getApi_Entidades();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.ApiNomeImpl <em>Api Nome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.ApiNomeImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getApiNome()
     * @generated
     */
    EClass API_NOME = eINSTANCE.getApiNome();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute API_NOME__NOME = eINSTANCE.getApiNome_Nome();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadesImpl <em>Entidades</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.EntidadesImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getEntidades()
     * @generated
     */
    EClass ENTIDADES = eINSTANCE.getEntidades();

    /**
     * The meta object literal for the '<em><b>Entidade</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTIDADES__ENTIDADE = eINSTANCE.getEntidades_Entidade();

    /**
     * The meta object literal for the '<em><b>Entidade Mais</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTIDADES__ENTIDADE_MAIS = eINSTANCE.getEntidades_EntidadeMais();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl <em>Entidade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getEntidade()
     * @generated
     */
    EClass ENTIDADE = eINSTANCE.getEntidade();

    /**
     * The meta object literal for the '<em><b>Nome Entidade</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTIDADE__NOME_ENTIDADE = eINSTANCE.getEntidade_NomeEntidade();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTIDADE__ATRIBUTOS = eINSTANCE.getEntidade_Atributos();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTIDADE__PACKAGE = eINSTANCE.getEntidade_Package();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.NomeImpl <em>Nome</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.NomeImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getNome()
     * @generated
     */
    EClass NOME = eINSTANCE.getNome();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOME__NOME = eINSTANCE.getNome_Nome();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AtributosImpl <em>Atributos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AtributosImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAtributos()
     * @generated
     */
    EClass ATRIBUTOS = eINSTANCE.getAtributos();

    /**
     * The meta object literal for the '<em><b>Atributo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTOS__ATRIBUTO = eINSTANCE.getAtributos_Atributo();

    /**
     * The meta object literal for the '<em><b>Atributo Mais</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTOS__ATRIBUTO_MAIS = eINSTANCE.getAtributos_AtributoMais();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AtributoImpl <em>Atributo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AtributoImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAtributo()
     * @generated
     */
    EClass ATRIBUTO = eINSTANCE.getAtributo();

    /**
     * The meta object literal for the '<em><b>Nome Atributo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO__NOME_ATRIBUTO = eINSTANCE.getAtributo_NomeAtributo();

    /**
     * The meta object literal for the '<em><b>Atributo Tipo</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO__ATRIBUTO_TIPO = eINSTANCE.getAtributo_AtributoTipo();

    /**
     * The meta object literal for the '<em><b>Associacao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO__ASSOCIACAO = eINSTANCE.getAtributo_Associacao();

    /**
     * The meta object literal for the '<em><b>Operacao</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATRIBUTO__OPERACAO = eINSTANCE.getAtributo_Operacao();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.OperacaoImpl <em>Operacao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.OperacaoImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getOperacao()
     * @generated
     */
    EClass OPERACAO = eINSTANCE.getOperacao();

    /**
     * The meta object literal for the '<em><b>Op Cascada</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERACAO__OP_CASCADA = eINSTANCE.getOperacao_OpCascada();

    /**
     * The meta object literal for the '<em><b>Op Cascada Mais</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERACAO__OP_CASCADA_MAIS = eINSTANCE.getOperacao_OpCascadaMais();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.OperacaoCascadaImpl <em>Operacao Cascada</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.OperacaoCascadaImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getOperacaoCascada()
     * @generated
     */
    EClass OPERACAO_CASCADA = eINSTANCE.getOperacaoCascada();

    /**
     * The meta object literal for the '<em><b>Operacao</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERACAO_CASCADA__OPERACAO = eINSTANCE.getOperacaoCascada_Operacao();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AssociacaoImpl <em>Associacao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AssociacaoImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAssociacao()
     * @generated
     */
    EClass ASSOCIACAO = eINSTANCE.getAssociacao();

    /**
     * The meta object literal for the '<em><b>Associacao</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIACAO__ASSOCIACAO = eINSTANCE.getAssociacao_Associacao();

    /**
     * The meta object literal for the '{@link org.xtext.tcc.mydsl.myDsl.impl.AtributoTipoImpl <em>Atributo Tipo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.tcc.mydsl.myDsl.impl.AtributoTipoImpl
     * @see org.xtext.tcc.mydsl.myDsl.impl.MyDslPackageImpl#getAtributoTipo()
     * @generated
     */
    EClass ATRIBUTO_TIPO = eINSTANCE.getAtributoTipo();

    /**
     * The meta object literal for the '<em><b>Tipo Primitivo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_TIPO__TIPO_PRIMITIVO = eINSTANCE.getAtributoTipo_TipoPrimitivo();

    /**
     * The meta object literal for the '<em><b>Tipo Colecao</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_TIPO__TIPO_COLECAO = eINSTANCE.getAtributoTipo_TipoColecao();

    /**
     * The meta object literal for the '<em><b>Tipo Objeto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO_TIPO__TIPO_OBJETO = eINSTANCE.getAtributoTipo_TipoObjeto();

  }

} //MyDslPackage
