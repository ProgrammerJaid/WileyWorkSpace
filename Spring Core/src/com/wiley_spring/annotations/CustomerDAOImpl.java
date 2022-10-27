package com.wiley_spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "customerDAOImpl")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addCustomer(Customer customer) {
		String insertQuery = "insert into customer values(?,?,?)";

		int rows1 = jdbcTemplate.update(insertQuery, 
				customer.getCustomerId(), customer.getCustomerName(),
				customer.getCustomerName());

		return rows1;
	}

	@Override
	public int updateCustomer(int customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
