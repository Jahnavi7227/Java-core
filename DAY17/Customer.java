package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="entity.Customer")
@Table (name="Customer")
public class Customer {
	@Id
	@Column (name="name")
	private String name;
	@Column(name="mobilenumber")
	private String mobilenumber;
	@Column(name="email")
	private String email;
	public void setname(String name) {
		this.name=name;
	}
	public void setmobile(String mobile) {
		this.mobilenumber=mobile;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String toString () {
		return this.name+" "+this.mobilenumber+" "+this.email;
	}
}
