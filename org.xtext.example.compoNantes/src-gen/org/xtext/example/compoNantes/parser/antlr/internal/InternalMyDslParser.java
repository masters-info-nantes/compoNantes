package org.xtext.example.compoNantes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.compoNantes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'component'", "'required'", "'provided'", "'interface'", "'port'", "'connector'"
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
    public String getGrammarFileName() { return "../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g"; }



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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:76:1: ruleModel returns [EObject current=null] : ( (lv_systems_0_0= ruleSystem ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systems_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( (lv_systems_0_0= ruleSystem ) )* )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_systems_0_0= ruleSystem ) )*
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:80:1: ( (lv_systems_0_0= ruleSystem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_systems_0_0= ruleSystem )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:81:1: (lv_systems_0_0= ruleSystem )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:82:3: lv_systems_0_0= ruleSystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSystemsSystemParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSystem_in_ruleModel130);
            	    lv_systems_0_0=ruleSystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systems",
            	            		lv_systems_0_0, 
            	            		"System");
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


    // $ANTLR start "entryRuleSystem"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:106:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:107:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:108:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem166);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem176); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:115:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_components_3_0 = null;

        EObject lv_connectors_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:118:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:119:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:119:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:119:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem213); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSystem230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSystem247); 

                	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:145:1: ( (lv_components_3_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:146:1: (lv_components_3_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:146:1: (lv_components_3_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:147:3: lv_components_3_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getComponentsComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleSystem268);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:163:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:164:1: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:164:1: (lv_connectors_4_0= ruleConnector )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:165:3: lv_connectors_4_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getConnectorsConnectorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleSystem290);
            	    lv_connectors_4_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"connectors",
            	            		lv_connectors_4_0, 
            	            		"Connector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleSystem303); 

                	newLeafNode(otherlv_5, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleComponent"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:193:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:194:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:195:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent339);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent349); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:202:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_interfaces_3_0 = null;

        EObject lv_ports_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:205:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:206:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:206:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:206:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComponent386); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:210:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:211:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:211:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:212:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent403); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponent420); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:232:1: ( (lv_interfaces_3_0= ruleInterface ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:233:1: (lv_interfaces_3_0= ruleInterface )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:233:1: (lv_interfaces_3_0= ruleInterface )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:234:3: lv_interfaces_3_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleComponent441);
            	    lv_interfaces_3_0=ruleInterface();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interfaces",
            	            		lv_interfaces_3_0, 
            	            		"Interface");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:250:3: ( (lv_ports_4_0= rulePort ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_ports_4_0= rulePort )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:251:1: (lv_ports_4_0= rulePort )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:252:3: lv_ports_4_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleComponent463);
            	    lv_ports_4_0=rulePort();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ports",
            	            		lv_ports_4_0, 
            	            		"Port");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleComponent476); 

                	newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleRequired"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:280:1: entryRuleRequired returns [String current=null] : iv_ruleRequired= ruleRequired EOF ;
    public final String entryRuleRequired() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRequired = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:281:2: (iv_ruleRequired= ruleRequired EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:282:2: iv_ruleRequired= ruleRequired EOF
            {
             newCompositeNode(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_ruleRequired_in_entryRuleRequired513);
            iv_ruleRequired=ruleRequired();

            state._fsp--;

             current =iv_ruleRequired.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequired524); 

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
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:289:1: ruleRequired returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'required' ;
    public final AntlrDatatypeRuleToken ruleRequired() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:292:28: (kw= 'required' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:294:2: kw= 'required'
            {
            kw=(Token)match(input,15,FOLLOW_15_in_ruleRequired561); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRequiredAccess().getRequiredKeyword()); 
                

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
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleProvided"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:307:1: entryRuleProvided returns [String current=null] : iv_ruleProvided= ruleProvided EOF ;
    public final String entryRuleProvided() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProvided = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:308:2: (iv_ruleProvided= ruleProvided EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:309:2: iv_ruleProvided= ruleProvided EOF
            {
             newCompositeNode(grammarAccess.getProvidedRule()); 
            pushFollow(FOLLOW_ruleProvided_in_entryRuleProvided601);
            iv_ruleProvided=ruleProvided();

            state._fsp--;

             current =iv_ruleProvided.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvided612); 

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
    // $ANTLR end "entryRuleProvided"


    // $ANTLR start "ruleProvided"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:316:1: ruleProvided returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'provided' ;
    public final AntlrDatatypeRuleToken ruleProvided() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:319:28: (kw= 'provided' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:321:2: kw= 'provided'
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleProvided649); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getProvidedAccess().getProvidedKeyword()); 
                

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
    // $ANTLR end "ruleProvided"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:334:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:335:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:336:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType689);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType700); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:343:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Required_0= ruleRequired | this_Provided_1= ruleProvided ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Required_0 = null;

        AntlrDatatypeRuleToken this_Provided_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:346:28: ( (this_Required_0= ruleRequired | this_Provided_1= ruleProvided ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:347:1: (this_Required_0= ruleRequired | this_Provided_1= ruleProvided )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:347:1: (this_Required_0= ruleRequired | this_Provided_1= ruleProvided )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:348:5: this_Required_0= ruleRequired
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRequiredParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRequired_in_ruleType747);
                    this_Required_0=ruleRequired();

                    state._fsp--;


                    		current.merge(this_Required_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:360:5: this_Provided_1= ruleProvided
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getProvidedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleProvided_in_ruleType780);
                    this_Provided_1=ruleProvided();

                    state._fsp--;


                    		current.merge(this_Provided_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:378:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:379:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:380:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface825);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface835); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:387:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:390:28: ( (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:391:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:391:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:391:3: otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInterface872); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:395:1: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:396:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:396:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:397:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInterface893);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:413:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:414:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:414:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:415:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface910); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:439:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:440:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:441:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort951);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort961); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:448:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:451:28: ( (otherlv_0= 'port' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:452:1: (otherlv_0= 'port' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:452:1: (otherlv_0= 'port' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:452:3: otherlv_0= 'port' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePort998); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:456:1: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:457:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:457:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:458:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePort1019);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPortRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:474:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:475:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:475:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:476:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort1036); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPortRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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


    // $ANTLR start "entryRuleConnector"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:500:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:501:2: (iv_ruleConnector= ruleConnector EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:502:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector1077);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector1087); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:509:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:512:28: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:513:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:513:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:513:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleConnector1124); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:517:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:518:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:518:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:519:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector1141); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector1158); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:539:1: ( (lv_components_3_0= ruleComponent ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:540:1: (lv_components_3_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:540:1: (lv_components_3_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:541:3: lv_components_3_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getComponentsComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleConnector1179);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConnectorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_3_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleConnector1192); 

                	newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_4());
                

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem247 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSystem268 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleSystem290 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleSystem303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent420 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleComponent441 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent463 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleComponent476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_entryRuleRequired513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequired524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRequired561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvided_in_entryRuleProvided601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvided612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleProvided649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_ruleType747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvided_in_ruleType780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInterface872 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleType_in_ruleInterface893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePort998 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleType_in_rulePort1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector1077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleConnector1124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector1141 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector1158 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleConnector1179 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleConnector1192 = new BitSet(new long[]{0x0000000000000002L});

}