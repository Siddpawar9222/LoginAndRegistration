package dao;

public class User {
	
    private String name ;
    private String email ;
    private String password ;
    private int phone ;
    private String Gender ;
    
    
    
	public User() {
		super();
	}
	public User(String name, String email, String password, int phone, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		Gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + ", Gender="
				+ Gender + "]";
	}
    
    
    
}
