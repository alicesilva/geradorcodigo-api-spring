/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.tcc.mydsl.myDsl.Atributo;
import org.xtext.tcc.mydsl.myDsl.Entidade;
import org.xtext.tcc.mydsl.myDsl.Entidades;
import org.xtext.tcc.mydsl.myDsl.Operacao;
import org.xtext.tcc.mydsl.myDsl.OperacaoCascada;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entidades> _filter = Iterables.<Entidades>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entidades.class);
    for (final Entidades e : _filter) {
      {
        String _string = StringExtensions.toFirstUpper(e.getEntidade().getNomeEntidade().getNome()).toString();
        String _plus = (_string + ".java");
        fsa.generateFile(_plus, this.compile(e.getEntidade()));
        String _string_1 = StringExtensions.toFirstUpper(e.getEntidade().getNomeEntidade().getNome()).toString();
        String _plus_1 = (_string_1 + "Repository.java");
        fsa.generateFile(_plus_1, 
          this.compileRepository(e.getEntidade()));
        String _string_2 = StringExtensions.toFirstUpper(e.getEntidade().getNomeEntidade().getNome()).toString();
        String _plus_2 = (_string_2 + "Service.java");
        fsa.generateFile(_plus_2, 
          this.compileService(e.getEntidade()));
        int _size = e.getEntidadeMais().size();
        boolean _greaterThan = (_size > 0);
        if (_greaterThan) {
          EList<Entidade> _entidadeMais = e.getEntidadeMais();
          for (final Entidade ent : _entidadeMais) {
            {
              String _string_3 = StringExtensions.toFirstUpper(ent.getNomeEntidade().getNome()).toString();
              String _plus_3 = (_string_3 + ".java");
              fsa.generateFile(_plus_3, this.compile(ent));
              String _string_4 = StringExtensions.toFirstUpper(ent.getNomeEntidade().getNome()).toString();
              String _plus_4 = (_string_4 + "Repository.java");
              fsa.generateFile(_plus_4, 
                this.compileRepository(ent));
              String _string_5 = StringExtensions.toFirstUpper(ent.getNomeEntidade().getNome()).toString();
              String _plus_5 = (_string_5 + "Service.java");
              fsa.generateFile(_plus_5, this.compileService(ent));
            }
          }
        }
      }
    }
  }
  
  public CharSequence compile(final Entidade entidade) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _nome = entidade.getPackage().getNome();
    _builder.append(_nome);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import javax.persistence.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@GeneratedValue(strategy=GenerationType.IDENTITY)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Long id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileAtributos = this.compileAtributos(entidade.getAtributos().getAtributo());
    _builder.append(_compileAtributos, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Atributo> _atributoMais = entidade.getAtributos().getAtributoMais();
      for(final Atributo a : _atributoMais) {
        _builder.append("\t");
        CharSequence _compileAtributos_1 = this.compileAtributos(a);
        _builder.append(_compileAtributos_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _compileGetersSeters = this.compileGetersSeters(entidade.getAtributos().getAtributo());
    _builder.append(_compileGetersSeters, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Atributo> _atributoMais_1 = entidade.getAtributos().getAtributoMais();
      for(final Atributo a_1 : _atributoMais_1) {
        _builder.append("\t");
        CharSequence _compileGetersSeters_1 = this.compileGetersSeters(a_1);
        _builder.append(_compileGetersSeters_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileAtributos(final Atributo atributo) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = atributo.getAssociacao().getAssociacao().equals("");
      boolean _not = (!_equals);
      if (_not) {
        {
          Operacao _operacao = atributo.getOperacao();
          boolean _tripleEquals = (_operacao == null);
          if (_tripleEquals) {
            _builder.append("@");
            String _associacao = atributo.getAssociacao().getAssociacao();
            _builder.append(_associacao);
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("@");
            String _associacao_1 = atributo.getAssociacao().getAssociacao();
            _builder.append(_associacao_1);
            _builder.append("(cascade = {CascadeType.");
            String _operacao_1 = atributo.getOperacao().getOpCascada().getOperacao();
            _builder.append(_operacao_1);
            {
              EList<OperacaoCascada> _opCascadaMais = atributo.getOperacao().getOpCascadaMais();
              for(final OperacaoCascada o : _opCascadaMais) {
                _builder.append(", CascadeType.");
                String _operacao_2 = o.getOperacao();
                _builder.append(_operacao_2);
              }
            }
            _builder.append("})");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      String _tipoPrimitivo = atributo.getAtributoTipo().getTipoPrimitivo();
      boolean _tripleNotEquals = (_tipoPrimitivo != null);
      if (_tripleNotEquals) {
        _builder.append("private ");
        String _firstUpper = StringExtensions.toFirstUpper(atributo.getAtributoTipo().getTipoPrimitivo());
        _builder.append(_firstUpper);
        _builder.append(" ");
        String _firstLower = StringExtensions.toFirstLower(atributo.getNomeAtributo().getNome());
        _builder.append(_firstLower);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        String _tipoColecao = atributo.getAtributoTipo().getTipoColecao();
        boolean _tripleNotEquals_1 = (_tipoColecao != null);
        if (_tripleNotEquals_1) {
          _builder.append("private ");
          String _firstUpper_1 = StringExtensions.toFirstUpper(atributo.getAtributoTipo().getTipoColecao());
          _builder.append(_firstUpper_1);
          _builder.append(" ");
          String _firstLower_1 = StringExtensions.toFirstLower(atributo.getNomeAtributo().getNome());
          _builder.append(_firstLower_1);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("private ");
          String _firstUpper_2 = StringExtensions.toFirstUpper(atributo.getAtributoTipo().getTipoObjeto());
          _builder.append(_firstUpper_2);
          _builder.append(" ");
          String _firstLower_2 = StringExtensions.toFirstLower(atributo.getNomeAtributo().getNome());
          _builder.append(_firstLower_2);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileGetersSeters(final Atributo atributo) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _tipoPrimitivo = atributo.getAtributoTipo().getTipoPrimitivo();
      boolean _tripleNotEquals = (_tipoPrimitivo != null);
      if (_tripleNotEquals) {
        _builder.append("public ");
        String _tipoPrimitivo_1 = atributo.getAtributoTipo().getTipoPrimitivo();
        _builder.append(_tipoPrimitivo_1);
        _builder.append(" get");
        String _firstUpper = StringExtensions.toFirstUpper(atributo.getNomeAtributo().getNome());
        _builder.append(_firstUpper);
        _builder.append("(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        String _nome = atributo.getNomeAtributo().getNome();
        _builder.append(_nome, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("public void set");
        String _firstUpper_1 = StringExtensions.toFirstUpper(atributo.getNomeAtributo().getNome());
        _builder.append(_firstUpper_1);
        _builder.append("(");
        String _tipoPrimitivo_2 = atributo.getAtributoTipo().getTipoPrimitivo();
        _builder.append(_tipoPrimitivo_2);
        _builder.append(" ");
        String _nome_1 = atributo.getNomeAtributo().getNome();
        _builder.append(_nome_1);
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        String _nome_2 = atributo.getNomeAtributo().getNome();
        _builder.append(_nome_2, "\t");
        _builder.append(" = ");
        String _nome_3 = atributo.getNomeAtributo().getNome();
        _builder.append(_nome_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      } else {
        String _tipoColecao = atributo.getAtributoTipo().getTipoColecao();
        boolean _tripleNotEquals_1 = (_tipoColecao != null);
        if (_tripleNotEquals_1) {
          _builder.append("public ");
          String _tipoColecao_1 = atributo.getAtributoTipo().getTipoColecao();
          _builder.append(_tipoColecao_1);
          _builder.append(" get");
          String _firstUpper_2 = StringExtensions.toFirstUpper(atributo.getNomeAtributo().getNome());
          _builder.append(_firstUpper_2);
          _builder.append("(){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("return ");
          String _nome_4 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_4, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("public void set ");
          String _firstUpper_3 = StringExtensions.toFirstUpper(atributo.getNomeAtributo().getNome());
          _builder.append(_firstUpper_3);
          _builder.append("(");
          String _tipoColecao_2 = atributo.getAtributoTipo().getTipoColecao();
          _builder.append(_tipoColecao_2);
          _builder.append(" ");
          String _nome_5 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_5);
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("this.");
          String _nome_6 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_6, "\t");
          _builder.append(" = ");
          String _nome_7 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_7, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
        } else {
          _builder.append("public ");
          String _tipoObjeto = atributo.getAtributoTipo().getTipoObjeto();
          _builder.append(_tipoObjeto);
          _builder.append(" get");
          String _firstUpper_4 = StringExtensions.toFirstUpper(atributo.getNomeAtributo().getNome());
          _builder.append(_firstUpper_4);
          _builder.append("(){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("return ");
          String _nome_8 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_8, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t\t\t\t");
          _builder.newLine();
          _builder.append("public void set ");
          String _firstUpper_5 = StringExtensions.toFirstUpper(atributo.getNomeAtributo().getNome());
          _builder.append(_firstUpper_5);
          _builder.append("(");
          String _tipoObjeto_1 = atributo.getAtributoTipo().getTipoObjeto();
          _builder.append(_tipoObjeto_1);
          _builder.append(" ");
          String _nome_9 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_9);
          _builder.append("){");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("this.");
          String _nome_10 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_10, "\t");
          _builder.append(" = ");
          String _nome_11 = atributo.getNomeAtributo().getNome();
          _builder.append(_nome_11, "\t");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("}");
          _builder.newLine();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileRepository(final Entidade entidade) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _nome = entidade.getPackage().getNome();
    _builder.append(_nome);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.springframework.data.jpa.repository.JpaRepository;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Repository;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Repository");
    _builder.newLine();
    _builder.append("public interface ");
    String _firstUpper = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper);
    _builder.append("Repository extends JpaRepository<");
    String _firstUpper_1 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_1);
    _builder.append(", Long>{");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileService(final Entidade entidade) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _nome = entidade.getPackage().getNome();
    _builder.append(_nome);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import org.springframework.beans.factory.annotation.Autowired;");
    _builder.newLine();
    _builder.append("import org.springframework.stereotype.Service;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Service");
    _builder.newLine();
    _builder.append("public class ");
    String _firstUpper = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper);
    _builder.append("Service {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Autowired");
    _builder.newLine();
    _builder.append("\t");
    String _firstUpper_1 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_1, "\t");
    _builder.append("Repository ");
    String _nome_1 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_1, "\t");
    _builder.append("Repository;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void save(");
    String _firstUpper_2 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_2, "\t");
    _builder.append(" ");
    String _nome_2 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_2, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _nome_3 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_3, "\t\t");
    _builder.append("Repository.save(");
    String _nome_4 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_4, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<");
    String _firstUpper_3 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_3, "\t");
    _builder.append("> get");
    String _firstUpper_4 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_4, "\t");
    _builder.append("s(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    String _nome_5 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_5, "\t\t");
    _builder.append("Repository.findAll();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _firstUpper_5 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_5, "\t");
    _builder.append(" get");
    String _firstUpper_6 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_6, "\t");
    _builder.append("ById(Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if(exists");
    String _firstUpper_7 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_7, "\t\t");
    _builder.append("ById(id)) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return ");
    String _nome_6 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_6, "\t\t\t");
    _builder.append("Repository.getOne(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}else {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void deleteAll");
    String _firstUpper_8 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_8, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _nome_7 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_7, "\t\t");
    _builder.append("Repository.deleteAll();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Boolean delete");
    String _firstUpper_9 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_9, "\t");
    _builder.append("(Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if(exists");
    String _firstUpper_10 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_10, "\t\t");
    _builder.append("ById(id)) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _nome_8 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_8, "\t\t\t");
    _builder.append("Repository.deleteById(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean exists");
    String _firstUpper_11 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_11, "\t");
    _builder.append("ById(Long id) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ");
    String _nome_9 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_9, "\t\t");
    _builder.append("Repository.existsById(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Boolean update");
    String _firstUpper_12 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_12, "\t");
    _builder.append("(Long id, ");
    String _firstUpper_13 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_13, "\t");
    _builder.append(" ");
    String _nome_10 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_10, "\t");
    _builder.append("Update) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if(exists");
    String _firstUpper_14 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_14, "\t\t");
    _builder.append("ById(id)) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _firstUpper_15 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_15, "\t\t\t");
    _builder.append(" ");
    String _nome_11 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_11, "\t\t\t");
    _builder.append(" = get");
    String _firstUpper_16 = StringExtensions.toFirstUpper(entidade.getNomeEntidade().getNome());
    _builder.append(_firstUpper_16, "\t\t\t");
    _builder.append("ById(id);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _nome_12 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_12, "\t\t\t");
    _builder.append(".set");
    String _firstUpper_17 = StringExtensions.toFirstUpper(entidade.getAtributos().getAtributo().getNomeAtributo().getNome());
    _builder.append(_firstUpper_17, "\t\t\t");
    _builder.append("(");
    String _nome_13 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_13, "\t\t\t");
    _builder.append("Update.get");
    String _firstUpper_18 = StringExtensions.toFirstUpper(entidade.getAtributos().getAtributo().getNomeAtributo().getNome());
    _builder.append(_firstUpper_18, "\t\t\t");
    _builder.append("());");
    _builder.newLineIfNotEmpty();
    {
      EList<Atributo> _atributoMais = entidade.getAtributos().getAtributoMais();
      for(final Atributo at : _atributoMais) {
        _builder.append("\t\t\t");
        String _nome_14 = entidade.getNomeEntidade().getNome();
        _builder.append(_nome_14, "\t\t\t");
        _builder.append(".set");
        String _firstUpper_19 = StringExtensions.toFirstUpper(at.getNomeAtributo().getNome());
        _builder.append(_firstUpper_19, "\t\t\t");
        _builder.append("(");
        String _nome_15 = entidade.getNomeEntidade().getNome();
        _builder.append(_nome_15, "\t\t\t");
        _builder.append("Update.get");
        String _firstUpper_20 = StringExtensions.toFirstUpper(at.getNomeAtributo().getNome());
        _builder.append(_firstUpper_20, "\t\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    String _nome_16 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_16, "\t\t\t");
    _builder.append("Repository.save(");
    String _nome_17 = entidade.getNomeEntidade().getNome();
    _builder.append(_nome_17, "\t\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
