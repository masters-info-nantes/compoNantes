package org.xtext.example.compoNantes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.compoNantes.services.CompoNantesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCompoNantesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'subsystem'", "'{'", "'}'", "'component'", "'connector'", "':'", "'to'", "'interface'", "'port'", "'dependency'", "'usage'", "'.'", "'required'", "'provided'", "'assembly'", "'delegation'"
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
    public String getGrammarFileName() { return "../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g"; }



     	private CompoNantesGrammarAccess grammarAccess;
     	
        public InternalCompoNantesParser(TokenStream input, CompoNantesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected CompoNantesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent ) ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_subsystem_0_1 = null;

        EObject lv_subsystem_0_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:80:28: ( ( ( (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent ) ) )* )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:81:1: ( ( (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent ) ) )*
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:81:1: ( ( (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:82:1: ( (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent ) )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:82:1: ( (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent ) )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:83:1: (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:83:1: (lv_subsystem_0_1= ruleSubSystem | lv_subsystem_0_2= ruleComponent )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:84:3: lv_subsystem_0_1= ruleSubSystem
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getSubsystemSubSystemParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleSubSystem_in_ruleModel132);
            	            lv_subsystem_0_1=ruleSubSystem();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"subsystem",
            	                    		lv_subsystem_0_1, 
            	                    		"SubSystem");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:99:8: lv_subsystem_0_2= ruleComponent
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getSubsystemComponentParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleComponent_in_ruleModel151);
            	            lv_subsystem_0_2=ruleComponent();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"subsystem",
            	                    		lv_subsystem_0_2, 
            	                    		"Component");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleSubSystem"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:125:1: entryRuleSubSystem returns [EObject current=null] : iv_ruleSubSystem= ruleSubSystem EOF ;
    public final EObject entryRuleSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSystem = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:126:2: (iv_ruleSubSystem= ruleSubSystem EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:127:2: iv_ruleSubSystem= ruleSubSystem EOF
            {
             newCompositeNode(grammarAccess.getSubSystemRule()); 
            pushFollow(FOLLOW_ruleSubSystem_in_entryRuleSubSystem190);
            iv_ruleSubSystem=ruleSubSystem();

            state._fsp--;

             current =iv_ruleSubSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubSystem200); 

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
    // $ANTLR end "entryRuleSubSystem"


    // $ANTLR start "ruleSubSystem"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:134:1: ruleSubSystem returns [EObject current=null] : (otherlv_0= 'subsystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_dependencies_6_0= ruleDependency ) )* ( (lv_usages_7_0= ruleUsage ) )* ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' ) ;
    public final EObject ruleSubSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_ports_3_0 = null;

        EObject lv_interfaces_4_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_dependencies_6_0 = null;

        EObject lv_usages_7_0 = null;

        EObject lv_connectors_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:137:28: ( (otherlv_0= 'subsystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_dependencies_6_0= ruleDependency ) )* ( (lv_usages_7_0= ruleUsage ) )* ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:138:1: (otherlv_0= 'subsystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_dependencies_6_0= ruleDependency ) )* ( (lv_usages_7_0= ruleUsage ) )* ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:138:1: (otherlv_0= 'subsystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_dependencies_6_0= ruleDependency ) )* ( (lv_usages_7_0= ruleUsage ) )* ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:138:3: otherlv_0= 'subsystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_dependencies_6_0= ruleDependency ) )* ( (lv_usages_7_0= ruleUsage ) )* ( (lv_connectors_8_0= ruleConnector ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSubSystem237); 

                	newLeafNode(otherlv_0, grammarAccess.getSubSystemAccess().getSubsystemKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:142:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:143:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:143:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:144:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubSystem254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSubSystem271); 

                	newLeafNode(otherlv_2, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:164:1: ( (lv_ports_3_0= rulePort ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:165:1: (lv_ports_3_0= rulePort )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:165:1: (lv_ports_3_0= rulePort )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:166:3: lv_ports_3_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSystemAccess().getPortsPortParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleSubSystem292);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ports",
            	            		lv_ports_3_0, 
            	            		"Port");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:182:3: ( (lv_interfaces_4_0= ruleInterface ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:183:1: (lv_interfaces_4_0= ruleInterface )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:183:1: (lv_interfaces_4_0= ruleInterface )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:184:3: lv_interfaces_4_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSystemAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleSubSystem314);
            	    lv_interfaces_4_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_4_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:200:3: ( (lv_components_5_0= ruleComponent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:201:1: (lv_components_5_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:201:1: (lv_components_5_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:202:3: lv_components_5_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSystemAccess().getComponentsComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleSubSystem336);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_5_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:218:3: ( (lv_dependencies_6_0= ruleDependency ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:219:1: (lv_dependencies_6_0= ruleDependency )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:219:1: (lv_dependencies_6_0= ruleDependency )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:220:3: lv_dependencies_6_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSystemAccess().getDependenciesDependencyParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleSubSystem358);
            	    lv_dependencies_6_0=ruleDependency();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependencies",
            	            		lv_dependencies_6_0, 
            	            		"Dependency");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:236:3: ( (lv_usages_7_0= ruleUsage ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:237:1: (lv_usages_7_0= ruleUsage )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:237:1: (lv_usages_7_0= ruleUsage )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:238:3: lv_usages_7_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSystemAccess().getUsagesUsageParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_ruleSubSystem380);
            	    lv_usages_7_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usages",
            	            		lv_usages_7_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:254:3: ( (lv_connectors_8_0= ruleConnector ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:255:1: (lv_connectors_8_0= ruleConnector )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:255:1: (lv_connectors_8_0= ruleConnector )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:256:3: lv_connectors_8_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubSystemAccess().getConnectorsConnectorParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleSubSystem402);
            	    lv_connectors_8_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectors",
            	            		lv_connectors_8_0, 
            	            		"Connector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleSubSystem415); 

                	newLeafNode(otherlv_9, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleSubSystem"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:284:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:285:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:286:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent451);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent461); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:293:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_usages_6_0= ruleUsage ) )* ( (lv_connectors_7_0= ruleConnector ) )* otherlv_8= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_ports_3_0 = null;

        EObject lv_interfaces_4_0 = null;

        EObject lv_dependencies_5_0 = null;

        EObject lv_usages_6_0 = null;

        EObject lv_connectors_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:296:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_usages_6_0= ruleUsage ) )* ( (lv_connectors_7_0= ruleConnector ) )* otherlv_8= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:297:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_usages_6_0= ruleUsage ) )* ( (lv_connectors_7_0= ruleConnector ) )* otherlv_8= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:297:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_usages_6_0= ruleUsage ) )* ( (lv_connectors_7_0= ruleConnector ) )* otherlv_8= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:297:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_dependencies_5_0= ruleDependency ) )* ( (lv_usages_6_0= ruleUsage ) )* ( (lv_connectors_7_0= ruleConnector ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComponent498); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:301:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:302:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:302:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:303:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent515); 

            			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponent532); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:323:1: ( (lv_ports_3_0= rulePort ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:324:1: (lv_ports_3_0= rulePort )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:324:1: (lv_ports_3_0= rulePort )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:325:3: lv_ports_3_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleComponent553);
            	    lv_ports_3_0=rulePort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ports",
            	            		lv_ports_3_0, 
            	            		"Port");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:341:3: ( (lv_interfaces_4_0= ruleInterface ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:342:1: (lv_interfaces_4_0= ruleInterface )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:342:1: (lv_interfaces_4_0= ruleInterface )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:343:3: lv_interfaces_4_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleComponent575);
            	    lv_interfaces_4_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_4_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:359:3: ( (lv_dependencies_5_0= ruleDependency ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:360:1: (lv_dependencies_5_0= ruleDependency )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:360:1: (lv_dependencies_5_0= ruleDependency )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:361:3: lv_dependencies_5_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleComponent597);
            	    lv_dependencies_5_0=ruleDependency();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependencies",
            	            		lv_dependencies_5_0, 
            	            		"Dependency");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:377:3: ( (lv_usages_6_0= ruleUsage ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:378:1: (lv_usages_6_0= ruleUsage )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:378:1: (lv_usages_6_0= ruleUsage )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:379:3: lv_usages_6_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_ruleComponent619);
            	    lv_usages_6_0=ruleUsage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"usages",
            	            		lv_usages_6_0, 
            	            		"Usage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:395:3: ( (lv_connectors_7_0= ruleConnector ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:396:1: (lv_connectors_7_0= ruleConnector )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:396:1: (lv_connectors_7_0= ruleConnector )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:397:3: lv_connectors_7_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleComponent641);
            	    lv_connectors_7_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectors",
            	            		lv_connectors_7_0, 
            	            		"Connector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleComponent654); 

                	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:425:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:426:2: (iv_ruleConnector= ruleConnector EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:427:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector690);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector700); 

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
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:434:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= 'to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:437:28: ( (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= 'to' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:438:1: (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= 'to' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:438:1: (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= 'to' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:438:3: otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( ( ruleQualifiedName ) ) otherlv_5= 'to' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleConnector737); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:442:1: ( (lv_type_1_0= ruleConnectorType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:443:1: (lv_type_1_0= ruleConnectorType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:443:1: (lv_type_1_0= ruleConnectorType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:444:3: lv_type_1_0= ruleConnectorType
            {
             
            	        newCompositeNode(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectorType_in_ruleConnector758);
            lv_type_1_0=ruleConnectorType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConnectorRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ConnectorType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:460:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:461:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:461:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:462:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector775); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConnector792); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getColonKeyword_3());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:482:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:483:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:483:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:484:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectorAccess().getInt1InterfaceCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnector815);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleConnector827); 

                	newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getToKeyword_5());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:501:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:502:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:502:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:503:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectorAccess().getInt2InterfaceCrossReference_6_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnector850);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:524:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:525:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:526:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface886);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface896); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:533:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:536:28: ( (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:537:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:537:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:537:3: otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleInterface933); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:541:1: ( (lv_type_1_0= ruleInterfaceType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:542:1: (lv_type_1_0= ruleInterfaceType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:542:1: (lv_type_1_0= ruleInterfaceType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:543:3: lv_type_1_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceType_in_ruleInterface954);
            lv_type_1_0=ruleInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"InterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:559:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:560:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:560:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:561:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface971); 

            			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleInterface988); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getPortKeyword_3());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:581:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:582:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:582:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:583:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1008); 

            		newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); 
            	

            }


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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:602:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:603:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:604:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort1044);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort1054); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:611:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:614:28: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:615:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:615:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:615:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePort1091); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:619:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:620:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:620:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:621:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1108); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleDependency"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:645:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:646:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:647:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency1149);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency1159); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:654:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependency' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:657:28: ( (otherlv_0= 'dependency' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:658:1: (otherlv_0= 'dependency' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:658:1: (otherlv_0= 'dependency' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:658:3: otherlv_0= 'dependency' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDependency1196); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:662:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:663:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:663:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:664:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getComponentElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency1219);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleUsage"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:685:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:686:2: (iv_ruleUsage= ruleUsage EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:687:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage1255);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage1265); 

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
    // $ANTLR end "entryRuleUsage"


    // $ANTLR start "ruleUsage"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:694:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'usage' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:697:28: ( (otherlv_0= 'usage' ( ( ruleQualifiedName ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:698:1: (otherlv_0= 'usage' ( ( ruleQualifiedName ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:698:1: (otherlv_0= 'usage' ( ( ruleQualifiedName ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:698:3: otherlv_0= 'usage' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleUsage1302); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:702:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:703:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:703:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:704:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getUsageAccess().getInterfaceInterfaceCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleUsage1325);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleUsage"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:727:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:728:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:729:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1364);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1375); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:736:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:739:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:740:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:740:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:740:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1415); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:747:1: (kw= '.' this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:748:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1434); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1449); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleInterfaceType"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:768:1: ruleInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) ;
    public final Enumerator ruleInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:770:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:771:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:771:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==24) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:771:2: (enumLiteral_0= 'required' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:771:2: (enumLiteral_0= 'required' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:771:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleInterfaceType1510); 

                            current = grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:777:6: (enumLiteral_1= 'provided' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:777:6: (enumLiteral_1= 'provided' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:777:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleInterfaceType1527); 

                            current = grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "ruleConnectorType"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:787:1: ruleConnectorType returns [Enumerator current=null] : ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) ) ;
    public final Enumerator ruleConnectorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:789:28: ( ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:790:1: ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:790:1: ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:790:2: (enumLiteral_0= 'assembly' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:790:2: (enumLiteral_0= 'assembly' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:790:4: enumLiteral_0= 'assembly'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleConnectorType1572); 

                            current = grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:796:6: (enumLiteral_1= 'delegation' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:796:6: (enumLiteral_1= 'delegation' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:796:8: enumLiteral_1= 'delegation'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleConnectorType1589); 

                            current = grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleConnectorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubSystem_in_ruleModel132 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleModel151 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleSubSystem_in_entryRuleSubSystem190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubSystem200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSubSystem237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubSystem254 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSubSystem271 = new BitSet(new long[]{0x00000000003CE800L});
    public static final BitSet FOLLOW_rulePort_in_ruleSubSystem292 = new BitSet(new long[]{0x00000000003CE800L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleSubSystem314 = new BitSet(new long[]{0x000000000034E800L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSubSystem336 = new BitSet(new long[]{0x000000000030E800L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleSubSystem358 = new BitSet(new long[]{0x000000000030A000L});
    public static final BitSet FOLLOW_ruleUsage_in_ruleSubSystem380 = new BitSet(new long[]{0x000000000020A000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleSubSystem402 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleSubSystem415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent515 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent532 = new BitSet(new long[]{0x00000000003CA000L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent553 = new BitSet(new long[]{0x00000000003CA000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleComponent575 = new BitSet(new long[]{0x000000000034A000L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleComponent597 = new BitSet(new long[]{0x000000000030A000L});
    public static final BitSet FOLLOW_ruleUsage_in_ruleComponent619 = new BitSet(new long[]{0x000000000020A000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleComponent641 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleComponent654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConnector737 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleConnectorType_in_ruleConnector758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConnector792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnector815 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConnector827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnector850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInterface933 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_ruleInterface954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface971 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInterface988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort1044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePort1091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDependency1196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleUsage1302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUsage1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1415 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1449 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_23_in_ruleInterfaceType1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleInterfaceType1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleConnectorType1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleConnectorType1589 = new BitSet(new long[]{0x0000000000000002L});

}