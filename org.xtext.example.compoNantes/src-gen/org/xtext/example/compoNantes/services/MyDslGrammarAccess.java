/*
 * generated by Xtext
 */
package org.xtext.example.compoNantes.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cSystemsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSystemsSystemParserRuleCall_0 = (RuleCall)cSystemsAssignment.eContents().get(0);
		
		//Model:
		//	systems+=System*;
		@Override public ParserRule getRule() { return rule; }

		//systems+=System*
		public Assignment getSystemsAssignment() { return cSystemsAssignment; }

		//System
		public RuleCall getSystemsSystemParserRuleCall_0() { return cSystemsSystemParserRuleCall_0; }
	}

	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "System");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cComponentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cComponentsComponentParserRuleCall_3_0 = (RuleCall)cComponentsAssignment_3.eContents().get(0);
		private final Assignment cConnectorsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cConnectorsConnectorParserRuleCall_4_0 = (RuleCall)cConnectorsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//System:
		//	"system" name=ID "{" components+=Component* connectors+=Connector* "}";
		@Override public ParserRule getRule() { return rule; }

		//"system" name=ID "{" components+=Component* connectors+=Connector* "}"
		public Group getGroup() { return cGroup; }

		//"system"
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//components+=Component*
		public Assignment getComponentsAssignment_3() { return cComponentsAssignment_3; }

		//Component
		public RuleCall getComponentsComponentParserRuleCall_3_0() { return cComponentsComponentParserRuleCall_3_0; }

		//connectors+=Connector*
		public Assignment getConnectorsAssignment_4() { return cConnectorsAssignment_4; }

		//Connector
		public RuleCall getConnectorsConnectorParserRuleCall_4_0() { return cConnectorsConnectorParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInterfacesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cInterfacesInterfaceParserRuleCall_3_0 = (RuleCall)cInterfacesAssignment_3.eContents().get(0);
		private final Assignment cPortsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPortsPortParserRuleCall_4_0 = (RuleCall)cPortsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Component:
		//	"component" name=ID "{" interfaces+=Interface* ports+=Port* "}";
		@Override public ParserRule getRule() { return rule; }

		//"component" name=ID "{" interfaces+=Interface* ports+=Port* "}"
		public Group getGroup() { return cGroup; }

		//"component"
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//interfaces+=Interface*
		public Assignment getInterfacesAssignment_3() { return cInterfacesAssignment_3; }

		//Interface
		public RuleCall getInterfacesInterfaceParserRuleCall_3_0() { return cInterfacesInterfaceParserRuleCall_3_0; }

		//ports+=Port*
		public Assignment getPortsAssignment_4() { return cPortsAssignment_4; }

		//Port
		public RuleCall getPortsPortParserRuleCall_4_0() { return cPortsPortParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class RequiredElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Required");
		private final Keyword cRequiredKeyword = (Keyword)rule.eContents().get(1);
		
		//Required:
		//	"required";
		@Override public ParserRule getRule() { return rule; }

		//"required"
		public Keyword getRequiredKeyword() { return cRequiredKeyword; }
	}

	public class ProvidedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Provided");
		private final Keyword cProvidedKeyword = (Keyword)rule.eContents().get(1);
		
		//Provided:
		//	"provided";
		@Override public ParserRule getRule() { return rule; }

		//"provided"
		public Keyword getProvidedKeyword() { return cProvidedKeyword; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRequiredParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProvidedParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	Required | Provided;
		@Override public ParserRule getRule() { return rule; }

		//Required | Provided
		public Alternatives getAlternatives() { return cAlternatives; }

		//Required
		public RuleCall getRequiredParserRuleCall_0() { return cRequiredParserRuleCall_0; }

		//Provided
		public RuleCall getProvidedParserRuleCall_1() { return cProvidedParserRuleCall_1; }
	}

	public class InterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Interface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Interface:
		//	"interface" name=ID type=Type;
		@Override public ParserRule getRule() { return rule; }

		//"interface" name=ID type=Type
		public Group getGroup() { return cGroup; }

		//"interface"
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//type=Type
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_2_0() { return cTypeTypeParserRuleCall_2_0; }
	}

	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Port");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPortKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Port:
		//	"port" name=ID;
		@Override public ParserRule getRule() { return rule; }

		//"port" name=ID
		public Group getGroup() { return cGroup; }

		//"port"
		public Keyword getPortKeyword_0() { return cPortKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class ConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Connector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cComponentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cComponentsComponentParserRuleCall_3_0 = (RuleCall)cComponentsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Connector:
		//	"connector" name=ID "{" components+=Component* "}";
		@Override public ParserRule getRule() { return rule; }

		//"connector" name=ID "{" components+=Component* "}"
		public Group getGroup() { return cGroup; }

		//"connector"
		public Keyword getConnectorKeyword_0() { return cConnectorKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//components+=Component*
		public Assignment getComponentsAssignment_3() { return cComponentsAssignment_3; }

		//Component
		public RuleCall getComponentsComponentParserRuleCall_3_0() { return cComponentsComponentParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final ModelElements pModel;
	private final SystemElements pSystem;
	private final ComponentElements pComponent;
	private final RequiredElements pRequired;
	private final ProvidedElements pProvided;
	private final TypeElements pType;
	private final InterfaceElements pInterface;
	private final PortElements pPort;
	private final ConnectorElements pConnector;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSystem = new SystemElements();
		this.pComponent = new ComponentElements();
		this.pRequired = new RequiredElements();
		this.pProvided = new ProvidedElements();
		this.pType = new TypeElements();
		this.pInterface = new InterfaceElements();
		this.pPort = new PortElements();
		this.pConnector = new ConnectorElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.compoNantes.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	systems+=System*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//System:
	//	"system" name=ID "{" components+=Component* connectors+=Connector* "}";
	public SystemElements getSystemAccess() {
		return pSystem;
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}

	//Component:
	//	"component" name=ID "{" interfaces+=Interface* ports+=Port* "}";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}

	//Required:
	//	"required";
	public RequiredElements getRequiredAccess() {
		return pRequired;
	}
	
	public ParserRule getRequiredRule() {
		return getRequiredAccess().getRule();
	}

	//Provided:
	//	"provided";
	public ProvidedElements getProvidedAccess() {
		return pProvided;
	}
	
	public ParserRule getProvidedRule() {
		return getProvidedAccess().getRule();
	}

	//Type:
	//	Required | Provided;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//Interface:
	//	"interface" name=ID type=Type;
	public InterfaceElements getInterfaceAccess() {
		return pInterface;
	}
	
	public ParserRule getInterfaceRule() {
		return getInterfaceAccess().getRule();
	}

	//Port:
	//	"port" name=ID;
	public PortElements getPortAccess() {
		return pPort;
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}

	//Connector:
	//	"connector" name=ID "{" components+=Component* "}";
	public ConnectorElements getConnectorAccess() {
		return pConnector;
	}
	
	public ParserRule getConnectorRule() {
		return getConnectorAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
