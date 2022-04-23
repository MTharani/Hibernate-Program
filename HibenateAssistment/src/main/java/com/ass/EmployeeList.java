package com.ass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="myemployeelist")
public class EmployeeList 
{
	@Id
	@Column(name="eid",nullable=false,length=10)
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@Column(name="ename",nullable=false,length=35)
    private String name;
	@Column(name="esalary",nullable=false)
    private double salary;
	@Column(name="edep",nullable=false,length=20)
    private String dep;
	@Column(name="egen",nullable=false,length=20)
    private String gen;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	@Override
	public String toString() {
		return "EmployeeList [id=" + id + ", name=" + name + ", salary=" + salary + ", dep=" + dep + ", gen=" + gen
				+ "]";
	}
	
    

}
