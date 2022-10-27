package com.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.project.entity.Customer;
import com.project.utilty.CustomerUtility;

@DisplayName("Serialization And Deserialization Testing")
class CustomerUtilityTest {

	static List<Customer> customerList;
	static final String AREA_CODE = "123456";

	@BeforeAll
	public static void beforeEach() {
		
		customerList = new ArrayList<>();
		customerList.add(new Customer("1", "Deepak", "123456", 358, CustomerUtility.calculateTotalBill(358)));
		customerList.add(new Customer("2", "Naga", "123457", 345, CustomerUtility.calculateTotalBill(345)));
		customerList.add(new Customer("3", "jaid", "123456", 2675, CustomerUtility.calculateTotalBill(2675)));
		customerList.add(new Customer("4", "Sagar", "123458", 7465, CustomerUtility.calculateTotalBill(7465)));
		customerList.add(new Customer("5", "Mohit", "123459", 3455, CustomerUtility.calculateTotalBill(3455)));
	}

	@Test
	void testSort() {
		assertEquals(true, CustomerUtility.sort(customerList));
	}

	@Test
	void testSerializeObject() {
		assertEquals(true, CustomerUtility.serializeObject(customerList));
		;
	}

	@Test
	void testReadObjects() {
		assertEquals(customerList, CustomerUtility.readObjects());
	}

	@Test
	void testGroupBy() {
		assertEquals(true, CustomerUtility.groupBy(customerList));
	}

	@Test
	void testSearch() {
		assertEquals(customerList.stream().filter((c) -> c.getCustomerAreaCode()
				.equals(AREA_CODE)).collect(Collectors.toList()), 
				CustomerUtility.search(AREA_CODE, customerList));
	}

	@Test
	void testDisplay() {
		assertEquals(true, CustomerUtility.display(customerList));
	}

}
