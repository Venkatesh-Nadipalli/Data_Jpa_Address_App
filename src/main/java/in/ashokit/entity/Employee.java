package in.ashokit.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empid;

	private String empfirstname;

	private String emplastname;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	@JoinColumn(name = "present_address_id")
	private List<Address> presentaddress = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	@JoinColumn(name = "permanent_address_id")
	private List<Address> permanenetaddress = new ArrayList<>();

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpfirstname() {
		return empfirstname;
	}

	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}

	public String getEmplastname() {
		return emplastname;
	}

	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}

	public List<Address> getPresentaddress() {
		return presentaddress;
	}

	public void setPresentaddress(List<Address> presentaddress) {
		this.presentaddress = presentaddress;
	}

	public List<Address> getPermanenetaddress() {
		return permanenetaddress;
	}

	public void setPermanenetaddress(List<Address> permanenetaddress) {
		this.permanenetaddress = permanenetaddress;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empfirstname=" + empfirstname + ", emplastname=" + emplastname
				+ ", presentaddress=" + presentaddress + ", permanenetaddress=" + permanenetaddress + "]";
	}

	
	
}