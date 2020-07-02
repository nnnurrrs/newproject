package kz.kazpost.webservices.newproject.dao;

import kz.kazpost.webservices.newproject.schema.*;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.naming.InitialContext;
import javax.sql.DataSource;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.GregorianCalendar;


@Repository
class NewprojectDaoImpl implements NewprojectDao {

    private final static int DB_CONNECTION_TIMEOUT = 30;
    private final Logger LOG = Logger.getLogger(NewprojectDaoImpl.class);

    private XMLGregorianCalendar getXMLGregorianCalendarNow() throws DatatypeConfigurationException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        return datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
    }

    @Override
    public EmployeeInfoResponse gpInfo(EmployeeInfoRequest request) {
        EmployeeInfoResponse response = new EmployeeInfoResponse();
        ResponseInfo respinf = new ResponseInfo();
        try {
            String tnsName = request.getTNSJDBC();
            if (tnsName == null) {
                tnsName = "PREVDAY";
            }
            InitialContext jndiCntx = new InitialContext();
            DataSource ds = (DataSource) jndiCntx.lookup("java:jboss/jdbc/" + tnsName.toUpperCase() + "_COLVIR");

            try (Connection conn = ds.getConnection();
                 CallableStatement cst = conn.prepareCall("begin colvir.Z_PKG_DEP_TRANSFER.z_transfer_dep(" +
                         "pId_iin        => ?, " +
                         "p_dep_id       => ?, " +
                         "p_name         => ?, " +
                         "p_surname      => ?, " +
                         "p_department   => ?, " +
                         "p_prim         => ?, " +
                         "p_responseCode => ?, " +
                         "p_responseText => ? "  +
                         "); end;");) {

                cst.setInt(1, request.getPIdIin());
                cst.setInt(2, request.getPDepId());
                cst.setString(3, request.getPName());
                cst.setString(4, request.getPSurname());
                cst.setString(5, request.getPDepartment());
                cst.setString(6, request.getPPrim());
                cst.setQueryTimeout(DB_CONNECTION_TIMEOUT);

                cst.registerOutParameter(7, java.sql.Types.VARCHAR);
                cst.registerOutParameter(8, java.sql.Types.VARCHAR);
                cst.execute();

                String errCode = null;
                String errMess = null;


                errCode = cst.getString(7);
                errMess = cst.getString(8);

                if (errCode.equals("0")) {
                    respinf.setResponseText(errMess);
                    respinf.setResponseCode(errCode);
                    respinf.setResponseGenTime(getXMLGregorianCalendarNow());
                } else {
                    respinf.setResponseText(errMess);
                    respinf.setResponseCode(errCode);
                    respinf.setResponseGenTime(getXMLGregorianCalendarNow());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            respinf.setResponseCode("ERROR");
            respinf.setResponseText(e.toString() + e.getLocalizedMessage());
        }
        response.setResponseInfo(respinf);
        return response;
    }


    @Override
    public DelEmployeeInfoResponse grInfo(DelEmployeeInfoRequest request) {
        DelEmployeeInfoResponse response = new DelEmployeeInfoResponse();
        ResponseInfo respinf = new ResponseInfo();
        try {
            String tnsName = request.getTNSJDBC();
            if (tnsName == null) {
                tnsName = "PREVDAY";
            }
            InitialContext jndiCntx = new InitialContext();
            DataSource ds = (DataSource) jndiCntx.lookup("java:jboss/jdbc/" + tnsName.toUpperCase() + "_COLVIR");

            try (Connection conn = ds.getConnection();
                 CallableStatement cst = conn.prepareCall("begin colvir.Z_PKG_DEP_TRANSFER.z_DelFromDep(" +
                         "pIIN      => ?, " +
                         "p_responseCode       => ?, " +
                         "p_responseText        => ? " +
                         "); end;");) {

                cst.setInt(1, request.getPIin());
                cst.setQueryTimeout(DB_CONNECTION_TIMEOUT);

                cst.registerOutParameter(2, java.sql.Types.VARCHAR);
                cst.registerOutParameter(3, java.sql.Types.VARCHAR);
                cst.execute();

                String errCode = null;
                String errMess = null;


                errCode = cst.getString(2);
                errMess = cst.getString(3);

                if (errCode.equals("0")) {
                    respinf.setResponseText(errMess);
                    respinf.setResponseCode(errCode);
                    respinf.setResponseGenTime(getXMLGregorianCalendarNow());
                } else {
                    respinf.setResponseText(errMess);
                    respinf.setResponseCode(errCode);
                    respinf.setResponseGenTime(getXMLGregorianCalendarNow());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            respinf.setResponseCode("ERROR");
            respinf.setResponseText(e.toString() + e.getLocalizedMessage());
        }
        response.setResponseInfo(respinf);
        return response;
    }

}