package com.example.consumeanapilab.consumeanapilab.model;

public class TinyList implements Comparable<TinyList> {
	private String name;
	private String invented;
	private Integer year;
	
	public TinyList() {
	}

	public TinyList(String name, String invented, Integer year) {
		this.name = name;
		this.invented = invented;
		this.year = year;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getInvented() {
		return invented;
	}
	
	public void setInvented(String invented) {
		this.invented = invented;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "TinyList [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}

	@Override
	public int compareTo(TinyList o) {
		 return this.year.compareTo(o.year);
	}
}
