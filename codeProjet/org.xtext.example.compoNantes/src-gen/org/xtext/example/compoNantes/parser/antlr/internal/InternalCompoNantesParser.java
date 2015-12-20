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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'component'", "'{'", "'}'", "'port'", "'interface'", "'connector'", "'from'", "'to'", "'dependency'", "'.'", "'required'", "'provided'", "'assembly'", "'delegation'", "'usage'", "'association'"
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:77:1: ruleModel returns [EObject current=null] : ( (lv_components_0_0= ruleComponent ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_components_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:80:28: ( ( (lv_components_0_0= ruleComponent ) )* )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:81:1: ( (lv_components_0_0= ruleComponent ) )*
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:81:1: ( (lv_components_0_0= ruleComponent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:82:1: (lv_components_0_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:82:1: (lv_components_0_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:83:3: lv_components_0_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleModel130);
            	    lv_components_0_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_0_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:107:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:108:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:109:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent166);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent176); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:116:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_dependencies_7_0= ruleDependency ) )* otherlv_8= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_ports_3_0 = null;

        EObject lv_interfaces_4_0 = null;

        EObject lv_components_5_0 = null;

        EObject lv_connectors_6_0 = null;

        EObject lv_dependencies_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:119:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_dependencies_7_0= ruleDependency ) )* otherlv_8= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:120:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_dependencies_7_0= ruleDependency ) )* otherlv_8= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:120:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_dependencies_7_0= ruleDependency ) )* otherlv_8= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:120:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= rulePort ) )* ( (lv_interfaces_4_0= ruleInterface ) )* ( (lv_components_5_0= ruleComponent ) )* ( (lv_connectors_6_0= ruleConnector ) )* ( (lv_dependencies_7_0= ruleDependency ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleComponent213); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:125:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:126:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent230); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponent247); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:146:1: ( (lv_ports_3_0= rulePort ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:147:1: (lv_ports_3_0= rulePort )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:147:1: (lv_ports_3_0= rulePort )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:148:3: lv_ports_3_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleComponent268);
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
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:164:3: ( (lv_interfaces_4_0= ruleInterface ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:165:1: (lv_interfaces_4_0= ruleInterface )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:165:1: (lv_interfaces_4_0= ruleInterface )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:166:3: lv_interfaces_4_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleComponent290);
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
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:182:3: ( (lv_components_5_0= ruleComponent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:183:1: (lv_components_5_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:183:1: (lv_components_5_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:184:3: lv_components_5_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getComponentsComponentParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleComponent312);
            	    lv_components_5_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
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
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:200:3: ( (lv_connectors_6_0= ruleConnector ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:201:1: (lv_connectors_6_0= ruleConnector )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:201:1: (lv_connectors_6_0= ruleConnector )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:202:3: lv_connectors_6_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleComponent334);
            	    lv_connectors_6_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectors",
            	            		lv_connectors_6_0, 
            	            		"Connector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:218:3: ( (lv_dependencies_7_0= ruleDependency ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:219:1: (lv_dependencies_7_0= ruleDependency )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:219:1: (lv_dependencies_7_0= ruleDependency )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:220:3: lv_dependencies_7_0= ruleDependency
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependency_in_ruleComponent356);
            	    lv_dependencies_7_0=ruleDependency();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependencies",
            	            		lv_dependencies_7_0, 
            	            		"Dependency");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleComponent369); 

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


    // $ANTLR start "entryRulePort"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:248:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:249:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:250:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort405);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort415); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:257:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:260:28: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:261:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:261:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:261:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePort452); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:265:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:266:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:266:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:267:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort469); 

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


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:291:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:292:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:293:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface510);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface520); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:300:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:303:28: ( (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:304:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:304:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:304:3: otherlv_0= 'interface' ( (lv_type_1_0= ruleInterfaceType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'port' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleInterface557); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:308:1: ( (lv_type_1_0= ruleInterfaceType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:309:1: (lv_type_1_0= ruleInterfaceType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:309:1: (lv_type_1_0= ruleInterfaceType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:310:3: lv_type_1_0= ruleInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleInterfaceType_in_ruleInterface578);
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:326:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:327:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:327:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:328:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface595); 

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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleInterface612); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getPortKeyword_3());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:348:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:349:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:349:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:350:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface632); 

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


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:369:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:370:2: (iv_ruleConnector= ruleConnector EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:371:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector668);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector678); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:378:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:381:28: ( (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:382:1: (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:382:1: (otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:382:3: otherlv_0= 'connector' ( (lv_type_1_0= ruleConnectorType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConnector715); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:386:1: ( (lv_type_1_0= ruleConnectorType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:387:1: (lv_type_1_0= ruleConnectorType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:387:1: (lv_type_1_0= ruleConnectorType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:388:3: lv_type_1_0= ruleConnectorType
            {
             
            	        newCompositeNode(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConnectorType_in_ruleConnector736);
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:404:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:405:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:405:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:406:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector753); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleConnector770); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConnector782); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getFromKeyword_4());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:430:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:431:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:431:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:432:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectorAccess().getInt_fromInterfaceCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnector805);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleConnector817); 

                	newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getToKeyword_6());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:449:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:450:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:450:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:451:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConnectorAccess().getInt_toInterfaceCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleConnector840);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleConnector852); 

                	newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleDependency"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:476:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:477:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:478:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency888);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency898); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:485:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_type_1_0= ruleDependencyType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:488:28: ( (otherlv_0= 'dependency' ( (lv_type_1_0= ruleDependencyType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:489:1: (otherlv_0= 'dependency' ( (lv_type_1_0= ruleDependencyType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:489:1: (otherlv_0= 'dependency' ( (lv_type_1_0= ruleDependencyType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:489:3: otherlv_0= 'dependency' ( (lv_type_1_0= ruleDependencyType ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'from' ( ( ruleQualifiedName ) ) otherlv_6= 'to' ( ( ruleQualifiedName ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDependency935); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:493:1: ( (lv_type_1_0= ruleDependencyType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:494:1: (lv_type_1_0= ruleDependencyType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:494:1: (lv_type_1_0= ruleDependencyType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:495:3: lv_type_1_0= ruleDependencyType
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getTypeDependencyTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyType_in_ruleDependency956);
            lv_type_1_0=ruleDependencyType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependencyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"DependencyType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:511:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:512:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:512:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:513:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency973); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleDependency990); 

                	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDependency1002); 

                	newLeafNode(otherlv_4, grammarAccess.getDependencyAccess().getFromKeyword_4());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:537:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:538:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:538:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:539:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getComponent_fromInterfaceCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency1025);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleDependency1037); 

                	newLeafNode(otherlv_6, grammarAccess.getDependencyAccess().getToKeyword_6());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:556:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:557:1: ( ruleQualifiedName )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:557:1: ( ruleQualifiedName )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:558:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getComponent_toInterfaceCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency1060);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleDependency1072); 

                	newLeafNode(otherlv_8, grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:583:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:584:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:585:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1109);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1120); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:592:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:595:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:596:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:596:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:596:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1160); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:603:1: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:604:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,20,FOLLOW_20_in_ruleQualifiedName1179); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1194); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:624:1: ruleInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) ;
    public final Enumerator ruleInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:626:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:627:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:627:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:627:2: (enumLiteral_0= 'required' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:627:2: (enumLiteral_0= 'required' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:627:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_21_in_ruleInterfaceType1255); 

                            current = grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:633:6: (enumLiteral_1= 'provided' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:633:6: (enumLiteral_1= 'provided' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:633:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_22_in_ruleInterfaceType1272); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:643:1: ruleConnectorType returns [Enumerator current=null] : ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) ) ;
    public final Enumerator ruleConnectorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:645:28: ( ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:646:1: ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:646:1: ( (enumLiteral_0= 'assembly' ) | (enumLiteral_1= 'delegation' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:646:2: (enumLiteral_0= 'assembly' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:646:2: (enumLiteral_0= 'assembly' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:646:4: enumLiteral_0= 'assembly'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleConnectorType1317); 

                            current = grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:652:6: (enumLiteral_1= 'delegation' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:652:6: (enumLiteral_1= 'delegation' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:652:8: enumLiteral_1= 'delegation'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleConnectorType1334); 

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


    // $ANTLR start "ruleDependencyType"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:662:1: ruleDependencyType returns [Enumerator current=null] : ( (enumLiteral_0= 'usage' ) | (enumLiteral_1= 'association' ) ) ;
    public final Enumerator ruleDependencyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:664:28: ( ( (enumLiteral_0= 'usage' ) | (enumLiteral_1= 'association' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:665:1: ( (enumLiteral_0= 'usage' ) | (enumLiteral_1= 'association' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:665:1: ( (enumLiteral_0= 'usage' ) | (enumLiteral_1= 'association' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:665:2: (enumLiteral_0= 'usage' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:665:2: (enumLiteral_0= 'usage' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:665:4: enumLiteral_0= 'usage'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleDependencyType1379); 

                            current = grammarAccess.getDependencyTypeAccess().getUSAGEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDependencyTypeAccess().getUSAGEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:671:6: (enumLiteral_1= 'association' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:671:6: (enumLiteral_1= 'association' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalCompoNantes.g:671:8: enumLiteral_1= 'association'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleDependencyType1396); 

                            current = grammarAccess.getDependencyTypeAccess().getASSOCIATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDependencyTypeAccess().getASSOCIATIONEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleDependencyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleComponent213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent247 = new BitSet(new long[]{0x000000000009E800L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent268 = new BitSet(new long[]{0x000000000009E800L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleComponent290 = new BitSet(new long[]{0x000000000009A800L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleComponent312 = new BitSet(new long[]{0x0000000000092800L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleComponent334 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleComponent356 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleComponent369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePort452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInterface557 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_ruleInterface578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface595 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInterface612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConnector715 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleConnectorType_in_ruleConnector736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector753 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleConnector782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnector805 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConnector817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleConnector840 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConnector852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDependency935 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_ruleDependencyType_in_ruleDependency956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency973 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDependency990 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDependency1002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency1025 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDependency1037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency1060 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDependency1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1160 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleQualifiedName1179 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1194 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_ruleInterfaceType1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInterfaceType1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConnectorType1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConnectorType1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDependencyType1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDependencyType1396 = new BitSet(new long[]{0x0000000000000002L});

}