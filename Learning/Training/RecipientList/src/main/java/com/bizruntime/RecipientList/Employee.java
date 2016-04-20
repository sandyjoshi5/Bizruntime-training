package com.bizruntime.RecipientList;

public class Employee {

	private boolean isResigning;
	private boolean isNew;
	private boolean isOnLeave;
	private boolean isPromoted;
	private String msg;
	private String name;
	

	public Employee(String name){
		this.name = name;
	}
	
	public void setResigining(boolean isResigining){
		this.isResigning = isResigining;		
	}
	
	public void setNew(boolean isNew){
		this.isNew = isNew;	
	}
	
	public void setOnLeave(boolean isOnLeave) {
        this.isOnLeave = isOnLeave;
    }
	
	public void setPromoted(boolean isPromoted){
		this.isPromoted = isPromoted;		
	}
	
	public boolean isResigining(){
		return isResigning;
	}
	
    public boolean isNew() {
        return isNew;
    }
	
	public boolean isOnLeave(){
		return isPromoted;
	}
	
	public void setMessage(String msg){
		this.msg = msg;
		
	}
	public boolean isPromoted(){
		return isPromoted;
	}
	
	public String toString(){
		return "Employee :" + name + " " + msg;
	}
}

