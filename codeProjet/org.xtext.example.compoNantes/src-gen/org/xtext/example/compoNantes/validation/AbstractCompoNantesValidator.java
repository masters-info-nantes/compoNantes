/*
 * generated by Xtext
 */
package org.xtext.example.compoNantes.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCompoNantesValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.example.compoNantes.compoNantes.CompoNantesPackage.eINSTANCE);
		return result;
	}
}