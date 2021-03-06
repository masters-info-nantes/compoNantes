/*
 * generated by Xtext
 */
grammar InternalCompoNantes;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.example.compoNantes.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getComponentsAssignment()); }
(rule__Model__ComponentsAssignment)*
{ after(grammarAccess.getModelAccess().getComponentsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleComponent
entryRuleComponent 
:
{ before(grammarAccess.getComponentRule()); }
	 ruleComponent
{ after(grammarAccess.getComponentRule()); } 
	 EOF 
;

// Rule Component
ruleComponent
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getComponentAccess().getGroup()); }
(rule__Component__Group__0)
{ after(grammarAccess.getComponentAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePort
entryRulePort 
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPortAccess().getGroup()); }
(rule__Port__Group__0)
{ after(grammarAccess.getPortAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInterface
entryRuleInterface 
:
{ before(grammarAccess.getInterfaceRule()); }
	 ruleInterface
{ after(grammarAccess.getInterfaceRule()); } 
	 EOF 
;

// Rule Interface
ruleInterface
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInterfaceAccess().getGroup()); }
(rule__Interface__Group__0)
{ after(grammarAccess.getInterfaceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConnector
entryRuleConnector 
:
{ before(grammarAccess.getConnectorRule()); }
	 ruleConnector
{ after(grammarAccess.getConnectorRule()); } 
	 EOF 
;

// Rule Connector
ruleConnector
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConnectorAccess().getGroup()); }
(rule__Connector__Group__0)
{ after(grammarAccess.getConnectorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleDependency
entryRuleDependency 
:
{ before(grammarAccess.getDependencyRule()); }
	 ruleDependency
{ after(grammarAccess.getDependencyRule()); } 
	 EOF 
;

// Rule Dependency
ruleDependency
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getDependencyAccess().getGroup()); }
(rule__Dependency__Group__0)
{ after(grammarAccess.getDependencyAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule InterfaceType
ruleInterfaceType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceTypeAccess().getAlternatives()); }
(rule__InterfaceType__Alternatives)
{ after(grammarAccess.getInterfaceTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule ConnectorType
ruleConnectorType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorTypeAccess().getAlternatives()); }
(rule__ConnectorType__Alternatives)
{ after(grammarAccess.getConnectorTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Rule DependencyType
ruleDependencyType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyTypeAccess().getAlternatives()); }
(rule__DependencyType__Alternatives)
{ after(grammarAccess.getDependencyTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__InterfaceType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); }
(	'required' 
)
{ after(grammarAccess.getInterfaceTypeAccess().getREQUIREDEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); }
(	'provided' 
)
{ after(grammarAccess.getInterfaceTypeAccess().getPROVIDEDEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ConnectorType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); }
(	'assembly' 
)
{ after(grammarAccess.getConnectorTypeAccess().getASSEMBLYEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); }
(	'delegation' 
)
{ after(grammarAccess.getConnectorTypeAccess().getDELEGATIONEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__DependencyType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyTypeAccess().getUSAGEEnumLiteralDeclaration_0()); }
(	'usage' 
)
{ after(grammarAccess.getDependencyTypeAccess().getUSAGEEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getDependencyTypeAccess().getASSOCIATIONEnumLiteralDeclaration_1()); }
(	'association' 
)
{ after(grammarAccess.getDependencyTypeAccess().getASSOCIATIONEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Component__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__0__Impl
	rule__Component__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getComponentKeyword_0()); }

	'component' 

{ after(grammarAccess.getComponentAccess().getComponentKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__1__Impl
	rule__Component__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getNameAssignment_1()); }
(rule__Component__NameAssignment_1)
{ after(grammarAccess.getComponentAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__2__Impl
	rule__Component__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__3__Impl
	rule__Component__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getPortsAssignment_3()); }
(rule__Component__PortsAssignment_3)*
{ after(grammarAccess.getComponentAccess().getPortsAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__4__Impl
	rule__Component__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getInterfacesAssignment_4()); }
(rule__Component__InterfacesAssignment_4)*
{ after(grammarAccess.getComponentAccess().getInterfacesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__5__Impl
	rule__Component__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getComponentsAssignment_5()); }
(rule__Component__ComponentsAssignment_5)*
{ after(grammarAccess.getComponentAccess().getComponentsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__6__Impl
	rule__Component__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getConnectorsAssignment_6()); }
(rule__Component__ConnectorsAssignment_6)*
{ after(grammarAccess.getComponentAccess().getConnectorsAssignment_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__7__Impl
	rule__Component__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getDependenciesAssignment_7()); }
(rule__Component__DependenciesAssignment_7)*
{ after(grammarAccess.getComponentAccess().getDependenciesAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Component__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Component__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Component__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Port__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__0__Impl
	rule__Port__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getPortKeyword_0()); }

	'port' 

{ after(grammarAccess.getPortAccess().getPortKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Port__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Port__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameAssignment_1()); }
(rule__Port__NameAssignment_1)
{ after(grammarAccess.getPortAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Interface__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__0__Impl
	rule__Interface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); }

	'interface' 

{ after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__1__Impl
	rule__Interface__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); }
(rule__Interface__TypeAssignment_1)
{ after(grammarAccess.getInterfaceAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__2__Impl
	rule__Interface__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getNameAssignment_2()); }
(rule__Interface__NameAssignment_2)
{ after(grammarAccess.getInterfaceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__3__Impl
	rule__Interface__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getPortKeyword_3()); }

	'port' 

{ after(grammarAccess.getInterfaceAccess().getPortKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Interface__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Interface__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getPortAssignment_4()); }
(rule__Interface__PortAssignment_4)
{ after(grammarAccess.getInterfaceAccess().getPortAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Connector__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__0__Impl
	rule__Connector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); }

	'connector' 

{ after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__1__Impl
	rule__Connector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getTypeAssignment_1()); }
(rule__Connector__TypeAssignment_1)
{ after(grammarAccess.getConnectorAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__2__Impl
	rule__Connector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getNameAssignment_2()); }
(rule__Connector__NameAssignment_2)
{ after(grammarAccess.getConnectorAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__3__Impl
	rule__Connector__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__4__Impl
	rule__Connector__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getFromKeyword_4()); }

	'from' 

{ after(grammarAccess.getConnectorAccess().getFromKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__5__Impl
	rule__Connector__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getInt_fromAssignment_5()); }
(rule__Connector__Int_fromAssignment_5)
{ after(grammarAccess.getConnectorAccess().getInt_fromAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__6__Impl
	rule__Connector__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getToKeyword_6()); }

	'to' 

{ after(grammarAccess.getConnectorAccess().getToKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__7__Impl
	rule__Connector__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getInt_toAssignment_7()); }
(rule__Connector__Int_toAssignment_7)
{ after(grammarAccess.getConnectorAccess().getInt_toAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Dependency__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__0__Impl
	rule__Dependency__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); }

	'dependency' 

{ after(grammarAccess.getDependencyAccess().getDependencyKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__1__Impl
	rule__Dependency__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getTypeAssignment_1()); }
(rule__Dependency__TypeAssignment_1)
{ after(grammarAccess.getDependencyAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__2__Impl
	rule__Dependency__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getNameAssignment_2()); }
(rule__Dependency__NameAssignment_2)
{ after(grammarAccess.getDependencyAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__3__Impl
	rule__Dependency__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_3()); }

	'{' 

{ after(grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__4__Impl
	rule__Dependency__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getFromKeyword_4()); }

	'from' 

{ after(grammarAccess.getDependencyAccess().getFromKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__5__Impl
	rule__Dependency__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getComponent_fromAssignment_5()); }
(rule__Dependency__Component_fromAssignment_5)
{ after(grammarAccess.getDependencyAccess().getComponent_fromAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__6__Impl
	rule__Dependency__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getToKeyword_6()); }

	'to' 

{ after(grammarAccess.getDependencyAccess().getToKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__7__Impl
	rule__Dependency__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getComponent_toAssignment_7()); }
(rule__Dependency__Component_toAssignment_7)
{ after(grammarAccess.getDependencyAccess().getComponent_toAssignment_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Dependency__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Dependency__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_8()); }

	'}' 

{ after(grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Model__ComponentsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0()); }
	ruleComponent{ after(grammarAccess.getModelAccess().getComponentsComponentParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__PortsAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); }
	rulePort{ after(grammarAccess.getComponentAccess().getPortsPortParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__InterfacesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); }
	ruleInterface{ after(grammarAccess.getComponentAccess().getInterfacesInterfaceParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__ComponentsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getComponentsComponentParserRuleCall_5_0()); }
	ruleComponent{ after(grammarAccess.getComponentAccess().getComponentsComponentParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__ConnectorsAssignment_6
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_6_0()); }
	ruleConnector{ after(grammarAccess.getComponentAccess().getConnectorsConnectorParserRuleCall_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Component__DependenciesAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_7_0()); }
	ruleDependency{ after(grammarAccess.getComponentAccess().getDependenciesDependencyParserRuleCall_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Port__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); }
	ruleInterfaceType{ after(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Interface__PortAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); }
(
{ before(grammarAccess.getInterfaceAccess().getPortPortIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getInterfaceAccess().getPortPortIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getInterfaceAccess().getPortPortCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); }
	ruleConnectorType{ after(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Int_fromAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getInt_fromInterfaceCrossReference_5_0()); }
(
{ before(grammarAccess.getConnectorAccess().getInt_fromInterfaceQualifiedNameParserRuleCall_5_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getConnectorAccess().getInt_fromInterfaceQualifiedNameParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getConnectorAccess().getInt_fromInterfaceCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Int_toAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getInt_toInterfaceCrossReference_7_0()); }
(
{ before(grammarAccess.getConnectorAccess().getInt_toInterfaceQualifiedNameParserRuleCall_7_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getConnectorAccess().getInt_toInterfaceQualifiedNameParserRuleCall_7_0_1()); }
)
{ after(grammarAccess.getConnectorAccess().getInt_toInterfaceCrossReference_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getTypeDependencyTypeEnumRuleCall_1_0()); }
	ruleDependencyType{ after(grammarAccess.getDependencyAccess().getTypeDependencyTypeEnumRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Component_fromAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getComponent_fromInterfaceCrossReference_5_0()); }
(
{ before(grammarAccess.getDependencyAccess().getComponent_fromInterfaceQualifiedNameParserRuleCall_5_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getDependencyAccess().getComponent_fromInterfaceQualifiedNameParserRuleCall_5_0_1()); }
)
{ after(grammarAccess.getDependencyAccess().getComponent_fromInterfaceCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Dependency__Component_toAssignment_7
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getDependencyAccess().getComponent_toInterfaceCrossReference_7_0()); }
(
{ before(grammarAccess.getDependencyAccess().getComponent_toInterfaceQualifiedNameParserRuleCall_7_0_1()); }
	ruleQualifiedName{ after(grammarAccess.getDependencyAccess().getComponent_toInterfaceQualifiedNameParserRuleCall_7_0_1()); }
)
{ after(grammarAccess.getDependencyAccess().getComponent_toInterfaceCrossReference_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


