/*
 * generated by Xtext
 */
grammar InternalCompoNantes;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.compoNantes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getSubsystemSubSystemParserRuleCall_0_0()); 
	    }
		lv_subsystem_0_1=ruleSubSystem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"subsystem",
        		lv_subsystem_0_1, 
        		"SubSystem");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getSubsystemComponentParserRuleCall_0_1()); 
	    }
		lv_subsystem_0_2=ruleComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"subsystem",
        		lv_subsystem_0_2, 
        		"Component");
	        afterParserOrEnumRuleCall();
	    }

)

)
)*
;





// Entry rule entryRuleSubSystem
entryRuleSubSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubSystemRule()); }
	 iv_ruleSubSystem=ruleSubSystem 
	 { $current=$iv_ruleSubSystem.current; } 
	 EOF 
;

// Rule SubSystem
ruleSubSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='subsystem' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSubSystemAccess().getSubsystemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSubSystemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSubSystemAccess().getPortsPortParserRuleCall_3_0()); 
	    }
		lv_ports_3_0=rulePort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubSystemRule());
	        }
       		add(
       			$current, 
       			"ports",
        		lv_ports_3_0, 
        		"Port");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSubSystemAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
	    }
		lv_interfaces_4_0=ruleInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubSystemRule());
	        }
       		add(
       			$current, 
       			"interfaces",
        		lv_interfaces_4_0, 
        		"Interface");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSubSystemAccess().getComponentsComponentParserRuleCall_5_0()); 
	    }
		lv_components_5_0=ruleComponent		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubSystemRule());
	        }
       		add(
       			$current, 
       			"components",
        		lv_components_5_0, 
        		"Component");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSubSystemAccess().getDependenciesDependencyParserRuleCall_6_0()); 
	    }
		lv_dependencies_6_0=ruleDependency		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubSystemRule());
	        }
       		add(
       			$current, 
       			"dependencies",
        		lv_dependencies_6_0, 
        		"Dependency");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSubSystemAccess().getUsagesUsageParserRuleCall_7_0()); 
	    }
		lv_usages_7_0=ruleUsage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubSystemRule());
	        }
       		add(
       			$current, 
       			"usages",
        		lv_usages_7_0, 
        		"Usage");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSubSystemAccess().getConnectorsConnectorParserRuleCall_8_0()); 
	    }
		lv_connectors_8_0=ruleConnector		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubSystemRule());
	        }
       		add(
       			$current, 
       			"connectors",
        		lv_connectors_8_0, 
        		"Connector");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_9());
    }
)
;





// Entry rule entryRuleComponent
entryRuleComponent returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComponentRule()); }
	 iv_ruleComponent=ruleComponent 
	 { $current=$iv_ruleComponent.current; } 
	 EOF 
;

// Rule Component
ruleComponent returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='component' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComponentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); 
	    }
		lv_ports_3_0=rulePort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"ports",
        		lv_ports_3_0, 
        		"Port");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); 
	    }
		lv_interfaces_4_0=ruleInterface		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"interfaces",
        		lv_interfaces_4_0, 
        		"Interface");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_5_0()); 
	    }
		lv_dependencies_5_0=ruleDependency		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"dependencies",
        		lv_dependencies_5_0, 
        		"Dependency");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getUsagesUsageParserRuleCall_6_0()); 
	    }
		lv_usages_6_0=ruleUsage		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"usages",
        		lv_usages_6_0, 
        		"Usage");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_7_0()); 
	    }
		lv_connectors_7_0=ruleConnector		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComponentRule());
	        }
       		add(
       			$current, 
       			"connectors",
        		lv_connectors_7_0, 
        		"Connector");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleConnector
entryRuleConnector returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConnectorRule()); }
	 iv_ruleConnector=ruleConnector 
	 { $current=$iv_ruleConnector.current; } 
	 EOF 
;

// Rule Connector
ruleConnector returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='connector' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleConnectorType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConnectorRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"ConnectorType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConnectorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getColonKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getConnectorAccess().getInt1InterfaceCrossReference_4_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5='to' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getToKeyword_5());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConnectorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getConnectorAccess().getInt2InterfaceCrossReference_6_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleInterface
entryRuleInterface returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInterfaceRule()); }
	 iv_ruleInterface=ruleInterface 
	 { $current=$iv_ruleInterface.current; } 
	 EOF 
;

// Rule Interface
ruleInterface returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='interface' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); 
	    }
		lv_type_1_0=ruleInterfaceType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getInterfaceRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_1_0, 
        		"InterfaceType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInterfaceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='port' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getPortKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getInterfaceRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); 
	}

)
))
;





// Entry rule entryRulePort
entryRulePort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	 iv_rulePort=rulePort 
	 { $current=$iv_rulePort.current; } 
	 EOF 
;

// Rule Port
rulePort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='port' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPortRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleDependency
entryRuleDependency returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDependencyRule()); }
	 iv_ruleDependency=ruleDependency 
	 { $current=$iv_ruleDependency.current; } 
	 EOF 
;

// Rule Dependency
ruleDependency returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='dependency' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDependencyRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDependencyAccess().getComponentElementCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleUsage
entryRuleUsage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUsageRule()); }
	 iv_ruleUsage=ruleUsage 
	 { $current=$iv_ruleUsage.current; } 
	 EOF 
;

// Rule Usage
ruleUsage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='usage' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUsageAccess().getUsageKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getUsageRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getUsageAccess().getInterfaceInterfaceCrossReference_1_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))
;







// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule InterfaceType
ruleInterfaceType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='required' 
	{
        $current = grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='provided' 
	{
        $current = grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); 
    }
));



// Rule ConnectorType
ruleConnectorType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='assembly' 
	{
        $current = grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='delegation' 
	{
        $current = grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


