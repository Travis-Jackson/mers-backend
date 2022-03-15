package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import exceptions.SystemException;
import pojo.RequestPojo;

public class RequestDaoImpl implements RequestDao {

	public static final Logger LOG = LogManager.getLogger(RequestDaoImpl.class);

	@Override
	public List<RequestPojo> fetchAllRequests() throws SystemException {
		LOG.info("Entered fetchAllRequests() in DAO");

		// create ArrayList of all requests from DB
		List<RequestPojo> allRequests = new ArrayList<>();

		Connection conn = DBUtil.obtainConnection();

		try {
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM expense_details";

			ResultSet rsRequest = stmt.executeQuery(query);

			// iterate through result set
			while (rsRequest.next()) {
				// copy each request into a RequestPojo
				RequestPojo requestPojo = new RequestPojo(rsRequest.getInt(1), rsRequest.getLong(2), rsRequest.getInt(3),
						rsRequest.getString(4), rsRequest.getString(5), rsRequest.getString(6), rsRequest.getString(7));
				// add request to ArrayList
				allRequests.add(requestPojo);
			}

		} catch (SQLException e) {
			throw new SystemException();
		}

		LOG.info("Exited fetchAllRequests() in DAO");
		return allRequests;
	}

	@Override
	public List<RequestPojo> fetchPendingRequests() throws SystemException {
		LOG.info("Entered fetchPendingRequests() in DAO");

		// create ArrayList of all pending requests from DB
		List<RequestPojo> allPendingRequests = new ArrayList<>();

		Connection conn = DBUtil.obtainConnection();

		try {
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM expense_details WHERE expense_status='pending'";

			ResultSet rsRequest = stmt.executeQuery(query);

			// iterate through result set
			while (rsRequest.next()) {
				// copy each request into a RequestPojo
				RequestPojo requestPojo = new RequestPojo(rsRequest.getInt(1), rsRequest.getLong(2), rsRequest.getInt(3),
						rsRequest.getString(4), rsRequest.getString(5), rsRequest.getString(6), rsRequest.getString(7));
				// add customer to ArrayList
				allPendingRequests.add(requestPojo);
			}

		} catch (SQLException e) {
			throw new SystemException();
		}

		LOG.info("Exited fetchPendingRequests() in DAO");
		return allPendingRequests;
	}

	@Override
	public List<RequestPojo> fetchResolvedRequests() throws SystemException {
		LOG.info("Entered fetchResolvedRequests() in DAO");

		// create ArrayList of all resolved requests from DB
		List<RequestPojo> allResolvedRequests = new ArrayList<>();

		Connection conn = DBUtil.obtainConnection();

		try {
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM expense_details WHERE expense_status='resolved'";

			ResultSet rsRequest = stmt.executeQuery(query);

			// iterate through result set
			while (rsRequest.next()) {
				// copy each request into a RequestPojo
				RequestPojo requestPojo = new RequestPojo(rsRequest.getInt(1), rsRequest.getLong(2), rsRequest.getInt(3),
						rsRequest.getString(4), rsRequest.getString(5), rsRequest.getString(6), rsRequest.getString(7));
				// add request to ArrayList
				allResolvedRequests.add(requestPojo);
			}

		} catch (SQLException e) {
			throw new SystemException();
		}

		LOG.info("Exited fetchResolvedRequests() in DAO");
		return allResolvedRequests;
	}

	@Override
	public List<RequestPojo> fetchEmployeeRequests(int employeeId) throws SystemException {
		LOG.info("Entered fetchEmployeeRequests() in DAO");

		// create ArrayList of all requests from DB
		List<RequestPojo> allRequests = new ArrayList<>();

		Connection conn = DBUtil.obtainConnection();

		try {
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM expense_details WHERE employee_id=" + employeeId;

			ResultSet rsRequest = stmt.executeQuery(query);

			// iterate through result set
			while (rsRequest.next()) {
				// copy each request into a RequestPojo
				RequestPojo requestPojo = new RequestPojo(rsRequest.getInt(1), rsRequest.getLong(2), rsRequest.getInt(3),
						rsRequest.getString(4), rsRequest.getString(5), rsRequest.getString(6), rsRequest.getString(7));
				// add request to ArrayList
				allRequests.add(requestPojo);
			}

		} catch (SQLException e) {
			throw new SystemException();
		}

		LOG.info("Exited fetchEmployeeRequests() in DAO");
		return allRequests;
	}
}