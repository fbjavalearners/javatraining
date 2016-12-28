package com.demo.accessmodifiers;

public class Student implements Comparable{

	int sid;
	String name;
	String myFullName;
	public Student(int sid, String name, String myFullName) {
		super();
		this.sid = sid;
		this.name = name;
		this.myFullName = myFullName;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", myFullName="
				+ myFullName + "]";
	}

	public String getMyFullName() {
		return myFullName;
	}

	public void setMyFullName(String myFullName) {
		this.myFullName = myFullName;
	}

	public Student(){
		
		
	}
	
	@Override
	public int hashCode() {
		return sid*7;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}
	// two argument constructor
	public Student(int sid,String name){
		this.sid= sid;
		this.name=name;
		
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Object arg0) {
		
		Student s = (Student)arg0;
		
		return this.sid-s.sid;
		
		
		
	}
	
	
	
	
}
