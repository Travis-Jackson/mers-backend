package service;

import java.util.List;

import exceptions.SystemException;
import pojo.RequestPojo;

public interface RequestService {

	// fetch all requests
	List<RequestPojo> fetchAllRequests() throws SystemException;

	// fetch pending requests
	List<RequestPojo> fetchPendingRequests() throws SystemException;

	// fetch resolved requests
	List<RequestPojo> fetchResolvedRequests() throws SystemException;

	// fetch requests of one employee
	List<RequestPojo> fetchEmployeeRequests(int employeeId) throws SystemException;
}