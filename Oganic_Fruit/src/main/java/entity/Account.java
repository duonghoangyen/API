package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "City")
public class Account {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "Id")
	private int  id ;
	@Column(name = "Code")
	private String code ;
	@Column(name = "Name")
	private String name ;
	@Column(name = "Email")
	private String email ;
	@Column(name = "Phone")
	private String phone;
	@Column(name = "Address")
	private String address;
	@Column(name = "Birthday")
	private String birthday;
	@Column(name = "Role")
	private boolean role;
	@Column(name = "Gender")
	private boolean gender;
	public Account(int id, String code, String name, String email, String phone, String address, String birthday,
			boolean role, boolean gender) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.birthday = birthday;
		this.role = role;
		this.gender = gender;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public boolean isRole() {
		return role;
	}
	public void setRole(boolean role) {
		this.role = role;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", code=" + code + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + ", birthday=" + birthday + ", role=" + role + ", gender=" + gender + "]";
	}
	
}
