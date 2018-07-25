package ConfigBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Implement.CsvOutputGenerator;
import Implement.JsonOutputGenerator;

@Configuration
public class ConfigCsvOrJson {
	@Bean(name = "Csv")
	public CsvOutputGenerator CsvImlement(){
		return new CsvOutputGenerator();
	}
	
	@Bean(name = "Json")
	public JsonOutputGenerator JsonImplement(){
		return new JsonOutputGenerator();
	}
}
