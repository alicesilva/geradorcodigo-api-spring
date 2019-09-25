/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.tcc.mydsl.myDsl.Api;
import org.xtext.tcc.mydsl.myDsl.ApiNome;
import org.xtext.tcc.mydsl.myDsl.Associacao;
import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.AtributoTipo;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.Nome;
import org.xtext.tcc.mydsl.myDsl.Operacao;
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
    ApiNome _nomeApi = api.getNomeApi();
    String _nome = api.getNomeApi().getNome();
    int _length = api.getNomeApi().getNome().length();
    int _minus = (_length - 1);
    _nomeApi.setNome(_nome.substring(1, _minus));
    EList<Entidade> _entidades = api.getEntidades();
    for (final Entidade e : _entidades) {
      {
        Nome _nomeEntidade = e.getNomeEntidade();
        String _nome_1 = e.getNomeEntidade().getNome();
        int _length_1 = e.getNomeEntidade().getNome().length();
        int _minus_1 = (_length_1 - 1);
        _nomeEntidade.setNome(_nome_1.substring(1, _minus_1));
        Nome _chavePrimaria = e.getChavePrimaria();
        String _nome_2 = e.getChavePrimaria().getNome();
        int _length_2 = e.getChavePrimaria().getNome().length();
        int _minus_2 = (_length_2 - 1);
        _chavePrimaria.setNome(_nome_2.substring(1, _minus_2));
        Nome _package = e.getPackage();
        String _nome_3 = e.getPackage().getNome();
        int _length_3 = e.getPackage().getNome().length();
        int _minus_3 = (_length_3 - 1);
        _package.setNome(_nome_3.substring(1, _minus_3));
        EList<Atributo> _atributos = e.getAtributos();
        for (final Atributo a : _atributos) {
          {
            Nome _nomeAtributo = a.getNomeAtributo();
            String _nome_4 = a.getNomeAtributo().getNome();
            int _length_4 = a.getNomeAtributo().getNome().length();
            int _minus_4 = (_length_4 - 1);
            _nomeAtributo.setNome(_nome_4.substring(1, _minus_4));
            String _tipoP = a.getAtributoTipo().getTipoP();
            boolean _tripleNotEquals = (_tipoP != null);
            if (_tripleNotEquals) {
              AtributoTipo _atributoTipo = a.getAtributoTipo();
              String _tipoP_1 = a.getAtributoTipo().getTipoP();
              int _length_5 = a.getAtributoTipo().getTipoP().length();
              int _minus_5 = (_length_5 - 1);
              _atributoTipo.setTipoP(_tipoP_1.substring(1, _minus_5));
            } else {
              AtributoTipo _atributoTipo_1 = a.getAtributoTipo();
              String _tipoE = a.getAtributoTipo().getTipoE();
              int _length_6 = a.getAtributoTipo().getTipoE().length();
              int _minus_6 = (_length_6 - 1);
              _atributoTipo_1.setTipoE(_tipoE.substring(1, _minus_6));
            }
            Associacao _associacao = a.getAssociacao();
            String _associacao_1 = a.getAssociacao().getAssociacao();
            int _length_7 = a.getAssociacao().getAssociacao().length();
            int _minus_7 = (_length_7 - 1);
            _associacao.setAssociacao(_associacao_1.substring(1, _minus_7));
            Operacao _operacao = a.getOperacao();
            String _opCascada = a.getOperacao().getOpCascada();
            int _length_8 = a.getOperacao().getOpCascada().length();
            int _minus_8 = (_length_8 - 1);
            _operacao.setOpCascada(_opCascada.substring(1, _minus_8));
          }
        }
      }
    }
    this.checkNomesEntidades(api);
    this.checkTipoAtributos(api);
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
