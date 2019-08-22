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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':{'", "'atributos:'", "'['", "'nome:'", "','", "'tipo:'", "'metodoGet:'", "'metodoSet:'", "'idChavePrimaria:'", "']'", "'String'", "'Int'", "'Double'", "'Boolean'", "'Yes'", "'No'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"org.xtext.tcc.mydsl.MyDsl.Greeting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_api_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' ) )
            // InternalMyDsl.g:114:2: (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' )
            // InternalMyDsl.g:115:3: otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_api_1_0= ruleApi ) )
            // InternalMyDsl.g:120:4: (lv_api_1_0= ruleApi )
            {
            // InternalMyDsl.g:120:4: (lv_api_1_0= ruleApi )
            // InternalMyDsl.g:121:5: lv_api_1_0= ruleApi
            {

            					newCompositeNode(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_api_1_0=ruleApi();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreetingRule());
            					}
            					set(
            						current,
            						"api",
            						lv_api_1_0,
            						"org.xtext.tcc.mydsl.MyDsl.Api");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:146:1: entryRuleApi returns [EObject current=null] : iv_ruleApi= ruleApi EOF ;
    public final EObject entryRuleApi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApi = null;


        try {
            // InternalMyDsl.g:146:44: (iv_ruleApi= ruleApi EOF )
            // InternalMyDsl.g:147:2: iv_ruleApi= ruleApi EOF
            {
             newCompositeNode(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApi=ruleApi();

            state._fsp--;

             current =iv_ruleApi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:153:1: ruleApi returns [EObject current=null] : ( ( (lv_nameApi_0_0= ruleAPIName ) ) otherlv_1= ':{' ( (lv_attributes_2_0= ruleAttribute ) ) otherlv_3= '}' ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_nameApi_0_0 = null;

        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:159:2: ( ( ( (lv_nameApi_0_0= ruleAPIName ) ) otherlv_1= ':{' ( (lv_attributes_2_0= ruleAttribute ) ) otherlv_3= '}' ) )
            // InternalMyDsl.g:160:2: ( ( (lv_nameApi_0_0= ruleAPIName ) ) otherlv_1= ':{' ( (lv_attributes_2_0= ruleAttribute ) ) otherlv_3= '}' )
            {
            // InternalMyDsl.g:160:2: ( ( (lv_nameApi_0_0= ruleAPIName ) ) otherlv_1= ':{' ( (lv_attributes_2_0= ruleAttribute ) ) otherlv_3= '}' )
            // InternalMyDsl.g:161:3: ( (lv_nameApi_0_0= ruleAPIName ) ) otherlv_1= ':{' ( (lv_attributes_2_0= ruleAttribute ) ) otherlv_3= '}'
            {
            // InternalMyDsl.g:161:3: ( (lv_nameApi_0_0= ruleAPIName ) )
            // InternalMyDsl.g:162:4: (lv_nameApi_0_0= ruleAPIName )
            {
            // InternalMyDsl.g:162:4: (lv_nameApi_0_0= ruleAPIName )
            // InternalMyDsl.g:163:5: lv_nameApi_0_0= ruleAPIName
            {

            					newCompositeNode(grammarAccess.getApiAccess().getNameApiAPINameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_nameApi_0_0=ruleAPIName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"nameApi",
            						lv_nameApi_0_0,
            						"org.xtext.tcc.mydsl.MyDsl.APIName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getColonLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:184:3: ( (lv_attributes_2_0= ruleAttribute ) )
            // InternalMyDsl.g:185:4: (lv_attributes_2_0= ruleAttribute )
            {
            // InternalMyDsl.g:185:4: (lv_attributes_2_0= ruleAttribute )
            // InternalMyDsl.g:186:5: lv_attributes_2_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getApiAccess().getAttributesAttributeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_attributes_2_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"attributes",
            						lv_attributes_2_0,
            						"org.xtext.tcc.mydsl.MyDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleAPIName"
    // InternalMyDsl.g:211:1: entryRuleAPIName returns [EObject current=null] : iv_ruleAPIName= ruleAPIName EOF ;
    public final EObject entryRuleAPIName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAPIName = null;


        try {
            // InternalMyDsl.g:211:48: (iv_ruleAPIName= ruleAPIName EOF )
            // InternalMyDsl.g:212:2: iv_ruleAPIName= ruleAPIName EOF
            {
             newCompositeNode(grammarAccess.getAPINameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAPIName=ruleAPIName();

            state._fsp--;

             current =iv_ruleAPIName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAPIName"


    // $ANTLR start "ruleAPIName"
    // InternalMyDsl.g:218:1: ruleAPIName returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAPIName() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:224:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:225:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:225:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:226:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:226:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:227:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getAPINameAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAPINameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAPIName"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:246:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:246:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:247:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:253:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'atributos:' otherlv_1= '[' otherlv_2= '{' otherlv_3= 'nome:' ( (lv_attributeName_4_0= ruleAttributeName ) ) otherlv_5= ',' otherlv_6= 'tipo:' ( (lv_attributeType_7_0= ruleAttributeType ) ) otherlv_8= ',' otherlv_9= 'metodoGet:' ( (lv_decisionGet_10_0= ruleBool ) ) otherlv_11= ',' otherlv_12= 'metodoSet:' ( (lv_decisionSet_13_0= ruleBool ) ) otherlv_14= ',' otherlv_15= 'idChavePrimaria:' ( (lv_decisionID_16_0= ruleBool ) ) otherlv_17= '}' otherlv_18= ']' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attributeName_4_0 = null;

        EObject lv_attributeType_7_0 = null;

        EObject lv_decisionGet_10_0 = null;

        EObject lv_decisionSet_13_0 = null;

        EObject lv_decisionID_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:259:2: ( (otherlv_0= 'atributos:' otherlv_1= '[' otherlv_2= '{' otherlv_3= 'nome:' ( (lv_attributeName_4_0= ruleAttributeName ) ) otherlv_5= ',' otherlv_6= 'tipo:' ( (lv_attributeType_7_0= ruleAttributeType ) ) otherlv_8= ',' otherlv_9= 'metodoGet:' ( (lv_decisionGet_10_0= ruleBool ) ) otherlv_11= ',' otherlv_12= 'metodoSet:' ( (lv_decisionSet_13_0= ruleBool ) ) otherlv_14= ',' otherlv_15= 'idChavePrimaria:' ( (lv_decisionID_16_0= ruleBool ) ) otherlv_17= '}' otherlv_18= ']' ) )
            // InternalMyDsl.g:260:2: (otherlv_0= 'atributos:' otherlv_1= '[' otherlv_2= '{' otherlv_3= 'nome:' ( (lv_attributeName_4_0= ruleAttributeName ) ) otherlv_5= ',' otherlv_6= 'tipo:' ( (lv_attributeType_7_0= ruleAttributeType ) ) otherlv_8= ',' otherlv_9= 'metodoGet:' ( (lv_decisionGet_10_0= ruleBool ) ) otherlv_11= ',' otherlv_12= 'metodoSet:' ( (lv_decisionSet_13_0= ruleBool ) ) otherlv_14= ',' otherlv_15= 'idChavePrimaria:' ( (lv_decisionID_16_0= ruleBool ) ) otherlv_17= '}' otherlv_18= ']' )
            {
            // InternalMyDsl.g:260:2: (otherlv_0= 'atributos:' otherlv_1= '[' otherlv_2= '{' otherlv_3= 'nome:' ( (lv_attributeName_4_0= ruleAttributeName ) ) otherlv_5= ',' otherlv_6= 'tipo:' ( (lv_attributeType_7_0= ruleAttributeType ) ) otherlv_8= ',' otherlv_9= 'metodoGet:' ( (lv_decisionGet_10_0= ruleBool ) ) otherlv_11= ',' otherlv_12= 'metodoSet:' ( (lv_decisionSet_13_0= ruleBool ) ) otherlv_14= ',' otherlv_15= 'idChavePrimaria:' ( (lv_decisionID_16_0= ruleBool ) ) otherlv_17= '}' otherlv_18= ']' )
            // InternalMyDsl.g:261:3: otherlv_0= 'atributos:' otherlv_1= '[' otherlv_2= '{' otherlv_3= 'nome:' ( (lv_attributeName_4_0= ruleAttributeName ) ) otherlv_5= ',' otherlv_6= 'tipo:' ( (lv_attributeType_7_0= ruleAttributeType ) ) otherlv_8= ',' otherlv_9= 'metodoGet:' ( (lv_decisionGet_10_0= ruleBool ) ) otherlv_11= ',' otherlv_12= 'metodoSet:' ( (lv_decisionSet_13_0= ruleBool ) ) otherlv_14= ',' otherlv_15= 'idChavePrimaria:' ( (lv_decisionID_16_0= ruleBool ) ) otherlv_17= '}' otherlv_18= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAtributosKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getNomeKeyword_3());
            		
            // InternalMyDsl.g:277:3: ( (lv_attributeName_4_0= ruleAttributeName ) )
            // InternalMyDsl.g:278:4: (lv_attributeName_4_0= ruleAttributeName )
            {
            // InternalMyDsl.g:278:4: (lv_attributeName_4_0= ruleAttributeName )
            // InternalMyDsl.g:279:5: lv_attributeName_4_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeNameAttributeNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_attributeName_4_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"attributeName",
            						lv_attributeName_4_0,
            						"org.xtext.tcc.mydsl.MyDsl.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getTipoKeyword_6());
            		
            // InternalMyDsl.g:304:3: ( (lv_attributeType_7_0= ruleAttributeType ) )
            // InternalMyDsl.g:305:4: (lv_attributeType_7_0= ruleAttributeType )
            {
            // InternalMyDsl.g:305:4: (lv_attributeType_7_0= ruleAttributeType )
            // InternalMyDsl.g:306:5: lv_attributeType_7_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeTypeAttributeTypeParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_attributeType_7_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"attributeType",
            						lv_attributeType_7_0,
            						"org.xtext.tcc.mydsl.MyDsl.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getMetodoGetKeyword_9());
            		
            // InternalMyDsl.g:331:3: ( (lv_decisionGet_10_0= ruleBool ) )
            // InternalMyDsl.g:332:4: (lv_decisionGet_10_0= ruleBool )
            {
            // InternalMyDsl.g:332:4: (lv_decisionGet_10_0= ruleBool )
            // InternalMyDsl.g:333:5: lv_decisionGet_10_0= ruleBool
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDecisionGetBoolParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_decisionGet_10_0=ruleBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"decisionGet",
            						lv_decisionGet_10_0,
            						"org.xtext.tcc.mydsl.MyDsl.Bool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getAttributeAccess().getMetodoSetKeyword_12());
            		
            // InternalMyDsl.g:358:3: ( (lv_decisionSet_13_0= ruleBool ) )
            // InternalMyDsl.g:359:4: (lv_decisionSet_13_0= ruleBool )
            {
            // InternalMyDsl.g:359:4: (lv_decisionSet_13_0= ruleBool )
            // InternalMyDsl.g:360:5: lv_decisionSet_13_0= ruleBool
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDecisionSetBoolParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_11);
            lv_decisionSet_13_0=ruleBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"decisionSet",
            						lv_decisionSet_13_0,
            						"org.xtext.tcc.mydsl.MyDsl.Bool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getIdChavePrimariaKeyword_15());
            		
            // InternalMyDsl.g:385:3: ( (lv_decisionID_16_0= ruleBool ) )
            // InternalMyDsl.g:386:4: (lv_decisionID_16_0= ruleBool )
            {
            // InternalMyDsl.g:386:4: (lv_decisionID_16_0= ruleBool )
            // InternalMyDsl.g:387:5: lv_decisionID_16_0= ruleBool
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getDecisionIDBoolParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_5);
            lv_decisionID_16_0=ruleBool();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"decisionID",
            						lv_decisionID_16_0,
            						"org.xtext.tcc.mydsl.MyDsl.Bool");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeName"
    // InternalMyDsl.g:416:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // InternalMyDsl.g:416:54: (iv_ruleAttributeName= ruleAttributeName EOF )
            // InternalMyDsl.g:417:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // InternalMyDsl.g:423:1: ruleAttributeName returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:429:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:430:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:430:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:431:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:431:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:432:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getAttributeNameAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributeNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleAttributeType"
    // InternalMyDsl.g:451:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalMyDsl.g:451:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalMyDsl.g:452:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalMyDsl.g:458:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_type_0_0= 'String' ) ) | ( (lv_type_1_0= 'Int' ) ) | ( (lv_type_2_0= 'Double' ) ) | ( (lv_type_3_0= 'Boolean' ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token lv_type_1_0=null;
        Token lv_type_2_0=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:464:2: ( ( ( (lv_type_0_0= 'String' ) ) | ( (lv_type_1_0= 'Int' ) ) | ( (lv_type_2_0= 'Double' ) ) | ( (lv_type_3_0= 'Boolean' ) ) ) )
            // InternalMyDsl.g:465:2: ( ( (lv_type_0_0= 'String' ) ) | ( (lv_type_1_0= 'Int' ) ) | ( (lv_type_2_0= 'Double' ) ) | ( (lv_type_3_0= 'Boolean' ) ) )
            {
            // InternalMyDsl.g:465:2: ( ( (lv_type_0_0= 'String' ) ) | ( (lv_type_1_0= 'Int' ) ) | ( (lv_type_2_0= 'Double' ) ) | ( (lv_type_3_0= 'Boolean' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:466:3: ( (lv_type_0_0= 'String' ) )
                    {
                    // InternalMyDsl.g:466:3: ( (lv_type_0_0= 'String' ) )
                    // InternalMyDsl.g:467:4: (lv_type_0_0= 'String' )
                    {
                    // InternalMyDsl.g:467:4: (lv_type_0_0= 'String' )
                    // InternalMyDsl.g:468:5: lv_type_0_0= 'String'
                    {
                    lv_type_0_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_type_0_0, grammarAccess.getAttributeTypeAccess().getTypeStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_0_0, "String");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:481:3: ( (lv_type_1_0= 'Int' ) )
                    {
                    // InternalMyDsl.g:481:3: ( (lv_type_1_0= 'Int' ) )
                    // InternalMyDsl.g:482:4: (lv_type_1_0= 'Int' )
                    {
                    // InternalMyDsl.g:482:4: (lv_type_1_0= 'Int' )
                    // InternalMyDsl.g:483:5: lv_type_1_0= 'Int'
                    {
                    lv_type_1_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_type_1_0, grammarAccess.getAttributeTypeAccess().getTypeIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_1_0, "Int");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:496:3: ( (lv_type_2_0= 'Double' ) )
                    {
                    // InternalMyDsl.g:496:3: ( (lv_type_2_0= 'Double' ) )
                    // InternalMyDsl.g:497:4: (lv_type_2_0= 'Double' )
                    {
                    // InternalMyDsl.g:497:4: (lv_type_2_0= 'Double' )
                    // InternalMyDsl.g:498:5: lv_type_2_0= 'Double'
                    {
                    lv_type_2_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_type_2_0, grammarAccess.getAttributeTypeAccess().getTypeDoubleKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_2_0, "Double");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:511:3: ( (lv_type_3_0= 'Boolean' ) )
                    {
                    // InternalMyDsl.g:511:3: ( (lv_type_3_0= 'Boolean' ) )
                    // InternalMyDsl.g:512:4: (lv_type_3_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:512:4: (lv_type_3_0= 'Boolean' )
                    // InternalMyDsl.g:513:5: lv_type_3_0= 'Boolean'
                    {
                    lv_type_3_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_type_3_0, grammarAccess.getAttributeTypeAccess().getTypeBooleanKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_3_0, "Boolean");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleBool"
    // InternalMyDsl.g:529:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalMyDsl.g:529:45: (iv_ruleBool= ruleBool EOF )
            // InternalMyDsl.g:530:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalMyDsl.g:536:1: ruleBool returns [EObject current=null] : ( ( (lv_decision_0_0= 'Yes' ) ) | ( (lv_decision_1_0= 'No' ) ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token lv_decision_0_0=null;
        Token lv_decision_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:542:2: ( ( ( (lv_decision_0_0= 'Yes' ) ) | ( (lv_decision_1_0= 'No' ) ) ) )
            // InternalMyDsl.g:543:2: ( ( (lv_decision_0_0= 'Yes' ) ) | ( (lv_decision_1_0= 'No' ) ) )
            {
            // InternalMyDsl.g:543:2: ( ( (lv_decision_0_0= 'Yes' ) ) | ( (lv_decision_1_0= 'No' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:544:3: ( (lv_decision_0_0= 'Yes' ) )
                    {
                    // InternalMyDsl.g:544:3: ( (lv_decision_0_0= 'Yes' ) )
                    // InternalMyDsl.g:545:4: (lv_decision_0_0= 'Yes' )
                    {
                    // InternalMyDsl.g:545:4: (lv_decision_0_0= 'Yes' )
                    // InternalMyDsl.g:546:5: lv_decision_0_0= 'Yes'
                    {
                    lv_decision_0_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_decision_0_0, grammarAccess.getBoolAccess().getDecisionYesKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolRule());
                    					}
                    					setWithLastConsumed(current, "decision", lv_decision_0_0, "Yes");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:559:3: ( (lv_decision_1_0= 'No' ) )
                    {
                    // InternalMyDsl.g:559:3: ( (lv_decision_1_0= 'No' ) )
                    // InternalMyDsl.g:560:4: (lv_decision_1_0= 'No' )
                    {
                    // InternalMyDsl.g:560:4: (lv_decision_1_0= 'No' )
                    // InternalMyDsl.g:561:5: lv_decision_1_0= 'No'
                    {
                    lv_decision_1_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_decision_1_0, grammarAccess.getBoolAccess().getDecisionNoKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBoolRule());
                    					}
                    					setWithLastConsumed(current, "decision", lv_decision_1_0, "No");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});

}