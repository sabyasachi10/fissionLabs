package com.fission.lab.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.fission.lab.bean.EmployeeData;
import com.fission.lab.service.StoreEmployeeData;
import com.fission.lab.util.EmployeeThread;

public class ReadUserInput {
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		List<EmployeeData> empList = new ArrayList<>();
		
		while (scanner.hasNextLine()) {
			String[] tokens = scanner.nextLine().split(",");
			System.out.println(Arrays.toString(tokens));
			EmployeeData empObj = new EmployeeData();
			
			if (tokens.length == 5) {
				empObj.setFirstName(tokens[0].trim());
				empObj.setLastName(tokens[1].trim());
				empObj.setExperience(tokens[2].trim());
				empObj.setAge(tokens[3].trim());
				empObj.setOrganization(tokens[4].trim());
				empList.add(empObj);
			}
			if (tokens[0].equals("EXIT")) {
				break;
			} else if (tokens[0].equals("SORT")) {
				System.out.println("In sort");
				EmployeeThread t = new EmployeeThread(empList);
				t.start();
				empList = new ArrayList<>();
			}
		}

		scanner.close();
	}

}
