/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl.impl;

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

import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;
import org.xtext.tcc.mydsl.myDsl.Nome;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl#getNomeEntidade <em>Nome Entidade</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl#getChavePrimaria <em>Chave Primaria</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadeImpl#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadeImpl extends MinimalEObjectImpl.Container implements Entidade
{
  /**
   * The cached value of the '{@link #getNomeEntidade() <em>Nome Entidade</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNomeEntidade()
   * @generated
   * @ordered
   */
  protected Nome nomeEntidade;

  /**
   * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributos()
   * @generated
   * @ordered
   */
  protected EList<Atributo> atributos;

  /**
   * The cached value of the '{@link #getChavePrimaria() <em>Chave Primaria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChavePrimaria()
   * @generated
   * @ordered
   */
  protected Nome chavePrimaria;

  /**
   * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackage()
   * @generated
   * @ordered
   */
  protected Nome package_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntidadeImpl()
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
    return MyDslPackage.Literals.ENTIDADE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nome getNomeEntidade()
  {
    return nomeEntidade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNomeEntidade(Nome newNomeEntidade, NotificationChain msgs)
  {
    Nome oldNomeEntidade = nomeEntidade;
    nomeEntidade = newNomeEntidade;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADE__NOME_ENTIDADE, oldNomeEntidade, newNomeEntidade);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNomeEntidade(Nome newNomeEntidade)
  {
    if (newNomeEntidade != nomeEntidade)
    {
      NotificationChain msgs = null;
      if (nomeEntidade != null)
        msgs = ((InternalEObject)nomeEntidade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADE__NOME_ENTIDADE, null, msgs);
      if (newNomeEntidade != null)
        msgs = ((InternalEObject)newNomeEntidade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADE__NOME_ENTIDADE, null, msgs);
      msgs = basicSetNomeEntidade(newNomeEntidade, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADE__NOME_ENTIDADE, newNomeEntidade, newNomeEntidade));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Atributo> getAtributos()
  {
    if (atributos == null)
    {
      atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, MyDslPackage.ENTIDADE__ATRIBUTOS);
    }
    return atributos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nome getChavePrimaria()
  {
    return chavePrimaria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChavePrimaria(Nome newChavePrimaria, NotificationChain msgs)
  {
    Nome oldChavePrimaria = chavePrimaria;
    chavePrimaria = newChavePrimaria;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADE__CHAVE_PRIMARIA, oldChavePrimaria, newChavePrimaria);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChavePrimaria(Nome newChavePrimaria)
  {
    if (newChavePrimaria != chavePrimaria)
    {
      NotificationChain msgs = null;
      if (chavePrimaria != null)
        msgs = ((InternalEObject)chavePrimaria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADE__CHAVE_PRIMARIA, null, msgs);
      if (newChavePrimaria != null)
        msgs = ((InternalEObject)newChavePrimaria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADE__CHAVE_PRIMARIA, null, msgs);
      msgs = basicSetChavePrimaria(newChavePrimaria, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADE__CHAVE_PRIMARIA, newChavePrimaria, newChavePrimaria));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nome getPackage()
  {
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackage(Nome newPackage, NotificationChain msgs)
  {
    Nome oldPackage = package_;
    package_ = newPackage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADE__PACKAGE, oldPackage, newPackage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPackage(Nome newPackage)
  {
    if (newPackage != package_)
    {
      NotificationChain msgs = null;
      if (package_ != null)
        msgs = ((InternalEObject)package_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADE__PACKAGE, null, msgs);
      if (newPackage != null)
        msgs = ((InternalEObject)newPackage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADE__PACKAGE, null, msgs);
      msgs = basicSetPackage(newPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADE__PACKAGE, newPackage, newPackage));
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
      case MyDslPackage.ENTIDADE__NOME_ENTIDADE:
        return basicSetNomeEntidade(null, msgs);
      case MyDslPackage.ENTIDADE__ATRIBUTOS:
        return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
      case MyDslPackage.ENTIDADE__CHAVE_PRIMARIA:
        return basicSetChavePrimaria(null, msgs);
      case MyDslPackage.ENTIDADE__PACKAGE:
        return basicSetPackage(null, msgs);
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
      case MyDslPackage.ENTIDADE__NOME_ENTIDADE:
        return getNomeEntidade();
      case MyDslPackage.ENTIDADE__ATRIBUTOS:
        return getAtributos();
      case MyDslPackage.ENTIDADE__CHAVE_PRIMARIA:
        return getChavePrimaria();
      case MyDslPackage.ENTIDADE__PACKAGE:
        return getPackage();
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
      case MyDslPackage.ENTIDADE__NOME_ENTIDADE:
        setNomeEntidade((Nome)newValue);
        return;
      case MyDslPackage.ENTIDADE__ATRIBUTOS:
        getAtributos().clear();
        getAtributos().addAll((Collection<? extends Atributo>)newValue);
        return;
      case MyDslPackage.ENTIDADE__CHAVE_PRIMARIA:
        setChavePrimaria((Nome)newValue);
        return;
      case MyDslPackage.ENTIDADE__PACKAGE:
        setPackage((Nome)newValue);
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
      case MyDslPackage.ENTIDADE__NOME_ENTIDADE:
        setNomeEntidade((Nome)null);
        return;
      case MyDslPackage.ENTIDADE__ATRIBUTOS:
        getAtributos().clear();
        return;
      case MyDslPackage.ENTIDADE__CHAVE_PRIMARIA:
        setChavePrimaria((Nome)null);
        return;
      case MyDslPackage.ENTIDADE__PACKAGE:
        setPackage((Nome)null);
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
      case MyDslPackage.ENTIDADE__NOME_ENTIDADE:
        return nomeEntidade != null;
      case MyDslPackage.ENTIDADE__ATRIBUTOS:
        return atributos != null && !atributos.isEmpty();
      case MyDslPackage.ENTIDADE__CHAVE_PRIMARIA:
        return chavePrimaria != null;
      case MyDslPackage.ENTIDADE__PACKAGE:
        return package_ != null;
    }
    return super.eIsSet(featureID);
  }

} //EntidadeImpl
