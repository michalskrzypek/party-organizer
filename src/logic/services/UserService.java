package logic.services;

import logic.entities.User;
import logic.repositories.UserRepository;

public class UserService {

	private UserRepository userRepository = UserRepository.getInstance();

	public boolean validateUser(String name, String password) {
		User user = userRepository.getUserByName(name);

		if (user.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void signUp(String name, String password) {
		User user = new User(name, password);
		userRepository.saveUser(user);
	}
}
