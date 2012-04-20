
package gsn.transformation.core;

import java.io.File;
import java.net.URISyntaxException;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.commons.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.osgi.framework.Bundle;

public abstract class EpsilonStandaloneExample {
	
	protected IEolExecutableModule module;
	
	protected Object result;
	
	public abstract IEolExecutableModule createModule();
	
	public abstract String getSource() throws Exception;
	
	public abstract List<IModel> getModels() throws Exception;
	
	public void postProcess() {};
	
	public void preProcess() {};
	
	public void execute() throws Exception {
		
		module = createModule();
		module.parse(getFile(getSource()));
		
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			System.exit(-1);
		}
		
		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		preProcess();
		result = execute(module);
		postProcess();
		
		module.getContext().getModelRepository().dispose();
	}
	
	protected Object execute(IEolExecutableModule module) throws EolRuntimeException {
		return module.execute();
	}
	


	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad, boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, "file:/" + new File(model).getAbsolutePath());
		properties.put(EmfModel.PROPERTY_IS_METAMODEL_FILE_BASED, "false");
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, null);
		return emfModel;
		
	}
	
	protected File getFile(String fileName) throws URISyntaxException {
	
		Bundle bundle = Platform.getBundle("GSN.transformation");
		StringTokenizer st=new StringTokenizer(bundle.getLocation(),":");
		st.nextToken();
		st.nextToken();
		String s=st.nextToken()+":"+st.nextToken();
		return new File(s+"src/gsn/transformation/core/"+fileName);
		
		
	}
	
}
