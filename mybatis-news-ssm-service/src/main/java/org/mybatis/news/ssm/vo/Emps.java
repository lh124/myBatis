package org.mybatis.news.ssm.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Emps  implements Serializable{

	private Long eid;
	private String ename;
	private Date hiredate;
	private Double salary;
	private Double comm;
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	@Override
	public String toString() {
		return "Emps [eid=" + eid + ", ename=" + ename + ", hiredate=" + hiredate + ", salary=" + salary + ", comm="
				+ comm + "]";
	}
	
	
}
