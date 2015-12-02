/*
 * generated by Xtext
 */
package org.xtext.example.compoNantes.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.compoNantes.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.compoNantes.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.compoNantes.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.compoNantes.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
					put(grammarAccess.getComponentAccess().getGroup(), "rule__Component__Group__0");
					put(grammarAccess.getInterfaceAccess().getGroup(), "rule__Interface__Group__0");
					put(grammarAccess.getPortAccess().getGroup(), "rule__Port__Group__0");
					put(grammarAccess.getDependancyAccess().getGroup(), "rule__Dependancy__Group__0");
					put(grammarAccess.getUsageAccess().getGroup(), "rule__Usage__Group__0");
					put(grammarAccess.getModelAccess().getSystemsAssignment(), "rule__Model__SystemsAssignment");
					put(grammarAccess.getSystemAccess().getNameAssignment_1(), "rule__System__NameAssignment_1");
					put(grammarAccess.getSystemAccess().getComponentsAssignment_3(), "rule__System__ComponentsAssignment_3");
					put(grammarAccess.getComponentAccess().getNameAssignment_1(), "rule__Component__NameAssignment_1");
					put(grammarAccess.getComponentAccess().getInterfacesAssignment_3(), "rule__Component__InterfacesAssignment_3");
					put(grammarAccess.getComponentAccess().getPortsAssignment_4(), "rule__Component__PortsAssignment_4");
					put(grammarAccess.getComponentAccess().getDependanciesAssignment_5(), "rule__Component__DependanciesAssignment_5");
					put(grammarAccess.getComponentAccess().getUsagesAssignment_6(), "rule__Component__UsagesAssignment_6");
					put(grammarAccess.getInterfaceAccess().getTypeAssignment_1(), "rule__Interface__TypeAssignment_1");
					put(grammarAccess.getInterfaceAccess().getNameAssignment_2(), "rule__Interface__NameAssignment_2");
					put(grammarAccess.getPortAccess().getNameAssignment_1(), "rule__Port__NameAssignment_1");
					put(grammarAccess.getDependancyAccess().getComponentAssignment_1(), "rule__Dependancy__ComponentAssignment_1");
					put(grammarAccess.getUsageAccess().getComponentAssignment_1(), "rule__Usage__ComponentAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.compoNantes.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.compoNantes.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
