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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'{'", "'}'", "'component'", "'interface'", "'port'", "'dependancy'", "'usage'", "'required'", "'provided'"
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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:116:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:119:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:120:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:120:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:120:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSystem281); 

                	newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:176:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:177:2: (iv_ruleComponent= ruleComponent EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:178:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent317);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent327); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:185:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' ) ;
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
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:188:28: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:189:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:189:1: (otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}' )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:189:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_interfaces_3_0= ruleInterface ) )* ( (lv_ports_4_0= rulePort ) )* ( (lv_dependancies_5_0= ruleDependancy ) )* ( (lv_usages_6_0= ruleUsage ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleComponent364); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:193:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:194:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:194:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:195:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleComponent381); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleComponent398); 

                	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:215:1: ( (lv_interfaces_3_0= ruleInterface ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:216:1: (lv_interfaces_3_0= ruleInterface )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:216:1: (lv_interfaces_3_0= ruleInterface )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:217:3: lv_interfaces_3_0= ruleInterface
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInterface_in_ruleComponent419);
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
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:233:3: ( (lv_ports_4_0= rulePort ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_ports_4_0= rulePort )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_ports_4_0= rulePort )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:235:3: lv_ports_4_0= rulePort
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePort_in_ruleComponent441);
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
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:251:3: ( (lv_dependancies_5_0= ruleDependancy ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:252:1: (lv_dependancies_5_0= ruleDependancy )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:252:1: (lv_dependancies_5_0= ruleDependancy )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:253:3: lv_dependancies_5_0= ruleDependancy
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getDependanciesDependancyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependancy_in_ruleComponent463);
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
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:269:3: ( (lv_usages_6_0= ruleUsage ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:270:1: (lv_usages_6_0= ruleUsage )
            	    {
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:270:1: (lv_usages_6_0= ruleUsage )
            	    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:271:3: lv_usages_6_0= ruleUsage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUsage_in_ruleComponent485);
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
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleComponent498); 

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


    // $ANTLR start "entryRuleInterface"
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:299:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:300:2: (iv_ruleInterface= ruleInterface EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:301:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface534);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface544); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:308:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Enumerator lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:311:28: ( (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:312:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:312:1: (otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:312:3: otherlv_0= 'interface' ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleInterface581); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:316:1: ( (lv_type_1_0= ruleType ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:317:1: (lv_type_1_0= ruleType )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:317:1: (lv_type_1_0= ruleType )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:318:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInterface602);
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

            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:334:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:335:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:336:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface619); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:360:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:361:2: (iv_rulePort= rulePort EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:362:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort660);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort670); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:369:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:372:28: ( (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:373:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:373:1: (otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:373:3: otherlv_0= 'port' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_rulePort707); 

                	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:377:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:378:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:379:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePort724); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:403:1: entryRuleDependancy returns [EObject current=null] : iv_ruleDependancy= ruleDependancy EOF ;
    public final EObject entryRuleDependancy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependancy = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:404:2: (iv_ruleDependancy= ruleDependancy EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:405:2: iv_ruleDependancy= ruleDependancy EOF
            {
             newCompositeNode(grammarAccess.getDependancyRule()); 
            pushFollow(FOLLOW_ruleDependancy_in_entryRuleDependancy765);
            iv_ruleDependancy=ruleDependancy();

            state._fsp--;

             current =iv_ruleDependancy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependancy775); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:412:1: ruleDependancy returns [EObject current=null] : (otherlv_0= 'dependancy' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDependancy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:415:28: ( (otherlv_0= 'dependancy' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:416:1: (otherlv_0= 'dependancy' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:416:1: (otherlv_0= 'dependancy' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:416:3: otherlv_0= 'dependancy' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDependancy812); 

                	newLeafNode(otherlv_0, grammarAccess.getDependancyAccess().getDependancyKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:420:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:421:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:421:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:422:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependancyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependancy832); 

            		newLeafNode(otherlv_1, grammarAccess.getDependancyAccess().getComponentComponentCrossReference_1_0()); 
            	

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:441:1: entryRuleUsage returns [EObject current=null] : iv_ruleUsage= ruleUsage EOF ;
    public final EObject entryRuleUsage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsage = null;


        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:442:2: (iv_ruleUsage= ruleUsage EOF )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:443:2: iv_ruleUsage= ruleUsage EOF
            {
             newCompositeNode(grammarAccess.getUsageRule()); 
            pushFollow(FOLLOW_ruleUsage_in_entryRuleUsage868);
            iv_ruleUsage=ruleUsage();

            state._fsp--;

             current =iv_ruleUsage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsage878); 

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:450:1: ruleUsage returns [EObject current=null] : (otherlv_0= 'usage' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleUsage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:453:28: ( (otherlv_0= 'usage' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:454:1: (otherlv_0= 'usage' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:454:1: (otherlv_0= 'usage' ( (otherlv_1= RULE_ID ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:454:3: otherlv_0= 'usage' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleUsage915); 

                	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
                
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:458:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:459:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:459:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:460:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getUsageRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUsage935); 

            		newLeafNode(otherlv_1, grammarAccess.getUsageAccess().getComponentComponentCrossReference_1_0()); 
            	

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
    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:479:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:481:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) ) )
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:482:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            {
            // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:482:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'provided' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:482:2: (enumLiteral_0= 'required' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:482:2: (enumLiteral_0= 'required' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:482:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_19_in_ruleType985); 

                            current = grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:488:6: (enumLiteral_1= 'provided' )
                    {
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:488:6: (enumLiteral_1= 'provided' )
                    // ../org.xtext.example.compoNantes/src-gen/org/xtext/example/compoNantes/parser/antlr/internal/InternalMyDsl.g:488:8: enumLiteral_1= 'provided'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_20_in_ruleType1002); 

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
    public static final BitSet FOLLOW_12_in_ruleSystem247 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleSystem268 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleSystem281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleComponent364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleComponent381 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleComponent398 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleComponent419 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_rulePort_in_ruleComponent441 = new BitSet(new long[]{0x0000000000072000L});
    public static final BitSet FOLLOW_ruleDependancy_in_ruleComponent463 = new BitSet(new long[]{0x0000000000062000L});
    public static final BitSet FOLLOW_ruleUsage_in_ruleComponent485 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleComponent498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleInterface581 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ruleType_in_ruleInterface602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulePort707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePort724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependancy_in_entryRuleDependancy765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependancy775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDependancy812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependancy832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsage_in_entryRuleUsage868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsage878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUsage915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUsage935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType1002 = new BitSet(new long[]{0x0000000000000002L});

}