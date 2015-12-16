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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'required'", "'provided'", "'assembly'", "'delegation'", "'usage'", "'association'", "'component'", "'{'", "'}'", "'port'", "'interface'", "'connector'", "':'", "'to'", "'dependency'", "'.'"
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:69:1: ruleModel : ( ( rule__Model__ComponentsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:73:2: ( ( ( rule__Model__ComponentsAssignment )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:74:1: ( ( rule__Model__ComponentsAssignment )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:74:1: ( ( rule__Model__ComponentsAssignment )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:75:1: ( rule__Model__ComponentsAssignment )*
            {
             before(grammarAccess.getModelAccess().getComponentsAssignment()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:76:1: ( rule__Model__ComponentsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:76:2: rule__Model__ComponentsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ComponentsAssignment_in_ruleModel94);
            	    rule__Model__ComponentsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getComponentsAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:88:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:89:1: ( ruleComponent EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:90:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent122);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent129); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:97:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:101:2: ( ( ( rule__Component__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:102:1: ( ( rule__Component__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:102:1: ( ( rule__Component__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:103:1: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:104:1: ( rule__Component__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:104:2: rule__Component__Group__0
            {
            pushFollow(FOLLOW_rule__Component__Group__0_in_ruleComponent155);
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


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:116:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:117:1: ( rulePort EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:118:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort182);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort189); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:125:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:129:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:130:1: ( ( rule__Port__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:130:1: ( ( rule__Port__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:131:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:132:1: ( rule__Port__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:132:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort215);
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


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:172:1: entryRuleConnector : ruleConnector EOF ;
    public final void entryRuleConnector() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:173:1: ( ruleConnector EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:174:1: ruleConnector EOF
            {
             before(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector302);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getConnectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector309); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:181:1: ruleConnector : ( ( rule__Connector__Group__0 ) ) ;
    public final void ruleConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:185:2: ( ( ( rule__Connector__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:186:1: ( ( rule__Connector__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:186:1: ( ( rule__Connector__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:187:1: ( rule__Connector__Group__0 )
            {
             before(grammarAccess.getConnectorAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:188:1: ( rule__Connector__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:188:2: rule__Connector__Group__0
            {
            pushFollow(FOLLOW_rule__Connector__Group__0_in_ruleConnector335);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:228:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:229:1: ( ruleQualifiedName EOF )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:230:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName422);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName429); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:237:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:241:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:242:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:242:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:243:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:244:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:244:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName455);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:257:1: ruleInterfaceType : ( ( rule__InterfaceType__Alternatives ) ) ;
    public final void ruleInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:261:1: ( ( ( rule__InterfaceType__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:262:1: ( ( rule__InterfaceType__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:262:1: ( ( rule__InterfaceType__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:263:1: ( rule__InterfaceType__Alternatives )
            {
             before(grammarAccess.getInterfaceTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:264:1: ( rule__InterfaceType__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:264:2: rule__InterfaceType__Alternatives
            {
            pushFollow(FOLLOW_rule__InterfaceType__Alternatives_in_ruleInterfaceType492);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:276:1: ruleConnectorType : ( ( rule__ConnectorType__Alternatives ) ) ;
    public final void ruleConnectorType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:280:1: ( ( ( rule__ConnectorType__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:281:1: ( ( rule__ConnectorType__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:281:1: ( ( rule__ConnectorType__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:282:1: ( rule__ConnectorType__Alternatives )
            {
             before(grammarAccess.getConnectorTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:283:1: ( rule__ConnectorType__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:283:2: rule__ConnectorType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConnectorType__Alternatives_in_ruleConnectorType528);
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


    // $ANTLR start "ruleDependencyType"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:295:1: ruleDependencyType : ( ( rule__DependencyType__Alternatives ) ) ;
    public final void ruleDependencyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:299:1: ( ( ( rule__DependencyType__Alternatives ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:300:1: ( ( rule__DependencyType__Alternatives ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:300:1: ( ( rule__DependencyType__Alternatives ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:301:1: ( rule__DependencyType__Alternatives )
            {
             before(grammarAccess.getDependencyTypeAccess().getAlternatives()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:302:1: ( rule__DependencyType__Alternatives )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:302:2: rule__DependencyType__Alternatives
            {
            pushFollow(FOLLOW_rule__DependencyType__Alternatives_in_ruleDependencyType564);
            rule__DependencyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependencyType"


    // $ANTLR start "rule__InterfaceType__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:313:1: rule__InterfaceType__Alternatives : ( ( ( 'required' ) ) | ( ( 'provided' ) ) );
    public final void rule__InterfaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:317:1: ( ( ( 'required' ) ) | ( ( 'provided' ) ) )
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
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:318:1: ( ( 'required' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:318:1: ( ( 'required' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:319:1: ( 'required' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:320:1: ( 'required' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:320:3: 'required'
                    {
                    match(input,11,FOLLOW_11_in_rule__InterfaceType__Alternatives600); 

                    }

                     after(grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:325:6: ( ( 'provided' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:325:6: ( ( 'provided' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:326:1: ( 'provided' )
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:327:1: ( 'provided' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:327:3: 'provided'
                    {
                    match(input,12,FOLLOW_12_in_rule__InterfaceType__Alternatives621); 

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:337:1: rule__ConnectorType__Alternatives : ( ( ( 'assembly' ) ) | ( ( 'delegation' ) ) );
    public final void rule__ConnectorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:341:1: ( ( ( 'assembly' ) ) | ( ( 'delegation' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:342:1: ( ( 'assembly' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:342:1: ( ( 'assembly' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:343:1: ( 'assembly' )
                    {
                     before(grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:344:1: ( 'assembly' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:344:3: 'assembly'
                    {
                    match(input,13,FOLLOW_13_in_rule__ConnectorType__Alternatives657); 

                    }

                     after(grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:349:6: ( ( 'delegation' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:349:6: ( ( 'delegation' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:350:1: ( 'delegation' )
                    {
                     before(grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:351:1: ( 'delegation' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:351:3: 'delegation'
                    {
                    match(input,14,FOLLOW_14_in_rule__ConnectorType__Alternatives678); 

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


    // $ANTLR start "rule__DependencyType__Alternatives"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:361:1: rule__DependencyType__Alternatives : ( ( ( 'usage' ) ) | ( ( 'association' ) ) );
    public final void rule__DependencyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:365:1: ( ( ( 'usage' ) ) | ( ( 'association' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:366:1: ( ( 'usage' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:366:1: ( ( 'usage' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:367:1: ( 'usage' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getUSAGEEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:368:1: ( 'usage' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:368:3: 'usage'
                    {
                    match(input,15,FOLLOW_15_in_rule__DependencyType__Alternatives714); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getUSAGEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:373:6: ( ( 'association' ) )
                    {
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:373:6: ( ( 'association' ) )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:374:1: ( 'association' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getASSOCIATIONEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:375:1: ( 'association' )
                    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:375:3: 'association'
                    {
                    match(input,16,FOLLOW_16_in_rule__DependencyType__Alternatives735); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getASSOCIATIONEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__DependencyType__Alternatives"


    // $ANTLR start "rule__Component__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:387:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:391:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:392:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__0768);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__1_in_rule__Component__Group__0771);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:399:1: rule__Component__Group__0__Impl : ( 'component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:403:1: ( ( 'component' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:404:1: ( 'component' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:404:1: ( 'component' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:405:1: 'component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Component__Group__0__Impl799); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:418:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:422:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:423:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__1830);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__2_in_rule__Component__Group__1833);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:430:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:434:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:435:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:435:1: ( ( rule__Component__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:436:1: ( rule__Component__NameAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:437:1: ( rule__Component__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:437:2: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl860);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:447:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:451:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:452:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__2890);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__3_in_rule__Component__Group__2893);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:459:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:463:1: ( ( '{' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:464:1: ( '{' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:464:1: ( '{' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:465:1: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_18_in_rule__Component__Group__2__Impl921); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:478:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:482:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:483:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__3952);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__4_in_rule__Component__Group__3955);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:490:1: rule__Component__Group__3__Impl : ( ( rule__Component__PortsAssignment_3 )* ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:494:1: ( ( ( rule__Component__PortsAssignment_3 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:495:1: ( ( rule__Component__PortsAssignment_3 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:495:1: ( ( rule__Component__PortsAssignment_3 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:496:1: ( rule__Component__PortsAssignment_3 )*
            {
             before(grammarAccess.getComponentAccess().getPortsAssignment_3()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:497:1: ( rule__Component__PortsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:497:2: rule__Component__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Component__PortsAssignment_3_in_rule__Component__Group__3__Impl982);
            	    rule__Component__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:507:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:511:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:512:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41013);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41016);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:519:1: rule__Component__Group__4__Impl : ( ( rule__Component__InterfacesAssignment_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:523:1: ( ( ( rule__Component__InterfacesAssignment_4 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:524:1: ( ( rule__Component__InterfacesAssignment_4 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:524:1: ( ( rule__Component__InterfacesAssignment_4 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:525:1: ( rule__Component__InterfacesAssignment_4 )*
            {
             before(grammarAccess.getComponentAccess().getInterfacesAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:526:1: ( rule__Component__InterfacesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:526:2: rule__Component__InterfacesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Component__InterfacesAssignment_4_in_rule__Component__Group__4__Impl1043);
            	    rule__Component__InterfacesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:536:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:540:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:541:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51074);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51077);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:548:1: rule__Component__Group__5__Impl : ( ( rule__Component__ComponentsAssignment_5 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:552:1: ( ( ( rule__Component__ComponentsAssignment_5 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:553:1: ( ( rule__Component__ComponentsAssignment_5 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:553:1: ( ( rule__Component__ComponentsAssignment_5 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:554:1: ( rule__Component__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getComponentAccess().getComponentsAssignment_5()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:555:1: ( rule__Component__ComponentsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:555:2: rule__Component__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Component__ComponentsAssignment_5_in_rule__Component__Group__5__Impl1104);
            	    rule__Component__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getComponentsAssignment_5()); 

            }


            }

        }
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:565:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:569:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:570:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61135);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61138);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:577:1: rule__Component__Group__6__Impl : ( ( rule__Component__ConnectorsAssignment_6 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:581:1: ( ( ( rule__Component__ConnectorsAssignment_6 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:582:1: ( ( rule__Component__ConnectorsAssignment_6 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:582:1: ( ( rule__Component__ConnectorsAssignment_6 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:583:1: ( rule__Component__ConnectorsAssignment_6 )*
            {
             before(grammarAccess.getComponentAccess().getConnectorsAssignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:584:1: ( rule__Component__ConnectorsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:584:2: rule__Component__ConnectorsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Component__ConnectorsAssignment_6_in_rule__Component__Group__6__Impl1165);
            	    rule__Component__ConnectorsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getConnectorsAssignment_6()); 

            }


            }

        }
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:594:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:598:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:599:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71196);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Component__Group__8_in_rule__Component__Group__71199);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:606:1: rule__Component__Group__7__Impl : ( ( rule__Component__DependenciesAssignment_7 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:610:1: ( ( ( rule__Component__DependenciesAssignment_7 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:611:1: ( ( rule__Component__DependenciesAssignment_7 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:611:1: ( ( rule__Component__DependenciesAssignment_7 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:612:1: ( rule__Component__DependenciesAssignment_7 )*
            {
             before(grammarAccess.getComponentAccess().getDependenciesAssignment_7()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:613:1: ( rule__Component__DependenciesAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:613:2: rule__Component__DependenciesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Component__DependenciesAssignment_7_in_rule__Component__Group__7__Impl1226);
            	    rule__Component__DependenciesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getDependenciesAssignment_7()); 

            }


            }

        }
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:623:1: rule__Component__Group__8 : rule__Component__Group__8__Impl ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:627:1: ( rule__Component__Group__8__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:628:2: rule__Component__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Component__Group__8__Impl_in_rule__Component__Group__81257);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:634:1: rule__Component__Group__8__Impl : ( '}' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:638:1: ( ( '}' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:639:1: ( '}' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:639:1: ( '}' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:640:1: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Component__Group__8__Impl1285); 
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


    // $ANTLR start "rule__Port__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:671:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:675:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:676:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01334);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01337);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:683:1: rule__Port__Group__0__Impl : ( 'port' ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:687:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:688:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:688:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:689:1: 'port'
            {
             before(grammarAccess.getPortAccess().getPortKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Port__Group__0__Impl1365); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:702:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:706:1: ( rule__Port__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:707:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11396);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:713:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:717:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:718:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:718:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:719:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:720:1: ( rule__Port__NameAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:720:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl1423);
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


    // $ANTLR start "rule__Interface__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:734:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:738:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:739:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01457);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01460);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:746:1: rule__Interface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:750:1: ( ( 'interface' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:751:1: ( 'interface' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:751:1: ( 'interface' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:752:1: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Interface__Group__0__Impl1488); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:765:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:769:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:770:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11519);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11522);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:777:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__TypeAssignment_1 ) ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:781:1: ( ( ( rule__Interface__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:782:1: ( ( rule__Interface__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:782:1: ( ( rule__Interface__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:783:1: ( rule__Interface__TypeAssignment_1 )
            {
             before(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:784:1: ( rule__Interface__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:784:2: rule__Interface__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl1549);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:794:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:798:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:799:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21579);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21582);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:806:1: rule__Interface__Group__2__Impl : ( ( rule__Interface__NameAssignment_2 ) ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:810:1: ( ( ( rule__Interface__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:811:1: ( ( rule__Interface__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:811:1: ( ( rule__Interface__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:812:1: ( rule__Interface__NameAssignment_2 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:813:1: ( rule__Interface__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:813:2: rule__Interface__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1609);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:823:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:827:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:828:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31639);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31642);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:835:1: rule__Interface__Group__3__Impl : ( 'port' ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:839:1: ( ( 'port' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:840:1: ( 'port' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:840:1: ( 'port' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:841:1: 'port'
            {
             before(grammarAccess.getInterfaceAccess().getPortKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Interface__Group__3__Impl1670); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:854:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:858:1: ( rule__Interface__Group__4__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:859:2: rule__Interface__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41701);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:865:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__PortAssignment_4 ) ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:869:1: ( ( ( rule__Interface__PortAssignment_4 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:870:1: ( ( rule__Interface__PortAssignment_4 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:870:1: ( ( rule__Interface__PortAssignment_4 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:871:1: ( rule__Interface__PortAssignment_4 )
            {
             before(grammarAccess.getInterfaceAccess().getPortAssignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:872:1: ( rule__Interface__PortAssignment_4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:872:2: rule__Interface__PortAssignment_4
            {
            pushFollow(FOLLOW_rule__Interface__PortAssignment_4_in_rule__Interface__Group__4__Impl1728);
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


    // $ANTLR start "rule__Connector__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:892:1: rule__Connector__Group__0 : rule__Connector__Group__0__Impl rule__Connector__Group__1 ;
    public final void rule__Connector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:896:1: ( rule__Connector__Group__0__Impl rule__Connector__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:897:2: rule__Connector__Group__0__Impl rule__Connector__Group__1
            {
            pushFollow(FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__01768);
            rule__Connector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__01771);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:904:1: rule__Connector__Group__0__Impl : ( 'connector' ) ;
    public final void rule__Connector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:908:1: ( ( 'connector' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:909:1: ( 'connector' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:909:1: ( 'connector' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:910:1: 'connector'
            {
             before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Connector__Group__0__Impl1799); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:923:1: rule__Connector__Group__1 : rule__Connector__Group__1__Impl rule__Connector__Group__2 ;
    public final void rule__Connector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:927:1: ( rule__Connector__Group__1__Impl rule__Connector__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:928:2: rule__Connector__Group__1__Impl rule__Connector__Group__2
            {
            pushFollow(FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__11830);
            rule__Connector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__11833);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:935:1: rule__Connector__Group__1__Impl : ( ( rule__Connector__TypeAssignment_1 ) ) ;
    public final void rule__Connector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:939:1: ( ( ( rule__Connector__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:940:1: ( ( rule__Connector__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:940:1: ( ( rule__Connector__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:941:1: ( rule__Connector__TypeAssignment_1 )
            {
             before(grammarAccess.getConnectorAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:942:1: ( rule__Connector__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:942:2: rule__Connector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Connector__TypeAssignment_1_in_rule__Connector__Group__1__Impl1860);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:952:1: rule__Connector__Group__2 : rule__Connector__Group__2__Impl rule__Connector__Group__3 ;
    public final void rule__Connector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:956:1: ( rule__Connector__Group__2__Impl rule__Connector__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:957:2: rule__Connector__Group__2__Impl rule__Connector__Group__3
            {
            pushFollow(FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__21890);
            rule__Connector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__21893);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:964:1: rule__Connector__Group__2__Impl : ( ( rule__Connector__NameAssignment_2 ) ) ;
    public final void rule__Connector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:968:1: ( ( ( rule__Connector__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:969:1: ( ( rule__Connector__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:969:1: ( ( rule__Connector__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:970:1: ( rule__Connector__NameAssignment_2 )
            {
             before(grammarAccess.getConnectorAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:971:1: ( rule__Connector__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:971:2: rule__Connector__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Connector__NameAssignment_2_in_rule__Connector__Group__2__Impl1920);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:981:1: rule__Connector__Group__3 : rule__Connector__Group__3__Impl rule__Connector__Group__4 ;
    public final void rule__Connector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:985:1: ( rule__Connector__Group__3__Impl rule__Connector__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:986:2: rule__Connector__Group__3__Impl rule__Connector__Group__4
            {
            pushFollow(FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__31950);
            rule__Connector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__31953);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:993:1: rule__Connector__Group__3__Impl : ( ':' ) ;
    public final void rule__Connector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:997:1: ( ( ':' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:998:1: ( ':' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:998:1: ( ':' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:999:1: ':'
            {
             before(grammarAccess.getConnectorAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Connector__Group__3__Impl1981); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1012:1: rule__Connector__Group__4 : rule__Connector__Group__4__Impl rule__Connector__Group__5 ;
    public final void rule__Connector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1016:1: ( rule__Connector__Group__4__Impl rule__Connector__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1017:2: rule__Connector__Group__4__Impl rule__Connector__Group__5
            {
            pushFollow(FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__42012);
            rule__Connector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__5_in_rule__Connector__Group__42015);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1024:1: rule__Connector__Group__4__Impl : ( ( rule__Connector__Int1Assignment_4 ) ) ;
    public final void rule__Connector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1028:1: ( ( ( rule__Connector__Int1Assignment_4 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1029:1: ( ( rule__Connector__Int1Assignment_4 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1029:1: ( ( rule__Connector__Int1Assignment_4 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1030:1: ( rule__Connector__Int1Assignment_4 )
            {
             before(grammarAccess.getConnectorAccess().getInt1Assignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1031:1: ( rule__Connector__Int1Assignment_4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1031:2: rule__Connector__Int1Assignment_4
            {
            pushFollow(FOLLOW_rule__Connector__Int1Assignment_4_in_rule__Connector__Group__4__Impl2042);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1041:1: rule__Connector__Group__5 : rule__Connector__Group__5__Impl rule__Connector__Group__6 ;
    public final void rule__Connector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1045:1: ( rule__Connector__Group__5__Impl rule__Connector__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1046:2: rule__Connector__Group__5__Impl rule__Connector__Group__6
            {
            pushFollow(FOLLOW_rule__Connector__Group__5__Impl_in_rule__Connector__Group__52072);
            rule__Connector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Connector__Group__6_in_rule__Connector__Group__52075);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1053:1: rule__Connector__Group__5__Impl : ( 'to' ) ;
    public final void rule__Connector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1057:1: ( ( 'to' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1058:1: ( 'to' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1058:1: ( 'to' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1059:1: 'to'
            {
             before(grammarAccess.getConnectorAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Connector__Group__5__Impl2103); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1072:1: rule__Connector__Group__6 : rule__Connector__Group__6__Impl ;
    public final void rule__Connector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1076:1: ( rule__Connector__Group__6__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1077:2: rule__Connector__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Connector__Group__6__Impl_in_rule__Connector__Group__62134);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1083:1: rule__Connector__Group__6__Impl : ( ( rule__Connector__Int2Assignment_6 ) ) ;
    public final void rule__Connector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1087:1: ( ( ( rule__Connector__Int2Assignment_6 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1088:1: ( ( rule__Connector__Int2Assignment_6 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1088:1: ( ( rule__Connector__Int2Assignment_6 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1089:1: ( rule__Connector__Int2Assignment_6 )
            {
             before(grammarAccess.getConnectorAccess().getInt2Assignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1090:1: ( rule__Connector__Int2Assignment_6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1090:2: rule__Connector__Int2Assignment_6
            {
            pushFollow(FOLLOW_rule__Connector__Int2Assignment_6_in_rule__Connector__Group__6__Impl2161);
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


    // $ANTLR start "rule__Dependency__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1114:1: rule__Dependency__Group__0 : rule__Dependency__Group__0__Impl rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1118:1: ( rule__Dependency__Group__0__Impl rule__Dependency__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1119:2: rule__Dependency__Group__0__Impl rule__Dependency__Group__1
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02205);
            rule__Dependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02208);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1126:1: rule__Dependency__Group__0__Impl : ( 'dependency' ) ;
    public final void rule__Dependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1130:1: ( ( 'dependency' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1131:1: ( 'dependency' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1131:1: ( 'dependency' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1132:1: 'dependency'
            {
             before(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Dependency__Group__0__Impl2236); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1145:1: rule__Dependency__Group__1 : rule__Dependency__Group__1__Impl rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1149:1: ( rule__Dependency__Group__1__Impl rule__Dependency__Group__2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1150:2: rule__Dependency__Group__1__Impl rule__Dependency__Group__2
            {
            pushFollow(FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12267);
            rule__Dependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__12270);
            rule__Dependency__Group__2();

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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1157:1: rule__Dependency__Group__1__Impl : ( ( rule__Dependency__TypeAssignment_1 ) ) ;
    public final void rule__Dependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1161:1: ( ( ( rule__Dependency__TypeAssignment_1 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1162:1: ( ( rule__Dependency__TypeAssignment_1 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1162:1: ( ( rule__Dependency__TypeAssignment_1 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1163:1: ( rule__Dependency__TypeAssignment_1 )
            {
             before(grammarAccess.getDependencyAccess().getTypeAssignment_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1164:1: ( rule__Dependency__TypeAssignment_1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1164:2: rule__Dependency__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Dependency__TypeAssignment_1_in_rule__Dependency__Group__1__Impl2297);
            rule__Dependency__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Dependency__Group__2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1174:1: rule__Dependency__Group__2 : rule__Dependency__Group__2__Impl rule__Dependency__Group__3 ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1178:1: ( rule__Dependency__Group__2__Impl rule__Dependency__Group__3 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1179:2: rule__Dependency__Group__2__Impl rule__Dependency__Group__3
            {
            pushFollow(FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__22327);
            rule__Dependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__3_in_rule__Dependency__Group__22330);
            rule__Dependency__Group__3();

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
    // $ANTLR end "rule__Dependency__Group__2"


    // $ANTLR start "rule__Dependency__Group__2__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1186:1: rule__Dependency__Group__2__Impl : ( ( rule__Dependency__NameAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1190:1: ( ( ( rule__Dependency__NameAssignment_2 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1191:1: ( ( rule__Dependency__NameAssignment_2 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1191:1: ( ( rule__Dependency__NameAssignment_2 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1192:1: ( rule__Dependency__NameAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getNameAssignment_2()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1193:1: ( rule__Dependency__NameAssignment_2 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1193:2: rule__Dependency__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__NameAssignment_2_in_rule__Dependency__Group__2__Impl2357);
            rule__Dependency__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__2__Impl"


    // $ANTLR start "rule__Dependency__Group__3"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1203:1: rule__Dependency__Group__3 : rule__Dependency__Group__3__Impl rule__Dependency__Group__4 ;
    public final void rule__Dependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1207:1: ( rule__Dependency__Group__3__Impl rule__Dependency__Group__4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1208:2: rule__Dependency__Group__3__Impl rule__Dependency__Group__4
            {
            pushFollow(FOLLOW_rule__Dependency__Group__3__Impl_in_rule__Dependency__Group__32387);
            rule__Dependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__4_in_rule__Dependency__Group__32390);
            rule__Dependency__Group__4();

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
    // $ANTLR end "rule__Dependency__Group__3"


    // $ANTLR start "rule__Dependency__Group__3__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1215:1: rule__Dependency__Group__3__Impl : ( ':' ) ;
    public final void rule__Dependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1219:1: ( ( ':' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1220:1: ( ':' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1220:1: ( ':' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1221:1: ':'
            {
             before(grammarAccess.getDependencyAccess().getColonKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Dependency__Group__3__Impl2418); 
             after(grammarAccess.getDependencyAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__3__Impl"


    // $ANTLR start "rule__Dependency__Group__4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1234:1: rule__Dependency__Group__4 : rule__Dependency__Group__4__Impl rule__Dependency__Group__5 ;
    public final void rule__Dependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1238:1: ( rule__Dependency__Group__4__Impl rule__Dependency__Group__5 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1239:2: rule__Dependency__Group__4__Impl rule__Dependency__Group__5
            {
            pushFollow(FOLLOW_rule__Dependency__Group__4__Impl_in_rule__Dependency__Group__42449);
            rule__Dependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__5_in_rule__Dependency__Group__42452);
            rule__Dependency__Group__5();

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
    // $ANTLR end "rule__Dependency__Group__4"


    // $ANTLR start "rule__Dependency__Group__4__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1246:1: rule__Dependency__Group__4__Impl : ( ( rule__Dependency__Component1Assignment_4 ) ) ;
    public final void rule__Dependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1250:1: ( ( ( rule__Dependency__Component1Assignment_4 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1251:1: ( ( rule__Dependency__Component1Assignment_4 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1251:1: ( ( rule__Dependency__Component1Assignment_4 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1252:1: ( rule__Dependency__Component1Assignment_4 )
            {
             before(grammarAccess.getDependencyAccess().getComponent1Assignment_4()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1253:1: ( rule__Dependency__Component1Assignment_4 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1253:2: rule__Dependency__Component1Assignment_4
            {
            pushFollow(FOLLOW_rule__Dependency__Component1Assignment_4_in_rule__Dependency__Group__4__Impl2479);
            rule__Dependency__Component1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getComponent1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__4__Impl"


    // $ANTLR start "rule__Dependency__Group__5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1263:1: rule__Dependency__Group__5 : rule__Dependency__Group__5__Impl rule__Dependency__Group__6 ;
    public final void rule__Dependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1267:1: ( rule__Dependency__Group__5__Impl rule__Dependency__Group__6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1268:2: rule__Dependency__Group__5__Impl rule__Dependency__Group__6
            {
            pushFollow(FOLLOW_rule__Dependency__Group__5__Impl_in_rule__Dependency__Group__52509);
            rule__Dependency__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dependency__Group__6_in_rule__Dependency__Group__52512);
            rule__Dependency__Group__6();

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
    // $ANTLR end "rule__Dependency__Group__5"


    // $ANTLR start "rule__Dependency__Group__5__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1275:1: rule__Dependency__Group__5__Impl : ( 'to' ) ;
    public final void rule__Dependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1279:1: ( ( 'to' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1280:1: ( 'to' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1280:1: ( 'to' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1281:1: 'to'
            {
             before(grammarAccess.getDependencyAccess().getToKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Dependency__Group__5__Impl2540); 
             after(grammarAccess.getDependencyAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__5__Impl"


    // $ANTLR start "rule__Dependency__Group__6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1294:1: rule__Dependency__Group__6 : rule__Dependency__Group__6__Impl ;
    public final void rule__Dependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1298:1: ( rule__Dependency__Group__6__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1299:2: rule__Dependency__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Dependency__Group__6__Impl_in_rule__Dependency__Group__62571);
            rule__Dependency__Group__6__Impl();

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
    // $ANTLR end "rule__Dependency__Group__6"


    // $ANTLR start "rule__Dependency__Group__6__Impl"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1305:1: rule__Dependency__Group__6__Impl : ( ( rule__Dependency__Component2Assignment_6 ) ) ;
    public final void rule__Dependency__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1309:1: ( ( ( rule__Dependency__Component2Assignment_6 ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1310:1: ( ( rule__Dependency__Component2Assignment_6 ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1310:1: ( ( rule__Dependency__Component2Assignment_6 ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1311:1: ( rule__Dependency__Component2Assignment_6 )
            {
             before(grammarAccess.getDependencyAccess().getComponent2Assignment_6()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1312:1: ( rule__Dependency__Component2Assignment_6 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1312:2: rule__Dependency__Component2Assignment_6
            {
            pushFollow(FOLLOW_rule__Dependency__Component2Assignment_6_in_rule__Dependency__Group__6__Impl2598);
            rule__Dependency__Component2Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getComponent2Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Group__6__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1336:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1340:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1341:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02642);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02645);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1348:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1352:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1353:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1353:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1354:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2672); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1365:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1369:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1370:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12701);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1376:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1380:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1381:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1381:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1382:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1383:1: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1383:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2728);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1397:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1401:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1402:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02763);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02766);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1409:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1413:1: ( ( '.' ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1414:1: ( '.' )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1414:1: ( '.' )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1415:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__QualifiedName__Group_1__0__Impl2794); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1428:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1432:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1433:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12825);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1439:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1443:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1444:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1444:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1445:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2852); 
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


    // $ANTLR start "rule__Model__ComponentsAssignment"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1461:1: rule__Model__ComponentsAssignment : ( ruleComponent ) ;
    public final void rule__Model__ComponentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1465:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1466:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1466:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1467:1: ruleComponent
            {
             before(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Model__ComponentsAssignment2890);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ComponentsAssignment"


    // $ANTLR start "rule__Component__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1476:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1480:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1481:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1481:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1482:1: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12921); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1491:1: rule__Component__PortsAssignment_3 : ( rulePort ) ;
    public final void rule__Component__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1495:1: ( ( rulePort ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1496:1: ( rulePort )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1496:1: ( rulePort )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1497:1: rulePort
            {
             before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Component__PortsAssignment_32952);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1506:1: rule__Component__InterfacesAssignment_4 : ( ruleInterface ) ;
    public final void rule__Component__InterfacesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1510:1: ( ( ruleInterface ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1511:1: ( ruleInterface )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1511:1: ( ruleInterface )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1512:1: ruleInterface
            {
             before(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_42983);
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


    // $ANTLR start "rule__Component__ComponentsAssignment_5"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1521:1: rule__Component__ComponentsAssignment_5 : ( ruleComponent ) ;
    public final void rule__Component__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1525:1: ( ( ruleComponent ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1526:1: ( ruleComponent )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1526:1: ( ruleComponent )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1527:1: ruleComponent
            {
             before(grammarAccess.getComponentAccess().getComponentsComponentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleComponent_in_rule__Component__ComponentsAssignment_53014);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getComponentsComponentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ComponentsAssignment_5"


    // $ANTLR start "rule__Component__ConnectorsAssignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1536:1: rule__Component__ConnectorsAssignment_6 : ( ruleConnector ) ;
    public final void rule__Component__ConnectorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1540:1: ( ( ruleConnector ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1541:1: ( ruleConnector )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1541:1: ( ruleConnector )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1542:1: ruleConnector
            {
             before(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleConnector_in_rule__Component__ConnectorsAssignment_63045);
            ruleConnector();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ConnectorsAssignment_6"


    // $ANTLR start "rule__Component__DependenciesAssignment_7"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1551:1: rule__Component__DependenciesAssignment_7 : ( ruleDependency ) ;
    public final void rule__Component__DependenciesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1555:1: ( ( ruleDependency ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1556:1: ( ruleDependency )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1556:1: ( ruleDependency )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1557:1: ruleDependency
            {
             before(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Component__DependenciesAssignment_73076);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__DependenciesAssignment_7"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1566:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1570:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1571:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1571:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1572:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_13107); 
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


    // $ANTLR start "rule__Interface__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1581:1: rule__Interface__TypeAssignment_1 : ( ruleInterfaceType ) ;
    public final void rule__Interface__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1585:1: ( ( ruleInterfaceType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1586:1: ( ruleInterfaceType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1586:1: ( ruleInterfaceType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1587:1: ruleInterfaceType
            {
             before(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_rule__Interface__TypeAssignment_13138);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1596:1: rule__Interface__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1600:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1601:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1601:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1602:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_23169); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1611:1: rule__Interface__PortAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__PortAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1615:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1616:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1616:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1617:1: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1618:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1619:1: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getPortPortIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Interface__PortAssignment_43204); 
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


    // $ANTLR start "rule__Connector__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1630:1: rule__Connector__TypeAssignment_1 : ( ruleConnectorType ) ;
    public final void rule__Connector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1634:1: ( ( ruleConnectorType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1635:1: ( ruleConnectorType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1635:1: ( ruleConnectorType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1636:1: ruleConnectorType
            {
             before(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConnectorType_in_rule__Connector__TypeAssignment_13239);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1645:1: rule__Connector__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Connector__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1649:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1650:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1650:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1651:1: RULE_ID
            {
             before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_23270); 
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1660:1: rule__Connector__Int1Assignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__Int1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1664:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1665:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1665:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1666:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorAccess().getInt1InterfaceCrossReference_4_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1667:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1668:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectorAccess().getInt1InterfaceQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Connector__Int1Assignment_43305);
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
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1679:1: rule__Connector__Int2Assignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Connector__Int2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1683:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1684:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1684:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1685:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getConnectorAccess().getInt2InterfaceCrossReference_6_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1686:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1687:1: ruleQualifiedName
            {
             before(grammarAccess.getConnectorAccess().getInt2InterfaceQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Connector__Int2Assignment_63344);
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


    // $ANTLR start "rule__Dependency__TypeAssignment_1"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1698:1: rule__Dependency__TypeAssignment_1 : ( ruleDependencyType ) ;
    public final void rule__Dependency__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1702:1: ( ( ruleDependencyType ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1703:1: ( ruleDependencyType )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1703:1: ( ruleDependencyType )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1704:1: ruleDependencyType
            {
             before(grammarAccess.getDependencyAccess().getTypeDependencyTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDependencyType_in_rule__Dependency__TypeAssignment_13379);
            ruleDependencyType();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getTypeDependencyTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__TypeAssignment_1"


    // $ANTLR start "rule__Dependency__NameAssignment_2"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1713:1: rule__Dependency__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Dependency__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1717:1: ( ( RULE_ID ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1718:1: ( RULE_ID )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1718:1: ( RULE_ID )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1719:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__NameAssignment_23410); 
             after(grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__NameAssignment_2"


    // $ANTLR start "rule__Dependency__Component1Assignment_4"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1728:1: rule__Dependency__Component1Assignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__Component1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1732:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1733:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1733:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1734:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getComponent1InterfaceCrossReference_4_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1735:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1736:1: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getComponent1InterfaceQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Dependency__Component1Assignment_43445);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getComponent1InterfaceQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getComponent1InterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Component1Assignment_4"


    // $ANTLR start "rule__Dependency__Component2Assignment_6"
    // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1747:1: rule__Dependency__Component2Assignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Dependency__Component2Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1751:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1752:1: ( ( ruleQualifiedName ) )
            {
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1752:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1753:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getDependencyAccess().getComponent2InterfaceCrossReference_6_0()); 
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1754:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes.ui/src-gen/org/xtext/example/compoNantes/ui/contentassist/antlr/internal/InternalCompoNantes.g:1755:1: ruleQualifiedName
            {
             before(grammarAccess.getDependencyAccess().getComponent2InterfaceQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Dependency__Component2Assignment_63484);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getComponent2InterfaceQualifiedNameParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getComponent2InterfaceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Component2Assignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ComponentsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0_in_ruleComponent155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0_in_ruleInterface275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0_in_ruleConnector335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__Alternatives_in_ruleInterfaceType492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectorType__Alternatives_in_ruleConnectorType528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyType__Alternatives_in_ruleDependencyType564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceType__Alternatives600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceType__Alternatives621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConnectorType__Alternatives657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConnectorType__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DependencyType__Alternatives714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DependencyType__Alternatives735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__0__Impl_in_rule__Component__Group__0768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Component__Group__1_in_rule__Component__Group__0771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Component__Group__0__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__1__Impl_in_rule__Component__Group__1830 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Component__Group__2_in_rule__Component__Group__1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__NameAssignment_1_in_rule__Component__Group__1__Impl860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__2__Impl_in_rule__Component__Group__2890 = new BitSet(new long[]{0x00000000027A0000L});
    public static final BitSet FOLLOW_rule__Component__Group__3_in_rule__Component__Group__2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Component__Group__2__Impl921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__Group__3__Impl_in_rule__Component__Group__3952 = new BitSet(new long[]{0x00000000027A0000L});
    public static final BitSet FOLLOW_rule__Component__Group__4_in_rule__Component__Group__3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__PortsAssignment_3_in_rule__Component__Group__3__Impl982 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Component__Group__4__Impl_in_rule__Component__Group__41013 = new BitSet(new long[]{0x00000000027A0000L});
    public static final BitSet FOLLOW_rule__Component__Group__5_in_rule__Component__Group__41016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__InterfacesAssignment_4_in_rule__Component__Group__4__Impl1043 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Component__Group__5__Impl_in_rule__Component__Group__51074 = new BitSet(new long[]{0x00000000027A0000L});
    public static final BitSet FOLLOW_rule__Component__Group__6_in_rule__Component__Group__51077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ComponentsAssignment_5_in_rule__Component__Group__5__Impl1104 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Component__Group__6__Impl_in_rule__Component__Group__61135 = new BitSet(new long[]{0x00000000027A0000L});
    public static final BitSet FOLLOW_rule__Component__Group__7_in_rule__Component__Group__61138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__ConnectorsAssignment_6_in_rule__Component__Group__6__Impl1165 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Component__Group__7__Impl_in_rule__Component__Group__71196 = new BitSet(new long[]{0x00000000027A0000L});
    public static final BitSet FOLLOW_rule__Component__Group__8_in_rule__Component__Group__71199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Component__DependenciesAssignment_7_in_rule__Component__Group__7__Impl1226 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Component__Group__8__Impl_in_rule__Component__Group__81257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Component__Group__8__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__01334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__01337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Port__Group__0__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__11396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__0__Impl_in_rule__Interface__Group__01457 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Interface__Group__1_in_rule__Interface__Group__01460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Interface__Group__0__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__1__Impl_in_rule__Interface__Group__11519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__2_in_rule__Interface__Group__11522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__TypeAssignment_1_in_rule__Interface__Group__1__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__2__Impl_in_rule__Interface__Group__21579 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Interface__Group__3_in_rule__Interface__Group__21582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__NameAssignment_2_in_rule__Interface__Group__2__Impl1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__3__Impl_in_rule__Interface__Group__31639 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Interface__Group__4_in_rule__Interface__Group__31642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Interface__Group__3__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__Group__4__Impl_in_rule__Interface__Group__41701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Interface__PortAssignment_4_in_rule__Interface__Group__4__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__0__Impl_in_rule__Connector__Group__01768 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Connector__Group__1_in_rule__Connector__Group__01771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Connector__Group__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__1__Impl_in_rule__Connector__Group__11830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__2_in_rule__Connector__Group__11833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__TypeAssignment_1_in_rule__Connector__Group__1__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__2__Impl_in_rule__Connector__Group__21890 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Connector__Group__3_in_rule__Connector__Group__21893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__NameAssignment_2_in_rule__Connector__Group__2__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__3__Impl_in_rule__Connector__Group__31950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__4_in_rule__Connector__Group__31953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Connector__Group__3__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__4__Impl_in_rule__Connector__Group__42012 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Connector__Group__5_in_rule__Connector__Group__42015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Int1Assignment_4_in_rule__Connector__Group__4__Impl2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__5__Impl_in_rule__Connector__Group__52072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Connector__Group__6_in_rule__Connector__Group__52075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Connector__Group__5__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Group__6__Impl_in_rule__Connector__Group__62134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Connector__Int2Assignment_6_in_rule__Connector__Group__6__Impl2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0__Impl_in_rule__Dependency__Group__02205 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Dependency__Group__0__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1__Impl_in_rule__Dependency__Group__12267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__TypeAssignment_1_in_rule__Dependency__Group__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2__Impl_in_rule__Dependency__Group__22327 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__3_in_rule__Dependency__Group__22330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__NameAssignment_2_in_rule__Dependency__Group__2__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__3__Impl_in_rule__Dependency__Group__32387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__4_in_rule__Dependency__Group__32390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Dependency__Group__3__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__4__Impl_in_rule__Dependency__Group__42449 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__5_in_rule__Dependency__Group__42452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Component1Assignment_4_in_rule__Dependency__Group__4__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__5__Impl_in_rule__Dependency__Group__52509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__6_in_rule__Dependency__Group__52512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Dependency__Group__5__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__6__Impl_in_rule__Dependency__Group__62571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Component2Assignment_6_in_rule__Dependency__Group__6__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02642 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2728 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QualifiedName__Group_1__0__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Model__ComponentsAssignment2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Component__NameAssignment_12921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Component__PortsAssignment_32952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_rule__Component__InterfacesAssignment_42983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_rule__Component__ComponentsAssignment_53014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_rule__Component__ConnectorsAssignment_63045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Component__DependenciesAssignment_73076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_13107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_rule__Interface__TypeAssignment_13138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__NameAssignment_23169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Interface__PortAssignment_43204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectorType_in_rule__Connector__TypeAssignment_13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Connector__NameAssignment_23270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connector__Int1Assignment_43305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Connector__Int2Assignment_63344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyType_in_rule__Dependency__TypeAssignment_13379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__NameAssignment_23410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Dependency__Component1Assignment_43445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Dependency__Component2Assignment_63484 = new BitSet(new long[]{0x0000000000000002L});

}