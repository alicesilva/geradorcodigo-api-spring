/*
 * generated by Xtext 2.18.0.M3
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.tcc.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.tcc.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tcc.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
			}
			lv_greetings_0_0=ruleGreeting
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"greetings",
					lv_greetings_0_0,
					"org.xtext.tcc.mydsl.MyDsl.Greeting");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleGreeting
entryRuleGreeting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreetingRule()); }
	iv_ruleGreeting=ruleGreeting
	{ $current=$iv_ruleGreeting.current; }
	EOF;

// Rule Greeting
ruleGreeting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0());
				}
				lv_api_1_0=ruleApi
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGreetingRule());
					}
					set(
						$current,
						"api",
						lv_api_1_0,
						"org.xtext.tcc.mydsl.MyDsl.Api");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='}'
		{
			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2());
		}
	)
;

// Entry rule entryRuleApi
entryRuleApi returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApiRule()); }
	iv_ruleApi=ruleApi
	{ $current=$iv_ruleApi.current; }
	EOF;

// Rule Api
ruleApi returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='"Nome da Api"'
		{
			newLeafNode(otherlv_0, grammarAccess.getApiAccess().getNomeDaApiKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApiAccess().getNomeApiApiNomeParserRuleCall_2_0());
				}
				lv_nomeApi_2_0=ruleApiNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApiRule());
					}
					set(
						$current,
						"nomeApi",
						lv_nomeApi_2_0,
						"org.xtext.tcc.mydsl.MyDsl.ApiNome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getCommaKeyword_3());
		}
		otherlv_4='"Entidades"'
		{
			newLeafNode(otherlv_4, grammarAccess.getApiAccess().getEntidadesKeyword_4());
		}
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getApiAccess().getColonKeyword_5());
		}
		otherlv_6='['
		{
			newLeafNode(otherlv_6, grammarAccess.getApiAccess().getLeftSquareBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadeParserRuleCall_7_0());
				}
				lv_entidades_7_0=ruleEntidade
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApiRule());
					}
					add(
						$current,
						"entidades",
						lv_entidades_7_0,
						"org.xtext.tcc.mydsl.MyDsl.Entidade");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_8=']'
		{
			newLeafNode(otherlv_8, grammarAccess.getApiAccess().getRightSquareBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleApiNome
entryRuleApiNome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getApiNomeRule()); }
	iv_ruleApiNome=ruleApiNome
	{ $current=$iv_ruleApiNome.current; }
	EOF;

// Rule ApiNome
ruleApiNome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_id_0_0=RULE_ID
			{
				newLeafNode(lv_id_0_0, grammarAccess.getApiNomeAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getApiNomeRule());
				}
				setWithLastConsumed(
					$current,
					"id",
					lv_id_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleEntidade
entryRuleEntidade returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntidadeRule()); }
	iv_ruleEntidade=ruleEntidade
	{ $current=$iv_ruleEntidade.current; }
	EOF;

// Rule Entidade
ruleEntidade returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
		}
		otherlv_1='"Nome"'
		{
			newLeafNode(otherlv_1, grammarAccess.getEntidadeAccess().getNomeKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadesEntidadeNomeParserRuleCall_3_0());
				}
				lv_nomeEntidades_3_0=ruleEntidadeNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadeRule());
					}
					set(
						$current,
						"nomeEntidades",
						lv_nomeEntidades_3_0,
						"org.xtext.tcc.mydsl.MyDsl.EntidadeNome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getCommaKeyword_4());
		}
		otherlv_5='"Atributos"'
		{
			newLeafNode(otherlv_5, grammarAccess.getEntidadeAccess().getAtributosKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntidadeAccess().getColonKeyword_6());
		}
		otherlv_7='['
		{
			newLeafNode(otherlv_7, grammarAccess.getEntidadeAccess().getLeftSquareBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributosAtributoParserRuleCall_8_0());
				}
				lv_atributos_8_0=ruleAtributo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadeRule());
					}
					add(
						$current,
						"atributos",
						lv_atributos_8_0,
						"org.xtext.tcc.mydsl.MyDsl.Atributo");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_9=']'
		{
			newLeafNode(otherlv_9, grammarAccess.getEntidadeAccess().getRightSquareBracketKeyword_9());
		}
		otherlv_10=','
		{
			newLeafNode(otherlv_10, grammarAccess.getEntidadeAccess().getCommaKeyword_10());
		}
		otherlv_11='"Chave Primaria"'
		{
			newLeafNode(otherlv_11, grammarAccess.getEntidadeAccess().getChavePrimariaKeyword_11());
		}
		otherlv_12=':'
		{
			newLeafNode(otherlv_12, grammarAccess.getEntidadeAccess().getColonKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadeAccess().getChavePrimariaChavePrimariaParserRuleCall_13_0());
				}
				lv_chavePrimaria_13_0=ruleChavePrimaria
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadeRule());
					}
					set(
						$current,
						"chavePrimaria",
						lv_chavePrimaria_13_0,
						"org.xtext.tcc.mydsl.MyDsl.ChavePrimaria");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleEntidadeNome
entryRuleEntidadeNome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntidadeNomeRule()); }
	iv_ruleEntidadeNome=ruleEntidadeNome
	{ $current=$iv_ruleEntidadeNome.current; }
	EOF;

// Rule EntidadeNome
ruleEntidadeNome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_id_0_0=RULE_ID
			{
				newLeafNode(lv_id_0_0, grammarAccess.getEntidadeNomeAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEntidadeNomeRule());
				}
				setWithLastConsumed(
					$current,
					"id",
					lv_id_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleAtributo
entryRuleAtributo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtributoRule()); }
	iv_ruleAtributo=ruleAtributo
	{ $current=$iv_ruleAtributo.current; }
	EOF;

// Rule Atributo
ruleAtributo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
		}
		otherlv_1='"nome-atributo"'
		{
			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
		}
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNomeAtributoNomeParserRuleCall_3_0());
				}
				lv_atributoNome_3_0=ruleAtributoNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"atributoNome",
						lv_atributoNome_3_0,
						"org.xtext.tcc.mydsl.MyDsl.AtributoNome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=','
		{
			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getCommaKeyword_4());
		}
		otherlv_5='"tipo-atributo"'
		{
			newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getTipoAtributoKeyword_5());
		}
		otherlv_6=':'
		{
			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getColonKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoTipoAtributoTipoParserRuleCall_7_0());
				}
				lv_atributoTipo_7_0=ruleAtributoTipo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"atributoTipo",
						lv_atributoTipo_7_0,
						"org.xtext.tcc.mydsl.MyDsl.AtributoTipo");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getCommaKeyword_8());
		}
		otherlv_9='"associa\u00E7\u00E3o"'
		{
			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getAssociaOKeyword_9());
		}
		otherlv_10=':'
		{
			newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getColonKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getAssociacaoAssociacaoParserRuleCall_11_0());
				}
				lv_associacao_11_0=ruleAssociacao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"associacao",
						lv_associacao_11_0,
						"org.xtext.tcc.mydsl.MyDsl.Associacao");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12=','
		{
			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getCommaKeyword_12());
		}
		otherlv_13='"opera\u00E7\u00E3o em cascata"'
		{
			newLeafNode(otherlv_13, grammarAccess.getAtributoAccess().getOperaOEmCascataKeyword_13());
		}
		otherlv_14=':'
		{
			newLeafNode(otherlv_14, grammarAccess.getAtributoAccess().getColonKeyword_14());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getOperacaoOperacaoParserRuleCall_15_0());
				}
				lv_operacao_15_0=ruleOperacao
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"operacao",
						lv_operacao_15_0,
						"org.xtext.tcc.mydsl.MyDsl.Operacao");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_16=','
		{
			newLeafNode(otherlv_16, grammarAccess.getAtributoAccess().getCommaKeyword_16());
		}
		otherlv_17='"joinTable-nome"'
		{
			newLeafNode(otherlv_17, grammarAccess.getAtributoAccess().getJoinTableNomeKeyword_17());
		}
		otherlv_18=':'
		{
			newLeafNode(otherlv_18, grammarAccess.getAtributoAccess().getColonKeyword_18());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getTabelaNomeTabelaNomeParserRuleCall_19_0());
				}
				lv_tabelaNome_19_0=ruleTabelaNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"tabelaNome",
						lv_tabelaNome_19_0,
						"org.xtext.tcc.mydsl.MyDsl.TabelaNome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_20=','
		{
			newLeafNode(otherlv_20, grammarAccess.getAtributoAccess().getCommaKeyword_20());
		}
		otherlv_21='"joinColumns-nome"'
		{
			newLeafNode(otherlv_21, grammarAccess.getAtributoAccess().getJoinColumnsNomeKeyword_21());
		}
		otherlv_22=':'
		{
			newLeafNode(otherlv_22, grammarAccess.getAtributoAccess().getColonKeyword_22());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeColunaNomeParserRuleCall_23_0());
				}
				lv_colunaNome_23_0=ruleColunaNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"colunaNome",
						lv_colunaNome_23_0,
						"org.xtext.tcc.mydsl.MyDsl.ColunaNome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_24=','
		{
			newLeafNode(otherlv_24, grammarAccess.getAtributoAccess().getCommaKeyword_24());
		}
		otherlv_25='"inverseJoinColumns-nome"'
		{
			newLeafNode(otherlv_25, grammarAccess.getAtributoAccess().getInverseJoinColumnsNomeKeyword_25());
		}
		otherlv_26=':'
		{
			newLeafNode(otherlv_26, grammarAccess.getAtributoAccess().getColonKeyword_26());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeInverseColunaNomeParserRuleCall_27_0());
				}
				lv_colunaNomeInverse_27_0=ruleColunaNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"colunaNomeInverse",
						lv_colunaNomeInverse_27_0,
						"org.xtext.tcc.mydsl.MyDsl.ColunaNome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_28='}'
		{
			newLeafNode(otherlv_28, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_28());
		}
	)
;

// Entry rule entryRuleColunaNome
entryRuleColunaNome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColunaNomeRule()); }
	iv_ruleColunaNome=ruleColunaNome
	{ $current=$iv_ruleColunaNome.current; }
	EOF;

// Rule ColunaNome
ruleColunaNome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_colunaNome_0_0=RULE_ID
				{
					newLeafNode(lv_colunaNome_0_0, grammarAccess.getColunaNomeAccess().getColunaNomeIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColunaNomeRule());
					}
					setWithLastConsumed(
						$current,
						"colunaNome",
						lv_colunaNome_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			(
				lv_colunaNome_1_0=RULE_ANY_OTHER
				{
					newLeafNode(lv_colunaNome_1_0, grammarAccess.getColunaNomeAccess().getColunaNomeANY_OTHERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColunaNomeRule());
					}
					setWithLastConsumed(
						$current,
						"colunaNome",
						lv_colunaNome_1_0,
						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
				}
			)
		)
	)
;

// Entry rule entryRuleTabelaNome
entryRuleTabelaNome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTabelaNomeRule()); }
	iv_ruleTabelaNome=ruleTabelaNome
	{ $current=$iv_ruleTabelaNome.current; }
	EOF;

// Rule TabelaNome
ruleTabelaNome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_tabelaNome_0_0=RULE_ID
				{
					newLeafNode(lv_tabelaNome_0_0, grammarAccess.getTabelaNomeAccess().getTabelaNomeIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTabelaNomeRule());
					}
					setWithLastConsumed(
						$current,
						"tabelaNome",
						lv_tabelaNome_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		    |
		(
			(
				lv_tabelaNome_1_0=RULE_ANY_OTHER
				{
					newLeafNode(lv_tabelaNome_1_0, grammarAccess.getTabelaNomeAccess().getTabelaNomeANY_OTHERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTabelaNomeRule());
					}
					setWithLastConsumed(
						$current,
						"tabelaNome",
						lv_tabelaNome_1_0,
						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
				}
			)
		)
	)
;

// Entry rule entryRuleOperacao
entryRuleOperacao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperacaoRule()); }
	iv_ruleOperacao=ruleOperacao
	{ $current=$iv_ruleOperacao.current; }
	EOF;

// Rule Operacao
ruleOperacao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_opCascada_0_0='ALL'
				{
					newLeafNode(lv_opCascada_0_0, grammarAccess.getOperacaoAccess().getOpCascadaALLKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed($current, "opCascada", lv_opCascada_0_0, "ALL");
				}
			)
		)
		    |
		(
			(
				lv_opCascada_1_0='DETACH'
				{
					newLeafNode(lv_opCascada_1_0, grammarAccess.getOperacaoAccess().getOpCascadaDETACHKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed($current, "opCascada", lv_opCascada_1_0, "DETACH");
				}
			)
		)
		    |
		(
			(
				lv_opCascada_2_0='MERGE'
				{
					newLeafNode(lv_opCascada_2_0, grammarAccess.getOperacaoAccess().getOpCascadaMERGEKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed($current, "opCascada", lv_opCascada_2_0, "MERGE");
				}
			)
		)
		    |
		(
			(
				lv_opCascada_3_0='PERSIST'
				{
					newLeafNode(lv_opCascada_3_0, grammarAccess.getOperacaoAccess().getOpCascadaPERSISTKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed($current, "opCascada", lv_opCascada_3_0, "PERSIST");
				}
			)
		)
		    |
		(
			(
				lv_opCascada_4_0='REFRESH'
				{
					newLeafNode(lv_opCascada_4_0, grammarAccess.getOperacaoAccess().getOpCascadaREFRESHKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed($current, "opCascada", lv_opCascada_4_0, "REFRESH");
				}
			)
		)
		    |
		(
			(
				lv_opCascada_5_0='REMOVE'
				{
					newLeafNode(lv_opCascada_5_0, grammarAccess.getOperacaoAccess().getOpCascadaREMOVEKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed($current, "opCascada", lv_opCascada_5_0, "REMOVE");
				}
			)
		)
		    |
		(
			(
				lv_opCascada_6_0=RULE_ANY_OTHER
				{
					newLeafNode(lv_opCascada_6_0, grammarAccess.getOperacaoAccess().getOpCascadaANY_OTHERTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperacaoRule());
					}
					setWithLastConsumed(
						$current,
						"opCascada",
						lv_opCascada_6_0,
						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
				}
			)
		)
	)
;

// Entry rule entryRuleAssociacao
entryRuleAssociacao returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociacaoRule()); }
	iv_ruleAssociacao=ruleAssociacao
	{ $current=$iv_ruleAssociacao.current; }
	EOF;

// Rule Associacao
ruleAssociacao returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_associacao_0_0='OneToOne'
				{
					newLeafNode(lv_associacao_0_0, grammarAccess.getAssociacaoAccess().getAssociacaoOneToOneKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociacaoRule());
					}
					setWithLastConsumed($current, "associacao", lv_associacao_0_0, "OneToOne");
				}
			)
		)
		    |
		(
			(
				lv_associacao_1_0='OneToMany'
				{
					newLeafNode(lv_associacao_1_0, grammarAccess.getAssociacaoAccess().getAssociacaoOneToManyKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociacaoRule());
					}
					setWithLastConsumed($current, "associacao", lv_associacao_1_0, "OneToMany");
				}
			)
		)
		    |
		(
			(
				lv_associacao_2_0='ManyToOne'
				{
					newLeafNode(lv_associacao_2_0, grammarAccess.getAssociacaoAccess().getAssociacaoManyToOneKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociacaoRule());
					}
					setWithLastConsumed($current, "associacao", lv_associacao_2_0, "ManyToOne");
				}
			)
		)
		    |
		(
			(
				lv_associacao_3_0='ManyToMany'
				{
					newLeafNode(lv_associacao_3_0, grammarAccess.getAssociacaoAccess().getAssociacaoManyToManyKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociacaoRule());
					}
					setWithLastConsumed($current, "associacao", lv_associacao_3_0, "ManyToMany");
				}
			)
		)
		    |
		(
			(
				lv_associacao_4_0=RULE_ANY_OTHER
				{
					newLeafNode(lv_associacao_4_0, grammarAccess.getAssociacaoAccess().getAssociacaoANY_OTHERTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssociacaoRule());
					}
					setWithLastConsumed(
						$current,
						"associacao",
						lv_associacao_4_0,
						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
				}
			)
		)
	)
;

// Entry rule entryRuleAtributoNome
entryRuleAtributoNome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtributoNomeRule()); }
	iv_ruleAtributoNome=ruleAtributoNome
	{ $current=$iv_ruleAtributoNome.current; }
	EOF;

// Rule AtributoNome
ruleAtributoNome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_id_0_0=RULE_ID
			{
				newLeafNode(lv_id_0_0, grammarAccess.getAtributoNomeAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAtributoNomeRule());
				}
				setWithLastConsumed(
					$current,
					"id",
					lv_id_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleAtributoTipo
entryRuleAtributoTipo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtributoTipoRule()); }
	iv_ruleAtributoTipo=ruleAtributoTipo
	{ $current=$iv_ruleAtributoTipo.current; }
	EOF;

// Rule AtributoTipo
ruleAtributoTipo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_tipoP_0_0='Boolean'
				{
					newLeafNode(lv_tipoP_0_0, grammarAccess.getAtributoTipoAccess().getTipoPBooleanKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_0_0, "Boolean");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_1_0='Byte'
				{
					newLeafNode(lv_tipoP_1_0, grammarAccess.getAtributoTipoAccess().getTipoPByteKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_1_0, "Byte");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_2_0='Short'
				{
					newLeafNode(lv_tipoP_2_0, grammarAccess.getAtributoTipoAccess().getTipoPShortKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_2_0, "Short");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_3_0='Character'
				{
					newLeafNode(lv_tipoP_3_0, grammarAccess.getAtributoTipoAccess().getTipoPCharacterKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_3_0, "Character");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_4_0='Integer'
				{
					newLeafNode(lv_tipoP_4_0, grammarAccess.getAtributoTipoAccess().getTipoPIntegerKeyword_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_4_0, "Integer");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_5_0='Long'
				{
					newLeafNode(lv_tipoP_5_0, grammarAccess.getAtributoTipoAccess().getTipoPLongKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_5_0, "Long");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_6_0='Float'
				{
					newLeafNode(lv_tipoP_6_0, grammarAccess.getAtributoTipoAccess().getTipoPFloatKeyword_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_6_0, "Float");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_7_0='Double'
				{
					newLeafNode(lv_tipoP_7_0, grammarAccess.getAtributoTipoAccess().getTipoPDoubleKeyword_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_7_0, "Double");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_8_0='Time'
				{
					newLeafNode(lv_tipoP_8_0, grammarAccess.getAtributoTipoAccess().getTipoPTimeKeyword_8_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_8_0, "Time");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_9_0='Timestamp'
				{
					newLeafNode(lv_tipoP_9_0, grammarAccess.getAtributoTipoAccess().getTipoPTimestampKeyword_9_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_9_0, "Timestamp");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_10_0='Date'
				{
					newLeafNode(lv_tipoP_10_0, grammarAccess.getAtributoTipoAccess().getTipoPDateKeyword_10_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_10_0, "Date");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_11_0='ENUM'
				{
					newLeafNode(lv_tipoP_11_0, grammarAccess.getAtributoTipoAccess().getTipoPENUMKeyword_11_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_11_0, "ENUM");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_12_0='ArrayList'
				{
					newLeafNode(lv_tipoP_12_0, grammarAccess.getAtributoTipoAccess().getTipoPArrayListKeyword_12_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_12_0, "ArrayList");
				}
			)
		)
		    |
		(
			(
				lv_tipoP_13_0='HashSet'
				{
					newLeafNode(lv_tipoP_13_0, grammarAccess.getAtributoTipoAccess().getTipoPHashSetKeyword_13_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed($current, "tipoP", lv_tipoP_13_0, "HashSet");
				}
			)
		)
		    |
		(
			(
				lv_tipoE_14_0=RULE_ID
				{
					newLeafNode(lv_tipoE_14_0, grammarAccess.getAtributoTipoAccess().getTipoEIDTerminalRuleCall_14_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed(
						$current,
						"tipoE",
						lv_tipoE_14_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleChavePrimaria
entryRuleChavePrimaria returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChavePrimariaRule()); }
	iv_ruleChavePrimaria=ruleChavePrimaria
	{ $current=$iv_ruleChavePrimaria.current; }
	EOF;

// Rule ChavePrimaria
ruleChavePrimaria returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_id_0_0=RULE_ID
			{
				newLeafNode(lv_id_0_0, grammarAccess.getChavePrimariaAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getChavePrimariaRule());
				}
				setWithLastConsumed(
					$current,
					"id",
					lv_id_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
