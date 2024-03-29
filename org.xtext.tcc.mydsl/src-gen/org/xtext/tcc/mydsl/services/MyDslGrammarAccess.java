/*
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.tcc.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Model");
		private final Assignment cGreetingsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cGreetingsGreetingParserRuleCall_0 = (RuleCall)cGreetingsAssignment.eContents().get(0);
		
		//Model:
		//	greetings+=Greeting;
		@Override public ParserRule getRule() { return rule; }
		
		//greetings+=Greeting
		public Assignment getGreetingsAssignment() { return cGreetingsAssignment; }
		
		//Greeting
		public RuleCall getGreetingsGreetingParserRuleCall_0() { return cGreetingsGreetingParserRuleCall_0; }
	}
	public class GreetingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Greeting");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cApiAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cApiApiParserRuleCall_1_0 = (RuleCall)cApiAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Greeting:
		//	'{' api=Api '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' api=Api '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//api=Api
		public Assignment getApiAssignment_1() { return cApiAssignment_1; }
		
		//Api
		public RuleCall getApiApiParserRuleCall_1_0() { return cApiApiParserRuleCall_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}
	public class ApiElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Api");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNomeDaApiKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNomeApiAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNomeApiApiNomeParserRuleCall_2_0 = (RuleCall)cNomeApiAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cEntidadesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cEntidadesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cEntidadesEntidadesParserRuleCall_7_0 = (RuleCall)cEntidadesAssignment_7.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Api:
		//	'"Nome da Api"' ':' nomeApi=ApiNome ','
		//	'"Entidades"' ':' '[' entidades=Entidades ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'"Nome da Api"' ':' nomeApi=ApiNome ',' '"Entidades"' ':' '[' entidades=Entidades ']'
		public Group getGroup() { return cGroup; }
		
		//'"Nome da Api"'
		public Keyword getNomeDaApiKeyword_0() { return cNomeDaApiKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//nomeApi=ApiNome
		public Assignment getNomeApiAssignment_2() { return cNomeApiAssignment_2; }
		
		//ApiNome
		public RuleCall getNomeApiApiNomeParserRuleCall_2_0() { return cNomeApiApiNomeParserRuleCall_2_0; }
		
		//','
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//'"Entidades"'
		public Keyword getEntidadesKeyword_4() { return cEntidadesKeyword_4; }
		
		//':'
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_6() { return cLeftSquareBracketKeyword_6; }
		
		//entidades=Entidades
		public Assignment getEntidadesAssignment_7() { return cEntidadesAssignment_7; }
		
		//Entidades
		public RuleCall getEntidadesEntidadesParserRuleCall_7_0() { return cEntidadesEntidadesParserRuleCall_7_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}
	public class ApiNomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.ApiNome");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNomeAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNomeSTRING_LIST_LOWTerminalRuleCall_0_0 = (RuleCall)cNomeAssignment_0.eContents().get(0);
		private final Assignment cNomeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cNomeSTRING_LITTerminalRuleCall_1_0 = (RuleCall)cNomeAssignment_1.eContents().get(0);
		
		//ApiNome:
		//	nome=STRING_LIST_LOW | nome=STRING_LIT;
		@Override public ParserRule getRule() { return rule; }
		
		//nome=STRING_LIST_LOW | nome=STRING_LIT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//nome=STRING_LIST_LOW
		public Assignment getNomeAssignment_0() { return cNomeAssignment_0; }
		
		//STRING_LIST_LOW
		public RuleCall getNomeSTRING_LIST_LOWTerminalRuleCall_0_0() { return cNomeSTRING_LIST_LOWTerminalRuleCall_0_0; }
		
		//nome=STRING_LIT
		public Assignment getNomeAssignment_1() { return cNomeAssignment_1; }
		
		//STRING_LIT
		public RuleCall getNomeSTRING_LITTerminalRuleCall_1_0() { return cNomeSTRING_LITTerminalRuleCall_1_0; }
	}
	public class EntidadesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Entidades");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEntidadeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEntidadeEntidadeParserRuleCall_0_0 = (RuleCall)cEntidadeAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEntidadeMaisAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEntidadeMaisEntidadeParserRuleCall_1_1_0 = (RuleCall)cEntidadeMaisAssignment_1_1.eContents().get(0);
		
		//Entidades:
		//	entidade=Entidade ("," entidadeMais+=Entidade)*;
		@Override public ParserRule getRule() { return rule; }
		
		//entidade=Entidade ("," entidadeMais+=Entidade)*
		public Group getGroup() { return cGroup; }
		
		//entidade=Entidade
		public Assignment getEntidadeAssignment_0() { return cEntidadeAssignment_0; }
		
		//Entidade
		public RuleCall getEntidadeEntidadeParserRuleCall_0_0() { return cEntidadeEntidadeParserRuleCall_0_0; }
		
		//("," entidadeMais+=Entidade)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//entidadeMais+=Entidade
		public Assignment getEntidadeMaisAssignment_1_1() { return cEntidadeMaisAssignment_1_1; }
		
		//Entidade
		public RuleCall getEntidadeMaisEntidadeParserRuleCall_1_1_0() { return cEntidadeMaisEntidadeParserRuleCall_1_1_0; }
	}
	public class EntidadeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Entidade");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNomeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNomeEntidadeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNomeEntidadeNomeParserRuleCall_3_0 = (RuleCall)cNomeEntidadeAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cAtributosKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cAtributosAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cAtributosAtributosParserRuleCall_8_0 = (RuleCall)cAtributosAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Entidade:
		//	'{'
		//	'"Nome"' ':' nomeEntidade=Nome ','
		//	'"Atributos"' ':' '[' atributos=Atributos ']'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' '"Nome"' ':' nomeEntidade=Nome ',' '"Atributos"' ':' '[' atributos=Atributos ']' '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//'"Nome"'
		public Keyword getNomeKeyword_1() { return cNomeKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//nomeEntidade=Nome
		public Assignment getNomeEntidadeAssignment_3() { return cNomeEntidadeAssignment_3; }
		
		//Nome
		public RuleCall getNomeEntidadeNomeParserRuleCall_3_0() { return cNomeEntidadeNomeParserRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//'"Atributos"'
		public Keyword getAtributosKeyword_5() { return cAtributosKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_7() { return cLeftSquareBracketKeyword_7; }
		
		//atributos=Atributos
		public Assignment getAtributosAssignment_8() { return cAtributosAssignment_8; }
		
		//Atributos
		public RuleCall getAtributosAtributosParserRuleCall_8_0() { return cAtributosAtributosParserRuleCall_8_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class NomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Nome");
		private final Assignment cNomeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNomeSTRING_LITTerminalRuleCall_0 = (RuleCall)cNomeAssignment.eContents().get(0);
		
		//Nome:
		//	nome=STRING_LIT;
		@Override public ParserRule getRule() { return rule; }
		
		//nome=STRING_LIT
		public Assignment getNomeAssignment() { return cNomeAssignment; }
		
		//STRING_LIT
		public RuleCall getNomeSTRING_LITTerminalRuleCall_0() { return cNomeSTRING_LITTerminalRuleCall_0; }
	}
	public class Nome_AtributoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Nome_Atributo");
		private final Assignment cNomeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNomeSTRING_LIST_LOWTerminalRuleCall_0 = (RuleCall)cNomeAssignment.eContents().get(0);
		
		//Nome_Atributo:
		//	nome=STRING_LIST_LOW;
		@Override public ParserRule getRule() { return rule; }
		
		//nome=STRING_LIST_LOW
		public Assignment getNomeAssignment() { return cNomeAssignment; }
		
		//STRING_LIST_LOW
		public RuleCall getNomeSTRING_LIST_LOWTerminalRuleCall_0() { return cNomeSTRING_LIST_LOWTerminalRuleCall_0; }
	}
	public class AtributosElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Atributos");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAtributoAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAtributoAtributoParserRuleCall_0_0 = (RuleCall)cAtributoAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAtributoMaisAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAtributoMaisAtributoParserRuleCall_1_1_0 = (RuleCall)cAtributoMaisAssignment_1_1.eContents().get(0);
		
		//Atributos:
		//	atributo=Atributo ("," atributoMais+=Atributo)*;
		@Override public ParserRule getRule() { return rule; }
		
		//atributo=Atributo ("," atributoMais+=Atributo)*
		public Group getGroup() { return cGroup; }
		
		//atributo=Atributo
		public Assignment getAtributoAssignment_0() { return cAtributoAssignment_0; }
		
		//Atributo
		public RuleCall getAtributoAtributoParserRuleCall_0_0() { return cAtributoAtributoParserRuleCall_0_0; }
		
		//("," atributoMais+=Atributo)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//atributoMais+=Atributo
		public Assignment getAtributoMaisAssignment_1_1() { return cAtributoMaisAssignment_1_1; }
		
		//Atributo
		public RuleCall getAtributoMaisAtributoParserRuleCall_1_1_0() { return cAtributoMaisAtributoParserRuleCall_1_1_0; }
	}
	public class AtributoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Atributo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNomeAtributoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNomeAtributoAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNomeAtributoNome_AtributoParserRuleCall_3_0 = (RuleCall)cNomeAtributoAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cTipoAtributoKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cAtributoTipoAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAtributoTipoAtributoTipoParserRuleCall_7_0 = (RuleCall)cAtributoTipoAssignment_7.eContents().get(0);
		private final Keyword cCommaKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cAssociaORelacionamentoKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cColonKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Assignment cAssociacaoAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cAssociacaoAssociacaoParserRuleCall_11_0 = (RuleCall)cAssociacaoAssignment_11.eContents().get(0);
		private final Keyword cCommaKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Keyword cOperaOEmCascataKeyword_13 = (Keyword)cGroup.eContents().get(13);
		private final Keyword cColonKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cLeftSquareBracketKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Assignment cOperacaoAssignment_16 = (Assignment)cGroup.eContents().get(16);
		private final RuleCall cOperacaoOperacaoParserRuleCall_16_0 = (RuleCall)cOperacaoAssignment_16.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_17 = (Keyword)cGroup.eContents().get(17);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//Atributo:
		//	'{'
		//	'"nome-atributo"' ':' nomeAtributo=Nome_Atributo ','
		//	'"tipo-atributo"' ':' atributoTipo=AtributoTipo ','
		//	'"associação/relacionamento"' ':' associacao=Associacao ','
		//	'"operação em cascata"' ':' '[' operacao=Operacao? ']'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' '"nome-atributo"' ':' nomeAtributo=Nome_Atributo ',' '"tipo-atributo"' ':' atributoTipo=AtributoTipo ','
		//'"associação/relacionamento"' ':' associacao=Associacao ',' '"operação em cascata"' ':' '[' operacao=Operacao? ']' '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//'"nome-atributo"'
		public Keyword getNomeAtributoKeyword_1() { return cNomeAtributoKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//nomeAtributo=Nome_Atributo
		public Assignment getNomeAtributoAssignment_3() { return cNomeAtributoAssignment_3; }
		
		//Nome_Atributo
		public RuleCall getNomeAtributoNome_AtributoParserRuleCall_3_0() { return cNomeAtributoNome_AtributoParserRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//'"tipo-atributo"'
		public Keyword getTipoAtributoKeyword_5() { return cTipoAtributoKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//atributoTipo=AtributoTipo
		public Assignment getAtributoTipoAssignment_7() { return cAtributoTipoAssignment_7; }
		
		//AtributoTipo
		public RuleCall getAtributoTipoAtributoTipoParserRuleCall_7_0() { return cAtributoTipoAtributoTipoParserRuleCall_7_0; }
		
		//','
		public Keyword getCommaKeyword_8() { return cCommaKeyword_8; }
		
		//'"associação/relacionamento"'
		public Keyword getAssociaORelacionamentoKeyword_9() { return cAssociaORelacionamentoKeyword_9; }
		
		//':'
		public Keyword getColonKeyword_10() { return cColonKeyword_10; }
		
		//associacao=Associacao
		public Assignment getAssociacaoAssignment_11() { return cAssociacaoAssignment_11; }
		
		//Associacao
		public RuleCall getAssociacaoAssociacaoParserRuleCall_11_0() { return cAssociacaoAssociacaoParserRuleCall_11_0; }
		
		//','
		public Keyword getCommaKeyword_12() { return cCommaKeyword_12; }
		
		//'"operação em cascata"'
		public Keyword getOperaOEmCascataKeyword_13() { return cOperaOEmCascataKeyword_13; }
		
		//':'
		public Keyword getColonKeyword_14() { return cColonKeyword_14; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_15() { return cLeftSquareBracketKeyword_15; }
		
		//operacao=Operacao?
		public Assignment getOperacaoAssignment_16() { return cOperacaoAssignment_16; }
		
		//Operacao
		public RuleCall getOperacaoOperacaoParserRuleCall_16_0() { return cOperacaoOperacaoParserRuleCall_16_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_17() { return cRightSquareBracketKeyword_17; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
	}
	public class OperacaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Operacao");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpCascadaAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpCascadaOperacaoCascadaParserRuleCall_0_0 = (RuleCall)cOpCascadaAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cOpCascadaMaisAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOpCascadaMaisOperacaoCascadaParserRuleCall_1_1_0 = (RuleCall)cOpCascadaMaisAssignment_1_1.eContents().get(0);
		
		//Operacao:
		//	opCascada=OperacaoCascada ("," opCascadaMais+=OperacaoCascada)*;
		@Override public ParserRule getRule() { return rule; }
		
		//opCascada=OperacaoCascada ("," opCascadaMais+=OperacaoCascada)*
		public Group getGroup() { return cGroup; }
		
		//opCascada=OperacaoCascada
		public Assignment getOpCascadaAssignment_0() { return cOpCascadaAssignment_0; }
		
		//OperacaoCascada
		public RuleCall getOpCascadaOperacaoCascadaParserRuleCall_0_0() { return cOpCascadaOperacaoCascadaParserRuleCall_0_0; }
		
		//("," opCascadaMais+=OperacaoCascada)*
		public Group getGroup_1() { return cGroup_1; }
		
		//","
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//opCascadaMais+=OperacaoCascada
		public Assignment getOpCascadaMaisAssignment_1_1() { return cOpCascadaMaisAssignment_1_1; }
		
		//OperacaoCascada
		public RuleCall getOpCascadaMaisOperacaoCascadaParserRuleCall_1_1_0() { return cOpCascadaMaisOperacaoCascadaParserRuleCall_1_1_0; }
	}
	public class OperacaoCascadaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.OperacaoCascada");
		private final Assignment cOperacaoAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperacaoNOME_OPERACAOTerminalRuleCall_0 = (RuleCall)cOperacaoAssignment.eContents().get(0);
		
		//OperacaoCascada:
		//	operacao=NOME_OPERACAO;
		@Override public ParserRule getRule() { return rule; }
		
		//operacao=NOME_OPERACAO
		public Assignment getOperacaoAssignment() { return cOperacaoAssignment; }
		
		//NOME_OPERACAO
		public RuleCall getOperacaoNOME_OPERACAOTerminalRuleCall_0() { return cOperacaoNOME_OPERACAOTerminalRuleCall_0; }
	}
	public class AssociacaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Associacao");
		private final Assignment cAssociacaoAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAssociacaoNOME_ASSOCIACAOTerminalRuleCall_0 = (RuleCall)cAssociacaoAssignment.eContents().get(0);
		
		//Associacao:
		//	associacao=NOME_ASSOCIACAO;
		@Override public ParserRule getRule() { return rule; }
		
		//associacao=NOME_ASSOCIACAO
		public Assignment getAssociacaoAssignment() { return cAssociacaoAssignment; }
		
		//NOME_ASSOCIACAO
		public RuleCall getAssociacaoNOME_ASSOCIACAOTerminalRuleCall_0() { return cAssociacaoNOME_ASSOCIACAOTerminalRuleCall_0; }
	}
	public class AtributoTipoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.AtributoTipo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTipoPrimitivoAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTipoPrimitivoTIPO_PRIMITIVOTerminalRuleCall_0_0 = (RuleCall)cTipoPrimitivoAssignment_0.eContents().get(0);
		private final Assignment cTipoColecaoAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTipoColecaoTIPO_COLECAOTerminalRuleCall_1_0 = (RuleCall)cTipoColecaoAssignment_1.eContents().get(0);
		private final Assignment cTipoObjetoAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cTipoObjetoSTRING_LITTerminalRuleCall_2_0 = (RuleCall)cTipoObjetoAssignment_2.eContents().get(0);
		
		//AtributoTipo:
		//	tipoPrimitivo=TIPO_PRIMITIVO | tipoColecao=TIPO_COLECAO | tipoObjeto=STRING_LIT;
		@Override public ParserRule getRule() { return rule; }
		
		//tipoPrimitivo=TIPO_PRIMITIVO | tipoColecao=TIPO_COLECAO | tipoObjeto=STRING_LIT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//tipoPrimitivo=TIPO_PRIMITIVO
		public Assignment getTipoPrimitivoAssignment_0() { return cTipoPrimitivoAssignment_0; }
		
		//TIPO_PRIMITIVO
		public RuleCall getTipoPrimitivoTIPO_PRIMITIVOTerminalRuleCall_0_0() { return cTipoPrimitivoTIPO_PRIMITIVOTerminalRuleCall_0_0; }
		
		//tipoColecao=TIPO_COLECAO
		public Assignment getTipoColecaoAssignment_1() { return cTipoColecaoAssignment_1; }
		
		//TIPO_COLECAO
		public RuleCall getTipoColecaoTIPO_COLECAOTerminalRuleCall_1_0() { return cTipoColecaoTIPO_COLECAOTerminalRuleCall_1_0; }
		
		//tipoObjeto=STRING_LIT
		public Assignment getTipoObjetoAssignment_2() { return cTipoObjetoAssignment_2; }
		
		//STRING_LIT
		public RuleCall getTipoObjetoSTRING_LITTerminalRuleCall_2_0() { return cTipoObjetoSTRING_LITTerminalRuleCall_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tNOME_ASSOCIACAO;
	private final TerminalRule tNOME_OPERACAO;
	private final TerminalRule tTIPO_PRIMITIVO;
	private final TerminalRule tTIPO_COLECAO;
	private final TerminalRule tSTRING_LIST_LOW;
	private final TerminalRule tLETRA_I;
	private final TerminalRule tSTRING_LIT;
	private final TerminalRule tSTRING_I;
	private final GreetingElements pGreeting;
	private final ApiElements pApi;
	private final ApiNomeElements pApiNome;
	private final EntidadesElements pEntidades;
	private final EntidadeElements pEntidade;
	private final NomeElements pNome;
	private final Nome_AtributoElements pNome_Atributo;
	private final AtributosElements pAtributos;
	private final AtributoElements pAtributo;
	private final OperacaoElements pOperacao;
	private final OperacaoCascadaElements pOperacaoCascada;
	private final AssociacaoElements pAssociacao;
	private final AtributoTipoElements pAtributoTipo;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.tNOME_ASSOCIACAO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.NOME_ASSOCIACAO");
		this.tNOME_OPERACAO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.NOME_OPERACAO");
		this.tTIPO_PRIMITIVO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.TIPO_PRIMITIVO");
		this.tTIPO_COLECAO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.TIPO_COLECAO");
		this.tSTRING_LIST_LOW = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.STRING_LIST_LOW");
		this.tLETRA_I = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.LETRA_I");
		this.tSTRING_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
		this.tSTRING_I = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.STRING_I");
		this.pGreeting = new GreetingElements();
		this.pApi = new ApiElements();
		this.pApiNome = new ApiNomeElements();
		this.pEntidades = new EntidadesElements();
		this.pEntidade = new EntidadeElements();
		this.pNome = new NomeElements();
		this.pNome_Atributo = new Nome_AtributoElements();
		this.pAtributos = new AtributosElements();
		this.pAtributo = new AtributoElements();
		this.pOperacao = new OperacaoElements();
		this.pOperacaoCascada = new OperacaoCascadaElements();
		this.pAssociacao = new AssociacaoElements();
		this.pAtributoTipo = new AtributoTipoElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.tcc.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	greetings+=Greeting;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//terminal NOME_ASSOCIACAO:
	//	'"' ("OneToOne" | "OneToMany" | "ManyToOne"
	//	| "ManyToMany")? '"';
	public TerminalRule getNOME_ASSOCIACAORule() {
		return tNOME_ASSOCIACAO;
	}
	
	//terminal NOME_OPERACAO:
	//	'"' ("ALL" | "DETACH" | "MERGE" | "PERSIST"
	//	| "REFRESH" | "REMOVE") '"';
	public TerminalRule getNOME_OPERACAORule() {
		return tNOME_OPERACAO;
	}
	
	//terminal TIPO_PRIMITIVO:
	//	'"' ("Boolean" | "Integer" | "Long" | "String" | "Float" | "Double" |
	//	"Time" | "Timestamp" | "Date") '"';
	public TerminalRule getTIPO_PRIMITIVORule() {
		return tTIPO_PRIMITIVO;
	}
	
	//terminal TIPO_COLECAO:
	//	'"' ("List<" STRING_I ">" | "Set<" STRING_I ">" | "ArrayList<" STRING_I ">"
	//	| "HashSet<" STRING_I ">") '"';
	public TerminalRule getTIPO_COLECAORule() {
		return tTIPO_COLECAO;
	}
	
	//terminal STRING_LIST_LOW:
	//	'"' LETRA_I+ '"';
	public TerminalRule getSTRING_LIST_LOWRule() {
		return tSTRING_LIST_LOW;
	}
	
	//terminal LETRA_I:
	//	"a".."z" ("a".."z" | "A".."Z")+;
	public TerminalRule getLETRA_IRule() {
		return tLETRA_I;
	}
	
	//terminal STRING_LIT:
	//	'"' STRING_I '"';
	public TerminalRule getSTRING_LITRule() {
		return tSTRING_LIT;
	}
	
	//terminal STRING_I:
	//	"A".."Z" ("a".."z" | "A".."Z")+;
	public TerminalRule getSTRING_IRule() {
		return tSTRING_I;
	}
	
	//Greeting:
	//	'{' api=Api '}';
	public GreetingElements getGreetingAccess() {
		return pGreeting;
	}
	
	public ParserRule getGreetingRule() {
		return getGreetingAccess().getRule();
	}
	
	//Api:
	//	'"Nome da Api"' ':' nomeApi=ApiNome ','
	//	'"Entidades"' ':' '[' entidades=Entidades ']';
	public ApiElements getApiAccess() {
		return pApi;
	}
	
	public ParserRule getApiRule() {
		return getApiAccess().getRule();
	}
	
	//ApiNome:
	//	nome=STRING_LIST_LOW | nome=STRING_LIT;
	public ApiNomeElements getApiNomeAccess() {
		return pApiNome;
	}
	
	public ParserRule getApiNomeRule() {
		return getApiNomeAccess().getRule();
	}
	
	//Entidades:
	//	entidade=Entidade ("," entidadeMais+=Entidade)*;
	public EntidadesElements getEntidadesAccess() {
		return pEntidades;
	}
	
	public ParserRule getEntidadesRule() {
		return getEntidadesAccess().getRule();
	}
	
	//Entidade:
	//	'{'
	//	'"Nome"' ':' nomeEntidade=Nome ','
	//	'"Atributos"' ':' '[' atributos=Atributos ']'
	//	'}';
	public EntidadeElements getEntidadeAccess() {
		return pEntidade;
	}
	
	public ParserRule getEntidadeRule() {
		return getEntidadeAccess().getRule();
	}
	
	//Nome:
	//	nome=STRING_LIT;
	public NomeElements getNomeAccess() {
		return pNome;
	}
	
	public ParserRule getNomeRule() {
		return getNomeAccess().getRule();
	}
	
	//Nome_Atributo:
	//	nome=STRING_LIST_LOW;
	public Nome_AtributoElements getNome_AtributoAccess() {
		return pNome_Atributo;
	}
	
	public ParserRule getNome_AtributoRule() {
		return getNome_AtributoAccess().getRule();
	}
	
	//Atributos:
	//	atributo=Atributo ("," atributoMais+=Atributo)*;
	public AtributosElements getAtributosAccess() {
		return pAtributos;
	}
	
	public ParserRule getAtributosRule() {
		return getAtributosAccess().getRule();
	}
	
	//Atributo:
	//	'{'
	//	'"nome-atributo"' ':' nomeAtributo=Nome_Atributo ','
	//	'"tipo-atributo"' ':' atributoTipo=AtributoTipo ','
	//	'"associação/relacionamento"' ':' associacao=Associacao ','
	//	'"operação em cascata"' ':' '[' operacao=Operacao? ']'
	//	'}';
	public AtributoElements getAtributoAccess() {
		return pAtributo;
	}
	
	public ParserRule getAtributoRule() {
		return getAtributoAccess().getRule();
	}
	
	//Operacao:
	//	opCascada=OperacaoCascada ("," opCascadaMais+=OperacaoCascada)*;
	public OperacaoElements getOperacaoAccess() {
		return pOperacao;
	}
	
	public ParserRule getOperacaoRule() {
		return getOperacaoAccess().getRule();
	}
	
	//OperacaoCascada:
	//	operacao=NOME_OPERACAO;
	public OperacaoCascadaElements getOperacaoCascadaAccess() {
		return pOperacaoCascada;
	}
	
	public ParserRule getOperacaoCascadaRule() {
		return getOperacaoCascadaAccess().getRule();
	}
	
	//Associacao:
	//	associacao=NOME_ASSOCIACAO;
	public AssociacaoElements getAssociacaoAccess() {
		return pAssociacao;
	}
	
	public ParserRule getAssociacaoRule() {
		return getAssociacaoAccess().getRule();
	}
	
	//AtributoTipo:
	//	tipoPrimitivo=TIPO_PRIMITIVO | tipoColecao=TIPO_COLECAO | tipoObjeto=STRING_LIT;
	public AtributoTipoElements getAtributoTipoAccess() {
		return pAtributoTipo;
	}
	
	public ParserRule getAtributoTipoRule() {
		return getAtributoTipoAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
