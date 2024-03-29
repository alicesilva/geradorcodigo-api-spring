/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.tcc.mydsl.myDsl.Api;
import org.xtext.tcc.mydsl.myDsl.ApiNome;
import org.xtext.tcc.mydsl.myDsl.Associacao;
import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.AtributoTipo;
import org.xtext.tcc.mydsl.myDsl.Atributos;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.Entidades;
import org.xtext.tcc.mydsl.myDsl.MyDslPackage;
import org.xtext.tcc.mydsl.myDsl.Nome;
import org.xtext.tcc.mydsl.myDsl.Nome_Atributo;
import org.xtext.tcc.mydsl.myDsl.Operacao;
import org.xtext.tcc.mydsl.myDsl.OperacaoCascada;
import org.xtext.tcc.mydsl.validation.AbstractMyDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  @Check
  public void validaNomes(final Api api) {
    ApiNome _nomeApi = api.getNomeApi();
    String _nome = api.getNomeApi().getNome();
    int _length = api.getNomeApi().getNome().length();
    int _minus = (_length - 1);
    _nomeApi.setNome(_nome.substring(1, _minus));
    this.validaEntidade(api.getEntidades().getEntidade());
    EList<Entidade> _entidadeMais = api.getEntidades().getEntidadeMais();
    for (final Entidade e : _entidadeMais) {
      if ((e != null)) {
        this.validaEntidade(e);
      }
    }
  }
  
  public void validaEntidade(final Entidade entidade) {
    Nome _nomeEntidade = entidade.getNomeEntidade();
    String _nome = entidade.getNomeEntidade().getNome();
    int _length = entidade.getNomeEntidade().getNome().length();
    int _minus = (_length - 1);
    _nomeEntidade.setNome(_nome.substring(1, _minus));
    this.validaAtributo(entidade.getAtributos().getAtributo());
    EList<Atributo> _atributoMais = entidade.getAtributos().getAtributoMais();
    for (final Atributo atributo : _atributoMais) {
      if ((atributo != null)) {
        this.validaAtributo(atributo);
      }
    }
  }
  
  public void validaAtributo(final Atributo atributo) {
    Nome_Atributo _nomeAtributo = atributo.getNomeAtributo();
    String _nome = atributo.getNomeAtributo().getNome();
    int _length = atributo.getNomeAtributo().getNome().length();
    int _minus = (_length - 1);
    _nomeAtributo.setNome(_nome.substring(1, _minus));
    String _tipoPrimitivo = atributo.getAtributoTipo().getTipoPrimitivo();
    boolean _tripleNotEquals = (_tipoPrimitivo != null);
    if (_tripleNotEquals) {
      AtributoTipo _atributoTipo = atributo.getAtributoTipo();
      String _tipoPrimitivo_1 = atributo.getAtributoTipo().getTipoPrimitivo();
      int _length_1 = atributo.getAtributoTipo().getTipoPrimitivo().length();
      int _minus_1 = (_length_1 - 1);
      _atributoTipo.setTipoPrimitivo(_tipoPrimitivo_1.substring(1, _minus_1));
    } else {
      String _tipoColecao = atributo.getAtributoTipo().getTipoColecao();
      boolean _tripleNotEquals_1 = (_tipoColecao != null);
      if (_tripleNotEquals_1) {
        AtributoTipo _atributoTipo_1 = atributo.getAtributoTipo();
        String _tipoColecao_1 = atributo.getAtributoTipo().getTipoColecao();
        int _length_2 = atributo.getAtributoTipo().getTipoColecao().length();
        int _minus_2 = (_length_2 - 1);
        _atributoTipo_1.setTipoColecao(_tipoColecao_1.substring(1, _minus_2));
      } else {
        AtributoTipo _atributoTipo_2 = atributo.getAtributoTipo();
        String _tipoObjeto = atributo.getAtributoTipo().getTipoObjeto();
        int _length_3 = atributo.getAtributoTipo().getTipoObjeto().length();
        int _minus_3 = (_length_3 - 1);
        _atributoTipo_2.setTipoObjeto(_tipoObjeto.substring(1, _minus_3));
      }
    }
    boolean _equals = atributo.getAssociacao().getAssociacao().equals("");
    boolean _not = (!_equals);
    if (_not) {
      Associacao _associacao = atributo.getAssociacao();
      String _associacao_1 = atributo.getAssociacao().getAssociacao();
      int _length_4 = atributo.getAssociacao().getAssociacao().length();
      int _minus_4 = (_length_4 - 1);
      _associacao.setAssociacao(_associacao_1.substring(1, _minus_4));
    }
    Operacao _operacao = atributo.getOperacao();
    boolean _tripleNotEquals_2 = (_operacao != null);
    if (_tripleNotEquals_2) {
      OperacaoCascada _opCascada = atributo.getOperacao().getOpCascada();
      String _operacao_1 = atributo.getOperacao().getOpCascada().getOperacao();
      int _length_5 = atributo.getOperacao().getOpCascada().getOperacao().length();
      int _minus_5 = (_length_5 - 1);
      _opCascada.setOperacao(_operacao_1.substring(1, _minus_5));
      int _size = atributo.getOperacao().getOpCascadaMais().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EList<OperacaoCascada> _opCascadaMais = atributo.getOperacao().getOpCascadaMais();
        for (final OperacaoCascada operacao : _opCascadaMais) {
          String _operacao_2 = operacao.getOperacao();
          int _length_6 = operacao.getOperacao().length();
          int _minus_6 = (_length_6 - 1);
          operacao.setOperacao(_operacao_2.substring(1, _minus_6));
        }
      }
    }
  }
  
  @Check
  public void validaNomeEntidade(final Entidades entidades) {
    EList<Entidade> _entidadeMais = entidades.getEntidadeMais();
    for (final Entidade entidade : _entidadeMais) {
      if ((entidade != null)) {
        String _nome = entidades.getEntidade().getNomeEntidade().getNome();
        String _nome_1 = entidade.getNomeEntidade().getNome();
        boolean _equals = Objects.equal(_nome, _nome_1);
        if (_equals) {
          this.error("Nome de entidade deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
        }
      }
    }
    EList<Entidade> _entidadeMais_1 = entidades.getEntidadeMais();
    for (final Entidade entidade_1 : _entidadeMais_1) {
      {
        int count = 0;
        EList<Entidade> _entidadeMais_2 = entidades.getEntidadeMais();
        for (final Entidade entidadeI : _entidadeMais_2) {
          String _nome_2 = entidade_1.getNomeEntidade().getNome();
          String _nome_3 = entidadeI.getNomeEntidade().getNome();
          boolean _equals_1 = Objects.equal(_nome_2, _nome_3);
          if (_equals_1) {
            count++;
          }
        }
        if ((count > 1)) {
          this.error("Nome de entidade deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
        }
      }
    }
  }
  
  @Check
  public void validaTipoAtributo(final Entidades entidades) {
    List<String> nomesEntidades = new ArrayList<String>();
    nomesEntidades.add(entidades.getEntidade().getNomeEntidade().getNome());
    EList<Entidade> _entidadeMais = entidades.getEntidadeMais();
    for (final Entidade e : _entidadeMais) {
      if ((e != null)) {
        nomesEntidades.add(e.getNomeEntidade().getNome());
      }
    }
    this.validaTipoAtributo(entidades.getEntidade().getAtributos(), nomesEntidades);
    EList<Entidade> _entidadeMais_1 = entidades.getEntidadeMais();
    for (final Entidade e_1 : _entidadeMais_1) {
      if ((e_1 != null)) {
        this.validaTipoAtributo(e_1.getAtributos(), nomesEntidades);
      }
    }
  }
  
  public void validaTipoAtributo(final Atributos atributos, final List<String> nomesEntidades) {
    List<String> _asList = Arrays.<String>asList("Boolean", "Integer", "Long", "String", "Float", "Double", "Time", "Timestamp", "Date");
    List<String> tiposPrimitivos = new ArrayList<String>(_asList);
    String _tipoColecao = atributos.getAtributo().getAtributoTipo().getTipoColecao();
    boolean _tripleNotEquals = (_tipoColecao != null);
    if (_tripleNotEquals) {
      String tipo = this.getNomeTipoColecao(atributos.getAtributo().getAtributoTipo().getTipoColecao());
      if (((!nomesEntidades.contains(tipo)) && (!tiposPrimitivos.contains(tipo)))) {
        this.error(
          "Tipo dos objetos da coleção devem ser algum tipo primitivo ou do tipo de alguma entidade já definida", 
          MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
      }
    } else {
      String _tipoObjeto = atributos.getAtributo().getAtributoTipo().getTipoObjeto();
      boolean _tripleNotEquals_1 = (_tipoObjeto != null);
      if (_tripleNotEquals_1) {
        boolean _contains = nomesEntidades.contains(atributos.getAtributo().getAtributoTipo().getTipoObjeto());
        boolean _not = (!_contains);
        if (_not) {
          this.error(
            "Tipo do atributos dever ser algum tipo primitivo ou de alguma entidade definida anteriormente", 
            MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
        }
      }
    }
    EList<Atributo> _atributoMais = atributos.getAtributoMais();
    for (final Atributo a : _atributoMais) {
      if ((a != null)) {
        String _tipoColecao_1 = a.getAtributoTipo().getTipoColecao();
        boolean _tripleNotEquals_2 = (_tipoColecao_1 != null);
        if (_tripleNotEquals_2) {
          String tipo_1 = this.getNomeTipoColecao(a.getAtributoTipo().getTipoColecao());
          if (((!nomesEntidades.contains(tipo_1)) && (!tiposPrimitivos.contains(tipo_1)))) {
            this.error(
              "Tipos dos objetos da coleção devem ser algum tipo primitivo ou do tipo de alguma entidade já definida", 
              MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
          }
        } else {
          String _tipoObjeto_1 = a.getAtributoTipo().getTipoObjeto();
          boolean _tripleNotEquals_3 = (_tipoObjeto_1 != null);
          if (_tripleNotEquals_3) {
            boolean _contains_1 = nomesEntidades.contains(a.getAtributoTipo().getTipoObjeto());
            boolean _not_1 = (!_contains_1);
            if (_not_1) {
              this.error(
                "Tipo do atributos dever ser algum tipo primitivo ou de alguma entidade definida anteriormente", 
                MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
            }
          }
        }
      }
    }
  }
  
  @Check
  public void validaNomeAtributos(final Entidades entidades) {
    this.validaNomeAtributo(entidades.getEntidade().getAtributos());
    EList<Entidade> _entidadeMais = entidades.getEntidadeMais();
    for (final Entidade entidade : _entidadeMais) {
      this.validaNomeAtributo(entidade.getAtributos());
    }
  }
  
  public void validaNomeAtributo(final Atributos atributos) {
    EList<Atributo> _atributoMais = atributos.getAtributoMais();
    for (final Atributo atributo : _atributoMais) {
      if ((atributo != null)) {
        String _nome = atributos.getAtributo().getNomeAtributo().getNome();
        String _nome_1 = atributo.getNomeAtributo().getNome();
        boolean _equals = Objects.equal(_nome, _nome_1);
        if (_equals) {
          this.error("Nome do atributo deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
        }
      }
    }
    EList<Atributo> _atributoMais_1 = atributos.getAtributoMais();
    for (final Atributo atributo_1 : _atributoMais_1) {
      {
        int count = 0;
        EList<Atributo> _atributoMais_2 = atributos.getAtributoMais();
        for (final Atributo atributoI : _atributoMais_2) {
          String _nome_2 = atributo_1.getNomeAtributo().getNome();
          String _nome_3 = atributoI.getNomeAtributo().getNome();
          boolean _equals_1 = Objects.equal(_nome_2, _nome_3);
          if (_equals_1) {
            count++;
          }
        }
        if ((count > 1)) {
          this.error("Nome do atributo deve ser único.", MyDslPackage.Literals.ENTIDADES__ENTIDADE_MAIS);
        }
      }
    }
  }
  
  public String getNomeTipoColecao(final String nomeTipo) {
    int inicio = 0;
    int fim = 0;
    for (int i = 0; (i < nomeTipo.length()); i++) {
      {
        String c = Character.valueOf(nomeTipo.charAt(i)).toString();
        boolean _equals = Objects.equal(c, "<");
        if (_equals) {
          inicio = i;
        }
        boolean _equals_1 = c.equals(">");
        if (_equals_1) {
          fim = i;
        }
      }
    }
    String nome = nomeTipo.substring((inicio + 1), fim);
    return nome;
  }
}
