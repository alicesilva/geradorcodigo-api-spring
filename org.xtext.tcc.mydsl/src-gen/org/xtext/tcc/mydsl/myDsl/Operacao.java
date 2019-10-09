/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operacao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascada <em>Op Cascada</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascadaMais <em>Op Cascada Mais</em>}</li>
 * </ul>
 *
 * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getOperacao()
 * @model
 * @generated
 */
public interface Operacao extends EObject
{
  /**
   * Returns the value of the '<em><b>Op Cascada</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Cascada</em>' containment reference.
   * @see #setOpCascada(OperacaoCascada)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getOperacao_OpCascada()
   * @model containment="true"
   * @generated
   */
  OperacaoCascada getOpCascada();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Operacao#getOpCascada <em>Op Cascada</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Cascada</em>' containment reference.
   * @see #getOpCascada()
   * @generated
   */
  void setOpCascada(OperacaoCascada value);

  /**
   * Returns the value of the '<em><b>Op Cascada Mais</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tcc.mydsl.myDsl.OperacaoCascada}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Cascada Mais</em>' containment reference list.
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getOperacao_OpCascadaMais()
   * @model containment="true"
   * @generated
   */
  EList<OperacaoCascada> getOpCascadaMais();

} // Operacao
