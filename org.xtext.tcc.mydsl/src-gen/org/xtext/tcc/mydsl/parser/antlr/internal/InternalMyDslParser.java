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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'{'", "'}'", "':'", "'nome-atributo:'", "','", "'tipo-atributo:'", "'associa\\u00E7\\u00E3o:'", "'opera\\u00E7\\u00E3o em cascata:'", "'optional:'", "'joinTable-nome:'", "'joinColumns-nome:'", "'inverseJoinColumns-nome:'", "'chave-primaria:'", "'ALL'", "'DETACH'", "'MERGE'", "'PERSIST'", "'REFRESH'", "'REMOVE'", "'OneToOne'", "'OneToMany'", "'ManyToOne'", "'ManyToMany'", "'true'", "'false'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
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
    // InternalMyDsl.g:153:1: ruleApi returns [EObject current=null] : ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' ( (lv_entidades_2_0= ruleEntidade ) )+ ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_nomeApi_0_0 = null;

        EObject lv_entidades_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:159:2: ( ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' ( (lv_entidades_2_0= ruleEntidade ) )+ ) )
            // InternalMyDsl.g:160:2: ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' ( (lv_entidades_2_0= ruleEntidade ) )+ )
            {
            // InternalMyDsl.g:160:2: ( ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' ( (lv_entidades_2_0= ruleEntidade ) )+ )
            // InternalMyDsl.g:161:3: ( (lv_nomeApi_0_0= ruleApiNome ) ) otherlv_1= ':' ( (lv_entidades_2_0= ruleEntidade ) )+
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
            		
            // InternalMyDsl.g:184:3: ( (lv_entidades_2_0= ruleEntidade ) )+
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
            	    // InternalMyDsl.g:185:4: (lv_entidades_2_0= ruleEntidade )
            	    {
            	    // InternalMyDsl.g:185:4: (lv_entidades_2_0= ruleEntidade )
            	    // InternalMyDsl.g:186:5: lv_entidades_2_0= ruleEntidade
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entidades_2_0=ruleEntidade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_2_0,
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
    // InternalMyDsl.g:207:1: entryRuleApiNome returns [EObject current=null] : iv_ruleApiNome= ruleApiNome EOF ;
    public final EObject entryRuleApiNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiNome = null;


        try {
            // InternalMyDsl.g:207:48: (iv_ruleApiNome= ruleApiNome EOF )
            // InternalMyDsl.g:208:2: iv_ruleApiNome= ruleApiNome EOF
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
    // InternalMyDsl.g:214:1: ruleApiNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleApiNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:220:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:221:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:221:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:222:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:222:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:223:4: lv_id_0_0= RULE_ID
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
    // InternalMyDsl.g:242:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalMyDsl.g:242:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalMyDsl.g:243:2: iv_ruleEntidade= ruleEntidade EOF
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
    // InternalMyDsl.g:249:1: ruleEntidade returns [EObject current=null] : (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' ( (lv_atributo_3_0= ruleAtributo ) )+ otherlv_4= '}' ) ;
    public final EObject ruleEntidade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_nomeEntidade_1_0 = null;

        EObject lv_atributo_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' ( (lv_atributo_3_0= ruleAtributo ) )+ otherlv_4= '}' ) )
            // InternalMyDsl.g:256:2: (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' ( (lv_atributo_3_0= ruleAtributo ) )+ otherlv_4= '}' )
            {
            // InternalMyDsl.g:256:2: (otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' ( (lv_atributo_3_0= ruleAtributo ) )+ otherlv_4= '}' )
            // InternalMyDsl.g:257:3: otherlv_0= '{' ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) ) otherlv_2= ':' ( (lv_atributo_3_0= ruleAtributo ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:261:3: ( (lv_nomeEntidade_1_0= ruleEntidadeNome ) )
            // InternalMyDsl.g:262:4: (lv_nomeEntidade_1_0= ruleEntidadeNome )
            {
            // InternalMyDsl.g:262:4: (lv_nomeEntidade_1_0= ruleEntidadeNome )
            // InternalMyDsl.g:263:5: lv_nomeEntidade_1_0= ruleEntidadeNome
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
            		
            // InternalMyDsl.g:284:3: ( (lv_atributo_3_0= ruleAtributo ) )+
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
            	    // InternalMyDsl.g:285:4: (lv_atributo_3_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:285:4: (lv_atributo_3_0= ruleAtributo )
            	    // InternalMyDsl.g:286:5: lv_atributo_3_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributoAtributoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_atributo_3_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributo",
            	    						lv_atributo_3_0,
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

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalMyDsl.g:311:1: entryRuleEntidadeNome returns [EObject current=null] : iv_ruleEntidadeNome= ruleEntidadeNome EOF ;
    public final EObject entryRuleEntidadeNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadeNome = null;


        try {
            // InternalMyDsl.g:311:53: (iv_ruleEntidadeNome= ruleEntidadeNome EOF )
            // InternalMyDsl.g:312:2: iv_ruleEntidadeNome= ruleEntidadeNome EOF
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
    // InternalMyDsl.g:318:1: ruleEntidadeNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleEntidadeNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:324:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:325:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:325:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:326:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:326:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:327:4: lv_id_0_0= RULE_ID
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
    // InternalMyDsl.g:346:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:346:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:347:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:353:1: ruleAtributo returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo-atributo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacao_8_0= ruleAssociacao ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'optional:' ( (lv_optional_14_0= ruleOptional ) ) otherlv_15= ',' otherlv_16= 'joinTable-nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns-nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns-nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' otherlv_25= 'chave-primaria:' ( (lv_chavePrimaria_26_0= ruleChavePrimaria ) ) ) ;
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
        Token otherlv_25=null;
        EObject lv_atributoNome_2_0 = null;

        EObject lv_atributoTipo_5_0 = null;

        EObject lv_associacao_8_0 = null;

        EObject lv_operacao_11_0 = null;

        EObject lv_optional_14_0 = null;

        EObject lv_tabelaNome_17_0 = null;

        EObject lv_colunaNome_20_0 = null;

        EObject lv_colunaNomeInverse_23_0 = null;

        EObject lv_chavePrimaria_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:359:2: ( (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo-atributo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacao_8_0= ruleAssociacao ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'optional:' ( (lv_optional_14_0= ruleOptional ) ) otherlv_15= ',' otherlv_16= 'joinTable-nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns-nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns-nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' otherlv_25= 'chave-primaria:' ( (lv_chavePrimaria_26_0= ruleChavePrimaria ) ) ) )
            // InternalMyDsl.g:360:2: (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo-atributo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacao_8_0= ruleAssociacao ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'optional:' ( (lv_optional_14_0= ruleOptional ) ) otherlv_15= ',' otherlv_16= 'joinTable-nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns-nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns-nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' otherlv_25= 'chave-primaria:' ( (lv_chavePrimaria_26_0= ruleChavePrimaria ) ) )
            {
            // InternalMyDsl.g:360:2: (otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo-atributo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacao_8_0= ruleAssociacao ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'optional:' ( (lv_optional_14_0= ruleOptional ) ) otherlv_15= ',' otherlv_16= 'joinTable-nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns-nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns-nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' otherlv_25= 'chave-primaria:' ( (lv_chavePrimaria_26_0= ruleChavePrimaria ) ) )
            // InternalMyDsl.g:361:3: otherlv_0= '{' otherlv_1= 'nome-atributo:' ( (lv_atributoNome_2_0= ruleAtributoNome ) ) otherlv_3= ',' otherlv_4= 'tipo-atributo:' ( (lv_atributoTipo_5_0= ruleAtributoTipo ) ) otherlv_6= ',' otherlv_7= 'associa\\u00E7\\u00E3o:' ( (lv_associacao_8_0= ruleAssociacao ) ) otherlv_9= ',' otherlv_10= 'opera\\u00E7\\u00E3o em cascata:' ( (lv_operacao_11_0= ruleOperacao ) ) otherlv_12= ',' otherlv_13= 'optional:' ( (lv_optional_14_0= ruleOptional ) ) otherlv_15= ',' otherlv_16= 'joinTable-nome:' ( (lv_tabelaNome_17_0= ruleTabelaNome ) ) otherlv_18= ',' otherlv_19= 'joinColumns-nome:' ( (lv_colunaNome_20_0= ruleColunaNome ) ) otherlv_21= ',' otherlv_22= 'inverseJoinColumns-nome:' ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) ) otherlv_24= '}' otherlv_25= 'chave-primaria:' ( (lv_chavePrimaria_26_0= ruleChavePrimaria ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
            		
            // InternalMyDsl.g:369:3: ( (lv_atributoNome_2_0= ruleAtributoNome ) )
            // InternalMyDsl.g:370:4: (lv_atributoNome_2_0= ruleAtributoNome )
            {
            // InternalMyDsl.g:370:4: (lv_atributoNome_2_0= ruleAtributoNome )
            // InternalMyDsl.g:371:5: lv_atributoNome_2_0= ruleAtributoNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNomeAtributoNomeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_3=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getAtributoAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getTipoAtributoKeyword_4());
            		
            // InternalMyDsl.g:396:3: ( (lv_atributoTipo_5_0= ruleAtributoTipo ) )
            // InternalMyDsl.g:397:4: (lv_atributoTipo_5_0= ruleAtributoTipo )
            {
            // InternalMyDsl.g:397:4: (lv_atributoTipo_5_0= ruleAtributoTipo )
            // InternalMyDsl.g:398:5: lv_atributoTipo_5_0= ruleAtributoTipo
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoTipoAtributoTipoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_6=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getAtributoAccess().getAssociaOKeyword_7());
            		
            // InternalMyDsl.g:423:3: ( (lv_associacao_8_0= ruleAssociacao ) )
            // InternalMyDsl.g:424:4: (lv_associacao_8_0= ruleAssociacao )
            {
            // InternalMyDsl.g:424:4: (lv_associacao_8_0= ruleAssociacao )
            // InternalMyDsl.g:425:5: lv_associacao_8_0= ruleAssociacao
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAssociacaoAssociacaoParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_10);
            lv_associacao_8_0=ruleAssociacao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"associacao",
            						lv_associacao_8_0,
            						"org.xtext.tcc.mydsl.MyDsl.Associacao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getOperaOEmCascataKeyword_10());
            		
            // InternalMyDsl.g:450:3: ( (lv_operacao_11_0= ruleOperacao ) )
            // InternalMyDsl.g:451:4: (lv_operacao_11_0= ruleOperacao )
            {
            // InternalMyDsl.g:451:4: (lv_operacao_11_0= ruleOperacao )
            // InternalMyDsl.g:452:5: lv_operacao_11_0= ruleOperacao
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getOperacaoOperacaoParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_12=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getAtributoAccess().getOptionalKeyword_13());
            		
            // InternalMyDsl.g:477:3: ( (lv_optional_14_0= ruleOptional ) )
            // InternalMyDsl.g:478:4: (lv_optional_14_0= ruleOptional )
            {
            // InternalMyDsl.g:478:4: (lv_optional_14_0= ruleOptional )
            // InternalMyDsl.g:479:5: lv_optional_14_0= ruleOptional
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getOptionalOptionalParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_10);
            lv_optional_14_0=ruleOptional();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"optional",
            						lv_optional_14_0,
            						"org.xtext.tcc.mydsl.MyDsl.Optional");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getAtributoAccess().getCommaKeyword_15());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_16, grammarAccess.getAtributoAccess().getJoinTableNomeKeyword_16());
            		
            // InternalMyDsl.g:504:3: ( (lv_tabelaNome_17_0= ruleTabelaNome ) )
            // InternalMyDsl.g:505:4: (lv_tabelaNome_17_0= ruleTabelaNome )
            {
            // InternalMyDsl.g:505:4: (lv_tabelaNome_17_0= ruleTabelaNome )
            // InternalMyDsl.g:506:5: lv_tabelaNome_17_0= ruleTabelaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTabelaNomeTabelaNomeParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_18=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_18, grammarAccess.getAtributoAccess().getCommaKeyword_18());
            		
            otherlv_19=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_19, grammarAccess.getAtributoAccess().getJoinColumnsNomeKeyword_19());
            		
            // InternalMyDsl.g:531:3: ( (lv_colunaNome_20_0= ruleColunaNome ) )
            // InternalMyDsl.g:532:4: (lv_colunaNome_20_0= ruleColunaNome )
            {
            // InternalMyDsl.g:532:4: (lv_colunaNome_20_0= ruleColunaNome )
            // InternalMyDsl.g:533:5: lv_colunaNome_20_0= ruleColunaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeColunaNomeParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_21=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_21, grammarAccess.getAtributoAccess().getCommaKeyword_21());
            		
            otherlv_22=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_22, grammarAccess.getAtributoAccess().getInverseJoinColumnsNomeKeyword_22());
            		
            // InternalMyDsl.g:558:3: ( (lv_colunaNomeInverse_23_0= ruleColunaNome ) )
            // InternalMyDsl.g:559:4: (lv_colunaNomeInverse_23_0= ruleColunaNome )
            {
            // InternalMyDsl.g:559:4: (lv_colunaNomeInverse_23_0= ruleColunaNome )
            // InternalMyDsl.g:560:5: lv_colunaNomeInverse_23_0= ruleColunaNome
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

            otherlv_24=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_24, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_24());
            		
            otherlv_25=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_25, grammarAccess.getAtributoAccess().getChavePrimariaKeyword_25());
            		
            // InternalMyDsl.g:585:3: ( (lv_chavePrimaria_26_0= ruleChavePrimaria ) )
            // InternalMyDsl.g:586:4: (lv_chavePrimaria_26_0= ruleChavePrimaria )
            {
            // InternalMyDsl.g:586:4: (lv_chavePrimaria_26_0= ruleChavePrimaria )
            // InternalMyDsl.g:587:5: lv_chavePrimaria_26_0= ruleChavePrimaria
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getChavePrimariaChavePrimariaParserRuleCall_26_0());
            				
            pushFollow(FOLLOW_2);
            lv_chavePrimaria_26_0=ruleChavePrimaria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"chavePrimaria",
            						lv_chavePrimaria_26_0,
            						"org.xtext.tcc.mydsl.MyDsl.ChavePrimaria");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleColunaNome"
    // InternalMyDsl.g:608:1: entryRuleColunaNome returns [EObject current=null] : iv_ruleColunaNome= ruleColunaNome EOF ;
    public final EObject entryRuleColunaNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColunaNome = null;


        try {
            // InternalMyDsl.g:608:51: (iv_ruleColunaNome= ruleColunaNome EOF )
            // InternalMyDsl.g:609:2: iv_ruleColunaNome= ruleColunaNome EOF
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
    // InternalMyDsl.g:615:1: ruleColunaNome returns [EObject current=null] : ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleColunaNome() throws RecognitionException {
        EObject current = null;

        Token lv_colunaNome_0_0=null;
        Token lv_colunaNome_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:621:2: ( ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:622:2: ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:622:2: ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ANY_OTHER) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:623:3: ( (lv_colunaNome_0_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:623:3: ( (lv_colunaNome_0_0= RULE_ID ) )
                    // InternalMyDsl.g:624:4: (lv_colunaNome_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:624:4: (lv_colunaNome_0_0= RULE_ID )
                    // InternalMyDsl.g:625:5: lv_colunaNome_0_0= RULE_ID
                    {
                    lv_colunaNome_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_colunaNome_0_0, grammarAccess.getColunaNomeAccess().getColunaNomeIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColunaNomeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"colunaNome",
                    						lv_colunaNome_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:642:3: ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:642:3: ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:643:4: (lv_colunaNome_1_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:643:4: (lv_colunaNome_1_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:644:5: lv_colunaNome_1_0= RULE_ANY_OTHER
                    {
                    lv_colunaNome_1_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    					newLeafNode(lv_colunaNome_1_0, grammarAccess.getColunaNomeAccess().getColunaNomeANY_OTHERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColunaNomeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"colunaNome",
                    						lv_colunaNome_1_0,
                    						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
                    				

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
    // $ANTLR end "ruleColunaNome"


    // $ANTLR start "entryRuleTabelaNome"
    // InternalMyDsl.g:664:1: entryRuleTabelaNome returns [EObject current=null] : iv_ruleTabelaNome= ruleTabelaNome EOF ;
    public final EObject entryRuleTabelaNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabelaNome = null;


        try {
            // InternalMyDsl.g:664:51: (iv_ruleTabelaNome= ruleTabelaNome EOF )
            // InternalMyDsl.g:665:2: iv_ruleTabelaNome= ruleTabelaNome EOF
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
    // InternalMyDsl.g:671:1: ruleTabelaNome returns [EObject current=null] : ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleTabelaNome() throws RecognitionException {
        EObject current = null;

        Token lv_tabelaNome_0_0=null;
        Token lv_tabelaNome_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:677:2: ( ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:678:2: ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:678:2: ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ANY_OTHER) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:679:3: ( (lv_tabelaNome_0_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:679:3: ( (lv_tabelaNome_0_0= RULE_ID ) )
                    // InternalMyDsl.g:680:4: (lv_tabelaNome_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:680:4: (lv_tabelaNome_0_0= RULE_ID )
                    // InternalMyDsl.g:681:5: lv_tabelaNome_0_0= RULE_ID
                    {
                    lv_tabelaNome_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_tabelaNome_0_0, grammarAccess.getTabelaNomeAccess().getTabelaNomeIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTabelaNomeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tabelaNome",
                    						lv_tabelaNome_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:698:3: ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:698:3: ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:699:4: (lv_tabelaNome_1_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:699:4: (lv_tabelaNome_1_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:700:5: lv_tabelaNome_1_0= RULE_ANY_OTHER
                    {
                    lv_tabelaNome_1_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    					newLeafNode(lv_tabelaNome_1_0, grammarAccess.getTabelaNomeAccess().getTabelaNomeANY_OTHERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTabelaNomeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tabelaNome",
                    						lv_tabelaNome_1_0,
                    						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
                    				

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
    // $ANTLR end "ruleTabelaNome"


    // $ANTLR start "entryRuleOperacao"
    // InternalMyDsl.g:720:1: entryRuleOperacao returns [EObject current=null] : iv_ruleOperacao= ruleOperacao EOF ;
    public final EObject entryRuleOperacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacao = null;


        try {
            // InternalMyDsl.g:720:49: (iv_ruleOperacao= ruleOperacao EOF )
            // InternalMyDsl.g:721:2: iv_ruleOperacao= ruleOperacao EOF
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
    // InternalMyDsl.g:727:1: ruleOperacao returns [EObject current=null] : ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) | ( (lv_opCascada_6_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleOperacao() throws RecognitionException {
        EObject current = null;

        Token lv_opCascada_0_0=null;
        Token lv_opCascada_1_0=null;
        Token lv_opCascada_2_0=null;
        Token lv_opCascada_3_0=null;
        Token lv_opCascada_4_0=null;
        Token lv_opCascada_5_0=null;
        Token lv_opCascada_6_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:733:2: ( ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) | ( (lv_opCascada_6_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:734:2: ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) | ( (lv_opCascada_6_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:734:2: ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) | ( (lv_opCascada_6_0= RULE_ANY_OTHER ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            case 28:
                {
                alt6=5;
                }
                break;
            case 29:
                {
                alt6=6;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:735:3: ( (lv_opCascada_0_0= 'ALL' ) )
                    {
                    // InternalMyDsl.g:735:3: ( (lv_opCascada_0_0= 'ALL' ) )
                    // InternalMyDsl.g:736:4: (lv_opCascada_0_0= 'ALL' )
                    {
                    // InternalMyDsl.g:736:4: (lv_opCascada_0_0= 'ALL' )
                    // InternalMyDsl.g:737:5: lv_opCascada_0_0= 'ALL'
                    {
                    lv_opCascada_0_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_0_0, grammarAccess.getOperacaoAccess().getOpCascadaALLKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_0_0, "ALL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:750:3: ( (lv_opCascada_1_0= 'DETACH' ) )
                    {
                    // InternalMyDsl.g:750:3: ( (lv_opCascada_1_0= 'DETACH' ) )
                    // InternalMyDsl.g:751:4: (lv_opCascada_1_0= 'DETACH' )
                    {
                    // InternalMyDsl.g:751:4: (lv_opCascada_1_0= 'DETACH' )
                    // InternalMyDsl.g:752:5: lv_opCascada_1_0= 'DETACH'
                    {
                    lv_opCascada_1_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_1_0, grammarAccess.getOperacaoAccess().getOpCascadaDETACHKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_1_0, "DETACH");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:765:3: ( (lv_opCascada_2_0= 'MERGE' ) )
                    {
                    // InternalMyDsl.g:765:3: ( (lv_opCascada_2_0= 'MERGE' ) )
                    // InternalMyDsl.g:766:4: (lv_opCascada_2_0= 'MERGE' )
                    {
                    // InternalMyDsl.g:766:4: (lv_opCascada_2_0= 'MERGE' )
                    // InternalMyDsl.g:767:5: lv_opCascada_2_0= 'MERGE'
                    {
                    lv_opCascada_2_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_2_0, grammarAccess.getOperacaoAccess().getOpCascadaMERGEKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_2_0, "MERGE");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:780:3: ( (lv_opCascada_3_0= 'PERSIST' ) )
                    {
                    // InternalMyDsl.g:780:3: ( (lv_opCascada_3_0= 'PERSIST' ) )
                    // InternalMyDsl.g:781:4: (lv_opCascada_3_0= 'PERSIST' )
                    {
                    // InternalMyDsl.g:781:4: (lv_opCascada_3_0= 'PERSIST' )
                    // InternalMyDsl.g:782:5: lv_opCascada_3_0= 'PERSIST'
                    {
                    lv_opCascada_3_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_3_0, grammarAccess.getOperacaoAccess().getOpCascadaPERSISTKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_3_0, "PERSIST");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:795:3: ( (lv_opCascada_4_0= 'REFRESH' ) )
                    {
                    // InternalMyDsl.g:795:3: ( (lv_opCascada_4_0= 'REFRESH' ) )
                    // InternalMyDsl.g:796:4: (lv_opCascada_4_0= 'REFRESH' )
                    {
                    // InternalMyDsl.g:796:4: (lv_opCascada_4_0= 'REFRESH' )
                    // InternalMyDsl.g:797:5: lv_opCascada_4_0= 'REFRESH'
                    {
                    lv_opCascada_4_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_4_0, grammarAccess.getOperacaoAccess().getOpCascadaREFRESHKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_4_0, "REFRESH");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:810:3: ( (lv_opCascada_5_0= 'REMOVE' ) )
                    {
                    // InternalMyDsl.g:810:3: ( (lv_opCascada_5_0= 'REMOVE' ) )
                    // InternalMyDsl.g:811:4: (lv_opCascada_5_0= 'REMOVE' )
                    {
                    // InternalMyDsl.g:811:4: (lv_opCascada_5_0= 'REMOVE' )
                    // InternalMyDsl.g:812:5: lv_opCascada_5_0= 'REMOVE'
                    {
                    lv_opCascada_5_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_5_0, grammarAccess.getOperacaoAccess().getOpCascadaREMOVEKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_5_0, "REMOVE");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:825:3: ( (lv_opCascada_6_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:825:3: ( (lv_opCascada_6_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:826:4: (lv_opCascada_6_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:826:4: (lv_opCascada_6_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:827:5: lv_opCascada_6_0= RULE_ANY_OTHER
                    {
                    lv_opCascada_6_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_6_0, grammarAccess.getOperacaoAccess().getOpCascadaANY_OTHERTerminalRuleCall_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"opCascada",
                    						lv_opCascada_6_0,
                    						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
                    				

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
    // $ANTLR end "ruleOperacao"


    // $ANTLR start "entryRuleAssociacao"
    // InternalMyDsl.g:847:1: entryRuleAssociacao returns [EObject current=null] : iv_ruleAssociacao= ruleAssociacao EOF ;
    public final EObject entryRuleAssociacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociacao = null;


        try {
            // InternalMyDsl.g:847:51: (iv_ruleAssociacao= ruleAssociacao EOF )
            // InternalMyDsl.g:848:2: iv_ruleAssociacao= ruleAssociacao EOF
            {
             newCompositeNode(grammarAccess.getAssociacaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociacao=ruleAssociacao();

            state._fsp--;

             current =iv_ruleAssociacao; 
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
    // $ANTLR end "entryRuleAssociacao"


    // $ANTLR start "ruleAssociacao"
    // InternalMyDsl.g:854:1: ruleAssociacao returns [EObject current=null] : ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) | ( (lv_associacao_4_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleAssociacao() throws RecognitionException {
        EObject current = null;

        Token lv_associacao_0_0=null;
        Token lv_associacao_1_0=null;
        Token lv_associacao_2_0=null;
        Token lv_associacao_3_0=null;
        Token lv_associacao_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:860:2: ( ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) | ( (lv_associacao_4_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:861:2: ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) | ( (lv_associacao_4_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:861:2: ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) | ( (lv_associacao_4_0= RULE_ANY_OTHER ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 33:
                {
                alt7=4;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:862:3: ( (lv_associacao_0_0= 'OneToOne' ) )
                    {
                    // InternalMyDsl.g:862:3: ( (lv_associacao_0_0= 'OneToOne' ) )
                    // InternalMyDsl.g:863:4: (lv_associacao_0_0= 'OneToOne' )
                    {
                    // InternalMyDsl.g:863:4: (lv_associacao_0_0= 'OneToOne' )
                    // InternalMyDsl.g:864:5: lv_associacao_0_0= 'OneToOne'
                    {
                    lv_associacao_0_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_associacao_0_0, grammarAccess.getAssociacaoAccess().getAssociacaoOneToOneKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociacaoRule());
                    					}
                    					setWithLastConsumed(current, "associacao", lv_associacao_0_0, "OneToOne");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:877:3: ( (lv_associacao_1_0= 'OneToMany' ) )
                    {
                    // InternalMyDsl.g:877:3: ( (lv_associacao_1_0= 'OneToMany' ) )
                    // InternalMyDsl.g:878:4: (lv_associacao_1_0= 'OneToMany' )
                    {
                    // InternalMyDsl.g:878:4: (lv_associacao_1_0= 'OneToMany' )
                    // InternalMyDsl.g:879:5: lv_associacao_1_0= 'OneToMany'
                    {
                    lv_associacao_1_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_associacao_1_0, grammarAccess.getAssociacaoAccess().getAssociacaoOneToManyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociacaoRule());
                    					}
                    					setWithLastConsumed(current, "associacao", lv_associacao_1_0, "OneToMany");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:892:3: ( (lv_associacao_2_0= 'ManyToOne' ) )
                    {
                    // InternalMyDsl.g:892:3: ( (lv_associacao_2_0= 'ManyToOne' ) )
                    // InternalMyDsl.g:893:4: (lv_associacao_2_0= 'ManyToOne' )
                    {
                    // InternalMyDsl.g:893:4: (lv_associacao_2_0= 'ManyToOne' )
                    // InternalMyDsl.g:894:5: lv_associacao_2_0= 'ManyToOne'
                    {
                    lv_associacao_2_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_associacao_2_0, grammarAccess.getAssociacaoAccess().getAssociacaoManyToOneKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociacaoRule());
                    					}
                    					setWithLastConsumed(current, "associacao", lv_associacao_2_0, "ManyToOne");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:907:3: ( (lv_associacao_3_0= 'ManyToMany' ) )
                    {
                    // InternalMyDsl.g:907:3: ( (lv_associacao_3_0= 'ManyToMany' ) )
                    // InternalMyDsl.g:908:4: (lv_associacao_3_0= 'ManyToMany' )
                    {
                    // InternalMyDsl.g:908:4: (lv_associacao_3_0= 'ManyToMany' )
                    // InternalMyDsl.g:909:5: lv_associacao_3_0= 'ManyToMany'
                    {
                    lv_associacao_3_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_associacao_3_0, grammarAccess.getAssociacaoAccess().getAssociacaoManyToManyKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociacaoRule());
                    					}
                    					setWithLastConsumed(current, "associacao", lv_associacao_3_0, "ManyToMany");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:922:3: ( (lv_associacao_4_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:922:3: ( (lv_associacao_4_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:923:4: (lv_associacao_4_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:923:4: (lv_associacao_4_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:924:5: lv_associacao_4_0= RULE_ANY_OTHER
                    {
                    lv_associacao_4_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    					newLeafNode(lv_associacao_4_0, grammarAccess.getAssociacaoAccess().getAssociacaoANY_OTHERTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociacaoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"associacao",
                    						lv_associacao_4_0,
                    						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
                    				

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
    // $ANTLR end "ruleAssociacao"


    // $ANTLR start "entryRuleAtributoNome"
    // InternalMyDsl.g:944:1: entryRuleAtributoNome returns [EObject current=null] : iv_ruleAtributoNome= ruleAtributoNome EOF ;
    public final EObject entryRuleAtributoNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoNome = null;


        try {
            // InternalMyDsl.g:944:53: (iv_ruleAtributoNome= ruleAtributoNome EOF )
            // InternalMyDsl.g:945:2: iv_ruleAtributoNome= ruleAtributoNome EOF
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
    // InternalMyDsl.g:951:1: ruleAtributoNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributoNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:957:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:958:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:958:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:959:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:959:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:960:4: lv_id_0_0= RULE_ID
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
    // InternalMyDsl.g:979:1: entryRuleAtributoTipo returns [EObject current=null] : iv_ruleAtributoTipo= ruleAtributoTipo EOF ;
    public final EObject entryRuleAtributoTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoTipo = null;


        try {
            // InternalMyDsl.g:979:53: (iv_ruleAtributoTipo= ruleAtributoTipo EOF )
            // InternalMyDsl.g:980:2: iv_ruleAtributoTipo= ruleAtributoTipo EOF
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
    // InternalMyDsl.g:986:1: ruleAtributoTipo returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributoTipo() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:992:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:993:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:993:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:994:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:994:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:995:4: lv_id_0_0= RULE_ID
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


    // $ANTLR start "entryRuleOptional"
    // InternalMyDsl.g:1014:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // InternalMyDsl.g:1014:49: (iv_ruleOptional= ruleOptional EOF )
            // InternalMyDsl.g:1015:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // InternalMyDsl.g:1021:1: ruleOptional returns [EObject current=null] : ( ( (lv_optional_0_0= 'true' ) ) | ( (lv_optional_1_0= 'false' ) ) | ( (lv_optional_2_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token lv_optional_0_0=null;
        Token lv_optional_1_0=null;
        Token lv_optional_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1027:2: ( ( ( (lv_optional_0_0= 'true' ) ) | ( (lv_optional_1_0= 'false' ) ) | ( (lv_optional_2_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:1028:2: ( ( (lv_optional_0_0= 'true' ) ) | ( (lv_optional_1_0= 'false' ) ) | ( (lv_optional_2_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:1028:2: ( ( (lv_optional_0_0= 'true' ) ) | ( (lv_optional_1_0= 'false' ) ) | ( (lv_optional_2_0= RULE_ANY_OTHER ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 35:
                {
                alt8=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1029:3: ( (lv_optional_0_0= 'true' ) )
                    {
                    // InternalMyDsl.g:1029:3: ( (lv_optional_0_0= 'true' ) )
                    // InternalMyDsl.g:1030:4: (lv_optional_0_0= 'true' )
                    {
                    // InternalMyDsl.g:1030:4: (lv_optional_0_0= 'true' )
                    // InternalMyDsl.g:1031:5: lv_optional_0_0= 'true'
                    {
                    lv_optional_0_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_optional_0_0, grammarAccess.getOptionalAccess().getOptionalTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOptionalRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1044:3: ( (lv_optional_1_0= 'false' ) )
                    {
                    // InternalMyDsl.g:1044:3: ( (lv_optional_1_0= 'false' ) )
                    // InternalMyDsl.g:1045:4: (lv_optional_1_0= 'false' )
                    {
                    // InternalMyDsl.g:1045:4: (lv_optional_1_0= 'false' )
                    // InternalMyDsl.g:1046:5: lv_optional_1_0= 'false'
                    {
                    lv_optional_1_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_optional_1_0, grammarAccess.getOptionalAccess().getOptionalFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOptionalRule());
                    					}
                    					setWithLastConsumed(current, "optional", lv_optional_1_0, "false");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1059:3: ( (lv_optional_2_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:1059:3: ( (lv_optional_2_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:1060:4: (lv_optional_2_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:1060:4: (lv_optional_2_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:1061:5: lv_optional_2_0= RULE_ANY_OTHER
                    {
                    lv_optional_2_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    					newLeafNode(lv_optional_2_0, grammarAccess.getOptionalAccess().getOptionalANY_OTHERTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOptionalRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"optional",
                    						lv_optional_2_0,
                    						"org.eclipse.xtext.common.Terminals.ANY_OTHER");
                    				

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
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleChavePrimaria"
    // InternalMyDsl.g:1081:1: entryRuleChavePrimaria returns [EObject current=null] : iv_ruleChavePrimaria= ruleChavePrimaria EOF ;
    public final EObject entryRuleChavePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChavePrimaria = null;


        try {
            // InternalMyDsl.g:1081:54: (iv_ruleChavePrimaria= ruleChavePrimaria EOF )
            // InternalMyDsl.g:1082:2: iv_ruleChavePrimaria= ruleChavePrimaria EOF
            {
             newCompositeNode(grammarAccess.getChavePrimariaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChavePrimaria=ruleChavePrimaria();

            state._fsp--;

             current =iv_ruleChavePrimaria; 
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
    // $ANTLR end "entryRuleChavePrimaria"


    // $ANTLR start "ruleChavePrimaria"
    // InternalMyDsl.g:1088:1: ruleChavePrimaria returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleChavePrimaria() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1094:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1095:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1095:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:1096:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1096:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:1097:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getChavePrimariaAccess().getIdIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getChavePrimariaRule());
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
    // $ANTLR end "ruleChavePrimaria"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003C0000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003F000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000C00000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});

}