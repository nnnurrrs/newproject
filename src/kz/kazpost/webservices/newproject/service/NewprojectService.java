package kz.kazpost.webservices.newproject.service;


import kz.kazpost.webservices.newproject.schema.*;

public interface NewprojectService {
    EmployeeInfoResponse gpInfo(EmployeeInfoRequest request);
    DelEmployeeInfoResponse grInfo(DelEmployeeInfoRequest request);
}
