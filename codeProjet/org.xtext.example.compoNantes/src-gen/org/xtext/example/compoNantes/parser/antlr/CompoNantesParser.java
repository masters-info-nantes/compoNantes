/*
 * generated by Xtext
 */
package org.xtext.example.compoNantes.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.compoNantes.services.CompoNantesGrammarAccess;

public class CompoNantesParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CompoNantesGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.compoNantes.parser.antlr.internal.InternalCompoNantesParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.compoNantes.parser.antlr.internal.InternalCompoNantesParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public CompoNantesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CompoNantesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}