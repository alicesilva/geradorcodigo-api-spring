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

import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.Entidades;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entidades</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadesImpl#getEntidade <em>Entidade</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.EntidadesImpl#getEntidadeMais <em>Entidade Mais</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntidadesImpl extends MinimalEObjectImpl.Container implements Entidades
{
  /**
   * The cached value of the '{@link #getEntidade() <em>Entidade</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntidade()
   * @generated
   * @ordered
   */
  protected Entidade entidade;

  /**
   * The cached value of the '{@link #getEntidadeMais() <em>Entidade Mais</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntidadeMais()
   * @generated
   * @ordered
   */
  protected EList<Entidade> entidadeMais;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntidadesImpl()
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
    return MyDslPackage.Literals.ENTIDADES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entidade getEntidade()
  {
    return entidade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntidade(Entidade newEntidade, NotificationChain msgs)
  {
    Entidade oldEntidade = entidade;
    entidade = newEntidade;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADES__ENTIDADE, oldEntidade, newEntidade);
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
  public void setEntidade(Entidade newEntidade)
  {
    if (newEntidade != entidade)
    {
      NotificationChain msgs = null;
      if (entidade != null)
        msgs = ((InternalEObject)entidade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADES__ENTIDADE, null, msgs);
      if (newEntidade != null)
        msgs = ((InternalEObject)newEntidade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ENTIDADES__ENTIDADE, null, msgs);
      msgs = basicSetEntidade(newEntidade, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ENTIDADES__ENTIDADE, newEntidade, newEntidade));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Entidade> getEntidadeMais()
  {
    if (entidadeMais == null)
    {
      entidadeMais = new EObjectContainmentEList<Entidade>(Entidade.class, this, MyDslPackage.ENTIDADES__ENTIDADE_MAIS);
    }
    return entidadeMais;
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
      case MyDslPackage.ENTIDADES__ENTIDADE:
        return basicSetEntidade(null, msgs);
      case MyDslPackage.ENTIDADES__ENTIDADE_MAIS:
        return ((InternalEList<?>)getEntidadeMais()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.ENTIDADES__ENTIDADE:
        return getEntidade();
      case MyDslPackage.ENTIDADES__ENTIDADE_MAIS:
        return getEntidadeMais();
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
      case MyDslPackage.ENTIDADES__ENTIDADE:
        setEntidade((Entidade)newValue);
        return;
      case MyDslPackage.ENTIDADES__ENTIDADE_MAIS:
        getEntidadeMais().clear();
        getEntidadeMais().addAll((Collection<? extends Entidade>)newValue);
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
      case MyDslPackage.ENTIDADES__ENTIDADE:
        setEntidade((Entidade)null);
        return;
      case MyDslPackage.ENTIDADES__ENTIDADE_MAIS:
        getEntidadeMais().clear();
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
      case MyDslPackage.ENTIDADES__ENTIDADE:
        return entidade != null;
      case MyDslPackage.ENTIDADES__ENTIDADE_MAIS:
        return entidadeMais != null && !entidadeMais.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntidadesImpl
