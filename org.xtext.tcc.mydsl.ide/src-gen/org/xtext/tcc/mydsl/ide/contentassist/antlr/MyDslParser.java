/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.tcc.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.tcc.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getColunaNomeAccess().getAlternatives(), "rule__ColunaNome__Alternatives");
			builder.put(grammarAccess.getTabelaNomeAccess().getAlternatives(), "rule__TabelaNome__Alternatives");
			builder.put(grammarAccess.getOperacaoAccess().getAlternatives(), "rule__Operacao__Alternatives");
			builder.put(grammarAccess.getAssociacaoAccess().getAlternatives(), "rule__Associacao__Alternatives");
			builder.put(grammarAccess.getAtributoTipoAccess().getAlternatives(), "rule__AtributoTipo__Alternatives");
			builder.put(grammarAccess.getOptionalAccess().getAlternatives(), "rule__Optional__Alternatives");
			builder.put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
			builder.put(grammarAccess.getApiAccess().getGroup(), "rule__Api__Group__0");
			builder.put(grammarAccess.getEntidadeAccess().getGroup(), "rule__Entidade__Group__0");
			builder.put(grammarAccess.getAtributoAccess().getGroup(), "rule__Atributo__Group__0");
			builder.put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
			builder.put(grammarAccess.getGreetingAccess().getApiAssignment_1(), "rule__Greeting__ApiAssignment_1");
			builder.put(grammarAccess.getApiAccess().getNomeApiAssignment_2(), "rule__Api__NomeApiAssignment_2");
			builder.put(grammarAccess.getApiAccess().getEntidadesAssignment_7(), "rule__Api__EntidadesAssignment_7");
			builder.put(grammarAccess.getApiNomeAccess().getIdAssignment(), "rule__ApiNome__IdAssignment");
			builder.put(grammarAccess.getEntidadeAccess().getNomeEntidadesAssignment_3(), "rule__Entidade__NomeEntidadesAssignment_3");
			builder.put(grammarAccess.getEntidadeAccess().getAtributosAssignment_8(), "rule__Entidade__AtributosAssignment_8");
			builder.put(grammarAccess.getEntidadeAccess().getChavePrimariaAssignment_13(), "rule__Entidade__ChavePrimariaAssignment_13");
			builder.put(grammarAccess.getEntidadeNomeAccess().getIdAssignment(), "rule__EntidadeNome__IdAssignment");
			builder.put(grammarAccess.getAtributoAccess().getAtributoNomeAssignment_3(), "rule__Atributo__AtributoNomeAssignment_3");
			builder.put(grammarAccess.getAtributoAccess().getAtributoTipoAssignment_7(), "rule__Atributo__AtributoTipoAssignment_7");
			builder.put(grammarAccess.getAtributoAccess().getAssociacaoAssignment_11(), "rule__Atributo__AssociacaoAssignment_11");
			builder.put(grammarAccess.getAtributoAccess().getOperacaoAssignment_15(), "rule__Atributo__OperacaoAssignment_15");
			builder.put(grammarAccess.getAtributoAccess().getTabelaNomeAssignment_19(), "rule__Atributo__TabelaNomeAssignment_19");
			builder.put(grammarAccess.getAtributoAccess().getColunaNomeAssignment_23(), "rule__Atributo__ColunaNomeAssignment_23");
			builder.put(grammarAccess.getAtributoAccess().getColunaNomeInverseAssignment_27(), "rule__Atributo__ColunaNomeInverseAssignment_27");
			builder.put(grammarAccess.getColunaNomeAccess().getColunaNomeAssignment_0(), "rule__ColunaNome__ColunaNomeAssignment_0");
			builder.put(grammarAccess.getColunaNomeAccess().getColunaNomeAssignment_1(), "rule__ColunaNome__ColunaNomeAssignment_1");
			builder.put(grammarAccess.getTabelaNomeAccess().getTabelaNomeAssignment_0(), "rule__TabelaNome__TabelaNomeAssignment_0");
			builder.put(grammarAccess.getTabelaNomeAccess().getTabelaNomeAssignment_1(), "rule__TabelaNome__TabelaNomeAssignment_1");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_0(), "rule__Operacao__OpCascadaAssignment_0");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_1(), "rule__Operacao__OpCascadaAssignment_1");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_2(), "rule__Operacao__OpCascadaAssignment_2");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_3(), "rule__Operacao__OpCascadaAssignment_3");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_4(), "rule__Operacao__OpCascadaAssignment_4");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_5(), "rule__Operacao__OpCascadaAssignment_5");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment_6(), "rule__Operacao__OpCascadaAssignment_6");
			builder.put(grammarAccess.getAssociacaoAccess().getAssociacaoAssignment_0(), "rule__Associacao__AssociacaoAssignment_0");
			builder.put(grammarAccess.getAssociacaoAccess().getAssociacaoAssignment_1(), "rule__Associacao__AssociacaoAssignment_1");
			builder.put(grammarAccess.getAssociacaoAccess().getAssociacaoAssignment_2(), "rule__Associacao__AssociacaoAssignment_2");
			builder.put(grammarAccess.getAssociacaoAccess().getAssociacaoAssignment_3(), "rule__Associacao__AssociacaoAssignment_3");
			builder.put(grammarAccess.getAssociacaoAccess().getAssociacaoAssignment_4(), "rule__Associacao__AssociacaoAssignment_4");
			builder.put(grammarAccess.getAtributoNomeAccess().getIdAssignment(), "rule__AtributoNome__IdAssignment");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_0(), "rule__AtributoTipo__TipoPAssignment_0");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_1(), "rule__AtributoTipo__TipoPAssignment_1");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_2(), "rule__AtributoTipo__TipoPAssignment_2");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_3(), "rule__AtributoTipo__TipoPAssignment_3");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_4(), "rule__AtributoTipo__TipoPAssignment_4");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_5(), "rule__AtributoTipo__TipoPAssignment_5");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_6(), "rule__AtributoTipo__TipoPAssignment_6");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_7(), "rule__AtributoTipo__TipoPAssignment_7");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_8(), "rule__AtributoTipo__TipoPAssignment_8");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_9(), "rule__AtributoTipo__TipoPAssignment_9");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_10(), "rule__AtributoTipo__TipoPAssignment_10");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_11(), "rule__AtributoTipo__TipoPAssignment_11");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_12(), "rule__AtributoTipo__TipoPAssignment_12");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_13(), "rule__AtributoTipo__TipoPAssignment_13");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoEAssignment_14(), "rule__AtributoTipo__TipoEAssignment_14");
			builder.put(grammarAccess.getOptionalAccess().getOptionalAssignment_0(), "rule__Optional__OptionalAssignment_0");
			builder.put(grammarAccess.getOptionalAccess().getOptionalAssignment_1(), "rule__Optional__OptionalAssignment_1");
			builder.put(grammarAccess.getOptionalAccess().getOptionalAssignment_2(), "rule__Optional__OptionalAssignment_2");
			builder.put(grammarAccess.getChavePrimariaAccess().getIdAssignment(), "rule__ChavePrimaria__IdAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
