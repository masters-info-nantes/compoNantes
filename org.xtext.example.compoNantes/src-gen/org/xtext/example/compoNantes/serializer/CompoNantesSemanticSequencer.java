/*
 * generated by Xtext
 */
package org.xtext.example.compoNantes.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.compoNantes.compoNantes.CompoNantesPackage;
import org.xtext.example.compoNantes.compoNantes.Component;
import org.xtext.example.compoNantes.compoNantes.Connector;
import org.xtext.example.compoNantes.compoNantes.Dependency;
import org.xtext.example.compoNantes.compoNantes.Interface;
import org.xtext.example.compoNantes.compoNantes.Model;
import org.xtext.example.compoNantes.compoNantes.Port;
import org.xtext.example.compoNantes.compoNantes.SubSystem;
import org.xtext.example.compoNantes.compoNantes.Usage;
import org.xtext.example.compoNantes.services.CompoNantesGrammarAccess;

@SuppressWarnings("all")
public class CompoNantesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CompoNantesGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CompoNantesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CompoNantesPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case CompoNantesPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case CompoNantesPackage.DEPENDENCY:
				sequence_Dependency(context, (Dependency) semanticObject); 
				return; 
			case CompoNantesPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case CompoNantesPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case CompoNantesPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case CompoNantesPackage.SUB_SYSTEM:
				sequence_SubSystem(context, (SubSystem) semanticObject); 
				return; 
			case CompoNantesPackage.USAGE:
				sequence_Usage(context, (Usage) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ports+=Port* 
	 *         interfaces+=Interface* 
	 *         dependencies+=Dependency* 
	 *         usages+=Usage* 
	 *         connectors+=Connector*
	 *     )
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ConnectorType name=ID int1=[Interface|QualifiedName] int2=[Interface|QualifiedName])
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.CONNECTOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.CONNECTOR__TYPE));
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.CONNECTOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.CONNECTOR__NAME));
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.CONNECTOR__INT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.CONNECTOR__INT1));
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.CONNECTOR__INT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.CONNECTOR__INT2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConnectorAccess().getTypeConnectorTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConnectorAccess().getInt1InterfaceQualifiedNameParserRuleCall_4_0_1(), semanticObject.getInt1());
		feeder.accept(grammarAccess.getConnectorAccess().getInt2InterfaceQualifiedNameParserRuleCall_6_0_1(), semanticObject.getInt2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     component=[Element|QualifiedName]
	 */
	protected void sequence_Dependency(EObject context, Dependency semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.DEPENDENCY__COMPONENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.DEPENDENCY__COMPONENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependencyAccess().getComponentElementQualifiedNameParserRuleCall_1_0_1(), semanticObject.getComponent());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=InterfaceType name=ID port=[Port|ID])
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.INTERFACE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.INTERFACE__TYPE));
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.INTERFACE__NAME));
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.INTERFACE__PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.INTERFACE__PORT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeEnumRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInterfaceAccess().getPortPortIDTerminalRuleCall_4_0_1(), semanticObject.getPort());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (subsystem+=SubSystem | subsystem+=Component)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Port(EObject context, Port semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.PORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ports+=Port* 
	 *         interfaces+=Interface* 
	 *         components+=Component* 
	 *         dependencies+=Dependency* 
	 *         usages+=Usage* 
	 *         connectors+=Connector*
	 *     )
	 */
	protected void sequence_SubSystem(EObject context, SubSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     interface=[Interface|QualifiedName]
	 */
	protected void sequence_Usage(EObject context, Usage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CompoNantesPackage.Literals.USAGE__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CompoNantesPackage.Literals.USAGE__INTERFACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsageAccess().getInterfaceInterfaceQualifiedNameParserRuleCall_1_0_1(), semanticObject.getInterface());
		feeder.finish();
	}
}
