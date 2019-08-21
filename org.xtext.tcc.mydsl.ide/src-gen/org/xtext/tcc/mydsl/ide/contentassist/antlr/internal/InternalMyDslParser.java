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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Yes'", "'No'", "'{'", "'}'", "':{'", "'atributos:'", "'['", "'nome:'", "','", "'tipo:'", "'metodoGet:'", "'metodoSet:'", "'id:'", "']'", "'String'", "'Int'", "'Double'", "'Boolean'"
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalMyDsl.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleGreeting EOF )
            // InternalMyDsl.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalMyDsl.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Greeting__Group__0 )
            // InternalMyDsl.g:94:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:103:1: entryRuleApi : ruleApi EOF ;
    public final void entryRuleApi() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleApi EOF )
            // InternalMyDsl.g:105:1: ruleApi EOF
            {
             before(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getApiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:112:1: ruleApi : ( ( rule__Api__Group__0 ) ) ;
    public final void ruleApi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Api__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Api__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Api__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Api__Group__0 )
            {
             before(grammarAccess.getApiAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Api__Group__0 )
            // InternalMyDsl.g:119:4: rule__Api__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleAPIName"
    // InternalMyDsl.g:128:1: entryRuleAPIName : ruleAPIName EOF ;
    public final void entryRuleAPIName() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAPIName EOF )
            // InternalMyDsl.g:130:1: ruleAPIName EOF
            {
             before(grammarAccess.getAPINameRule()); 
            pushFollow(FOLLOW_1);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getAPINameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAPIName"


    // $ANTLR start "ruleAPIName"
    // InternalMyDsl.g:137:1: ruleAPIName : ( ( rule__APIName__IdAssignment ) ) ;
    public final void ruleAPIName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__APIName__IdAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__APIName__IdAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__APIName__IdAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__APIName__IdAssignment )
            {
             before(grammarAccess.getAPINameAccess().getIdAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__APIName__IdAssignment )
            // InternalMyDsl.g:144:4: rule__APIName__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__APIName__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAPINameAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPIName"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeName"
    // InternalMyDsl.g:178:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAttributeName EOF )
            // InternalMyDsl.g:180:1: ruleAttributeName EOF
            {
             before(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // InternalMyDsl.g:187:1: ruleAttributeName : ( ( rule__AttributeName__IdAssignment ) ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AttributeName__IdAssignment ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AttributeName__IdAssignment ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AttributeName__IdAssignment ) )
            // InternalMyDsl.g:193:3: ( rule__AttributeName__IdAssignment )
            {
             before(grammarAccess.getAttributeNameAccess().getIdAssignment()); 
            // InternalMyDsl.g:194:3: ( rule__AttributeName__IdAssignment )
            // InternalMyDsl.g:194:4: rule__AttributeName__IdAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AttributeName__IdAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeNameAccess().getIdAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleAttributeType"
    // InternalMyDsl.g:203:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAttributeType EOF )
            // InternalMyDsl.g:205:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalMyDsl.g:212:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__AttributeType__Alternatives )
            // InternalMyDsl.g:219:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleBool"
    // InternalMyDsl.g:228:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleBool EOF )
            // InternalMyDsl.g:230:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalMyDsl.g:237:1: ruleBool : ( ( rule__Bool__Alternatives ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Bool__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Bool__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Bool__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Bool__Alternatives )
            {
             before(grammarAccess.getBoolAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Bool__Alternatives )
            // InternalMyDsl.g:244:4: rule__Bool__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalMyDsl.g:252:1: rule__AttributeType__Alternatives : ( ( ( rule__AttributeType__IdAssignment_0 ) ) | ( ( rule__AttributeType__IdAssignment_1 ) ) | ( ( rule__AttributeType__IdAssignment_2 ) ) | ( ( rule__AttributeType__IdAssignment_3 ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( ( ( rule__AttributeType__IdAssignment_0 ) ) | ( ( rule__AttributeType__IdAssignment_1 ) ) | ( ( rule__AttributeType__IdAssignment_2 ) ) | ( ( rule__AttributeType__IdAssignment_3 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
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
                    // InternalMyDsl.g:257:2: ( ( rule__AttributeType__IdAssignment_0 ) )
                    {
                    // InternalMyDsl.g:257:2: ( ( rule__AttributeType__IdAssignment_0 ) )
                    // InternalMyDsl.g:258:3: ( rule__AttributeType__IdAssignment_0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIdAssignment_0()); 
                    // InternalMyDsl.g:259:3: ( rule__AttributeType__IdAssignment_0 )
                    // InternalMyDsl.g:259:4: rule__AttributeType__IdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:263:2: ( ( rule__AttributeType__IdAssignment_1 ) )
                    {
                    // InternalMyDsl.g:263:2: ( ( rule__AttributeType__IdAssignment_1 ) )
                    // InternalMyDsl.g:264:3: ( rule__AttributeType__IdAssignment_1 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIdAssignment_1()); 
                    // InternalMyDsl.g:265:3: ( rule__AttributeType__IdAssignment_1 )
                    // InternalMyDsl.g:265:4: rule__AttributeType__IdAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__IdAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getIdAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:269:2: ( ( rule__AttributeType__IdAssignment_2 ) )
                    {
                    // InternalMyDsl.g:269:2: ( ( rule__AttributeType__IdAssignment_2 ) )
                    // InternalMyDsl.g:270:3: ( rule__AttributeType__IdAssignment_2 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIdAssignment_2()); 
                    // InternalMyDsl.g:271:3: ( rule__AttributeType__IdAssignment_2 )
                    // InternalMyDsl.g:271:4: rule__AttributeType__IdAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__IdAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getIdAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:275:2: ( ( rule__AttributeType__IdAssignment_3 ) )
                    {
                    // InternalMyDsl.g:275:2: ( ( rule__AttributeType__IdAssignment_3 ) )
                    // InternalMyDsl.g:276:3: ( rule__AttributeType__IdAssignment_3 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getIdAssignment_3()); 
                    // InternalMyDsl.g:277:3: ( rule__AttributeType__IdAssignment_3 )
                    // InternalMyDsl.g:277:4: rule__AttributeType__IdAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__IdAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getIdAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__Bool__Alternatives"
    // InternalMyDsl.g:285:1: rule__Bool__Alternatives : ( ( 'Yes' ) | ( 'No' ) );
    public final void rule__Bool__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( ( 'Yes' ) | ( 'No' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:290:2: ( 'Yes' )
                    {
                    // InternalMyDsl.g:290:2: ( 'Yes' )
                    // InternalMyDsl.g:291:3: 'Yes'
                    {
                     before(grammarAccess.getBoolAccess().getYesKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getYesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:296:2: ( 'No' )
                    {
                    // InternalMyDsl.g:296:2: ( 'No' )
                    // InternalMyDsl.g:297:3: 'No'
                    {
                     before(grammarAccess.getBoolAccess().getNoKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBoolAccess().getNoKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Alternatives"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalMyDsl.g:306:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalMyDsl.g:311:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalMyDsl.g:318:1: rule__Greeting__Group__0__Impl : ( '{' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( '{' ) )
            // InternalMyDsl.g:323:1: ( '{' )
            {
            // InternalMyDsl.g:323:1: ( '{' )
            // InternalMyDsl.g:324:2: '{'
            {
             before(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalMyDsl.g:333:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalMyDsl.g:338:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalMyDsl.g:345:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__ApiAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( ( rule__Greeting__ApiAssignment_1 ) ) )
            // InternalMyDsl.g:350:1: ( ( rule__Greeting__ApiAssignment_1 ) )
            {
            // InternalMyDsl.g:350:1: ( ( rule__Greeting__ApiAssignment_1 ) )
            // InternalMyDsl.g:351:2: ( rule__Greeting__ApiAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getApiAssignment_1()); 
            // InternalMyDsl.g:352:2: ( rule__Greeting__ApiAssignment_1 )
            // InternalMyDsl.g:352:3: rule__Greeting__ApiAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__ApiAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getApiAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalMyDsl.g:360:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__Greeting__Group__2__Impl )
            // InternalMyDsl.g:365:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalMyDsl.g:371:1: rule__Greeting__Group__2__Impl : ( '}' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( ( '}' ) )
            // InternalMyDsl.g:376:1: ( '}' )
            {
            // InternalMyDsl.g:376:1: ( '}' )
            // InternalMyDsl.g:377:2: '}'
            {
             before(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__0"
    // InternalMyDsl.g:387:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:392:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0"


    // $ANTLR start "rule__Api__Group__0__Impl"
    // InternalMyDsl.g:399:1: rule__Api__Group__0__Impl : ( ( rule__Api__NameApiAssignment_0 ) ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( ( rule__Api__NameApiAssignment_0 ) ) )
            // InternalMyDsl.g:404:1: ( ( rule__Api__NameApiAssignment_0 ) )
            {
            // InternalMyDsl.g:404:1: ( ( rule__Api__NameApiAssignment_0 ) )
            // InternalMyDsl.g:405:2: ( rule__Api__NameApiAssignment_0 )
            {
             before(grammarAccess.getApiAccess().getNameApiAssignment_0()); 
            // InternalMyDsl.g:406:2: ( rule__Api__NameApiAssignment_0 )
            // InternalMyDsl.g:406:3: rule__Api__NameApiAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Api__NameApiAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getNameApiAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0__Impl"


    // $ANTLR start "rule__Api__Group__1"
    // InternalMyDsl.g:414:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:419:2: rule__Api__Group__1__Impl rule__Api__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1"


    // $ANTLR start "rule__Api__Group__1__Impl"
    // InternalMyDsl.g:426:1: rule__Api__Group__1__Impl : ( ':{' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:430:1: ( ( ':{' ) )
            // InternalMyDsl.g:431:1: ( ':{' )
            {
            // InternalMyDsl.g:431:1: ( ':{' )
            // InternalMyDsl.g:432:2: ':{'
            {
             before(grammarAccess.getApiAccess().getColonLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getColonLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1__Impl"


    // $ANTLR start "rule__Api__Group__2"
    // InternalMyDsl.g:441:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:446:2: rule__Api__Group__2__Impl rule__Api__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Api__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2"


    // $ANTLR start "rule__Api__Group__2__Impl"
    // InternalMyDsl.g:453:1: rule__Api__Group__2__Impl : ( ( rule__Api__AttributesAssignment_2 ) ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ( rule__Api__AttributesAssignment_2 ) ) )
            // InternalMyDsl.g:458:1: ( ( rule__Api__AttributesAssignment_2 ) )
            {
            // InternalMyDsl.g:458:1: ( ( rule__Api__AttributesAssignment_2 ) )
            // InternalMyDsl.g:459:2: ( rule__Api__AttributesAssignment_2 )
            {
             before(grammarAccess.getApiAccess().getAttributesAssignment_2()); 
            // InternalMyDsl.g:460:2: ( rule__Api__AttributesAssignment_2 )
            // InternalMyDsl.g:460:3: rule__Api__AttributesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Api__AttributesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__3"
    // InternalMyDsl.g:468:1: rule__Api__Group__3 : rule__Api__Group__3__Impl ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__Api__Group__3__Impl )
            // InternalMyDsl.g:473:2: rule__Api__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3"


    // $ANTLR start "rule__Api__Group__3__Impl"
    // InternalMyDsl.g:479:1: rule__Api__Group__3__Impl : ( '}' ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( ( '}' ) )
            // InternalMyDsl.g:484:1: ( '}' )
            {
            // InternalMyDsl.g:484:1: ( '}' )
            // InternalMyDsl.g:485:2: '}'
            {
             before(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:495:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:500:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:507:1: rule__Attribute__Group__0__Impl : ( 'atributos:' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( 'atributos:' ) )
            // InternalMyDsl.g:512:1: ( 'atributos:' )
            {
            // InternalMyDsl.g:512:1: ( 'atributos:' )
            // InternalMyDsl.g:513:2: 'atributos:'
            {
             before(grammarAccess.getAttributeAccess().getAtributosKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAtributosKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:522:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:527:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:534:1: rule__Attribute__Group__1__Impl : ( '[' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:538:1: ( ( '[' ) )
            // InternalMyDsl.g:539:1: ( '[' )
            {
            // InternalMyDsl.g:539:1: ( '[' )
            // InternalMyDsl.g:540:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:549:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:554:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:561:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( '{' ) )
            // InternalMyDsl.g:566:1: ( '{' )
            {
            // InternalMyDsl.g:566:1: ( '{' )
            // InternalMyDsl.g:567:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:576:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalMyDsl.g:581:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:588:1: rule__Attribute__Group__3__Impl : ( 'nome:' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:592:1: ( ( 'nome:' ) )
            // InternalMyDsl.g:593:1: ( 'nome:' )
            {
            // InternalMyDsl.g:593:1: ( 'nome:' )
            // InternalMyDsl.g:594:2: 'nome:'
            {
             before(grammarAccess.getAttributeAccess().getNomeKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNomeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalMyDsl.g:603:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalMyDsl.g:608:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalMyDsl.g:615:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__AttributeNameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( ( rule__Attribute__AttributeNameAssignment_4 ) ) )
            // InternalMyDsl.g:620:1: ( ( rule__Attribute__AttributeNameAssignment_4 ) )
            {
            // InternalMyDsl.g:620:1: ( ( rule__Attribute__AttributeNameAssignment_4 ) )
            // InternalMyDsl.g:621:2: ( rule__Attribute__AttributeNameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAssignment_4()); 
            // InternalMyDsl.g:622:2: ( rule__Attribute__AttributeNameAssignment_4 )
            // InternalMyDsl.g:622:3: rule__Attribute__AttributeNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalMyDsl.g:630:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalMyDsl.g:635:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalMyDsl.g:642:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( ',' ) )
            // InternalMyDsl.g:647:1: ( ',' )
            {
            // InternalMyDsl.g:647:1: ( ',' )
            // InternalMyDsl.g:648:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalMyDsl.g:657:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalMyDsl.g:662:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalMyDsl.g:669:1: rule__Attribute__Group__6__Impl : ( 'tipo:' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( 'tipo:' ) )
            // InternalMyDsl.g:674:1: ( 'tipo:' )
            {
            // InternalMyDsl.g:674:1: ( 'tipo:' )
            // InternalMyDsl.g:675:2: 'tipo:'
            {
             before(grammarAccess.getAttributeAccess().getTipoKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTipoKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalMyDsl.g:684:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalMyDsl.g:689:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalMyDsl.g:696:1: rule__Attribute__Group__7__Impl : ( ( rule__Attribute__AttributeTypeAssignment_7 ) ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( ( rule__Attribute__AttributeTypeAssignment_7 ) ) )
            // InternalMyDsl.g:701:1: ( ( rule__Attribute__AttributeTypeAssignment_7 ) )
            {
            // InternalMyDsl.g:701:1: ( ( rule__Attribute__AttributeTypeAssignment_7 ) )
            // InternalMyDsl.g:702:2: ( rule__Attribute__AttributeTypeAssignment_7 )
            {
             before(grammarAccess.getAttributeAccess().getAttributeTypeAssignment_7()); 
            // InternalMyDsl.g:703:2: ( rule__Attribute__AttributeTypeAssignment_7 )
            // InternalMyDsl.g:703:3: rule__Attribute__AttributeTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttributeTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttributeTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalMyDsl.g:711:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalMyDsl.g:716:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalMyDsl.g:723:1: rule__Attribute__Group__8__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ',' ) )
            // InternalMyDsl.g:728:1: ( ',' )
            {
            // InternalMyDsl.g:728:1: ( ',' )
            // InternalMyDsl.g:729:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__9"
    // InternalMyDsl.g:738:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( rule__Attribute__Group__9__Impl rule__Attribute__Group__10 )
            // InternalMyDsl.g:743:2: rule__Attribute__Group__9__Impl rule__Attribute__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__9"


    // $ANTLR start "rule__Attribute__Group__9__Impl"
    // InternalMyDsl.g:750:1: rule__Attribute__Group__9__Impl : ( 'metodoGet:' ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( 'metodoGet:' ) )
            // InternalMyDsl.g:755:1: ( 'metodoGet:' )
            {
            // InternalMyDsl.g:755:1: ( 'metodoGet:' )
            // InternalMyDsl.g:756:2: 'metodoGet:'
            {
             before(grammarAccess.getAttributeAccess().getMetodoGetKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMetodoGetKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group__10"
    // InternalMyDsl.g:765:1: rule__Attribute__Group__10 : rule__Attribute__Group__10__Impl rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( rule__Attribute__Group__10__Impl rule__Attribute__Group__11 )
            // InternalMyDsl.g:770:2: rule__Attribute__Group__10__Impl rule__Attribute__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__10"


    // $ANTLR start "rule__Attribute__Group__10__Impl"
    // InternalMyDsl.g:777:1: rule__Attribute__Group__10__Impl : ( ( rule__Attribute__DecisionGetAssignment_10 ) ) ;
    public final void rule__Attribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( ( rule__Attribute__DecisionGetAssignment_10 ) ) )
            // InternalMyDsl.g:782:1: ( ( rule__Attribute__DecisionGetAssignment_10 ) )
            {
            // InternalMyDsl.g:782:1: ( ( rule__Attribute__DecisionGetAssignment_10 ) )
            // InternalMyDsl.g:783:2: ( rule__Attribute__DecisionGetAssignment_10 )
            {
             before(grammarAccess.getAttributeAccess().getDecisionGetAssignment_10()); 
            // InternalMyDsl.g:784:2: ( rule__Attribute__DecisionGetAssignment_10 )
            // InternalMyDsl.g:784:3: rule__Attribute__DecisionGetAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DecisionGetAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDecisionGetAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__10__Impl"


    // $ANTLR start "rule__Attribute__Group__11"
    // InternalMyDsl.g:792:1: rule__Attribute__Group__11 : rule__Attribute__Group__11__Impl rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( rule__Attribute__Group__11__Impl rule__Attribute__Group__12 )
            // InternalMyDsl.g:797:2: rule__Attribute__Group__11__Impl rule__Attribute__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__11"


    // $ANTLR start "rule__Attribute__Group__11__Impl"
    // InternalMyDsl.g:804:1: rule__Attribute__Group__11__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( ( ',' ) )
            // InternalMyDsl.g:809:1: ( ',' )
            {
            // InternalMyDsl.g:809:1: ( ',' )
            // InternalMyDsl.g:810:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__11__Impl"


    // $ANTLR start "rule__Attribute__Group__12"
    // InternalMyDsl.g:819:1: rule__Attribute__Group__12 : rule__Attribute__Group__12__Impl rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( rule__Attribute__Group__12__Impl rule__Attribute__Group__13 )
            // InternalMyDsl.g:824:2: rule__Attribute__Group__12__Impl rule__Attribute__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__12"


    // $ANTLR start "rule__Attribute__Group__12__Impl"
    // InternalMyDsl.g:831:1: rule__Attribute__Group__12__Impl : ( 'metodoSet:' ) ;
    public final void rule__Attribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( ( 'metodoSet:' ) )
            // InternalMyDsl.g:836:1: ( 'metodoSet:' )
            {
            // InternalMyDsl.g:836:1: ( 'metodoSet:' )
            // InternalMyDsl.g:837:2: 'metodoSet:'
            {
             before(grammarAccess.getAttributeAccess().getMetodoSetKeyword_12()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getMetodoSetKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__12__Impl"


    // $ANTLR start "rule__Attribute__Group__13"
    // InternalMyDsl.g:846:1: rule__Attribute__Group__13 : rule__Attribute__Group__13__Impl rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( rule__Attribute__Group__13__Impl rule__Attribute__Group__14 )
            // InternalMyDsl.g:851:2: rule__Attribute__Group__13__Impl rule__Attribute__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__13"


    // $ANTLR start "rule__Attribute__Group__13__Impl"
    // InternalMyDsl.g:858:1: rule__Attribute__Group__13__Impl : ( ( rule__Attribute__DecisionSetAssignment_13 ) ) ;
    public final void rule__Attribute__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( ( ( rule__Attribute__DecisionSetAssignment_13 ) ) )
            // InternalMyDsl.g:863:1: ( ( rule__Attribute__DecisionSetAssignment_13 ) )
            {
            // InternalMyDsl.g:863:1: ( ( rule__Attribute__DecisionSetAssignment_13 ) )
            // InternalMyDsl.g:864:2: ( rule__Attribute__DecisionSetAssignment_13 )
            {
             before(grammarAccess.getAttributeAccess().getDecisionSetAssignment_13()); 
            // InternalMyDsl.g:865:2: ( rule__Attribute__DecisionSetAssignment_13 )
            // InternalMyDsl.g:865:3: rule__Attribute__DecisionSetAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DecisionSetAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDecisionSetAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__13__Impl"


    // $ANTLR start "rule__Attribute__Group__14"
    // InternalMyDsl.g:873:1: rule__Attribute__Group__14 : rule__Attribute__Group__14__Impl rule__Attribute__Group__15 ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( rule__Attribute__Group__14__Impl rule__Attribute__Group__15 )
            // InternalMyDsl.g:878:2: rule__Attribute__Group__14__Impl rule__Attribute__Group__15
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__14"


    // $ANTLR start "rule__Attribute__Group__14__Impl"
    // InternalMyDsl.g:885:1: rule__Attribute__Group__14__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( ( ',' ) )
            // InternalMyDsl.g:890:1: ( ',' )
            {
            // InternalMyDsl.g:890:1: ( ',' )
            // InternalMyDsl.g:891:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__14__Impl"


    // $ANTLR start "rule__Attribute__Group__15"
    // InternalMyDsl.g:900:1: rule__Attribute__Group__15 : rule__Attribute__Group__15__Impl rule__Attribute__Group__16 ;
    public final void rule__Attribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( rule__Attribute__Group__15__Impl rule__Attribute__Group__16 )
            // InternalMyDsl.g:905:2: rule__Attribute__Group__15__Impl rule__Attribute__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Attribute__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__15"


    // $ANTLR start "rule__Attribute__Group__15__Impl"
    // InternalMyDsl.g:912:1: rule__Attribute__Group__15__Impl : ( 'id:' ) ;
    public final void rule__Attribute__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( 'id:' ) )
            // InternalMyDsl.g:917:1: ( 'id:' )
            {
            // InternalMyDsl.g:917:1: ( 'id:' )
            // InternalMyDsl.g:918:2: 'id:'
            {
             before(grammarAccess.getAttributeAccess().getIdKeyword_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getIdKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__15__Impl"


    // $ANTLR start "rule__Attribute__Group__16"
    // InternalMyDsl.g:927:1: rule__Attribute__Group__16 : rule__Attribute__Group__16__Impl rule__Attribute__Group__17 ;
    public final void rule__Attribute__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( rule__Attribute__Group__16__Impl rule__Attribute__Group__17 )
            // InternalMyDsl.g:932:2: rule__Attribute__Group__16__Impl rule__Attribute__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__16"


    // $ANTLR start "rule__Attribute__Group__16__Impl"
    // InternalMyDsl.g:939:1: rule__Attribute__Group__16__Impl : ( ( rule__Attribute__DecisionIDAssignment_16 ) ) ;
    public final void rule__Attribute__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( ( rule__Attribute__DecisionIDAssignment_16 ) ) )
            // InternalMyDsl.g:944:1: ( ( rule__Attribute__DecisionIDAssignment_16 ) )
            {
            // InternalMyDsl.g:944:1: ( ( rule__Attribute__DecisionIDAssignment_16 ) )
            // InternalMyDsl.g:945:2: ( rule__Attribute__DecisionIDAssignment_16 )
            {
             before(grammarAccess.getAttributeAccess().getDecisionIDAssignment_16()); 
            // InternalMyDsl.g:946:2: ( rule__Attribute__DecisionIDAssignment_16 )
            // InternalMyDsl.g:946:3: rule__Attribute__DecisionIDAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__DecisionIDAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getDecisionIDAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__16__Impl"


    // $ANTLR start "rule__Attribute__Group__17"
    // InternalMyDsl.g:954:1: rule__Attribute__Group__17 : rule__Attribute__Group__17__Impl rule__Attribute__Group__18 ;
    public final void rule__Attribute__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( rule__Attribute__Group__17__Impl rule__Attribute__Group__18 )
            // InternalMyDsl.g:959:2: rule__Attribute__Group__17__Impl rule__Attribute__Group__18
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__17"


    // $ANTLR start "rule__Attribute__Group__17__Impl"
    // InternalMyDsl.g:966:1: rule__Attribute__Group__17__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( '}' ) )
            // InternalMyDsl.g:971:1: ( '}' )
            {
            // InternalMyDsl.g:971:1: ( '}' )
            // InternalMyDsl.g:972:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__17__Impl"


    // $ANTLR start "rule__Attribute__Group__18"
    // InternalMyDsl.g:981:1: rule__Attribute__Group__18 : rule__Attribute__Group__18__Impl ;
    public final void rule__Attribute__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( rule__Attribute__Group__18__Impl )
            // InternalMyDsl.g:986:2: rule__Attribute__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__18"


    // $ANTLR start "rule__Attribute__Group__18__Impl"
    // InternalMyDsl.g:992:1: rule__Attribute__Group__18__Impl : ( ']' ) ;
    public final void rule__Attribute__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:996:1: ( ( ']' ) )
            // InternalMyDsl.g:997:1: ( ']' )
            {
            // InternalMyDsl.g:997:1: ( ']' )
            // InternalMyDsl.g:998:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_18()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__18__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalMyDsl.g:1008:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( ( ruleGreeting ) )
            // InternalMyDsl.g:1013:2: ( ruleGreeting )
            {
            // InternalMyDsl.g:1013:2: ( ruleGreeting )
            // InternalMyDsl.g:1014:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__ApiAssignment_1"
    // InternalMyDsl.g:1023:1: rule__Greeting__ApiAssignment_1 : ( ruleApi ) ;
    public final void rule__Greeting__ApiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( ( ruleApi ) )
            // InternalMyDsl.g:1028:2: ( ruleApi )
            {
            // InternalMyDsl.g:1028:2: ( ruleApi )
            // InternalMyDsl.g:1029:3: ruleApi
            {
             before(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getApiApiParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__ApiAssignment_1"


    // $ANTLR start "rule__Api__NameApiAssignment_0"
    // InternalMyDsl.g:1038:1: rule__Api__NameApiAssignment_0 : ( ruleAPIName ) ;
    public final void rule__Api__NameApiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( ( ruleAPIName ) )
            // InternalMyDsl.g:1043:2: ( ruleAPIName )
            {
            // InternalMyDsl.g:1043:2: ( ruleAPIName )
            // InternalMyDsl.g:1044:3: ruleAPIName
            {
             before(grammarAccess.getApiAccess().getNameApiAPINameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAPIName();

            state._fsp--;

             after(grammarAccess.getApiAccess().getNameApiAPINameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__NameApiAssignment_0"


    // $ANTLR start "rule__Api__AttributesAssignment_2"
    // InternalMyDsl.g:1053:1: rule__Api__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Api__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:1058:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:1058:2: ( ruleAttribute )
            // InternalMyDsl.g:1059:3: ruleAttribute
            {
             before(grammarAccess.getApiAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getApiAccess().getAttributesAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__AttributesAssignment_2"


    // $ANTLR start "rule__APIName__IdAssignment"
    // InternalMyDsl.g:1068:1: rule__APIName__IdAssignment : ( RULE_ID ) ;
    public final void rule__APIName__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1072:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1073:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1073:2: ( RULE_ID )
            // InternalMyDsl.g:1074:3: RULE_ID
            {
             before(grammarAccess.getAPINameAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAPINameAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIName__IdAssignment"


    // $ANTLR start "rule__Attribute__AttributeNameAssignment_4"
    // InternalMyDsl.g:1083:1: rule__Attribute__AttributeNameAssignment_4 : ( ruleAttributeName ) ;
    public final void rule__Attribute__AttributeNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1087:1: ( ( ruleAttributeName ) )
            // InternalMyDsl.g:1088:2: ( ruleAttributeName )
            {
            // InternalMyDsl.g:1088:2: ( ruleAttributeName )
            // InternalMyDsl.g:1089:3: ruleAttributeName
            {
             before(grammarAccess.getAttributeAccess().getAttributeNameAttributeNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeNameAttributeNameParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeNameAssignment_4"


    // $ANTLR start "rule__Attribute__AttributeTypeAssignment_7"
    // InternalMyDsl.g:1098:1: rule__Attribute__AttributeTypeAssignment_7 : ( ruleAttributeType ) ;
    public final void rule__Attribute__AttributeTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ruleAttributeType ) )
            // InternalMyDsl.g:1103:2: ( ruleAttributeType )
            {
            // InternalMyDsl.g:1103:2: ( ruleAttributeType )
            // InternalMyDsl.g:1104:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getAttributeTypeAttributeTypeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeTypeAttributeTypeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttributeTypeAssignment_7"


    // $ANTLR start "rule__Attribute__DecisionGetAssignment_10"
    // InternalMyDsl.g:1113:1: rule__Attribute__DecisionGetAssignment_10 : ( ruleBool ) ;
    public final void rule__Attribute__DecisionGetAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( ruleBool ) )
            // InternalMyDsl.g:1118:2: ( ruleBool )
            {
            // InternalMyDsl.g:1118:2: ( ruleBool )
            // InternalMyDsl.g:1119:3: ruleBool
            {
             before(grammarAccess.getAttributeAccess().getDecisionGetBoolParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDecisionGetBoolParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DecisionGetAssignment_10"


    // $ANTLR start "rule__Attribute__DecisionSetAssignment_13"
    // InternalMyDsl.g:1128:1: rule__Attribute__DecisionSetAssignment_13 : ( ruleBool ) ;
    public final void rule__Attribute__DecisionSetAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( ( ruleBool ) )
            // InternalMyDsl.g:1133:2: ( ruleBool )
            {
            // InternalMyDsl.g:1133:2: ( ruleBool )
            // InternalMyDsl.g:1134:3: ruleBool
            {
             before(grammarAccess.getAttributeAccess().getDecisionSetBoolParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDecisionSetBoolParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DecisionSetAssignment_13"


    // $ANTLR start "rule__Attribute__DecisionIDAssignment_16"
    // InternalMyDsl.g:1143:1: rule__Attribute__DecisionIDAssignment_16 : ( ruleBool ) ;
    public final void rule__Attribute__DecisionIDAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( ruleBool ) )
            // InternalMyDsl.g:1148:2: ( ruleBool )
            {
            // InternalMyDsl.g:1148:2: ( ruleBool )
            // InternalMyDsl.g:1149:3: ruleBool
            {
             before(grammarAccess.getAttributeAccess().getDecisionIDBoolParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getDecisionIDBoolParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__DecisionIDAssignment_16"


    // $ANTLR start "rule__AttributeName__IdAssignment"
    // InternalMyDsl.g:1158:1: rule__AttributeName__IdAssignment : ( RULE_ID ) ;
    public final void rule__AttributeName__IdAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1163:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1163:2: ( RULE_ID )
            // InternalMyDsl.g:1164:3: RULE_ID
            {
             before(grammarAccess.getAttributeNameAccess().getIdIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeNameAccess().getIdIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeName__IdAssignment"


    // $ANTLR start "rule__AttributeType__IdAssignment_0"
    // InternalMyDsl.g:1173:1: rule__AttributeType__IdAssignment_0 : ( ( 'String' ) ) ;
    public final void rule__AttributeType__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( ( 'String' ) ) )
            // InternalMyDsl.g:1178:2: ( ( 'String' ) )
            {
            // InternalMyDsl.g:1178:2: ( ( 'String' ) )
            // InternalMyDsl.g:1179:3: ( 'String' )
            {
             before(grammarAccess.getAttributeTypeAccess().getIdStringKeyword_0_0()); 
            // InternalMyDsl.g:1180:3: ( 'String' )
            // InternalMyDsl.g:1181:4: 'String'
            {
             before(grammarAccess.getAttributeTypeAccess().getIdStringKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getIdStringKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getIdStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__IdAssignment_0"


    // $ANTLR start "rule__AttributeType__IdAssignment_1"
    // InternalMyDsl.g:1192:1: rule__AttributeType__IdAssignment_1 : ( ( 'Int' ) ) ;
    public final void rule__AttributeType__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( ( 'Int' ) ) )
            // InternalMyDsl.g:1197:2: ( ( 'Int' ) )
            {
            // InternalMyDsl.g:1197:2: ( ( 'Int' ) )
            // InternalMyDsl.g:1198:3: ( 'Int' )
            {
             before(grammarAccess.getAttributeTypeAccess().getIdIntKeyword_1_0()); 
            // InternalMyDsl.g:1199:3: ( 'Int' )
            // InternalMyDsl.g:1200:4: 'Int'
            {
             before(grammarAccess.getAttributeTypeAccess().getIdIntKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getIdIntKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getIdIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__IdAssignment_1"


    // $ANTLR start "rule__AttributeType__IdAssignment_2"
    // InternalMyDsl.g:1211:1: rule__AttributeType__IdAssignment_2 : ( ( 'Double' ) ) ;
    public final void rule__AttributeType__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1215:1: ( ( ( 'Double' ) ) )
            // InternalMyDsl.g:1216:2: ( ( 'Double' ) )
            {
            // InternalMyDsl.g:1216:2: ( ( 'Double' ) )
            // InternalMyDsl.g:1217:3: ( 'Double' )
            {
             before(grammarAccess.getAttributeTypeAccess().getIdDoubleKeyword_2_0()); 
            // InternalMyDsl.g:1218:3: ( 'Double' )
            // InternalMyDsl.g:1219:4: 'Double'
            {
             before(grammarAccess.getAttributeTypeAccess().getIdDoubleKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getIdDoubleKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getIdDoubleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__IdAssignment_2"


    // $ANTLR start "rule__AttributeType__IdAssignment_3"
    // InternalMyDsl.g:1230:1: rule__AttributeType__IdAssignment_3 : ( ( 'Boolean' ) ) ;
    public final void rule__AttributeType__IdAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( ( ( 'Boolean' ) ) )
            // InternalMyDsl.g:1235:2: ( ( 'Boolean' ) )
            {
            // InternalMyDsl.g:1235:2: ( ( 'Boolean' ) )
            // InternalMyDsl.g:1236:3: ( 'Boolean' )
            {
             before(grammarAccess.getAttributeTypeAccess().getIdBooleanKeyword_3_0()); 
            // InternalMyDsl.g:1237:3: ( 'Boolean' )
            // InternalMyDsl.g:1238:4: 'Boolean'
            {
             before(grammarAccess.getAttributeTypeAccess().getIdBooleanKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getIdBooleanKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getIdBooleanKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__IdAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}