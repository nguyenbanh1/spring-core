package component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("CustomerBean")
public class Customer {
	
	@Value("#{itemBean}")
	public Item item;
	
	@Value("#{itemBean.name}")
	private String name;
	
	
	public String getName(){
		return this.name;
	}
	
	
	
}
