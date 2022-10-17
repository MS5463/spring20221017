package lecture.p10core;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
	
	private Service service;
	
	@Autowired
	public void setService(Service service) {
		this.service = service;
	}
	
	public Service getService() {
		return service;
	}
	
}
