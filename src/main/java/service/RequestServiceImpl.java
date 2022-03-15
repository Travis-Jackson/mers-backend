package service;

import java.util.List;

import dao.RequestDao;
import dao.RequestDaoImpl;
import exceptions.SystemException;
import pojo.RequestPojo;

public class RequestServiceImpl implements RequestService {

	RequestDao requestDao;

	public RequestServiceImpl() {
		requestDao = new RequestDaoImpl();
	}

	@Override
	public List<RequestPojo> fetchAllRequests() throws SystemException {
		return requestDao.fetchAllRequests();
	}

	@Override
	public List<RequestPojo> fetchPendingRequests() throws SystemException {
		return requestDao.fetchPendingRequests();
	}

	@Override
	public List<RequestPojo> fetchResolvedRequests() throws SystemException {
		return requestDao.fetchResolvedRequests();
	}

	@Override
	public List<RequestPojo> fetchEmployeeRequests(int employeeId) throws SystemException {
		return requestDao.fetchEmployeeRequests(employeeId);
	}
}
