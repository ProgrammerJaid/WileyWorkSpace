package com.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.project.utilty.CustomerValidation;

public class CustomerValidationTest {

	@Test
	void testValidation() {
		assertEquals(true, CustomerValidation.validation("Sai"), "error in validation method");
		assertEquals(false, CustomerValidation.validation("Sai1"), "error in validation method");
		assertEquals(false, CustomerValidation.validation("Sai%"), "error in validation method");
		assertEquals(true, CustomerValidation.validation("Sai"), "error in validation method");
	}

	@Test
	void testValidatecode() {
		assertEquals(true, CustomerValidation.validatecode("946354"),"error in validatecode method");
		assertEquals(false, CustomerValidation.validatecode("94635"),"error in validatecode method");
		assertEquals(false, CustomerValidation.validatecode("9463a4"),"error in validatecode method");
	}

	@Test
	void testValidatenumber() {
		assertEquals(9, CustomerValidation.validatenumber("9"),"error in validatecode method");
		assertEquals(0, CustomerValidation.validatenumber("-9"),"error in validatecode method");
		assertEquals(0, CustomerValidation.validatenumber("as"),"error in validatecode method");
	}

}

