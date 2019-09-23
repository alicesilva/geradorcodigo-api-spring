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
		private final RuleCall cEntidadesEntidadeParserRuleCall_7_0 = (RuleCall)cEntidadesAssignment_7.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Api:
		//	'"Nome da Api"' ':' nomeApi=ApiNome ','
		//	'"Entidades"' ':' '[' entidades+=Entidade+ ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'"Nome da Api"' ':' nomeApi=ApiNome ',' '"Entidades"' ':' '[' entidades+=Entidade+ ']'
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
		
		//entidades+=Entidade+
		public Assignment getEntidadesAssignment_7() { return cEntidadesAssignment_7; }
		
		//Entidade
		public RuleCall getEntidadesEntidadeParserRuleCall_7_0() { return cEntidadesEntidadeParserRuleCall_7_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_8() { return cRightSquareBracketKeyword_8; }
	}
	public class ApiNomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.ApiNome");
		private final Assignment cIdAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_0 = (RuleCall)cIdAssignment.eContents().get(0);
		
		//ApiNome:
		//	id=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//id=ID
		public Assignment getIdAssignment() { return cIdAssignment; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_0() { return cIdIDTerminalRuleCall_0; }
	}
	public class EntidadeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Entidade");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNomeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNomeEntidadesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNomeEntidadesEntidadeNomeParserRuleCall_3_0 = (RuleCall)cNomeEntidadesAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cAtributosKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cLeftSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cAtributosAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cAtributosAtributoParserRuleCall_8_0 = (RuleCall)cAtributosAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Keyword cCommaKeyword_10 = (Keyword)cGroup.eContents().get(10);
		private final Keyword cChavePrimariaKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Keyword cColonKeyword_12 = (Keyword)cGroup.eContents().get(12);
		private final Assignment cChavePrimariaAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cChavePrimariaChavePrimariaParserRuleCall_13_0 = (RuleCall)cChavePrimariaAssignment_13.eContents().get(0);
		private final Keyword cCommaKeyword_14 = (Keyword)cGroup.eContents().get(14);
		private final Keyword cNomeDoPacoteKeyword_15 = (Keyword)cGroup.eContents().get(15);
		private final Keyword cColonKeyword_16 = (Keyword)cGroup.eContents().get(16);
		private final Assignment cPackageAssignment_17 = (Assignment)cGroup.eContents().get(17);
		private final RuleCall cPackagePackageNameParserRuleCall_17_0 = (RuleCall)cPackageAssignment_17.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_18 = (Keyword)cGroup.eContents().get(18);
		
		//Entidade:
		//	'{'
		//	'"Nome"' ':' nomeEntidades=EntidadeNome ','
		//	'"Atributos"' ':' '[' atributos+=Atributo+ ']' ','
		//	'"Chave Primaria"' ':' chavePrimaria=ChavePrimaria ','
		//	'"Nome do pacote"' ':' package=PackageName
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' '"Nome"' ':' nomeEntidades=EntidadeNome ',' '"Atributos"' ':' '[' atributos+=Atributo+ ']' ',' '"Chave Primaria"'
		//':' chavePrimaria=ChavePrimaria ',' '"Nome do pacote"' ':' package=PackageName '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//'"Nome"'
		public Keyword getNomeKeyword_1() { return cNomeKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//nomeEntidades=EntidadeNome
		public Assignment getNomeEntidadesAssignment_3() { return cNomeEntidadesAssignment_3; }
		
		//EntidadeNome
		public RuleCall getNomeEntidadesEntidadeNomeParserRuleCall_3_0() { return cNomeEntidadesEntidadeNomeParserRuleCall_3_0; }
		
		//','
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
		
		//'"Atributos"'
		public Keyword getAtributosKeyword_5() { return cAtributosKeyword_5; }
		
		//':'
		public Keyword getColonKeyword_6() { return cColonKeyword_6; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_7() { return cLeftSquareBracketKeyword_7; }
		
		//atributos+=Atributo+
		public Assignment getAtributosAssignment_8() { return cAtributosAssignment_8; }
		
		//Atributo
		public RuleCall getAtributosAtributoParserRuleCall_8_0() { return cAtributosAtributoParserRuleCall_8_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
		
		//','
		public Keyword getCommaKeyword_10() { return cCommaKeyword_10; }
		
		//'"Chave Primaria"'
		public Keyword getChavePrimariaKeyword_11() { return cChavePrimariaKeyword_11; }
		
		//':'
		public Keyword getColonKeyword_12() { return cColonKeyword_12; }
		
		//chavePrimaria=ChavePrimaria
		public Assignment getChavePrimariaAssignment_13() { return cChavePrimariaAssignment_13; }
		
		//ChavePrimaria
		public RuleCall getChavePrimariaChavePrimariaParserRuleCall_13_0() { return cChavePrimariaChavePrimariaParserRuleCall_13_0; }
		
		//','
		public Keyword getCommaKeyword_14() { return cCommaKeyword_14; }
		
		//'"Nome do pacote"'
		public Keyword getNomeDoPacoteKeyword_15() { return cNomeDoPacoteKeyword_15; }
		
		//':'
		public Keyword getColonKeyword_16() { return cColonKeyword_16; }
		
		//package=PackageName
		public Assignment getPackageAssignment_17() { return cPackageAssignment_17; }
		
		//PackageName
		public RuleCall getPackagePackageNameParserRuleCall_17_0() { return cPackagePackageNameParserRuleCall_17_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_18() { return cRightCurlyBracketKeyword_18; }
	}
	public class EntidadeNomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.EntidadeNome");
		private final Assignment cNomeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNomeSTRING_LITTerminalRuleCall_0 = (RuleCall)cNomeAssignment.eContents().get(0);
		
		//EntidadeNome:
		//	nome=STRING_LIT;
		@Override public ParserRule getRule() { return rule; }
		
		//nome=STRING_LIT
		public Assignment getNomeAssignment() { return cNomeAssignment; }
		
		//STRING_LIT
		public RuleCall getNomeSTRING_LITTerminalRuleCall_0() { return cNomeSTRING_LITTerminalRuleCall_0; }
	}
	public class AtributoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Atributo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cNomeAtributoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAtributoNomeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAtributoNomeAtributoNomeParserRuleCall_3_0 = (RuleCall)cAtributoNomeAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cTipoAtributoKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cAtributoTipoAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAtributoTipoAtributoTipoParserRuleCall_7_0 = (RuleCall)cAtributoTipoAssignment_7.eContents().get(0);
		private final Keyword cCommaKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Atributo:
		//	'{'
		//	'"nome-atributo"' ':' atributoNome=AtributoNome ','
		//	'"tipo-atributo"' ':' atributoTipo=AtributoTipo ','
		//	//'"associação"' ':' associacao = Associacao?','
		//	//'"operação em cascata"' ':' operacao = Operacao?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' '"nome-atributo"' ':' atributoNome=AtributoNome ',' '"tipo-atributo"' ':' atributoTipo=AtributoTipo ',' //'"associação"' ':' associacao = Associacao?','
		////'"operação em cascata"' ':' operacao = Operacao?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//'"nome-atributo"'
		public Keyword getNomeAtributoKeyword_1() { return cNomeAtributoKeyword_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//atributoNome=AtributoNome
		public Assignment getAtributoNomeAssignment_3() { return cAtributoNomeAssignment_3; }
		
		//AtributoNome
		public RuleCall getAtributoNomeAtributoNomeParserRuleCall_3_0() { return cAtributoNomeAtributoNomeParserRuleCall_3_0; }
		
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
		
		////'"associação"' ':' associacao = Associacao?','
		////'"operação em cascata"' ':' operacao = Operacao?
		//'}'
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}
	public class OperacaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Operacao");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cOpCascadaAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cOpCascadaALLKeyword_0_0 = (Keyword)cOpCascadaAssignment_0.eContents().get(0);
		private final Assignment cOpCascadaAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cOpCascadaDETACHKeyword_1_0 = (Keyword)cOpCascadaAssignment_1.eContents().get(0);
		private final Assignment cOpCascadaAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cOpCascadaMERGEKeyword_2_0 = (Keyword)cOpCascadaAssignment_2.eContents().get(0);
		private final Assignment cOpCascadaAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cOpCascadaPERSISTKeyword_3_0 = (Keyword)cOpCascadaAssignment_3.eContents().get(0);
		private final Assignment cOpCascadaAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final Keyword cOpCascadaREFRESHKeyword_4_0 = (Keyword)cOpCascadaAssignment_4.eContents().get(0);
		private final Assignment cOpCascadaAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final Keyword cOpCascadaREMOVEKeyword_5_0 = (Keyword)cOpCascadaAssignment_5.eContents().get(0);
		
		//Operacao:
		//	opCascada="ALL" | opCascada="DETACH" | opCascada="MERGE" | opCascada="PERSIST" | opCascada="REFRESH" |
		//	opCascada="REMOVE" //| opCascada = ANY_OTHER
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//opCascada="ALL" | opCascada="DETACH" | opCascada="MERGE" | opCascada="PERSIST" | opCascada="REFRESH" |
		//opCascada="REMOVE"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//opCascada="ALL"
		public Assignment getOpCascadaAssignment_0() { return cOpCascadaAssignment_0; }
		
		//"ALL"
		public Keyword getOpCascadaALLKeyword_0_0() { return cOpCascadaALLKeyword_0_0; }
		
		//opCascada="DETACH"
		public Assignment getOpCascadaAssignment_1() { return cOpCascadaAssignment_1; }
		
		//"DETACH"
		public Keyword getOpCascadaDETACHKeyword_1_0() { return cOpCascadaDETACHKeyword_1_0; }
		
		//opCascada="MERGE"
		public Assignment getOpCascadaAssignment_2() { return cOpCascadaAssignment_2; }
		
		//"MERGE"
		public Keyword getOpCascadaMERGEKeyword_2_0() { return cOpCascadaMERGEKeyword_2_0; }
		
		//opCascada="PERSIST"
		public Assignment getOpCascadaAssignment_3() { return cOpCascadaAssignment_3; }
		
		//"PERSIST"
		public Keyword getOpCascadaPERSISTKeyword_3_0() { return cOpCascadaPERSISTKeyword_3_0; }
		
		//opCascada="REFRESH"
		public Assignment getOpCascadaAssignment_4() { return cOpCascadaAssignment_4; }
		
		//"REFRESH"
		public Keyword getOpCascadaREFRESHKeyword_4_0() { return cOpCascadaREFRESHKeyword_4_0; }
		
		//opCascada="REMOVE"
		public Assignment getOpCascadaAssignment_5() { return cOpCascadaAssignment_5; }
		
		//"REMOVE"
		public Keyword getOpCascadaREMOVEKeyword_5_0() { return cOpCascadaREMOVEKeyword_5_0; }
	}
	public class AssociacaoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.Associacao");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cAssociacaoAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cAssociacaoOneToOneKeyword_0_0 = (Keyword)cAssociacaoAssignment_0.eContents().get(0);
		private final Assignment cAssociacaoAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cAssociacaoOneToManyKeyword_1_0 = (Keyword)cAssociacaoAssignment_1.eContents().get(0);
		private final Assignment cAssociacaoAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cAssociacaoManyToOneKeyword_2_0 = (Keyword)cAssociacaoAssignment_2.eContents().get(0);
		private final Assignment cAssociacaoAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cAssociacaoManyToManyKeyword_3_0 = (Keyword)cAssociacaoAssignment_3.eContents().get(0);
		
		//Associacao:
		//	associacao="OneToOne" | associacao="OneToMany" | associacao="ManyToOne" | associacao="ManyToMany" //| associacao = ANY_OTHER
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//associacao="OneToOne" | associacao="OneToMany" | associacao="ManyToOne" | associacao="ManyToMany"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//associacao="OneToOne"
		public Assignment getAssociacaoAssignment_0() { return cAssociacaoAssignment_0; }
		
		//"OneToOne"
		public Keyword getAssociacaoOneToOneKeyword_0_0() { return cAssociacaoOneToOneKeyword_0_0; }
		
		//associacao="OneToMany"
		public Assignment getAssociacaoAssignment_1() { return cAssociacaoAssignment_1; }
		
		//"OneToMany"
		public Keyword getAssociacaoOneToManyKeyword_1_0() { return cAssociacaoOneToManyKeyword_1_0; }
		
		//associacao="ManyToOne"
		public Assignment getAssociacaoAssignment_2() { return cAssociacaoAssignment_2; }
		
		//"ManyToOne"
		public Keyword getAssociacaoManyToOneKeyword_2_0() { return cAssociacaoManyToOneKeyword_2_0; }
		
		//associacao="ManyToMany"
		public Assignment getAssociacaoAssignment_3() { return cAssociacaoAssignment_3; }
		
		//"ManyToMany"
		public Keyword getAssociacaoManyToManyKeyword_3_0() { return cAssociacaoManyToManyKeyword_3_0; }
	}
	public class AtributoNomeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.AtributoNome");
		private final Assignment cNomeAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNomeSTRING_LITTerminalRuleCall_0 = (RuleCall)cNomeAssignment.eContents().get(0);
		
		//AtributoNome:
		//	nome=STRING_LIT;
		@Override public ParserRule getRule() { return rule; }
		
		//nome=STRING_LIT
		public Assignment getNomeAssignment() { return cNomeAssignment; }
		
		//STRING_LIT
		public RuleCall getNomeSTRING_LITTerminalRuleCall_0() { return cNomeSTRING_LITTerminalRuleCall_0; }
	}
	public class AtributoTipoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.AtributoTipo");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cTipoPAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cTipoPTIPO_DEFINIDOTerminalRuleCall_0_0 = (RuleCall)cTipoPAssignment_0.eContents().get(0);
		private final Assignment cTipoEAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTipoESTRING_LITTerminalRuleCall_1_0 = (RuleCall)cTipoEAssignment_1.eContents().get(0);
		
		//AtributoTipo:
		//	tipoP=TIPO_DEFINIDO | tipoE=STRING_LIT;
		@Override public ParserRule getRule() { return rule; }
		
		//tipoP=TIPO_DEFINIDO | tipoE=STRING_LIT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//tipoP=TIPO_DEFINIDO
		public Assignment getTipoPAssignment_0() { return cTipoPAssignment_0; }
		
		//TIPO_DEFINIDO
		public RuleCall getTipoPTIPO_DEFINIDOTerminalRuleCall_0_0() { return cTipoPTIPO_DEFINIDOTerminalRuleCall_0_0; }
		
		//tipoE=STRING_LIT
		public Assignment getTipoEAssignment_1() { return cTipoEAssignment_1; }
		
		//STRING_LIT
		public RuleCall getTipoESTRING_LITTerminalRuleCall_1_0() { return cTipoESTRING_LITTerminalRuleCall_1_0; }
	}
	public class ChavePrimariaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.ChavePrimaria");
		private final Assignment cIdAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_0 = (RuleCall)cIdAssignment.eContents().get(0);
		
		//ChavePrimaria:
		//	id=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//id=ID
		public Assignment getIdAssignment() { return cIdAssignment; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_0() { return cIdIDTerminalRuleCall_0; }
	}
	public class PackageNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.PackageName");
		private final Assignment cIdAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_0 = (RuleCall)cIdAssignment.eContents().get(0);
		
		//PackageName:
		//	id=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//id=ID
		public Assignment getIdAssignment() { return cIdAssignment; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_0() { return cIdIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final TerminalRule tTIPO_DEFINIDO;
	private final TerminalRule tSTRING_LIT;
	private final TerminalRule tLETRA;
	private final GreetingElements pGreeting;
	private final ApiElements pApi;
	private final ApiNomeElements pApiNome;
	private final EntidadeElements pEntidade;
	private final EntidadeNomeElements pEntidadeNome;
	private final AtributoElements pAtributo;
	private final OperacaoElements pOperacao;
	private final AssociacaoElements pAssociacao;
	private final AtributoNomeElements pAtributoNome;
	private final AtributoTipoElements pAtributoTipo;
	private final ChavePrimariaElements pChavePrimaria;
	private final PackageNameElements pPackageName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.tTIPO_DEFINIDO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.TIPO_DEFINIDO");
		this.tSTRING_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
		this.tLETRA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.tcc.mydsl.MyDsl.LETRA");
		this.pGreeting = new GreetingElements();
		this.pApi = new ApiElements();
		this.pApiNome = new ApiNomeElements();
		this.pEntidade = new EntidadeElements();
		this.pEntidadeNome = new EntidadeNomeElements();
		this.pAtributo = new AtributoElements();
		this.pOperacao = new OperacaoElements();
		this.pAssociacao = new AssociacaoElements();
		this.pAtributoNome = new AtributoNomeElements();
		this.pAtributoTipo = new AtributoTipoElements();
		this.pChavePrimaria = new ChavePrimariaElements();
		this.pPackageName = new PackageNameElements();
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
	
	//terminal TIPO_DEFINIDO:
	//	'"' ("Boolean" | "Integer" | "Long" | "String" | "Float" | "Double" |
	//	"Time" | "Timestamp" | "Date" | "ENUM" | "ArrayList" | "HashSet") '"';
	public TerminalRule getTIPO_DEFINIDORule() {
		return tTIPO_DEFINIDO;
	}
	
	//terminal STRING_LIT:
	//	'"' LETRA* '"';
	public TerminalRule getSTRING_LITRule() {
		return tSTRING_LIT;
	}
	
	//terminal LETRA:
	//	"a".."z" | "A".."Z";
	public TerminalRule getLETRARule() {
		return tLETRA;
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
	//	'"Entidades"' ':' '[' entidades+=Entidade+ ']';
	public ApiElements getApiAccess() {
		return pApi;
	}
	
	public ParserRule getApiRule() {
		return getApiAccess().getRule();
	}
	
	//ApiNome:
	//	id=ID;
	public ApiNomeElements getApiNomeAccess() {
		return pApiNome;
	}
	
	public ParserRule getApiNomeRule() {
		return getApiNomeAccess().getRule();
	}
	
	//Entidade:
	//	'{'
	//	'"Nome"' ':' nomeEntidades=EntidadeNome ','
	//	'"Atributos"' ':' '[' atributos+=Atributo+ ']' ','
	//	'"Chave Primaria"' ':' chavePrimaria=ChavePrimaria ','
	//	'"Nome do pacote"' ':' package=PackageName
	//	'}';
	public EntidadeElements getEntidadeAccess() {
		return pEntidade;
	}
	
	public ParserRule getEntidadeRule() {
		return getEntidadeAccess().getRule();
	}
	
	//EntidadeNome:
	//	nome=STRING_LIT;
	public EntidadeNomeElements getEntidadeNomeAccess() {
		return pEntidadeNome;
	}
	
	public ParserRule getEntidadeNomeRule() {
		return getEntidadeNomeAccess().getRule();
	}
	
	//Atributo:
	//	'{'
	//	'"nome-atributo"' ':' atributoNome=AtributoNome ','
	//	'"tipo-atributo"' ':' atributoTipo=AtributoTipo ','
	//	//'"associação"' ':' associacao = Associacao?','
	//	//'"operação em cascata"' ':' operacao = Operacao?
	//	'}';
	public AtributoElements getAtributoAccess() {
		return pAtributo;
	}
	
	public ParserRule getAtributoRule() {
		return getAtributoAccess().getRule();
	}
	
	//Operacao:
	//	opCascada="ALL" | opCascada="DETACH" | opCascada="MERGE" | opCascada="PERSIST" | opCascada="REFRESH" |
	//	opCascada="REMOVE" //| opCascada = ANY_OTHER
	//;
	public OperacaoElements getOperacaoAccess() {
		return pOperacao;
	}
	
	public ParserRule getOperacaoRule() {
		return getOperacaoAccess().getRule();
	}
	
	//Associacao:
	//	associacao="OneToOne" | associacao="OneToMany" | associacao="ManyToOne" | associacao="ManyToMany" //| associacao = ANY_OTHER
	//;
	public AssociacaoElements getAssociacaoAccess() {
		return pAssociacao;
	}
	
	public ParserRule getAssociacaoRule() {
		return getAssociacaoAccess().getRule();
	}
	
	//AtributoNome:
	//	nome=STRING_LIT;
	public AtributoNomeElements getAtributoNomeAccess() {
		return pAtributoNome;
	}
	
	public ParserRule getAtributoNomeRule() {
		return getAtributoNomeAccess().getRule();
	}
	
	//AtributoTipo:
	//	tipoP=TIPO_DEFINIDO | tipoE=STRING_LIT;
	public AtributoTipoElements getAtributoTipoAccess() {
		return pAtributoTipo;
	}
	
	public ParserRule getAtributoTipoRule() {
		return getAtributoTipoAccess().getRule();
	}
	
	//ChavePrimaria:
	//	id=ID;
	public ChavePrimariaElements getChavePrimariaAccess() {
		return pChavePrimaria;
	}
	
	public ParserRule getChavePrimariaRule() {
		return getChavePrimariaAccess().getRule();
	}
	
	//PackageName:
	//	id=ID;
	public PackageNameElements getPackageNameAccess() {
		return pPackageName;
	}
	
	public ParserRule getPackageNameRule() {
		return getPackageNameAccess().getRule();
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
