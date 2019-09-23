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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_LIT", "RULE_TIPO_DEFINIDO", "RULE_LETRA", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'\"Nome da Api\"'", "':'", "','", "'\"Entidades\"'", "'['", "']'", "'\"Nome\"'", "'\"Atributos\"'", "'\"Chave Primaria\"'", "'\"Nome do pacote\"'", "'\"nome-atributo\"'", "'\"tipo-atributo\"'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_LETRA=7;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_TIPO_DEFINIDO=6;
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




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:70:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:70:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:71:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:77:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:83:2: ( ( (lv_greetings_0_0= ruleGreeting ) ) )
            // InternalMyDsl.g:84:2: ( (lv_greetings_0_0= ruleGreeting ) )
            {
            // InternalMyDsl.g:84:2: ( (lv_greetings_0_0= ruleGreeting ) )
            // InternalMyDsl.g:85:3: (lv_greetings_0_0= ruleGreeting )
            {
            // InternalMyDsl.g:85:3: (lv_greetings_0_0= ruleGreeting )
            // InternalMyDsl.g:86:4: lv_greetings_0_0= ruleGreeting
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_greetings_0_0=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalMyDsl.g:106:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalMyDsl.g:107:2: iv_ruleGreeting= ruleGreeting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreetingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreeting; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:113:1: ruleGreeting returns [EObject current=null] : (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_api_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:119:2: ( (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' ) )
            // InternalMyDsl.g:120:2: (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' )
            {
            // InternalMyDsl.g:120:2: (otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}' )
            // InternalMyDsl.g:121:3: otherlv_0= '{' ( (lv_api_1_0= ruleApi ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMyDsl.g:125:3: ( (lv_api_1_0= ruleApi ) )
            // InternalMyDsl.g:126:4: (lv_api_1_0= ruleApi )
            {
            // InternalMyDsl.g:126:4: (lv_api_1_0= ruleApi )
            // InternalMyDsl.g:127:5: lv_api_1_0= ruleApi
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_api_1_0=ruleApi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:152:1: entryRuleApi returns [EObject current=null] : iv_ruleApi= ruleApi EOF ;
    public final EObject entryRuleApi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApi = null;


        try {
            // InternalMyDsl.g:152:44: (iv_ruleApi= ruleApi EOF )
            // InternalMyDsl.g:153:2: iv_ruleApi= ruleApi EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApiRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApi=ruleApi();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApi; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:159:1: ruleApi returns [EObject current=null] : (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' ) ;
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
            // InternalMyDsl.g:165:2: ( (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' ) )
            // InternalMyDsl.g:166:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' )
            {
            // InternalMyDsl.g:166:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']' )
            // InternalMyDsl.g:167:3: otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidade ) )+ otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getApiAccess().getNomeDaApiKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getApiAccess().getColonKeyword_1());
              		
            }
            // InternalMyDsl.g:175:3: ( (lv_nomeApi_2_0= ruleApiNome ) )
            // InternalMyDsl.g:176:4: (lv_nomeApi_2_0= ruleApiNome )
            {
            // InternalMyDsl.g:176:4: (lv_nomeApi_2_0= ruleApiNome )
            // InternalMyDsl.g:177:5: lv_nomeApi_2_0= ruleApiNome
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getApiAccess().getNomeApiApiNomeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_nomeApi_2_0=ruleApiNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,18,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getCommaKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getApiAccess().getEntidadesKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getApiAccess().getColonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getApiAccess().getLeftSquareBracketKeyword_6());
              		
            }
            // InternalMyDsl.g:210:3: ( (lv_entidades_7_0= ruleEntidade ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:211:4: (lv_entidades_7_0= ruleEntidade )
            	    {
            	    // InternalMyDsl.g:211:4: (lv_entidades_7_0= ruleEntidade )
            	    // InternalMyDsl.g:212:5: lv_entidades_7_0= ruleEntidade
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadeParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_entidades_7_0=ruleEntidade();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getApiAccess().getRightSquareBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleApiNome"
    // InternalMyDsl.g:237:1: entryRuleApiNome returns [EObject current=null] : iv_ruleApiNome= ruleApiNome EOF ;
    public final EObject entryRuleApiNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApiNome = null;


        try {
            // InternalMyDsl.g:237:48: (iv_ruleApiNome= ruleApiNome EOF )
            // InternalMyDsl.g:238:2: iv_ruleApiNome= ruleApiNome EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApiNomeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApiNome=ruleApiNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApiNome; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:244:1: ruleApiNome returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleApiNome() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:251:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:251:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:252:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:252:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:253:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getApiNomeAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleApiNome"


    // $ANTLR start "entryRuleEntidade"
    // InternalMyDsl.g:272:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalMyDsl.g:272:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalMyDsl.g:273:2: iv_ruleEntidade= ruleEntidade EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntidadeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntidade=ruleEntidade();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntidade; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:279:1: ruleEntidade returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= ',' otherlv_15= '\"Nome do pacote\"' otherlv_16= ':' ( (lv_package_17_0= rulePackageName ) ) otherlv_18= '}' ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_nomeEntidades_3_0 = null;

        EObject lv_atributos_8_0 = null;

        EObject lv_chavePrimaria_13_0 = null;

        EObject lv_package_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:285:2: ( (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= ',' otherlv_15= '\"Nome do pacote\"' otherlv_16= ':' ( (lv_package_17_0= rulePackageName ) ) otherlv_18= '}' ) )
            // InternalMyDsl.g:286:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= ',' otherlv_15= '\"Nome do pacote\"' otherlv_16= ':' ( (lv_package_17_0= rulePackageName ) ) otherlv_18= '}' )
            {
            // InternalMyDsl.g:286:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= ',' otherlv_15= '\"Nome do pacote\"' otherlv_16= ':' ( (lv_package_17_0= rulePackageName ) ) otherlv_18= '}' )
            // InternalMyDsl.g:287:3: otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributo ) )+ otherlv_9= ']' otherlv_10= ',' otherlv_11= '\"Chave Primaria\"' otherlv_12= ':' ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) ) otherlv_14= ',' otherlv_15= '\"Nome do pacote\"' otherlv_16= ':' ( (lv_package_17_0= rulePackageName ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEntidadeAccess().getNomeKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getColonKeyword_2());
              		
            }
            // InternalMyDsl.g:299:3: ( (lv_nomeEntidades_3_0= ruleEntidadeNome ) )
            // InternalMyDsl.g:300:4: (lv_nomeEntidades_3_0= ruleEntidadeNome )
            {
            // InternalMyDsl.g:300:4: (lv_nomeEntidades_3_0= ruleEntidadeNome )
            // InternalMyDsl.g:301:5: lv_nomeEntidades_3_0= ruleEntidadeNome
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadesEntidadeNomeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_nomeEntidades_3_0=ruleEntidadeNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getCommaKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEntidadeAccess().getAtributosKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEntidadeAccess().getColonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEntidadeAccess().getLeftSquareBracketKeyword_7());
              		
            }
            // InternalMyDsl.g:334:3: ( (lv_atributos_8_0= ruleAtributo ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:335:4: (lv_atributos_8_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:335:4: (lv_atributos_8_0= ruleAtributo )
            	    // InternalMyDsl.g:336:5: lv_atributos_8_0= ruleAtributo
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributosAtributoParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_atributos_8_0=ruleAtributo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEntidadeAccess().getRightSquareBracketKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getEntidadeAccess().getCommaKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getEntidadeAccess().getChavePrimariaKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getEntidadeAccess().getColonKeyword_12());
              		
            }
            // InternalMyDsl.g:369:3: ( (lv_chavePrimaria_13_0= ruleChavePrimaria ) )
            // InternalMyDsl.g:370:4: (lv_chavePrimaria_13_0= ruleChavePrimaria )
            {
            // InternalMyDsl.g:370:4: (lv_chavePrimaria_13_0= ruleChavePrimaria )
            // InternalMyDsl.g:371:5: lv_chavePrimaria_13_0= ruleChavePrimaria
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntidadeAccess().getChavePrimariaChavePrimariaParserRuleCall_13_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_chavePrimaria_13_0=ruleChavePrimaria();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_14=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getEntidadeAccess().getCommaKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getEntidadeAccess().getNomeDoPacoteKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getEntidadeAccess().getColonKeyword_16());
              		
            }
            // InternalMyDsl.g:400:3: ( (lv_package_17_0= rulePackageName ) )
            // InternalMyDsl.g:401:4: (lv_package_17_0= rulePackageName )
            {
            // InternalMyDsl.g:401:4: (lv_package_17_0= rulePackageName )
            // InternalMyDsl.g:402:5: lv_package_17_0= rulePackageName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntidadeAccess().getPackagePackageNameParserRuleCall_17_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_package_17_0=rulePackageName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEntidadeRule());
              					}
              					set(
              						current,
              						"package",
              						lv_package_17_0,
              						"org.xtext.tcc.mydsl.MyDsl.PackageName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_18());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntidade"


    // $ANTLR start "entryRuleEntidadeNome"
    // InternalMyDsl.g:427:1: entryRuleEntidadeNome returns [EObject current=null] : iv_ruleEntidadeNome= ruleEntidadeNome EOF ;
    public final EObject entryRuleEntidadeNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidadeNome = null;


        try {
            // InternalMyDsl.g:427:53: (iv_ruleEntidadeNome= ruleEntidadeNome EOF )
            // InternalMyDsl.g:428:2: iv_ruleEntidadeNome= ruleEntidadeNome EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntidadeNomeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntidadeNome=ruleEntidadeNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntidadeNome; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:434:1: ruleEntidadeNome returns [EObject current=null] : ( (lv_nome_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleEntidadeNome() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:440:2: ( ( (lv_nome_0_0= RULE_STRING_LIT ) ) )
            // InternalMyDsl.g:441:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            {
            // InternalMyDsl.g:441:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            // InternalMyDsl.g:442:3: (lv_nome_0_0= RULE_STRING_LIT )
            {
            // InternalMyDsl.g:442:3: (lv_nome_0_0= RULE_STRING_LIT )
            // InternalMyDsl.g:443:4: lv_nome_0_0= RULE_STRING_LIT
            {
            lv_nome_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nome_0_0, grammarAccess.getEntidadeNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEntidadeNomeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"nome",
              					lv_nome_0_0,
              					"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEntidadeNome"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:462:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:462:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:463:2: iv_ruleAtributo= ruleAtributo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtributoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtributo=ruleAtributo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtributo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:469:1: ruleAtributo returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '}' ) ;
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
        EObject lv_atributoNome_3_0 = null;

        EObject lv_atributoTipo_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:475:2: ( (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '}' ) )
            // InternalMyDsl.g:476:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '}' )
            {
            // InternalMyDsl.g:476:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '}' )
            // InternalMyDsl.g:477:3: otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_atributoNome_3_0= ruleAtributoNome ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getColonKeyword_2());
              		
            }
            // InternalMyDsl.g:489:3: ( (lv_atributoNome_3_0= ruleAtributoNome ) )
            // InternalMyDsl.g:490:4: (lv_atributoNome_3_0= ruleAtributoNome )
            {
            // InternalMyDsl.g:490:4: (lv_atributoNome_3_0= ruleAtributoNome )
            // InternalMyDsl.g:491:5: lv_atributoNome_3_0= ruleAtributoNome
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoNomeAtributoNomeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_atributoNome_3_0=ruleAtributoNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getCommaKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getTipoAtributoKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,17,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getColonKeyword_6());
              		
            }
            // InternalMyDsl.g:520:3: ( (lv_atributoTipo_7_0= ruleAtributoTipo ) )
            // InternalMyDsl.g:521:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            {
            // InternalMyDsl.g:521:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            // InternalMyDsl.g:522:5: lv_atributoTipo_7_0= ruleAtributoTipo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtributoAccess().getAtributoTipoAtributoTipoParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_atributoTipo_7_0=ruleAtributoTipo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getCommaKeyword_8());
              		
            }
            otherlv_9=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleAtributoNome"
    // InternalMyDsl.g:551:1: entryRuleAtributoNome returns [EObject current=null] : iv_ruleAtributoNome= ruleAtributoNome EOF ;
    public final EObject entryRuleAtributoNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoNome = null;


        try {
            // InternalMyDsl.g:551:53: (iv_ruleAtributoNome= ruleAtributoNome EOF )
            // InternalMyDsl.g:552:2: iv_ruleAtributoNome= ruleAtributoNome EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtributoNomeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtributoNome=ruleAtributoNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtributoNome; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:558:1: ruleAtributoNome returns [EObject current=null] : ( (lv_nome_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleAtributoNome() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:564:2: ( ( (lv_nome_0_0= RULE_STRING_LIT ) ) )
            // InternalMyDsl.g:565:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            {
            // InternalMyDsl.g:565:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            // InternalMyDsl.g:566:3: (lv_nome_0_0= RULE_STRING_LIT )
            {
            // InternalMyDsl.g:566:3: (lv_nome_0_0= RULE_STRING_LIT )
            // InternalMyDsl.g:567:4: lv_nome_0_0= RULE_STRING_LIT
            {
            lv_nome_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nome_0_0, grammarAccess.getAtributoNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getAtributoNomeRule());
              				}
              				setWithLastConsumed(
              					current,
              					"nome",
              					lv_nome_0_0,
              					"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtributoNome"


    // $ANTLR start "entryRuleAtributoTipo"
    // InternalMyDsl.g:586:1: entryRuleAtributoTipo returns [EObject current=null] : iv_ruleAtributoTipo= ruleAtributoTipo EOF ;
    public final EObject entryRuleAtributoTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoTipo = null;


        try {
            // InternalMyDsl.g:586:53: (iv_ruleAtributoTipo= ruleAtributoTipo EOF )
            // InternalMyDsl.g:587:2: iv_ruleAtributoTipo= ruleAtributoTipo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtributoTipoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtributoTipo=ruleAtributoTipo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtributoTipo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:593:1: ruleAtributoTipo returns [EObject current=null] : ( ( (lv_tipoP_0_0= RULE_TIPO_DEFINIDO ) ) | ( (lv_tipoE_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleAtributoTipo() throws RecognitionException {
        EObject current = null;

        Token lv_tipoP_0_0=null;
        Token lv_tipoE_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:599:2: ( ( ( (lv_tipoP_0_0= RULE_TIPO_DEFINIDO ) ) | ( (lv_tipoE_1_0= RULE_STRING_LIT ) ) ) )
            // InternalMyDsl.g:600:2: ( ( (lv_tipoP_0_0= RULE_TIPO_DEFINIDO ) ) | ( (lv_tipoE_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalMyDsl.g:600:2: ( ( (lv_tipoP_0_0= RULE_TIPO_DEFINIDO ) ) | ( (lv_tipoE_1_0= RULE_STRING_LIT ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TIPO_DEFINIDO) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING_LIT) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:601:3: ( (lv_tipoP_0_0= RULE_TIPO_DEFINIDO ) )
                    {
                    // InternalMyDsl.g:601:3: ( (lv_tipoP_0_0= RULE_TIPO_DEFINIDO ) )
                    // InternalMyDsl.g:602:4: (lv_tipoP_0_0= RULE_TIPO_DEFINIDO )
                    {
                    // InternalMyDsl.g:602:4: (lv_tipoP_0_0= RULE_TIPO_DEFINIDO )
                    // InternalMyDsl.g:603:5: lv_tipoP_0_0= RULE_TIPO_DEFINIDO
                    {
                    lv_tipoP_0_0=(Token)match(input,RULE_TIPO_DEFINIDO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_tipoP_0_0, grammarAccess.getAtributoTipoAccess().getTipoPTIPO_DEFINIDOTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAtributoTipoRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"tipoP",
                      						lv_tipoP_0_0,
                      						"org.xtext.tcc.mydsl.MyDsl.TIPO_DEFINIDO");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:620:3: ( (lv_tipoE_1_0= RULE_STRING_LIT ) )
                    {
                    // InternalMyDsl.g:620:3: ( (lv_tipoE_1_0= RULE_STRING_LIT ) )
                    // InternalMyDsl.g:621:4: (lv_tipoE_1_0= RULE_STRING_LIT )
                    {
                    // InternalMyDsl.g:621:4: (lv_tipoE_1_0= RULE_STRING_LIT )
                    // InternalMyDsl.g:622:5: lv_tipoE_1_0= RULE_STRING_LIT
                    {
                    lv_tipoE_1_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_tipoE_1_0, grammarAccess.getAtributoTipoAccess().getTipoESTRING_LITTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAtributoTipoRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"tipoE",
                      						lv_tipoE_1_0,
                      						"org.xtext.tcc.mydsl.MyDsl.STRING_LIT");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtributoTipo"


    // $ANTLR start "entryRuleChavePrimaria"
    // InternalMyDsl.g:642:1: entryRuleChavePrimaria returns [EObject current=null] : iv_ruleChavePrimaria= ruleChavePrimaria EOF ;
    public final EObject entryRuleChavePrimaria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChavePrimaria = null;


        try {
            // InternalMyDsl.g:642:54: (iv_ruleChavePrimaria= ruleChavePrimaria EOF )
            // InternalMyDsl.g:643:2: iv_ruleChavePrimaria= ruleChavePrimaria EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChavePrimariaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChavePrimaria=ruleChavePrimaria();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChavePrimaria; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMyDsl.g:649:1: ruleChavePrimaria returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject ruleChavePrimaria() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:655:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:656:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:656:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:657:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:657:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:658:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getChavePrimariaAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChavePrimaria"


    // $ANTLR start "entryRulePackageName"
    // InternalMyDsl.g:677:1: entryRulePackageName returns [EObject current=null] : iv_rulePackageName= rulePackageName EOF ;
    public final EObject entryRulePackageName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageName = null;


        try {
            // InternalMyDsl.g:677:52: (iv_rulePackageName= rulePackageName EOF )
            // InternalMyDsl.g:678:2: iv_rulePackageName= rulePackageName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePackageName=rulePackageName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackageName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePackageName"


    // $ANTLR start "rulePackageName"
    // InternalMyDsl.g:684:1: rulePackageName returns [EObject current=null] : ( (lv_id_0_0= RULE_ID ) ) ;
    public final EObject rulePackageName() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:690:2: ( ( (lv_id_0_0= RULE_ID ) ) )
            // InternalMyDsl.g:691:2: ( (lv_id_0_0= RULE_ID ) )
            {
            // InternalMyDsl.g:691:2: ( (lv_id_0_0= RULE_ID ) )
            // InternalMyDsl.g:692:3: (lv_id_0_0= RULE_ID )
            {
            // InternalMyDsl.g:692:3: (lv_id_0_0= RULE_ID )
            // InternalMyDsl.g:693:4: lv_id_0_0= RULE_ID
            {
            lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_id_0_0, grammarAccess.getPackageNameAccess().getIdIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getPackageNameRule());
              				}
              				setWithLastConsumed(
              					current,
              					"id",
              					lv_id_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePackageName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000060L});

}