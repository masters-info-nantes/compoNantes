package org.xtext.example.compoNantes.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.compoNantes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'provided'", "'system'", "'{'", "'}'", "'component'", "'interface'", "'port'", "'connector'"
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
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleModel : ( ( rule__Model__SystemsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__Model__SystemsAssignment )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__SystemsAssignment )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__Model__SystemsAssignment )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__Model__SystemsAssignment )*
            {
             before(grammarAccess.getModelAccess().getSystemsAssignment()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__Model__SystemsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__Model__SystemsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__SystemsAssignment_in_ruleModel94);
            	    rule__Model__SystemsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSystemsAssignment()); 

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


    // $ANTLR start "entryRuleSystem"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleSystem EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem122);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem129); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__System__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__System__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__System__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__System__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__System__Group__0
            {
            pushFollow(FOLLOW_rule__System__Group__0_in_ruleSystem155);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleComponent EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent182);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent189); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__Component__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__Component__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent215);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleRequired"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleRequired : ruleRequired EOF ;
    public final void entryRuleRequired() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleRequired EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleRequired EOF
            {
             before(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_ruleRequired_in_entryRuleRequired242);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getRequiredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequired249); 

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
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleRequired : ( 'required' ) ;
    public final void ruleRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( 'required' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( 'required' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( 'required' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: 'required'
            {
             before(grammarAccess.getRequiredAccess().getRequiredKeyword()); 
            match(input,11,FOLLOW_11_in_ruleRequired276); 
             after(grammarAccess.getRequiredAccess().getRequiredKeyword()); 

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
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleProvided"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleProvided : ruleProvided EOF ;
    public final void entryRuleProvided() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleProvided EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleProvided EOF
            {
             before(grammarAccess.getProvidedRule()); 
            pushFollow(FOLLOW_ruleProvided_in_entryRuleProvided304);
            ruleProvided();

            state._fsp--;

             after(grammarAccess.getProvidedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvided311); 

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
    // $ANTLR end "entryRuleProvided"


    // $ANTLR start "ruleProvided"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleProvided : ( 'provided' ) ;
    public final void ruleProvided() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( 'provided' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( 'provided' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( 'provided' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: 'provided'
            {
             before(grammarAccess.getProvidedAccess().getProvidedKeyword()); 
            match(input,12,FOLLOW_12_in_ruleProvided338); 
             after(grammarAccess.getProvidedAccess().getProvidedKeyword()); 

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
    // $ANTLR end "ruleProvided"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ( ruleType EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:206:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType366);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType373); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:213:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:217:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:220:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:220:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType399);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ( ruleInterface EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:234:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface426);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface433); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:241:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:245:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:248:1: ( rule__Interface__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:248:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface459);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ( rulePort EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:262:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort486);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort493); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:269:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:273:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:276:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:276:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort519);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ruleConnector EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector546);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector553); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:297:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:301:2: ( ( ( rule__Connector__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( ( rule__Connector__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( ( rule__Connector__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:304:1: ( rule__Connector__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:304:2: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_rule__Connector__Group__0_in_ruleConnector579);
            rule__Connector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getGroup()); 

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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: rule__Type__Alternatives : ( ( ruleRequired ) | ( ruleProvided ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:320:1: ( ( ruleRequired ) | ( ruleProvided ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ( ruleRequired )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ( ruleRequired )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:322:1: ruleRequired
                    {
                     before(grammarAccess.getTypeAccess().getRequiredParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRequired_in_rule__Type__Alternatives615);
                    ruleRequired();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRequiredParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:327:6: ( ruleProvided )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:327:6: ( ruleProvided )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ruleProvided
                    {
                     before(grammarAccess.getTypeAccess().getProvidedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProvided_in_rule__Type__Alternatives632);
                    ruleProvided();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getProvidedParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__System__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:345:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0662);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__0665);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( ( 'system' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( 'system' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( 'system' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__System__Group__0__Impl693); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:375:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:376:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1724);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__1727);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:388:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:390:1: ( rule__System__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:390:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl754);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:404:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:405:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2784);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__2787);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:416:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:417:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:418:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__System__Group__2__Impl815); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:431:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:436:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3846);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__3849);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: rule__System__Group__3__Impl : ( ( rule__System__ComponentsAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:447:1: ( ( ( rule__System__ComponentsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: ( ( rule__System__ComponentsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:448:1: ( ( rule__System__ComponentsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: ( rule__System__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getComponentsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:450:1: ( rule__System__ComponentsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:450:2: rule__System__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__ComponentsAssignment_3_in_rule__System__Group__3__Impl876);
            	    rule__System__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:465:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4907);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__4910);
            rule__System__Group__5();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:472:1: rule__System__Group__4__Impl : ( ( rule__System__ConnectorsAssignment_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ( ( ( rule__System__ConnectorsAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ( rule__System__ConnectorsAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: ( ( rule__System__ConnectorsAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: ( rule__System__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getSystemAccess().getConnectorsAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:479:1: ( rule__System__ConnectorsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:479:2: rule__System__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__System__ConnectorsAssignment_4_in_rule__System__Group__4__Impl937);
            	    rule__System__ConnectorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getConnectorsAssignment_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group__5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: ( rule__System__Group__5__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:494:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5968);
            rule__System__Group__5__Impl();

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
    // $ANTLR end "rule__System__Group__5"


    // $ANTLR start "rule__System__Group__5__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:500:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:504:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:506:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__System__Group__5__Impl996); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__System__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:531:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:535:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:536:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01039);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01042);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:543:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ( ( 'component' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ( 'component' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:548:1: ( 'component' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:549:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group__0__Impl1070); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:562:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:567:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11101);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11104);
            rule__Component__Group__2();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:574:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Component__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:581:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1131);
            rule__Component__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:591:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:596:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21161);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21164);
            rule__Component__Group__3();

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
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:607:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group__2__Impl1192); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:627:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31223);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31226);
            rule__Component__Group__4();

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
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: rule__Component__Group__3__Impl : ( ( rule__Component__InterfacesAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( ( ( rule__Component__InterfacesAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( ( rule__Component__InterfacesAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:639:1: ( ( rule__Component__InterfacesAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: ( rule__Component__InterfacesAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getInterfacesAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:641:1: ( rule__Component__InterfacesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:641:2: rule__Component__InterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__InterfacesAssignment_3_in_rule__Component__Group__3__Impl1253);
            	    rule__Component__InterfacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getInterfacesAssignment_3()); 

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
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:656:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41284);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41287);
            rule__Component__Group__5();

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
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:663:1: rule__Component__Group__4__Impl : ( ( rule__Component__PortsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:667:1: ( ( ( rule__Component__PortsAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( rule__Component__PortsAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( rule__Component__PortsAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( rule__Component__PortsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( rule__Component__PortsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:670:2: rule__Component__PortsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_4_in_rule__Component__Group__4__Impl1314);
            	    rule__Component__PortsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPortsAssignment_4()); 

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
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: ( rule__Component__Group__5__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:685:2: rule__Component__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51345);
            rule__Component__Group__5__Impl();

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
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:695:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:697:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group__5__Impl1373); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:727:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01416);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01419);
            rule__Interface__Group__1();

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
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:734:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( ( 'interface' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'interface' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( 'interface' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Interface__Group__0__Impl1447); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:757:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:758:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11478);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11481);
            rule__Interface__Group__2();

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
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__NameAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:769:1: ( ( ( rule__Interface__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ( rule__Interface__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ( rule__Interface__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( rule__Interface__NameAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( rule__Interface__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:772:2: rule__Interface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl1508);
            rule__Interface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( rule__Interface__Group__2__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:787:2: rule__Interface__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21538);
            rule__Interface__Group__2__Impl();

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
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__TypeAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( ( ( rule__Interface__TypeAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( rule__Interface__TypeAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( ( rule__Interface__TypeAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( rule__Interface__TypeAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getTypeAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: ( rule__Interface__TypeAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:800:2: rule__Interface__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__TypeAssignment_2_in_rule__Interface__Group__2__Impl1565);
            rule__Interface__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:821:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01601);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01604);
            rule__Port__Group__1();

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
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Port__Group__0__Impl1632); 
             after(grammarAccess.getPortAccess().getPortKeyword_0()); 

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
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: ( rule__Port__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:852:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11663);
            rule__Port__Group__1__Impl();

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
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:865:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:865:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl1690);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:884:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__01724);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__01727);
            rule__Connector__Group__1();

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
    // $ANTLR end "rule__Connector__Group__0"


    // $ANTLR start "rule__Connector__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: rule__Connector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: ( ( 'connector' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( 'connector' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( 'connector' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Connector__Group__0__Impl1755); 
             after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 

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
    // $ANTLR end "rule__Connector__Group__0__Impl"


    // $ANTLR start "rule__Connector__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:915:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__11786);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__11789);
            rule__Connector__Group__2();

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
    // $ANTLR end "rule__Connector__Group__1"


    // $ANTLR start "rule__Connector__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( ( rule__Connector__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:929:1: ( rule__Connector__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:929:2: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl1816);
            rule__Connector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Connector__Group__1__Impl"


    // $ANTLR start "rule__Connector__Group__2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:944:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__21846);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__21849);
            rule__Connector__Group__3();

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
    // $ANTLR end "rule__Connector__Group__2"


    // $ANTLR start "rule__Connector__Group__2__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: rule__Connector__Group__2__Impl : ( '{' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:957:1: '{'
            {
             before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Connector__Group__2__Impl1877); 
             after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Connector__Group__2__Impl"


    // $ANTLR start "rule__Connector__Group__3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:975:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__31908);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__31911);
            rule__Connector__Group__4();

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
    // $ANTLR end "rule__Connector__Group__3"


    // $ANTLR start "rule__Connector__Group__3__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__ComponentsAssignment_3 )* ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ( ( ( rule__Connector__ComponentsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ( ( rule__Connector__ComponentsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ( ( rule__Connector__ComponentsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: ( rule__Connector__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getConnectorAccess().getComponentsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( rule__Connector__ComponentsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:989:2: rule__Connector__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Connector__ComponentsAssignment_3_in_rule__Connector__Group__3__Impl1938);
            	    rule__Connector__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getConnectorAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__Connector__Group__3__Impl"


    // $ANTLR start "rule__Connector__Group__4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__Connector__Group__4__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__41969);
            rule__Connector__Group__4__Impl();

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
    // $ANTLR end "rule__Connector__Group__4"


    // $ANTLR start "rule__Connector__Group__4__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: rule__Connector__Group__4__Impl : ( '}' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Connector__Group__4__Impl1997); 
             after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Connector__Group__4__Impl"


    // $ANTLR start "rule__Model__SystemsAssignment"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: rule__Model__SystemsAssignment : ( ruleSystem ) ;
    public final void rule__Model__SystemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( ( ruleSystem ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ruleSystem )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: ( ruleSystem )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1046:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment2043);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__SystemsAssignment"


    // $ANTLR start "rule__System__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_12074); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ComponentsAssignment_3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: rule__System__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__System__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ruleComponent
            {
             before(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_32105);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__ComponentsAssignment_3"


    // $ANTLR start "rule__System__ConnectorsAssignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: rule__System__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__System__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( ( ruleConnector ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( ruleConnector )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( ruleConnector )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ruleConnector
            {
             before(grammarAccess.getSystemAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__System__ConnectorsAssignment_42136);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getConnectorsConnectorParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__System__ConnectorsAssignment_4"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12167); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__InterfacesAssignment_3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: rule__Component__InterfacesAssignment_3 : ( ruleInterface ) ;
    public final void rule__Component__InterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1119:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ruleInterface
            {
             before(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_32198);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Component__InterfacesAssignment_3"


    // $ANTLR start "rule__Component__PortsAssignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: rule__Component__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1135:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_42229);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Component__PortsAssignment_4"


    // $ANTLR start "rule__Interface__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: rule__Interface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_12260); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_1"


    // $ANTLR start "rule__Interface__TypeAssignment_2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: rule__Interface__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Interface__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1164:1: ( ( ruleType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( ruleType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: ( ruleType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1166:1: ruleType
            {
             before(grammarAccess.getInterfaceAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Interface__TypeAssignment_22291);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__TypeAssignment_2"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1179:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_12322); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_12353); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Connector__NameAssignment_1"


    // $ANTLR start "rule__Connector__ComponentsAssignment_3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1205:1: rule__Connector__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Connector__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1209:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ruleComponent
            {
             before(grammarAccess.getConnectorAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Connector__ComponentsAssignment_32384);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Connector__ComponentsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SystemsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0_in_ruleSystem155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_entryRuleRequired242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequired249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRequired276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvided_in_entryRuleProvided304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvided311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleProvided338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0_in_ruleConnector579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_rule__Type__Alternatives615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvided_in_rule__Type__Alternatives632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__0665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group__0__Impl693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1724 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2784 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__System__Group__2__Impl815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3846 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ComponentsAssignment_3_in_rule__System__Group__3__Impl876 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4907 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ConnectorsAssignment_4_in_rule__System__Group__4__Impl937 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__System__Group__5__Impl996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group__0__Impl1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11101 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21161 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group__2__Impl1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31223 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__InterfacesAssignment_3_in_rule__Component__Group__3__Impl1253 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41284 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_4_in_rule__Component__Group__4__Impl1314 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group__5__Impl1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interface__Group__0__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11478 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_1_in_rule__Interface__Group__1__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__TypeAssignment_2_in_rule__Interface__Group__2__Impl1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Port__Group__0__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__01724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__01727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Connector__Group__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__11786 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__21846 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__21849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Connector__Group__2__Impl1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__31908 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__31911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__ComponentsAssignment_3_in_rule__Connector__Group__3__Impl1938 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__41969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Connector__Group__4__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_12074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_32105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__System__ConnectorsAssignment_42136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_32198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_42229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Interface__TypeAssignment_22291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_12322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Connector__ComponentsAssignment_32384 = new BitSet(new long[]{0x0000000000000002L});

}