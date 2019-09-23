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
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoNome <em>Atributo Nome</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoTipo <em>Atributo Tipo</em>}</li>
 * </ul>
 *
 * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject
{
  /**
   * Returns the value of the '<em><b>Atributo Nome</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributo Nome</em>' containment reference.
   * @see #setAtributoNome(AtributoNome)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getAtributo_AtributoNome()
   * @model containment="true"
   * @generated
   */
  AtributoNome getAtributoNome();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Atributo#getAtributoNome <em>Atributo Nome</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atributo Nome</em>' containment reference.
   * @see #getAtributoNome()
   * @generated
   */
  void setAtributoNome(AtributoNome value);

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

} // Atributo
