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
import org.xtext.example.compoNantes.myDsl.Component;
import org.xtext.example.compoNantes.myDsl.Connector;
import org.xtext.example.compoNantes.myDsl.Interface;
import org.xtext.example.compoNantes.myDsl.Model;
import org.xtext.example.compoNantes.myDsl.MyDslPackage;
import org.xtext.example.compoNantes.myDsl.Port;
import org.xtext.example.compoNantes.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MyDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.COMPONENT:
				sequence_Component(context, (Component) semanticObject); 
				return; 
			case MyDslPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case MyDslPackage.INTERFACE:
				sequence_Interface(context, (Interface) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PORT:
				sequence_Port(context, (Port) semanticObject); 
				return; 
			case MyDslPackage.SYSTEM:
				sequence_System(context, (org.xtext.example.compoNantes.myDsl.System) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID interfaces+=Interface* ports+=Port*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID components+=Component*)
	 */
	protected void sequence_Connector(EObject context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Type)
	 */
	protected void sequence_Interface(EObject context, Interface semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INTERFACE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INTERFACE__NAME));
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.INTERFACE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.INTERFACE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInterfaceAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     systems+=System*
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
			if(transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID components+=Component* connectors+=Connector*)
	 */
	protected void sequence_System(EObject context, org.xtext.example.compoNantes.myDsl.System semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}