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
		(
			(
				{
					newCompositeNode(grammarAccess.getApiAccess().getNameApiAPINameParserRuleCall_0_0());
				}
				lv_nameApi_0_0=ruleAPIName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApiRule());
					}
					set(
						$current,
						"nameApi",
						lv_nameApi_0_0,
						"org.xtext.tcc.mydsl.MyDsl.APIName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=':{'
		{
			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getColonLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getApiAccess().getAttributesAttributeParserRuleCall_2_0());
				}
				lv_attributes_2_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getApiRule());
					}
					set(
						$current,
						"attributes",
						lv_attributes_2_0,
						"org.xtext.tcc.mydsl.MyDsl.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleAPIName
entryRuleAPIName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAPINameRule()); }
	iv_ruleAPIName=ruleAPIName
	{ $current=$iv_ruleAPIName.current; }
	EOF;

// Rule APIName
ruleAPIName returns [EObject current=null]
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
				newLeafNode(lv_id_0_0, grammarAccess.getAPINameAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAPINameRule());
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

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='atributos:'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAtributosKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='nome:'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNomeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeNameAttributeNameParserRuleCall_4_0());
				}
				lv_attributeName_4_0=ruleAttributeName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"attributeName",
						lv_attributeName_4_0,
						"org.xtext.tcc.mydsl.MyDsl.AttributeName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_5());
		}
		otherlv_6='tipo:'
		{
			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTipoKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeTypeAttributeTypeParserRuleCall_7_0());
				}
				lv_attributeType_7_0=ruleAttributeType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"attributeType",
						lv_attributeType_7_0,
						"org.xtext.tcc.mydsl.MyDsl.AttributeType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8=','
		{
			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_8());
		}
		otherlv_9='metodoGet:'
		{
			newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getMetodoGetKeyword_9());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getDecisionGetBoolParserRuleCall_10_0());
				}
				lv_decisionGet_10_0=ruleBool
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"decisionGet",
						lv_decisionGet_10_0,
						"org.xtext.tcc.mydsl.MyDsl.Bool");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11=','
		{
			newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getCommaKeyword_11());
		}
		otherlv_12='metodoSet:'
		{
			newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getMetodoSetKeyword_12());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getDecisionSetBoolParserRuleCall_13_0());
				}
				lv_decisionSet_13_0=ruleBool
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"decisionSet",
						lv_decisionSet_13_0,
						"org.xtext.tcc.mydsl.MyDsl.Bool");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_14=','
		{
			newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getCommaKeyword_14());
		}
		otherlv_15='idChavePrimaria:'
		{
			newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getIdChavePrimariaKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getDecisionIDBoolParserRuleCall_16_0());
				}
				lv_decisionID_16_0=ruleBool
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"decisionID",
						lv_decisionID_16_0,
						"org.xtext.tcc.mydsl.MyDsl.Bool");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17());
		}
		otherlv_18=']'
		{
			newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_18());
		}
	)
;

// Entry rule entryRuleAttributeName
entryRuleAttributeName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeNameRule()); }
	iv_ruleAttributeName=ruleAttributeName
	{ $current=$iv_ruleAttributeName.current; }
	EOF;

// Rule AttributeName
ruleAttributeName returns [EObject current=null]
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
				newLeafNode(lv_id_0_0, grammarAccess.getAttributeNameAccess().getIdIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAttributeNameRule());
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

// Entry rule entryRuleAttributeType
entryRuleAttributeType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeTypeRule()); }
	iv_ruleAttributeType=ruleAttributeType
	{ $current=$iv_ruleAttributeType.current; }
	EOF;

// Rule AttributeType
ruleAttributeType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0='String'
				{
					newLeafNode(lv_type_0_0, grammarAccess.getAttributeTypeAccess().getTypeStringKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_0_0, "String");
				}
			)
		)
		    |
		(
			(
				lv_type_1_0='Int'
				{
					newLeafNode(lv_type_1_0, grammarAccess.getAttributeTypeAccess().getTypeIntKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_1_0, "Int");
				}
			)
		)
		    |
		(
			(
				lv_type_2_0='Double'
				{
					newLeafNode(lv_type_2_0, grammarAccess.getAttributeTypeAccess().getTypeDoubleKeyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_2_0, "Double");
				}
			)
		)
		    |
		(
			(
				lv_type_3_0='Boolean'
				{
					newLeafNode(lv_type_3_0, grammarAccess.getAttributeTypeAccess().getTypeBooleanKeyword_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeTypeRule());
					}
					setWithLastConsumed($current, "type", lv_type_3_0, "Boolean");
				}
			)
		)
	)
;

// Entry rule entryRuleBool
entryRuleBool returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolRule()); }
	iv_ruleBool=ruleBool
	{ $current=$iv_ruleBool.current; }
	EOF;

// Rule Bool
ruleBool returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_decision_0_0='Yes'
				{
					newLeafNode(lv_decision_0_0, grammarAccess.getBoolAccess().getDecisionYesKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoolRule());
					}
					setWithLastConsumed($current, "decision", lv_decision_0_0, "Yes");
				}
			)
		)
		    |
		(
			(
				lv_decision_1_0='No'
				{
					newLeafNode(lv_decision_1_0, grammarAccess.getBoolAccess().getDecisionNoKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBoolRule());
					}
					setWithLastConsumed($current, "decision", lv_decision_1_0, "No");
				}
			)
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
