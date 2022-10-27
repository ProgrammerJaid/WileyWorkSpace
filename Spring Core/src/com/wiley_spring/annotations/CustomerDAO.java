package com.wiley_spring.annotations;

public interface CustomerDAO {
	public int addCustomer(Customer customer);
	public int updateCustomer(int customerId);
	public boolean deleteCustomer(int customerId);
}
