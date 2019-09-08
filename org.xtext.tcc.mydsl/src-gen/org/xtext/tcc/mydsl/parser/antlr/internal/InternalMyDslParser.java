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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "'['", "']'", "'nome-atributo:'", "','", "'tipo:'", "'associa\\u00E7\\u00E3o:'", "'opera\\u00E7\\u00E3o em cascata:'", "'mappedBy:'", "'JoinTable - nome:'", "'joinColumns - nome:'", "'inverseJoinColumns - nome:'"
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
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalMyDsl.g:153:1: ruleApi returns [EObject current=null] : ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_entidades_3_0= ruleEntidade ) )+ otherlv_4= ']' ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nomeApi_0_0 = null;

        EObject lv_entidades_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:159:2: ( ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_entidades_3_0= ruleEntidade ) )+ otherlv_4= ']' ) )
            // InternalMyDsl.g:160:2: ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_entidades_3_0= ruleEntidade ) )+ otherlv_4= ']' )
            {
            // InternalMyDsl.g:160:2: ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_entidades_3_0= ruleEntidade ) )+ otherlv_4= ']' )
            // InternalMyDsl.g:161:3: ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' otherlv_2= '[' ( (lv_entidades_3_0= ruleEntidade ) )+ otherlv_4= ']'
            {
            // InternalMyDsl.g:161:3: ( (lv_nomeApi_0_0= ruleApiNome ) )
            // InternalMyDsl.g:162:4: (lv_nomeApi_0_0= ruleApiNome )
            {
            // InternalMyDsl.g:162:4: (lv_nomeApi_0_0= ruleApiNome )
            // InternalMyDsl.g:163:5: lv_nomeApi_0_0= ruleApiNome
            {

            					newCompositeNode(grammarAccess.getApiAccess().getNomeApiApiNomeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_nomeApi_0_0=ruleApiNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"nomeApi",
            						lv_nomeApi_0_0,
            						"org.xtext.tcc.mydsl.MyDsl.ApiNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getApiAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalMyDsl.g:188:3: ( (lv_entidades_3_0= ruleEntidade ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:189:4: (lv_entidades_3_0= ruleEntidade )
            	    {
            	    // InternalMyDsl.g:189:4: (lv_entidades_3_0= ruleEntidade )
            	    // InternalMyDsl.g:190:5: lv_entidades_3_0= ruleEntidade
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_entidades_3_0=ruleEntidade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_3_0,
            	    						"org.xtext.tcc.mydsl.MyDsl.Entidade");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getApiAccess().getRightSquareBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleApiNome"
    // InternalMyDsl.g:215:1: entryRuleApiNome returns [EObject current=null] : iv_ruleApiNome= ruleApiNome EOF ;
    public final EObject entryRuleApiNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiNome = null;


        try {
            // InternalMyDsl.g:215:48: (iv_ruleApiNome= ruleApiNome EOF )
            // InternalMyDsl.g:216:2: iv_ruleApiNome= ruleApiNome EOF
            {
             newCompositeNode(grammarAccess.getApiNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApiNome=ruleApiNome();

            state._fsp--;

             current =iv_ruleApiNome; 
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
    // $ANTLR end "entryRuleApiNome"


    // $ANTLR start "ruleApiNome"
    // InternalMyDsl.g:222:1: ruleApiNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleApiNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:228:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:229:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:229:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:230:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:230:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:231:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getApiNomeAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getApiNomeRule());
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
    // $ANTLR end "ruleApiNome"


    // $ANTLR start "entryRuleEntidade"
    // InternalMyDsl.g:250:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalMyDsl.g:250:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalMyDsl.g:251:2: iv_ruleEntidade= ruleEntidade EOF
            {
             newCompositeNode(grammarAccess.getEntidadeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidade=ruleEntidade();

            state._fsp--;

             current =iv_ruleEntidade; 
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
    // $ANTLR end "entryRuleEntidade"


    // $ANTLR start "ruleEntidade"
    // InternalMyDsl.g:257:1: ruleEntidade returns [EObject current=null] : (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_atributo_4_0= ruleAtributo ) )+ otherlv_5= ']' otherlv_6= '}' ) ;
    public final EObject ruleEntidade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_nomeEntidade_1_0 = null;

        EObject lv_atributo_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:263:2: ( (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_atributo_4_0= ruleAtributo ) )+ otherlv_5= ']' otherlv_6= '}' ) )
            // InternalMyDsl.g:264:2: (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_atributo_4_0= ruleAtributo ) )+ otherlv_5= ']' otherlv_6= '}' )
            {
            // InternalMyDsl.g:264:2: (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_atributo_4_0= ruleAtributo ) )+ otherlv_5= ']' otherlv_6= '}' )
            // InternalMyDsl.g:265:3: otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' otherlv_3= '[' ( (lv_atributo_4_0= ruleAtributo ) )+ otherlv_5= ']' otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:269:3: ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) )
            // InternalMyDsl.g:270:4: (lv_nomeEntidade_1_0= ruleEntidadeNome )
            {
            // InternalMyDsl.g:270:4: (lv_nomeEntidade_1_0= ruleEntidadeNome )
            // InternalMyDsl.g:271:5: lv_nomeEntidade_1_0= ruleEntidadeNome
            {

            					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadeEntidadeNomeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_nomeEntidade_1_0=ruleEntidadeNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            					}
            					set(
            						current,
            						"nomeEntidade",
            						lv_nomeEntidade_1_0,
            						"org.xtext.tcc.mydsl.MyDsl.EntidadeNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getEntidadeAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMyDsl.g:296:3: ( (lv_atributo_4_0= ruleAtributo ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:297:4: (lv_atributo_4_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:297:4: (lv_atributo_4_0= ruleAtributo )
            	    // InternalMyDsl.g:298:5: lv_atributo_4_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributoAtributoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_atributo_4_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributo",
            	    						lv_atributo_4_0,
            	    						"org.xtext.tcc.mydsl.MyDsl.Atributo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEntidadeAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEntidade"


    // $ANTLR start "entryRuleEntidadeNome"
    // InternalMyDsl.g:327:1: entryRuleEntidadeNome returns [EObject current=null] : iv_ruleEntidadeNome= ruleEntidadeNome EOF ;
    public final EObject entryRuleEntidadeNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadeNome = null;


        try {
            // InternalMyDsl.g:327:53: (iv_ruleEntidadeNome= ruleEntidadeNome EOF )
            // InternalMyDsl.g:328:2: iv_ruleEntidadeNome= ruleEntidadeNome EOF
            {
             newCompositeNode(grammarAccess.getEntidadeNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidadeNome=ruleEntidadeNome();

            state._fsp--;

             current =iv_ruleEntidadeNome; 
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
    // $ANTLR end "entryRuleEntidadeNome"


    // $ANTLR start "ruleEntidadeNome"
    // InternalMyDsl.g:334:1: ruleEntidadeNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleEntidadeNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:340:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:341:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:341:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:342:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:342:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:343:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getEntidadeNomeAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntidadeNomeRule());
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
    // $ANTLR end "ruleEntidadeNome"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:362:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:362:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:363:2: iv_ruleAtributo= ruleAtributo EOF
            {
             newCompositeNode(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;

             current =iv_ruleAtributo; 
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
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalMyDsl.g:369:1: ruleAtributo returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacaoNome_8_0= ruleAssociacaoNome ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'mappedBy:' ( (lv_nomeEntidade_14_0= ruleEntidadeNome ) ) otherlv_15= ',' otherlv_16= 'JoinTable - nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns - nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns - nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_atributoNome_2_0 = null;

        EObject lv_atributoTipo_5_0 = null;

        EObject lv_associacaoNome_8_0 = null;

        EObject lv_operacao_11_0 = null;

        EObject lv_nomeEntidade_14_0 = null;

        EObject lv_tabelaNome_17_0 = null;

        EObject lv_colunaNome_20_0 = null;

        EObject lv_colunaNomeInverse_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:375:2: ( (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacaoNome_8_0= ruleAssociacaoNome ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'mappedBy:' ( (lv_nomeEntidade_14_0= ruleEntidadeNome ) ) otherlv_15= ',' otherlv_16= 'JoinTable - nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns - nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns - nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' ) )
            // InternalMyDsl.g:376:2: (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacaoNome_8_0= ruleAssociacaoNome ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'mappedBy:' ( (lv_nomeEntidade_14_0= ruleEntidadeNome ) ) otherlv_15= ',' otherlv_16= 'JoinTable - nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns - nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns - nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' )
            {
            // InternalMyDsl.g:376:2: (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacaoNome_8_0= ruleAssociacaoNome ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'mappedBy:' ( (lv_nomeEntidade_14_0= ruleEntidadeNome ) ) otherlv_15= ',' otherlv_16= 'JoinTable - nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns - nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns - nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' )
            // InternalMyDsl.g:377:3: otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacaoNome_8_0= ruleAssociacaoNome ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'mappedBy:' ( (lv_nomeEntidade_14_0= ruleEntidadeNome ) ) otherlv_15= ',' otherlv_16= 'JoinTable - nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns - nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns - nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
            		
            // InternalMyDsl.g:385:3: ( (lv_atributoNome_2_0= ruleAtributoNome ) )
            // InternalMyDsl.g:386:4: (lv_atributoNome_2_0= ruleAtributoNome )
            {
            // InternalMyDsl.g:386:4: (lv_atributoNome_2_0= ruleAtributoNome )
            // InternalMyDsl.g:387:5: lv_atributoNome_2_0= ruleAtributoNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNomeAtributoNomeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_atributoNome_2_0=ruleAtributoNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"atributoNome",
            						lv_atributoNome_2_0,
            						"org.xtext.tcc.mydsl.MyDsl.AtributoNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getAtributoAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getTipoKeyword_4());
            		
            // InternalMyDsl.g:412:3: ( (lv_atributoTipo_5_0= ruleAtributoTipo ) )
            // InternalMyDsl.g:413:4: (lv_atributoTipo_5_0= ruleAtributoTipo )
            {
            // InternalMyDsl.g:413:4: (lv_atributoTipo_5_0= ruleAtributoTipo )
            // InternalMyDsl.g:414:5: lv_atributoTipo_5_0= ruleAtributoTipo
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoTipoAtributoTipoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_atributoTipo_5_0=ruleAtributoTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"atributoTipo",
            						lv_atributoTipo_5_0,
            						"org.xtext.tcc.mydsl.MyDsl.AtributoTipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getAtributoAccess().getAssociaOKeyword_7());
            		
            // InternalMyDsl.g:439:3: ( (lv_associacaoNome_8_0= ruleAssociacaoNome ) )
            // InternalMyDsl.g:440:4: (lv_associacaoNome_8_0= ruleAssociacaoNome )
            {
            // InternalMyDsl.g:440:4: (lv_associacaoNome_8_0= ruleAssociacaoNome )
            // InternalMyDsl.g:441:5: lv_associacaoNome_8_0= ruleAssociacaoNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAssociacaoNomeAssociacaoNomeParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_associacaoNome_8_0=ruleAssociacaoNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"associacaoNome",
            						lv_associacaoNome_8_0,
            						"org.xtext.tcc.mydsl.MyDsl.AssociacaoNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getOperaOEmCascataKeyword_10());
            		
            // InternalMyDsl.g:466:3: ( (lv_operacao_11_0= ruleOperacao ) )
            // InternalMyDsl.g:467:4: (lv_operacao_11_0= ruleOperacao )
            {
            // InternalMyDsl.g:467:4: (lv_operacao_11_0= ruleOperacao )
            // InternalMyDsl.g:468:5: lv_operacao_11_0= ruleOperacao
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getOperacaoOperacaoParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_operacao_11_0=ruleOperacao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"operacao",
            						lv_operacao_11_0,
            						"org.xtext.tcc.mydsl.MyDsl.Operacao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getAtributoAccess().getMappedByKeyword_13());
            		
            // InternalMyDsl.g:493:3: ( (lv_nomeEntidade_14_0= ruleEntidadeNome ) )
            // InternalMyDsl.g:494:4: (lv_nomeEntidade_14_0= ruleEntidadeNome )
            {
            // InternalMyDsl.g:494:4: (lv_nomeEntidade_14_0= ruleEntidadeNome )
            // InternalMyDsl.g:495:5: lv_nomeEntidade_14_0= ruleEntidadeNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getNomeEntidadeEntidadeNomeParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_nomeEntidade_14_0=ruleEntidadeNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"nomeEntidade",
            						lv_nomeEntidade_14_0,
            						"org.xtext.tcc.mydsl.MyDsl.EntidadeNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_15, grammarAccess.getAtributoAccess().getCommaKeyword_15());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_16, grammarAccess.getAtributoAccess().getJoinTableNomeKeyword_16());
            		
            // InternalMyDsl.g:520:3: ( (lv_tabelaNome_17_0= ruleTabelaNome ) )
            // InternalMyDsl.g:521:4: (lv_tabelaNome_17_0= ruleTabelaNome )
            {
            // InternalMyDsl.g:521:4: (lv_tabelaNome_17_0= ruleTabelaNome )
            // InternalMyDsl.g:522:5: lv_tabelaNome_17_0= ruleTabelaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTabelaNomeTabelaNomeParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_11);
            lv_tabelaNome_17_0=ruleTabelaNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"tabelaNome",
            						lv_tabelaNome_17_0,
            						"org.xtext.tcc.mydsl.MyDsl.TabelaNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_18, grammarAccess.getAtributoAccess().getCommaKeyword_18());
            		
            otherlv_19=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getAtributoAccess().getJoinColumnsNomeKeyword_19());
            		
            // InternalMyDsl.g:547:3: ( (lv_colunaNome_20_0= ruleColunaNome ) )
            // InternalMyDsl.g:548:4: (lv_colunaNome_20_0= ruleColunaNome )
            {
            // InternalMyDsl.g:548:4: (lv_colunaNome_20_0= ruleColunaNome )
            // InternalMyDsl.g:549:5: lv_colunaNome_20_0= ruleColunaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeColunaNomeParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_11);
            lv_colunaNome_20_0=ruleColunaNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"colunaNome",
            						lv_colunaNome_20_0,
            						"org.xtext.tcc.mydsl.MyDsl.ColunaNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_21, grammarAccess.getAtributoAccess().getCommaKeyword_21());
            		
            otherlv_22=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getAtributoAccess().getInverseJoinColumnsNomeKeyword_22());
            		
            // InternalMyDsl.g:574:3: ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) )
            // InternalMyDsl.g:575:4: (lv_colunaNomeInverse_23_0= ruleColunaNome )
            {
            // InternalMyDsl.g:575:4: (lv_colunaNomeInverse_23_0= ruleColunaNome )
            // InternalMyDsl.g:576:5: lv_colunaNomeInverse_23_0= ruleColunaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeInverseColunaNomeParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_5);
            lv_colunaNomeInverse_23_0=ruleColunaNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"colunaNomeInverse",
            						lv_colunaNomeInverse_23_0,
            						"org.xtext.tcc.mydsl.MyDsl.ColunaNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_24());
            		

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleColunaNome"
    // InternalMyDsl.g:601:1: entryRuleColunaNome returns [EObject current=null] : iv_ruleColunaNome= ruleColunaNome EOF ;
    public final EObject entryRuleColunaNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColunaNome = null;


        try {
            // InternalMyDsl.g:601:51: (iv_ruleColunaNome= ruleColunaNome EOF )
            // InternalMyDsl.g:602:2: iv_ruleColunaNome= ruleColunaNome EOF
            {
             newCompositeNode(grammarAccess.getColunaNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColunaNome=ruleColunaNome();

            state._fsp--;

             current =iv_ruleColunaNome; 
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
    // $ANTLR end "entryRuleColunaNome"


    // $ANTLR start "ruleColunaNome"
    // InternalMyDsl.g:608:1: ruleColunaNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleColunaNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:614:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:615:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:615:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:616:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:616:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:617:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getColunaNomeAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColunaNomeRule());
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
    // $ANTLR end "ruleColunaNome"


    // $ANTLR start "entryRuleTabelaNome"
    // InternalMyDsl.g:636:1: entryRuleTabelaNome returns [EObject current=null] : iv_ruleTabelaNome= ruleTabelaNome EOF ;
    public final EObject entryRuleTabelaNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabelaNome = null;


        try {
            // InternalMyDsl.g:636:51: (iv_ruleTabelaNome= ruleTabelaNome EOF )
            // InternalMyDsl.g:637:2: iv_ruleTabelaNome= ruleTabelaNome EOF
            {
             newCompositeNode(grammarAccess.getTabelaNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTabelaNome=ruleTabelaNome();

            state._fsp--;

             current =iv_ruleTabelaNome; 
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
    // $ANTLR end "entryRuleTabelaNome"


    // $ANTLR start "ruleTabelaNome"
    // InternalMyDsl.g:643:1: ruleTabelaNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleTabelaNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:649:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:650:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:650:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:651:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:651:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:652:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getTabelaNomeAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTabelaNomeRule());
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
    // $ANTLR end "ruleTabelaNome"


    // $ANTLR start "entryRuleOperacao"
    // InternalMyDsl.g:671:1: entryRuleOperacao returns [EObject current=null] : iv_ruleOperacao= ruleOperacao EOF ;
    public final EObject entryRuleOperacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacao = null;


        try {
            // InternalMyDsl.g:671:49: (iv_ruleOperacao= ruleOperacao EOF )
            // InternalMyDsl.g:672:2: iv_ruleOperacao= ruleOperacao EOF
            {
             newCompositeNode(grammarAccess.getOperacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacao=ruleOperacao();

            state._fsp--;

             current =iv_ruleOperacao; 
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
    // $ANTLR end "entryRuleOperacao"


    // $ANTLR start "ruleOperacao"
    // InternalMyDsl.g:678:1: ruleOperacao returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleOperacao() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:684:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:685:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:685:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:686:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:686:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:687:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getOperacaoAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOperacaoRule());
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
    // $ANTLR end "ruleOperacao"


    // $ANTLR start "entryRuleAssociacaoNome"
    // InternalMyDsl.g:706:1: entryRuleAssociacaoNome returns [EObject current=null] : iv_ruleAssociacaoNome= ruleAssociacaoNome EOF ;
    public final EObject entryRuleAssociacaoNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociacaoNome = null;


        try {
            // InternalMyDsl.g:706:55: (iv_ruleAssociacaoNome= ruleAssociacaoNome EOF )
            // InternalMyDsl.g:707:2: iv_ruleAssociacaoNome= ruleAssociacaoNome EOF
            {
             newCompositeNode(grammarAccess.getAssociacaoNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociacaoNome=ruleAssociacaoNome();

            state._fsp--;

             current =iv_ruleAssociacaoNome; 
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
    // $ANTLR end "entryRuleAssociacaoNome"


    // $ANTLR start "ruleAssociacaoNome"
    // InternalMyDsl.g:713:1: ruleAssociacaoNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAssociacaoNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:719:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:720:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:720:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:721:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:721:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:722:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getAssociacaoNomeAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAssociacaoNomeRule());
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
    // $ANTLR end "ruleAssociacaoNome"


    // $ANTLR start "entryRuleAtributoNome"
    // InternalMyDsl.g:741:1: entryRuleAtributoNome returns [EObject current=null] : iv_ruleAtributoNome= ruleAtributoNome EOF ;
    public final EObject entryRuleAtributoNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoNome = null;


        try {
            // InternalMyDsl.g:741:53: (iv_ruleAtributoNome= ruleAtributoNome EOF )
            // InternalMyDsl.g:742:2: iv_ruleAtributoNome= ruleAtributoNome EOF
            {
             newCompositeNode(grammarAccess.getAtributoNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoNome=ruleAtributoNome();

            state._fsp--;

             current =iv_ruleAtributoNome; 
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
    // $ANTLR end "entryRuleAtributoNome"


    // $ANTLR start "ruleAtributoNome"
    // InternalMyDsl.g:748:1: ruleAtributoNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributoNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:754:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:755:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:755:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:756:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:756:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:757:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getAtributoNomeAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtributoNomeRule());
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
    // $ANTLR end "ruleAtributoNome"


    // $ANTLR start "entryRuleAtributoTipo"
    // InternalMyDsl.g:776:1: entryRuleAtributoTipo returns [EObject current=null] : iv_ruleAtributoTipo= ruleAtributoTipo EOF ;
    public final EObject entryRuleAtributoTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoTipo = null;


        try {
            // InternalMyDsl.g:776:53: (iv_ruleAtributoTipo= ruleAtributoTipo EOF )
            // InternalMyDsl.g:777:2: iv_ruleAtributoTipo= ruleAtributoTipo EOF
            {
             newCompositeNode(grammarAccess.getAtributoTipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributoTipo=ruleAtributoTipo();

            state._fsp--;

             current =iv_ruleAtributoTipo; 
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
    // $ANTLR end "entryRuleAtributoTipo"


    // $ANTLR start "ruleAtributoTipo"
    // InternalMyDsl.g:783:1: ruleAtributoTipo returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributoTipo() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:789:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:790:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:790:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:791:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:791:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:792:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getAtributoTipoAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAtributoTipoRule());
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
    // $ANTLR end "ruleAtributoTipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}