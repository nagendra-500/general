package org.jsp.app;
@Entity
public class Student1 
{
 private int id;
 private String name;
 private String branch;
 private double marks;
public int getId() 
{
	return id;
}
public void setId(int id)
{
	this.id = id;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getBranch() 
{
	return branch;
}
public void setBranch(String branch) 
{
	this.branch = branch;
}
public double getMarks()
{
	return marks;
}
public void setMarks(double marks) 
{
	this.marks = marks;
}
@Override
public String toString() {
	return "Student1 [id=" + id + ", name=" + name + ", branch=" + branch + ", marks=" + marks + "]";
}
 
}
