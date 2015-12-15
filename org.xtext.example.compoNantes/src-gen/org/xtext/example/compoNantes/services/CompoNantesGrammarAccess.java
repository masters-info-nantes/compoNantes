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
public class CompoNantesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cSubsystemAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cSubsystemAlternatives_0 = (Alternatives)cSubsystemAssignment.eContents().get(0);
		private final RuleCall cSubsystemSubSystemParserRuleCall_0_0 = (RuleCall)cSubsystemAlternatives_0.eContents().get(0);
		private final RuleCall cSubsystemComponentParserRuleCall_0_1 = (RuleCall)cSubsystemAlternatives_0.eContents().get(1);
		
		//Model:
		//	subsystem+=(SubSystem | Component)*;
		@Override public ParserRule getRule() { return rule; }

		//subsystem+=(SubSystem | Component)*
		public Assignment getSubsystemAssignment() { return cSubsystemAssignment; }

		//SubSystem | Component
		public Alternatives getSubsystemAlternatives_0() { return cSubsystemAlternatives_0; }

		//SubSystem
		public RuleCall getSubsystemSubSystemParserRuleCall_0_0() { return cSubsystemSubSystemParserRuleCall_0_0; }

		//Component
		public RuleCall getSubsystemComponentParserRuleCall_0_1() { return cSubsystemComponentParserRuleCall_0_1; }
	}

	public class SubSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SubSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubsystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPortsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPortsPortParserRuleCall_3_0 = (RuleCall)cPortsAssignment_3.eContents().get(0);
		private final Assignment cInterfacesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInterfacesInterfaceParserRuleCall_4_0 = (RuleCall)cInterfacesAssignment_4.eContents().get(0);
		private final Assignment cComponentsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cComponentsComponentParserRuleCall_5_0 = (RuleCall)cComponentsAssignment_5.eContents().get(0);
		private final Assignment cDependenciesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cDependenciesDependencyParserRuleCall_6_0 = (RuleCall)cDependenciesAssignment_6.eContents().get(0);
		private final Assignment cUsagesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cUsagesUsageParserRuleCall_7_0 = (RuleCall)cUsagesAssignment_7.eContents().get(0);
		private final Assignment cConnectorsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cConnectorsConnectorParserRuleCall_8_0 = (RuleCall)cConnectorsAssignment_8.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//SubSystem:
		//	"subsystem" name=ID "{" ports+=Port* interfaces+=Interface* components+=Component* dependencies+=Dependency*
		//	usages+=Usage* connectors+=Connector* "}";
		@Override public ParserRule getRule() { return rule; }

		//"subsystem" name=ID "{" ports+=Port* interfaces+=Interface* components+=Component* dependencies+=Dependency*
		//usages+=Usage* connectors+=Connector* "}"
		public Group getGroup() { return cGroup; }

		//"subsystem"
		public Keyword getSubsystemKeyword_0() { return cSubsystemKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//ports+=Port*
		public Assignment getPortsAssignment_3() { return cPortsAssignment_3; }

		//Port
		public RuleCall getPortsPortParserRuleCall_3_0() { return cPortsPortParserRuleCall_3_0; }

		//interfaces+=Interface*
		public Assignment getInterfacesAssignment_4() { return cInterfacesAssignment_4; }

		//Interface
		public RuleCall getInterfacesInterfaceParserRuleCall_4_0() { return cInterfacesInterfaceParserRuleCall_4_0; }

		//components+=Component*
		public Assignment getComponentsAssignment_5() { return cComponentsAssignment_5; }

		//Component
		public RuleCall getComponentsComponentParserRuleCall_5_0() { return cComponentsComponentParserRuleCall_5_0; }

		//dependencies+=Dependency*
		public Assignment getDependenciesAssignment_6() { return cDependenciesAssignment_6; }

		//Dependency
		public RuleCall getDependenciesDependencyParserRuleCall_6_0() { return cDependenciesDependencyParserRuleCall_6_0; }

		//usages+=Usage*
		public Assignment getUsagesAssignment_7() { return cUsagesAssignment_7; }

		//Usage
		public RuleCall getUsagesUsageParserRuleCall_7_0() { return cUsagesUsageParserRuleCall_7_0; }

		//connectors+=Connector*
		public Assignment getConnectorsAssignment_8() { return cConnectorsAssignment_8; }

		//Connector
		public RuleCall getConnectorsConnectorParserRuleCall_8_0() { return cConnectorsConnectorParserRuleCall_8_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_9() { return cRightCurlyBracketKeyword_9; }
	}

	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Component");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPortsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPortsPortParserRuleCall_3_0 = (RuleCall)cPortsAssignment_3.eContents().get(0);
		private final Assignment cInterfacesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInterfacesInterfaceParserRuleCall_4_0 = (RuleCall)cInterfacesAssignment_4.eContents().get(0);
		private final Assignment cDependenciesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDependenciesDependencyParserRuleCall_5_0 = (RuleCall)cDependenciesAssignment_5.eContents().get(0);
		private final Assignment cUsagesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cUsagesUsageParserRuleCall_6_0 = (RuleCall)cUsagesAssignment_6.eContents().get(0);
		private final Assignment cConnectorsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cConnectorsConnectorParserRuleCall_7_0 = (RuleCall)cConnectorsAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Component:
		//	"component" name=ID "{" ports+=Port* interfaces+=Interface* dependencies+=Dependency* usages+=Usage*
		//	connectors+=Connector* "}";
		@Override public ParserRule getRule() { return rule; }

		//"component" name=ID "{" ports+=Port* interfaces+=Interface* dependencies+=Dependency* usages+=Usage*
		//connectors+=Connector* "}"
		public Group getGroup() { return cGroup; }

		//"component"
		public Keyword getComponentKeyword_0() { return cComponentKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//ports+=Port*
		public Assignment getPortsAssignment_3() { return cPortsAssignment_3; }

		//Port
		public RuleCall getPortsPortParserRuleCall_3_0() { return cPortsPortParserRuleCall_3_0; }

		//interfaces+=Interface*
		public Assignment getInterfacesAssignment_4() { return cInterfacesAssignment_4; }

		//Interface
		public RuleCall getInterfacesInterfaceParserRuleCall_4_0() { return cInterfacesInterfaceParserRuleCall_4_0; }

		//dependencies+=Dependency*
		public Assignment getDependenciesAssignment_5() { return cDependenciesAssignment_5; }

		//Dependency
		public RuleCall getDependenciesDependencyParserRuleCall_5_0() { return cDependenciesDependencyParserRuleCall_5_0; }

		//usages+=Usage*
		public Assignment getUsagesAssignment_6() { return cUsagesAssignment_6; }

		//Usage
		public RuleCall getUsagesUsageParserRuleCall_6_0() { return cUsagesUsageParserRuleCall_6_0; }

		//connectors+=Connector*
		public Assignment getConnectorsAssignment_7() { return cConnectorsAssignment_7; }

		//Connector
		public RuleCall getConnectorsConnectorParserRuleCall_7_0() { return cConnectorsConnectorParserRuleCall_7_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class ConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Connector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeConnectorTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInt1Assignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInt1InterfaceCrossReference_4_0 = (CrossReference)cInt1Assignment_4.eContents().get(0);
		private final RuleCall cInt1InterfaceQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cInt1InterfaceCrossReference_4_0.eContents().get(1);
		private final Keyword cToKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cInt2Assignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cInt2InterfaceCrossReference_6_0 = (CrossReference)cInt2Assignment_6.eContents().get(0);
		private final RuleCall cInt2InterfaceQualifiedNameParserRuleCall_6_0_1 = (RuleCall)cInt2InterfaceCrossReference_6_0.eContents().get(1);
		
		//Connector:
		//	"connector" type?=ConnectorType name=ID ":" int1=[Interface|QualifiedName] "to" int2=[Interface|QualifiedName];
		@Override public ParserRule getRule() { return rule; }

		//"connector" type?=ConnectorType name=ID ":" int1=[Interface|QualifiedName] "to" int2=[Interface|QualifiedName]
		public Group getGroup() { return cGroup; }

		//"connector"
		public Keyword getConnectorKeyword_0() { return cConnectorKeyword_0; }

		//type?=ConnectorType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//ConnectorType
		public RuleCall getTypeConnectorTypeEnumRuleCall_1_0() { return cTypeConnectorTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }

		//int1=[Interface|QualifiedName]
		public Assignment getInt1Assignment_4() { return cInt1Assignment_4; }

		//[Interface|QualifiedName]
		public CrossReference getInt1InterfaceCrossReference_4_0() { return cInt1InterfaceCrossReference_4_0; }

		//QualifiedName
		public RuleCall getInt1InterfaceQualifiedNameParserRuleCall_4_0_1() { return cInt1InterfaceQualifiedNameParserRuleCall_4_0_1; }

		//"to"
		public Keyword getToKeyword_5() { return cToKeyword_5; }

		//int2=[Interface|QualifiedName]
		public Assignment getInt2Assignment_6() { return cInt2Assignment_6; }

		//[Interface|QualifiedName]
		public CrossReference getInt2InterfaceCrossReference_6_0() { return cInt2InterfaceCrossReference_6_0; }

		//QualifiedName
		public RuleCall getInt2InterfaceQualifiedNameParserRuleCall_6_0_1() { return cInt2InterfaceQualifiedNameParserRuleCall_6_0_1; }
	}

	public class InterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Interface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeInterfaceTypeEnumRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cPortKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPortPortCrossReference_4_0 = (CrossReference)cPortAssignment_4.eContents().get(0);
		private final RuleCall cPortPortIDTerminalRuleCall_4_0_1 = (RuleCall)cPortPortCrossReference_4_0.eContents().get(1);
		
		//Interface:
		//	"interface" type=InterfaceType name=ID "port" port=[Port];
		@Override public ParserRule getRule() { return rule; }

		//"interface" type=InterfaceType name=ID "port" port=[Port]
		public Group getGroup() { return cGroup; }

		//"interface"
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }

		//type=InterfaceType
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//InterfaceType
		public RuleCall getTypeInterfaceTypeEnumRuleCall_1_0() { return cTypeInterfaceTypeEnumRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"port"
		public Keyword getPortKeyword_3() { return cPortKeyword_3; }

		//port=[Port]
		public Assignment getPortAssignment_4() { return cPortAssignment_4; }

		//[Port]
		public CrossReference getPortPortCrossReference_4_0() { return cPortPortCrossReference_4_0; }

		//ID
		public RuleCall getPortPortIDTerminalRuleCall_4_0_1() { return cPortPortIDTerminalRuleCall_4_0_1; }
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

	public class DependencyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Dependency");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDependencyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentElementCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentElementQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cComponentElementCrossReference_1_0.eContents().get(1);
		
		//Dependency:
		//	"dependency" component=[Element|QualifiedName];
		@Override public ParserRule getRule() { return rule; }

		//"dependency" component=[Element|QualifiedName]
		public Group getGroup() { return cGroup; }

		//"dependency"
		public Keyword getDependencyKeyword_0() { return cDependencyKeyword_0; }

		//component=[Element|QualifiedName]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }

		//[Element|QualifiedName]
		public CrossReference getComponentElementCrossReference_1_0() { return cComponentElementCrossReference_1_0; }

		//QualifiedName
		public RuleCall getComponentElementQualifiedNameParserRuleCall_1_0_1() { return cComponentElementQualifiedNameParserRuleCall_1_0_1; }
	}

	public class UsageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Usage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUsageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentElementCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentElementQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cComponentElementCrossReference_1_0.eContents().get(1);
		
		//Usage:
		//	"usage" component=[Element|QualifiedName];
		@Override public ParserRule getRule() { return rule; }

		//"usage" component=[Element|QualifiedName]
		public Group getGroup() { return cGroup; }

		//"usage"
		public Keyword getUsageKeyword_0() { return cUsageKeyword_0; }

		//component=[Element|QualifiedName]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }

		//[Element|QualifiedName]
		public CrossReference getComponentElementCrossReference_1_0() { return cComponentElementCrossReference_1_0; }

		//QualifiedName
		public RuleCall getComponentElementQualifiedNameParserRuleCall_1_0_1() { return cComponentElementQualifiedNameParserRuleCall_1_0_1; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cComponentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSubSystemParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Element:
		//	Component | SubSystem;
		@Override public ParserRule getRule() { return rule; }

		//Component | SubSystem
		public Alternatives getAlternatives() { return cAlternatives; }

		//Component
		public RuleCall getComponentParserRuleCall_0() { return cComponentParserRuleCall_0; }

		//SubSystem
		public RuleCall getSubSystemParserRuleCall_1() { return cSubSystemParserRuleCall_1; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	public class InterfaceTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "InterfaceType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cREQUIREDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cREQUIREDRequiredKeyword_0_0 = (Keyword)cREQUIREDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPROVIDEDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPROVIDEDProvidedKeyword_1_0 = (Keyword)cPROVIDEDEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum InterfaceType:
		//	REQUIRED="required" | PROVIDED="provided";
		public EnumRule getRule() { return rule; }

		//REQUIRED="required" | PROVIDED="provided"
		public Alternatives getAlternatives() { return cAlternatives; }

		//REQUIRED="required"
		public EnumLiteralDeclaration getREQUIREDEnumLiteralDeclaration_0() { return cREQUIREDEnumLiteralDeclaration_0; }

		//"required"
		public Keyword getREQUIREDRequiredKeyword_0_0() { return cREQUIREDRequiredKeyword_0_0; }

		//PROVIDED="provided"
		public EnumLiteralDeclaration getPROVIDEDEnumLiteralDeclaration_1() { return cPROVIDEDEnumLiteralDeclaration_1; }

		//"provided"
		public Keyword getPROVIDEDProvidedKeyword_1_0() { return cPROVIDEDProvidedKeyword_1_0; }
	}

	public class ConnectorTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "ConnectorType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cASSEMBLYEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cASSEMBLYAssemblyKeyword_0_0 = (Keyword)cASSEMBLYEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDELEGATIONEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDELEGATIONDelegationKeyword_1_0 = (Keyword)cDELEGATIONEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum ConnectorType:
		//	ASSEMBLY="assembly" | DELEGATION="delegation";
		public EnumRule getRule() { return rule; }

		//ASSEMBLY="assembly" | DELEGATION="delegation"
		public Alternatives getAlternatives() { return cAlternatives; }

		//ASSEMBLY="assembly"
		public EnumLiteralDeclaration getASSEMBLYEnumLiteralDeclaration_0() { return cASSEMBLYEnumLiteralDeclaration_0; }

		//"assembly"
		public Keyword getASSEMBLYAssemblyKeyword_0_0() { return cASSEMBLYAssemblyKeyword_0_0; }

		//DELEGATION="delegation"
		public EnumLiteralDeclaration getDELEGATIONEnumLiteralDeclaration_1() { return cDELEGATIONEnumLiteralDeclaration_1; }

		//"delegation"
		public Keyword getDELEGATIONDelegationKeyword_1_0() { return cDELEGATIONDelegationKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final SubSystemElements pSubSystem;
	private final ComponentElements pComponent;
	private final ConnectorElements pConnector;
	private final InterfaceElements pInterface;
	private final PortElements pPort;
	private final DependencyElements pDependency;
	private final UsageElements pUsage;
	private final ElementElements pElement;
	private final QualifiedNameElements pQualifiedName;
	private final InterfaceTypeElements unknownRuleInterfaceType;
	private final ConnectorTypeElements unknownRuleConnectorType;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public CompoNantesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSubSystem = new SubSystemElements();
		this.pComponent = new ComponentElements();
		this.pConnector = new ConnectorElements();
		this.pInterface = new InterfaceElements();
		this.pPort = new PortElements();
		this.pDependency = new DependencyElements();
		this.pUsage = new UsageElements();
		this.pElement = new ElementElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.unknownRuleInterfaceType = new InterfaceTypeElements();
		this.unknownRuleConnectorType = new ConnectorTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.compoNantes.CompoNantes".equals(grammar.getName())) {
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
	//	subsystem+=(SubSystem | Component)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//SubSystem:
	//	"subsystem" name=ID "{" ports+=Port* interfaces+=Interface* components+=Component* dependencies+=Dependency*
	//	usages+=Usage* connectors+=Connector* "}";
	public SubSystemElements getSubSystemAccess() {
		return pSubSystem;
	}
	
	public ParserRule getSubSystemRule() {
		return getSubSystemAccess().getRule();
	}

	//Component:
	//	"component" name=ID "{" ports+=Port* interfaces+=Interface* dependencies+=Dependency* usages+=Usage*
	//	connectors+=Connector* "}";
	public ComponentElements getComponentAccess() {
		return pComponent;
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}

	//Connector:
	//	"connector" type?=ConnectorType name=ID ":" int1=[Interface|QualifiedName] "to" int2=[Interface|QualifiedName];
	public ConnectorElements getConnectorAccess() {
		return pConnector;
	}
	
	public ParserRule getConnectorRule() {
		return getConnectorAccess().getRule();
	}

	//Interface:
	//	"interface" type=InterfaceType name=ID "port" port=[Port];
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

	//Dependency:
	//	"dependency" component=[Element|QualifiedName];
	public DependencyElements getDependencyAccess() {
		return pDependency;
	}
	
	public ParserRule getDependencyRule() {
		return getDependencyAccess().getRule();
	}

	//Usage:
	//	"usage" component=[Element|QualifiedName];
	public UsageElements getUsageAccess() {
		return pUsage;
	}
	
	public ParserRule getUsageRule() {
		return getUsageAccess().getRule();
	}

	//Element:
	//	Component | SubSystem;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//enum InterfaceType:
	//	REQUIRED="required" | PROVIDED="provided";
	public InterfaceTypeElements getInterfaceTypeAccess() {
		return unknownRuleInterfaceType;
	}
	
	public EnumRule getInterfaceTypeRule() {
		return getInterfaceTypeAccess().getRule();
	}

	//enum ConnectorType:
	//	ASSEMBLY="assembly" | DELEGATION="delegation";
	public ConnectorTypeElements getConnectorTypeAccess() {
		return unknownRuleConnectorType;
	}
	
	public EnumRule getConnectorTypeRule() {
		return getConnectorTypeAccess().getRule();
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
