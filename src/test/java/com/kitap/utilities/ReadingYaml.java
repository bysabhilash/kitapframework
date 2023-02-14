package com.kitap.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadingYaml {
	
	
	
	
	
	@DataProvider(name="dp")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public  Object[][]  Yaml () throws FileNotFoundException, YamlException {
				String path = ".//Testdata//AccountCreation.yml";
		YamlReader reader = new YamlReader(new FileReader(path));		
	
			Map map = (Map)reader.read();
			List data = (List)map.get("data");
			 Object[][] data1 = new Object[data.size()][1];
			
				Map<String,String> current=new HashMap<String,String>();
				
			//	List data = (List)testdata.get("data");
				for(int j=0;j<data.size();j++) {
					 current = (Map)data.get(j);
					
						data1[j][0]=current;
					
			
				//System.out.println(data1[j][0]);
			}
		return data1;
		
}
	
/*	@Test(dataProvider = "dp")
	public void AccountCreationViaUI(HashMap<String, String> data) throws Exception {

	//	if (!(com.kitap.utilities.TestUtil.isTestRunnable("AccountCreationViaUI", excel))) {

		//	throw new SkipException("Skipping the test " + "AccountCreationViaUI".toUpperCase() + "as the Run mode is NO");
	//	}
		System.out.println(data.get("Data_searchbar"));
}      */            
}
	
