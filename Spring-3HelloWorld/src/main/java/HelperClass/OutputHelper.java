package HelperClass;

import com.nguyenbanh.Spring_3HelloWorld.IOutputGenerator;

public class OutputHelper {
	private IOutputGenerator outputGennerator;
	private String name;
	
	
	public OutputHelper(IOutputGenerator outputGennerator){
		this.outputGennerator = outputGennerator;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public IOutputGenerator getOutputGennerator() {
		return outputGennerator;
	}


	public void setOutputGennerator(IOutputGenerator outputGennerator) {
		this.outputGennerator = outputGennerator;
	}
	
	
}
