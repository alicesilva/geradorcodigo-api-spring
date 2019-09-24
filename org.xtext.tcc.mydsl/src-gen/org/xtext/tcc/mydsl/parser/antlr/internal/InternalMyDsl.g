/*
 * generated by Xtext 2.18.0.M3
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
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

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

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
	)
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
			lv_nome_0_0=RULE_STRING_LIT
			{
				newLeafNode(lv_nome_0_0, grammarAccess.getApiNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getApiNomeRule());
				}
				setWithLastConsumed(
					$current,
					"nome",
					lv_nome_0_0,
					"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
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
					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadeNomeParserRuleCall_3_0());
				}
				lv_nomeEntidade_3_0=ruleNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadeRule());
					}
					set(
						$current,
						"nomeEntidade",
						lv_nomeEntidade_3_0,
						"org.xtext.tcc.mydsl.MyDsl.Nome");
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
					newCompositeNode(grammarAccess.getEntidadeAccess().getChavePrimariaNomeParserRuleCall_13_0());
				}
				lv_chavePrimaria_13_0=ruleNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadeRule());
					}
					set(
						$current,
						"chavePrimaria",
						lv_chavePrimaria_13_0,
						"org.xtext.tcc.mydsl.MyDsl.Nome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=','
		{
			newLeafNode(otherlv_14, grammarAccess.getEntidadeAccess().getCommaKeyword_14());
		}
		otherlv_15='"Nome do pacote"'
		{
			newLeafNode(otherlv_15, grammarAccess.getEntidadeAccess().getNomeDoPacoteKeyword_15());
		}
		otherlv_16=':'
		{
			newLeafNode(otherlv_16, grammarAccess.getEntidadeAccess().getColonKeyword_16());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntidadeAccess().getPackageNomeParserRuleCall_17_0());
				}
				lv_package_17_0=ruleNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntidadeRule());
					}
					set(
						$current,
						"package",
						lv_package_17_0,
						"org.xtext.tcc.mydsl.MyDsl.Nome");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_18());
		}
	)
;

// Entry rule entryRuleNome
entryRuleNome returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNomeRule()); }
	iv_ruleNome=ruleNome
	{ $current=$iv_ruleNome.current; }
	EOF;

// Rule Nome
ruleNome returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_nome_0_0=RULE_STRING_LIT
			{
				newLeafNode(lv_nome_0_0, grammarAccess.getNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNomeRule());
				}
				setWithLastConsumed(
					$current,
					"nome",
					lv_nome_0_0,
					"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
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
					newCompositeNode(grammarAccess.getAtributoAccess().getNomeAtributoNomeParserRuleCall_3_0());
				}
				lv_nomeAtributo_3_0=ruleNome
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtributoRule());
					}
					set(
						$current,
						"nomeAtributo",
						lv_nomeAtributo_3_0,
						"org.xtext.tcc.mydsl.MyDsl.Nome");
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
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_16());
		}
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
			lv_opCascada_0_0=RULE_NOME_OPERACAO
			{
				newLeafNode(lv_opCascada_0_0, grammarAccess.getOperacaoAccess().getOpCascadaNOME_OPERACAOTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getOperacaoRule());
				}
				setWithLastConsumed(
					$current,
					"opCascada",
					lv_opCascada_0_0,
					"org.xtext.tcc.mydsl.MyDsl.NOME_OPERACAO");
			}
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
			lv_associacao_0_0=RULE_NOME_ASSOCIACAO
			{
				newLeafNode(lv_associacao_0_0, grammarAccess.getAssociacaoAccess().getAssociacaoNOME_ASSOCIACAOTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAssociacaoRule());
				}
				setWithLastConsumed(
					$current,
					"associacao",
					lv_associacao_0_0,
					"org.xtext.tcc.mydsl.MyDsl.NOME_ASSOCIACAO");
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
				lv_tipoP_0_0=RULE_TIPO_DEFINIDO
				{
					newLeafNode(lv_tipoP_0_0, grammarAccess.getAtributoTipoAccess().getTipoPTIPO_DEFINIDOTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed(
						$current,
						"tipoP",
						lv_tipoP_0_0,
						"org.xtext.tcc.mydsl.MyDsl.TIPO_DEFINIDO");
				}
			)
		)
		    |
		(
			(
				lv_tipoE_1_0=RULE_STRING_LIT
				{
					newLeafNode(lv_tipoE_1_0, grammarAccess.getAtributoTipoAccess().getTipoESTRING_LITTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoTipoRule());
					}
					setWithLastConsumed(
						$current,
						"tipoE",
						lv_tipoE_1_0,
						"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
				}
			)
		)
	)
;

RULE_VAZIO : '""';

RULE_NOME_ASSOCIACAO : '"' ('OneToOne'|'OneToMany'|'ManyToOne'|'ManyToMany'|'None-Associacao') '"';

RULE_NOME_OPERACAO : '"' ('ALL'|'DETACH'|'MERGE'|'PERSIST'|'REFRESH'|'REMOVE'|'None-Operacao') '"';

RULE_TIPO_DEFINIDO : '"' ('Boolean'|'Integer'|'Long'|'String'|'Float'|'Double'|'Time'|'Timestamp'|'Date'|'ENUM'|'ArrayList'|'HashSet') '"';

RULE_STRING_LIT : '"' RULE_LETRA+ '"';

fragment RULE_LETRA : ('a'..'z'|'A'..'Z');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
