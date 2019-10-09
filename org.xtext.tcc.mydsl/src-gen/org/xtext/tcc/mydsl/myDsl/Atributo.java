/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Atributo#getNomeAtributo <em>Nome Atributo</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoTipo <em>Atributo Tipo</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAssociacao <em>Associacao</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Atributo#getOperacao <em>Operacao</em>}</li>
 * </ul>
 *
 * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Atributo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Atributo</em>' containment reference.
   * @see #setNomeAtributo(Nome)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo_NomeAtributo()
   * @model containment="true"
   * @generated
   */
  Nome getNomeAtributo();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getNomeAtributo <em>Nome Atributo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Atributo</em>' containment reference.
   * @see #getNomeAtributo()
   * @generated
   */
  void setNomeAtributo(Nome value);

  /**
   * Returns the value of the '<em><b>Atributo Tipo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributo Tipo</em>' containment reference.
   * @see #setAtributoTipo(AtributoTipo)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo_AtributoTipo()
   * @model containment="true"
   * @generated
   */
  AtributoTipo getAtributoTipo();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoTipo <em>Atributo Tipo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atributo Tipo</em>' containment reference.
   * @see #getAtributoTipo()
   * @generated
   */
  void setAtributoTipo(AtributoTipo value);

  /**
   * Returns the value of the '<em><b>Associacao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Associacao</em>' containment reference.
   * @see #setAssociacao(Associacao)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo_Associacao()
   * @model containment="true"
   * @generated
   */
  Associacao getAssociacao();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAssociacao <em>Associacao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Associacao</em>' containment reference.
   * @see #getAssociacao()
   * @generated
   */
  void setAssociacao(Associacao value);

  /**
   * Returns the value of the '<em><b>Operacao</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operacao</em>' containment reference.
   * @see #setOperacao(Operacao)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo_Operacao()
   * @model containment="true"
   * @generated
   */
  Operacao getOperacao();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getOperacao <em>Operacao</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operacao</em>' containment reference.
   * @see #getOperacao()
   * @generated
   */
  void setOperacao(Operacao value);

} // Atributo
