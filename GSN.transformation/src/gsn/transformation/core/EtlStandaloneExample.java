
package gsn.transformation.core;


import java.io.File;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;



public class EtlStandaloneExample extends EpsilonStandaloneExample {
	
	public static String pathOfArmModel="";
	public static String pathOfGSNModel="";
	
	public static void main(String[] args) throws Exception {
		new EtlStandaloneExample().execute();
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModelByURI("GSN1", pathOfGSNModel, "GSN1", true, false));
		models.add(createEmfModelByURI("ARM", pathOfArmModel, "ARM", false, true));
		
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "GSN2ARM.etl";
	}

	@Override
	public void postProcess() {
		
	}
	
	static public void createFile(String path) throws IOException{
		File f;
		StringTokenizer token=new StringTokenizer(path,"/");
		pathOfArmModel="";
		int j=token.countTokens();
		for(int i=0;i<j-1;i++){
			pathOfArmModel=pathOfArmModel+token.nextToken()+"/";
		}
		StringTokenizer gsnName=new StringTokenizer(token.nextToken(),".");
		pathOfArmModel=pathOfArmModel+gsnName.nextToken()+".arm/";
		f=new File(pathOfArmModel);
		if(f.exists()){
		//	f.delete();
		}
		f.createNewFile();
		
	}
	
	
}
