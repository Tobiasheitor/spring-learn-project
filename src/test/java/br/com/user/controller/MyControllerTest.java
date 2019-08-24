package br.com.user.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class MyControllerTest {
	private MockMvc mockMvc;

	@Test @Ignore
	public void olaMundoSuccess() throws Exception {
		mockMvc.perform(get("/me")).andExpect(status().isOk()).andExpect(content().string("Ola Mundo"));
	}

}
