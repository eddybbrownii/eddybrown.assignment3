package userValidation;
import userValidation.User;
public class UserLoginApplication {
	UserService userService = new UserService();
	
	User user = userService.createUser("", "");
	
	User[] users = new User[13];
	users[0]= userService.createUser("user1","password1");
	
	
	//System.out.println(user);

	user1.setunsuccessfulloginattempts(1);
	
	
}
