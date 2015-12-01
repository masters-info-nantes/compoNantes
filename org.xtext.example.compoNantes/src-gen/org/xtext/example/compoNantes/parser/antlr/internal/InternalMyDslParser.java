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
import org.xtext.example.compoNantes.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'component'", "'connector'", "'interface'", "'port'", "'depends of'", "'uses'", "'required'", "'provided'"
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:77:1: ruleModel returns [EObject current=null] : ( (lv_systems_0_0= ruleSystem ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_systems_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( (lv_systems_0_0= ruleSystem ) )* )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_systems_0_0= ruleSystem ) )*
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_systems_0_0= ruleSystem ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_systems_0_0= ruleSystem )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_systems_0_0= ruleSystem )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:83:3: lv_systems_0_0= ruleSystem
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:107:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:108:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:109:2: iv_ruleSystem= ruleSystem EOF
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:116:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) ;
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
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:119:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:120:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:120:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:120:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* ( (lv_connectors_4_0= ruleConnector ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSystem213); 

                	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:124:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:126:3: lv_name_1_0= RULE_ID
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
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:146:1: ( (lv_components_3_0= ruleComponent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:147:1: (lv_components_3_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:147:1: (lv_components_3_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:148:3: lv_components_3_0= ruleComponent
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:164:3: ( (lv_connectors_4_0= ruleConnector ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:165:1: (lv_connectors_4_0= ruleConnector )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:165:1: (lv_connectors_4_0= ruleConnector )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:166:3: lv_connectors_4_0= ruleConnector
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:194:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:195:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:196:2: iv_ruleComponent= ruleComponent EOF
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:203:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_interfaces_3_0 = null;

        EObject lv_ports_4_0 = null;

        EObject lv_dependancies_5_0 = null;

        EObject lv_usages_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:206:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:207:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:207:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:207:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComponent386); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:211:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:213:3: lv_name_1_0= RULE_ID
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
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:233:1: ( (lv_interfaces_3_0= ruleInterface ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_interfaces_3_0= ruleInterface )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_interfaces_3_0= ruleInterface )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:235:3: lv_interfaces_3_0= ruleInterface
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:251:3: ( (lv_ports_4_0= rulePort ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:252:1: (lv_ports_4_0= rulePort )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:252:1: (lv_ports_4_0= rulePort )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:253:3: lv_ports_4_0= rulePort
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:269:3: ( (lv_dependancies_5_0= ruleDependancy ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:270:1: (lv_dependancies_5_0= ruleDependancy )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:270:1: (lv_dependancies_5_0= ruleDependancy )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:271:3: lv_dependancies_5_0= ruleDependancy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getDependanciesDependancyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependancy_in_ruleComponent485);
            	    lv_dependancies_5_0=ruleDependancy();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dependancies",
            	            		lv_dependancies_5_0, 
            	            		"Dependancy");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:287:3: ( (lv_usages_6_0= ruleUsage ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_usages_6_0= ruleUsage )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:288:1: (lv_usages_6_0= ruleUsage )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:289:3: lv_usages_6_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_ruleComponent507);
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
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleComponent520); 

                	newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:317:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:318:2: (iv_ruleConnector= ruleConnector EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:319:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector556);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector566); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:326:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:329:28: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:330:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:330:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:330:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleConnector603); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:334:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:336:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector620); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector637); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:356:1: ( (lv_components_3_0= ruleComponent ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:357:1: (lv_components_3_0= ruleComponent )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:357:1: (lv_components_3_0= ruleComponent )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:358:3: lv_components_3_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConnectorAccess().getComponentsComponentParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleConnector658);
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleConnector671); 

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


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:386:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:387:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:388:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface707);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface717); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:395:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:398:28: ( (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:399:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:399:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:399:3: otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleInterface754); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:403:1: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:404:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:404:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:405:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInterface775);
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:421:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:422:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:422:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:423:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface792); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:447:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:448:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:449:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort833);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort843); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:456:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:459:28: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:460:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:460:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:460:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulePort880); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:464:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:465:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:466:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort897); 

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


    // $ANTLR start "entryRuleDependancy"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:490:1: entryRuleDependancy returns [EObject current=null] : iv_ruleDependancy= ruleDependancy EOF ;
    public final EObject entryRuleDependancy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependancy = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:491:2: (iv_ruleDependancy= ruleDependancy EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:492:2: iv_ruleDependancy= ruleDependancy EOF
            {
             newCompositeNode(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy938);
            iv_ruleDependancy=ruleDependancy();

            state._fsp--;

             current =iv_ruleDependancy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy948); 

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
    // $ANTLR end "entryRuleDependancy"


    // $ANTLR start "ruleDependancy"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:499:1: ruleDependancy returns [EObject current=null] : (otherlv_0= 'depends of' ( (lv_component_1_0= ruleComponent ) ) ) ;
    public final EObject ruleDependancy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_component_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:502:28: ( (otherlv_0= 'depends of' ( (lv_component_1_0= ruleComponent ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:503:1: (otherlv_0= 'depends of' ( (lv_component_1_0= ruleComponent ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:503:1: (otherlv_0= 'depends of' ( (lv_component_1_0= ruleComponent ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:503:3: otherlv_0= 'depends of' ( (lv_component_1_0= ruleComponent ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDependancy985); 

                	newLeafNode(otherlv_0, grammarAccess.getDependancyAccess().getDependsOfKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:507:1: ( (lv_component_1_0= ruleComponent ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:508:1: (lv_component_1_0= ruleComponent )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:508:1: (lv_component_1_0= ruleComponent )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:509:3: lv_component_1_0= ruleComponent
            {
             
            	        newCompositeNode(grammarAccess.getDependancyAccess().getComponentComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComponent_in_ruleDependancy1006);
            lv_component_1_0=ruleComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependancyRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_1_0, 
                    		"Component");
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
    // $ANTLR end "ruleDependancy"


    // $ANTLR start "entryRuleUsage"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:533:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:534:2: (iv_ruleUsage= ruleUsage EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:535:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage1042);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage1052); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:542:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_component_1_0= ruleComponent ) ) ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_component_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:545:28: ( (otherlv_0= 'uses' ( (lv_component_1_0= ruleComponent ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:546:1: (otherlv_0= 'uses' ( (lv_component_1_0= ruleComponent ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:546:1: (otherlv_0= 'uses' ( (lv_component_1_0= ruleComponent ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:546:3: otherlv_0= 'uses' ( (lv_component_1_0= ruleComponent ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleUsage1089); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsesKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:550:1: ( (lv_component_1_0= ruleComponent ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:551:1: (lv_component_1_0= ruleComponent )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:551:1: (lv_component_1_0= ruleComponent )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:552:3: lv_component_1_0= ruleComponent
            {
             
            	        newCompositeNode(grammarAccess.getUsageAccess().getComponentComponentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleComponent_in_ruleUsage1110);
            lv_component_1_0=ruleComponent();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsageRule());
            	        }
                   		set(
                   			current, 
                   			"component",
                    		lv_component_1_0, 
                    		"Component");
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


    // $ANTLR start "ruleType"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:576:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:578:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:579:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:579:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:579:2: (enumLiteral_0= 'required' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:579:2: (enumLiteral_0= 'required' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:579:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleType1160); 

                            current = grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:585:6: (enumLiteral_1= 'provided' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:585:6: (enumLiteral_1= 'provided' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:585:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_21_in_ruleType1177); 

                            current = grammarAccess.getTypeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSystem213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSystem230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSystem247 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSystem268 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleSystem290 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleSystem303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent420 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleComponent441 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent463 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_ruleDependancy_in_ruleComponent485 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_ruleUsage_in_ruleComponent507 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13_in_ruleComponent520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConnector603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector620 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector637 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleConnector658 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleConnector671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInterface754 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_ruleType_in_ruleInterface775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulePort880 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDependancy985 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleDependancy1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUsage1089 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleUsage1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType1177 = new BitSet(new long[]{0x0000000000000002L});

}