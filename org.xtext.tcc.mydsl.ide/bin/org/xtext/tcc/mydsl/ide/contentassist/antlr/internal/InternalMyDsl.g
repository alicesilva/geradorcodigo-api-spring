/*
 * generated by Xtext 2.18.0.M3
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.tcc.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.tcc.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.tcc.mydsl.services.MyDslGrammarAccess;

}
@parser::members {
	private MyDslGrammarAccess grammarAccess;

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsAssignment()); }
		(rule__Model__GreetingsAssignment)*
		{ after(grammarAccess.getModelAccess().getGreetingsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleGreeting
entryRuleGreeting
:
{ before(grammarAccess.getGreetingRule()); }
	 ruleGreeting
{ after(grammarAccess.getGreetingRule()); } 
	 EOF 
;

// Rule Greeting
ruleGreeting 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getGreetingAccess().getGroup()); }
		(rule__Greeting__Group__0)
		{ after(grammarAccess.getGreetingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleApi
entryRuleApi
:
{ before(grammarAccess.getApiRule()); }
	 ruleApi
{ after(grammarAccess.getApiRule()); } 
	 EOF 
;

// Rule Api
ruleApi 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getApiAccess().getGroup()); }
		(rule__Api__Group__0)
		{ after(grammarAccess.getApiAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAPIName
entryRuleAPIName
:
{ before(grammarAccess.getAPINameRule()); }
	 ruleAPIName
{ after(grammarAccess.getAPINameRule()); } 
	 EOF 
;

// Rule APIName
ruleAPIName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAPINameAccess().getIdAssignment()); }
		(rule__APIName__IdAssignment)
		{ after(grammarAccess.getAPINameAccess().getIdAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeName
entryRuleAttributeName
:
{ before(grammarAccess.getAttributeNameRule()); }
	 ruleAttributeName
{ after(grammarAccess.getAttributeNameRule()); } 
	 EOF 
;

// Rule AttributeName
ruleAttributeName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeNameAccess().getIdAssignment()); }
		(rule__AttributeName__IdAssignment)
		{ after(grammarAccess.getAttributeNameAccess().getIdAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeType
entryRuleAttributeType
:
{ before(grammarAccess.getAttributeTypeRule()); }
	 ruleAttributeType
{ after(grammarAccess.getAttributeTypeRule()); } 
	 EOF 
;

// Rule AttributeType
ruleAttributeType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getAlternatives()); }
		(rule__AttributeType__Alternatives)
		{ after(grammarAccess.getAttributeTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBool
entryRuleBool
:
{ before(grammarAccess.getBoolRule()); }
	 ruleBool
{ after(grammarAccess.getBoolRule()); } 
	 EOF 
;

// Rule Bool
ruleBool 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBoolAccess().getAlternatives()); }
		(rule__Bool__Alternatives)
		{ after(grammarAccess.getBoolAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeAssignment_0()); }
		(rule__AttributeType__TypeAssignment_0)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeAssignment_1()); }
		(rule__AttributeType__TypeAssignment_1)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeAssignment_2()); }
		(rule__AttributeType__TypeAssignment_2)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeAssignment_2()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeAssignment_3()); }
		(rule__AttributeType__TypeAssignment_3)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeAssignment_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bool__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoolAccess().getDecisionAssignment_0()); }
		(rule__Bool__DecisionAssignment_0)
		{ after(grammarAccess.getBoolAccess().getDecisionAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getBoolAccess().getDecisionAssignment_1()); }
		(rule__Bool__DecisionAssignment_1)
		{ after(grammarAccess.getBoolAccess().getDecisionAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__0__Impl
	rule__Greeting__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__1__Impl
	rule__Greeting__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getApiAssignment_1()); }
	(rule__Greeting__ApiAssignment_1)
	{ after(grammarAccess.getGreetingAccess().getApiAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Greeting__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Api__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Api__Group__0__Impl
	rule__Api__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApiAccess().getNameApiAssignment_0()); }
	(rule__Api__NameApiAssignment_0)
	{ after(grammarAccess.getApiAccess().getNameApiAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Api__Group__1__Impl
	rule__Api__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApiAccess().getColonLeftCurlyBracketKeyword_1()); }
	':{'
	{ after(grammarAccess.getApiAccess().getColonLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Api__Group__2__Impl
	rule__Api__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApiAccess().getAttributesAssignment_2()); }
	(rule__Api__AttributesAssignment_2)
	{ after(grammarAccess.getApiAccess().getAttributesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Api__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAtributosKeyword_0()); }
	'atributos:'
	{ after(grammarAccess.getAttributeAccess().getAtributosKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1()); }
	'['
	{ after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
	rule__Attribute__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNomeKeyword_3()); }
	'nome:'
	{ after(grammarAccess.getAttributeAccess().getNomeKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__4__Impl
	rule__Attribute__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_4()); }
	(rule__Attribute__AttributeNameAssignment_4)
	{ after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__5__Impl
	rule__Attribute__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getCommaKeyword_5()); }
	','
	{ after(grammarAccess.getAttributeAccess().getCommaKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__6__Impl
	rule__Attribute__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getTipoKeyword_6()); }
	'tipo:'
	{ after(grammarAccess.getAttributeAccess().getTipoKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__7__Impl
	rule__Attribute__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttributeTypeAssignment_7()); }
	(rule__Attribute__AttributeTypeAssignment_7)
	{ after(grammarAccess.getAttributeAccess().getAttributeTypeAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__8__Impl
	rule__Attribute__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getCommaKeyword_8()); }
	','
	{ after(grammarAccess.getAttributeAccess().getCommaKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__9__Impl
	rule__Attribute__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getMetodoGetKeyword_9()); }
	'metodoGet:'
	{ after(grammarAccess.getAttributeAccess().getMetodoGetKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__10__Impl
	rule__Attribute__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getDecisionGetAssignment_10()); }
	(rule__Attribute__DecisionGetAssignment_10)
	{ after(grammarAccess.getAttributeAccess().getDecisionGetAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__11__Impl
	rule__Attribute__Group__12
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getCommaKeyword_11()); }
	','
	{ after(grammarAccess.getAttributeAccess().getCommaKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__12
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__12__Impl
	rule__Attribute__Group__13
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__12__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getMetodoSetKeyword_12()); }
	'metodoSet:'
	{ after(grammarAccess.getAttributeAccess().getMetodoSetKeyword_12()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__13
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__13__Impl
	rule__Attribute__Group__14
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__13__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getDecisionSetAssignment_13()); }
	(rule__Attribute__DecisionSetAssignment_13)
	{ after(grammarAccess.getAttributeAccess().getDecisionSetAssignment_13()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__14
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__14__Impl
	rule__Attribute__Group__15
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__14__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getCommaKeyword_14()); }
	','
	{ after(grammarAccess.getAttributeAccess().getCommaKeyword_14()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__15
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__15__Impl
	rule__Attribute__Group__16
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__15__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getIdChavePrimariaKeyword_15()); }
	'idChavePrimaria:'
	{ after(grammarAccess.getAttributeAccess().getIdChavePrimariaKeyword_15()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__16
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__16__Impl
	rule__Attribute__Group__17
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__16__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getDecisionIDAssignment_16()); }
	(rule__Attribute__DecisionIDAssignment_16)
	{ after(grammarAccess.getAttributeAccess().getDecisionIDAssignment_16()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__17
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__17__Impl
	rule__Attribute__Group__18
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__17__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17()); }
	'}'
	{ after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__18
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__18__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__18__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_18()); }
	']'
	{ after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_18()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__GreetingsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
		ruleGreeting
		{ after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Greeting__ApiAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0()); }
		ruleApi
		{ after(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__NameApiAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApiAccess().getNameApiAPINameParserRuleCall_0_0()); }
		ruleAPIName
		{ after(grammarAccess.getApiAccess().getNameApiAPINameParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Api__AttributesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getApiAccess().getAttributesAttributeParserRuleCall_2_0()); }
		ruleAttribute
		{ after(grammarAccess.getApiAccess().getAttributesAttributeParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__APIName__IdAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAPINameAccess().getIdIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getAPINameAccess().getIdIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__AttributeNameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getAttributeNameAttributeNameParserRuleCall_4_0()); }
		ruleAttributeName
		{ after(grammarAccess.getAttributeAccess().getAttributeNameAttributeNameParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__AttributeTypeAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getAttributeTypeAttributeTypeParserRuleCall_7_0()); }
		ruleAttributeType
		{ after(grammarAccess.getAttributeAccess().getAttributeTypeAttributeTypeParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DecisionGetAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getDecisionGetBoolParserRuleCall_10_0()); }
		ruleBool
		{ after(grammarAccess.getAttributeAccess().getDecisionGetBoolParserRuleCall_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DecisionSetAssignment_13
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getDecisionSetBoolParserRuleCall_13_0()); }
		ruleBool
		{ after(grammarAccess.getAttributeAccess().getDecisionSetBoolParserRuleCall_13_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__DecisionIDAssignment_16
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getDecisionIDBoolParserRuleCall_16_0()); }
		ruleBool
		{ after(grammarAccess.getAttributeAccess().getDecisionIDBoolParserRuleCall_16_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeName__IdAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeNameAccess().getIdIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeNameAccess().getIdIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeStringKeyword_0_0()); }
		(
			{ before(grammarAccess.getAttributeTypeAccess().getTypeStringKeyword_0_0()); }
			'String'
			{ after(grammarAccess.getAttributeTypeAccess().getTypeStringKeyword_0_0()); }
		)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeStringKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeIntKeyword_1_0()); }
		(
			{ before(grammarAccess.getAttributeTypeAccess().getTypeIntKeyword_1_0()); }
			'Int'
			{ after(grammarAccess.getAttributeTypeAccess().getTypeIntKeyword_1_0()); }
		)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeIntKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeDoubleKeyword_2_0()); }
		(
			{ before(grammarAccess.getAttributeTypeAccess().getTypeDoubleKeyword_2_0()); }
			'Double'
			{ after(grammarAccess.getAttributeTypeAccess().getTypeDoubleKeyword_2_0()); }
		)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeDoubleKeyword_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeType__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeTypeAccess().getTypeBooleanKeyword_3_0()); }
		(
			{ before(grammarAccess.getAttributeTypeAccess().getTypeBooleanKeyword_3_0()); }
			'Boolean'
			{ after(grammarAccess.getAttributeTypeAccess().getTypeBooleanKeyword_3_0()); }
		)
		{ after(grammarAccess.getAttributeTypeAccess().getTypeBooleanKeyword_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bool__DecisionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoolAccess().getDecisionYesKeyword_0_0()); }
		(
			{ before(grammarAccess.getBoolAccess().getDecisionYesKeyword_0_0()); }
			'Yes'
			{ after(grammarAccess.getBoolAccess().getDecisionYesKeyword_0_0()); }
		)
		{ after(grammarAccess.getBoolAccess().getDecisionYesKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bool__DecisionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBoolAccess().getDecisionNoKeyword_1_0()); }
		(
			{ before(grammarAccess.getBoolAccess().getDecisionNoKeyword_1_0()); }
			'No'
			{ after(grammarAccess.getBoolAccess().getDecisionNoKeyword_1_0()); }
		)
		{ after(grammarAccess.getBoolAccess().getDecisionNoKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;