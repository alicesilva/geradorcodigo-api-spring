/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.tcc.mydsl.myDsl.AtributoTipo;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo Tipo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.AtributoTipoImpl#getTipoP <em>Tipo P</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.impl.AtributoTipoImpl#getTipoE <em>Tipo E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoTipoImpl extends MinimalEObjectImpl.Container implements AtributoTipo
{
  /**
   * The default value of the '{@link #getTipoP() <em>Tipo P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoP()
   * @generated
   * @ordered
   */
  protected static final String TIPO_P_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipoP() <em>Tipo P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoP()
   * @generated
   * @ordered
   */
  protected String tipoP = TIPO_P_EDEFAULT;

  /**
   * The default value of the '{@link #getTipoE() <em>Tipo E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoE()
   * @generated
   * @ordered
   */
  protected static final String TIPO_E_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipoE() <em>Tipo E</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoE()
   * @generated
   * @ordered
   */
  protected String tipoE = TIPO_E_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributoTipoImpl()
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
    return MyDslPackage.Literals.ATRIBUTO_TIPO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTipoP()
  {
    return tipoP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipoP(String newTipoP)
  {
    String oldTipoP = tipoP;
    tipoP = newTipoP;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTO_TIPO__TIPO_P, oldTipoP, tipoP));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTipoE()
  {
    return tipoE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipoE(String newTipoE)
  {
    String oldTipoE = tipoE;
    tipoE = newTipoE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ATRIBUTO_TIPO__TIPO_E, oldTipoE, tipoE));
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
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_P:
        return getTipoP();
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_E:
        return getTipoE();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_P:
        setTipoP((String)newValue);
        return;
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_E:
        setTipoE((String)newValue);
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
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_P:
        setTipoP(TIPO_P_EDEFAULT);
        return;
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_E:
        setTipoE(TIPO_E_EDEFAULT);
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
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_P:
        return TIPO_P_EDEFAULT == null ? tipoP != null : !TIPO_P_EDEFAULT.equals(tipoP);
      case MyDslPackage.ATRIBUTO_TIPO__TIPO_E:
        return TIPO_E_EDEFAULT == null ? tipoE != null : !TIPO_E_EDEFAULT.equals(tipoE);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (tipoP: ");
    result.append(tipoP);
    result.append(", tipoE: ");
    result.append(tipoE);
    result.append(')');
    return result.toString();
  }

} //AtributoTipoImpl
