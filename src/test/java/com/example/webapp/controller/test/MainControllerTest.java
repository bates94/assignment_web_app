package com.example.webapp.controller.test;



import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
class MainControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	private MockHttpServletRequestBuilder mockHttpServletRequestBuilder;
	private ResultActions resultActions;
	private MvcResult mvcResult;
	private ModelAndView modelAndView;
	
	@Test
	void testShowLoginPage() throws Exception {
		mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/login");
		resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		mvcResult = resultActions.andReturn();
		modelAndView = mvcResult.getModelAndView();
		assertThat(modelAndView.getViewName(),Matchers.equalTo("login"));
	}
	
	@Test
	void testShowRegisterPage() throws Exception {
		mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/register");
		resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		mvcResult = resultActions.andReturn();
		modelAndView = mvcResult.getModelAndView();
		assertThat(modelAndView.getViewName(),Matchers.equalTo("register"));
	}
	
	@Test
	void testShowHomePage() throws Exception {
		mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/homepage");
		resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		mvcResult = resultActions.andReturn();
		modelAndView = mvcResult.getModelAndView();
		assertThat(modelAndView.getViewName(),Matchers.equalTo("login"));
	}
	
	@Test
	void testShowHomePageWithOnlySlash() throws Exception {
		mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/");
		resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		mvcResult = resultActions.andReturn();
		modelAndView = mvcResult.getModelAndView();
		assertThat(modelAndView.getViewName(),Matchers.equalTo("login"));
	}
	
	@Test
	void testLoginSuccessPage() throws Exception {
		mockHttpServletRequestBuilder = MockMvcRequestBuilders.post("/login/success");
		resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		mvcResult = resultActions.andReturn();
		modelAndView = mvcResult.getModelAndView();
		assertThat(modelAndView.getViewName(),Matchers.is(null));
	}
	
	@Test
	void testAddNewUser() throws Exception {
		mockHttpServletRequestBuilder = MockMvcRequestBuilders.post("/register/user");
		resultActions = mockMvc.perform(mockHttpServletRequestBuilder);
		mvcResult = resultActions.andReturn();
		modelAndView = mvcResult.getModelAndView();
		assertThat(modelAndView.getViewName(),Matchers.is(null));
	}

}
