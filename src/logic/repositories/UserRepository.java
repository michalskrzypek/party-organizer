package logic.repositories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import logic.entities.User;
import utils.ResourceConnector;

/**
 * Singleton
 * 
 * @author mskrz
 *
 */
public class UserRepository {

	private List<User> users = new ArrayList<>();
	private ResourceConnector rc = ResourceConnector.getInstance();

	private static UserRepository instance = new UserRepository();
	private UserRepository() {
		readProducts();
	}
	
	public static UserRepository getInstance() {
		if(instance == null) {
			instance = new UserRepository();
		}
		return instance;
	}
	
	public void readProducts() {
		String line = "";
		try {
			BufferedReader fichero = new BufferedReader(new FileReader(rc.getUsersFile()));
			while (fichero.ready()) {
				line = fichero.readLine();
				String[] sections = line.split("@");
				users.add(new User(sections[0], sections[1]));
			}
			fichero.close();
		} catch (FileNotFoundException fnfe) {
			JOptionPane.showMessageDialog(null, "File not found");
		} catch (IOException ioe) {
			new RuntimeException("I/O error.");
		}
	}

	public List<User> getUsers() {
		return users;
	}

	public User getUserByName(String name) {
		return users
				.stream()
				.filter(u -> u.getName().equals(name))
				.findFirst()
				.orElseThrow(() -> new RuntimeException("User: " + name + " does not exist!"));
	}
	
	public void saveUser(User user) {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(rc.getUsersFile()));
			br.write(user.getName() + "@" + user.getPassword());
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
