package ConfigBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Implement.PDFOutputGenerator;
import Implement.TextOutputGenerator;

@Configuration
public class ConfigPDFOrText {
	
	@Bean(name = "PDF")
	public PDFOutputGenerator PDF(){
		return new PDFOutputGenerator();
	}
	@Bean(name = "Text")
	public TextOutputGenerator Text(){
		return new TextOutputGenerator();
	}
	
}
