/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.tcc.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyDslSwitch<Adapter> modelSwitch =
    new MyDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseGreeting(Greeting object)
      {
        return createGreetingAdapter();
      }
      @Override
      public Adapter caseApi(Api object)
      {
        return createApiAdapter();
      }
      @Override
      public Adapter caseApiNome(ApiNome object)
      {
        return createApiNomeAdapter();
      }
      @Override
      public Adapter caseEntidade(Entidade object)
      {
        return createEntidadeAdapter();
      }
      @Override
      public Adapter caseEntidadeNome(EntidadeNome object)
      {
        return createEntidadeNomeAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseOperacao(Operacao object)
      {
        return createOperacaoAdapter();
      }
      @Override
      public Adapter caseAssociacao(Associacao object)
      {
        return createAssociacaoAdapter();
      }
      @Override
      public Adapter caseAtributoNome(AtributoNome object)
      {
        return createAtributoNomeAdapter();
      }
      @Override
      public Adapter caseAtributoTipo(AtributoTipo object)
      {
        return createAtributoTipoAdapter();
      }
      @Override
      public Adapter caseChavePrimaria(ChavePrimaria object)
      {
        return createChavePrimariaAdapter();
      }
      @Override
      public Adapter casePackageName(PackageName object)
      {
        return createPackageNameAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Greeting
   * @generated
   */
  public Adapter createGreetingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Api <em>Api</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Api
   * @generated
   */
  public Adapter createApiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.ApiNome <em>Api Nome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.ApiNome
   * @generated
   */
  public Adapter createApiNomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Entidade <em>Entidade</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Entidade
   * @generated
   */
  public Adapter createEntidadeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.EntidadeNome <em>Entidade Nome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.EntidadeNome
   * @generated
   */
  public Adapter createEntidadeNomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Atributo
   * @generated
   */
  public Adapter createAtributoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Operacao <em>Operacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Operacao
   * @generated
   */
  public Adapter createOperacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.Associacao <em>Associacao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.Associacao
   * @generated
   */
  public Adapter createAssociacaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.AtributoNome <em>Atributo Nome</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.AtributoNome
   * @generated
   */
  public Adapter createAtributoNomeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.AtributoTipo <em>Atributo Tipo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.AtributoTipo
   * @generated
   */
  public Adapter createAtributoTipoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.ChavePrimaria <em>Chave Primaria</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.ChavePrimaria
   * @generated
   */
  public Adapter createChavePrimariaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.tcc.mydsl.myDsl.PackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.tcc.mydsl.myDsl.PackageName
   * @generated
   */
  public Adapter createPackageNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyDslAdapterFactory
