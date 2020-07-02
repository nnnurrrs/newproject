package kz.kazpost.webservices.newproject.dao;
import kz.kazpost.webservices.newproject.schema.*;

public interface NewprojectDao {
    EmployeeInfoResponse gpInfo(EmployeeInfoRequest request);

    DelEmployeeInfoResponse grInfo(DelEmployeeInfoRequest request);
}

