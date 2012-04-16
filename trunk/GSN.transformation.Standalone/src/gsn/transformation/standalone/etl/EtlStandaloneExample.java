
package gsn.transformation.standalone.etl;

import gsn.trasnformation.standalone.standalonecode.EpsilonStandaloneExample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.osgi.framework.Bundle;



public class EtlStandaloneExample extends EpsilonStandaloneExample {
	
	private static String pathOfArmModel="";
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
		models.add(createEmfModel("GSN1", "models/GSN1.model", "models/GSN1.ecore", true, false));
		models.add(createEmfModel("ARM", "models/ARMInstance.model", "models/ARM.ecore", false, true));
	  
		
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "etl/GSN2ARM.etl";
	}

	@Override
	public void postProcess() {
		
	}
	
	/*static public void createFile(String path) throws IOException{
		File f;
		StringTokenizer token=new StringTokenizer(path,"/");
		pathOfArmModel="";
		int j=token.countTokens();
		for(int i=0;i<j-1;i++){
			pathOfArmModel=pathOfArmModel+token.nextToken()+"/";
		}
		pathOfArmModel=pathOfArmModel+"ARMinstance.model/";
		System.out.println(pathOfArmModel);
		f=new File(pathOfArmModel);
		if(f.exists()){
			f.delete();
		}
		f.createNewFile();

	}*/
	
	static public void transformToEMFModel(String path) throws IOException{
	
		
		File src=new File(path);
		File dst=new File("D:/workspace_disertation/GSN.trasnformation.Standalone/src/gsn/transformation/standalone/models/GSN1.model"); 
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);

		    // Transfer bytes from in to out
		    byte[] buf = new byte[1024];
		    int len;
		    while ((len = in.read(buf)) > 0) {
		        out.write(buf, 0, len);
		    }
		    in.close();
		    out.close();
		
	}
}
