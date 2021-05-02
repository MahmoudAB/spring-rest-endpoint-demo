package com.restapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class RestApiApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	void getBestCustomer() throws Exception {

		mockMvc.perform(get("/best/customer"))
				.andExpect(status().is(200))
				.andExpect(content().string("Buddy Bob"));

	}

}
