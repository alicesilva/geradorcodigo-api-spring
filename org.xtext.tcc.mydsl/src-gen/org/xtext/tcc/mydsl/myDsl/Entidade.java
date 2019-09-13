/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entidade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Entidade#getNomeEntidades <em>Nome Entidades</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Entidade#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link org.xtext.tcc.mydsl.myDsl.Entidade#getChavePrimaria <em>Chave Primaria</em>}</li>
 * </ul>
 *
 * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getEntidade()
 * @model
 * @generated
 */
public interface Entidade extends EObject
{
  /**
   * Returns the value of the '<em><b>Nome Entidades</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome Entidades</em>' containment reference.
   * @see #setNomeEntidades(EntidadeNome)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getEntidade_NomeEntidades()
   * @model containment="true"
   * @generated
   */
  EntidadeNome getNomeEntidades();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Entidade#getNomeEntidades <em>Nome Entidades</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome Entidades</em>' containment reference.
   * @see #getNomeEntidades()
   * @generated
   */
  void setNomeEntidades(EntidadeNome value);

  /**
   * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.tcc.mydsl.myDsl.Atributo}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributos</em>' containment reference list.
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getEntidade_Atributos()
   * @model containment="true"
   * @generated
   */
  EList<Atributo> getAtributos();

  /**
   * Returns the value of the '<em><b>Chave Primaria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chave Primaria</em>' containment reference.
   * @see #setChavePrimaria(ChavePrimaria)
   * @see org.xtext.tcc.mydsl.myDsl.MyDslPackage#getEntidade_ChavePrimaria()
   * @model containment="true"
   * @generated
   */
  ChavePrimaria getChavePrimaria();

  /**
   * Sets the value of the '{@link org.xtext.tcc.mydsl.myDsl.Entidade#getChavePrimaria <em>Chave Primaria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Chave Primaria</em>' containment reference.
   * @see #getChavePrimaria()
   * @generated
   */
  void setChavePrimaria(ChavePrimaria value);

} // Entidade