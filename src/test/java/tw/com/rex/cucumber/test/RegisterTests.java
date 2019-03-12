package tw.com.rex.cucumber.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import tw.com.rex.cucumber.model.User;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)//指定使用 Spring test
@SpringBootTest //必添加，否則無法注入 bean
@ContextConfiguration //必添加，否則無法注入 bean
@AutoConfigureMockMvc //自動注入 MockMvc
public class RegisterTests {

    @Autowired
    private MockMvc mockMvc;

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() throws Exception {
        this.mockMvc.perform(get("/register"))//
                .andExpect(status().isOk())//
                .andExpect(view().name("register"))//
                .andDo(print());
    }

    @When("I submit the following user data to register")
    public void iSubmitTheFollowingUserDataToRegister(List<User> users) throws Exception {
    }

    @Then("show me a message")
    public void showMeAMessage(String message) throws Exception {
    }

}
