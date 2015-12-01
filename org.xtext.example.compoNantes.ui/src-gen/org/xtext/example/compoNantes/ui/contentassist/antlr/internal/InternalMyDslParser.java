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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'provided'", "'system'", "'{'", "'}'", "'component'", "'connector'", "'interface'", "'port'", "'depends of'", "'uses'"
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


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( ruleConnector EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector242);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector249); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__Connector__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Connector__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__Connector__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__Connector__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_rule__Connector__Group__0_in_ruleConnector275);
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


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleInterface EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface302);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface309); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__Interface__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface335);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( rulePort EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort362);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort369); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort395);
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


    // $ANTLR start "entryRuleDependancy"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleDependancy : ruleDependancy EOF ;
    public final void entryRuleDependancy() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleDependancy EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleDependancy EOF
            {
             before(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy422);
            ruleDependancy();

            state._fsp--;

             after(grammarAccess.getDependancyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy429); 

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
    // $ANTLR end "entryRuleDependancy"


    // $ANTLR start "ruleDependancy"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleDependancy : ( ( rule__Dependancy__Group__0 ) ) ;
    public final void ruleDependancy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__Dependancy__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Dependancy__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__Dependancy__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__Dependancy__Group__0 )
            {
             before(grammarAccess.getDependancyAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__Dependancy__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__Dependancy__Group__0
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0_in_ruleDependancy455);
            rule__Dependancy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependancyAccess().getGroup()); 

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
    // $ANTLR end "ruleDependancy"


    // $ANTLR start "entryRuleUsage"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleUsage : ruleUsage EOF ;
    public final void entryRuleUsage() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleUsage EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleUsage EOF
            {
             before(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage482);
            ruleUsage();

            state._fsp--;

             after(grammarAccess.getUsageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage489); 

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
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleUsage : ( ( rule__Usage__Group__0 ) ) ;
    public final void ruleUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Usage__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Usage__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Usage__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Usage__Group__0 )
            {
             before(grammarAccess.getUsageAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Usage__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Usage__Group__0
            {
            pushFollow(FOLLOW_rule__Usage__Group__0_in_ruleUsage515);
            rule__Usage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsageAccess().getGroup()); 

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
    // $ANTLR end "ruleUsage"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:290:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:291:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:292:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:292:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType552);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: rule__Type__Alternatives : ( ( ( 'required' ) ) | ( ( 'provided' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:307:1: ( ( ( 'required' ) ) | ( ( 'provided' ) ) )
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
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: ( ( 'required' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:308:1: ( ( 'required' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:309:1: ( 'required' )
                    {
                     before(grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:310:1: ( 'required' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:310:3: 'required'
                    {
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives588); 

                    }

                     after(grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:315:6: ( ( 'provided' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:315:6: ( ( 'provided' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( 'provided' )
                    {
                     before(grammarAccess.getTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ( 'provided' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:317:3: 'provided'
                    {
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives609); 

                    }

                     after(grammarAccess.getTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:333:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:334:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0642);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__1_in_rule__System__Group__0645);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ( ( 'system' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( 'system' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:346:1: ( 'system' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:347:1: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__System__Group__0__Impl673); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:360:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:364:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:365:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1704);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__2_in_rule__System__Group__1707);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:376:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ( ( rule__System__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:378:1: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ( rule__System__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:379:2: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl734);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:389:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:393:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:394:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2764);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__3_in_rule__System__Group__2767);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:406:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:407:1: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__System__Group__2__Impl795); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:420:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:425:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3826);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__4_in_rule__System__Group__3829);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:432:1: rule__System__Group__3__Impl : ( ( rule__System__ComponentsAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ( ( ( rule__System__ComponentsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( ( rule__System__ComponentsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:437:1: ( ( rule__System__ComponentsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( rule__System__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getComponentsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__System__ComponentsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:439:2: rule__System__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__System__ComponentsAssignment_3_in_rule__System__Group__3__Impl856);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:449:1: rule__System__Group__4 : rule__System__Group__4__Impl rule__System__Group__5 ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ( rule__System__Group__4__Impl rule__System__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:454:2: rule__System__Group__4__Impl rule__System__Group__5
            {
            pushFollow(FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4887);
            rule__System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__System__Group__5_in_rule__System__Group__4890);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:461:1: rule__System__Group__4__Impl : ( ( rule__System__ConnectorsAssignment_4 )* ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:465:1: ( ( ( rule__System__ConnectorsAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__System__ConnectorsAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:466:1: ( ( rule__System__ConnectorsAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:467:1: ( rule__System__ConnectorsAssignment_4 )*
            {
             before(grammarAccess.getSystemAccess().getConnectorsAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( rule__System__ConnectorsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: rule__System__ConnectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__System__ConnectorsAssignment_4_in_rule__System__Group__4__Impl917);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:478:1: rule__System__Group__5 : rule__System__Group__5__Impl ;
    public final void rule__System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: ( rule__System__Group__5__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:483:2: rule__System__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5948);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: rule__System__Group__5__Impl : ( '}' ) ;
    public final void rule__System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:493:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:494:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__System__Group__5__Impl976); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:525:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01019);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01022);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:536:1: ( ( 'component' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( 'component' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:537:1: ( 'component' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group__0__Impl1050); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:555:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:556:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11081);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11084);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:563:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__Component__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:570:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1111);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:585:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21141);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21144);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group__2__Impl1172); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:615:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:616:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31203);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31206);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: rule__Component__Group__3__Impl : ( ( rule__Component__InterfacesAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( ( ( rule__Component__InterfacesAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ( ( rule__Component__InterfacesAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ( ( rule__Component__InterfacesAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ( rule__Component__InterfacesAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getInterfacesAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( rule__Component__InterfacesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:630:2: rule__Component__InterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__InterfacesAssignment_3_in_rule__Component__Group__3__Impl1233);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:640:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:645:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41264);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41267);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: rule__Component__Group__4__Impl : ( ( rule__Component__PortsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ( ( ( rule__Component__PortsAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( ( rule__Component__PortsAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:657:1: ( ( rule__Component__PortsAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( rule__Component__PortsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( rule__Component__PortsAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:659:2: rule__Component__PortsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_4_in_rule__Component__Group__4__Impl1294);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:673:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:674:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51325);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51328);
            rule__Component__Group__6();

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: rule__Component__Group__5__Impl : ( ( rule__Component__DependanciesAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:685:1: ( ( ( rule__Component__DependanciesAssignment_5 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( ( rule__Component__DependanciesAssignment_5 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( ( rule__Component__DependanciesAssignment_5 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( rule__Component__DependanciesAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getDependanciesAssignment_5()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( rule__Component__DependanciesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:688:2: rule__Component__DependanciesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__DependanciesAssignment_5_in_rule__Component__Group__5__Impl1355);
            	    rule__Component__DependanciesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getDependanciesAssignment_5()); 

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


    // $ANTLR start "rule__Component__Group__6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:703:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61386);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61389);
            rule__Component__Group__7();

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
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: rule__Component__Group__6__Impl : ( ( rule__Component__UsagesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( ( ( rule__Component__UsagesAssignment_6 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( ( rule__Component__UsagesAssignment_6 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( ( rule__Component__UsagesAssignment_6 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( rule__Component__UsagesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getUsagesAssignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: ( rule__Component__UsagesAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:717:2: rule__Component__UsagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Component__UsagesAssignment_6_in_rule__Component__Group__6__Impl1416);
            	    rule__Component__UsagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getUsagesAssignment_6()); 

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
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__Component__Group__7__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:732:2: rule__Component__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71447);
            rule__Component__Group__7__Impl();

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
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group__7__Impl1475); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:777:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:778:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__01522);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__01525);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: rule__Connector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( ( 'connector' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( 'connector' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( 'connector' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Connector__Group__0__Impl1553); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:809:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__11584);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__11587);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__NameAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( ( ( rule__Connector__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( ( rule__Connector__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:821:1: ( ( rule__Connector__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: ( rule__Connector__NameAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:823:1: ( rule__Connector__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:823:2: rule__Connector__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl1614);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:837:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:838:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__21644);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__21647);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: rule__Connector__Group__2__Impl : ( '{' ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:851:1: '{'
            {
             before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Connector__Group__2__Impl1675); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:864:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:869:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__31706);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__31709);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:876:1: rule__Connector__Group__3__Impl : ( ( rule__Connector__ComponentsAssignment_3 )* ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( ( ( rule__Connector__ComponentsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ( rule__Connector__ComponentsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( ( rule__Connector__ComponentsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( rule__Connector__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getConnectorAccess().getComponentsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( rule__Connector__ComponentsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:883:2: rule__Connector__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Connector__ComponentsAssignment_3_in_rule__Connector__Group__3__Impl1736);
            	    rule__Connector__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( rule__Connector__Group__4__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:898:2: rule__Connector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__41767);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: rule__Connector__Group__4__Impl : ( '}' ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: '}'
            {
             before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__Connector__Group__4__Impl1795); 
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


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:938:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01836);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01839);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: ( ( 'interface' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( 'interface' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( 'interface' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Interface__Group__0__Impl1867); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:969:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11898);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11901);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__TypeAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( ( ( rule__Interface__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ( rule__Interface__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ( rule__Interface__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( rule__Interface__TypeAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: ( rule__Interface__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:983:2: rule__Interface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl1928);
            rule__Interface__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( rule__Interface__Group__2__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:998:2: rule__Interface__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21958);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1004:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( rule__Interface__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1985);
            rule__Interface__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1032:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02021);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02024);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1045:1: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Port__Group__0__Impl2052); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__Port__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12083);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1075:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2110);
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


    // $ANTLR start "rule__Dependancy__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: rule__Dependancy__Group__0 : rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 ;
    public final void rule__Dependancy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: ( rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:2: rule__Dependancy__Group__0__Impl rule__Dependancy__Group__1
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__02144);
            rule__Dependancy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__02147);
            rule__Dependancy__Group__1();

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
    // $ANTLR end "rule__Dependancy__Group__0"


    // $ANTLR start "rule__Dependancy__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:1: rule__Dependancy__Group__0__Impl : ( 'depends of' ) ;
    public final void rule__Dependancy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1106:1: ( ( 'depends of' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( 'depends of' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: ( 'depends of' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: 'depends of'
            {
             before(grammarAccess.getDependancyAccess().getDependsOfKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Dependancy__Group__0__Impl2175); 
             after(grammarAccess.getDependancyAccess().getDependsOfKeyword_0()); 

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
    // $ANTLR end "rule__Dependancy__Group__0__Impl"


    // $ANTLR start "rule__Dependancy__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: rule__Dependancy__Group__1 : rule__Dependancy__Group__1__Impl ;
    public final void rule__Dependancy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: ( rule__Dependancy__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:2: rule__Dependancy__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__12206);
            rule__Dependancy__Group__1__Impl();

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
    // $ANTLR end "rule__Dependancy__Group__1"


    // $ANTLR start "rule__Dependancy__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: rule__Dependancy__Group__1__Impl : ( ( rule__Dependancy__ComponentAssignment_1 ) ) ;
    public final void rule__Dependancy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: ( ( ( rule__Dependancy__ComponentAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( ( rule__Dependancy__ComponentAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( ( rule__Dependancy__ComponentAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( rule__Dependancy__ComponentAssignment_1 )
            {
             before(grammarAccess.getDependancyAccess().getComponentAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( rule__Dependancy__ComponentAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:2: rule__Dependancy__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependancy__ComponentAssignment_1_in_rule__Dependancy__Group__1__Impl2233);
            rule__Dependancy__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependancyAccess().getComponentAssignment_1()); 

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
    // $ANTLR end "rule__Dependancy__Group__1__Impl"


    // $ANTLR start "rule__Usage__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: rule__Usage__Group__0 : rule__Usage__Group__0__Impl rule__Usage__Group__1 ;
    public final void rule__Usage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( rule__Usage__Group__0__Impl rule__Usage__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:2: rule__Usage__Group__0__Impl rule__Usage__Group__1
            {
            pushFollow(FOLLOW_rule__Usage__Group__0__Impl_in_rule__Usage__Group__02267);
            rule__Usage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Usage__Group__1_in_rule__Usage__Group__02270);
            rule__Usage__Group__1();

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
    // $ANTLR end "rule__Usage__Group__0"


    // $ANTLR start "rule__Usage__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: rule__Usage__Group__0__Impl : ( 'uses' ) ;
    public final void rule__Usage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( ( 'uses' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( 'uses' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( 'uses' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: 'uses'
            {
             before(grammarAccess.getUsageAccess().getUsesKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Usage__Group__0__Impl2298); 
             after(grammarAccess.getUsageAccess().getUsesKeyword_0()); 

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
    // $ANTLR end "rule__Usage__Group__0__Impl"


    // $ANTLR start "rule__Usage__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__Usage__Group__1 : rule__Usage__Group__1__Impl ;
    public final void rule__Usage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( rule__Usage__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:2: rule__Usage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Usage__Group__1__Impl_in_rule__Usage__Group__12329);
            rule__Usage__Group__1__Impl();

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
    // $ANTLR end "rule__Usage__Group__1"


    // $ANTLR start "rule__Usage__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1195:1: rule__Usage__Group__1__Impl : ( ( rule__Usage__ComponentAssignment_1 ) ) ;
    public final void rule__Usage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( ( ( rule__Usage__ComponentAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( rule__Usage__ComponentAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( rule__Usage__ComponentAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( rule__Usage__ComponentAssignment_1 )
            {
             before(grammarAccess.getUsageAccess().getComponentAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: ( rule__Usage__ComponentAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:2: rule__Usage__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Usage__ComponentAssignment_1_in_rule__Usage__Group__1__Impl2356);
            rule__Usage__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsageAccess().getComponentAssignment_1()); 

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
    // $ANTLR end "rule__Usage__Group__1__Impl"


    // $ANTLR start "rule__Model__SystemsAssignment"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: rule__Model__SystemsAssignment : ( ruleSystem ) ;
    public final void rule__Model__SystemsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1221:1: ( ( ruleSystem ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( ruleSystem )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1222:1: ( ruleSystem )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: ruleSystem
            {
             before(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment2395);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1236:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:1: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__System__NameAssignment_12426); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:1: rule__System__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__System__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1253:1: ruleComponent
            {
             before(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_32457);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: rule__System__ConnectorsAssignment_4 : ( ruleConnector ) ;
    public final void rule__System__ConnectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( ( ruleConnector ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( ruleConnector )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:1: ( ruleConnector )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1268:1: ruleConnector
            {
             before(grammarAccess.getSystemAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__System__ConnectorsAssignment_42488);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1282:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12519); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: rule__Component__InterfacesAssignment_3 : ( ruleInterface ) ;
    public final void rule__Component__InterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1296:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ruleInterface
            {
             before(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_32550);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: rule__Component__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1313:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_42581);
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


    // $ANTLR start "rule__Component__DependanciesAssignment_5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: rule__Component__DependanciesAssignment_5 : ( ruleDependancy ) ;
    public final void rule__Component__DependanciesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( ( ruleDependancy ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ruleDependancy )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1327:1: ( ruleDependancy )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1328:1: ruleDependancy
            {
             before(grammarAccess.getComponentAccess().getDependanciesDependancyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDependancy_in_rule__Component__DependanciesAssignment_52612);
            ruleDependancy();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getDependanciesDependancyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Component__DependanciesAssignment_5"


    // $ANTLR start "rule__Component__UsagesAssignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: rule__Component__UsagesAssignment_6 : ( ruleUsage ) ;
    public final void rule__Component__UsagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ( ruleUsage ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( ruleUsage )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( ruleUsage )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ruleUsage
            {
             before(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleUsage_in_rule__Component__UsagesAssignment_62643);
            ruleUsage();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Component__UsagesAssignment_6"


    // $ANTLR start "rule__Connector__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: rule__Connector__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1356:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_12674); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: rule__Connector__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Connector__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: ruleComponent
            {
             before(grammarAccess.getConnectorAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Connector__ComponentsAssignment_32705);
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


    // $ANTLR start "rule__Interface__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: rule__Interface__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Interface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: ( ( ruleType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( ruleType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1387:1: ( ruleType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1388:1: ruleType
            {
             before(grammarAccess.getInterfaceAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Interface__TypeAssignment_12736);
            ruleType();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getTypeTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interface__TypeAssignment_1"


    // $ANTLR start "rule__Interface__NameAssignment_2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1397:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_22767); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Interface__NameAssignment_2"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_12798); 
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


    // $ANTLR start "rule__Dependancy__ComponentAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: rule__Dependancy__ComponentAssignment_1 : ( ruleComponent ) ;
    public final void rule__Dependancy__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: ruleComponent
            {
             before(grammarAccess.getDependancyAccess().getComponentComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Dependancy__ComponentAssignment_12829);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getDependancyAccess().getComponentComponentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Dependancy__ComponentAssignment_1"


    // $ANTLR start "rule__Usage__ComponentAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: rule__Usage__ComponentAssignment_1 : ( ruleComponent ) ;
    public final void rule__Usage__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: ruleComponent
            {
             before(grammarAccess.getUsageAccess().getComponentComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Usage__ComponentAssignment_12860);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getUsageAccess().getComponentComponentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Usage__ComponentAssignment_1"

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
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0_in_ruleConnector275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0_in_ruleDependancy455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__0_in_ruleUsage515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__0__Impl_in_rule__System__Group__0642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__System__Group__1_in_rule__System__Group__0645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__System__Group__0__Impl673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__1__Impl_in_rule__System__Group__1704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__System__Group__2_in_rule__System__Group__1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__NameAssignment_1_in_rule__System__Group__1__Impl734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__2__Impl_in_rule__System__Group__2764 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__System__Group__3_in_rule__System__Group__2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__System__Group__2__Impl795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__Group__3__Impl_in_rule__System__Group__3826 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__System__Group__4_in_rule__System__Group__3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ComponentsAssignment_3_in_rule__System__Group__3__Impl856 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__System__Group__4__Impl_in_rule__System__Group__4887 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__System__Group__5_in_rule__System__Group__4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__System__ConnectorsAssignment_4_in_rule__System__Group__4__Impl917 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__System__Group__5__Impl_in_rule__System__Group__5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__System__Group__5__Impl976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group__0__Impl1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21141 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group__2__Impl1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31203 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__InterfacesAssignment_3_in_rule__Component__Group__3__Impl1233 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41264 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_4_in_rule__Component__Group__4__Impl1294 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51325 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__DependanciesAssignment_5_in_rule__Component__Group__5__Impl1355 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61386 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__UsagesAssignment_6_in_rule__Component__Group__6__Impl1416 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group__7__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__01522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__01525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Connector__Group__0__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__11584 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__11587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_1_in_rule__Connector__Group__1__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__21644 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__21647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Connector__Group__2__Impl1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__31706 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__31709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__ComponentsAssignment_3_in_rule__Connector__Group__3__Impl1736 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__41767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Connector__Group__4__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01836 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Interface__Group__0__Impl1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Port__Group__0__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__0__Impl_in_rule__Dependancy__Group__02144 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1_in_rule__Dependancy__Group__02147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Dependancy__Group__0__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__Group__1__Impl_in_rule__Dependancy__Group__12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependancy__ComponentAssignment_1_in_rule__Dependancy__Group__1__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__0__Impl_in_rule__Usage__Group__02267 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Usage__Group__1_in_rule__Usage__Group__02270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Usage__Group__0__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__1__Impl_in_rule__Usage__Group__12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__ComponentAssignment_1_in_rule__Usage__Group__1__Impl2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_rule__Model__SystemsAssignment2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__System__NameAssignment_12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__System__ComponentsAssignment_32457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__System__ConnectorsAssignment_42488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_32550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_42581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_rule__Component__DependanciesAssignment_52612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_rule__Component__UsagesAssignment_62643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_12674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Connector__ComponentsAssignment_32705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Interface__TypeAssignment_12736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_22767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_12798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Dependancy__ComponentAssignment_12829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Usage__ComponentAssignment_12860 = new BitSet(new long[]{0x0000000000000002L});

}