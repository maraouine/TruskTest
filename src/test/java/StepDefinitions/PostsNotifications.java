package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostsNotifications {
	
	@Given("I am registered with my phone number")
	public void i_am_registered_with_my_phone_number() {
	}

	@When("a Trusk member published a post")
	public void a_trusk_member_published_a_post() {
	}
	@Then("I should  receive an SMS notification with get the following message: Hello First name, you have a new post to read on TruskX. To view it, click on this link xxxxx\\/truskX.com.")
	public void i_should_receive_an_sms_notification_with_get_the_following_message_hello_first_name_you_have_a_new_post_to_read_on_trusk_x_to_view_it_click_on_this_link_xxxxx_trusk_x_com() {
	}
	@When("I click on the link indicated on message")
	public void i_click_on_the_link_indicated_on_message() {
	}
	@Then("I should be directed to the Posts page")
	public void i_should_be_directed_to_the_posts_page() {
	}
}
