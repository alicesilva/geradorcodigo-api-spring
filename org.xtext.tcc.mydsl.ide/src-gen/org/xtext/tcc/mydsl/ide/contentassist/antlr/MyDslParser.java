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
			builder.put(grammarAccess.getAtributoTipoAccess().getAlternatives(), "rule__AtributoTipo__Alternatives");
			builder.put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
			builder.put(grammarAccess.getApiAccess().getGroup(), "rule__Api__Group__0");
			builder.put(grammarAccess.getEntidadeAccess().getGroup(), "rule__Entidade__Group__0");
			builder.put(grammarAccess.getAtributoAccess().getGroup(), "rule__Atributo__Group__0");
			builder.put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
			builder.put(grammarAccess.getGreetingAccess().getApiAssignment_1(), "rule__Greeting__ApiAssignment_1");
			builder.put(grammarAccess.getApiAccess().getNomeApiAssignment_2(), "rule__Api__NomeApiAssignment_2");
			builder.put(grammarAccess.getApiAccess().getEntidadesAssignment_7(), "rule__Api__EntidadesAssignment_7");
			builder.put(grammarAccess.getApiNomeAccess().getNomeAssignment(), "rule__ApiNome__NomeAssignment");
			builder.put(grammarAccess.getEntidadeAccess().getNomeEntidadeAssignment_3(), "rule__Entidade__NomeEntidadeAssignment_3");
			builder.put(grammarAccess.getEntidadeAccess().getAtributosAssignment_8(), "rule__Entidade__AtributosAssignment_8");
			builder.put(grammarAccess.getEntidadeAccess().getChavePrimariaAssignment_13(), "rule__Entidade__ChavePrimariaAssignment_13");
			builder.put(grammarAccess.getEntidadeAccess().getPackageAssignment_17(), "rule__Entidade__PackageAssignment_17");
			builder.put(grammarAccess.getNomeAccess().getNomeAssignment(), "rule__Nome__NomeAssignment");
			builder.put(grammarAccess.getAtributoAccess().getNomeAtributoAssignment_3(), "rule__Atributo__NomeAtributoAssignment_3");
			builder.put(grammarAccess.getAtributoAccess().getAtributoTipoAssignment_7(), "rule__Atributo__AtributoTipoAssignment_7");
			builder.put(grammarAccess.getAtributoAccess().getAssociacaoAssignment_11(), "rule__Atributo__AssociacaoAssignment_11");
			builder.put(grammarAccess.getAtributoAccess().getOperacaoAssignment_15(), "rule__Atributo__OperacaoAssignment_15");
			builder.put(grammarAccess.getOperacaoAccess().getOpCascadaAssignment(), "rule__Operacao__OpCascadaAssignment");
			builder.put(grammarAccess.getAssociacaoAccess().getAssociacaoAssignment(), "rule__Associacao__AssociacaoAssignment");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoPAssignment_0(), "rule__AtributoTipo__TipoPAssignment_0");
			builder.put(grammarAccess.getAtributoTipoAccess().getTipoEAssignment_1(), "rule__AtributoTipo__TipoEAssignment_1");
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
