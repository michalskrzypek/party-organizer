package logic.services;

import logic.entities.User;
import logic.repositories.UserRepository;

/**
 * working with repo, service methods and operations regarding login and signup
 * @author mskrz
 *
 */
public class UserService {

	private UserRepository userRepository = UserRepository.getInstance();

	public boolean validate(String name, String password) {
		User user = userRepository.getUserByName(name);

		if (user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void signUp(String name, String password) {
		if(userRepository.getUserByName(name) != null) {
			throw new RuntimeException("User with the name: " + name + " already exist!");
		}
		
		User user = new User(name, password);
		userRepository.saveUser(user);
	}
}
