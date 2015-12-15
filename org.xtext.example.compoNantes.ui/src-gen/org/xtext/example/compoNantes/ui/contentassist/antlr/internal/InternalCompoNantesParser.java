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
import org.xtext.example.compoNantes.services.CompoNantesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompoNantesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'provided'", "'assembly'", "'delegation'", "'subsystem'", "'{'", "'}'", "'component'", "'connector'", "':'", "'to'", "'interface'", "'port'", "'dependency'", "'usage'", "'.'"
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


        public InternalCompoNantesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCompoNantesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCompoNantesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g"; }


     
     	private CompoNantesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CompoNantesGrammarAccess grammarAccess) {
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:62:1: ruleModel EOF
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:69:1: ruleModel : ( ( rule__Model__SubsystemAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:73:2: ( ( ( rule__Model__SubsystemAssignment )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:74:1: ( ( rule__Model__SubsystemAssignment )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:74:1: ( ( rule__Model__SubsystemAssignment )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:75:1: ( rule__Model__SubsystemAssignment )*
            {
             before(grammarAccess.getModelAccess().getSubsystemAssignment()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:76:1: ( rule__Model__SubsystemAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:76:2: rule__Model__SubsystemAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__SubsystemAssignment_in_ruleModel94);
            	    rule__Model__SubsystemAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSubsystemAssignment()); 

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


    // $ANTLR start "entryRuleSubSystem"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:88:1: entryRuleSubSystem : ruleSubSystem EOF ;
    public final void entryRuleSubSystem() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:89:1: ( ruleSubSystem EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:90:1: ruleSubSystem EOF
            {
             before(grammarAccess.getSubSystemRule()); 
            pushFollow(FOLLOW_ruleSubSystem_in_entryRuleSubSystem122);
            ruleSubSystem();

            state._fsp--;

             after(grammarAccess.getSubSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSystem129); 

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
    // $ANTLR end "entryRuleSubSystem"


    // $ANTLR start "ruleSubSystem"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:97:1: ruleSubSystem : ( ( rule__SubSystem__Group__0 ) ) ;
    public final void ruleSubSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:101:2: ( ( ( rule__SubSystem__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:102:1: ( ( rule__SubSystem__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:102:1: ( ( rule__SubSystem__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:103:1: ( rule__SubSystem__Group__0 )
            {
             before(grammarAccess.getSubSystemAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:104:1: ( rule__SubSystem__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:104:2: rule__SubSystem__Group__0
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__0_in_ruleSubSystem155);
            rule__SubSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSubSystem"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:116:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:117:1: ( ruleComponent EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:118:1: ruleComponent EOF
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:125:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:129:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:130:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:130:1: ( ( rule__Component__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:131:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:132:1: ( rule__Component__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:132:2: rule__Component__Group__0
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:144:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:145:1: ( ruleConnector EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:146:1: ruleConnector EOF
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:153:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:157:2: ( ( ( rule__Connector__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:158:1: ( ( rule__Connector__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:158:1: ( ( rule__Connector__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:159:1: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:160:1: ( rule__Connector__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:160:2: rule__Connector__Group__0
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:172:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:173:1: ( ruleInterface EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:174:1: ruleInterface EOF
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:181:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:185:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:186:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:186:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:187:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:188:1: ( rule__Interface__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:188:2: rule__Interface__Group__0
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:200:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:201:1: ( rulePort EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:202:1: rulePort EOF
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:209:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:213:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:214:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:214:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:215:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:216:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:216:2: rule__Port__Group__0
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


    // $ANTLR start "entryRuleDependency"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:228:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:229:1: ( ruleDependency EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:230:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency422);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency429); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:237:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:241:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:242:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:242:1: ( ( rule__Dependency__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:243:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:244:1: ( rule__Dependency__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:244:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency455);
            rule__Dependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleUsage"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:256:1: entryRuleUsage : ruleUsage EOF ;
    public final void entryRuleUsage() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:257:1: ( ruleUsage EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:258:1: ruleUsage EOF
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:265:1: ruleUsage : ( ( rule__Usage__Group__0 ) ) ;
    public final void ruleUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:269:2: ( ( ( rule__Usage__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:270:1: ( ( rule__Usage__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:270:1: ( ( rule__Usage__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:271:1: ( rule__Usage__Group__0 )
            {
             before(grammarAccess.getUsageAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:272:1: ( rule__Usage__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:272:2: rule__Usage__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:286:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:287:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:288:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName544);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName551); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:295:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:299:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:300:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:300:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:301:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:302:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:302:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName577);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleInterfaceType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:315:1: ruleInterfaceType : ( ( rule__InterfaceType__Alternatives ) ) ;
    public final void ruleInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:319:1: ( ( ( rule__InterfaceType__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:320:1: ( ( rule__InterfaceType__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:320:1: ( ( rule__InterfaceType__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:321:1: ( rule__InterfaceType__Alternatives )
            {
             before(grammarAccess.getInterfaceTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:322:1: ( rule__InterfaceType__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:322:2: rule__InterfaceType__Alternatives
            {
            pushFollow(FOLLOW_rule__InterfaceType__Alternatives_in_ruleInterfaceType614);
            rule__InterfaceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "ruleConnectorType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:334:1: ruleConnectorType : ( ( rule__ConnectorType__Alternatives ) ) ;
    public final void ruleConnectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:338:1: ( ( ( rule__ConnectorType__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:339:1: ( ( rule__ConnectorType__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:339:1: ( ( rule__ConnectorType__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:340:1: ( rule__ConnectorType__Alternatives )
            {
             before(grammarAccess.getConnectorTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:341:1: ( rule__ConnectorType__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:341:2: rule__ConnectorType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConnectorType__Alternatives_in_ruleConnectorType650);
            rule__ConnectorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectorTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleConnectorType"


    // $ANTLR start "rule__Model__SubsystemAlternatives_0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:352:1: rule__Model__SubsystemAlternatives_0 : ( ( ruleSubSystem ) | ( ruleComponent ) );
    public final void rule__Model__SubsystemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:356:1: ( ( ruleSubSystem ) | ( ruleComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:357:1: ( ruleSubSystem )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:357:1: ( ruleSubSystem )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:358:1: ruleSubSystem
                    {
                     before(grammarAccess.getModelAccess().getSubsystemSubSystemParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSubSystem_in_rule__Model__SubsystemAlternatives_0685);
                    ruleSubSystem();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getSubsystemSubSystemParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:363:6: ( ruleComponent )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:363:6: ( ruleComponent )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:364:1: ruleComponent
                    {
                     before(grammarAccess.getModelAccess().getSubsystemComponentParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__Model__SubsystemAlternatives_0702);
                    ruleComponent();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getSubsystemComponentParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Model__SubsystemAlternatives_0"


    // $ANTLR start "rule__InterfaceType__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:375:1: rule__InterfaceType__Alternatives : ( ( ( 'required' ) ) | ( ( 'provided' ) ) );
    public final void rule__InterfaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:379:1: ( ( ( 'required' ) ) | ( ( 'provided' ) ) )
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
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:380:1: ( ( 'required' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:380:1: ( ( 'required' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:381:1: ( 'required' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:382:1: ( 'required' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:382:3: 'required'
                    {
                    match(input,11,FOLLOW_11_in_rule__InterfaceType__Alternatives736); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:387:6: ( ( 'provided' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:387:6: ( ( 'provided' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:388:1: ( 'provided' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:389:1: ( 'provided' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:389:3: 'provided'
                    {
                    match(input,12,FOLLOW_12_in_rule__InterfaceType__Alternatives757); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__InterfaceType__Alternatives"


    // $ANTLR start "rule__ConnectorType__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:399:1: rule__ConnectorType__Alternatives : ( ( ( 'assembly' ) ) | ( ( 'delegation' ) ) );
    public final void rule__ConnectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:403:1: ( ( ( 'assembly' ) ) | ( ( 'delegation' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:404:1: ( ( 'assembly' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:404:1: ( ( 'assembly' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:405:1: ( 'assembly' )
                    {
                     before(grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:406:1: ( 'assembly' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:406:3: 'assembly'
                    {
                    match(input,13,FOLLOW_13_in_rule__ConnectorType__Alternatives793); 

                    }

                     after(grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:411:6: ( ( 'delegation' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:411:6: ( ( 'delegation' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:412:1: ( 'delegation' )
                    {
                     before(grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:413:1: ( 'delegation' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:413:3: 'delegation'
                    {
                    match(input,14,FOLLOW_14_in_rule__ConnectorType__Alternatives814); 

                    }

                     after(grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ConnectorType__Alternatives"


    // $ANTLR start "rule__SubSystem__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:425:1: rule__SubSystem__Group__0 : rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1 ;
    public final void rule__SubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:429:1: ( rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:430:2: rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__0__Impl_in_rule__SubSystem__Group__0847);
            rule__SubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__1_in_rule__SubSystem__Group__0850);
            rule__SubSystem__Group__1();

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
    // $ANTLR end "rule__SubSystem__Group__0"


    // $ANTLR start "rule__SubSystem__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:437:1: rule__SubSystem__Group__0__Impl : ( 'subsystem' ) ;
    public final void rule__SubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:441:1: ( ( 'subsystem' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:442:1: ( 'subsystem' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:442:1: ( 'subsystem' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:443:1: 'subsystem'
            {
             before(grammarAccess.getSubSystemAccess().getSubsystemKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SubSystem__Group__0__Impl878); 
             after(grammarAccess.getSubSystemAccess().getSubsystemKeyword_0()); 

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
    // $ANTLR end "rule__SubSystem__Group__0__Impl"


    // $ANTLR start "rule__SubSystem__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:456:1: rule__SubSystem__Group__1 : rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2 ;
    public final void rule__SubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:460:1: ( rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:461:2: rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__1__Impl_in_rule__SubSystem__Group__1909);
            rule__SubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__2_in_rule__SubSystem__Group__1912);
            rule__SubSystem__Group__2();

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
    // $ANTLR end "rule__SubSystem__Group__1"


    // $ANTLR start "rule__SubSystem__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:468:1: rule__SubSystem__Group__1__Impl : ( ( rule__SubSystem__NameAssignment_1 ) ) ;
    public final void rule__SubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:472:1: ( ( ( rule__SubSystem__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:473:1: ( ( rule__SubSystem__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:473:1: ( ( rule__SubSystem__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:474:1: ( rule__SubSystem__NameAssignment_1 )
            {
             before(grammarAccess.getSubSystemAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:475:1: ( rule__SubSystem__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:475:2: rule__SubSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSystem__NameAssignment_1_in_rule__SubSystem__Group__1__Impl939);
            rule__SubSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SubSystem__Group__1__Impl"


    // $ANTLR start "rule__SubSystem__Group__2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:485:1: rule__SubSystem__Group__2 : rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3 ;
    public final void rule__SubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:489:1: ( rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:490:2: rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__2__Impl_in_rule__SubSystem__Group__2969);
            rule__SubSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__3_in_rule__SubSystem__Group__2972);
            rule__SubSystem__Group__3();

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
    // $ANTLR end "rule__SubSystem__Group__2"


    // $ANTLR start "rule__SubSystem__Group__2__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:497:1: rule__SubSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:501:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:502:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:502:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:503:1: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__SubSystem__Group__2__Impl1000); 
             after(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SubSystem__Group__2__Impl"


    // $ANTLR start "rule__SubSystem__Group__3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:516:1: rule__SubSystem__Group__3 : rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4 ;
    public final void rule__SubSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:520:1: ( rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:521:2: rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__3__Impl_in_rule__SubSystem__Group__31031);
            rule__SubSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__4_in_rule__SubSystem__Group__31034);
            rule__SubSystem__Group__4();

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
    // $ANTLR end "rule__SubSystem__Group__3"


    // $ANTLR start "rule__SubSystem__Group__3__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:528:1: rule__SubSystem__Group__3__Impl : ( ( rule__SubSystem__PortsAssignment_3 )* ) ;
    public final void rule__SubSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:532:1: ( ( ( rule__SubSystem__PortsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:533:1: ( ( rule__SubSystem__PortsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:533:1: ( ( rule__SubSystem__PortsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:534:1: ( rule__SubSystem__PortsAssignment_3 )*
            {
             before(grammarAccess.getSubSystemAccess().getPortsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:535:1: ( rule__SubSystem__PortsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:535:2: rule__SubSystem__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__PortsAssignment_3_in_rule__SubSystem__Group__3__Impl1061);
            	    rule__SubSystem__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getPortsAssignment_3()); 

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
    // $ANTLR end "rule__SubSystem__Group__3__Impl"


    // $ANTLR start "rule__SubSystem__Group__4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:545:1: rule__SubSystem__Group__4 : rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5 ;
    public final void rule__SubSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:549:1: ( rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:550:2: rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__4__Impl_in_rule__SubSystem__Group__41092);
            rule__SubSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__5_in_rule__SubSystem__Group__41095);
            rule__SubSystem__Group__5();

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
    // $ANTLR end "rule__SubSystem__Group__4"


    // $ANTLR start "rule__SubSystem__Group__4__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:557:1: rule__SubSystem__Group__4__Impl : ( ( rule__SubSystem__InterfacesAssignment_4 )* ) ;
    public final void rule__SubSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:561:1: ( ( ( rule__SubSystem__InterfacesAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:562:1: ( ( rule__SubSystem__InterfacesAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:562:1: ( ( rule__SubSystem__InterfacesAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:563:1: ( rule__SubSystem__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getSubSystemAccess().getInterfacesAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:564:1: ( rule__SubSystem__InterfacesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:564:2: rule__SubSystem__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__InterfacesAssignment_4_in_rule__SubSystem__Group__4__Impl1122);
            	    rule__SubSystem__InterfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getInterfacesAssignment_4()); 

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
    // $ANTLR end "rule__SubSystem__Group__4__Impl"


    // $ANTLR start "rule__SubSystem__Group__5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:574:1: rule__SubSystem__Group__5 : rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6 ;
    public final void rule__SubSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:578:1: ( rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:579:2: rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__5__Impl_in_rule__SubSystem__Group__51153);
            rule__SubSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__6_in_rule__SubSystem__Group__51156);
            rule__SubSystem__Group__6();

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
    // $ANTLR end "rule__SubSystem__Group__5"


    // $ANTLR start "rule__SubSystem__Group__5__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:586:1: rule__SubSystem__Group__5__Impl : ( ( rule__SubSystem__ComponentsAssignment_5 )* ) ;
    public final void rule__SubSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:590:1: ( ( ( rule__SubSystem__ComponentsAssignment_5 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:591:1: ( ( rule__SubSystem__ComponentsAssignment_5 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:591:1: ( ( rule__SubSystem__ComponentsAssignment_5 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:592:1: ( rule__SubSystem__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getSubSystemAccess().getComponentsAssignment_5()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:593:1: ( rule__SubSystem__ComponentsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:593:2: rule__SubSystem__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__ComponentsAssignment_5_in_rule__SubSystem__Group__5__Impl1183);
            	    rule__SubSystem__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getComponentsAssignment_5()); 

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
    // $ANTLR end "rule__SubSystem__Group__5__Impl"


    // $ANTLR start "rule__SubSystem__Group__6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:603:1: rule__SubSystem__Group__6 : rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7 ;
    public final void rule__SubSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:607:1: ( rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:608:2: rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__6__Impl_in_rule__SubSystem__Group__61214);
            rule__SubSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__7_in_rule__SubSystem__Group__61217);
            rule__SubSystem__Group__7();

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
    // $ANTLR end "rule__SubSystem__Group__6"


    // $ANTLR start "rule__SubSystem__Group__6__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:615:1: rule__SubSystem__Group__6__Impl : ( ( rule__SubSystem__DependenciesAssignment_6 )* ) ;
    public final void rule__SubSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:619:1: ( ( ( rule__SubSystem__DependenciesAssignment_6 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:620:1: ( ( rule__SubSystem__DependenciesAssignment_6 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:620:1: ( ( rule__SubSystem__DependenciesAssignment_6 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:621:1: ( rule__SubSystem__DependenciesAssignment_6 )*
            {
             before(grammarAccess.getSubSystemAccess().getDependenciesAssignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:622:1: ( rule__SubSystem__DependenciesAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:622:2: rule__SubSystem__DependenciesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__DependenciesAssignment_6_in_rule__SubSystem__Group__6__Impl1244);
            	    rule__SubSystem__DependenciesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getDependenciesAssignment_6()); 

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
    // $ANTLR end "rule__SubSystem__Group__6__Impl"


    // $ANTLR start "rule__SubSystem__Group__7"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:632:1: rule__SubSystem__Group__7 : rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8 ;
    public final void rule__SubSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:636:1: ( rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:637:2: rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__7__Impl_in_rule__SubSystem__Group__71275);
            rule__SubSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__8_in_rule__SubSystem__Group__71278);
            rule__SubSystem__Group__8();

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
    // $ANTLR end "rule__SubSystem__Group__7"


    // $ANTLR start "rule__SubSystem__Group__7__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:644:1: rule__SubSystem__Group__7__Impl : ( ( rule__SubSystem__UsagesAssignment_7 )* ) ;
    public final void rule__SubSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:648:1: ( ( ( rule__SubSystem__UsagesAssignment_7 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:649:1: ( ( rule__SubSystem__UsagesAssignment_7 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:649:1: ( ( rule__SubSystem__UsagesAssignment_7 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:650:1: ( rule__SubSystem__UsagesAssignment_7 )*
            {
             before(grammarAccess.getSubSystemAccess().getUsagesAssignment_7()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:651:1: ( rule__SubSystem__UsagesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:651:2: rule__SubSystem__UsagesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__UsagesAssignment_7_in_rule__SubSystem__Group__7__Impl1305);
            	    rule__SubSystem__UsagesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getUsagesAssignment_7()); 

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
    // $ANTLR end "rule__SubSystem__Group__7__Impl"


    // $ANTLR start "rule__SubSystem__Group__8"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:661:1: rule__SubSystem__Group__8 : rule__SubSystem__Group__8__Impl rule__SubSystem__Group__9 ;
    public final void rule__SubSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:665:1: ( rule__SubSystem__Group__8__Impl rule__SubSystem__Group__9 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:666:2: rule__SubSystem__Group__8__Impl rule__SubSystem__Group__9
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__8__Impl_in_rule__SubSystem__Group__81336);
            rule__SubSystem__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__9_in_rule__SubSystem__Group__81339);
            rule__SubSystem__Group__9();

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
    // $ANTLR end "rule__SubSystem__Group__8"


    // $ANTLR start "rule__SubSystem__Group__8__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:673:1: rule__SubSystem__Group__8__Impl : ( ( rule__SubSystem__ConnectorsAssignment_8 )* ) ;
    public final void rule__SubSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:677:1: ( ( ( rule__SubSystem__ConnectorsAssignment_8 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:678:1: ( ( rule__SubSystem__ConnectorsAssignment_8 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:678:1: ( ( rule__SubSystem__ConnectorsAssignment_8 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:679:1: ( rule__SubSystem__ConnectorsAssignment_8 )*
            {
             before(grammarAccess.getSubSystemAccess().getConnectorsAssignment_8()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:680:1: ( rule__SubSystem__ConnectorsAssignment_8 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:680:2: rule__SubSystem__ConnectorsAssignment_8
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__ConnectorsAssignment_8_in_rule__SubSystem__Group__8__Impl1366);
            	    rule__SubSystem__ConnectorsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getConnectorsAssignment_8()); 

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
    // $ANTLR end "rule__SubSystem__Group__8__Impl"


    // $ANTLR start "rule__SubSystem__Group__9"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:690:1: rule__SubSystem__Group__9 : rule__SubSystem__Group__9__Impl ;
    public final void rule__SubSystem__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:694:1: ( rule__SubSystem__Group__9__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:695:2: rule__SubSystem__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__9__Impl_in_rule__SubSystem__Group__91397);
            rule__SubSystem__Group__9__Impl();

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
    // $ANTLR end "rule__SubSystem__Group__9"


    // $ANTLR start "rule__SubSystem__Group__9__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:701:1: rule__SubSystem__Group__9__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:705:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:706:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:706:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:707:1: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_17_in_rule__SubSystem__Group__9__Impl1425); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__SubSystem__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:740:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:744:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:745:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01476);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01479);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:752:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:756:1: ( ( 'component' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:757:1: ( 'component' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:757:1: ( 'component' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:758:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group__0__Impl1507); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:771:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:775:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:776:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11538);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11541);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:783:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:787:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:788:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:788:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:789:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:790:1: ( rule__Component__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:790:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1568);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:800:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:804:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:805:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21598);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21601);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:812:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:816:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:817:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:817:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:818:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group__2__Impl1629); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:831:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:835:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:836:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31660);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31663);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:843:1: rule__Component__Group__3__Impl : ( ( rule__Component__PortsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:847:1: ( ( ( rule__Component__PortsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:848:1: ( ( rule__Component__PortsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:848:1: ( ( rule__Component__PortsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:849:1: ( rule__Component__PortsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:850:1: ( rule__Component__PortsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:850:2: rule__Component__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_3_in_rule__Component__Group__3__Impl1690);
            	    rule__Component__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getPortsAssignment_3()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:860:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:864:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:865:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41721);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41724);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:872:1: rule__Component__Group__4__Impl : ( ( rule__Component__InterfacesAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:876:1: ( ( ( rule__Component__InterfacesAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:877:1: ( ( rule__Component__InterfacesAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:877:1: ( ( rule__Component__InterfacesAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:878:1: ( rule__Component__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getInterfacesAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:879:1: ( rule__Component__InterfacesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:879:2: rule__Component__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Component__InterfacesAssignment_4_in_rule__Component__Group__4__Impl1751);
            	    rule__Component__InterfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getInterfacesAssignment_4()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:889:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:893:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:894:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51782);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51785);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:901:1: rule__Component__Group__5__Impl : ( ( rule__Component__DependenciesAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:905:1: ( ( ( rule__Component__DependenciesAssignment_5 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:906:1: ( ( rule__Component__DependenciesAssignment_5 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:906:1: ( ( rule__Component__DependenciesAssignment_5 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:907:1: ( rule__Component__DependenciesAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getDependenciesAssignment_5()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:908:1: ( rule__Component__DependenciesAssignment_5 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:908:2: rule__Component__DependenciesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__DependenciesAssignment_5_in_rule__Component__Group__5__Impl1812);
            	    rule__Component__DependenciesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getDependenciesAssignment_5()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:918:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:922:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:923:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61843);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61846);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:930:1: rule__Component__Group__6__Impl : ( ( rule__Component__UsagesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:934:1: ( ( ( rule__Component__UsagesAssignment_6 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:935:1: ( ( rule__Component__UsagesAssignment_6 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:935:1: ( ( rule__Component__UsagesAssignment_6 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:936:1: ( rule__Component__UsagesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getUsagesAssignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:937:1: ( rule__Component__UsagesAssignment_6 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:937:2: rule__Component__UsagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Component__UsagesAssignment_6_in_rule__Component__Group__6__Impl1873);
            	    rule__Component__UsagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:947:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:951:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:952:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71904);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__8_in_rule__Component__Group__71907);
            rule__Component__Group__8();

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:959:1: rule__Component__Group__7__Impl : ( ( rule__Component__ConnectorsAssignment_7 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:963:1: ( ( ( rule__Component__ConnectorsAssignment_7 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:964:1: ( ( rule__Component__ConnectorsAssignment_7 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:964:1: ( ( rule__Component__ConnectorsAssignment_7 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:965:1: ( rule__Component__ConnectorsAssignment_7 )*
            {
             before(grammarAccess.getComponentAccess().getConnectorsAssignment_7()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:966:1: ( rule__Component__ConnectorsAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:966:2: rule__Component__ConnectorsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Component__ConnectorsAssignment_7_in_rule__Component__Group__7__Impl1934);
            	    rule__Component__ConnectorsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getConnectorsAssignment_7()); 

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


    // $ANTLR start "rule__Component__Group__8"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:976:1: rule__Component__Group__8 : rule__Component__Group__8__Impl ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:980:1: ( rule__Component__Group__8__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:981:2: rule__Component__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__8__Impl_in_rule__Component__Group__81965);
            rule__Component__Group__8__Impl();

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
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:987:1: rule__Component__Group__8__Impl : ( '}' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:991:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:992:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:992:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:993:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_17_in_rule__Component__Group__8__Impl1993); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Connector__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1024:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1028:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1029:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__02042);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__02045);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1036:1: rule__Connector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1040:1: ( ( 'connector' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1041:1: ( 'connector' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1041:1: ( 'connector' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1042:1: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Connector__Group__0__Impl2073); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1055:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1059:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1060:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__12104);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__12107);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1067:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__TypeAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1071:1: ( ( ( rule__Connector__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1072:1: ( ( rule__Connector__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1072:1: ( ( rule__Connector__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1073:1: ( rule__Connector__TypeAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1074:1: ( rule__Connector__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1074:2: rule__Connector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__TypeAssignment_1_in_rule__Connector__Group__1__Impl2134);
            rule__Connector__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getTypeAssignment_1()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1084:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1088:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1089:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__22164);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__22167);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1096:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__NameAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1100:1: ( ( ( rule__Connector__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1101:1: ( ( rule__Connector__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1101:1: ( ( rule__Connector__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1102:1: ( rule__Connector__NameAssignment_2 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1103:1: ( rule__Connector__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1103:2: rule__Connector__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_2_in_rule__Connector__Group__2__Impl2194);
            rule__Connector__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getNameAssignment_2()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1113:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1117:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1118:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__32224);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__32227);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1125:1: rule__Connector__Group__3__Impl : ( ':' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1129:1: ( ( ':' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1130:1: ( ':' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1130:1: ( ':' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1131:1: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Connector__Group__3__Impl2255); 
             after(grammarAccess.getConnectorAccess().getColonKeyword_3()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1144:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1148:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1149:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__42286);
            rule__Connector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__5_in_rule__Connector__Group__42289);
            rule__Connector__Group__5();

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1156:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__Int1Assignment_4 ) ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1160:1: ( ( ( rule__Connector__Int1Assignment_4 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1161:1: ( ( rule__Connector__Int1Assignment_4 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1161:1: ( ( rule__Connector__Int1Assignment_4 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1162:1: ( rule__Connector__Int1Assignment_4 )
            {
             before(grammarAccess.getConnectorAccess().getInt1Assignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1163:1: ( rule__Connector__Int1Assignment_4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1163:2: rule__Connector__Int1Assignment_4
            {
            pushFollow(FOLLOW_rule__Connector__Int1Assignment_4_in_rule__Connector__Group__4__Impl2316);
            rule__Connector__Int1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getInt1Assignment_4()); 

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


    // $ANTLR start "rule__Connector__Group__5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1173:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1177:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1178:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_rule__Connector__Group__5__Impl_in_rule__Connector__Group__52346);
            rule__Connector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__6_in_rule__Connector__Group__52349);
            rule__Connector__Group__6();

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
    // $ANTLR end "rule__Connector__Group__5"


    // $ANTLR start "rule__Connector__Group__5__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1185:1: rule__Connector__Group__5__Impl : ( 'to' ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1189:1: ( ( 'to' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1190:1: ( 'to' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1190:1: ( 'to' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1191:1: 'to'
            {
             before(grammarAccess.getConnectorAccess().getToKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Connector__Group__5__Impl2377); 
             after(grammarAccess.getConnectorAccess().getToKeyword_5()); 

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
    // $ANTLR end "rule__Connector__Group__5__Impl"


    // $ANTLR start "rule__Connector__Group__6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1204:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1208:1: ( rule__Connector__Group__6__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1209:2: rule__Connector__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__6__Impl_in_rule__Connector__Group__62408);
            rule__Connector__Group__6__Impl();

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
    // $ANTLR end "rule__Connector__Group__6"


    // $ANTLR start "rule__Connector__Group__6__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1215:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__Int2Assignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1219:1: ( ( ( rule__Connector__Int2Assignment_6 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1220:1: ( ( rule__Connector__Int2Assignment_6 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1220:1: ( ( rule__Connector__Int2Assignment_6 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1221:1: ( rule__Connector__Int2Assignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getInt2Assignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1222:1: ( rule__Connector__Int2Assignment_6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1222:2: rule__Connector__Int2Assignment_6
            {
            pushFollow(FOLLOW_rule__Connector__Int2Assignment_6_in_rule__Connector__Group__6__Impl2435);
            rule__Connector__Int2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getConnectorAccess().getInt2Assignment_6()); 

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
    // $ANTLR end "rule__Connector__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1246:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1250:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1251:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02479);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02482);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1258:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1262:1: ( ( 'interface' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1263:1: ( 'interface' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1263:1: ( 'interface' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1264:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Interface__Group__0__Impl2510); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1277:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1281:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1282:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12541);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12544);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1289:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__TypeAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1293:1: ( ( ( rule__Interface__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1294:1: ( ( rule__Interface__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1294:1: ( ( rule__Interface__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1295:1: ( rule__Interface__TypeAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1296:1: ( rule__Interface__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1296:2: rule__Interface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl2571);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1306:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1310:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1311:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__22601);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__22604);
            rule__Interface__Group__3();

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1318:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1322:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1323:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1323:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1324:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1325:1: ( rule__Interface__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1325:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl2631);
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


    // $ANTLR start "rule__Interface__Group__3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1335:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1339:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1340:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__32661);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__32664);
            rule__Interface__Group__4();

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
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1347:1: rule__Interface__Group__3__Impl : ( 'port' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1351:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1352:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1352:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1353:1: 'port'
            {
             before(grammarAccess.getInterfaceAccess().getPortKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Interface__Group__3__Impl2692); 
             after(grammarAccess.getInterfaceAccess().getPortKeyword_3()); 

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
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1366:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1370:1: ( rule__Interface__Group__4__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1371:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__42723);
            rule__Interface__Group__4__Impl();

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
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1377:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__PortAssignment_4 ) ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1381:1: ( ( ( rule__Interface__PortAssignment_4 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1382:1: ( ( rule__Interface__PortAssignment_4 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1382:1: ( ( rule__Interface__PortAssignment_4 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1383:1: ( rule__Interface__PortAssignment_4 )
            {
             before(grammarAccess.getInterfaceAccess().getPortAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1384:1: ( rule__Interface__PortAssignment_4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1384:2: rule__Interface__PortAssignment_4
            {
            pushFollow(FOLLOW_rule__Interface__PortAssignment_4_in_rule__Interface__Group__4__Impl2750);
            rule__Interface__PortAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getPortAssignment_4()); 

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
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1404:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1408:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1409:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02790);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02793);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1416:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1420:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1421:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1421:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1422:1: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Port__Group__0__Impl2821); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1435:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1439:1: ( rule__Port__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1440:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12852);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1446:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1450:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1451:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1451:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1452:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1453:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1453:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2879);
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


    // $ANTLR start "rule__Dependency__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1467:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1471:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1472:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02913);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02916);
            rule__Dependency__Group__1();

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
    // $ANTLR end "rule__Dependency__Group__0"


    // $ANTLR start "rule__Dependency__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1479:1: rule__Dependency__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1483:1: ( ( 'dependency' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1484:1: ( 'dependency' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1484:1: ( 'dependency' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1485:1: 'dependency'
            {
             before(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Dependency__Group__0__Impl2944); 
             after(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); 

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
    // $ANTLR end "rule__Dependency__Group__0__Impl"


    // $ANTLR start "rule__Dependency__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1498:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1502:1: ( rule__Dependency__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1503:2: rule__Dependency__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12975);
            rule__Dependency__Group__1__Impl();

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
    // $ANTLR end "rule__Dependency__Group__1"


    // $ANTLR start "rule__Dependency__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1509:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__ComponentAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1513:1: ( ( ( rule__Dependency__ComponentAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1514:1: ( ( rule__Dependency__ComponentAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1514:1: ( ( rule__Dependency__ComponentAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1515:1: ( rule__Dependency__ComponentAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getComponentAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1516:1: ( rule__Dependency__ComponentAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1516:2: rule__Dependency__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependency__ComponentAssignment_1_in_rule__Dependency__Group__1__Impl3002);
            rule__Dependency__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getComponentAssignment_1()); 

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
    // $ANTLR end "rule__Dependency__Group__1__Impl"


    // $ANTLR start "rule__Usage__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1530:1: rule__Usage__Group__0 : rule__Usage__Group__0__Impl rule__Usage__Group__1 ;
    public final void rule__Usage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1534:1: ( rule__Usage__Group__0__Impl rule__Usage__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1535:2: rule__Usage__Group__0__Impl rule__Usage__Group__1
            {
            pushFollow(FOLLOW_rule__Usage__Group__0__Impl_in_rule__Usage__Group__03036);
            rule__Usage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Usage__Group__1_in_rule__Usage__Group__03039);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1542:1: rule__Usage__Group__0__Impl : ( 'usage' ) ;
    public final void rule__Usage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1546:1: ( ( 'usage' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1547:1: ( 'usage' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1547:1: ( 'usage' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1548:1: 'usage'
            {
             before(grammarAccess.getUsageAccess().getUsageKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Usage__Group__0__Impl3067); 
             after(grammarAccess.getUsageAccess().getUsageKeyword_0()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1561:1: rule__Usage__Group__1 : rule__Usage__Group__1__Impl ;
    public final void rule__Usage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1565:1: ( rule__Usage__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1566:2: rule__Usage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Usage__Group__1__Impl_in_rule__Usage__Group__13098);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1572:1: rule__Usage__Group__1__Impl : ( ( rule__Usage__InterfaceAssignment_1 ) ) ;
    public final void rule__Usage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1576:1: ( ( ( rule__Usage__InterfaceAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1577:1: ( ( rule__Usage__InterfaceAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1577:1: ( ( rule__Usage__InterfaceAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1578:1: ( rule__Usage__InterfaceAssignment_1 )
            {
             before(grammarAccess.getUsageAccess().getInterfaceAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1579:1: ( rule__Usage__InterfaceAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1579:2: rule__Usage__InterfaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Usage__InterfaceAssignment_1_in_rule__Usage__Group__1__Impl3125);
            rule__Usage__InterfaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsageAccess().getInterfaceAssignment_1()); 

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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1593:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1597:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1598:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03159);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03162);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1605:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1609:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1610:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1610:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1611:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3189); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1622:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1626:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1627:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13218);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1633:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1637:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1638:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1638:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1639:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1640:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1640:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3245);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1654:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1658:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1659:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03280);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03283);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1666:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1670:1: ( ( '.' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1671:1: ( '.' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1671:1: ( '.' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1672:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__QualifiedName__Group_1__0__Impl3311); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1685:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1689:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1690:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13342);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1696:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1700:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1701:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1701:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1702:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3369); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__SubsystemAssignment"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1718:1: rule__Model__SubsystemAssignment : ( ( rule__Model__SubsystemAlternatives_0 ) ) ;
    public final void rule__Model__SubsystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1722:1: ( ( ( rule__Model__SubsystemAlternatives_0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1723:1: ( ( rule__Model__SubsystemAlternatives_0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1723:1: ( ( rule__Model__SubsystemAlternatives_0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1724:1: ( rule__Model__SubsystemAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getSubsystemAlternatives_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1725:1: ( rule__Model__SubsystemAlternatives_0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1725:2: rule__Model__SubsystemAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__SubsystemAlternatives_0_in_rule__Model__SubsystemAssignment3407);
            rule__Model__SubsystemAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSubsystemAlternatives_0()); 

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
    // $ANTLR end "rule__Model__SubsystemAssignment"


    // $ANTLR start "rule__SubSystem__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1734:1: rule__SubSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1738:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1739:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1739:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1740:1: RULE_ID
            {
             before(grammarAccess.getSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubSystem__NameAssignment_13440); 
             after(grammarAccess.getSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__SubSystem__NameAssignment_1"


    // $ANTLR start "rule__SubSystem__PortsAssignment_3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1749:1: rule__SubSystem__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__SubSystem__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1753:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1754:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1754:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1755:1: rulePort
            {
             before(grammarAccess.getSubSystemAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__SubSystem__PortsAssignment_33471);
            rulePort();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getPortsPortParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SubSystem__PortsAssignment_3"


    // $ANTLR start "rule__SubSystem__InterfacesAssignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1764:1: rule__SubSystem__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__SubSystem__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1768:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1769:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1769:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1770:1: ruleInterface
            {
             before(grammarAccess.getSubSystemAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__SubSystem__InterfacesAssignment_43502);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getInterfacesInterfaceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SubSystem__InterfacesAssignment_4"


    // $ANTLR start "rule__SubSystem__ComponentsAssignment_5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1779:1: rule__SubSystem__ComponentsAssignment_5 : ( ruleComponent ) ;
    public final void rule__SubSystem__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1783:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1784:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1784:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1785:1: ruleComponent
            {
             before(grammarAccess.getSubSystemAccess().getComponentsComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__SubSystem__ComponentsAssignment_53533);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getComponentsComponentParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SubSystem__ComponentsAssignment_5"


    // $ANTLR start "rule__SubSystem__DependenciesAssignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1794:1: rule__SubSystem__DependenciesAssignment_6 : ( ruleDependency ) ;
    public final void rule__SubSystem__DependenciesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1798:1: ( ( ruleDependency ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1799:1: ( ruleDependency )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1799:1: ( ruleDependency )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1800:1: ruleDependency
            {
             before(grammarAccess.getSubSystemAccess().getDependenciesDependencyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__SubSystem__DependenciesAssignment_63564);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getDependenciesDependencyParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SubSystem__DependenciesAssignment_6"


    // $ANTLR start "rule__SubSystem__UsagesAssignment_7"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1809:1: rule__SubSystem__UsagesAssignment_7 : ( ruleUsage ) ;
    public final void rule__SubSystem__UsagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1813:1: ( ( ruleUsage ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1814:1: ( ruleUsage )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1814:1: ( ruleUsage )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1815:1: ruleUsage
            {
             before(grammarAccess.getSubSystemAccess().getUsagesUsageParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleUsage_in_rule__SubSystem__UsagesAssignment_73595);
            ruleUsage();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getUsagesUsageParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SubSystem__UsagesAssignment_7"


    // $ANTLR start "rule__SubSystem__ConnectorsAssignment_8"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1824:1: rule__SubSystem__ConnectorsAssignment_8 : ( ruleConnector ) ;
    public final void rule__SubSystem__ConnectorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1828:1: ( ( ruleConnector ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1829:1: ( ruleConnector )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1829:1: ( ruleConnector )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1830:1: ruleConnector
            {
             before(grammarAccess.getSubSystemAccess().getConnectorsConnectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__SubSystem__ConnectorsAssignment_83626);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getConnectorsConnectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__SubSystem__ConnectorsAssignment_8"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1839:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1843:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1844:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1844:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1845:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_13657); 
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


    // $ANTLR start "rule__Component__PortsAssignment_3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1854:1: rule__Component__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1858:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1859:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1859:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1860:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_33688);
            rulePort();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Component__PortsAssignment_3"


    // $ANTLR start "rule__Component__InterfacesAssignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1869:1: rule__Component__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__Component__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1873:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1874:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1874:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1875:1: ruleInterface
            {
             before(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_43719);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Component__InterfacesAssignment_4"


    // $ANTLR start "rule__Component__DependenciesAssignment_5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1884:1: rule__Component__DependenciesAssignment_5 : ( ruleDependency ) ;
    public final void rule__Component__DependenciesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1888:1: ( ( ruleDependency ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1889:1: ( ruleDependency )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1889:1: ( ruleDependency )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1890:1: ruleDependency
            {
             before(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Component__DependenciesAssignment_53750);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Component__DependenciesAssignment_5"


    // $ANTLR start "rule__Component__UsagesAssignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1899:1: rule__Component__UsagesAssignment_6 : ( ruleUsage ) ;
    public final void rule__Component__UsagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1903:1: ( ( ruleUsage ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1904:1: ( ruleUsage )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1904:1: ( ruleUsage )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1905:1: ruleUsage
            {
             before(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleUsage_in_rule__Component__UsagesAssignment_63781);
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


    // $ANTLR start "rule__Component__ConnectorsAssignment_7"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1914:1: rule__Component__ConnectorsAssignment_7 : ( ruleConnector ) ;
    public final void rule__Component__ConnectorsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1918:1: ( ( ruleConnector ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1919:1: ( ruleConnector )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1919:1: ( ruleConnector )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1920:1: ruleConnector
            {
             before(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__Component__ConnectorsAssignment_73812);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Component__ConnectorsAssignment_7"


    // $ANTLR start "rule__Connector__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1929:1: rule__Connector__TypeAssignment_1 : ( ruleConnectorType ) ;
    public final void rule__Connector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1933:1: ( ( ruleConnectorType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1934:1: ( ruleConnectorType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1934:1: ( ruleConnectorType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1935:1: ruleConnectorType
            {
             before(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConnectorType_in_rule__Connector__TypeAssignment_13843);
            ruleConnectorType();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__Connector__TypeAssignment_1"


    // $ANTLR start "rule__Connector__NameAssignment_2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1944:1: rule__Connector__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1948:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1949:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1949:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1950:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_23874); 
             after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Connector__NameAssignment_2"


    // $ANTLR start "rule__Connector__Int1Assignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1959:1: rule__Connector__Int1Assignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__Int1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1963:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1964:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1964:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1965:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorAccess().getInt1InterfaceCrossReference_4_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1966:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1967:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectorAccess().getInt1InterfaceQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Connector__Int1Assignment_43909);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getInt1InterfaceQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConnectorAccess().getInt1InterfaceCrossReference_4_0()); 

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
    // $ANTLR end "rule__Connector__Int1Assignment_4"


    // $ANTLR start "rule__Connector__Int2Assignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1978:1: rule__Connector__Int2Assignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__Int2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1982:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1983:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1983:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1984:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorAccess().getInt2InterfaceCrossReference_6_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1985:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1986:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectorAccess().getInt2InterfaceQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Connector__Int2Assignment_63948);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getConnectorAccess().getInt2InterfaceQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getConnectorAccess().getInt2InterfaceCrossReference_6_0()); 

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
    // $ANTLR end "rule__Connector__Int2Assignment_6"


    // $ANTLR start "rule__Interface__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1997:1: rule__Interface__TypeAssignment_1 : ( ruleInterfaceType ) ;
    public final void rule__Interface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2001:1: ( ( ruleInterfaceType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2002:1: ( ruleInterfaceType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2002:1: ( ruleInterfaceType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2003:1: ruleInterfaceType
            {
             before(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_rule__Interface__TypeAssignment_13983);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2012:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2016:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2017:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2017:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2018:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_24014); 
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


    // $ANTLR start "rule__Interface__PortAssignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2027:1: rule__Interface__PortAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2031:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2032:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2032:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2033:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2034:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2035:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getPortPortIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__PortAssignment_44049); 
             after(grammarAccess.getInterfaceAccess().getPortPortIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); 

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
    // $ANTLR end "rule__Interface__PortAssignment_4"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2046:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2050:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2051:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2051:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2052:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_14084); 
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


    // $ANTLR start "rule__Dependency__ComponentAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2061:1: rule__Dependency__ComponentAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2065:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2066:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2066:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2067:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getComponentElementCrossReference_1_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2068:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2069:1: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getComponentElementQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Dependency__ComponentAssignment_14119);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getComponentElementQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getComponentElementCrossReference_1_0()); 

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
    // $ANTLR end "rule__Dependency__ComponentAssignment_1"


    // $ANTLR start "rule__Usage__InterfaceAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2080:1: rule__Usage__InterfaceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Usage__InterfaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2084:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2085:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2085:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2086:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getUsageAccess().getInterfaceInterfaceCrossReference_1_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2087:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:2088:1: ruleQualifiedName
            {
             before(grammarAccess.getUsageAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Usage__InterfaceAssignment_14158);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUsageAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUsageAccess().getInterfaceInterfaceCrossReference_1_0()); 

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
    // $ANTLR end "rule__Usage__InterfaceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SubsystemAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_entryRuleSubSystem122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSystem129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__0_in_ruleSubSystem155 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__0_in_ruleUsage515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__Alternatives_in_ruleInterfaceType614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorType__Alternatives_in_ruleConnectorType650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_rule__Model__SubsystemAlternatives_0685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Model__SubsystemAlternatives_0702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceType__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceType__Alternatives757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConnectorType__Alternatives793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConnectorType__Alternatives814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__0__Impl_in_rule__SubSystem__Group__0847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__1_in_rule__SubSystem__Group__0850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubSystem__Group__0__Impl878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__1__Impl_in_rule__SubSystem__Group__1909 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__2_in_rule__SubSystem__Group__1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__NameAssignment_1_in_rule__SubSystem__Group__1__Impl939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__2__Impl_in_rule__SubSystem__Group__2969 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__3_in_rule__SubSystem__Group__2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SubSystem__Group__2__Impl1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__3__Impl_in_rule__SubSystem__Group__31031 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__4_in_rule__SubSystem__Group__31034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__PortsAssignment_3_in_rule__SubSystem__Group__3__Impl1061 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__4__Impl_in_rule__SubSystem__Group__41092 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__5_in_rule__SubSystem__Group__41095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__InterfacesAssignment_4_in_rule__SubSystem__Group__4__Impl1122 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__5__Impl_in_rule__SubSystem__Group__51153 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__6_in_rule__SubSystem__Group__51156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__ComponentsAssignment_5_in_rule__SubSystem__Group__5__Impl1183 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__6__Impl_in_rule__SubSystem__Group__61214 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__7_in_rule__SubSystem__Group__61217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__DependenciesAssignment_6_in_rule__SubSystem__Group__6__Impl1244 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__7__Impl_in_rule__SubSystem__Group__71275 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__8_in_rule__SubSystem__Group__71278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__UsagesAssignment_7_in_rule__SubSystem__Group__7__Impl1305 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__8__Impl_in_rule__SubSystem__Group__81336 = new BitSet(new long[]{0x0000000003CE8000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__9_in_rule__SubSystem__Group__81339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__ConnectorsAssignment_8_in_rule__SubSystem__Group__8__Impl1366 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__9__Impl_in_rule__SubSystem__Group__91397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SubSystem__Group__9__Impl1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group__0__Impl1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11538 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21598 = new BitSet(new long[]{0x0000000003CA0000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group__2__Impl1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31660 = new BitSet(new long[]{0x0000000003CA0000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_3_in_rule__Component__Group__3__Impl1690 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41721 = new BitSet(new long[]{0x0000000003CA0000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__InterfacesAssignment_4_in_rule__Component__Group__4__Impl1751 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51782 = new BitSet(new long[]{0x0000000003CA0000L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__DependenciesAssignment_5_in_rule__Component__Group__5__Impl1812 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61843 = new BitSet(new long[]{0x0000000003CA0000L});
    public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__UsagesAssignment_6_in_rule__Component__Group__6__Impl1873 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71904 = new BitSet(new long[]{0x0000000003CA0000L});
    public static final BitSet FOLLOW_rule__Component__Group__8_in_rule__Component__Group__71907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ConnectorsAssignment_7_in_rule__Component__Group__7__Impl1934 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Component__Group__8__Impl_in_rule__Component__Group__81965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Component__Group__8__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__02042 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__02045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Connector__Group__0__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__12104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__TypeAssignment_1_in_rule__Connector__Group__1__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__22164 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__22167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_2_in_rule__Connector__Group__2__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__32224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__32227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Connector__Group__3__Impl2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__42286 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Connector__Group__5_in_rule__Connector__Group__42289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Int1Assignment_4_in_rule__Connector__Group__4__Impl2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__5__Impl_in_rule__Connector__Group__52346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__6_in_rule__Connector__Group__52349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Connector__Group__5__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__6__Impl_in_rule__Connector__Group__62408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Int2Assignment_6_in_rule__Connector__Group__6__Impl2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__02479 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__02482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Interface__Group__0__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__12541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__22601 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__22604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__32661 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__32664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Interface__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__42723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__PortAssignment_4_in_rule__Interface__Group__4__Impl2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Port__Group__0__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Dependency__Group__0__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__ComponentAssignment_1_in_rule__Dependency__Group__1__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__0__Impl_in_rule__Usage__Group__03036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Usage__Group__1_in_rule__Usage__Group__03039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Usage__Group__0__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__1__Impl_in_rule__Usage__Group__13098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__InterfaceAssignment_1_in_rule__Usage__Group__1__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03159 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3245 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QualifiedName__Group_1__0__Impl3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SubsystemAlternatives_0_in_rule__Model__SubsystemAssignment3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubSystem__NameAssignment_13440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__SubSystem__PortsAssignment_33471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__SubSystem__InterfacesAssignment_43502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__SubSystem__ComponentsAssignment_53533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__SubSystem__DependenciesAssignment_63564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_rule__SubSystem__UsagesAssignment_73595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__SubSystem__ConnectorsAssignment_83626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_13657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_33688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_43719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Component__DependenciesAssignment_53750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_rule__Component__UsagesAssignment_63781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__Component__ConnectorsAssignment_73812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorType_in_rule__Connector__TypeAssignment_13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_23874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connector__Int1Assignment_43909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connector__Int2Assignment_63948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_rule__Interface__TypeAssignment_13983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_24014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__PortAssignment_44049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_14084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Dependency__ComponentAssignment_14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Usage__InterfaceAssignment_14158 = new BitSet(new long[]{0x0000000000000002L});

}