package kz.kazpost.webservices.newproject.endpoint;

import kz.kazpost.webservices.newproject.schema.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import kz.kazpost.webservices.newproject.service.NewprojectService;

@Endpoint
public class Endpoints {
	
	private static final String WFE_TARGET_NAMESPACE = "http://webservices.kazpost.kz/newproject/schema";
	
	@Autowired
	private NewprojectService newprojectService;

	public void setNewprojectService(NewprojectService newprojectService) {
		this.newprojectService = newprojectService;
	}

	@PayloadRoot(localPart = "EmployeeInfoRequest", namespace = WFE_TARGET_NAMESPACE)
	public @ResponsePayload
	EmployeeInfoResponse gpInfo(@RequestPayload EmployeeInfoRequest request) {
		EmployeeInfoResponse response = newprojectService.gpInfo(request);
		return response;
	}

	@PayloadRoot(localPart = "DelEmployeeInfoRequest", namespace = WFE_TARGET_NAMESPACE)
	public @ResponsePayload
	DelEmployeeInfoResponse grInfo(@RequestPayload DelEmployeeInfoRequest request) {
		DelEmployeeInfoResponse response = newprojectService.grInfo(request);
		return response;
	}

}
