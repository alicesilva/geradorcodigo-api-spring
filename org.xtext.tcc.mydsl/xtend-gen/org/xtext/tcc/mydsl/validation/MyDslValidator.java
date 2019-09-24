/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.tcc.mydsl.myDsl.Api;
import org.xtext.tcc.mydsl.validation.AbstractMyDslValidator;
import org.xtext.tcc.mydsl.validation.EntidadeValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  private EntidadeValidator entidadeValidator = new EntidadeValidator();
  
  @Check
  public void check(final Api api) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ssss is undefined");
  }
  
  public void checkNomesEntidades(final Api api) {
    org.xtext.tcc.mydsl.validation.Exception _checkNomeEntidades = this.entidadeValidator.checkNomeEntidades(api);
    boolean _tripleNotEquals = (_checkNomeEntidades != null);
    if (_tripleNotEquals) {
      org.xtext.tcc.mydsl.validation.Exception erro = this.entidadeValidator.checkNomeEntidades(api);
      this.error(erro.erro, erro.feature);
    }
  }
  
  public void checkChavePrimaria(final Api api) {
    org.xtext.tcc.mydsl.validation.Exception _checkChavePrimaria = this.entidadeValidator.checkChavePrimaria(api);
    boolean _tripleNotEquals = (_checkChavePrimaria != null);
    if (_tripleNotEquals) {
      org.xtext.tcc.mydsl.validation.Exception erro = this.entidadeValidator.checkChavePrimaria(api);
      this.error(erro.erro, erro.feature);
    }
  }
  
  public void checkTipoAtributos(final Api api) {
    org.xtext.tcc.mydsl.validation.Exception _checkTipoAtributo = this.entidadeValidator.checkTipoAtributo(api);
    boolean _tripleNotEquals = (_checkTipoAtributo != null);
    if (_tripleNotEquals) {
      org.xtext.tcc.mydsl.validation.Exception erro = this.entidadeValidator.checkTipoAtributo(api);
      this.error(erro.erro, erro.feature);
    }
  }
  
  public boolean verificaTamanho(final String palavra) {
    int _length = palavra.length();
    return (_length > 0);
  }
}
