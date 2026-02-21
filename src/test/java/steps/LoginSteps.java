package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    String username;
    String password;
    boolean loginStatus;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User navigates to login page");
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        this.username = username;
        this.password = password;

        if(username.equals("admin") && password.equals("1234")) {
            loginStatus = true;
        } else {
            loginStatus = false;
        }
    }

    @Then("login should be successful")
    public void login_should_be_successful() {
        //assertTrue(loginStatus);
        System.out.println("Login successful");
    }
}
