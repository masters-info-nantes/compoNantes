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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'provided'", "'subsystem'", "'{'", "'}'", "'component'", "'interface'", "'port'", "'dependency'", "'usage'", "'.'"
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

                if ( (LA1_0==13||LA1_0==16) ) {
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


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:144:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:145:1: ( ruleInterface EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:146:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface242);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface249); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:153:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:157:2: ( ( ( rule__Interface__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:158:1: ( ( rule__Interface__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:158:1: ( ( rule__Interface__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:159:1: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:160:1: ( rule__Interface__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:160:2: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_rule__Interface__Group__0_in_ruleInterface275);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:172:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:173:1: ( rulePort EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:174:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort302);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort309); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:181:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:185:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:186:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:186:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:187:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:188:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:188:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort335);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:200:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:201:1: ( ruleDependency EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:202:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency362);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency369); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:209:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:213:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:214:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:214:1: ( ( rule__Dependency__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:215:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:216:1: ( rule__Dependency__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:216:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency395);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:228:1: entryRuleUsage : ruleUsage EOF ;
    public final void entryRuleUsage() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:229:1: ( ruleUsage EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:230:1: ruleUsage EOF
            {
             before(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage422);
            ruleUsage();

            state._fsp--;

             after(grammarAccess.getUsageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage429); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:237:1: ruleUsage : ( ( rule__Usage__Group__0 ) ) ;
    public final void ruleUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:241:2: ( ( ( rule__Usage__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:242:1: ( ( rule__Usage__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:242:1: ( ( rule__Usage__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:243:1: ( rule__Usage__Group__0 )
            {
             before(grammarAccess.getUsageAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:244:1: ( rule__Usage__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:244:2: rule__Usage__Group__0
            {
            pushFollow(FOLLOW_rule__Usage__Group__0_in_ruleUsage455);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:258:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:259:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:260:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName484);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName491); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:267:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:271:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:272:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:272:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:273:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:274:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:274:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName517);
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


    // $ANTLR start "ruleType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:287:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:291:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:292:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:292:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:293:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:294:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:294:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType554);
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


    // $ANTLR start "rule__Model__SubsystemAlternatives_0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:305:1: rule__Model__SubsystemAlternatives_0 : ( ( ruleSubSystem ) | ( ruleComponent ) );
    public final void rule__Model__SubsystemAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:309:1: ( ( ruleSubSystem ) | ( ruleComponent ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:310:1: ( ruleSubSystem )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:310:1: ( ruleSubSystem )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:311:1: ruleSubSystem
                    {
                     before(grammarAccess.getModelAccess().getSubsystemSubSystemParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleSubSystem_in_rule__Model__SubsystemAlternatives_0589);
                    ruleSubSystem();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getSubsystemSubSystemParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:316:6: ( ruleComponent )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:316:6: ( ruleComponent )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:317:1: ruleComponent
                    {
                     before(grammarAccess.getModelAccess().getSubsystemComponentParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleComponent_in_rule__Model__SubsystemAlternatives_0606);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:328:1: rule__Type__Alternatives : ( ( ( 'required' ) ) | ( ( 'provided' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:332:1: ( ( ( 'required' ) ) | ( ( 'provided' ) ) )
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
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:333:1: ( ( 'required' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:333:1: ( ( 'required' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:334:1: ( 'required' )
                    {
                     before(grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:335:1: ( 'required' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:335:3: 'required'
                    {
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives640); 

                    }

                     after(grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:340:6: ( ( 'provided' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:340:6: ( ( 'provided' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:341:1: ( 'provided' )
                    {
                     before(grammarAccess.getTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:342:1: ( 'provided' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:342:3: 'provided'
                    {
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives661); 

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


    // $ANTLR start "rule__SubSystem__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:354:1: rule__SubSystem__Group__0 : rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1 ;
    public final void rule__SubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:358:1: ( rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:359:2: rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__0__Impl_in_rule__SubSystem__Group__0694);
            rule__SubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__1_in_rule__SubSystem__Group__0697);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:366:1: rule__SubSystem__Group__0__Impl : ( 'subsystem' ) ;
    public final void rule__SubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:370:1: ( ( 'subsystem' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:371:1: ( 'subsystem' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:371:1: ( 'subsystem' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:372:1: 'subsystem'
            {
             before(grammarAccess.getSubSystemAccess().getSubsystemKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__SubSystem__Group__0__Impl725); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:385:1: rule__SubSystem__Group__1 : rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2 ;
    public final void rule__SubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:389:1: ( rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:390:2: rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__1__Impl_in_rule__SubSystem__Group__1756);
            rule__SubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__2_in_rule__SubSystem__Group__1759);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:397:1: rule__SubSystem__Group__1__Impl : ( ( rule__SubSystem__NameAssignment_1 ) ) ;
    public final void rule__SubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:401:1: ( ( ( rule__SubSystem__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:402:1: ( ( rule__SubSystem__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:402:1: ( ( rule__SubSystem__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:403:1: ( rule__SubSystem__NameAssignment_1 )
            {
             before(grammarAccess.getSubSystemAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:404:1: ( rule__SubSystem__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:404:2: rule__SubSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SubSystem__NameAssignment_1_in_rule__SubSystem__Group__1__Impl786);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:414:1: rule__SubSystem__Group__2 : rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3 ;
    public final void rule__SubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:418:1: ( rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:419:2: rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__2__Impl_in_rule__SubSystem__Group__2816);
            rule__SubSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__3_in_rule__SubSystem__Group__2819);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:426:1: rule__SubSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:430:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:431:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:431:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:432:1: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__SubSystem__Group__2__Impl847); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:445:1: rule__SubSystem__Group__3 : rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4 ;
    public final void rule__SubSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:449:1: ( rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:450:2: rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__3__Impl_in_rule__SubSystem__Group__3878);
            rule__SubSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__4_in_rule__SubSystem__Group__3881);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:457:1: rule__SubSystem__Group__3__Impl : ( ( rule__SubSystem__ComponentsAssignment_3 )* ) ;
    public final void rule__SubSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:461:1: ( ( ( rule__SubSystem__ComponentsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:462:1: ( ( rule__SubSystem__ComponentsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:462:1: ( ( rule__SubSystem__ComponentsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:463:1: ( rule__SubSystem__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getSubSystemAccess().getComponentsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:464:1: ( rule__SubSystem__ComponentsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:464:2: rule__SubSystem__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__ComponentsAssignment_3_in_rule__SubSystem__Group__3__Impl908);
            	    rule__SubSystem__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getComponentsAssignment_3()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:474:1: rule__SubSystem__Group__4 : rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5 ;
    public final void rule__SubSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:478:1: ( rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:479:2: rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__4__Impl_in_rule__SubSystem__Group__4939);
            rule__SubSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__5_in_rule__SubSystem__Group__4942);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:486:1: rule__SubSystem__Group__4__Impl : ( ( rule__SubSystem__InterfacesAssignment_4 )* ) ;
    public final void rule__SubSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:490:1: ( ( ( rule__SubSystem__InterfacesAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:491:1: ( ( rule__SubSystem__InterfacesAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:491:1: ( ( rule__SubSystem__InterfacesAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:492:1: ( rule__SubSystem__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getSubSystemAccess().getInterfacesAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:493:1: ( rule__SubSystem__InterfacesAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:493:2: rule__SubSystem__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__InterfacesAssignment_4_in_rule__SubSystem__Group__4__Impl969);
            	    rule__SubSystem__InterfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:503:1: rule__SubSystem__Group__5 : rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6 ;
    public final void rule__SubSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:507:1: ( rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:508:2: rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__5__Impl_in_rule__SubSystem__Group__51000);
            rule__SubSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__6_in_rule__SubSystem__Group__51003);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:515:1: rule__SubSystem__Group__5__Impl : ( ( rule__SubSystem__PortsAssignment_5 )* ) ;
    public final void rule__SubSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:519:1: ( ( ( rule__SubSystem__PortsAssignment_5 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:520:1: ( ( rule__SubSystem__PortsAssignment_5 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:520:1: ( ( rule__SubSystem__PortsAssignment_5 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:521:1: ( rule__SubSystem__PortsAssignment_5 )*
            {
             before(grammarAccess.getSubSystemAccess().getPortsAssignment_5()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:522:1: ( rule__SubSystem__PortsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:522:2: rule__SubSystem__PortsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__PortsAssignment_5_in_rule__SubSystem__Group__5__Impl1030);
            	    rule__SubSystem__PortsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getPortsAssignment_5()); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:532:1: rule__SubSystem__Group__6 : rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7 ;
    public final void rule__SubSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:536:1: ( rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:537:2: rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__6__Impl_in_rule__SubSystem__Group__61061);
            rule__SubSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__7_in_rule__SubSystem__Group__61064);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:544:1: rule__SubSystem__Group__6__Impl : ( ( rule__SubSystem__DependenciesAssignment_6 )* ) ;
    public final void rule__SubSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:548:1: ( ( ( rule__SubSystem__DependenciesAssignment_6 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:549:1: ( ( rule__SubSystem__DependenciesAssignment_6 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:549:1: ( ( rule__SubSystem__DependenciesAssignment_6 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:550:1: ( rule__SubSystem__DependenciesAssignment_6 )*
            {
             before(grammarAccess.getSubSystemAccess().getDependenciesAssignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:551:1: ( rule__SubSystem__DependenciesAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:551:2: rule__SubSystem__DependenciesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__DependenciesAssignment_6_in_rule__SubSystem__Group__6__Impl1091);
            	    rule__SubSystem__DependenciesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:561:1: rule__SubSystem__Group__7 : rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8 ;
    public final void rule__SubSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:565:1: ( rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:566:2: rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__7__Impl_in_rule__SubSystem__Group__71122);
            rule__SubSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubSystem__Group__8_in_rule__SubSystem__Group__71125);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:573:1: rule__SubSystem__Group__7__Impl : ( ( rule__SubSystem__UsagesAssignment_7 )* ) ;
    public final void rule__SubSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:577:1: ( ( ( rule__SubSystem__UsagesAssignment_7 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:578:1: ( ( rule__SubSystem__UsagesAssignment_7 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:578:1: ( ( rule__SubSystem__UsagesAssignment_7 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:579:1: ( rule__SubSystem__UsagesAssignment_7 )*
            {
             before(grammarAccess.getSubSystemAccess().getUsagesAssignment_7()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:580:1: ( rule__SubSystem__UsagesAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:580:2: rule__SubSystem__UsagesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__SubSystem__UsagesAssignment_7_in_rule__SubSystem__Group__7__Impl1152);
            	    rule__SubSystem__UsagesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:590:1: rule__SubSystem__Group__8 : rule__SubSystem__Group__8__Impl ;
    public final void rule__SubSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:594:1: ( rule__SubSystem__Group__8__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:595:2: rule__SubSystem__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SubSystem__Group__8__Impl_in_rule__SubSystem__Group__81183);
            rule__SubSystem__Group__8__Impl();

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:601:1: rule__SubSystem__Group__8__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:605:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:606:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:606:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:607:1: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FOLLOW_15_in_rule__SubSystem__Group__8__Impl1211); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_8()); 

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


    // $ANTLR start "rule__Component__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:638:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:642:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:643:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01260);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01263);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:650:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:654:1: ( ( 'component' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:655:1: ( 'component' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:655:1: ( 'component' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:656:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Component__Group__0__Impl1291); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:669:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:673:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:674:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11322);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11325);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:681:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:685:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:686:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:686:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:687:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:688:1: ( rule__Component__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:688:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1352);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:698:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:702:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:703:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21382);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21385);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:710:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:714:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:715:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:715:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:716:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Component__Group__2__Impl1413); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:729:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:733:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:734:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31444);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31447);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:741:1: rule__Component__Group__3__Impl : ( ( rule__Component__InterfacesAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:745:1: ( ( ( rule__Component__InterfacesAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:746:1: ( ( rule__Component__InterfacesAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:746:1: ( ( rule__Component__InterfacesAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:747:1: ( rule__Component__InterfacesAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getInterfacesAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:748:1: ( rule__Component__InterfacesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:748:2: rule__Component__InterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__InterfacesAssignment_3_in_rule__Component__Group__3__Impl1474);
            	    rule__Component__InterfacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:758:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:762:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:763:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41505);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41508);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:770:1: rule__Component__Group__4__Impl : ( ( rule__Component__PortsAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:774:1: ( ( ( rule__Component__PortsAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:775:1: ( ( rule__Component__PortsAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:775:1: ( ( rule__Component__PortsAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:776:1: ( rule__Component__PortsAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:777:1: ( rule__Component__PortsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:777:2: rule__Component__PortsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_4_in_rule__Component__Group__4__Impl1535);
            	    rule__Component__PortsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:787:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:791:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:792:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51566);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51569);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:799:1: rule__Component__Group__5__Impl : ( ( rule__Component__DependenciesAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:803:1: ( ( ( rule__Component__DependenciesAssignment_5 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:804:1: ( ( rule__Component__DependenciesAssignment_5 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:804:1: ( ( rule__Component__DependenciesAssignment_5 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:805:1: ( rule__Component__DependenciesAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getDependenciesAssignment_5()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:806:1: ( rule__Component__DependenciesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:806:2: rule__Component__DependenciesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__DependenciesAssignment_5_in_rule__Component__Group__5__Impl1596);
            	    rule__Component__DependenciesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:816:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:820:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:821:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61627);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61630);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:828:1: rule__Component__Group__6__Impl : ( ( rule__Component__UsagesAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:832:1: ( ( ( rule__Component__UsagesAssignment_6 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:833:1: ( ( rule__Component__UsagesAssignment_6 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:833:1: ( ( rule__Component__UsagesAssignment_6 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:834:1: ( rule__Component__UsagesAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getUsagesAssignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:835:1: ( rule__Component__UsagesAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:835:2: rule__Component__UsagesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Component__UsagesAssignment_6_in_rule__Component__Group__6__Impl1657);
            	    rule__Component__UsagesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:845:1: rule__Component__Group__7 : rule__Component__Group__7__Impl ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:849:1: ( rule__Component__Group__7__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:850:2: rule__Component__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71688);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:856:1: rule__Component__Group__7__Impl : ( '}' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:860:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:861:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:861:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:862:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_15_in_rule__Component__Group__7__Impl1716); 
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


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:891:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:895:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:896:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01763);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01766);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:903:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:907:1: ( ( 'interface' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:908:1: ( 'interface' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:908:1: ( 'interface' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:909:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Interface__Group__0__Impl1794); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:922:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:926:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:927:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11825);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11828);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:934:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__TypeAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:938:1: ( ( ( rule__Interface__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:939:1: ( ( rule__Interface__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:939:1: ( ( rule__Interface__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:940:1: ( rule__Interface__TypeAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:941:1: ( rule__Interface__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:941:2: rule__Interface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl1855);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:951:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:955:1: ( rule__Interface__Group__2__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:956:2: rule__Interface__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21885);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:962:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:966:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:967:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:967:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:968:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:969:1: ( rule__Interface__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:969:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1912);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:985:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:989:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:990:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01948);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01951);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:997:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1001:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1002:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1002:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1003:1: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Port__Group__0__Impl1979); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1016:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1020:1: ( rule__Port__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1021:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12010);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1027:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1031:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1032:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1032:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1033:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1034:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1034:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2037);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1048:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1052:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1053:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02071);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02074);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1060:1: rule__Dependency__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1064:1: ( ( 'dependency' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1065:1: ( 'dependency' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1065:1: ( 'dependency' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1066:1: 'dependency'
            {
             before(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Dependency__Group__0__Impl2102); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1079:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1083:1: ( rule__Dependency__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1084:2: rule__Dependency__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12133);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1090:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__ComponentAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1094:1: ( ( ( rule__Dependency__ComponentAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1095:1: ( ( rule__Dependency__ComponentAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1095:1: ( ( rule__Dependency__ComponentAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1096:1: ( rule__Dependency__ComponentAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getComponentAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1097:1: ( rule__Dependency__ComponentAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1097:2: rule__Dependency__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependency__ComponentAssignment_1_in_rule__Dependency__Group__1__Impl2160);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1111:1: rule__Usage__Group__0 : rule__Usage__Group__0__Impl rule__Usage__Group__1 ;
    public final void rule__Usage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1115:1: ( rule__Usage__Group__0__Impl rule__Usage__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1116:2: rule__Usage__Group__0__Impl rule__Usage__Group__1
            {
            pushFollow(FOLLOW_rule__Usage__Group__0__Impl_in_rule__Usage__Group__02194);
            rule__Usage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Usage__Group__1_in_rule__Usage__Group__02197);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1123:1: rule__Usage__Group__0__Impl : ( 'usage' ) ;
    public final void rule__Usage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1127:1: ( ( 'usage' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1128:1: ( 'usage' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1128:1: ( 'usage' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1129:1: 'usage'
            {
             before(grammarAccess.getUsageAccess().getUsageKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Usage__Group__0__Impl2225); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1142:1: rule__Usage__Group__1 : rule__Usage__Group__1__Impl ;
    public final void rule__Usage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1146:1: ( rule__Usage__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1147:2: rule__Usage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Usage__Group__1__Impl_in_rule__Usage__Group__12256);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1153:1: rule__Usage__Group__1__Impl : ( ( rule__Usage__ComponentAssignment_1 ) ) ;
    public final void rule__Usage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1157:1: ( ( ( rule__Usage__ComponentAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1158:1: ( ( rule__Usage__ComponentAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1158:1: ( ( rule__Usage__ComponentAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1159:1: ( rule__Usage__ComponentAssignment_1 )
            {
             before(grammarAccess.getUsageAccess().getComponentAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1160:1: ( rule__Usage__ComponentAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1160:2: rule__Usage__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Usage__ComponentAssignment_1_in_rule__Usage__Group__1__Impl2283);
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1174:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1178:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1179:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02317);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02320);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1186:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1190:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1191:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1191:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1192:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2347); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1203:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1207:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1208:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12376);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1214:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1218:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1219:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1219:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1220:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1221:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1221:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2403);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1235:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1239:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1240:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02438);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02441);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1247:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1251:1: ( ( '.' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1252:1: ( '.' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1252:1: ( '.' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1253:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2469); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1266:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1270:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1271:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12500);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1277:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1281:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1282:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1282:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1283:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2527); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1299:1: rule__Model__SubsystemAssignment : ( ( rule__Model__SubsystemAlternatives_0 ) ) ;
    public final void rule__Model__SubsystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1303:1: ( ( ( rule__Model__SubsystemAlternatives_0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1304:1: ( ( rule__Model__SubsystemAlternatives_0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1304:1: ( ( rule__Model__SubsystemAlternatives_0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1305:1: ( rule__Model__SubsystemAlternatives_0 )
            {
             before(grammarAccess.getModelAccess().getSubsystemAlternatives_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1306:1: ( rule__Model__SubsystemAlternatives_0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1306:2: rule__Model__SubsystemAlternatives_0
            {
            pushFollow(FOLLOW_rule__Model__SubsystemAlternatives_0_in_rule__Model__SubsystemAssignment2565);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1315:1: rule__SubSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1319:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1320:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1320:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1321:1: RULE_ID
            {
             before(grammarAccess.getSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SubSystem__NameAssignment_12598); 
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


    // $ANTLR start "rule__SubSystem__ComponentsAssignment_3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1330:1: rule__SubSystem__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__SubSystem__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1334:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1335:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1335:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1336:1: ruleComponent
            {
             before(grammarAccess.getSubSystemAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__SubSystem__ComponentsAssignment_32629);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SubSystem__ComponentsAssignment_3"


    // $ANTLR start "rule__SubSystem__InterfacesAssignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1345:1: rule__SubSystem__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__SubSystem__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1349:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1350:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1350:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1351:1: ruleInterface
            {
             before(grammarAccess.getSubSystemAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__SubSystem__InterfacesAssignment_42660);
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


    // $ANTLR start "rule__SubSystem__PortsAssignment_5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1360:1: rule__SubSystem__PortsAssignment_5 : ( rulePort ) ;
    public final void rule__SubSystem__PortsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1364:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1365:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1365:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1366:1: rulePort
            {
             before(grammarAccess.getSubSystemAccess().getPortsPortParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__SubSystem__PortsAssignment_52691);
            rulePort();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getPortsPortParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__SubSystem__PortsAssignment_5"


    // $ANTLR start "rule__SubSystem__DependenciesAssignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1375:1: rule__SubSystem__DependenciesAssignment_6 : ( ruleDependency ) ;
    public final void rule__SubSystem__DependenciesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1379:1: ( ( ruleDependency ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1380:1: ( ruleDependency )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1380:1: ( ruleDependency )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1381:1: ruleDependency
            {
             before(grammarAccess.getSubSystemAccess().getDependenciesDependencyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__SubSystem__DependenciesAssignment_62722);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1390:1: rule__SubSystem__UsagesAssignment_7 : ( ruleUsage ) ;
    public final void rule__SubSystem__UsagesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1394:1: ( ( ruleUsage ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1395:1: ( ruleUsage )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1395:1: ( ruleUsage )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1396:1: ruleUsage
            {
             before(grammarAccess.getSubSystemAccess().getUsagesUsageParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleUsage_in_rule__SubSystem__UsagesAssignment_72753);
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


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1405:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1409:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1410:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1410:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1411:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12784); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1420:1: rule__Component__InterfacesAssignment_3 : ( ruleInterface ) ;
    public final void rule__Component__InterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1424:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1425:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1425:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1426:1: ruleInterface
            {
             before(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_32815);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1435:1: rule__Component__PortsAssignment_4 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1439:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1440:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1440:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1441:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_42846);
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


    // $ANTLR start "rule__Component__DependenciesAssignment_5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1450:1: rule__Component__DependenciesAssignment_5 : ( ruleDependency ) ;
    public final void rule__Component__DependenciesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1454:1: ( ( ruleDependency ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1455:1: ( ruleDependency )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1455:1: ( ruleDependency )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1456:1: ruleDependency
            {
             before(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Component__DependenciesAssignment_52877);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1465:1: rule__Component__UsagesAssignment_6 : ( ruleUsage ) ;
    public final void rule__Component__UsagesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1469:1: ( ( ruleUsage ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1470:1: ( ruleUsage )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1470:1: ( ruleUsage )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1471:1: ruleUsage
            {
             before(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleUsage_in_rule__Component__UsagesAssignment_62908);
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


    // $ANTLR start "rule__Interface__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1480:1: rule__Interface__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__Interface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1484:1: ( ( ruleType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1485:1: ( ruleType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1485:1: ( ruleType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1486:1: ruleType
            {
             before(grammarAccess.getInterfaceAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Interface__TypeAssignment_12939);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1495:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1499:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1500:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1500:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1501:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_22970); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1510:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1514:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1515:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1515:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1516:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_13001); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1525:1: rule__Dependency__ComponentAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1529:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1530:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1530:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1531:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getComponentTrucCrossReference_1_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1532:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1533:1: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getComponentTrucQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Dependency__ComponentAssignment_13036);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getComponentTrucQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getComponentTrucCrossReference_1_0()); 

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


    // $ANTLR start "rule__Usage__ComponentAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1544:1: rule__Usage__ComponentAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Usage__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1548:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1549:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1549:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1550:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getUsageAccess().getComponentTrucCrossReference_1_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1551:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1552:1: ruleQualifiedName
            {
             before(grammarAccess.getUsageAccess().getComponentTrucQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Usage__ComponentAssignment_13075);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUsageAccess().getComponentTrucQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUsageAccess().getComponentTrucCrossReference_1_0()); 

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
    public static final BitSet FOLLOW_rule__Model__SubsystemAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_entryRuleSubSystem122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSystem129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__0_in_ruleSubSystem155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__0_in_ruleUsage455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_rule__Model__SubsystemAlternatives_0589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Model__SubsystemAlternatives_0606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__0__Impl_in_rule__SubSystem__Group__0694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__1_in_rule__SubSystem__Group__0697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SubSystem__Group__0__Impl725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__1__Impl_in_rule__SubSystem__Group__1756 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__2_in_rule__SubSystem__Group__1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__NameAssignment_1_in_rule__SubSystem__Group__1__Impl786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__2__Impl_in_rule__SubSystem__Group__2816 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__3_in_rule__SubSystem__Group__2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SubSystem__Group__2__Impl847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__3__Impl_in_rule__SubSystem__Group__3878 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__4_in_rule__SubSystem__Group__3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__ComponentsAssignment_3_in_rule__SubSystem__Group__3__Impl908 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__4__Impl_in_rule__SubSystem__Group__4939 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__5_in_rule__SubSystem__Group__4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__InterfacesAssignment_4_in_rule__SubSystem__Group__4__Impl969 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__5__Impl_in_rule__SubSystem__Group__51000 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__6_in_rule__SubSystem__Group__51003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__PortsAssignment_5_in_rule__SubSystem__Group__5__Impl1030 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__6__Impl_in_rule__SubSystem__Group__61061 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__7_in_rule__SubSystem__Group__61064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__DependenciesAssignment_6_in_rule__SubSystem__Group__6__Impl1091 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__7__Impl_in_rule__SubSystem__Group__71122 = new BitSet(new long[]{0x00000000001FA000L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__8_in_rule__SubSystem__Group__71125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubSystem__UsagesAssignment_7_in_rule__SubSystem__Group__7__Impl1152 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SubSystem__Group__8__Impl_in_rule__SubSystem__Group__81183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SubSystem__Group__8__Impl1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__01260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__01263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Component__Group__0__Impl1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__11322 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__21382 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__21385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Component__Group__2__Impl1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__31444 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__31447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__InterfacesAssignment_3_in_rule__Component__Group__3__Impl1474 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41505 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_4_in_rule__Component__Group__4__Impl1535 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51566 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__DependenciesAssignment_5_in_rule__Component__Group__5__Impl1596 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61627 = new BitSet(new long[]{0x00000000001E8000L});
    public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__UsagesAssignment_6_in_rule__Component__Group__6__Impl1657 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Component__Group__7__Impl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01763 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Interface__Group__0__Impl1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Port__Group__0__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Dependency__Group__0__Impl2102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__ComponentAssignment_1_in_rule__Dependency__Group__1__Impl2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__0__Impl_in_rule__Usage__Group__02194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Usage__Group__1_in_rule__Usage__Group__02197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Usage__Group__0__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__Group__1__Impl_in_rule__Usage__Group__12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Usage__ComponentAssignment_1_in_rule__Usage__Group__1__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02317 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2403 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SubsystemAlternatives_0_in_rule__Model__SubsystemAssignment2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SubSystem__NameAssignment_12598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__SubSystem__ComponentsAssignment_32629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__SubSystem__InterfacesAssignment_42660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__SubSystem__PortsAssignment_52691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__SubSystem__DependenciesAssignment_62722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_rule__SubSystem__UsagesAssignment_72753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_32815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_42846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Component__DependenciesAssignment_52877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_rule__Component__UsagesAssignment_62908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Interface__TypeAssignment_12939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_22970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Dependency__ComponentAssignment_13036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Usage__ComponentAssignment_13075 = new BitSet(new long[]{0x0000000000000002L});

}