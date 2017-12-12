package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseSearcherFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseSearcherFacade.class);

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    public List<Employee> processEmployeeSearch(final String characters) throws DatabaseSearcherException {
        boolean wasError = false;
        List<Employee> foundEmployeesList = new ArrayList<>();
        if (characters.charAt(0) != '%' && characters.charAt(characters.length()) != '%') {
            LOGGER.error(DatabaseSearcherException.ERR_INCCORECT_PHRASE);
            wasError = true;
            throw new DatabaseSearcherException(DatabaseSearcherException.ERR_INCCORECT_PHRASE);
        }
        try {
            LOGGER.info("Searching employee by phrase: " + characters);
            foundEmployeesList = employeeDao.findEmployeeByChars(characters);
            if (foundEmployeesList.size() == 0) {
                wasError = true;
                LOGGER.error(DatabaseSearcherException.ERR_NO_EMPLOYEE_FOUND);
                throw new DatabaseSearcherException(DatabaseSearcherException.ERR_NO_EMPLOYEE_FOUND + " ; " + DatabaseSearcherException.INFO_SEARCH_FINISHED);
            }else {
                foundEmployeesList.forEach(employee -> LOGGER.info("Employee : " + employee));
                LOGGER.info(DatabaseSearcherException.INFO_SEARCH_FINISHED);
                return foundEmployeesList;
            }
        } finally {
                LOGGER.error(DatabaseSearcherException.INFO_SEARCH_FINISHED);
        }
    }



    public List<Company> processCompanySearch(final String characters) throws DatabaseSearcherException {
        boolean wasError = false;
        List<Company> foundCompaniesList = new ArrayList<>();
        if (characters.charAt(0) != '%' && characters.charAt(characters.length()) != '%') {
            LOGGER.error(DatabaseSearcherException.ERR_INCCORECT_PHRASE);
            wasError = true;
            throw new DatabaseSearcherException(DatabaseSearcherException.ERR_INCCORECT_PHRASE);
        }
        try {
            LOGGER.info("Searching company by phrase: " + characters);
            foundCompaniesList = companyDao.findCompanyByChars(characters);
            if (foundCompaniesList.size() == 0) {
                wasError = true;
                LOGGER.error(DatabaseSearcherException.ERR_NO_COMPANY_FOUND + " ; " + DatabaseSearcherException.INFO_SEARCH_FINISHED);
                throw new DatabaseSearcherException(DatabaseSearcherException.ERR_NO_COMPANY_FOUND);
            }else {
                foundCompaniesList.forEach(company -> LOGGER.info("Company name: " + company));
                LOGGER.info(DatabaseSearcherException.INFO_SEARCH_FINISHED);
                return foundCompaniesList;

            }
        } finally {
            if (wasError) {
                LOGGER.error(DatabaseSearcherException.ERR_SEARCH_FINISHED);
            }
        }
    }
}
