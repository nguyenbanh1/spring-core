package ConfigBean;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ConfigCsvOrJson.class,ConfigPDFOrText.class})
public class AppConfig {

}
