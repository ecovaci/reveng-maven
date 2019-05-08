package org.entity;
// Generated May 8, 2019 11:07:01 AM by Hibernate Tools 5.3.6.Final

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Javadoc for the DEPARTMENTS class
 *
 * @author eugen
 */
@Entity
@Table(name = "DEPARTMENTS")
public class Department implements java.io.Serializable {

	private Long departmentId;
	private Employee employee;
	private Location location;
	private String departmentName;
	private Set<Employee> employees = new HashSet<Employee>(0);
	private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);

	public Department() {
	}

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(Employee employee, Location location, String departmentName, Set<Employee> employees,
			Set<JobHistory> jobHistories) {
		this.employee = employee;
		this.location = location;
		this.departmentName = departmentName;
		this.employees = employees;
		this.jobHistories = jobHistories;
	}

	@SequenceGenerator(name = "org.entity.DepartmentIdGenerator", sequenceName = "DEPARTMENTS_SEQ")
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "org.entity.DepartmentIdGenerator")

	@Column(name = "DEPARTMENT_ID", unique = true, nullable = false, precision = 4, scale = 0)
	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MANAGER_ID")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOCATION_ID")
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof org.entity.Department))
			return false;
		org.entity.Department castOther = (org.entity.Department) other;

		return ((this.getDepartmentName() == castOther.getDepartmentName()) || (this
				.getDepartmentName() != null && castOther.getDepartmentName() != null && this.getDepartmentName()
				.equals(castOther.getDepartmentName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDepartmentName() == null ? 0 : this.getDepartmentName().hashCode());

		return result;
	}

	// The following is extra code specified in the hbm.xml files
	// Here is the extra code
	// end of extra code specified in the hbm.xml files

}


