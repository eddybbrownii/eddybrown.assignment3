package userValidation;

//POJO
public class User {
	// instance variables
	private String username;
	private String password;
	private String name;
	private String unsuccesfullloginattemps;
	

	/**
	 * @return the unsuccesfullloginattemps
	 */
	public String getUnsuccesfullloginattemps() {
		return unsuccesfullloginattemps;
	}

	/**
	 * @param unsuccesfullloginattemps the unsuccesfullloginattemps to set
	 */
	public void setUnsuccesfullloginattemps(String unsuccesfullloginattemps) {
		this.unsuccesfullloginattemps = unsuccesfullloginattemps;
	}

	// getters and setters for above
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	}

	public void setUsername(String username) {
		// TODO Auto-generated method stub

	}

	public void setPassword(String password) {
		// TODO Auto-generated method stub

	}

}
