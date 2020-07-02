package kz.kazpost.webservices.newproject.service;

import kz.kazpost.webservices.newproject.dao.NewprojectDao;
import kz.kazpost.webservices.newproject.schema.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewprojectServiceImpl implements NewprojectService {

    @Autowired
    private NewprojectDao newprojectDao;

    @Override
    public EmployeeInfoResponse gpInfo(EmployeeInfoRequest request) {
        return newprojectDao.gpInfo(request);
    }

    @Override
    public DelEmployeeInfoResponse grInfo(DelEmployeeInfoRequest request) {
        return newprojectDao.grInfo(request);
    }

}
