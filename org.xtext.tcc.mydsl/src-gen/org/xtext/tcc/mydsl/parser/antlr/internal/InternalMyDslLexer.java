package org.xtext.tcc.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '{' )
            // InternalMyDsl.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( '}' )
            // InternalMyDsl.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '\"Nome da Api\"' )
            // InternalMyDsl.g:13:9: '\"Nome da Api\"'
            {
            match("\"Nome da Api\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( ':' )
            // InternalMyDsl.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( ',' )
            // InternalMyDsl.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( '\"Entidades\"' )
            // InternalMyDsl.g:16:9: '\"Entidades\"'
            {
            match("\"Entidades\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '[' )
            // InternalMyDsl.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( ']' )
            // InternalMyDsl.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( '\"Nome\"' )
            // InternalMyDsl.g:19:9: '\"Nome\"'
            {
            match("\"Nome\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '\"Atributos\"' )
            // InternalMyDsl.g:20:9: '\"Atributos\"'
            {
            match("\"Atributos\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( '\"Chave Primaria\"' )
            // InternalMyDsl.g:21:9: '\"Chave Primaria\"'
            {
            match("\"Chave Primaria\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '\"nome-atributo\"' )
            // InternalMyDsl.g:22:9: '\"nome-atributo\"'
            {
            match("\"nome-atributo\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '\"tipo-atributo\"' )
            // InternalMyDsl.g:23:9: '\"tipo-atributo\"'
            {
            match("\"tipo-atributo\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( '\"associa\\u00E7\\u00E3o\"' )
            // InternalMyDsl.g:24:9: '\"associa\\u00E7\\u00E3o\"'
            {
            match("\"associa\u00E7\u00E3o\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( '\"opera\\u00E7\\u00E3o em cascata\"' )
            // InternalMyDsl.g:25:9: '\"opera\\u00E7\\u00E3o em cascata\"'
            {
            match("\"opera\u00E7\u00E3o em cascata\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '\"joinTable-nome\"' )
            // InternalMyDsl.g:26:9: '\"joinTable-nome\"'
            {
            match("\"joinTable-nome\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '\"joinColumns-nome\"' )
            // InternalMyDsl.g:27:9: '\"joinColumns-nome\"'
            {
            match("\"joinColumns-nome\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '\"inverseJoinColumns-nome\"' )
            // InternalMyDsl.g:28:9: '\"inverseJoinColumns-nome\"'
            {
            match("\"inverseJoinColumns-nome\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'ALL' )
            // InternalMyDsl.g:29:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'DETACH' )
            // InternalMyDsl.g:30:9: 'DETACH'
            {
            match("DETACH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'MERGE' )
            // InternalMyDsl.g:31:9: 'MERGE'
            {
            match("MERGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'PERSIST' )
            // InternalMyDsl.g:32:9: 'PERSIST'
            {
            match("PERSIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'REFRESH' )
            // InternalMyDsl.g:33:9: 'REFRESH'
            {
            match("REFRESH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'REMOVE' )
            // InternalMyDsl.g:34:9: 'REMOVE'
            {
            match("REMOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'OneToOne' )
            // InternalMyDsl.g:35:9: 'OneToOne'
            {
            match("OneToOne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'OneToMany' )
            // InternalMyDsl.g:36:9: 'OneToMany'
            {
            match("OneToMany"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'ManyToOne' )
            // InternalMyDsl.g:37:9: 'ManyToOne'
            {
            match("ManyToOne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'ManyToMany' )
            // InternalMyDsl.g:38:9: 'ManyToMany'
            {
            match("ManyToMany"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'Boolean' )
            // InternalMyDsl.g:39:9: 'Boolean'
            {
            match("Boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'Byte' )
            // InternalMyDsl.g:40:9: 'Byte'
            {
            match("Byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'Short' )
            // InternalMyDsl.g:41:9: 'Short'
            {
            match("Short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'Character' )
            // InternalMyDsl.g:42:9: 'Character'
            {
            match("Character"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'Integer' )
            // InternalMyDsl.g:43:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'Long' )
            // InternalMyDsl.g:44:9: 'Long'
            {
            match("Long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'Float' )
            // InternalMyDsl.g:45:9: 'Float'
            {
            match("Float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'Double' )
            // InternalMyDsl.g:46:9: 'Double'
            {
            match("Double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'Time' )
            // InternalMyDsl.g:47:9: 'Time'
            {
            match("Time"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'Timestamp' )
            // InternalMyDsl.g:48:9: 'Timestamp'
            {
            match("Timestamp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'Date' )
            // InternalMyDsl.g:49:9: 'Date'
            {
            match("Date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( 'ENUM' )
            // InternalMyDsl.g:50:9: 'ENUM'
            {
            match("ENUM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'ArrayList' )
            // InternalMyDsl.g:51:9: 'ArrayList'
            {
            match("ArrayList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'HashSet' )
            // InternalMyDsl.g:52:9: 'HashSet'
            {
            match("HashSet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1279:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:1279:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:1279:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:1279:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:1279:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1281:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:1281:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:1281:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:1281:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1283:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:1283:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:1283:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1283:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:1283:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:1283:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1283:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1283:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:1283:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:1283:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:1283:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1285:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:1285:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:1285:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1285:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1287:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:1287:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:1287:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1287:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyDsl.g:1287:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1287:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:1287:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:1287:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1289:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:1289:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:1289:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:1291:16: ( . )
            // InternalMyDsl.g:1291:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=49;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:270: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:279: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:291: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:307: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:323: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:331: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\1\35\4\uffff\17\61\1\35\2\uffff\2\35\23\uffff\2\61\1\uffff\22\61\16\uffff\1\161\24\61\13\uffff\3\61\1\u0093\7\61\1\u009b\3\61\1\u009f\1\61\1\u00a2\1\u00a3\1\61\12\uffff\3\61\1\uffff\1\u00b4\6\61\1\uffff\1\u00bc\2\61\1\uffff\1\u00bf\1\61\2\uffff\1\61\14\uffff\1\61\1\u00cf\1\u00d0\1\uffff\3\61\1\u00d5\3\61\1\uffff\2\61\1\uffff\2\61\14\uffff\1\61\2\uffff\2\61\1\u00eb\1\u00ec\1\uffff\2\61\1\u00ef\1\61\1\u00f1\1\61\1\u00f3\13\uffff\3\61\2\uffff\1\u0102\1\61\1\uffff\1\61\1\uffff\1\61\14\uffff\1\u0111\1\u0112\1\61\1\uffff\1\u0114\1\u0115\1\u0116\15\uffff\1\u0122\116\uffff";
    static final String DFA12_eofS =
        "\u0162\uffff";
    static final String DFA12_minS =
        "\1\0\2\uffff\1\0\4\uffff\1\114\4\105\1\156\1\157\2\150\1\156\1\157\1\154\1\151\1\116\1\141\1\101\2\uffff\1\0\1\52\4\uffff\12\0\5\uffff\1\114\1\162\1\uffff\1\124\1\165\1\164\1\122\1\156\1\122\1\106\1\145\1\157\1\164\1\157\1\141\1\164\1\156\1\157\1\155\1\125\1\163\4\uffff\12\0\1\60\1\141\1\101\1\142\1\145\1\107\1\171\1\123\1\122\1\117\1\124\1\154\1\145\2\162\1\145\1\147\1\141\1\145\1\115\1\150\12\0\1\uffff\1\171\1\103\1\154\1\60\1\105\1\124\1\111\1\105\1\126\1\157\1\145\1\60\1\164\1\141\1\147\1\60\1\164\2\60\1\123\12\0\1\114\1\110\1\145\1\uffff\1\60\1\157\2\123\1\105\1\115\1\141\1\uffff\1\60\1\143\1\145\1\uffff\1\60\1\164\2\uffff\1\145\1\0\1\uffff\12\0\1\151\2\60\1\uffff\1\115\1\124\1\110\1\60\1\156\1\141\1\156\1\uffff\1\164\1\162\1\uffff\1\141\1\164\1\0\1\uffff\12\0\1\163\2\uffff\1\156\1\141\2\60\1\uffff\1\145\1\156\1\60\1\145\1\60\1\155\1\60\13\0\1\164\1\145\1\156\2\uffff\1\60\1\171\1\uffff\1\162\1\uffff\1\160\1\uffff\13\0\2\60\1\171\1\uffff\3\60\13\0\2\uffff\1\60\3\uffff\1\0\2\uffff\10\0\1\uffff\1\0\2\uffff\3\0\1\uffff\4\0\1\uffff\3\0\1\uffff\4\0\1\uffff\10\0\2\uffff\4\0\3\uffff\1\0\1\uffff\2\0\1\uffff\1\0\1\uffff\3\0\1\uffff\2\0\1\uffff\3\0\1\uffff\1\0\1\uffff\3\0\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\uffff\1\uffff\4\uffff\1\162\1\157\1\141\2\105\1\156\1\171\2\150\1\156\1\157\1\154\1\151\1\116\1\141\1\172\2\uffff\1\uffff\1\57\4\uffff\12\uffff\5\uffff\1\114\1\162\1\uffff\1\124\1\165\1\164\1\122\1\156\1\122\1\115\1\145\1\157\1\164\1\157\1\141\1\164\1\156\1\157\1\155\1\125\1\163\4\uffff\12\uffff\1\172\1\141\1\101\1\142\1\145\1\107\1\171\1\123\1\122\1\117\1\124\1\154\1\145\2\162\1\145\1\147\1\141\1\145\1\115\1\150\12\uffff\1\uffff\1\171\1\103\1\154\1\172\1\105\1\124\1\111\1\105\1\126\1\157\1\145\1\172\1\164\1\141\1\147\1\172\1\164\2\172\1\123\12\uffff\1\114\1\110\1\145\1\uffff\1\172\1\157\2\123\1\105\1\117\1\141\1\uffff\1\172\1\143\1\145\1\uffff\1\172\1\164\2\uffff\1\145\1\uffff\1\uffff\12\uffff\1\151\2\172\1\uffff\1\117\1\124\1\110\1\172\1\156\1\141\1\156\1\uffff\1\164\1\162\1\uffff\1\141\1\164\1\uffff\1\uffff\12\uffff\1\163\2\uffff\1\156\1\141\2\172\1\uffff\1\145\1\156\1\172\1\145\1\172\1\155\1\172\13\uffff\1\164\1\145\1\156\2\uffff\1\172\1\171\1\uffff\1\162\1\uffff\1\160\1\uffff\13\uffff\2\172\1\171\1\uffff\3\172\13\uffff\2\uffff\1\172\3\uffff\1\uffff\2\uffff\10\uffff\1\uffff\1\uffff\2\uffff\3\uffff\1\uffff\4\uffff\1\uffff\3\uffff\1\uffff\4\uffff\1\uffff\10\uffff\2\uffff\4\uffff\3\uffff\1\uffff\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\3\uffff\1\uffff\2\uffff\1\uffff\3\uffff\1\uffff\1\uffff\1\uffff\3\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\7\1\10\20\uffff\1\53\1\54\2\uffff\1\60\1\61\1\1\1\2\12\uffff\1\55\1\4\1\5\1\7\1\10\2\uffff\1\53\22\uffff\1\54\1\56\1\57\1\60\51\uffff\1\23\41\uffff\1\47\7\uffff\1\36\3\uffff\1\42\2\uffff\1\45\1\50\2\uffff\1\11\15\uffff\1\25\7\uffff\1\37\2\uffff\1\43\3\uffff\1\11\13\uffff\1\24\1\44\4\uffff\1\30\25\uffff\1\26\1\27\2\uffff\1\35\1\uffff\1\41\1\uffff\1\52\16\uffff\1\31\16\uffff\1\51\1\33\1\uffff\1\32\1\40\1\46\1\uffff\1\6\1\12\10\uffff\1\34\1\uffff\1\6\1\12\3\uffff\1\16\4\uffff\1\3\3\uffff\1\16\4\uffff\1\3\10\uffff\1\14\1\15\4\uffff\1\13\1\14\1\15\1\uffff\1\20\2\uffff\1\13\1\uffff\1\20\3\uffff\1\21\2\uffff\1\21\3\uffff\1\17\1\uffff\1\17\3\uffff\2\22";
    static final String DFA12_specialS =
        "\1\1\2\uffff\1\0\26\uffff\1\73\5\uffff\1\144\1\15\1\26\1\37\1\55\1\72\1\110\1\122\1\2\1\177\36\uffff\1\146\1\16\1\27\1\40\1\56\1\74\1\111\1\123\1\3\1\u0080\25\uffff\1\147\1\17\1\30\1\41\1\57\1\75\1\112\1\124\1\4\1\u0081\25\uffff\1\150\1\20\1\31\1\42\1\60\1\76\1\113\1\125\1\5\1\u0082\25\uffff\1\6\1\uffff\1\21\1\32\1\43\1\61\1\77\1\114\1\126\1\151\1\163\1\u0083\21\uffff\1\7\1\uffff\1\22\1\33\1\44\1\62\1\100\1\115\1\127\1\152\1\164\1\u0084\17\uffff\1\10\1\23\1\34\1\45\1\63\1\101\1\116\1\130\1\153\1\165\1\u0085\14\uffff\1\11\1\24\1\35\1\46\1\64\1\102\1\117\1\131\1\154\1\166\1\u0086\7\uffff\1\12\1\25\1\36\1\47\1\65\1\103\1\120\1\132\1\155\1\167\1\u0087\6\uffff\1\13\2\uffff\1\50\1\66\1\104\1\121\1\133\1\156\1\170\1\u0088\1\uffff\1\14\2\uffff\1\51\1\67\1\105\1\uffff\1\134\1\157\1\171\1\u0089\1\uffff\1\52\1\70\1\106\1\uffff\1\135\1\160\1\172\1\u008a\1\uffff\1\53\1\71\1\107\1\136\1\161\1\173\1\u008b\1\54\2\uffff\1\137\1\162\1\174\1\u008c\3\uffff\1\140\1\uffff\1\175\1\u008d\1\uffff\1\141\1\uffff\1\176\1\u008e\1\142\1\uffff\1\u008f\1\143\1\uffff\1\u0090\1\145\1\u0091\1\uffff\1\u0092\1\uffff\1\u0093\1\u0094\1\u0095\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\35\1\3\4\35\1\32\4\35\1\5\2\35\1\33\12\31\1\4\6\35\1\10\1\16\1\20\1\11\1\25\1\23\1\30\1\26\1\21\2\30\1\22\1\12\1\30\1\15\1\13\1\30\1\14\1\17\1\24\6\30\1\6\1\35\1\7\1\27\1\30\1\35\32\30\1\1\1\35\1\2\uff82\35",
            "",
            "",
            "\101\52\1\42\1\52\1\43\1\52\1\41\10\52\1\40\22\52\1\46\7\52\1\51\1\50\3\52\1\44\1\47\4\52\1\45\uff8b\52",
            "",
            "",
            "",
            "",
            "\1\57\45\uffff\1\60",
            "\1\62\33\uffff\1\64\15\uffff\1\63",
            "\1\65\33\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72\11\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\0\52",
            "\1\105\4\uffff\1\106",
            "",
            "",
            "",
            "",
            "\157\52\1\110\uff90\52",
            "\156\52\1\111\uff91\52",
            "\164\52\1\112\uff8b\52",
            "\150\52\1\113\uff97\52",
            "\157\52\1\114\uff90\52",
            "\151\52\1\115\uff96\52",
            "\163\52\1\116\uff8c\52",
            "\160\52\1\117\uff8f\52",
            "\157\52\1\120\uff90\52",
            "\156\52\1\121\uff91\52",
            "",
            "",
            "",
            "",
            "",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132\6\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "\155\52\1\147\uff92\52",
            "\164\52\1\150\uff8b\52",
            "\162\52\1\151\uff8d\52",
            "\141\52\1\152\uff9e\52",
            "\155\52\1\153\uff92\52",
            "\160\52\1\154\uff8f\52",
            "\163\52\1\155\uff8c\52",
            "\145\52\1\156\uff9a\52",
            "\151\52\1\157\uff96\52",
            "\166\52\1\160\uff89\52",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\145\52\1\u0086\uff9a\52",
            "\151\52\1\u0087\uff96\52",
            "\151\52\1\u0088\uff96\52",
            "\166\52\1\u0089\uff89\52",
            "\145\52\1\u008a\uff9a\52",
            "\157\52\1\u008b\uff90\52",
            "\157\52\1\u008c\uff90\52",
            "\162\52\1\u008d\uff8d\52",
            "\156\52\1\u008e\uff91\52",
            "\145\52\1\u008f\uff9a\52",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\22\61\1\u00a1\7\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a4",
            "\40\52\1\u00a5\1\52\1\u00a6\uffdd\52",
            "\144\52\1\u00a7\uff9b\52",
            "\142\52\1\u00a8\uff9d\52",
            "\145\52\1\u00a9\uff9a\52",
            "\55\52\1\u00aa\uffd2\52",
            "\55\52\1\u00ab\uffd2\52",
            "\143\52\1\u00ac\uff9c\52",
            "\141\52\1\u00ad\uff9e\52",
            "\103\52\1\u00af\20\52\1\u00ae\uffab\52",
            "\162\52\1\u00b0\uff8d\52",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00ba\1\uffff\1\u00b9",
            "\1\u00bb",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00bd",
            "\1\u00be",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c0",
            "",
            "",
            "\1\u00c1",
            "\144\52\1\u00c2\uff9b\52",
            "",
            "\141\52\1\u00c4\uff9e\52",
            "\165\52\1\u00c5\uff8a\52",
            "\40\52\1\u00c6\uffdf\52",
            "\141\52\1\u00c7\uff9e\52",
            "\141\52\1\u00c8\uff9e\52",
            "\151\52\1\u00c9\uff96\52",
            "\u00e7\52\1\u00ca\uff18\52",
            "\141\52\1\u00cb\uff9e\52",
            "\157\52\1\u00cc\uff90\52",
            "\163\52\1\u00cd\uff8c\52",
            "\1\u00ce",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00d2\1\uffff\1\u00d1",
            "\1\u00d3",
            "\1\u00d4",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\141\52\1\u00dd\uff9e\52",
            "",
            "\144\52\1\u00de\uff9b\52",
            "\164\52\1\u00df\uff8b\52",
            "\120\52\1\u00e0\uffaf\52",
            "\164\52\1\u00e1\uff8b\52",
            "\164\52\1\u00e2\uff8b\52",
            "\141\52\1\u00e3\uff9e\52",
            "\u00e3\52\1\u00e4\uff1c\52",
            "\142\52\1\u00e5\uff9d\52",
            "\154\52\1\u00e6\uff93\52",
            "\145\52\1\u00e7\uff9a\52",
            "\1\u00e8",
            "",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\40\52\1\u00f4\uffdf\52",
            "\145\52\1\u00f5\uff9a\52",
            "\157\52\1\u00f6\uff90\52",
            "\162\52\1\u00f7\uff8d\52",
            "\162\52\1\u00f8\uff8d\52",
            "\162\52\1\u00f9\uff8d\52",
            "\u00e7\52\1\u00fa\uff18\52",
            "\157\52\1\u00fb\uff90\52",
            "\154\52\1\u00fc\uff93\52",
            "\165\52\1\u00fd\uff8a\52",
            "\112\52\1\u00fe\uffb5\52",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0103",
            "",
            "\1\u0104",
            "",
            "\1\u0105",
            "",
            "\101\52\1\u0106\uffbe\52",
            "\163\52\1\u0107\uff8c\52",
            "\163\52\1\u0108\uff8c\52",
            "\151\52\1\u0109\uff96\52",
            "\151\52\1\u010a\uff96\52",
            "\151\52\1\u010b\uff96\52",
            "\u00e3\52\1\u010c\uff1c\52",
            "\40\52\1\u010d\uffdf\52",
            "\145\52\1\u010e\uff9a\52",
            "\155\52\1\u010f\uff92\52",
            "\157\52\1\u0110\uff90\52",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0113",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\160\52\1\u0117\uff8f\52",
            "\42\52\1\u0118\uffdd\52",
            "\42\52\1\u0119\uffdd\52",
            "\155\52\1\u011a\uff92\52",
            "\142\52\1\u011b\uff9d\52",
            "\142\52\1\u011c\uff9d\52",
            "\157\52\1\u011d\uff90\52",
            "\145\52\1\u011e\uff9a\52",
            "\55\52\1\u011f\uffd2\52",
            "\156\52\1\u0120\uff91\52",
            "\151\52\1\u0121\uff96\52",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\151\52\1\u0123\uff96\52",
            "",
            "",
            "\141\52\1\u0126\uff9e\52",
            "\165\52\1\u0127\uff8a\52",
            "\165\52\1\u0128\uff8a\52",
            "\42\52\1\u0129\uffdd\52",
            "\155\52\1\u012a\uff92\52",
            "\156\52\1\u012b\uff91\52",
            "\163\52\1\u012c\uff8c\52",
            "\156\52\1\u012d\uff91\52",
            "",
            "\42\52\1\u012e\uffdd\52",
            "",
            "",
            "\162\52\1\u012f\uff8d\52",
            "\164\52\1\u0130\uff8b\52",
            "\164\52\1\u0131\uff8b\52",
            "",
            "\40\52\1\u0133\uffdf\52",
            "\157\52\1\u0134\uff90\52",
            "\55\52\1\u0135\uffd2\52",
            "\103\52\1\u0136\uffbc\52",
            "",
            "\151\52\1\u0138\uff96\52",
            "\157\52\1\u0139\uff90\52",
            "\157\52\1\u013a\uff90\52",
            "",
            "\143\52\1\u013b\uff9c\52",
            "\155\52\1\u013c\uff92\52",
            "\156\52\1\u013d\uff91\52",
            "\157\52\1\u013e\uff90\52",
            "",
            "\141\52\1\u013f\uff9e\52",
            "\42\52\1\u0140\uffdd\52",
            "\42\52\1\u0141\uffdd\52",
            "\141\52\1\u0142\uff9e\52",
            "\145\52\1\u0143\uff9a\52",
            "\157\52\1\u0144\uff90\52",
            "\154\52\1\u0145\uff93\52",
            "\42\52\1\u0146\uffdd\52",
            "",
            "",
            "\163\52\1\u0149\uff8c\52",
            "\42\52\1\u014a\uffdd\52",
            "\155\52\1\u014b\uff92\52",
            "\165\52\1\u014c\uff8a\52",
            "",
            "",
            "",
            "\143\52\1\u014e\uff9c\52",
            "",
            "\145\52\1\u0150\uff9a\52",
            "\155\52\1\u0151\uff92\52",
            "",
            "\141\52\1\u0152\uff9e\52",
            "",
            "\42\52\1\u0153\uffdd\52",
            "\156\52\1\u0154\uff91\52",
            "\164\52\1\u0155\uff8b\52",
            "",
            "\163\52\1\u0157\uff8c\52",
            "\141\52\1\u0158\uff9e\52",
            "",
            "\55\52\1\u0159\uffd2\52",
            "\42\52\1\u015a\uffdd\52",
            "\156\52\1\u015b\uff91\52",
            "",
            "\157\52\1\u015d\uff90\52",
            "",
            "\155\52\1\u015e\uff92\52",
            "\145\52\1\u015f\uff9a\52",
            "\42\52\1\u0160\uffdd\52",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_3 = input.LA(1);

                        s = -1;
                        if ( (LA12_3=='N') ) {s = 32;}

                        else if ( (LA12_3=='E') ) {s = 33;}

                        else if ( (LA12_3=='A') ) {s = 34;}

                        else if ( (LA12_3=='C') ) {s = 35;}

                        else if ( (LA12_3=='n') ) {s = 36;}

                        else if ( (LA12_3=='t') ) {s = 37;}

                        else if ( (LA12_3=='a') ) {s = 38;}

                        else if ( (LA12_3=='o') ) {s = 39;}

                        else if ( (LA12_3=='j') ) {s = 40;}

                        else if ( (LA12_3=='i') ) {s = 41;}

                        else if ( ((LA12_3>='\u0000' && LA12_3<='@')||LA12_3=='B'||LA12_3=='D'||(LA12_3>='F' && LA12_3<='M')||(LA12_3>='O' && LA12_3<='`')||(LA12_3>='b' && LA12_3<='h')||(LA12_3>='k' && LA12_3<='m')||(LA12_3>='p' && LA12_3<='s')||(LA12_3>='u' && LA12_3<='\uFFFF')) ) {s = 42;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='{') ) {s = 1;}

                        else if ( (LA12_0=='}') ) {s = 2;}

                        else if ( (LA12_0=='\"') ) {s = 3;}

                        else if ( (LA12_0==':') ) {s = 4;}

                        else if ( (LA12_0==',') ) {s = 5;}

                        else if ( (LA12_0=='[') ) {s = 6;}

                        else if ( (LA12_0==']') ) {s = 7;}

                        else if ( (LA12_0=='A') ) {s = 8;}

                        else if ( (LA12_0=='D') ) {s = 9;}

                        else if ( (LA12_0=='M') ) {s = 10;}

                        else if ( (LA12_0=='P') ) {s = 11;}

                        else if ( (LA12_0=='R') ) {s = 12;}

                        else if ( (LA12_0=='O') ) {s = 13;}

                        else if ( (LA12_0=='B') ) {s = 14;}

                        else if ( (LA12_0=='S') ) {s = 15;}

                        else if ( (LA12_0=='C') ) {s = 16;}

                        else if ( (LA12_0=='I') ) {s = 17;}

                        else if ( (LA12_0=='L') ) {s = 18;}

                        else if ( (LA12_0=='F') ) {s = 19;}

                        else if ( (LA12_0=='T') ) {s = 20;}

                        else if ( (LA12_0=='E') ) {s = 21;}

                        else if ( (LA12_0=='H') ) {s = 22;}

                        else if ( (LA12_0=='^') ) {s = 23;}

                        else if ( (LA12_0=='G'||(LA12_0>='J' && LA12_0<='K')||LA12_0=='N'||LA12_0=='Q'||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 24;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_40 = input.LA(1);

                        s = -1;
                        if ( (LA12_40=='o') ) {s = 80;}

                        else if ( ((LA12_40>='\u0000' && LA12_40<='n')||(LA12_40>='p' && LA12_40<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_80 = input.LA(1);

                        s = -1;
                        if ( (LA12_80=='i') ) {s = 111;}

                        else if ( ((LA12_80>='\u0000' && LA12_80<='h')||(LA12_80>='j' && LA12_80<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_111 = input.LA(1);

                        s = -1;
                        if ( (LA12_111=='n') ) {s = 142;}

                        else if ( ((LA12_111>='\u0000' && LA12_111<='m')||(LA12_111>='o' && LA12_111<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_142 = input.LA(1);

                        s = -1;
                        if ( (LA12_142=='T') ) {s = 174;}

                        else if ( (LA12_142=='C') ) {s = 175;}

                        else if ( ((LA12_142>='\u0000' && LA12_142<='B')||(LA12_142>='D' && LA12_142<='S')||(LA12_142>='U' && LA12_142<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_165 = input.LA(1);

                        s = -1;
                        if ( (LA12_165=='d') ) {s = 194;}

                        else if ( ((LA12_165>='\u0000' && LA12_165<='c')||(LA12_165>='e' && LA12_165<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_194 = input.LA(1);

                        s = -1;
                        if ( (LA12_194=='a') ) {s = 221;}

                        else if ( ((LA12_194>='\u0000' && LA12_194<='`')||(LA12_194>='b' && LA12_194<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_221 = input.LA(1);

                        s = -1;
                        if ( (LA12_221==' ') ) {s = 244;}

                        else if ( ((LA12_221>='\u0000' && LA12_221<='\u001F')||(LA12_221>='!' && LA12_221<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_244 = input.LA(1);

                        s = -1;
                        if ( (LA12_244=='A') ) {s = 262;}

                        else if ( ((LA12_244>='\u0000' && LA12_244<='@')||(LA12_244>='B' && LA12_244<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA12_262 = input.LA(1);

                        s = -1;
                        if ( (LA12_262=='p') ) {s = 279;}

                        else if ( ((LA12_262>='\u0000' && LA12_262<='o')||(LA12_262>='q' && LA12_262<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA12_279 = input.LA(1);

                        s = -1;
                        if ( (LA12_279=='i') ) {s = 291;}

                        else if ( ((LA12_279>='\u0000' && LA12_279<='h')||(LA12_279>='j' && LA12_279<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA12_291 = input.LA(1);

                        s = -1;
                        if ( (LA12_291=='\"') ) {s = 302;}

                        else if ( ((LA12_291>='\u0000' && LA12_291<='!')||(LA12_291>='#' && LA12_291<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA12_33 = input.LA(1);

                        s = -1;
                        if ( (LA12_33=='n') ) {s = 73;}

                        else if ( ((LA12_33>='\u0000' && LA12_33<='m')||(LA12_33>='o' && LA12_33<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA12_73 = input.LA(1);

                        s = -1;
                        if ( (LA12_73=='t') ) {s = 104;}

                        else if ( ((LA12_73>='\u0000' && LA12_73<='s')||(LA12_73>='u' && LA12_73<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA12_104 = input.LA(1);

                        s = -1;
                        if ( (LA12_104=='i') ) {s = 135;}

                        else if ( ((LA12_104>='\u0000' && LA12_104<='h')||(LA12_104>='j' && LA12_104<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA12_135 = input.LA(1);

                        s = -1;
                        if ( (LA12_135=='d') ) {s = 167;}

                        else if ( ((LA12_135>='\u0000' && LA12_135<='c')||(LA12_135>='e' && LA12_135<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA12_167 = input.LA(1);

                        s = -1;
                        if ( (LA12_167=='a') ) {s = 196;}

                        else if ( ((LA12_167>='\u0000' && LA12_167<='`')||(LA12_167>='b' && LA12_167<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA12_196 = input.LA(1);

                        s = -1;
                        if ( (LA12_196=='d') ) {s = 222;}

                        else if ( ((LA12_196>='\u0000' && LA12_196<='c')||(LA12_196>='e' && LA12_196<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA12_222 = input.LA(1);

                        s = -1;
                        if ( (LA12_222=='e') ) {s = 245;}

                        else if ( ((LA12_222>='\u0000' && LA12_222<='d')||(LA12_222>='f' && LA12_222<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA12_245 = input.LA(1);

                        s = -1;
                        if ( (LA12_245=='s') ) {s = 263;}

                        else if ( ((LA12_245>='\u0000' && LA12_245<='r')||(LA12_245>='t' && LA12_245<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA12_263 = input.LA(1);

                        s = -1;
                        if ( (LA12_263=='\"') ) {s = 280;}

                        else if ( ((LA12_263>='\u0000' && LA12_263<='!')||(LA12_263>='#' && LA12_263<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA12_34 = input.LA(1);

                        s = -1;
                        if ( (LA12_34=='t') ) {s = 74;}

                        else if ( ((LA12_34>='\u0000' && LA12_34<='s')||(LA12_34>='u' && LA12_34<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA12_74 = input.LA(1);

                        s = -1;
                        if ( (LA12_74=='r') ) {s = 105;}

                        else if ( ((LA12_74>='\u0000' && LA12_74<='q')||(LA12_74>='s' && LA12_74<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA12_105 = input.LA(1);

                        s = -1;
                        if ( (LA12_105=='i') ) {s = 136;}

                        else if ( ((LA12_105>='\u0000' && LA12_105<='h')||(LA12_105>='j' && LA12_105<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA12_136 = input.LA(1);

                        s = -1;
                        if ( (LA12_136=='b') ) {s = 168;}

                        else if ( ((LA12_136>='\u0000' && LA12_136<='a')||(LA12_136>='c' && LA12_136<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA12_168 = input.LA(1);

                        s = -1;
                        if ( (LA12_168=='u') ) {s = 197;}

                        else if ( ((LA12_168>='\u0000' && LA12_168<='t')||(LA12_168>='v' && LA12_168<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA12_197 = input.LA(1);

                        s = -1;
                        if ( (LA12_197=='t') ) {s = 223;}

                        else if ( ((LA12_197>='\u0000' && LA12_197<='s')||(LA12_197>='u' && LA12_197<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA12_223 = input.LA(1);

                        s = -1;
                        if ( (LA12_223=='o') ) {s = 246;}

                        else if ( ((LA12_223>='\u0000' && LA12_223<='n')||(LA12_223>='p' && LA12_223<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA12_246 = input.LA(1);

                        s = -1;
                        if ( (LA12_246=='s') ) {s = 264;}

                        else if ( ((LA12_246>='\u0000' && LA12_246<='r')||(LA12_246>='t' && LA12_246<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA12_264 = input.LA(1);

                        s = -1;
                        if ( (LA12_264=='\"') ) {s = 281;}

                        else if ( ((LA12_264>='\u0000' && LA12_264<='!')||(LA12_264>='#' && LA12_264<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA12_35 = input.LA(1);

                        s = -1;
                        if ( (LA12_35=='h') ) {s = 75;}

                        else if ( ((LA12_35>='\u0000' && LA12_35<='g')||(LA12_35>='i' && LA12_35<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA12_75 = input.LA(1);

                        s = -1;
                        if ( (LA12_75=='a') ) {s = 106;}

                        else if ( ((LA12_75>='\u0000' && LA12_75<='`')||(LA12_75>='b' && LA12_75<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA12_106 = input.LA(1);

                        s = -1;
                        if ( (LA12_106=='v') ) {s = 137;}

                        else if ( ((LA12_106>='\u0000' && LA12_106<='u')||(LA12_106>='w' && LA12_106<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA12_137 = input.LA(1);

                        s = -1;
                        if ( (LA12_137=='e') ) {s = 169;}

                        else if ( ((LA12_137>='\u0000' && LA12_137<='d')||(LA12_137>='f' && LA12_137<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA12_169 = input.LA(1);

                        s = -1;
                        if ( (LA12_169==' ') ) {s = 198;}

                        else if ( ((LA12_169>='\u0000' && LA12_169<='\u001F')||(LA12_169>='!' && LA12_169<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA12_198 = input.LA(1);

                        s = -1;
                        if ( (LA12_198=='P') ) {s = 224;}

                        else if ( ((LA12_198>='\u0000' && LA12_198<='O')||(LA12_198>='Q' && LA12_198<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA12_224 = input.LA(1);

                        s = -1;
                        if ( (LA12_224=='r') ) {s = 247;}

                        else if ( ((LA12_224>='\u0000' && LA12_224<='q')||(LA12_224>='s' && LA12_224<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA12_247 = input.LA(1);

                        s = -1;
                        if ( (LA12_247=='i') ) {s = 265;}

                        else if ( ((LA12_247>='\u0000' && LA12_247<='h')||(LA12_247>='j' && LA12_247<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA12_265 = input.LA(1);

                        s = -1;
                        if ( (LA12_265=='m') ) {s = 282;}

                        else if ( ((LA12_265>='\u0000' && LA12_265<='l')||(LA12_265>='n' && LA12_265<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA12_282 = input.LA(1);

                        s = -1;
                        if ( (LA12_282=='a') ) {s = 294;}

                        else if ( ((LA12_282>='\u0000' && LA12_282<='`')||(LA12_282>='b' && LA12_282<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA12_294 = input.LA(1);

                        s = -1;
                        if ( (LA12_294=='r') ) {s = 303;}

                        else if ( ((LA12_294>='\u0000' && LA12_294<='q')||(LA12_294>='s' && LA12_294<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA12_303 = input.LA(1);

                        s = -1;
                        if ( (LA12_303=='i') ) {s = 312;}

                        else if ( ((LA12_303>='\u0000' && LA12_303<='h')||(LA12_303>='j' && LA12_303<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA12_312 = input.LA(1);

                        s = -1;
                        if ( (LA12_312=='a') ) {s = 319;}

                        else if ( ((LA12_312>='\u0000' && LA12_312<='`')||(LA12_312>='b' && LA12_312<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA12_319 = input.LA(1);

                        s = -1;
                        if ( (LA12_319=='\"') ) {s = 326;}

                        else if ( ((LA12_319>='\u0000' && LA12_319<='!')||(LA12_319>='#' && LA12_319<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA12_36 = input.LA(1);

                        s = -1;
                        if ( (LA12_36=='o') ) {s = 76;}

                        else if ( ((LA12_36>='\u0000' && LA12_36<='n')||(LA12_36>='p' && LA12_36<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA12_76 = input.LA(1);

                        s = -1;
                        if ( (LA12_76=='m') ) {s = 107;}

                        else if ( ((LA12_76>='\u0000' && LA12_76<='l')||(LA12_76>='n' && LA12_76<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA12_107 = input.LA(1);

                        s = -1;
                        if ( (LA12_107=='e') ) {s = 138;}

                        else if ( ((LA12_107>='\u0000' && LA12_107<='d')||(LA12_107>='f' && LA12_107<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA12_138 = input.LA(1);

                        s = -1;
                        if ( (LA12_138=='-') ) {s = 170;}

                        else if ( ((LA12_138>='\u0000' && LA12_138<=',')||(LA12_138>='.' && LA12_138<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA12_170 = input.LA(1);

                        s = -1;
                        if ( (LA12_170=='a') ) {s = 199;}

                        else if ( ((LA12_170>='\u0000' && LA12_170<='`')||(LA12_170>='b' && LA12_170<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA12_199 = input.LA(1);

                        s = -1;
                        if ( (LA12_199=='t') ) {s = 225;}

                        else if ( ((LA12_199>='\u0000' && LA12_199<='s')||(LA12_199>='u' && LA12_199<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA12_225 = input.LA(1);

                        s = -1;
                        if ( (LA12_225=='r') ) {s = 248;}

                        else if ( ((LA12_225>='\u0000' && LA12_225<='q')||(LA12_225>='s' && LA12_225<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA12_248 = input.LA(1);

                        s = -1;
                        if ( (LA12_248=='i') ) {s = 266;}

                        else if ( ((LA12_248>='\u0000' && LA12_248<='h')||(LA12_248>='j' && LA12_248<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA12_266 = input.LA(1);

                        s = -1;
                        if ( (LA12_266=='b') ) {s = 283;}

                        else if ( ((LA12_266>='\u0000' && LA12_266<='a')||(LA12_266>='c' && LA12_266<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA12_283 = input.LA(1);

                        s = -1;
                        if ( (LA12_283=='u') ) {s = 295;}

                        else if ( ((LA12_283>='\u0000' && LA12_283<='t')||(LA12_283>='v' && LA12_283<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA12_295 = input.LA(1);

                        s = -1;
                        if ( (LA12_295=='t') ) {s = 304;}

                        else if ( ((LA12_295>='\u0000' && LA12_295<='s')||(LA12_295>='u' && LA12_295<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA12_304 = input.LA(1);

                        s = -1;
                        if ( (LA12_304=='o') ) {s = 313;}

                        else if ( ((LA12_304>='\u0000' && LA12_304<='n')||(LA12_304>='p' && LA12_304<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA12_313 = input.LA(1);

                        s = -1;
                        if ( (LA12_313=='\"') ) {s = 320;}

                        else if ( ((LA12_313>='\u0000' && LA12_313<='!')||(LA12_313>='#' && LA12_313<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( (LA12_37=='i') ) {s = 77;}

                        else if ( ((LA12_37>='\u0000' && LA12_37<='h')||(LA12_37>='j' && LA12_37<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 42;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA12_77 = input.LA(1);

                        s = -1;
                        if ( (LA12_77=='p') ) {s = 108;}

                        else if ( ((LA12_77>='\u0000' && LA12_77<='o')||(LA12_77>='q' && LA12_77<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA12_108 = input.LA(1);

                        s = -1;
                        if ( (LA12_108=='o') ) {s = 139;}

                        else if ( ((LA12_108>='\u0000' && LA12_108<='n')||(LA12_108>='p' && LA12_108<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA12_139 = input.LA(1);

                        s = -1;
                        if ( (LA12_139=='-') ) {s = 171;}

                        else if ( ((LA12_139>='\u0000' && LA12_139<=',')||(LA12_139>='.' && LA12_139<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA12_171 = input.LA(1);

                        s = -1;
                        if ( (LA12_171=='a') ) {s = 200;}

                        else if ( ((LA12_171>='\u0000' && LA12_171<='`')||(LA12_171>='b' && LA12_171<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA12_200 = input.LA(1);

                        s = -1;
                        if ( (LA12_200=='t') ) {s = 226;}

                        else if ( ((LA12_200>='\u0000' && LA12_200<='s')||(LA12_200>='u' && LA12_200<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA12_226 = input.LA(1);

                        s = -1;
                        if ( (LA12_226=='r') ) {s = 249;}

                        else if ( ((LA12_226>='\u0000' && LA12_226<='q')||(LA12_226>='s' && LA12_226<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA12_249 = input.LA(1);

                        s = -1;
                        if ( (LA12_249=='i') ) {s = 267;}

                        else if ( ((LA12_249>='\u0000' && LA12_249<='h')||(LA12_249>='j' && LA12_249<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA12_267 = input.LA(1);

                        s = -1;
                        if ( (LA12_267=='b') ) {s = 284;}

                        else if ( ((LA12_267>='\u0000' && LA12_267<='a')||(LA12_267>='c' && LA12_267<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA12_284 = input.LA(1);

                        s = -1;
                        if ( (LA12_284=='u') ) {s = 296;}

                        else if ( ((LA12_284>='\u0000' && LA12_284<='t')||(LA12_284>='v' && LA12_284<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA12_296 = input.LA(1);

                        s = -1;
                        if ( (LA12_296=='t') ) {s = 305;}

                        else if ( ((LA12_296>='\u0000' && LA12_296<='s')||(LA12_296>='u' && LA12_296<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA12_305 = input.LA(1);

                        s = -1;
                        if ( (LA12_305=='o') ) {s = 314;}

                        else if ( ((LA12_305>='\u0000' && LA12_305<='n')||(LA12_305>='p' && LA12_305<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA12_314 = input.LA(1);

                        s = -1;
                        if ( (LA12_314=='\"') ) {s = 321;}

                        else if ( ((LA12_314>='\u0000' && LA12_314<='!')||(LA12_314>='#' && LA12_314<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( (LA12_38=='s') ) {s = 78;}

                        else if ( ((LA12_38>='\u0000' && LA12_38<='r')||(LA12_38>='t' && LA12_38<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA12_78 = input.LA(1);

                        s = -1;
                        if ( (LA12_78=='s') ) {s = 109;}

                        else if ( ((LA12_78>='\u0000' && LA12_78<='r')||(LA12_78>='t' && LA12_78<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA12_109 = input.LA(1);

                        s = -1;
                        if ( (LA12_109=='o') ) {s = 140;}

                        else if ( ((LA12_109>='\u0000' && LA12_109<='n')||(LA12_109>='p' && LA12_109<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA12_140 = input.LA(1);

                        s = -1;
                        if ( (LA12_140=='c') ) {s = 172;}

                        else if ( ((LA12_140>='\u0000' && LA12_140<='b')||(LA12_140>='d' && LA12_140<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA12_172 = input.LA(1);

                        s = -1;
                        if ( (LA12_172=='i') ) {s = 201;}

                        else if ( ((LA12_172>='\u0000' && LA12_172<='h')||(LA12_172>='j' && LA12_172<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA12_201 = input.LA(1);

                        s = -1;
                        if ( (LA12_201=='a') ) {s = 227;}

                        else if ( ((LA12_201>='\u0000' && LA12_201<='`')||(LA12_201>='b' && LA12_201<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA12_227 = input.LA(1);

                        s = -1;
                        if ( (LA12_227=='\u00E7') ) {s = 250;}

                        else if ( ((LA12_227>='\u0000' && LA12_227<='\u00E6')||(LA12_227>='\u00E8' && LA12_227<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA12_250 = input.LA(1);

                        s = -1;
                        if ( (LA12_250=='\u00E3') ) {s = 268;}

                        else if ( ((LA12_250>='\u0000' && LA12_250<='\u00E2')||(LA12_250>='\u00E4' && LA12_250<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA12_268 = input.LA(1);

                        s = -1;
                        if ( (LA12_268=='o') ) {s = 285;}

                        else if ( ((LA12_268>='\u0000' && LA12_268<='n')||(LA12_268>='p' && LA12_268<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA12_285 = input.LA(1);

                        s = -1;
                        if ( (LA12_285=='\"') ) {s = 297;}

                        else if ( ((LA12_285>='\u0000' && LA12_285<='!')||(LA12_285>='#' && LA12_285<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA12_39 = input.LA(1);

                        s = -1;
                        if ( (LA12_39=='p') ) {s = 79;}

                        else if ( ((LA12_39>='\u0000' && LA12_39<='o')||(LA12_39>='q' && LA12_39<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA12_79 = input.LA(1);

                        s = -1;
                        if ( (LA12_79=='e') ) {s = 110;}

                        else if ( ((LA12_79>='\u0000' && LA12_79<='d')||(LA12_79>='f' && LA12_79<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA12_110 = input.LA(1);

                        s = -1;
                        if ( (LA12_110=='r') ) {s = 141;}

                        else if ( ((LA12_110>='\u0000' && LA12_110<='q')||(LA12_110>='s' && LA12_110<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA12_141 = input.LA(1);

                        s = -1;
                        if ( (LA12_141=='a') ) {s = 173;}

                        else if ( ((LA12_141>='\u0000' && LA12_141<='`')||(LA12_141>='b' && LA12_141<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA12_173 = input.LA(1);

                        s = -1;
                        if ( (LA12_173=='\u00E7') ) {s = 202;}

                        else if ( ((LA12_173>='\u0000' && LA12_173<='\u00E6')||(LA12_173>='\u00E8' && LA12_173<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA12_202 = input.LA(1);

                        s = -1;
                        if ( (LA12_202=='\u00E3') ) {s = 228;}

                        else if ( ((LA12_202>='\u0000' && LA12_202<='\u00E2')||(LA12_202>='\u00E4' && LA12_202<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA12_228 = input.LA(1);

                        s = -1;
                        if ( (LA12_228=='o') ) {s = 251;}

                        else if ( ((LA12_228>='\u0000' && LA12_228<='n')||(LA12_228>='p' && LA12_228<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA12_251 = input.LA(1);

                        s = -1;
                        if ( (LA12_251==' ') ) {s = 269;}

                        else if ( ((LA12_251>='\u0000' && LA12_251<='\u001F')||(LA12_251>='!' && LA12_251<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA12_269 = input.LA(1);

                        s = -1;
                        if ( (LA12_269=='e') ) {s = 286;}

                        else if ( ((LA12_269>='\u0000' && LA12_269<='d')||(LA12_269>='f' && LA12_269<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA12_286 = input.LA(1);

                        s = -1;
                        if ( (LA12_286=='m') ) {s = 298;}

                        else if ( ((LA12_286>='\u0000' && LA12_286<='l')||(LA12_286>='n' && LA12_286<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA12_298 = input.LA(1);

                        s = -1;
                        if ( (LA12_298==' ') ) {s = 307;}

                        else if ( ((LA12_298>='\u0000' && LA12_298<='\u001F')||(LA12_298>='!' && LA12_298<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA12_307 = input.LA(1);

                        s = -1;
                        if ( (LA12_307=='c') ) {s = 315;}

                        else if ( ((LA12_307>='\u0000' && LA12_307<='b')||(LA12_307>='d' && LA12_307<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA12_315 = input.LA(1);

                        s = -1;
                        if ( (LA12_315=='a') ) {s = 322;}

                        else if ( ((LA12_315>='\u0000' && LA12_315<='`')||(LA12_315>='b' && LA12_315<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA12_322 = input.LA(1);

                        s = -1;
                        if ( (LA12_322=='s') ) {s = 329;}

                        else if ( ((LA12_322>='\u0000' && LA12_322<='r')||(LA12_322>='t' && LA12_322<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA12_329 = input.LA(1);

                        s = -1;
                        if ( (LA12_329=='c') ) {s = 334;}

                        else if ( ((LA12_329>='\u0000' && LA12_329<='b')||(LA12_329>='d' && LA12_329<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA12_334 = input.LA(1);

                        s = -1;
                        if ( (LA12_334=='a') ) {s = 338;}

                        else if ( ((LA12_334>='\u0000' && LA12_334<='`')||(LA12_334>='b' && LA12_334<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA12_338 = input.LA(1);

                        s = -1;
                        if ( (LA12_338=='t') ) {s = 341;}

                        else if ( ((LA12_338>='\u0000' && LA12_338<='s')||(LA12_338>='u' && LA12_338<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA12_341 = input.LA(1);

                        s = -1;
                        if ( (LA12_341=='a') ) {s = 344;}

                        else if ( ((LA12_341>='\u0000' && LA12_341<='`')||(LA12_341>='b' && LA12_341<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA12_32 = input.LA(1);

                        s = -1;
                        if ( (LA12_32=='o') ) {s = 72;}

                        else if ( ((LA12_32>='\u0000' && LA12_32<='n')||(LA12_32>='p' && LA12_32<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA12_344 = input.LA(1);

                        s = -1;
                        if ( (LA12_344=='\"') ) {s = 346;}

                        else if ( ((LA12_344>='\u0000' && LA12_344<='!')||(LA12_344>='#' && LA12_344<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA12_72 = input.LA(1);

                        s = -1;
                        if ( (LA12_72=='m') ) {s = 103;}

                        else if ( ((LA12_72>='\u0000' && LA12_72<='l')||(LA12_72>='n' && LA12_72<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA12_103 = input.LA(1);

                        s = -1;
                        if ( (LA12_103=='e') ) {s = 134;}

                        else if ( ((LA12_103>='\u0000' && LA12_103<='d')||(LA12_103>='f' && LA12_103<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA12_134 = input.LA(1);

                        s = -1;
                        if ( (LA12_134==' ') ) {s = 165;}

                        else if ( (LA12_134=='\"') ) {s = 166;}

                        else if ( ((LA12_134>='\u0000' && LA12_134<='\u001F')||LA12_134=='!'||(LA12_134>='#' && LA12_134<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA12_174 = input.LA(1);

                        s = -1;
                        if ( (LA12_174=='a') ) {s = 203;}

                        else if ( ((LA12_174>='\u0000' && LA12_174<='`')||(LA12_174>='b' && LA12_174<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA12_203 = input.LA(1);

                        s = -1;
                        if ( (LA12_203=='b') ) {s = 229;}

                        else if ( ((LA12_203>='\u0000' && LA12_203<='a')||(LA12_203>='c' && LA12_203<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA12_229 = input.LA(1);

                        s = -1;
                        if ( (LA12_229=='l') ) {s = 252;}

                        else if ( ((LA12_229>='\u0000' && LA12_229<='k')||(LA12_229>='m' && LA12_229<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA12_252 = input.LA(1);

                        s = -1;
                        if ( (LA12_252=='e') ) {s = 270;}

                        else if ( ((LA12_252>='\u0000' && LA12_252<='d')||(LA12_252>='f' && LA12_252<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA12_270 = input.LA(1);

                        s = -1;
                        if ( (LA12_270=='-') ) {s = 287;}

                        else if ( ((LA12_270>='\u0000' && LA12_270<=',')||(LA12_270>='.' && LA12_270<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA12_287 = input.LA(1);

                        s = -1;
                        if ( (LA12_287=='n') ) {s = 299;}

                        else if ( ((LA12_287>='\u0000' && LA12_287<='m')||(LA12_287>='o' && LA12_287<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA12_299 = input.LA(1);

                        s = -1;
                        if ( (LA12_299=='o') ) {s = 308;}

                        else if ( ((LA12_299>='\u0000' && LA12_299<='n')||(LA12_299>='p' && LA12_299<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA12_308 = input.LA(1);

                        s = -1;
                        if ( (LA12_308=='m') ) {s = 316;}

                        else if ( ((LA12_308>='\u0000' && LA12_308<='l')||(LA12_308>='n' && LA12_308<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA12_316 = input.LA(1);

                        s = -1;
                        if ( (LA12_316=='e') ) {s = 323;}

                        else if ( ((LA12_316>='\u0000' && LA12_316<='d')||(LA12_316>='f' && LA12_316<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA12_323 = input.LA(1);

                        s = -1;
                        if ( (LA12_323=='\"') ) {s = 330;}

                        else if ( ((LA12_323>='\u0000' && LA12_323<='!')||(LA12_323>='#' && LA12_323<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA12_175 = input.LA(1);

                        s = -1;
                        if ( (LA12_175=='o') ) {s = 204;}

                        else if ( ((LA12_175>='\u0000' && LA12_175<='n')||(LA12_175>='p' && LA12_175<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA12_204 = input.LA(1);

                        s = -1;
                        if ( (LA12_204=='l') ) {s = 230;}

                        else if ( ((LA12_204>='\u0000' && LA12_204<='k')||(LA12_204>='m' && LA12_204<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA12_230 = input.LA(1);

                        s = -1;
                        if ( (LA12_230=='u') ) {s = 253;}

                        else if ( ((LA12_230>='\u0000' && LA12_230<='t')||(LA12_230>='v' && LA12_230<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA12_253 = input.LA(1);

                        s = -1;
                        if ( (LA12_253=='m') ) {s = 271;}

                        else if ( ((LA12_253>='\u0000' && LA12_253<='l')||(LA12_253>='n' && LA12_253<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA12_271 = input.LA(1);

                        s = -1;
                        if ( (LA12_271=='n') ) {s = 288;}

                        else if ( ((LA12_271>='\u0000' && LA12_271<='m')||(LA12_271>='o' && LA12_271<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA12_288 = input.LA(1);

                        s = -1;
                        if ( (LA12_288=='s') ) {s = 300;}

                        else if ( ((LA12_288>='\u0000' && LA12_288<='r')||(LA12_288>='t' && LA12_288<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA12_300 = input.LA(1);

                        s = -1;
                        if ( (LA12_300=='-') ) {s = 309;}

                        else if ( ((LA12_300>='\u0000' && LA12_300<=',')||(LA12_300>='.' && LA12_300<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA12_309 = input.LA(1);

                        s = -1;
                        if ( (LA12_309=='n') ) {s = 317;}

                        else if ( ((LA12_309>='\u0000' && LA12_309<='m')||(LA12_309>='o' && LA12_309<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA12_317 = input.LA(1);

                        s = -1;
                        if ( (LA12_317=='o') ) {s = 324;}

                        else if ( ((LA12_317>='\u0000' && LA12_317<='n')||(LA12_317>='p' && LA12_317<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA12_324 = input.LA(1);

                        s = -1;
                        if ( (LA12_324=='m') ) {s = 331;}

                        else if ( ((LA12_324>='\u0000' && LA12_324<='l')||(LA12_324>='n' && LA12_324<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA12_331 = input.LA(1);

                        s = -1;
                        if ( (LA12_331=='e') ) {s = 336;}

                        else if ( ((LA12_331>='\u0000' && LA12_331<='d')||(LA12_331>='f' && LA12_331<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA12_336 = input.LA(1);

                        s = -1;
                        if ( (LA12_336=='\"') ) {s = 339;}

                        else if ( ((LA12_336>='\u0000' && LA12_336<='!')||(LA12_336>='#' && LA12_336<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA12_41 = input.LA(1);

                        s = -1;
                        if ( (LA12_41=='n') ) {s = 81;}

                        else if ( ((LA12_41>='\u0000' && LA12_41<='m')||(LA12_41>='o' && LA12_41<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA12_81 = input.LA(1);

                        s = -1;
                        if ( (LA12_81=='v') ) {s = 112;}

                        else if ( ((LA12_81>='\u0000' && LA12_81<='u')||(LA12_81>='w' && LA12_81<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA12_112 = input.LA(1);

                        s = -1;
                        if ( (LA12_112=='e') ) {s = 143;}

                        else if ( ((LA12_112>='\u0000' && LA12_112<='d')||(LA12_112>='f' && LA12_112<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA12_143 = input.LA(1);

                        s = -1;
                        if ( (LA12_143=='r') ) {s = 176;}

                        else if ( ((LA12_143>='\u0000' && LA12_143<='q')||(LA12_143>='s' && LA12_143<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA12_176 = input.LA(1);

                        s = -1;
                        if ( (LA12_176=='s') ) {s = 205;}

                        else if ( ((LA12_176>='\u0000' && LA12_176<='r')||(LA12_176>='t' && LA12_176<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA12_205 = input.LA(1);

                        s = -1;
                        if ( (LA12_205=='e') ) {s = 231;}

                        else if ( ((LA12_205>='\u0000' && LA12_205<='d')||(LA12_205>='f' && LA12_205<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA12_231 = input.LA(1);

                        s = -1;
                        if ( (LA12_231=='J') ) {s = 254;}

                        else if ( ((LA12_231>='\u0000' && LA12_231<='I')||(LA12_231>='K' && LA12_231<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA12_254 = input.LA(1);

                        s = -1;
                        if ( (LA12_254=='o') ) {s = 272;}

                        else if ( ((LA12_254>='\u0000' && LA12_254<='n')||(LA12_254>='p' && LA12_254<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA12_272 = input.LA(1);

                        s = -1;
                        if ( (LA12_272=='i') ) {s = 289;}

                        else if ( ((LA12_272>='\u0000' && LA12_272<='h')||(LA12_272>='j' && LA12_272<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA12_289 = input.LA(1);

                        s = -1;
                        if ( (LA12_289=='n') ) {s = 301;}

                        else if ( ((LA12_289>='\u0000' && LA12_289<='m')||(LA12_289>='o' && LA12_289<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA12_301 = input.LA(1);

                        s = -1;
                        if ( (LA12_301=='C') ) {s = 310;}

                        else if ( ((LA12_301>='\u0000' && LA12_301<='B')||(LA12_301>='D' && LA12_301<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA12_310 = input.LA(1);

                        s = -1;
                        if ( (LA12_310=='o') ) {s = 318;}

                        else if ( ((LA12_310>='\u0000' && LA12_310<='n')||(LA12_310>='p' && LA12_310<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA12_318 = input.LA(1);

                        s = -1;
                        if ( (LA12_318=='l') ) {s = 325;}

                        else if ( ((LA12_318>='\u0000' && LA12_318<='k')||(LA12_318>='m' && LA12_318<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA12_325 = input.LA(1);

                        s = -1;
                        if ( (LA12_325=='u') ) {s = 332;}

                        else if ( ((LA12_325>='\u0000' && LA12_325<='t')||(LA12_325>='v' && LA12_325<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA12_332 = input.LA(1);

                        s = -1;
                        if ( (LA12_332=='m') ) {s = 337;}

                        else if ( ((LA12_332>='\u0000' && LA12_332<='l')||(LA12_332>='n' && LA12_332<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA12_337 = input.LA(1);

                        s = -1;
                        if ( (LA12_337=='n') ) {s = 340;}

                        else if ( ((LA12_337>='\u0000' && LA12_337<='m')||(LA12_337>='o' && LA12_337<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA12_340 = input.LA(1);

                        s = -1;
                        if ( (LA12_340=='s') ) {s = 343;}

                        else if ( ((LA12_340>='\u0000' && LA12_340<='r')||(LA12_340>='t' && LA12_340<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA12_343 = input.LA(1);

                        s = -1;
                        if ( (LA12_343=='-') ) {s = 345;}

                        else if ( ((LA12_343>='\u0000' && LA12_343<=',')||(LA12_343>='.' && LA12_343<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA12_345 = input.LA(1);

                        s = -1;
                        if ( (LA12_345=='n') ) {s = 347;}

                        else if ( ((LA12_345>='\u0000' && LA12_345<='m')||(LA12_345>='o' && LA12_345<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA12_347 = input.LA(1);

                        s = -1;
                        if ( (LA12_347=='o') ) {s = 349;}

                        else if ( ((LA12_347>='\u0000' && LA12_347<='n')||(LA12_347>='p' && LA12_347<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA12_349 = input.LA(1);

                        s = -1;
                        if ( (LA12_349=='m') ) {s = 350;}

                        else if ( ((LA12_349>='\u0000' && LA12_349<='l')||(LA12_349>='n' && LA12_349<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA12_350 = input.LA(1);

                        s = -1;
                        if ( (LA12_350=='e') ) {s = 351;}

                        else if ( ((LA12_350>='\u0000' && LA12_350<='d')||(LA12_350>='f' && LA12_350<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA12_351 = input.LA(1);

                        s = -1;
                        if ( (LA12_351=='\"') ) {s = 352;}

                        else if ( ((LA12_351>='\u0000' && LA12_351<='!')||(LA12_351>='#' && LA12_351<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}