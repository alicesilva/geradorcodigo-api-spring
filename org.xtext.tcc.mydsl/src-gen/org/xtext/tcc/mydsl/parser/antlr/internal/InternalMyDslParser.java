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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING_LIST_LOW", "RULE_STRING_LIT", "RULE_NOME_OPERACAO", "RULE_NOME_ASSOCIACAO", "RULE_TIPO_PRIMITIVO", "RULE_TIPO_COLECAO", "RULE_STRING_I", "RULE_LETRA_I", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'\"Nome da Api\"'", "':'", "','", "'\"Entidades\"'", "'['", "']'", "'\"Nome\"'", "'\"Atributos\"'", "'\"nome-atributo\"'", "'\"tipo-atributo\"'", "'\"associa\\u00E7\\u00E3o/relacionamento\"'", "'\"opera\\u00E7\\u00E3o em cascata\"'"
    };
    public static final int RULE_STRING=14;
    public static final int RULE_TIPO_PRIMITIVO=8;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_STRING_I=10;
    public static final int RULE_NOME_ASSOCIACAO=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING_LIT=5;
    public static final int RULE_TIPO_COLECAO=9;
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int RULE_NOME_OPERACAO=6;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_STRING_LIST_LOW=4;
    public static final int RULE_LETRA_I=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
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
            otherlv_0=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:159:1: ruleApi returns [EObject current=null] : (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' ) ;
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
            // InternalMyDsl.g:165:2: ( (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' ) )
            // InternalMyDsl.g:166:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' )
            {
            // InternalMyDsl.g:166:2: (otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']' )
            // InternalMyDsl.g:167:3: otherlv_0= '\"Nome da Api\"' otherlv_1= ':' ( (lv_nomeApi_2_0= ruleApiNome ) ) otherlv_3= ',' otherlv_4= '\"Entidades\"' otherlv_5= ':' otherlv_6= '[' ( (lv_entidades_7_0= ruleEntidades ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getApiAccess().getNomeDaApiKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getApiAccess().getCommaKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getApiAccess().getEntidadesKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getApiAccess().getColonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getApiAccess().getLeftSquareBracketKeyword_6());
              		
            }
            // InternalMyDsl.g:210:3: ( (lv_entidades_7_0= ruleEntidades ) )
            // InternalMyDsl.g:211:4: (lv_entidades_7_0= ruleEntidades )
            {
            // InternalMyDsl.g:211:4: (lv_entidades_7_0= ruleEntidades )
            // InternalMyDsl.g:212:5: lv_entidades_7_0= ruleEntidades
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getApiAccess().getEntidadesEntidadesParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_entidades_7_0=ruleEntidades();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
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
    // InternalMyDsl.g:244:1: ruleApiNome returns [EObject current=null] : ( ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) ) | ( (lv_nome_1_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleApiNome() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;
        Token lv_nome_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( ( ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) ) | ( (lv_nome_1_0= RULE_STRING_LIT ) ) ) )
            // InternalMyDsl.g:251:2: ( ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) ) | ( (lv_nome_1_0= RULE_STRING_LIT ) ) )
            {
            // InternalMyDsl.g:251:2: ( ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) ) | ( (lv_nome_1_0= RULE_STRING_LIT ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING_LIST_LOW) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING_LIT) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:252:3: ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) )
                    {
                    // InternalMyDsl.g:252:3: ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) )
                    // InternalMyDsl.g:253:4: (lv_nome_0_0= RULE_STRING_LIST_LOW )
                    {
                    // InternalMyDsl.g:253:4: (lv_nome_0_0= RULE_STRING_LIST_LOW )
                    // InternalMyDsl.g:254:5: lv_nome_0_0= RULE_STRING_LIST_LOW
                    {
                    lv_nome_0_0=(Token)match(input,RULE_STRING_LIST_LOW,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nome_0_0, grammarAccess.getApiNomeAccess().getNomeSTRING_LIST_LOWTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getApiNomeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"nome",
                      						lv_nome_0_0,
                      						"org.xtext.tcc.mydsl.MyDsl.STRING_LIST_LOW");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:271:3: ( (lv_nome_1_0= RULE_STRING_LIT ) )
                    {
                    // InternalMyDsl.g:271:3: ( (lv_nome_1_0= RULE_STRING_LIT ) )
                    // InternalMyDsl.g:272:4: (lv_nome_1_0= RULE_STRING_LIT )
                    {
                    // InternalMyDsl.g:272:4: (lv_nome_1_0= RULE_STRING_LIT )
                    // InternalMyDsl.g:273:5: lv_nome_1_0= RULE_STRING_LIT
                    {
                    lv_nome_1_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_nome_1_0, grammarAccess.getApiNomeAccess().getNomeSTRING_LITTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getApiNomeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"nome",
                      						lv_nome_1_0,
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
    // $ANTLR end "ruleApiNome"


    // $ANTLR start "entryRuleEntidades"
    // InternalMyDsl.g:293:1: entryRuleEntidades returns [EObject current=null] : iv_ruleEntidades= ruleEntidades EOF ;
    public final EObject entryRuleEntidades() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidades = null;


        try {
            // InternalMyDsl.g:293:50: (iv_ruleEntidades= ruleEntidades EOF )
            // InternalMyDsl.g:294:2: iv_ruleEntidades= ruleEntidades EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntidadesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEntidades=ruleEntidades();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntidades; 
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
    // $ANTLR end "entryRuleEntidades"


    // $ANTLR start "ruleEntidades"
    // InternalMyDsl.g:300:1: ruleEntidades returns [EObject current=null] : ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* ) ;
    public final EObject ruleEntidades() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entidade_0_0 = null;

        EObject lv_entidadeMais_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:306:2: ( ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* ) )
            // InternalMyDsl.g:307:2: ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* )
            {
            // InternalMyDsl.g:307:2: ( ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )* )
            // InternalMyDsl.g:308:3: ( (lv_entidade_0_0= ruleEntidade ) ) (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )*
            {
            // InternalMyDsl.g:308:3: ( (lv_entidade_0_0= ruleEntidade ) )
            // InternalMyDsl.g:309:4: (lv_entidade_0_0= ruleEntidade )
            {
            // InternalMyDsl.g:309:4: (lv_entidade_0_0= ruleEntidade )
            // InternalMyDsl.g:310:5: lv_entidade_0_0= ruleEntidade
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntidadesAccess().getEntidadeEntidadeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_entidade_0_0=ruleEntidade();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMyDsl.g:327:3: (otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:328:4: otherlv_1= ',' ( (lv_entidadeMais_2_0= ruleEntidade ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getEntidadesAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:332:4: ( (lv_entidadeMais_2_0= ruleEntidade ) )
            	    // InternalMyDsl.g:333:5: (lv_entidadeMais_2_0= ruleEntidade )
            	    {
            	    // InternalMyDsl.g:333:5: (lv_entidadeMais_2_0= ruleEntidade )
            	    // InternalMyDsl.g:334:6: lv_entidadeMais_2_0= ruleEntidade
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEntidadesAccess().getEntidadeMaisEntidadeParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_entidadeMais_2_0=ruleEntidade();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleEntidades"


    // $ANTLR start "entryRuleEntidade"
    // InternalMyDsl.g:356:1: entryRuleEntidade returns [EObject current=null] : iv_ruleEntidade= ruleEntidade EOF ;
    public final EObject entryRuleEntidade() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntidade = null;


        try {
            // InternalMyDsl.g:356:49: (iv_ruleEntidade= ruleEntidade EOF )
            // InternalMyDsl.g:357:2: iv_ruleEntidade= ruleEntidade EOF
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
    // InternalMyDsl.g:363:1: ruleEntidade returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= '}' ) ;
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
        EObject lv_nomeEntidade_3_0 = null;

        EObject lv_atributos_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:369:2: ( (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= '}' ) )
            // InternalMyDsl.g:370:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= '}' )
            {
            // InternalMyDsl.g:370:2: (otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= '}' )
            // InternalMyDsl.g:371:3: otherlv_0= '{' otherlv_1= '\"Nome\"' otherlv_2= ':' ( (lv_nomeEntidade_3_0= ruleNome ) ) otherlv_4= ',' otherlv_5= '\"Atributos\"' otherlv_6= ':' otherlv_7= '[' ( (lv_atributos_8_0= ruleAtributos ) ) otherlv_9= ']' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEntidadeAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEntidadeAccess().getNomeKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEntidadeAccess().getColonKeyword_2());
              		
            }
            // InternalMyDsl.g:383:3: ( (lv_nomeEntidade_3_0= ruleNome ) )
            // InternalMyDsl.g:384:4: (lv_nomeEntidade_3_0= ruleNome )
            {
            // InternalMyDsl.g:384:4: (lv_nomeEntidade_3_0= ruleNome )
            // InternalMyDsl.g:385:5: lv_nomeEntidade_3_0= ruleNome
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntidadeAccess().getNomeEntidadeNomeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_nomeEntidade_3_0=ruleNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,23,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEntidadeAccess().getCommaKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEntidadeAccess().getAtributosKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEntidadeAccess().getColonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,25,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEntidadeAccess().getLeftSquareBracketKeyword_7());
              		
            }
            // InternalMyDsl.g:418:3: ( (lv_atributos_8_0= ruleAtributos ) )
            // InternalMyDsl.g:419:4: (lv_atributos_8_0= ruleAtributos )
            {
            // InternalMyDsl.g:419:4: (lv_atributos_8_0= ruleAtributos )
            // InternalMyDsl.g:420:5: lv_atributos_8_0= ruleAtributos
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEntidadeAccess().getAtributosAtributosParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_atributos_8_0=ruleAtributos();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_9=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEntidadeAccess().getRightSquareBracketKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getEntidadeAccess().getRightCurlyBracketKeyword_10());
              		
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


    // $ANTLR start "entryRuleNome"
    // InternalMyDsl.g:449:1: entryRuleNome returns [EObject current=null] : iv_ruleNome= ruleNome EOF ;
    public final EObject entryRuleNome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNome = null;


        try {
            // InternalMyDsl.g:449:45: (iv_ruleNome= ruleNome EOF )
            // InternalMyDsl.g:450:2: iv_ruleNome= ruleNome EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNomeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNome=ruleNome();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNome; 
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
    // $ANTLR end "entryRuleNome"


    // $ANTLR start "ruleNome"
    // InternalMyDsl.g:456:1: ruleNome returns [EObject current=null] : ( (lv_nome_0_0= RULE_STRING_LIT ) ) ;
    public final EObject ruleNome() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:462:2: ( ( (lv_nome_0_0= RULE_STRING_LIT ) ) )
            // InternalMyDsl.g:463:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            {
            // InternalMyDsl.g:463:2: ( (lv_nome_0_0= RULE_STRING_LIT ) )
            // InternalMyDsl.g:464:3: (lv_nome_0_0= RULE_STRING_LIT )
            {
            // InternalMyDsl.g:464:3: (lv_nome_0_0= RULE_STRING_LIT )
            // InternalMyDsl.g:465:4: lv_nome_0_0= RULE_STRING_LIT
            {
            lv_nome_0_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nome_0_0, grammarAccess.getNomeAccess().getNomeSTRING_LITTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleNome"


    // $ANTLR start "entryRuleNome_Atributo"
    // InternalMyDsl.g:484:1: entryRuleNome_Atributo returns [EObject current=null] : iv_ruleNome_Atributo= ruleNome_Atributo EOF ;
    public final EObject entryRuleNome_Atributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNome_Atributo = null;


        try {
            // InternalMyDsl.g:484:54: (iv_ruleNome_Atributo= ruleNome_Atributo EOF )
            // InternalMyDsl.g:485:2: iv_ruleNome_Atributo= ruleNome_Atributo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNome_AtributoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNome_Atributo=ruleNome_Atributo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNome_Atributo; 
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
    // $ANTLR end "entryRuleNome_Atributo"


    // $ANTLR start "ruleNome_Atributo"
    // InternalMyDsl.g:491:1: ruleNome_Atributo returns [EObject current=null] : ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) ) ;
    public final EObject ruleNome_Atributo() throws RecognitionException {
        EObject current = null;

        Token lv_nome_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:497:2: ( ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) ) )
            // InternalMyDsl.g:498:2: ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) )
            {
            // InternalMyDsl.g:498:2: ( (lv_nome_0_0= RULE_STRING_LIST_LOW ) )
            // InternalMyDsl.g:499:3: (lv_nome_0_0= RULE_STRING_LIST_LOW )
            {
            // InternalMyDsl.g:499:3: (lv_nome_0_0= RULE_STRING_LIST_LOW )
            // InternalMyDsl.g:500:4: lv_nome_0_0= RULE_STRING_LIST_LOW
            {
            lv_nome_0_0=(Token)match(input,RULE_STRING_LIST_LOW,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_nome_0_0, grammarAccess.getNome_AtributoAccess().getNomeSTRING_LIST_LOWTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getNome_AtributoRule());
              				}
              				setWithLastConsumed(
              					current,
              					"nome",
              					lv_nome_0_0,
              					"org.xtext.tcc.mydsl.MyDsl.STRING_LIST_LOW");
              			
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
    // $ANTLR end "ruleNome_Atributo"


    // $ANTLR start "entryRuleAtributos"
    // InternalMyDsl.g:519:1: entryRuleAtributos returns [EObject current=null] : iv_ruleAtributos= ruleAtributos EOF ;
    public final EObject entryRuleAtributos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributos = null;


        try {
            // InternalMyDsl.g:519:50: (iv_ruleAtributos= ruleAtributos EOF )
            // InternalMyDsl.g:520:2: iv_ruleAtributos= ruleAtributos EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtributosRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtributos=ruleAtributos();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtributos; 
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
    // $ANTLR end "entryRuleAtributos"


    // $ANTLR start "ruleAtributos"
    // InternalMyDsl.g:526:1: ruleAtributos returns [EObject current=null] : ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* ) ;
    public final EObject ruleAtributos() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_atributo_0_0 = null;

        EObject lv_atributoMais_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:532:2: ( ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* ) )
            // InternalMyDsl.g:533:2: ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* )
            {
            // InternalMyDsl.g:533:2: ( ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )* )
            // InternalMyDsl.g:534:3: ( (lv_atributo_0_0= ruleAtributo ) ) (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )*
            {
            // InternalMyDsl.g:534:3: ( (lv_atributo_0_0= ruleAtributo ) )
            // InternalMyDsl.g:535:4: (lv_atributo_0_0= ruleAtributo )
            {
            // InternalMyDsl.g:535:4: (lv_atributo_0_0= ruleAtributo )
            // InternalMyDsl.g:536:5: lv_atributo_0_0= ruleAtributo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtributosAccess().getAtributoAtributoParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_atributo_0_0=ruleAtributo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMyDsl.g:553:3: (otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:554:4: otherlv_1= ',' ( (lv_atributoMais_2_0= ruleAtributo ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAtributosAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:558:4: ( (lv_atributoMais_2_0= ruleAtributo ) )
            	    // InternalMyDsl.g:559:5: (lv_atributoMais_2_0= ruleAtributo )
            	    {
            	    // InternalMyDsl.g:559:5: (lv_atributoMais_2_0= ruleAtributo )
            	    // InternalMyDsl.g:560:6: lv_atributoMais_2_0= ruleAtributo
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAtributosAccess().getAtributoMaisAtributoParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_atributoMais_2_0=ruleAtributo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleAtributos"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:582:1: entryRuleAtributo returns [EObject current=null] : iv_ruleAtributo= ruleAtributo EOF ;
    public final EObject entryRuleAtributo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributo = null;


        try {
            // InternalMyDsl.g:582:49: (iv_ruleAtributo= ruleAtributo EOF )
            // InternalMyDsl.g:583:2: iv_ruleAtributo= ruleAtributo EOF
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
    // InternalMyDsl.g:589:1: ruleAtributo returns [EObject current=null] : (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome_Atributo ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' ) ;
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
            // InternalMyDsl.g:595:2: ( (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome_Atributo ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' ) )
            // InternalMyDsl.g:596:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome_Atributo ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' )
            {
            // InternalMyDsl.g:596:2: (otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome_Atributo ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}' )
            // InternalMyDsl.g:597:3: otherlv_0= '{' otherlv_1= '\"nome-atributo\"' otherlv_2= ':' ( (lv_nomeAtributo_3_0= ruleNome_Atributo ) ) otherlv_4= ',' otherlv_5= '\"tipo-atributo\"' otherlv_6= ':' ( (lv_atributoTipo_7_0= ruleAtributoTipo ) ) otherlv_8= ',' otherlv_9= '\"associa\\u00E7\\u00E3o/relacionamento\"' otherlv_10= ':' ( (lv_associacao_11_0= ruleAssociacao ) ) otherlv_12= ',' otherlv_13= '\"opera\\u00E7\\u00E3o em cascata\"' otherlv_14= ':' otherlv_15= '[' ( (lv_operacao_16_0= ruleOperacao ) )? otherlv_17= ']' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getNomeAtributoKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAtributoAccess().getColonKeyword_2());
              		
            }
            // InternalMyDsl.g:609:3: ( (lv_nomeAtributo_3_0= ruleNome_Atributo ) )
            // InternalMyDsl.g:610:4: (lv_nomeAtributo_3_0= ruleNome_Atributo )
            {
            // InternalMyDsl.g:610:4: (lv_nomeAtributo_3_0= ruleNome_Atributo )
            // InternalMyDsl.g:611:5: lv_nomeAtributo_3_0= ruleNome_Atributo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtributoAccess().getNomeAtributoNome_AtributoParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_nomeAtributo_3_0=ruleNome_Atributo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAtributoRule());
              					}
              					set(
              						current,
              						"nomeAtributo",
              						lv_nomeAtributo_3_0,
              						"org.xtext.tcc.mydsl.MyDsl.Nome_Atributo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAtributoAccess().getCommaKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAtributoAccess().getTipoAtributoKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAtributoAccess().getColonKeyword_6());
              		
            }
            // InternalMyDsl.g:640:3: ( (lv_atributoTipo_7_0= ruleAtributoTipo ) )
            // InternalMyDsl.g:641:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            {
            // InternalMyDsl.g:641:4: (lv_atributoTipo_7_0= ruleAtributoTipo )
            // InternalMyDsl.g:642:5: lv_atributoTipo_7_0= ruleAtributoTipo
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

            otherlv_8=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getAtributoAccess().getCommaKeyword_8());
              		
            }
            otherlv_9=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getAtributoAccess().getAssociaORelacionamentoKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getAtributoAccess().getColonKeyword_10());
              		
            }
            // InternalMyDsl.g:671:3: ( (lv_associacao_11_0= ruleAssociacao ) )
            // InternalMyDsl.g:672:4: (lv_associacao_11_0= ruleAssociacao )
            {
            // InternalMyDsl.g:672:4: (lv_associacao_11_0= ruleAssociacao )
            // InternalMyDsl.g:673:5: lv_associacao_11_0= ruleAssociacao
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAtributoAccess().getAssociacaoAssociacaoParserRuleCall_11_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_associacao_11_0=ruleAssociacao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_12=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getAtributoAccess().getCommaKeyword_12());
              		
            }
            otherlv_13=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getAtributoAccess().getOperaOEmCascataKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getAtributoAccess().getColonKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,25,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getAtributoAccess().getLeftSquareBracketKeyword_15());
              		
            }
            // InternalMyDsl.g:706:3: ( (lv_operacao_16_0= ruleOperacao ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_NOME_OPERACAO) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:707:4: (lv_operacao_16_0= ruleOperacao )
                    {
                    // InternalMyDsl.g:707:4: (lv_operacao_16_0= ruleOperacao )
                    // InternalMyDsl.g:708:5: lv_operacao_16_0= ruleOperacao
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAtributoAccess().getOperacaoOperacaoParserRuleCall_16_0());
                      				
                    }
                    pushFollow(FOLLOW_11);
                    lv_operacao_16_0=ruleOperacao();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_17=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getAtributoAccess().getRightSquareBracketKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getAtributoAccess().getRightCurlyBracketKeyword_18());
              		
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


    // $ANTLR start "entryRuleOperacao"
    // InternalMyDsl.g:737:1: entryRuleOperacao returns [EObject current=null] : iv_ruleOperacao= ruleOperacao EOF ;
    public final EObject entryRuleOperacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacao = null;


        try {
            // InternalMyDsl.g:737:49: (iv_ruleOperacao= ruleOperacao EOF )
            // InternalMyDsl.g:738:2: iv_ruleOperacao= ruleOperacao EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperacaoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperacao=ruleOperacao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperacao; 
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
    // $ANTLR end "entryRuleOperacao"


    // $ANTLR start "ruleOperacao"
    // InternalMyDsl.g:744:1: ruleOperacao returns [EObject current=null] : ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* ) ;
    public final EObject ruleOperacao() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_opCascada_0_0 = null;

        EObject lv_opCascadaMais_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:750:2: ( ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* ) )
            // InternalMyDsl.g:751:2: ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* )
            {
            // InternalMyDsl.g:751:2: ( ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )* )
            // InternalMyDsl.g:752:3: ( (lv_opCascada_0_0= ruleOperacaoCascada ) ) (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )*
            {
            // InternalMyDsl.g:752:3: ( (lv_opCascada_0_0= ruleOperacaoCascada ) )
            // InternalMyDsl.g:753:4: (lv_opCascada_0_0= ruleOperacaoCascada )
            {
            // InternalMyDsl.g:753:4: (lv_opCascada_0_0= ruleOperacaoCascada )
            // InternalMyDsl.g:754:5: lv_opCascada_0_0= ruleOperacaoCascada
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperacaoAccess().getOpCascadaOperacaoCascadaParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_opCascada_0_0=ruleOperacaoCascada();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMyDsl.g:771:3: (otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:772:4: otherlv_1= ',' ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOperacaoAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalMyDsl.g:776:4: ( (lv_opCascadaMais_2_0= ruleOperacaoCascada ) )
            	    // InternalMyDsl.g:777:5: (lv_opCascadaMais_2_0= ruleOperacaoCascada )
            	    {
            	    // InternalMyDsl.g:777:5: (lv_opCascadaMais_2_0= ruleOperacaoCascada )
            	    // InternalMyDsl.g:778:6: lv_opCascadaMais_2_0= ruleOperacaoCascada
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperacaoAccess().getOpCascadaMaisOperacaoCascadaParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_opCascadaMais_2_0=ruleOperacaoCascada();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleOperacao"


    // $ANTLR start "entryRuleOperacaoCascada"
    // InternalMyDsl.g:800:1: entryRuleOperacaoCascada returns [EObject current=null] : iv_ruleOperacaoCascada= ruleOperacaoCascada EOF ;
    public final EObject entryRuleOperacaoCascada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperacaoCascada = null;


        try {
            // InternalMyDsl.g:800:56: (iv_ruleOperacaoCascada= ruleOperacaoCascada EOF )
            // InternalMyDsl.g:801:2: iv_ruleOperacaoCascada= ruleOperacaoCascada EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperacaoCascadaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperacaoCascada=ruleOperacaoCascada();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperacaoCascada; 
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
    // $ANTLR end "entryRuleOperacaoCascada"


    // $ANTLR start "ruleOperacaoCascada"
    // InternalMyDsl.g:807:1: ruleOperacaoCascada returns [EObject current=null] : ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) ) ;
    public final EObject ruleOperacaoCascada() throws RecognitionException {
        EObject current = null;

        Token lv_operacao_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:813:2: ( ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) ) )
            // InternalMyDsl.g:814:2: ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) )
            {
            // InternalMyDsl.g:814:2: ( (lv_operacao_0_0= RULE_NOME_OPERACAO ) )
            // InternalMyDsl.g:815:3: (lv_operacao_0_0= RULE_NOME_OPERACAO )
            {
            // InternalMyDsl.g:815:3: (lv_operacao_0_0= RULE_NOME_OPERACAO )
            // InternalMyDsl.g:816:4: lv_operacao_0_0= RULE_NOME_OPERACAO
            {
            lv_operacao_0_0=(Token)match(input,RULE_NOME_OPERACAO,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_operacao_0_0, grammarAccess.getOperacaoCascadaAccess().getOperacaoNOME_OPERACAOTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleOperacaoCascada"


    // $ANTLR start "entryRuleAssociacao"
    // InternalMyDsl.g:835:1: entryRuleAssociacao returns [EObject current=null] : iv_ruleAssociacao= ruleAssociacao EOF ;
    public final EObject entryRuleAssociacao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociacao = null;


        try {
            // InternalMyDsl.g:835:51: (iv_ruleAssociacao= ruleAssociacao EOF )
            // InternalMyDsl.g:836:2: iv_ruleAssociacao= ruleAssociacao EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociacaoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssociacao=ruleAssociacao();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociacao; 
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
    // $ANTLR end "entryRuleAssociacao"


    // $ANTLR start "ruleAssociacao"
    // InternalMyDsl.g:842:1: ruleAssociacao returns [EObject current=null] : ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) ) ;
    public final EObject ruleAssociacao() throws RecognitionException {
        EObject current = null;

        Token lv_associacao_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:848:2: ( ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) ) )
            // InternalMyDsl.g:849:2: ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) )
            {
            // InternalMyDsl.g:849:2: ( (lv_associacao_0_0= RULE_NOME_ASSOCIACAO ) )
            // InternalMyDsl.g:850:3: (lv_associacao_0_0= RULE_NOME_ASSOCIACAO )
            {
            // InternalMyDsl.g:850:3: (lv_associacao_0_0= RULE_NOME_ASSOCIACAO )
            // InternalMyDsl.g:851:4: lv_associacao_0_0= RULE_NOME_ASSOCIACAO
            {
            lv_associacao_0_0=(Token)match(input,RULE_NOME_ASSOCIACAO,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_associacao_0_0, grammarAccess.getAssociacaoAccess().getAssociacaoNOME_ASSOCIACAOTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleAssociacao"


    // $ANTLR start "entryRuleAtributoTipo"
    // InternalMyDsl.g:870:1: entryRuleAtributoTipo returns [EObject current=null] : iv_ruleAtributoTipo= ruleAtributoTipo EOF ;
    public final EObject entryRuleAtributoTipo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtributoTipo = null;


        try {
            // InternalMyDsl.g:870:53: (iv_ruleAtributoTipo= ruleAtributoTipo EOF )
            // InternalMyDsl.g:871:2: iv_ruleAtributoTipo= ruleAtributoTipo EOF
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
    // InternalMyDsl.g:877:1: ruleAtributoTipo returns [EObject current=null] : ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) ) ;
    public final EObject ruleAtributoTipo() throws RecognitionException {
        EObject current = null;

        Token lv_tipoPrimitivo_0_0=null;
        Token lv_tipoColecao_1_0=null;
        Token lv_tipoObjeto_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:883:2: ( ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) ) )
            // InternalMyDsl.g:884:2: ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) )
            {
            // InternalMyDsl.g:884:2: ( ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) ) | ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) ) | ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_TIPO_PRIMITIVO:
                {
                alt6=1;
                }
                break;
            case RULE_TIPO_COLECAO:
                {
                alt6=2;
                }
                break;
            case RULE_STRING_LIT:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:885:3: ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) )
                    {
                    // InternalMyDsl.g:885:3: ( (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO ) )
                    // InternalMyDsl.g:886:4: (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO )
                    {
                    // InternalMyDsl.g:886:4: (lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO )
                    // InternalMyDsl.g:887:5: lv_tipoPrimitivo_0_0= RULE_TIPO_PRIMITIVO
                    {
                    lv_tipoPrimitivo_0_0=(Token)match(input,RULE_TIPO_PRIMITIVO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_tipoPrimitivo_0_0, grammarAccess.getAtributoTipoAccess().getTipoPrimitivoTIPO_PRIMITIVOTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:904:3: ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) )
                    {
                    // InternalMyDsl.g:904:3: ( (lv_tipoColecao_1_0= RULE_TIPO_COLECAO ) )
                    // InternalMyDsl.g:905:4: (lv_tipoColecao_1_0= RULE_TIPO_COLECAO )
                    {
                    // InternalMyDsl.g:905:4: (lv_tipoColecao_1_0= RULE_TIPO_COLECAO )
                    // InternalMyDsl.g:906:5: lv_tipoColecao_1_0= RULE_TIPO_COLECAO
                    {
                    lv_tipoColecao_1_0=(Token)match(input,RULE_TIPO_COLECAO,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_tipoColecao_1_0, grammarAccess.getAtributoTipoAccess().getTipoColecaoTIPO_COLECAOTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:923:3: ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) )
                    {
                    // InternalMyDsl.g:923:3: ( (lv_tipoObjeto_2_0= RULE_STRING_LIT ) )
                    // InternalMyDsl.g:924:4: (lv_tipoObjeto_2_0= RULE_STRING_LIT )
                    {
                    // InternalMyDsl.g:924:4: (lv_tipoObjeto_2_0= RULE_STRING_LIT )
                    // InternalMyDsl.g:925:5: lv_tipoObjeto_2_0= RULE_STRING_LIT
                    {
                    lv_tipoObjeto_2_0=(Token)match(input,RULE_STRING_LIT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_tipoObjeto_2_0, grammarAccess.getAtributoTipoAccess().getTipoObjetoSTRING_LITTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}