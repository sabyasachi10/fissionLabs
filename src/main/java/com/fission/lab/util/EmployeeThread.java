package com.fission.lab.util;

import java.util.List;

import com.fission.lab.bean.EmployeeData;
import com.fission.lab.service.StoreEmployeeData;

public class EmployeeThread extends Thread{

	private List<EmployeeData> empList;
	
	public EmployeeThread (List<EmployeeData> empList) {
		this.empList = empList;
	}
	
	@Override
    public void run() {
		StoreEmployeeData storeEmployeeData = new StoreEmployeeData();
		storeEmployeeData.processEmployeeData(empList);
    }
}
