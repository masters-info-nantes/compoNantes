package org.xtext.example.compoNantes;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ModelGenerator {

	public static void main(String[] args) {
		
        CompoNantesStandaloneSetup.doSetup();
        XtextResourceSet resourceSet = new XtextResourceSet();
        URI uri = URI.createURI("sample/test.cpn");
        Resource xtextResource = resourceSet.getResource(uri , true);
        Resource xmiResource = new EcoreResourceFactoryImpl().createResource(URI.createURI("model/generated/test.ecore"));
        xmiResource.getContents().add(xtextResource.getContents().get(0));
        try {
            xmiResource.save(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
