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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_LIT", "RULE_NOME_OPERACAO", "RULE_NOME_ASSOCIACAO", "RULE_TIPO_PRIMITIVO", "RULE_TIPO_COLECAO", "RULE_STRING_I", "RULE_LETRA", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'\"Nome da Api\"'", "':'", "','", "'\"Entidades\"'", "'['", "']'", "'\"Nome\"'", "'\"Atributos\"'", "'\"Nome do pacote\"'", "'\"nome-atributo\"'", "'\"tipo-atributo\"'", "'\"associa\\u00E7\\u00E3o/relacionamento\"'", "'\"opera\\u00E7\\u00E3o em cascata\"'"
    };
    public static final int RULE_STRING=13;
    public static final int RULE_TIPO_PRIMITIVO=7;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_STRING_I=9;
    public static final int RULE_NOME_ASSOCIACAO=6;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING_LIT=4;
    public static final int RULE_TIPO_COLECAO=8;
    public static final int RULE_ID=11;
    public static final int RULE_WS=16;
    public static final int RULE_NOME_OPERACAO=5;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_LETRA=10;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
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
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalMyDsl.g:153:1: ruleApi returns [EObject current=null] : (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' ) ;
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
            // InternalMyDsl.g:159:2: ( (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' ) )
            // InternalMyDsl.g:160:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' )
            {
            // InternalMyDsl.g:160:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' )
            // InternalMyDsl.g:161:3: otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getApiAccess().getNomeDaApiKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_6); 

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

            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getApiAccess().getEntidadesKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getApiAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getApiAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalMyDsl.g:204:3: ( (lv_entidades_7_0= ruleEntidades ) )
            // InternalMyDsl.g:205:4: (lv_entidades_7_0= ruleEntidades )
            {
            // InternalMyDsl.g:205:4: (lv_entidades_7_0= ruleEntidades )
            // InternalMyDsl.g:206:5: lv_entidades_7_0= ruleEntidades
            {

            					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadesParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_entidades_7_0=ruleEntidades();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApiRule());
            					}
            					set(
            						current,
            						"entidades",
            						lv_entidades_7_0,
            						"org.xtext.tcc.mydsl.MyDsl.Entidades");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:238:1: ruleApiNome returns [EObject current=null] : ( (lv_nome_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleApiNome() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:244:2: ( ( (lv_nome_0_0= RULE_STRING_LIT ) ) )
            // InternalMyDsl.g:245:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            {
            // InternalMyDsl.g:245:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            // InternalMyDsl.g:246:3: (lv_nome_0_0= RULE_STRING_LIT )
            {
            // InternalMyDsl.g:246:3: (lv_nome_0_0= RULE_STRING_LIT )
            // InternalMyDsl.g:247:4: lv_nome_0_0= RULE_STRING_LIT
            {
            lv_nome_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); 

            				newLeafNode(lv_nome_0_0, grammarAccess.getApiNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getApiNomeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nome",
            					lv_nome_0_0,
            					"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
            			

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


    // $ANTLR start "entryRuleEntidades"
    // InternalMyDsl.g:266:1: entryRuleEntidades returns [EObject current=null] : iv_ruleEntidades= ruleEntidades EOF ;
    public final EObject entryRuleEntidades() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidades = null;


        try {
            // InternalMyDsl.g:266:50: (iv_ruleEntidades= ruleEntidades EOF )
            // InternalMyDsl.g:267:2: iv_ruleEntidades= ruleEntidades EOF
            {
             newCompositeNode(grammarAccess.getEntidadesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntidades=ruleEntidades();

            state._fsp--;

             current =iv_ruleEntidades; 
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
    // $ANTLR end "entryRuleEntidades"


    // $ANTLR start "ruleEntidades"
    // InternalMyDsl.g:273:1: ruleEntidades returns [EObject current=null] : ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* ) ;
    public final EObject ruleEntidades() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entidade_0_0 = null;

        EObject lv_entidadeMais_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* ) )
            // InternalMyDsl.g:280:2: ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* )
            {
            // InternalMyDsl.g:280:2: ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* )
            // InternalMyDsl.g:281:3: ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )*
            {
            // InternalMyDsl.g:281:3: ( (lv_entidade_0_0= ruleEntidade ) )
            // InternalMyDsl.g:282:4: (lv_entidade_0_0= ruleEntidade )
            {
            // InternalMyDsl.g:282:4: (lv_entidade_0_0= ruleEntidade )
            // InternalMyDsl.g:283:5: lv_entidade_0_0= ruleEntidade
            {

            					newCompositeNode(grammarAccess.getEntidadesAccess().getEntidadeEntidadeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_entidade_0_0=ruleEntidade();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadesRule());
            					}
            					set(
            						current,
            						"entidade",
            						lv_entidade_0_0,
            						"org.xtext.tcc.mydsl.MyDsl.Entidade");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:300:3: (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:301:4: otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEntidadesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:305:4: ( (lv_entidadeMais_2_0= ruleEntidade ) )
            	    // InternalMyDsl.g:306:5: (lv_entidadeMais_2_0= ruleEntidade )
            	    {
            	    // InternalMyDsl.g:306:5: (lv_entidadeMais_2_0= ruleEntidade )
            	    // InternalMyDsl.g:307:6: lv_entidadeMais_2_0= ruleEntidade
            	    {

            	    						newCompositeNode(grammarAccess.getEntidadesAccess().getEntidadeMaisEntidadeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_entidadeMais_2_0=ruleEntidade();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEntidadesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entidadeMais",
            	    							lv_entidadeMais_2_0,
            	    							"org.xtext.tcc.mydsl.MyDsl.Entidade");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleEntidades"


    // $ANTLR start "entryRuleEntidade"
    // InternalMyDsl.g:329:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalMyDsl.g:329:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalMyDsl.g:330:2: iv_ruleEntidade= ruleEntidade EOF
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
    // InternalMyDsl.g:336:1: ruleEntidade returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Nome do pacote\"' otherlv_12= ':' ( (lv_package_13_0= ruleNome ) ) otherlv_14= '}' ) ;
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
        EObject lv_nomeEntidade_3_0 = null;

        EObject lv_atributos_8_0 = null;

        EObject lv_package_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:342:2: ( (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Nome do pacote\"' otherlv_12= ':' ( (lv_package_13_0= ruleNome ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:343:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Nome do pacote\"' otherlv_12= ':' ( (lv_package_13_0= ruleNome ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:343:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Nome do pacote\"' otherlv_12= ':' ( (lv_package_13_0= ruleNome ) ) otherlv_14= '}' )
            // InternalMyDsl.g:344:3: otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Nome do pacote\"' otherlv_12= ':' ( (lv_package_13_0= ruleNome ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEntidadeAccess().getNomeKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:356:3: ( (lv_nomeEntidade_3_0= ruleNome ) )
            // InternalMyDsl.g:357:4: (lv_nomeEntidade_3_0= ruleNome )
            {
            // InternalMyDsl.g:357:4: (lv_nomeEntidade_3_0= ruleNome )
            // InternalMyDsl.g:358:5: lv_nomeEntidade_3_0= ruleNome
            {

            					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadeNomeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_nomeEntidade_3_0=ruleNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            					}
            					set(
            						current,
            						"nomeEntidade",
            						lv_nomeEntidade_3_0,
            						"org.xtext.tcc.mydsl.MyDsl.Nome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getEntidadeAccess().getAtributosKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getEntidadeAccess().getColonKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getEntidadeAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalMyDsl.g:391:3: ( (lv_atributos_8_0= ruleAtributos ) )
            // InternalMyDsl.g:392:4: (lv_atributos_8_0= ruleAtributos )
            {
            // InternalMyDsl.g:392:4: (lv_atributos_8_0= ruleAtributos )
            // InternalMyDsl.g:393:5: lv_atributos_8_0= ruleAtributos
            {

            					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributosAtributosParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_atributos_8_0=ruleAtributos();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            					}
            					set(
            						current,
            						"atributos",
            						lv_atributos_8_0,
            						"org.xtext.tcc.mydsl.MyDsl.Atributos");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getEntidadeAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getEntidadeAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getEntidadeAccess().getNomeDoPacoteKeyword_11());
            		
            otherlv_12=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getEntidadeAccess().getColonKeyword_12());
            		
            // InternalMyDsl.g:426:3: ( (lv_package_13_0= ruleNome ) )
            // InternalMyDsl.g:427:4: (lv_package_13_0= ruleNome )
            {
            // InternalMyDsl.g:427:4: (lv_package_13_0= ruleNome )
            // InternalMyDsl.g:428:5: lv_package_13_0= ruleNome
            {

            					newCompositeNode(grammarAccess.getEntidadeAccess().getPackageNomeParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_4);
            lv_package_13_0=ruleNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntidadeRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_13_0,
            						"org.xtext.tcc.mydsl.MyDsl.Nome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNome"
    // InternalMyDsl.g:453:1: entryRuleNome returns [EObject current=null] : iv_ruleNome= ruleNome EOF ;
    public final EObject entryRuleNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNome = null;


        try {
            // InternalMyDsl.g:453:45: (iv_ruleNome= ruleNome EOF )
            // InternalMyDsl.g:454:2: iv_ruleNome= ruleNome EOF
            {
             newCompositeNode(grammarAccess.getNomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNome=ruleNome();

            state._fsp--;

             current =iv_ruleNome; 
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
    // $ANTLR end "entryRuleNome"


    // $ANTLR start "ruleNome"
    // InternalMyDsl.g:460:1: ruleNome returns [EObject current=null] : ( (lv_nome_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleNome() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:466:2: ( ( (lv_nome_0_0= RULE_STRING_LIT ) ) )
            // InternalMyDsl.g:467:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            {
            // InternalMyDsl.g:467:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            // InternalMyDsl.g:468:3: (lv_nome_0_0= RULE_STRING_LIT )
            {
            // InternalMyDsl.g:468:3: (lv_nome_0_0= RULE_STRING_LIT )
            // InternalMyDsl.g:469:4: lv_nome_0_0= RULE_STRING_LIT
            {
            lv_nome_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); 

            				newLeafNode(lv_nome_0_0, grammarAccess.getNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNomeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nome",
            					lv_nome_0_0,
            					"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
            			

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
    // $ANTLR end "ruleNome"


    // $ANTLR start "entryRuleAtributos"
    // InternalMyDsl.g:488:1: entryRuleAtributos returns [EObject current=null] : iv_ruleAtributos= ruleAtributos EOF ;
    public final EObject entryRuleAtributos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributos = null;


        try {
            // InternalMyDsl.g:488:50: (iv_ruleAtributos= ruleAtributos EOF )
            // InternalMyDsl.g:489:2: iv_ruleAtributos= ruleAtributos EOF
            {
             newCompositeNode(grammarAccess.getAtributosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtributos=ruleAtributos();

            state._fsp--;

             current =iv_ruleAtributos; 
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
    // $ANTLR end "entryRuleAtributos"


    // $ANTLR start "ruleAtributos"
    // InternalMyDsl.g:495:1: ruleAtributos returns [EObject current=null] : ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* ) ;
    public final EObject ruleAtributos() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_atributo_0_0 = null;

        EObject lv_atributoMais_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:501:2: ( ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* ) )
            // InternalMyDsl.g:502:2: ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* )
            {
            // InternalMyDsl.g:502:2: ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* )
            // InternalMyDsl.g:503:3: ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )*
            {
            // InternalMyDsl.g:503:3: ( (lv_atributo_0_0= ruleAtributo ) )
            // InternalMyDsl.g:504:4: (lv_atributo_0_0= ruleAtributo )
            {
            // InternalMyDsl.g:504:4: (lv_atributo_0_0= ruleAtributo )
            // InternalMyDsl.g:505:5: lv_atributo_0_0= ruleAtributo
            {

            					newCompositeNode(grammarAccess.getAtributosAccess().getAtributoAtributoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_atributo_0_0=ruleAtributo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributosRule());
            					}
            					set(
            						current,
            						"atributo",
            						lv_atributo_0_0,
            						"org.xtext.tcc.mydsl.MyDsl.Atributo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:522:3: (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:523:4: otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAtributosAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:527:4: ( (lv_atributoMais_2_0= ruleAtributo ) )
            	    // InternalMyDsl.g:528:5: (lv_atributoMais_2_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:528:5: (lv_atributoMais_2_0= ruleAtributo )
            	    // InternalMyDsl.g:529:6: lv_atributoMais_2_0= ruleAtributo
            	    {

            	    						newCompositeNode(grammarAccess.getAtributosAccess().getAtributoMaisAtributoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_atributoMais_2_0=ruleAtributo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAtributosRule());
            	    						}
            	    						add(
            	    							current,
            	    							"atributoMais",
            	    							lv_atributoMais_2_0,
            	    							"org.xtext.tcc.mydsl.MyDsl.Atributo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
    // $ANTLR end "ruleAtributos"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:551:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:551:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:552:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:558:1: ruleAtributo returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' ) ;
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
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_nomeAtributo_3_0 = null;

        EObject lv_atributoTipo_7_0 = null;

        EObject lv_associacao_11_0 = null;

        EObject lv_operacao_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:564:2: ( (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' ) )
            // InternalMyDsl.g:565:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' )
            {
            // InternalMyDsl.g:565:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' )
            // InternalMyDsl.g:566:3: otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:578:3: ( (lv_nomeAtributo_3_0= ruleNome ) )
            // InternalMyDsl.g:579:4: (lv_nomeAtributo_3_0= ruleNome )
            {
            // InternalMyDsl.g:579:4: (lv_nomeAtributo_3_0= ruleNome )
            // InternalMyDsl.g:580:5: lv_nomeAtributo_3_0= ruleNome
            {

            					newCompositeNode(grammarAccess.getAtributoAccess().getNomeAtributoNomeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_nomeAtributo_3_0=ruleNome();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtributoRule());
            					}
            					set(
            						current,
            						"nomeAtributo",
            						lv_nomeAtributo_3_0,
            						"org.xtext.tcc.mydsl.MyDsl.Nome");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getTipoAtributoKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getColonKeyword_6());
            		
            // InternalMyDsl.g:609:3: ( (lv_atributoTipo_7_0= ruleAtributoTipo ) )
            // InternalMyDsl.g:610:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            {
            // InternalMyDsl.g:610:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            // InternalMyDsl.g:611:5: lv_atributoTipo_7_0= ruleAtributoTipo
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

            otherlv_8=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getAssociaORelacionamentoKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getColonKeyword_10());
            		
            // InternalMyDsl.g:640:3: ( (lv_associacao_11_0= ruleAssociacao ) )
            // InternalMyDsl.g:641:4: (lv_associacao_11_0= ruleAssociacao )
            {
            // InternalMyDsl.g:641:4: (lv_associacao_11_0= ruleAssociacao )
            // InternalMyDsl.g:642:5: lv_associacao_11_0= ruleAssociacao
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

            otherlv_12=(Token)match(input,22,FOLLOW_21); 

            			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getCommaKeyword_12());
            		
            otherlv_13=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getAtributoAccess().getOperaOEmCascataKeyword_13());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_14, grammarAccess.getAtributoAccess().getColonKeyword_14());
            		
            otherlv_15=(Token)match(input,24,FOLLOW_22); 

            			newLeafNode(otherlv_15, grammarAccess.getAtributoAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalMyDsl.g:675:3: ( (lv_operacao_16_0= ruleOperacao ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NOME_OPERACAO) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:676:4: (lv_operacao_16_0= ruleOperacao )
                    {
                    // InternalMyDsl.g:676:4: (lv_operacao_16_0= ruleOperacao )
                    // InternalMyDsl.g:677:5: lv_operacao_16_0= ruleOperacao
                    {

                    					newCompositeNode(grammarAccess.getAtributoAccess().getOperacaoOperacaoParserRuleCall_16_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_operacao_16_0=ruleOperacao();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtributoRule());
                    					}
                    					set(
                    						current,
                    						"operacao",
                    						lv_operacao_16_0,
                    						"org.xtext.tcc.mydsl.MyDsl.Operacao");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getAtributoAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_18());
            		

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


    // $ANTLR start "entryRuleOperacao"
    // InternalMyDsl.g:706:1: entryRuleOperacao returns [EObject current=null] : iv_ruleOperacao= ruleOperacao EOF ;
    public final EObject entryRuleOperacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacao = null;


        try {
            // InternalMyDsl.g:706:49: (iv_ruleOperacao= ruleOperacao EOF )
            // InternalMyDsl.g:707:2: iv_ruleOperacao= ruleOperacao EOF
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
    // InternalMyDsl.g:713:1: ruleOperacao returns [EObject current=null] : ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* ) ;
    public final EObject ruleOperacao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_opCascada_0_0 = null;

        EObject lv_opCascadaMais_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:719:2: ( ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* ) )
            // InternalMyDsl.g:720:2: ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* )
            {
            // InternalMyDsl.g:720:2: ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* )
            // InternalMyDsl.g:721:3: ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )*
            {
            // InternalMyDsl.g:721:3: ( (lv_opCascada_0_0= ruleOperacaoCascada ) )
            // InternalMyDsl.g:722:4: (lv_opCascada_0_0= ruleOperacaoCascada )
            {
            // InternalMyDsl.g:722:4: (lv_opCascada_0_0= ruleOperacaoCascada )
            // InternalMyDsl.g:723:5: lv_opCascada_0_0= ruleOperacaoCascada
            {

            					newCompositeNode(grammarAccess.getOperacaoAccess().getOpCascadaOperacaoCascadaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_opCascada_0_0=ruleOperacaoCascada();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperacaoRule());
            					}
            					set(
            						current,
            						"opCascada",
            						lv_opCascada_0_0,
            						"org.xtext.tcc.mydsl.MyDsl.OperacaoCascada");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:740:3: (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:741:4: otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOperacaoAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:745:4: ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) )
            	    // InternalMyDsl.g:746:5: (lv_opCascadaMais_2_0= ruleOperacaoCascada )
            	    {
            	    // InternalMyDsl.g:746:5: (lv_opCascadaMais_2_0= ruleOperacaoCascada )
            	    // InternalMyDsl.g:747:6: lv_opCascadaMais_2_0= ruleOperacaoCascada
            	    {

            	    						newCompositeNode(grammarAccess.getOperacaoAccess().getOpCascadaMaisOperacaoCascadaParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_opCascadaMais_2_0=ruleOperacaoCascada();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOperacaoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"opCascadaMais",
            	    							lv_opCascadaMais_2_0,
            	    							"org.xtext.tcc.mydsl.MyDsl.OperacaoCascada");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
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
    // $ANTLR end "ruleOperacao"


    // $ANTLR start "entryRuleOperacaoCascada"
    // InternalMyDsl.g:769:1: entryRuleOperacaoCascada returns [EObject current=null] : iv_ruleOperacaoCascada= ruleOperacaoCascada EOF ;
    public final EObject entryRuleOperacaoCascada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacaoCascada = null;


        try {
            // InternalMyDsl.g:769:56: (iv_ruleOperacaoCascada= ruleOperacaoCascada EOF )
            // InternalMyDsl.g:770:2: iv_ruleOperacaoCascada= ruleOperacaoCascada EOF
            {
             newCompositeNode(grammarAccess.getOperacaoCascadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperacaoCascada=ruleOperacaoCascada();

            state._fsp--;

             current =iv_ruleOperacaoCascada; 
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
    // $ANTLR end "entryRuleOperacaoCascada"


    // $ANTLR start "ruleOperacaoCascada"
    // InternalMyDsl.g:776:1: ruleOperacaoCascada returns [EObject current=null] : ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) ) ;
    public final EObject ruleOperacaoCascada() throws RecognitionException {
        EObject current = null;

        Token lv_operacao_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:782:2: ( ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) ) )
            // InternalMyDsl.g:783:2: ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) )
            {
            // InternalMyDsl.g:783:2: ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) )
            // InternalMyDsl.g:784:3: (lv_operacao_0_0= RULE_NOME_OPERACAO )
            {
            // InternalMyDsl.g:784:3: (lv_operacao_0_0= RULE_NOME_OPERACAO )
            // InternalMyDsl.g:785:4: lv_operacao_0_0= RULE_NOME_OPERACAO
            {
            lv_operacao_0_0=(Token)match(input,RULE_NOME_OPERACAO,FOLLOW_2); 

            				newLeafNode(lv_operacao_0_0, grammarAccess.getOperacaoCascadaAccess().getOperacaoNOME_OPERACAOTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getOperacaoCascadaRule());
            				}
            				setWithLastConsumed(
            					current,
            					"operacao",
            					lv_operacao_0_0,
            					"org.xtext.tcc.mydsl.MyDsl.NOME_OPERACAO");
            			

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
    // $ANTLR end "ruleOperacaoCascada"


    // $ANTLR start "entryRuleAssociacao"
    // InternalMyDsl.g:804:1: entryRuleAssociacao returns [EObject current=null] : iv_ruleAssociacao= ruleAssociacao EOF ;
    public final EObject entryRuleAssociacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociacao = null;


        try {
            // InternalMyDsl.g:804:51: (iv_ruleAssociacao= ruleAssociacao EOF )
            // InternalMyDsl.g:805:2: iv_ruleAssociacao= ruleAssociacao EOF
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
    // InternalMyDsl.g:811:1: ruleAssociacao returns [EObject current=null] : ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) ) ;
    public final EObject ruleAssociacao() throws RecognitionException {
        EObject current = null;

        Token lv_associacao_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:817:2: ( ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) ) )
            // InternalMyDsl.g:818:2: ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) )
            {
            // InternalMyDsl.g:818:2: ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) )
            // InternalMyDsl.g:819:3: (lv_associacao_0_0= RULE_NOME_ASSOCIACAO )
            {
            // InternalMyDsl.g:819:3: (lv_associacao_0_0= RULE_NOME_ASSOCIACAO )
            // InternalMyDsl.g:820:4: lv_associacao_0_0= RULE_NOME_ASSOCIACAO
            {
            lv_associacao_0_0=(Token)match(input,RULE_NOME_ASSOCIACAO,FOLLOW_2); 

            				newLeafNode(lv_associacao_0_0, grammarAccess.getAssociacaoAccess().getAssociacaoNOME_ASSOCIACAOTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAssociacaoRule());
            				}
            				setWithLastConsumed(
            					current,
            					"associacao",
            					lv_associacao_0_0,
            					"org.xtext.tcc.mydsl.MyDsl.NOME_ASSOCIACAO");
            			

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
    // $ANTLR end "ruleAssociacao"


    // $ANTLR start "entryRuleAtributoTipo"
    // InternalMyDsl.g:839:1: entryRuleAtributoTipo returns [EObject current=null] : iv_ruleAtributoTipo= ruleAtributoTipo EOF ;
    public final EObject entryRuleAtributoTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoTipo = null;


        try {
            // InternalMyDsl.g:839:53: (iv_ruleAtributoTipo= ruleAtributoTipo EOF )
            // InternalMyDsl.g:840:2: iv_ruleAtributoTipo= ruleAtributoTipo EOF
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
    // InternalMyDsl.g:846:1: ruleAtributoTipo returns [EObject current=null] : ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleAtributoTipo() throws RecognitionException {
        EObject current = null;

        Token lv_tipoPrimitivo_0_0=null;
        Token lv_tipoColecao_1_0=null;
        Token lv_tipoObjeto_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:852:2: ( ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) ) )
            // InternalMyDsl.g:853:2: ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) )
            {
            // InternalMyDsl.g:853:2: ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_TIPO_PRIMITIVO:
                {
                alt5=1;
                }
                break;
            case RULE_TIPO_COLECAO:
                {
                alt5=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:854:3: ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) )
                    {
                    // InternalMyDsl.g:854:3: ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) )
                    // InternalMyDsl.g:855:4: (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO )
                    {
                    // InternalMyDsl.g:855:4: (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO )
                    // InternalMyDsl.g:856:5: lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO
                    {
                    lv_tipoPrimitivo_0_0=(Token)match(input,RULE_TIPO_PRIMITIVO,FOLLOW_2); 

                    					newLeafNode(lv_tipoPrimitivo_0_0, grammarAccess.getAtributoTipoAccess().getTipoPrimitivoTIPO_PRIMITIVOTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tipoPrimitivo",
                    						lv_tipoPrimitivo_0_0,
                    						"org.xtext.tcc.mydsl.MyDsl.TIPO_PRIMITIVO");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:873:3: ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) )
                    {
                    // InternalMyDsl.g:873:3: ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) )
                    // InternalMyDsl.g:874:4: (lv_tipoColecao_1_0= RULE_TIPO_COLECAO )
                    {
                    // InternalMyDsl.g:874:4: (lv_tipoColecao_1_0= RULE_TIPO_COLECAO )
                    // InternalMyDsl.g:875:5: lv_tipoColecao_1_0= RULE_TIPO_COLECAO
                    {
                    lv_tipoColecao_1_0=(Token)match(input,RULE_TIPO_COLECAO,FOLLOW_2); 

                    					newLeafNode(lv_tipoColecao_1_0, grammarAccess.getAtributoTipoAccess().getTipoColecaoTIPO_COLECAOTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tipoColecao",
                    						lv_tipoColecao_1_0,
                    						"org.xtext.tcc.mydsl.MyDsl.TIPO_COLECAO");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:892:3: ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) )
                    {
                    // InternalMyDsl.g:892:3: ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) )
                    // InternalMyDsl.g:893:4: (lv_tipoObjeto_2_0= RULE_STRING_LIT )
                    {
                    // InternalMyDsl.g:893:4: (lv_tipoObjeto_2_0= RULE_STRING_LIT )
                    // InternalMyDsl.g:894:5: lv_tipoObjeto_2_0= RULE_STRING_LIT
                    {
                    lv_tipoObjeto_2_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); 

                    					newLeafNode(lv_tipoObjeto_2_0, grammarAccess.getAtributoTipoAccess().getTipoObjetoSTRING_LITTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtributoTipoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tipoObjeto",
                    						lv_tipoObjeto_2_0,
                    						"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
                    				

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000190L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});

}