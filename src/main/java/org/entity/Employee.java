package org.entity;
// Generated May 8, 2019 11:07:01 AM by Hibernate Tools 5.3.6.Final


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="EMPLOYEES"
    , uniqueConstraints = @UniqueConstraint(columnNames="EMAIL") 
)
public class Employee  implements java.io.Serializable {


     private Long employeeId;
     private Department department;
     private Employee employee;
     private Job job;
     private String firstName;
     private String lastName;
     private String email;
     private String phoneNumber;
     private Date hireDate;
     private Long salary;
     private Long commissionPct;
     private Set<Department> departments = new HashSet<Department>(0);
     private Set<Employee> employees = new HashSet<Employee>(0);
     private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);

    public Employee() {
    }

	
    public Employee(Long employeeId, Job job, String lastName, String email, Date hireDate) {
        this.employeeId = employeeId;
        this.job = job;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
    }
    public Employee(Long employeeId, Department department, Employee employee, Job job, String firstName, String lastName, String email, String phoneNumber, Date hireDate, Long salary, Long commissionPct, Set<Department> departments, Set<Employee> employees, Set<JobHistory> jobHistories) {
       this.employeeId = employeeId;
       this.department = department;
       this.employee = employee;
       this.job = job;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.hireDate = hireDate;
       this.salary = salary;
       this.commissionPct = commissionPct;
       this.departments = departments;
       this.employees = employees;
       this.jobHistories = jobHistories;
    }
   
     @Id 

    
    @Column(name="EMPLOYEE_ID", unique=true, nullable=false, precision=6, scale=0)
    public Long getEmployeeId() {
        return this.employeeId;
    }
    
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DEPARTMENT_ID")
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MANAGER_ID")
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="JOB_ID", nullable=false)
    public Job getJob() {
        return this.job;
    }
    
    public void setJob(Job job) {
        this.job = job;
    }

    
    @Column(name="FIRST_NAME", length=20)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="LAST_NAME", nullable=false, length=25)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="EMAIL", unique=true, nullable=false, length=25)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="PHONE_NUMBER", length=20)
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="HIRE_DATE", nullable=false, length=7)
    public Date getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    
    @Column(name="SALARY", precision=8)
    public Long getSalary() {
        return this.salary;
    }
    
    public void setSalary(Long salary) {
        this.salary = salary;
    }

    
    @Column(name="COMMISSION_PCT", precision=2)
    public Long getCommissionPct() {
        return this.commissionPct;
    }
    
    public void setCommissionPct(Long commissionPct) {
        this.commissionPct = commissionPct;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Department> getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="employee")
    public Set<JobHistory> getJobHistories() {
        return this.jobHistories;
    }
    
    public void setJobHistories(Set<JobHistory> jobHistories) {
        this.jobHistories = jobHistories;
    }




}


