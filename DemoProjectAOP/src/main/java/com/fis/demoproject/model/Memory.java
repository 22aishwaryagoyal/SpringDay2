package com.fis.demoproject.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Memory 
{
	@Value("${memory.name}")
	private String memoryName;

	public Memory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Memory(String memoryName) {
		super();
		this.memoryName = memoryName;
	}

	public String getMemoryName() {
		return memoryName;
	}

	public void setMemoryName(String memoryName) {
		this.memoryName = memoryName;
	}

	@Override
	public String toString() {
		return "Memory [memoryName=" + memoryName + "]";
	}
	
}
