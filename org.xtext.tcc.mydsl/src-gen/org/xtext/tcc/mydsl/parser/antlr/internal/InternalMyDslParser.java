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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'{'", "'}'", "'\"Nome da Api\"'", "':'", "','", "'\"Entidades\"'", "'['", "']'", "'\"Nome\"'", "'\"Atributos\"'", "'\"Chave Primaria\"'", "'\"nome-atributo\"'", "'\"tipo-atributo\"'", "'\"associa\\u00E7\\u00E3o\"'", "'\"opera\\u00E7\\u00E3o em cascata\"'", "'\"joinTable-nome\"'", "'\"joinColumns-nome\"'", "'\"inverseJoinColumns-nome\"'", "'ALL'", "'DETACH'", "'MERGE'", "'PERSIST'", "'REFRESH'", "'REMOVE'", "'OneToOne'", "'OneToMany'", "'ManyToOne'", "'ManyToMany'", "'Boolean'", "'Byte'", "'Short'", "'Character'", "'Integer'", "'Long'", "'String'", "'Float'", "'Double'", "'Time'", "'Timestamp'", "'Date'", "'ENUM'", "'ArrayList'", "'HashSet'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) ) )
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )
            {
            // InternalMyDsl.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )
            // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            {
            // InternalMyDsl.g:79:3: (lv_greetings_0_0= ruleGreeting )
            // InternalMyDsl.g:80:4: lv_greetings_0_0= ruleGreeting
            {

            				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
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
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_api_1_0= ruleApi ) )
            // InternalMyDsl.g:120:4: (lv_api_1_0= ruleApi )
            {
            // InternalMyDsl.g:120:4: (lv_api_1_0= ruleApi )
            // InternalMyDsl.g:121:5: lv_api_1_0= ruleApi
            {

            					newCompositeNode(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:153:1: ruleApi returns [EObject current=null] : (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' ) ;
    public final EObject ruleApi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_nomeApi_2_0 = null;

        EObject lv_entidades_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:159:2: ( (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' ) )
            // InternalMyDsl.g:160:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' )
            {
            // InternalMyDsl.g:160:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' )
            // InternalMyDsl.g:161:3: otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getApiAccess().getNomeDaApiKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:169:3: ( (lv_nomeApi_2_0= ruleApiNome ) )
            // InternalMyDsl.g:170:4: (lv_nomeApi_2_0= ruleApiNome )
            {
            // InternalMyDsl.g:170:4: (lv_nomeApi_2_0= ruleApiNome )
            // InternalMyDsl.g:171:5: lv_nomeApi_2_0= ruleApiNome
            {

            					newCompositeNode(grammarAccess.getApiAccess().getNomeApiApiNomeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_nomeApi_2_0=ruleApiNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"nomeApi",
            						lv_nomeApi_2_0,
            						"org.xtext.tcc.mydsl.MyDsl.ApiNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getApiAccess().getEntidadesKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getApiAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getApiAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalMyDsl.g:204:3: ( (lv_entidades_7_0= ruleEntidade ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:205:4: (lv_entidades_7_0= ruleEntidade )
            	    {
            	    // InternalMyDsl.g:205:4: (lv_entidades_7_0= ruleEntidade )
            	    // InternalMyDsl.g:206:5: lv_entidades_7_0= ruleEntidade
            	    {

            	    					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_entidades_7_0=ruleEntidade();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entidades",
            	    						lv_entidades_7_0,
            	    						"org.xtext.tcc.mydsl.MyDsl.Entidade");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getApiAccess().getRightSquareBracketKeyword_8());
            		

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
    // InternalMyDsl.g:231:1: entryRuleApiNome returns [EObject current=null] : iv_ruleApiNome= ruleApiNome EOF ;
    public final EObject entryRuleApiNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiNome = null;


        try {
            // InternalMyDsl.g:231:48: (iv_ruleApiNome= ruleApiNome EOF )
            // InternalMyDsl.g:232:2: iv_ruleApiNome= ruleApiNome EOF
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
    // InternalMyDsl.g:238:1: ruleApiNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleApiNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:244:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:245:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:245:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:246:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:246:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:247:4: lv_id_0_0= RULE_ID
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
    // InternalMyDsl.g:266:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalMyDsl.g:266:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalMyDsl.g:267:2: iv_ruleEntidade= ruleEntidade EOF
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
    // InternalMyDsl.g:273:1: ruleEntidade returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= '}' ) ;
    public final EObject ruleEntidade() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_nomeEntidades_3_0 = null;

        EObject lv_atributos_8_0 = null;

        EObject lv_chavePrimaria_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:280:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:280:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= '}' )
            // InternalMyDsl.g:281:3: otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadeAccess().getNomeKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:293:3: ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) )
            // InternalMyDsl.g:294:4: (lv_nomeEntidades_3_0= ruleEntidadeNome )
            {
            // InternalMyDsl.g:294:4: (lv_nomeEntidades_3_0= ruleEntidadeNome )
            // InternalMyDsl.g:295:5: lv_nomeEntidades_3_0= ruleEntidadeNome
            {

            					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadesEntidadeNomeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_nomeEntidades_3_0=ruleEntidadeNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            					}
            					set(
            						current,
            						"nomeEntidades",
            						lv_nomeEntidades_3_0,
            						"org.xtext.tcc.mydsl.MyDsl.EntidadeNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEntidadeAccess().getAtributosKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadeAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getEntidadeAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:328:3: ( (lv_atributos_8_0= ruleAtributo ) )+
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
            	    // InternalMyDsl.g:329:4: (lv_atributos_8_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:329:4: (lv_atributos_8_0= ruleAtributo )
            	    // InternalMyDsl.g:330:5: lv_atributos_8_0= ruleAtributo
            	    {

            	    					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributosAtributoParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_atributos_8_0=ruleAtributo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"atributos",
            	    						lv_atributos_8_0,
            	    						"org.xtext.tcc.mydsl.MyDsl.Atributo");
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

            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getEntidadeAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getEntidadeAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getEntidadeAccess().getChavePrimariaKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getEntidadeAccess().getColonKeyword_12());
            		
            // InternalMyDsl.g:363:3: ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) )
            // InternalMyDsl.g:364:4: (lv_chavePrimaria_13_0= ruleChavePrimaria )
            {
            // InternalMyDsl.g:364:4: (lv_chavePrimaria_13_0= ruleChavePrimaria )
            // InternalMyDsl.g:365:5: lv_chavePrimaria_13_0= ruleChavePrimaria
            {

            					newCompositeNode(grammarAccess.getEntidadeAccess().getChavePrimariaChavePrimariaParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_4);
            lv_chavePrimaria_13_0=ruleChavePrimaria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            					}
            					set(
            						current,
            						"chavePrimaria",
            						lv_chavePrimaria_13_0,
            						"org.xtext.tcc.mydsl.MyDsl.ChavePrimaria");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalMyDsl.g:390:1: entryRuleEntidadeNome returns [EObject current=null] : iv_ruleEntidadeNome= ruleEntidadeNome EOF ;
    public final EObject entryRuleEntidadeNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadeNome = null;


        try {
            // InternalMyDsl.g:390:53: (iv_ruleEntidadeNome= ruleEntidadeNome EOF )
            // InternalMyDsl.g:391:2: iv_ruleEntidadeNome= ruleEntidadeNome EOF
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
    // InternalMyDsl.g:397:1: ruleEntidadeNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleEntidadeNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:403:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:404:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:404:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:405:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:405:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:406:4: lv_id_0_0= RULE_ID
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
    // InternalMyDsl.g:425:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:425:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:426:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:432:1: ruleAtributo returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) )? otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' ( (lv_operacao_15_0= ruleOperacao ) )? otherlv_16= ',' otherlv_17= '\"joinTable-nome\"' otherlv_18= ':' ( (lv_tabelaNome_19_0= ruleTabelaNome ) ) otherlv_20= ',' otherlv_21= '\"joinColumns-nome\"' otherlv_22= ':' ( (lv_colunaNome_23_0= ruleColunaNome ) ) otherlv_24= ',' otherlv_25= '\"inverseJoinColumns-nome\"' otherlv_26= ':' ( (lv_colunaNomeInverse_27_0= ruleColunaNome ) ) otherlv_28= '}' ) ;
    public final EObject ruleAtributo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_atributoNome_3_0 = null;

        EObject lv_atributoTipo_7_0 = null;

        EObject lv_associacao_11_0 = null;

        EObject lv_operacao_15_0 = null;

        EObject lv_tabelaNome_19_0 = null;

        EObject lv_colunaNome_23_0 = null;

        EObject lv_colunaNomeInverse_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:438:2: ( (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) )? otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' ( (lv_operacao_15_0= ruleOperacao ) )? otherlv_16= ',' otherlv_17= '\"joinTable-nome\"' otherlv_18= ':' ( (lv_tabelaNome_19_0= ruleTabelaNome ) ) otherlv_20= ',' otherlv_21= '\"joinColumns-nome\"' otherlv_22= ':' ( (lv_colunaNome_23_0= ruleColunaNome ) ) otherlv_24= ',' otherlv_25= '\"inverseJoinColumns-nome\"' otherlv_26= ':' ( (lv_colunaNomeInverse_27_0= ruleColunaNome ) ) otherlv_28= '}' ) )
            // InternalMyDsl.g:439:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) )? otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' ( (lv_operacao_15_0= ruleOperacao ) )? otherlv_16= ',' otherlv_17= '\"joinTable-nome\"' otherlv_18= ':' ( (lv_tabelaNome_19_0= ruleTabelaNome ) ) otherlv_20= ',' otherlv_21= '\"joinColumns-nome\"' otherlv_22= ':' ( (lv_colunaNome_23_0= ruleColunaNome ) ) otherlv_24= ',' otherlv_25= '\"inverseJoinColumns-nome\"' otherlv_26= ':' ( (lv_colunaNomeInverse_27_0= ruleColunaNome ) ) otherlv_28= '}' )
            {
            // InternalMyDsl.g:439:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) )? otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' ( (lv_operacao_15_0= ruleOperacao ) )? otherlv_16= ',' otherlv_17= '\"joinTable-nome\"' otherlv_18= ':' ( (lv_tabelaNome_19_0= ruleTabelaNome ) ) otherlv_20= ',' otherlv_21= '\"joinColumns-nome\"' otherlv_22= ':' ( (lv_colunaNome_23_0= ruleColunaNome ) ) otherlv_24= ',' otherlv_25= '\"inverseJoinColumns-nome\"' otherlv_26= ':' ( (lv_colunaNomeInverse_27_0= ruleColunaNome ) ) otherlv_28= '}' )
            // InternalMyDsl.g:440:3: otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) )? otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' ( (lv_operacao_15_0= ruleOperacao ) )? otherlv_16= ',' otherlv_17= '\"joinTable-nome\"' otherlv_18= ':' ( (lv_tabelaNome_19_0= ruleTabelaNome ) ) otherlv_20= ',' otherlv_21= '\"joinColumns-nome\"' otherlv_22= ':' ( (lv_colunaNome_23_0= ruleColunaNome ) ) otherlv_24= ',' otherlv_25= '\"inverseJoinColumns-nome\"' otherlv_26= ':' ( (lv_colunaNomeInverse_27_0= ruleColunaNome ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:452:3: ( (lv_atributoNome_3_0= ruleAtributoNome ) )
            // InternalMyDsl.g:453:4: (lv_atributoNome_3_0= ruleAtributoNome )
            {
            // InternalMyDsl.g:453:4: (lv_atributoNome_3_0= ruleAtributoNome )
            // InternalMyDsl.g:454:5: lv_atributoNome_3_0= ruleAtributoNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNomeAtributoNomeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_atributoNome_3_0=ruleAtributoNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"atributoNome",
            						lv_atributoNome_3_0,
            						"org.xtext.tcc.mydsl.MyDsl.AtributoNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getTipoAtributoKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:483:3: ( (lv_atributoTipo_7_0= ruleAtributoTipo ) )
            // InternalMyDsl.g:484:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            {
            // InternalMyDsl.g:484:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            // InternalMyDsl.g:485:5: lv_atributoTipo_7_0= ruleAtributoTipo
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoTipoAtributoTipoParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_atributoTipo_7_0=ruleAtributoTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"atributoTipo",
            						lv_atributoTipo_7_0,
            						"org.xtext.tcc.mydsl.MyDsl.AtributoTipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getAssociaOKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getColonKeyword_10());
            		
            // InternalMyDsl.g:514:3: ( (lv_associacao_11_0= ruleAssociacao ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=35 && LA3_0<=38)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:515:4: (lv_associacao_11_0= ruleAssociacao )
                    {
                    // InternalMyDsl.g:515:4: (lv_associacao_11_0= ruleAssociacao )
                    // InternalMyDsl.g:516:5: lv_associacao_11_0= ruleAssociacao
                    {

                    					newCompositeNode(grammarAccess.getAtributoAccess().getAssociacaoAssociacaoParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_associacao_11_0=ruleAssociacao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtributoRule());
                    					}
                    					set(
                    						current,
                    						"associacao",
                    						lv_associacao_11_0,
                    						"org.xtext.tcc.mydsl.MyDsl.Associacao");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getAtributoAccess().getOperaOEmCascataKeyword_13());
            		
            otherlv_14=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_14, grammarAccess.getAtributoAccess().getColonKeyword_14());
            		
            // InternalMyDsl.g:545:3: ( (lv_operacao_15_0= ruleOperacao ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=29 && LA4_0<=34)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:546:4: (lv_operacao_15_0= ruleOperacao )
                    {
                    // InternalMyDsl.g:546:4: (lv_operacao_15_0= ruleOperacao )
                    // InternalMyDsl.g:547:5: lv_operacao_15_0= ruleOperacao
                    {

                    					newCompositeNode(grammarAccess.getAtributoAccess().getOperacaoOperacaoParserRuleCall_15_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_operacao_15_0=ruleOperacao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtributoRule());
                    					}
                    					set(
                    						current,
                    						"operacao",
                    						lv_operacao_15_0,
                    						"org.xtext.tcc.mydsl.MyDsl.Operacao");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_16, grammarAccess.getAtributoAccess().getCommaKeyword_16());
            		
            otherlv_17=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getAtributoAccess().getJoinTableNomeKeyword_17());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_18, grammarAccess.getAtributoAccess().getColonKeyword_18());
            		
            // InternalMyDsl.g:576:3: ( (lv_tabelaNome_19_0= ruleTabelaNome ) )
            // InternalMyDsl.g:577:4: (lv_tabelaNome_19_0= ruleTabelaNome )
            {
            // InternalMyDsl.g:577:4: (lv_tabelaNome_19_0= ruleTabelaNome )
            // InternalMyDsl.g:578:5: lv_tabelaNome_19_0= ruleTabelaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getTabelaNomeTabelaNomeParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_7);
            lv_tabelaNome_19_0=ruleTabelaNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"tabelaNome",
            						lv_tabelaNome_19_0,
            						"org.xtext.tcc.mydsl.MyDsl.TabelaNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_20, grammarAccess.getAtributoAccess().getCommaKeyword_20());
            		
            otherlv_21=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getAtributoAccess().getJoinColumnsNomeKeyword_21());
            		
            otherlv_22=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_22, grammarAccess.getAtributoAccess().getColonKeyword_22());
            		
            // InternalMyDsl.g:607:3: ( (lv_colunaNome_23_0= ruleColunaNome ) )
            // InternalMyDsl.g:608:4: (lv_colunaNome_23_0= ruleColunaNome )
            {
            // InternalMyDsl.g:608:4: (lv_colunaNome_23_0= ruleColunaNome )
            // InternalMyDsl.g:609:5: lv_colunaNome_23_0= ruleColunaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeColunaNomeParserRuleCall_23_0());
            				
            pushFollow(FOLLOW_7);
            lv_colunaNome_23_0=ruleColunaNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"colunaNome",
            						lv_colunaNome_23_0,
            						"org.xtext.tcc.mydsl.MyDsl.ColunaNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_24, grammarAccess.getAtributoAccess().getCommaKeyword_24());
            		
            otherlv_25=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_25, grammarAccess.getAtributoAccess().getInverseJoinColumnsNomeKeyword_25());
            		
            otherlv_26=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_26, grammarAccess.getAtributoAccess().getColonKeyword_26());
            		
            // InternalMyDsl.g:638:3: ( (lv_colunaNomeInverse_27_0= ruleColunaNome ) )
            // InternalMyDsl.g:639:4: (lv_colunaNomeInverse_27_0= ruleColunaNome )
            {
            // InternalMyDsl.g:639:4: (lv_colunaNomeInverse_27_0= ruleColunaNome )
            // InternalMyDsl.g:640:5: lv_colunaNomeInverse_27_0= ruleColunaNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getColunaNomeInverseColunaNomeParserRuleCall_27_0());
            				
            pushFollow(FOLLOW_4);
            lv_colunaNomeInverse_27_0=ruleColunaNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"colunaNomeInverse",
            						lv_colunaNomeInverse_27_0,
            						"org.xtext.tcc.mydsl.MyDsl.ColunaNome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_28=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_28());
            		

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
    // InternalMyDsl.g:665:1: entryRuleColunaNome returns [EObject current=null] : iv_ruleColunaNome= ruleColunaNome EOF ;
    public final EObject entryRuleColunaNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColunaNome = null;


        try {
            // InternalMyDsl.g:665:51: (iv_ruleColunaNome= ruleColunaNome EOF )
            // InternalMyDsl.g:666:2: iv_ruleColunaNome= ruleColunaNome EOF
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
    // InternalMyDsl.g:672:1: ruleColunaNome returns [EObject current=null] : ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleColunaNome() throws RecognitionException {
        EObject current = null;

        Token lv_colunaNome_0_0=null;
        Token lv_colunaNome_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:678:2: ( ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:679:2: ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:679:2: ( ( (lv_colunaNome_0_0= RULE_ID ) ) | ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) ) )
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
                    // InternalMyDsl.g:680:3: ( (lv_colunaNome_0_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:680:3: ( (lv_colunaNome_0_0= RULE_ID ) )
                    // InternalMyDsl.g:681:4: (lv_colunaNome_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:681:4: (lv_colunaNome_0_0= RULE_ID )
                    // InternalMyDsl.g:682:5: lv_colunaNome_0_0= RULE_ID
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
                    // InternalMyDsl.g:699:3: ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:699:3: ( (lv_colunaNome_1_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:700:4: (lv_colunaNome_1_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:700:4: (lv_colunaNome_1_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:701:5: lv_colunaNome_1_0= RULE_ANY_OTHER
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
    // InternalMyDsl.g:721:1: entryRuleTabelaNome returns [EObject current=null] : iv_ruleTabelaNome= ruleTabelaNome EOF ;
    public final EObject entryRuleTabelaNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTabelaNome = null;


        try {
            // InternalMyDsl.g:721:51: (iv_ruleTabelaNome= ruleTabelaNome EOF )
            // InternalMyDsl.g:722:2: iv_ruleTabelaNome= ruleTabelaNome EOF
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
    // InternalMyDsl.g:728:1: ruleTabelaNome returns [EObject current=null] : ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) ) ;
    public final EObject ruleTabelaNome() throws RecognitionException {
        EObject current = null;

        Token lv_tabelaNome_0_0=null;
        Token lv_tabelaNome_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:734:2: ( ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) ) )
            // InternalMyDsl.g:735:2: ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) )
            {
            // InternalMyDsl.g:735:2: ( ( (lv_tabelaNome_0_0= RULE_ID ) ) | ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ANY_OTHER) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:736:3: ( (lv_tabelaNome_0_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:736:3: ( (lv_tabelaNome_0_0= RULE_ID ) )
                    // InternalMyDsl.g:737:4: (lv_tabelaNome_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:737:4: (lv_tabelaNome_0_0= RULE_ID )
                    // InternalMyDsl.g:738:5: lv_tabelaNome_0_0= RULE_ID
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
                    // InternalMyDsl.g:755:3: ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) )
                    {
                    // InternalMyDsl.g:755:3: ( (lv_tabelaNome_1_0= RULE_ANY_OTHER ) )
                    // InternalMyDsl.g:756:4: (lv_tabelaNome_1_0= RULE_ANY_OTHER )
                    {
                    // InternalMyDsl.g:756:4: (lv_tabelaNome_1_0= RULE_ANY_OTHER )
                    // InternalMyDsl.g:757:5: lv_tabelaNome_1_0= RULE_ANY_OTHER
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
    // InternalMyDsl.g:777:1: entryRuleOperacao returns [EObject current=null] : iv_ruleOperacao= ruleOperacao EOF ;
    public final EObject entryRuleOperacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacao = null;


        try {
            // InternalMyDsl.g:777:49: (iv_ruleOperacao= ruleOperacao EOF )
            // InternalMyDsl.g:778:2: iv_ruleOperacao= ruleOperacao EOF
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
    // InternalMyDsl.g:784:1: ruleOperacao returns [EObject current=null] : ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) ) ;
    public final EObject ruleOperacao() throws RecognitionException {
        EObject current = null;

        Token lv_opCascada_0_0=null;
        Token lv_opCascada_1_0=null;
        Token lv_opCascada_2_0=null;
        Token lv_opCascada_3_0=null;
        Token lv_opCascada_4_0=null;
        Token lv_opCascada_5_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:790:2: ( ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) ) )
            // InternalMyDsl.g:791:2: ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) )
            {
            // InternalMyDsl.g:791:2: ( ( (lv_opCascada_0_0= 'ALL' ) ) | ( (lv_opCascada_1_0= 'DETACH' ) ) | ( (lv_opCascada_2_0= 'MERGE' ) ) | ( (lv_opCascada_3_0= 'PERSIST' ) ) | ( (lv_opCascada_4_0= 'REFRESH' ) ) | ( (lv_opCascada_5_0= 'REMOVE' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            case 32:
                {
                alt7=4;
                }
                break;
            case 33:
                {
                alt7=5;
                }
                break;
            case 34:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:792:3: ( (lv_opCascada_0_0= 'ALL' ) )
                    {
                    // InternalMyDsl.g:792:3: ( (lv_opCascada_0_0= 'ALL' ) )
                    // InternalMyDsl.g:793:4: (lv_opCascada_0_0= 'ALL' )
                    {
                    // InternalMyDsl.g:793:4: (lv_opCascada_0_0= 'ALL' )
                    // InternalMyDsl.g:794:5: lv_opCascada_0_0= 'ALL'
                    {
                    lv_opCascada_0_0=(Token)match(input,29,FOLLOW_2); 

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
                    // InternalMyDsl.g:807:3: ( (lv_opCascada_1_0= 'DETACH' ) )
                    {
                    // InternalMyDsl.g:807:3: ( (lv_opCascada_1_0= 'DETACH' ) )
                    // InternalMyDsl.g:808:4: (lv_opCascada_1_0= 'DETACH' )
                    {
                    // InternalMyDsl.g:808:4: (lv_opCascada_1_0= 'DETACH' )
                    // InternalMyDsl.g:809:5: lv_opCascada_1_0= 'DETACH'
                    {
                    lv_opCascada_1_0=(Token)match(input,30,FOLLOW_2); 

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
                    // InternalMyDsl.g:822:3: ( (lv_opCascada_2_0= 'MERGE' ) )
                    {
                    // InternalMyDsl.g:822:3: ( (lv_opCascada_2_0= 'MERGE' ) )
                    // InternalMyDsl.g:823:4: (lv_opCascada_2_0= 'MERGE' )
                    {
                    // InternalMyDsl.g:823:4: (lv_opCascada_2_0= 'MERGE' )
                    // InternalMyDsl.g:824:5: lv_opCascada_2_0= 'MERGE'
                    {
                    lv_opCascada_2_0=(Token)match(input,31,FOLLOW_2); 

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
                    // InternalMyDsl.g:837:3: ( (lv_opCascada_3_0= 'PERSIST' ) )
                    {
                    // InternalMyDsl.g:837:3: ( (lv_opCascada_3_0= 'PERSIST' ) )
                    // InternalMyDsl.g:838:4: (lv_opCascada_3_0= 'PERSIST' )
                    {
                    // InternalMyDsl.g:838:4: (lv_opCascada_3_0= 'PERSIST' )
                    // InternalMyDsl.g:839:5: lv_opCascada_3_0= 'PERSIST'
                    {
                    lv_opCascada_3_0=(Token)match(input,32,FOLLOW_2); 

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
                    // InternalMyDsl.g:852:3: ( (lv_opCascada_4_0= 'REFRESH' ) )
                    {
                    // InternalMyDsl.g:852:3: ( (lv_opCascada_4_0= 'REFRESH' ) )
                    // InternalMyDsl.g:853:4: (lv_opCascada_4_0= 'REFRESH' )
                    {
                    // InternalMyDsl.g:853:4: (lv_opCascada_4_0= 'REFRESH' )
                    // InternalMyDsl.g:854:5: lv_opCascada_4_0= 'REFRESH'
                    {
                    lv_opCascada_4_0=(Token)match(input,33,FOLLOW_2); 

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
                    // InternalMyDsl.g:867:3: ( (lv_opCascada_5_0= 'REMOVE' ) )
                    {
                    // InternalMyDsl.g:867:3: ( (lv_opCascada_5_0= 'REMOVE' ) )
                    // InternalMyDsl.g:868:4: (lv_opCascada_5_0= 'REMOVE' )
                    {
                    // InternalMyDsl.g:868:4: (lv_opCascada_5_0= 'REMOVE' )
                    // InternalMyDsl.g:869:5: lv_opCascada_5_0= 'REMOVE'
                    {
                    lv_opCascada_5_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_opCascada_5_0, grammarAccess.getOperacaoAccess().getOpCascadaREMOVEKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperacaoRule());
                    					}
                    					setWithLastConsumed(current, "opCascada", lv_opCascada_5_0, "REMOVE");
                    				

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
    // InternalMyDsl.g:885:1: entryRuleAssociacao returns [EObject current=null] : iv_ruleAssociacao= ruleAssociacao EOF ;
    public final EObject entryRuleAssociacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociacao = null;


        try {
            // InternalMyDsl.g:885:51: (iv_ruleAssociacao= ruleAssociacao EOF )
            // InternalMyDsl.g:886:2: iv_ruleAssociacao= ruleAssociacao EOF
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
    // InternalMyDsl.g:892:1: ruleAssociacao returns [EObject current=null] : ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) ) ;
    public final EObject ruleAssociacao() throws RecognitionException {
        EObject current = null;

        Token lv_associacao_0_0=null;
        Token lv_associacao_1_0=null;
        Token lv_associacao_2_0=null;
        Token lv_associacao_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:898:2: ( ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) ) )
            // InternalMyDsl.g:899:2: ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) )
            {
            // InternalMyDsl.g:899:2: ( ( (lv_associacao_0_0= 'OneToOne' ) ) | ( (lv_associacao_1_0= 'OneToMany' ) ) | ( (lv_associacao_2_0= 'ManyToOne' ) ) | ( (lv_associacao_3_0= 'ManyToMany' ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 38:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:900:3: ( (lv_associacao_0_0= 'OneToOne' ) )
                    {
                    // InternalMyDsl.g:900:3: ( (lv_associacao_0_0= 'OneToOne' ) )
                    // InternalMyDsl.g:901:4: (lv_associacao_0_0= 'OneToOne' )
                    {
                    // InternalMyDsl.g:901:4: (lv_associacao_0_0= 'OneToOne' )
                    // InternalMyDsl.g:902:5: lv_associacao_0_0= 'OneToOne'
                    {
                    lv_associacao_0_0=(Token)match(input,35,FOLLOW_2); 

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
                    // InternalMyDsl.g:915:3: ( (lv_associacao_1_0= 'OneToMany' ) )
                    {
                    // InternalMyDsl.g:915:3: ( (lv_associacao_1_0= 'OneToMany' ) )
                    // InternalMyDsl.g:916:4: (lv_associacao_1_0= 'OneToMany' )
                    {
                    // InternalMyDsl.g:916:4: (lv_associacao_1_0= 'OneToMany' )
                    // InternalMyDsl.g:917:5: lv_associacao_1_0= 'OneToMany'
                    {
                    lv_associacao_1_0=(Token)match(input,36,FOLLOW_2); 

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
                    // InternalMyDsl.g:930:3: ( (lv_associacao_2_0= 'ManyToOne' ) )
                    {
                    // InternalMyDsl.g:930:3: ( (lv_associacao_2_0= 'ManyToOne' ) )
                    // InternalMyDsl.g:931:4: (lv_associacao_2_0= 'ManyToOne' )
                    {
                    // InternalMyDsl.g:931:4: (lv_associacao_2_0= 'ManyToOne' )
                    // InternalMyDsl.g:932:5: lv_associacao_2_0= 'ManyToOne'
                    {
                    lv_associacao_2_0=(Token)match(input,37,FOLLOW_2); 

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
                    // InternalMyDsl.g:945:3: ( (lv_associacao_3_0= 'ManyToMany' ) )
                    {
                    // InternalMyDsl.g:945:3: ( (lv_associacao_3_0= 'ManyToMany' ) )
                    // InternalMyDsl.g:946:4: (lv_associacao_3_0= 'ManyToMany' )
                    {
                    // InternalMyDsl.g:946:4: (lv_associacao_3_0= 'ManyToMany' )
                    // InternalMyDsl.g:947:5: lv_associacao_3_0= 'ManyToMany'
                    {
                    lv_associacao_3_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_associacao_3_0, grammarAccess.getAssociacaoAccess().getAssociacaoManyToManyKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAssociacaoRule());
                    					}
                    					setWithLastConsumed(current, "associacao", lv_associacao_3_0, "ManyToMany");
                    				

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
    // InternalMyDsl.g:963:1: entryRuleAtributoNome returns [EObject current=null] : iv_ruleAtributoNome= ruleAtributoNome EOF ;
    public final EObject entryRuleAtributoNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoNome = null;


        try {
            // InternalMyDsl.g:963:53: (iv_ruleAtributoNome= ruleAtributoNome EOF )
            // InternalMyDsl.g:964:2: iv_ruleAtributoNome= ruleAtributoNome EOF
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
    // InternalMyDsl.g:970:1: ruleAtributoNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleAtributoNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:976:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:977:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:977:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:978:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:978:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:979:4: lv_id_0_0= RULE_ID
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
    // InternalMyDsl.g:998:1: entryRuleAtributoTipo returns [EObject current=null] : iv_ruleAtributoTipo= ruleAtributoTipo EOF ;
    public final EObject entryRuleAtributoTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoTipo = null;


        try {
            // InternalMyDsl.g:998:53: (iv_ruleAtributoTipo= ruleAtributoTipo EOF )
            // InternalMyDsl.g:999:2: iv_ruleAtributoTipo= ruleAtributoTipo EOF
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
    // InternalMyDsl.g:1005:1: ruleAtributoTipo returns [EObject current=null] : ( ( (lv_tipoP_0_0= 'Boolean' ) ) | ( (lv_tipoP_1_0= 'Byte' ) ) | ( (lv_tipoP_2_0= 'Short' ) ) | ( (lv_tipoP_3_0= 'Character' ) ) | ( (lv_tipoP_4_0= 'Integer' ) ) | ( (lv_tipoP_5_0= 'Long' ) ) | ( (lv_tipoP_6_0= 'String' ) ) | ( (lv_tipoP_7_0= 'Float' ) ) | ( (lv_tipoP_8_0= 'Double' ) ) | ( (lv_tipoP_9_0= 'Time' ) ) | ( (lv_tipoP_10_0= 'Timestamp' ) ) | ( (lv_tipoP_11_0= 'Date' ) ) | ( (lv_tipoP_12_0= 'ENUM' ) ) | ( (lv_tipoP_13_0= 'ArrayList' ) ) | ( (lv_tipoP_14_0= 'HashSet' ) ) | ( (lv_tipoE_15_0= RULE_ID ) ) ) ;
    public final EObject ruleAtributoTipo() throws RecognitionException {
        EObject current = null;

        Token lv_tipoP_0_0=null;
        Token lv_tipoP_1_0=null;
        Token lv_tipoP_2_0=null;
        Token lv_tipoP_3_0=null;
        Token lv_tipoP_4_0=null;
        Token lv_tipoP_5_0=null;
        Token lv_tipoP_6_0=null;
        Token lv_tipoP_7_0=null;
        Token lv_tipoP_8_0=null;
        Token lv_tipoP_9_0=null;
        Token lv_tipoP_10_0=null;
        Token lv_tipoP_11_0=null;
        Token lv_tipoP_12_0=null;
        Token lv_tipoP_13_0=null;
        Token lv_tipoP_14_0=null;
        Token lv_tipoE_15_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1011:2: ( ( ( (lv_tipoP_0_0= 'Boolean' ) ) | ( (lv_tipoP_1_0= 'Byte' ) ) | ( (lv_tipoP_2_0= 'Short' ) ) | ( (lv_tipoP_3_0= 'Character' ) ) | ( (lv_tipoP_4_0= 'Integer' ) ) | ( (lv_tipoP_5_0= 'Long' ) ) | ( (lv_tipoP_6_0= 'String' ) ) | ( (lv_tipoP_7_0= 'Float' ) ) | ( (lv_tipoP_8_0= 'Double' ) ) | ( (lv_tipoP_9_0= 'Time' ) ) | ( (lv_tipoP_10_0= 'Timestamp' ) ) | ( (lv_tipoP_11_0= 'Date' ) ) | ( (lv_tipoP_12_0= 'ENUM' ) ) | ( (lv_tipoP_13_0= 'ArrayList' ) ) | ( (lv_tipoP_14_0= 'HashSet' ) ) | ( (lv_tipoE_15_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1012:2: ( ( (lv_tipoP_0_0= 'Boolean' ) ) | ( (lv_tipoP_1_0= 'Byte' ) ) | ( (lv_tipoP_2_0= 'Short' ) ) | ( (lv_tipoP_3_0= 'Character' ) ) | ( (lv_tipoP_4_0= 'Integer' ) ) | ( (lv_tipoP_5_0= 'Long' ) ) | ( (lv_tipoP_6_0= 'String' ) ) | ( (lv_tipoP_7_0= 'Float' ) ) | ( (lv_tipoP_8_0= 'Double' ) ) | ( (lv_tipoP_9_0= 'Time' ) ) | ( (lv_tipoP_10_0= 'Timestamp' ) ) | ( (lv_tipoP_11_0= 'Date' ) ) | ( (lv_tipoP_12_0= 'ENUM' ) ) | ( (lv_tipoP_13_0= 'ArrayList' ) ) | ( (lv_tipoP_14_0= 'HashSet' ) ) | ( (lv_tipoE_15_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1012:2: ( ( (lv_tipoP_0_0= 'Boolean' ) ) | ( (lv_tipoP_1_0= 'Byte' ) ) | ( (lv_tipoP_2_0= 'Short' ) ) | ( (lv_tipoP_3_0= 'Character' ) ) | ( (lv_tipoP_4_0= 'Integer' ) ) | ( (lv_tipoP_5_0= 'Long' ) ) | ( (lv_tipoP_6_0= 'String' ) ) | ( (lv_tipoP_7_0= 'Float' ) ) | ( (lv_tipoP_8_0= 'Double' ) ) | ( (lv_tipoP_9_0= 'Time' ) ) | ( (lv_tipoP_10_0= 'Timestamp' ) ) | ( (lv_tipoP_11_0= 'Date' ) ) | ( (lv_tipoP_12_0= 'ENUM' ) ) | ( (lv_tipoP_13_0= 'ArrayList' ) ) | ( (lv_tipoP_14_0= 'HashSet' ) ) | ( (lv_tipoE_15_0= RULE_ID ) ) )
            int alt9=16;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt9=1;
                }
                break;
            case 40:
                {
                alt9=2;
                }
                break;
            case 41:
                {
                alt9=3;
                }
                break;
            case 42:
                {
                alt9=4;
                }
                break;
            case 43:
                {
                alt9=5;
                }
                break;
            case 44:
                {
                alt9=6;
                }
                break;
            case 45:
                {
                alt9=7;
                }
                break;
            case 46:
                {
                alt9=8;
                }
                break;
            case 47:
                {
                alt9=9;
                }
                break;
            case 48:
                {
                alt9=10;
                }
                break;
            case 49:
                {
                alt9=11;
                }
                break;
            case 50:
                {
                alt9=12;
                }
                break;
            case 51:
                {
                alt9=13;
                }
                break;
            case 52:
                {
                alt9=14;
                }
                break;
            case 53:
                {
                alt9=15;
                }
                break;
            case RULE_ID:
                {
                alt9=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1013:3: ( (lv_tipoP_0_0= 'Boolean' ) )
                    {
                    // InternalMyDsl.g:1013:3: ( (lv_tipoP_0_0= 'Boolean' ) )
                    // InternalMyDsl.g:1014:4: (lv_tipoP_0_0= 'Boolean' )
                    {
                    // InternalMyDsl.g:1014:4: (lv_tipoP_0_0= 'Boolean' )
                    // InternalMyDsl.g:1015:5: lv_tipoP_0_0= 'Boolean'
                    {
                    lv_tipoP_0_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_0_0, grammarAccess.getAtributoTipoAccess().getTipoPBooleanKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_0_0, "Boolean");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1028:3: ( (lv_tipoP_1_0= 'Byte' ) )
                    {
                    // InternalMyDsl.g:1028:3: ( (lv_tipoP_1_0= 'Byte' ) )
                    // InternalMyDsl.g:1029:4: (lv_tipoP_1_0= 'Byte' )
                    {
                    // InternalMyDsl.g:1029:4: (lv_tipoP_1_0= 'Byte' )
                    // InternalMyDsl.g:1030:5: lv_tipoP_1_0= 'Byte'
                    {
                    lv_tipoP_1_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_1_0, grammarAccess.getAtributoTipoAccess().getTipoPByteKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_1_0, "Byte");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1043:3: ( (lv_tipoP_2_0= 'Short' ) )
                    {
                    // InternalMyDsl.g:1043:3: ( (lv_tipoP_2_0= 'Short' ) )
                    // InternalMyDsl.g:1044:4: (lv_tipoP_2_0= 'Short' )
                    {
                    // InternalMyDsl.g:1044:4: (lv_tipoP_2_0= 'Short' )
                    // InternalMyDsl.g:1045:5: lv_tipoP_2_0= 'Short'
                    {
                    lv_tipoP_2_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_2_0, grammarAccess.getAtributoTipoAccess().getTipoPShortKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_2_0, "Short");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1058:3: ( (lv_tipoP_3_0= 'Character' ) )
                    {
                    // InternalMyDsl.g:1058:3: ( (lv_tipoP_3_0= 'Character' ) )
                    // InternalMyDsl.g:1059:4: (lv_tipoP_3_0= 'Character' )
                    {
                    // InternalMyDsl.g:1059:4: (lv_tipoP_3_0= 'Character' )
                    // InternalMyDsl.g:1060:5: lv_tipoP_3_0= 'Character'
                    {
                    lv_tipoP_3_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_3_0, grammarAccess.getAtributoTipoAccess().getTipoPCharacterKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_3_0, "Character");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1073:3: ( (lv_tipoP_4_0= 'Integer' ) )
                    {
                    // InternalMyDsl.g:1073:3: ( (lv_tipoP_4_0= 'Integer' ) )
                    // InternalMyDsl.g:1074:4: (lv_tipoP_4_0= 'Integer' )
                    {
                    // InternalMyDsl.g:1074:4: (lv_tipoP_4_0= 'Integer' )
                    // InternalMyDsl.g:1075:5: lv_tipoP_4_0= 'Integer'
                    {
                    lv_tipoP_4_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_4_0, grammarAccess.getAtributoTipoAccess().getTipoPIntegerKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_4_0, "Integer");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1088:3: ( (lv_tipoP_5_0= 'Long' ) )
                    {
                    // InternalMyDsl.g:1088:3: ( (lv_tipoP_5_0= 'Long' ) )
                    // InternalMyDsl.g:1089:4: (lv_tipoP_5_0= 'Long' )
                    {
                    // InternalMyDsl.g:1089:4: (lv_tipoP_5_0= 'Long' )
                    // InternalMyDsl.g:1090:5: lv_tipoP_5_0= 'Long'
                    {
                    lv_tipoP_5_0=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_5_0, grammarAccess.getAtributoTipoAccess().getTipoPLongKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_5_0, "Long");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1103:3: ( (lv_tipoP_6_0= 'String' ) )
                    {
                    // InternalMyDsl.g:1103:3: ( (lv_tipoP_6_0= 'String' ) )
                    // InternalMyDsl.g:1104:4: (lv_tipoP_6_0= 'String' )
                    {
                    // InternalMyDsl.g:1104:4: (lv_tipoP_6_0= 'String' )
                    // InternalMyDsl.g:1105:5: lv_tipoP_6_0= 'String'
                    {
                    lv_tipoP_6_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_6_0, grammarAccess.getAtributoTipoAccess().getTipoPStringKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_6_0, "String");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1118:3: ( (lv_tipoP_7_0= 'Float' ) )
                    {
                    // InternalMyDsl.g:1118:3: ( (lv_tipoP_7_0= 'Float' ) )
                    // InternalMyDsl.g:1119:4: (lv_tipoP_7_0= 'Float' )
                    {
                    // InternalMyDsl.g:1119:4: (lv_tipoP_7_0= 'Float' )
                    // InternalMyDsl.g:1120:5: lv_tipoP_7_0= 'Float'
                    {
                    lv_tipoP_7_0=(Token)match(input,46,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_7_0, grammarAccess.getAtributoTipoAccess().getTipoPFloatKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_7_0, "Float");
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1133:3: ( (lv_tipoP_8_0= 'Double' ) )
                    {
                    // InternalMyDsl.g:1133:3: ( (lv_tipoP_8_0= 'Double' ) )
                    // InternalMyDsl.g:1134:4: (lv_tipoP_8_0= 'Double' )
                    {
                    // InternalMyDsl.g:1134:4: (lv_tipoP_8_0= 'Double' )
                    // InternalMyDsl.g:1135:5: lv_tipoP_8_0= 'Double'
                    {
                    lv_tipoP_8_0=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_8_0, grammarAccess.getAtributoTipoAccess().getTipoPDoubleKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_8_0, "Double");
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1148:3: ( (lv_tipoP_9_0= 'Time' ) )
                    {
                    // InternalMyDsl.g:1148:3: ( (lv_tipoP_9_0= 'Time' ) )
                    // InternalMyDsl.g:1149:4: (lv_tipoP_9_0= 'Time' )
                    {
                    // InternalMyDsl.g:1149:4: (lv_tipoP_9_0= 'Time' )
                    // InternalMyDsl.g:1150:5: lv_tipoP_9_0= 'Time'
                    {
                    lv_tipoP_9_0=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_9_0, grammarAccess.getAtributoTipoAccess().getTipoPTimeKeyword_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_9_0, "Time");
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1163:3: ( (lv_tipoP_10_0= 'Timestamp' ) )
                    {
                    // InternalMyDsl.g:1163:3: ( (lv_tipoP_10_0= 'Timestamp' ) )
                    // InternalMyDsl.g:1164:4: (lv_tipoP_10_0= 'Timestamp' )
                    {
                    // InternalMyDsl.g:1164:4: (lv_tipoP_10_0= 'Timestamp' )
                    // InternalMyDsl.g:1165:5: lv_tipoP_10_0= 'Timestamp'
                    {
                    lv_tipoP_10_0=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_10_0, grammarAccess.getAtributoTipoAccess().getTipoPTimestampKeyword_10_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_10_0, "Timestamp");
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1178:3: ( (lv_tipoP_11_0= 'Date' ) )
                    {
                    // InternalMyDsl.g:1178:3: ( (lv_tipoP_11_0= 'Date' ) )
                    // InternalMyDsl.g:1179:4: (lv_tipoP_11_0= 'Date' )
                    {
                    // InternalMyDsl.g:1179:4: (lv_tipoP_11_0= 'Date' )
                    // InternalMyDsl.g:1180:5: lv_tipoP_11_0= 'Date'
                    {
                    lv_tipoP_11_0=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_11_0, grammarAccess.getAtributoTipoAccess().getTipoPDateKeyword_11_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_11_0, "Date");
                    				

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1193:3: ( (lv_tipoP_12_0= 'ENUM' ) )
                    {
                    // InternalMyDsl.g:1193:3: ( (lv_tipoP_12_0= 'ENUM' ) )
                    // InternalMyDsl.g:1194:4: (lv_tipoP_12_0= 'ENUM' )
                    {
                    // InternalMyDsl.g:1194:4: (lv_tipoP_12_0= 'ENUM' )
                    // InternalMyDsl.g:1195:5: lv_tipoP_12_0= 'ENUM'
                    {
                    lv_tipoP_12_0=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_12_0, grammarAccess.getAtributoTipoAccess().getTipoPENUMKeyword_12_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_12_0, "ENUM");
                    				

                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1208:3: ( (lv_tipoP_13_0= 'ArrayList' ) )
                    {
                    // InternalMyDsl.g:1208:3: ( (lv_tipoP_13_0= 'ArrayList' ) )
                    // InternalMyDsl.g:1209:4: (lv_tipoP_13_0= 'ArrayList' )
                    {
                    // InternalMyDsl.g:1209:4: (lv_tipoP_13_0= 'ArrayList' )
                    // InternalMyDsl.g:1210:5: lv_tipoP_13_0= 'ArrayList'
                    {
                    lv_tipoP_13_0=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_13_0, grammarAccess.getAtributoTipoAccess().getTipoPArrayListKeyword_13_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_13_0, "ArrayList");
                    				

                    }


                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:1223:3: ( (lv_tipoP_14_0= 'HashSet' ) )
                    {
                    // InternalMyDsl.g:1223:3: ( (lv_tipoP_14_0= 'HashSet' ) )
                    // InternalMyDsl.g:1224:4: (lv_tipoP_14_0= 'HashSet' )
                    {
                    // InternalMyDsl.g:1224:4: (lv_tipoP_14_0= 'HashSet' )
                    // InternalMyDsl.g:1225:5: lv_tipoP_14_0= 'HashSet'
                    {
                    lv_tipoP_14_0=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_tipoP_14_0, grammarAccess.getAtributoTipoAccess().getTipoPHashSetKeyword_14_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(current, "tipoP", lv_tipoP_14_0, "HashSet");
                    				

                    }


                    }


                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:1238:3: ( (lv_tipoE_15_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:1238:3: ( (lv_tipoE_15_0= RULE_ID ) )
                    // InternalMyDsl.g:1239:4: (lv_tipoE_15_0= RULE_ID )
                    {
                    // InternalMyDsl.g:1239:4: (lv_tipoE_15_0= RULE_ID )
                    // InternalMyDsl.g:1240:5: lv_tipoE_15_0= RULE_ID
                    {
                    lv_tipoE_15_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_tipoE_15_0, grammarAccess.getAtributoTipoAccess().getTipoEIDTerminalRuleCall_15_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tipoE",
                    						lv_tipoE_15_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleAtributoTipo"


    // $ANTLR start "entryRuleChavePrimaria"
    // InternalMyDsl.g:1260:1: entryRuleChavePrimaria returns [EObject current=null] : iv_ruleChavePrimaria= ruleChavePrimaria EOF ;
    public final EObject entryRuleChavePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChavePrimaria = null;


        try {
            // InternalMyDsl.g:1260:54: (iv_ruleChavePrimaria= ruleChavePrimaria EOF )
            // InternalMyDsl.g:1261:2: iv_ruleChavePrimaria= ruleChavePrimaria EOF
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
    // InternalMyDsl.g:1267:1: ruleChavePrimaria returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleChavePrimaria() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1273:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:1274:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1274:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:1275:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:1275:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:1276:4: lv_id_0_0= RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x003FFF8000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000007800008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000007E0008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}